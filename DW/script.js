const diccionario = [{
    letra: 'a', //mayus
    desc: 'Planta grande',
    respCorrecta: 'ARBOL', //mayus
    contiene: false,
},
{
    letra: 'b',
    desc: 'Animal que aparece en shrek',
    respCorrecta: 'BURRO',
    contiene: false,
},
{
    letra: 'c',
    desc: 'Animal del desierto',
    respCorrecta: 'CAMELLO',
    contiene: false,
},
{
    letra: 'd',
    desc: 'Reptil extinto',
    respCorrecta: 'DINOSAURIO',
    contiene: false,
},
{
    letra: 'e',
    desc: 'Construccion urbana',
    respCorrecta: 'EDIFICIO',
    contiene: false,
},
{
    letra: 'f',
    desc: 'Adjetivo despectivo',
    respCorrecta: 'FEO',
    contiene: false,
},
{
    letra: 'g',
    desc: 'Adjetivo persona obesa',
    respCorrecta: 'GORDO',
    contiene: false,
},
{
    letra: 'h',
    desc: 'Ponen las gallinas',
    respCorrecta: 'HUEVO',
    contiene: false,
},
{
    letra: 'i',
    desc: 'Reptil',
    respCorrecta: 'IGUANA',
    contiene: false,
},
{
    letra: 'j',
    desc: 'Tienen los niños',
    respCorrecta: 'JUGUETES',
    contiene: false,
},
{
    letra: 'l',
    desc: 'Material de una bufanda',
    respCorrecta: 'LANA',
    contiene: false,
},
{
    letra: 'm',
    desc: 'Referido a maternidad',
    respCorrecta: 'MAMA',
    contiene: false,
},
{
    letra: 'n',
    desc: 'Citrico y color',
    respCorrecta: 'NARANJA',
    contiene: false,
},
{
    letra: 'ñ',
    desc: 'Animal propio de Uruguay',
    respCorrecta: 'ÑANDU',
    contiene: false,
},
{
    letra: 'o',
    desc: 'Garoto es una marca de este producto',
    respCorrecta: 'CHOCOLATE',
    contiene: true,
},
{
    letra: 'p',
    desc: 'Ave semi acuatico',
    respCorrecta: 'PATO',
    contiene: false,
},
{
    letra: 'q',
    desc: 'Alimento lacteo',
    respCorrecta: 'QUESO',
    contiene: false,
},
{
    letra: 'r',
    desc: 'Animal que persiguen los gatos',
    respCorrecta: 'RATON',
    contiene: false,
},
{
    letra: 's',
    desc: 'Centro del sistema solar',
    respCorrecta: 'SOL',
    contiene: false,
},
{
    letra: 't',
    desc: 'Donde tomamos te',
    respCorrecta: 'TAZA',
    contiene: false,
},
{
    letra: 'u',
    desc: 'Herramienta para tomar sopa',
    respCorrecta: 'CUCHARA',
    contiene: true,
},
{
    letra: 'v',
    desc: 'Hay mucho en la rambla. Clima',
    respCorrecta: 'VIENTO',
    contiene: false,
},
{
    letra: 'x',
    desc: 'Instrumento',
    respCorrecta: 'XILOFONO',
    contiene: false,
},
{
    letra: 'y',
    desc: 'Parte de dentro del huevo',
    respCorrecta: 'YEMA',
    contiene: false,
},
{
    letra: 'z',
    desc: 'Calzado',
    respCorrecta: 'ZAPATO',
    contiene: false,
}

];

const arrResultados = [];

const estado = {
    correcto: 1,
    incorrecto: 0,
    pasapalabra: 2
}

//al cargar la pagina le pasa el valor de la letra A (indice 0 en el diccionario) a los elementos 
window.onload = initial = () => {
    document.getElementById('definition').innerHTML = diccionario[0].desc;
    document.getElementById('condicion').innerHTML = diccionario[0].contiene == false ? `EMPIEZA CON ${diccionario[0].letra.toUpperCase()}` : `CONTIENE ${diccionario[0].letra.toUpperCase()}`;
    document.getElementById('cantFaltantes').innerHTML = cantFaltantes;
    document.getElementById('cantCorrectas').innerHTML = cantCorrectas;
    document.getElementById('cantIncorrectas').innerHTML = cantIncorrectas;
    $tiempoTranscurrido.textContent = msAminYseg(timmer);
}

//focus en el input
focusInput = () => {
    document.getElementById('respIngresada').focus() //luego de apretar el boton, hace focus otra vez en el input
}

//funcion que hace que haga toggle en aparecer o desaparecer un elemento
const toggleBtn = (idElement) => {
    if (idElement.classList.contains('hide')) {
        idElement.classList.remove('hide')
    } else {
        idElement.classList.add('hide')
    };
    focusInput();
    iniciar();
}

// Con la tecla enter envia la respuesta
document.addEventListener('keypress', function (e) {
    if (e.key === 'Enter') {
        submitForm();
    }
});

