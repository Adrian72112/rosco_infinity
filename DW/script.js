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
    tiempoTranscurrido.textContent = msAminYseg(timmer);
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
document.addEventListener('keypress', function(e) {
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
let respCorrecta, cantCorrectas = 0,
    cantIncorrectas = 0,
    cantFaltantes = 25,
    completarPasapalabra = false,
    shouldEnter;

//Funcion que completa los pasapalabras faltantes (en caso de ser necesario), o ir a la siguiente pregunta 
function siguientePregunta() {
    if (i == 25 || completarPasapalabra) {
        // Aca solo vamos a entrar si llegamos a la Z o si estamos en un completar pasapalabra (o sea ya dimos x lo menos una vuelta)
        //la primera vez entra por el i despues entra por completarPasapalabra que es true
        completarPasapalabra = true;
        // Refrescar el indice i, con el primer estado.pasapalabra
        // Esta 'flag' es para que si encontramos un indice i siguiente no vuelva a modificarlo
        let shouldEnter = true;
        //For que recorre todo el array de estados. e = elemento (estado) en la posicion indice 
        arrResultados.forEach((e, indice) => {
            if (shouldEnter == true && e === estado.pasapalabra && indice >= i) {
                i = indice;
                shouldEnter = false;
            }
        });
        // La logica anterior no funciona si queremos pasar de un indice mayor a otro menor
        // Ej: Estamos en X y el pasapalabra siguiente esta en C
        if (shouldEnter == true) {
            // findIdex nos devuelve el indice del primer estado = pasapalabra en el arrResultados
            // Devuleve -1 en el caso que no existan estado = pasapalabra
            i = arrResultados.findIndex(x => x == estado.pasapalabra);
        }

        // Chequeamos que exista siguiente pasapalabra
        if (i != -1) {
            // Si existe le hacemos focus
            next();
            focusInput()
        } else {
            // Si no existe terminamos el juego
            i = 25;
            detener();
        }
    } else {
        next();
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
            if (completarPasapalabra) {
                arrResultados[i] = estado.correcto;
            } else {
                arrResultados.push(estado.correcto);
            }
        } else {
            listaLetras.children[i].classList.remove('estiloPasapalabra');
            listaLetras.children[i].classList.add('estiloRespIncorrecta');
            cantIncorrectas++;
            if (completarPasapalabra) {
                arrResultados[i] = estado.incorrecto;
            } else {
                arrResultados.push(estado.incorrecto);
            }
        }
        cantFaltantes--;
        i++;
        refreshContadores();
        siguientePregunta();
    }
}

const pasapalabra = () => {
    listaLetras.children[i].classList.add('estiloPasapalabra');
    if (completarPasapalabra) {
        arrResultados[i] = estado.pasapalabra;
    } else {
        arrResultados.push(estado.pasapalabra);
    }
    i++;
    siguientePregunta();
}

//variables pasapalabra
const pos = 0;
const index2 = () => {
    pos = arrResultados.findIndex((resultado) => resultado === estado.pasapalabra)
}

//Cronometro
const tiempoTranscurrido = document.querySelector(".reloj");

let idInterval, tiempoInicio = null,
    timmer = 300000;

const agregarCero = valor => {
    if (valor < 10) {
        return "0" + valor;
    } else {
        return valor;
    }
}

const msAminYseg = (milisegundos) => {
    minutos = parseInt(milisegundos / 60000); //TE QUEDAS CON LA PARTE ENTERA de los minutos
    milisegundos -= minutos * 60000; //te quedas con la parte decimal de los minutos
    segundos = (milisegundos / 1000);
    return `${agregarCero(minutos)}:${agregarCero(segundos.toFixed())}`;
};

const detener = () => {
    // Si queda alguno por contestar y el timmer es distinto de =
    if (i == 25) {
        tiempoTranscurrido.textContent = "00:00";
        clearTimeout(timeout);
    }
}

function countdown() {
    timmer -= 1000;
    tiempoTranscurrido.textContent = msAminYseg(timmer);
    if (timmer <= 0) {
        detener();
    } else {
        timeout = setTimeout(countdown, 1000)
    }
}

const iniciar = () => {
    tiempoTranscurrido.textContent = msAminYseg(timmer);
    timeout = setTimeout(countdown, 1000); //llamar a coundown cada un 1s
}