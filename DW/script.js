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


document.onkeyup = enter;

function enter(e) {
    if (e.which == 13) {
        submitForm();
    }
}

function submitForm(respuesta) {
    var respuesta = document.getElementById('respIngresada').value.toUpperCase();
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

let arrayRespuestas = []