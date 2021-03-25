const categoryList = document.querySelector('.accordion-button');
var div = document.getElementById("menu");

const url = 'http://localhost:8082/api/restaurant/605c9c419dff59756fa713ce';

function fetchMenu() {
    fetch(url)
        .then(response => {
            if (!response.ok) {
                throw Error("ERROR");
            }
            return response.json();
        })
        .then(data => {
            console.log(data.menu[0].categories);

            const html = data.menu[0].categories.map(data => {
                var categoryName = data.name;
                var product = data.products[0].name
                

                return `
                    <h3>${categoryName}</h3>
                    <h5>${product}</h5>
                `;
            })
            .join("");

            document
                .querySelector('#accordionMenu')
                .insertAdjacentHTML('afterbegin', html);
        }).catch(error => {
            console.log(error);
        });

}

fetchMenu();