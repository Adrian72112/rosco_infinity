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

//RELOJ

function actual() {
    fecha = new Date(); //Actualizar fecha.
    hora = fecha.getHours(); //hora actual
    minuto = fecha.getMinutes(); //minuto actual
    segundo = fecha.getSeconds(); //segundo actual
    if (hora < 10) { //dos cifras para la hora
        hora = "0" + hora;
    }
    if (minuto < 10) { //dos cifras para el minuto
        minuto = "0" + minuto;
    }
    if (segundo < 10) { //dos cifras para el segundo
        segundo = "0" + segundo;
    }
    //devolver los datos:
    mireloj = hora + " : " + minuto + " : " + segundo;
    return mireloj;
}