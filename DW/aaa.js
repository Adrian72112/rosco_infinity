let player = 'player1';
let count1 = 120
let count2 = 120;

let stateP1 = [];
let stateP2 = [];

const startGame = () => {
    document.getElementById("game_text").innerHTML = a[0].empieza == true ? `Empieza en ${a[0].letra}
    : ${a[0].descripcion}
    ` : `Contiene ${a[0].letra}: ${a[0].descripcion} `
    ul.children[0].classList.toggle('active');
}

const pasaPalabra = () => {

    ul.children[i - 1].classList.toggle('orange');
    ul.children[i - 1].classList.remove("active");

    if (player == 'player1') {
        player = 'player2'
    } else {
        player = 'player1'
    }

    if (player == 'player1') {
        stateP1 = [i - 1].push(2)
        let l = document.getElementById("timer-1");
        inter1 = setInterval(function() {
            l.innerHTML = count1;
            if (count1 != 0 && player == 'player1') {
                count1--
            } else {
                clearInterval(inter1)
            }
        }, 1000);
    } else {
        stateP2 = [i - 1].push(2)
        let l2 = document.getElementById("timer-2");
        inter2 = setInterval(function() {
            l2.innerHTML = count2;
            if (count2 != 0 && player == 'player2') {
                count2--
            } else {
                clearInterval(inter2)
            }
        }, 1000);
    }
}

const handleSend = () => {
    const input = document.getElementById("word").value;
    if (input == a[0].respuesta) {
        ul.children[i - 1].classList.toggle('green');
        ul.children[i - 1].classList.remove("active");
        stateP1 = [i - 1].push(1)
        i++;
        ul.children[i - 1].classList.toggle('active');
    } else {
        ul.children[i - 1].classList.toggle('red');
        ul.children[i - 1].classList.remove("active");
        stateP1 = [i - 1].push(0)
        player = 'player2';
        i++
        ul.children[i - 1].classList.toggle('active');
    }
}

const btn = document.getElementById('Pasapalabra');
const ul = document.getElementById('lista');

let i = 1;

btn.addEventListener('click', () => {

    console.log("estoy en", ul.children[i]);

    console.log("el que borre es ", ul.children[i - 1]);


    let b = i;

    ul.children[i].classList.toggle('active');

    if (ul.children[b--].classList.contains("active")) {

        ul.children[b--].classList.remove("active");
    }

    if (i <= 25) {
        i++;
        console.log(i);
    }

    if (ul.children[i] == null) {
        await
        for (let m = 0; m < ul.children.length; m++) {
            console.log(m)
            ul.children[m].classList.remove("orange");
            ul.children[m].classList.remove("green");
            ul.children[m].classList.remove("red");
        }
        i = 0;
    }
});

const borrar = () => {

}