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

            // Categories
            var categoriesLenght = data.menu[0].categories;
            var counter01;
            for (counter01 = 0; counter01 < categoriesLenght.length; counter01++) {
                console.log(data.menu[0].categories[counter01].name)

                var productsLenght = data.menu[0].categories[counter01].products
                var counter02;
                for (counter02 = 0; counter02 < productsLenght.length; counter02++) {
                    console.log(data.menu[0].categories[counter01].products[counter02].image)
                    console.log(data.menu[0].categories[counter01].products[counter02].name)
                    console.log(data.menu[0].categories[counter01].products[counter02].description)
                    console.log(data.menu[0].categories[counter01].products[counter02].price)
                }
                
            }
            const html = data.menu[0].categories.map(data => {
                var categoryName = data.name;

                var productImage = data.products[0].image
                var productName = data.products[0].name
                var productDescription = data.products[0].description
                var productPrice = data.products[0].price

                return `
                    <div class="accordion-item">
                        <h2 class="accordion-header" id="flush-heading${categoryName}">
                            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapse${categoryName}" aria-expanded="false" aria-controls="flush-collapse${categoryName}">
                                ${categoryName}
                            </button>
                        </h2>
                        <div id="flush-collapse${categoryName}" class="accordion-collapse collapse" aria-labelledby="flush-heading${categoryName}" data-bs-parent="#accordionFlush">
                            <div class="accordion-body">
                                <div class="container">
                                    <div class="row">
                                        <div class="col">
                                            <img src="${productImage}" class="img-thumbnail">
                                        </div>
                                        <div class="col-6">
                                            <p class="fw-bold">${productName}</p>
                                            <p class="font-weight-normal">${productDescription}</p>
                                        </div>
                                        <div class="col">
                                            <p class="fw-bold">£${productPrice}</p>
                                            <button type="button" class="btn btn-primary">Add to Cart</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                `;
            })
            .join("");

            document
                .querySelector('#accordionFlush')
                .insertAdjacentHTML('afterbegin', html);
        }).catch(error => {
            console.log(error);
        });

}

fetchMenu();