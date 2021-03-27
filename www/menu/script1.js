const { menu } = data;
const values = menu["0"]["categories"];
let productsList = [];

values.map(({ name, products }) => (productsList[name] = products));

const RenderHtml = () => {
    const getProducts = (i) => {
        
        const ItemsRendered = []
        ItemsRendered.push(`                    <div class="accordion-item">
        <h2 class="accordion-header" id="flush-heading${i}">
            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapse${i}" aria-expanded="false" aria-controls="flush-collapse${i}">
                ${i}
            </button>
        </h2>`)
        for(x of productsList[i]){
            ItemsRendered.push(`
            <div id="flush-collapse${i}" class="accordion-collapse collapse" aria-labelledby="flush-heading${i}" data-bs-parent="#accordionFlush">
            <div class="accordion-body">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <img src="${x.image}" class="img-thumbnail">
                        </div>
                        <div class="col-6">
                            <p class="fw-bold">${x.name}</p>
                            <p class="font-weight-normal">${x.description}</p>
                        </div>
                        <div class="col">
                            <p class="fw-bold">£${x.price}</p>
                            <button type="button" class="btn btn-primary">Add to Cart</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>`)
        }
        return ItemsRendered.join('')
    }
    const finalRender = () => {
        const DataRendered = []
        console.log(DataRendered)
        for(x in productsList){
            DataRendered.push(getProducts(x))
        }
        return DataRendered.join('')
    }

  document
    .querySelector("#accordionFlush")
    .insertAdjacentHTML("afterbegin", finalRender());

};

RenderHtml();


