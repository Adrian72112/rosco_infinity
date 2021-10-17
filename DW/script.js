// import { diccionario } from './diccionario.js';

const diccionario = [{
        letra: 'a',
        desc: 'Planta grande',
        respuesta: 'ARBOL',
        contiene: false,
    },
    {
        letra: 'b',
        desc: 'Animal que aparece en shrek',
        respuesta: 'BURRO',
        contiene: false,
    },
    {
        letra: 'c',
        desc: 'ANIMAL DEL DESIERTO',
        respuesta: 'CAMELLO',
        contiene: false,
    },
    {
        letra: 'd',
        desc: 'Reptil extinto',
        respuesta: 'DINOSAURIO',
        contiene: false,
    }

];

//instanciar variables
let arrayRespuestas = []
let posicion, respuesta, respCorrecta, respIngresada;

// Con la tecla enter envia la respuesta
document.onkeyup = enter;

function enter(e) {
    if (e.which == 13) {
        enviarRespuesta(respuesta);
    }
}


function enviarRespuesta(respuesta) {
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

function reloj() {
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

const btnEmpezar = document.getElementById('btnEmpezar');

function toggleBtn() {
    if (btnEmpezar.classList.contains('hide')) {
        btnEmpezar.classList.remove('hide')
    } else {
        btnEmpezar.classList.add('hide')
    }
}

const ul = document.getElementById('lista');

let i = 0;

const comenzarJuego = () => {
    console.log(ul.children[i]);
    // if
    // if (i >= 1) {
    //     ul.children[i - 1].classList.toggle('green');
    // }

}

const submitForm = () => {
    const input = document.getElementById("respIngresada").value;
    if (input == diccionario[i].respuesta) {
        ul.children[i].classList.toggle('green');
        i++;
    } else if (input != diccionario[i].respuesta) {
        ul.children[i].classList.toggle('red');
        i++
    }
    console.log(i)
    console.log(diccionario[i].respuesta)
}

window.onload = function() {
    return document.getElementById('btnEmpezar').onclick = toggleBtn;
    // comenzarJuego()
}