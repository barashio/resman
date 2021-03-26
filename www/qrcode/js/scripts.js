
const qrButton = document.getElementById('qrButton');
qrButton.addEventListener('click', genQRCode)

function genQRCode(){
    var urlValue = document.getElementById('urlInput').value;
    var url = `http://localhost:8082/genrateQRCode?url=${urlValue}`;
    const qrZone = document.getElementById('qrInputZone');
    fetch(url)
        .then(response => response.json())
        .then(data => {
            console.log(data.qrCode)
            console.log(urlValue)
            qrZone.innerHTML = `
                <img src="data:image/png;base64, ${data.qrCode}" alt="QRCode" />
            `
            urlValue = '';
        })
}