//variables submitForm()
let i = 0;

// GUARDAR EN LA BASE DE DATOS LAS LETRAS EN MAYUS
const next = () => {
    document.getElementById('definition').innerHTML = diccionario[i].desc;
    document.getElementById('respIngresada').value = "";
    document.getElementById('condicion').innerHTML = diccionario[i].contiene == false ? `EMPIEZA CON ${diccionario[i].letra.toUpperCase()}` : `CONTIENE ${diccionario[i].letra.toUpperCase()}`;
}
const refreshContadores = () => {
    document.getElementById('cantFaltantes').innerHTML = cantFaltantes;
    document.getElementById('cantCorrectas').innerHTML = cantCorrectas;
    document.getElementById('cantIncorrectas').innerHTML = cantIncorrectas;
}

//variables submitForm()
const listaLetras = document.getElementById('lista');
let respCorrecta, cantCorrectas = 0, cantIncorrectas = 0, cantFaltantes = 25, completarPasapalabra = false, shouldEnter;

//Funcion que completa los pasapalabras faltantes (en caso de ser necesario), o ir a la siguiente pregunta 
function siguientePregunta () {
    if (i == 25 || completarPasapalabra) {
        //la primera vez entrar por el i despues entra por completarPasapalabra que es true
        completarPasapalabra = true;
        // Refrescar el indice i, con el primer estado.pasapalabra
        shouldEnter = true;
        arrResultados.forEach((e, indice) => {
            if (shouldEnter == true && e === estado.pasapalabra && (indice >= i || i == 25)){
                i = indice;
                shouldEnter = false;
            }
        });
        if (shouldEnter == true){
            i = arrResultados.indexOf(x => x === estado.pasapalabra);
        }

        if (i != -1) {
            next();
            focusInput()
        } else {
            i = 25;
            detener();
        }
    } else {
        next();
        detener(i);
        focusInput()
    }
}

const submitForm = () => {

    const valueInput = document.getElementById("respIngresada").value.toUpperCase();

    if (valueInput) {
        //si el usuario no ingresó nada valueInput = false, por lo que no entra al if y no hace nada. si tiene un valor va a ser true y envía. 
        //Esto se hace para evitar errores de haber mandado la respuesta sin querer

        if (valueInput == diccionario[i].respCorrecta) {
            listaLetras.children[i].classList.remove('estiloPasapalabra');
            listaLetras.children[i].classList.add('estiloRespCorrecta');
            cantCorrectas++;
            cantFaltantes--;
            if (completarPasapalabra) {
                arrResultados[i] = estado.correcto;
            }
            else {
                arrResultados.push(estado.correcto);
            }
        } else if (valueInput != diccionario[i].respCorrecta) {
            listaLetras.children[i].classList.remove('estiloPasapalabra');
            listaLetras.children[i].classList.add('estiloRespIncorrecta');
            cantIncorrectas++;
            cantFaltantes--;
            if (completarPasapalabra) {
                arrResultados[i] = estado.incorrecto;
            }
            else {
                arrResultados.push(estado.incorrecto);
            }
        }

        i++;
        refreshContadores();
        siguientePregunta();
    }
    /*pos = arrResultados.findIndex((resultado) => resultado === estado.pasapalabra)
    console.log(pos)*/
}

const pasapalabra = () => {
    listaLetras.children[i].classList.add('estiloPasapalabra');
    if (completarPasapalabra) {
        // ARREGLAR LOGICA ACA
        arrResultados[i] = estado.pasapalabra;
    }
    else {
        arrResultados.push(estado.pasapalabra);
    }
    i++;
    siguientePregunta();
}
console.log(i)

//variables pasapalabra
const pos = 0;
const index2 = () => {
    pos = arrResultados.findIndex((resultado) => resultado === estado.pasapalabra)
    // console.log(pos)
}

//findeindex((i) => i===2), )

//Cronometro
const $tiempoTranscurrido = document.querySelector(".reloj");

let idInterval, tiempoInicio = null, timmer = 300000;

const agregarCero = valor => {
    if (valor < 10) {
        return "0" + valor;
    } else {
        return valor;
    }
}

const msAminYseg = (milisegundos) => {
    const minutos = parseInt(milisegundos / 60000);
    milisegundos -= minutos * 60 * 1000;
    segundos = (milisegundos / 1000);
    return `${agregarCero(minutos)}:${agregarCero(segundos.toFixed())}`;
};

const iniciar = () => {
    $tiempoTranscurrido.textContent = msAminYseg(timmer);
    timeout = setTimeout(countdown, 1000)
};

function countdown() {
    timmer -= 1000;
    $tiempoTranscurrido.textContent = msAminYseg(timmer);
    if (timmer <= 0) {
        detener();
        clearTimeout(timeout);
    } else {
        timeout = setTimeout(countdown, 1000)
    }
}

const detener = () => {
    if (i === 25) {
        $tiempoTranscurrido.textContent = "00:00";
        timmer = 0;
    }
}
