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
        contiene: true,
    },
    {
        letra: 'z',
        desc: 'Calzado',
        respCorrecta: 'ZAPATO',
        contiene: false,
    }


];

//al cargar la pagina le pasa el valor de la letra A (indice 0 en el diccionario) a los elementos 
window.onload = initial = () => {
    document.getElementById('definition').innerHTML = diccionario[0].desc;
    document.getElementById('condicion').innerHTML = diccionario[0].contiene == false ? `EMPIEZA CON ${diccionario[0].letra.toUpperCase()}` : `CONTIENE ${diccionario[0].letra.toUpperCase()}`;
    reloj();

    document.getElementById('cantFaltantes').innerHTML = cantFaltantes;
    document.getElementById('cantCorrectas').innerHTML = cantCorrectas;
    document.getElementById('cantIncorrectas').innerHTML = cantIncorrectas;
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
    }
    focusInput()
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
    i++;
    document.getElementById('definition').innerHTML = diccionario[i].desc;
    document.getElementById('respIngresada').value = "";
    document.getElementById('condicion').innerHTML = diccionario[i].contiene == false ? `EMPIEZA CON ${diccionario[i].letra.toUpperCase()}` : `CONTIENE ${diccionario[i].letra.toUpperCase()}`;
    //contadores
    document.getElementById('cantFaltantes').innerHTML = cantFaltantes;
    document.getElementById('cantCorrectas').innerHTML = cantCorrectas;
    document.getElementById('cantIncorrectas').innerHTML = cantIncorrectas;
}

//variables submitForm()
const listaLetras = document.getElementById('lista');
let respCorrecta,
    cantCorrectas = 0,
    cantIncorrectas = 0,
    cantFaltantes = 25;

const submitForm = () => {

    const valueInput = document.getElementById("respIngresada").value.toUpperCase();

    if (valueInput) { //si el usuario no ingresó nada valueInput = false, por lo que no entra al if y no hace nada. si tiene un valor va a ser true y envía. 
        //Esto se hace para evitar errores de haber mandado la respuesta sin querer

        if (valueInput == diccionario[i].respCorrecta) {
            listaLetras.children[i].classList.toggle('estiloRespCorrecta');
            cantCorrectas++;
            cantFaltantes--;
            next();

        } else if (valueInput != diccionario[i].respCorrecta) {
            listaLetras.children[i].classList.toggle('estiloRespIncorrecta');
            cantIncorrectas++;
            cantFaltantes--;
            next();
        }
    }
    focusInput()
}

const pasapalabra = () => {
    listaLetras.children[i].classList.toggle('estiloPasapalabra');
    next();
    focusInput();
}

//RELOJ
// se llama en la linea 159 (windo.onload)
function reloj() {
    fecha = new Date(); //Actualizar fecha.
    minuto = fecha.getMinutes(); //minuto actual
    segundo = fecha.getSeconds(); //segundo actual
    if (minuto < 10) { //dos cifras para el minuto
        minuto = "0" + minuto;
    }
    if (segundo < 10) { //dos cifras para el segundo
        segundo = "0" + segundo;
    }
    //devolver los datos:
    mireloj = hora + " : " + minuto + " : " + segundo;
    console.log(mireloj);
}

//LISTA DE TAREAS
//array de respuestas

//categorias:
//no hace falta que sean muchas materias, economia y una mas (tutores o estudiantes, algo original)
//hay una categtoria que es aleatorio, tenemos que decirle en cada palabra a que materia refiere

// 0 = incorrecta
// 1 = correcta
// 2 = pasapalabra
