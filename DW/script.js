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
    },
    {
        letra: 'e',
        desc: 'Construccion urbana',
        respuesta: 'EDIFICIO',
        contiene: false,
    },
    {
        letra: 'f',
        desc: 'Adjetivo despectivo',
        respuesta: 'FEO',
        contiene: false,
    },
    {
        letra: 'g',
        desc: 'Adjetivo persona obesa',
        respuesta: 'GORDO',
        contiene: false,
    },
    {
        letra: 'h',
        desc: 'Ponen las gallinas',
        respuesta: 'HUEVO',
        contiene: false,
    },
    {
        letra: 'i',
        desc: 'Reptil',
        respuesta: 'IGUANA',
        contiene: false,
    },
    {
        letra: 'j',
        desc: 'Tienen los niños',
        respuesta: 'JUGUETES',
        contiene: false,
    },
    {
        letra: 'l',
        desc: 'Material de una bufanda',
        respuesta: 'LANA',
        contiene: false,
    },
    {
        letra: 'm',
        desc: 'Referido a maternidad',
        respuesta: 'MAMA',
        contiene: false,
    },
    {
        letra: 'n',
        desc: 'Citrico y color',
        respuesta: 'NARANJA',
        contiene: false,
    },
    {
        letra: 'ñ',
        desc: 'Animal propio de Uruguay',
        respuesta: 'ÑANDU',
        contiene: false,
    },
    {
        letra: 'o',
        desc: 'Garoto es una marca de este producto',
        respuesta: 'CHOCOLATE',
        contiene: true,
    },
    {
        letra: 'p',
        desc: 'Ave semi acuatico',
        respuesta: 'PATO',
        contiene: false,
    },
    {
        letra: 'q',
        desc: 'Alimento lacteo',
        respuesta: 'QUESO',
        contiene: false,
    },
    {
        letra: 'r',
        desc: 'Animal que persiguen los gatos',
        respuesta: 'RATON',
        contiene: false,
    },
    {
        letra: 's',
        desc: 'Centro del sistema solar',
        respuesta: 'SOL',
        contiene: false,
    },
    {
        letra: 't',
        desc: 'Donde tomamos te',
        respuesta: 'TAZA',
        contiene: false,
    },
    {
        letra: 'u',
        desc: 'Herramienta para tomar sopa',
        respuesta: 'CUCHARA',
        contiene: true,
    },
    {
        letra: 'v',
        desc: 'Hay mucho en la rambla. Clima',
        respuesta: 'VIENTO',
        contiene: false,
    },
    {
        letra: 'x',
        desc: 'Instrumento',
        respuesta: 'XILOFONO',
        contiene: false,
    },
    {
        letra: 'y',
        desc: 'Parte de dentro del huevo',
        respuesta: 'YEMA',
        contiene: true,
    },
    {
        letra: 'z',
        desc: 'Calzado',
        respuesta: 'ZAPATO',
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