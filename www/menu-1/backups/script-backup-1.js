// const data = {
//   _id: "605f8fd7d1333d083a66ab20",
//   name: "Napoli Pizza & Kebab",
//   address: {
//     number: 12,
//     streetName: "Turnpike Lane",
//     city: "London",
//     postCode: "N8 0PT",
//   },
//   email: "contact@napolipizza.com",
//   phone: "0123456789",
//   menu: [
//     {
//       _id: "605f8fd7d1333d083a66ab21",
//       categories: [
//         {
//           _id: "605f8fd7d1333d083a66ab22",
//           name: "Drinks",
//           products: [
//             {
//               _id: "605f8fd7d1333d083a66ab23",
//               image:
//                 "https://images.squarespace-cdn.com/content/v1/5ca3b2217980b3338106d9bf/1586875728811-MMCQS9KHUQ4OVWV9D4LE/ke17ZwdGBToddI8pDm48kJUlZr2Ql5GtSKWrQpjur5t7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1UYapt4KGntwbjD1IFBRUBU6SRwXJogFYPCjZ6mtBiWtU3WUfc_ZsVm9Mi1E6FasEnQ/11.png?format=2500w",
//               name: "Fanta",
//               description: "330ml",
//               price: 1.99,
//             },
//             {
//               _id: "605f8fd7d1333d083a66ab24",
//               image:
//                 "https://cdn11.bigcommerce.com/s-2fq65jrvsu/images/stencil/1280x1280/products/772/1895/d-coke-can_4__88515.1592026059.jpg?c=1",
//               name: "Coka Cola",
//               description: "330ml",
//               price: 1.99,
//             },
//           ],
//         },
//         {
//           _id: "605f8fd7d1333d083a66ab25",
//           name: "Doners",
//           products: [
//             {
//               _id: "605f8fd7d1333d083a66ab26",
//               image:
//                 "https://live.staticflickr.com/4163/34554742702_b54131e9f3_b.jpg",
//               name: "Chicken Doned",
//               description: "Small",
//               price: 4.99,
//             },
//             {
//               _id: "605f8fd7d1333d083a66ab27",
//               image: "https://i.redd.it/hta7nztex5511.jpg",
//               name: "Chicken Doner",
//               description: "Large",
//               price: 6.99,
//             },
//             {
//               _id: "605f8fd7d1333d083a66ab28",
//               image: "https://i.redd.it/hta7nztex5511.jpg",
//               name: "Lamb Doner",
//               description: "Small",
//               price: 6.99,
//             },
//             {
//               _id: "605f8fd7d1333d083a66ab29",
//               image: "https://i.redd.it/hta7nztex5511.jpg",
//               name: "Lamb Doner",
//               description: "Large",
//               price: 8.99,
//             },
//           ],
//         },
//         {
//           _id: "605f8fd7d1333d083a66ab2a",
//           name: "Wraps",
//           products: [
//             {
//               _id: "605f8fd7d1333d083a66ab2b",
//               image: "https://i.redd.it/hta7nztex5511.jpg",
//               name: "Chicken Wrap",
//               description: "Small",
//               price: 3.99,
//             },
//             {
//               _id: "605f8fd7d1333d083a66ab2c",
//               image: "https://i.redd.it/hta7nztex5511.jpg",
//               name: "Chick Wrap",
//               description: "Large",
//               price: 5.99,
//             },
//             {
//               _id: "605f8fd7d1333d083a66ab2d",
//               image: "https://i.redd.it/hta7nztex5511.jpg",
//               name: "Lamb Wrap",
//               description: "Small",
//               price: 5.99,
//             },
//             {
//               _id: "605f8fd7d1333d083a66ab2e",
//               image: "https://i.redd.it/hta7nztex5511.jpg",
//               name: "Lamb Wrap",
//               description: "Large",
//               price: 6.99,
//             },
//           ],
//         },
//       ],
//     },
//   ],
//   review: [
//     {
//       _id: "605f8fd7d1333d083a66ab2f",
//       userName: "John Smith",
//       description: "Amazing food as always",
//       rating: 5,
//       approved: false,
//     },
//     {
//       _id: "605f8fd7d1333d083a66ab30",
//       userName: "Bob Man",
//       description: "Love the kebab in this shop",
//       rating: 5,
//       approved: false,
//     },
//   ],
// };

var id = '60db3a9340c8957b2d93573a';

fetch(`http://localhost:8082/api/restaurant/${id}`)
  .then(response => response.json())
  .then(data => {
    const { menu } = data;
    const values = menu["0"]["categories"];
    let productsList = [];

    values.map(({ name, products }) => (productsList[name] = products));

    const RenderHtml = () => {
        const getProducts = (i) => {
            console.log(i);
            const ItemsRendered = []
            ItemsRendered.push(`                    <div class="accordion-item">
            <h2 class="accordion-header" id="flush-heading${i}">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapse${i}" aria-expanded="false" aria-controls="flush-collapse${i}">
                    ${i}
                </button>
            </h2>`)
            for(x of productsList[i]){
                console.log(x.image, x.name, x.description, x.price);
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
  });

