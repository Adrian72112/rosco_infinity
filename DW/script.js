import { diccionario } from './diccionario.js';

// Con la tecla enter envia la respuesta
document.onkeyup = enter;

function enter(e) {
    if (e.which == 13) {
        submitForm();
    }
}

//instanciar variables
let arrayRespuestas = []
var posicion, respuesta, respCorrecta, respIngresada;


function submitForm(respuesta) {
    respuesta = document.getElementById('respIngresada').value.toUpperCase();
    document.getElementById('respIngresada').value = ""

    if (respIngresada === respCorrecta) {

        arrayRespuestas.push(1);
    } else {

    }

    console.log(respuesta, arrayRespuestas)

}

function siguiente(respuesta) {
    var respuesta = document.getElementById('respIngresada').value.toUpperCase();
    document.getElementById('respIngresada').value = ""

}


// 0 = incorrecta
// 1 = correcta
// 2 = pasapalabra