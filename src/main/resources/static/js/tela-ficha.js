function alterarDireita(step) {
    document.querySelectorAll('.subDireita').forEach(sub => {
        sub.style.display = 'none';
    });
    document.getElementById(`${step}`).style.display = 'flex';
}

function abrirpopup(popup){
    document.getElementById(`${popup}`).style.display = "flex";
    document.body.style.overflow = "hidden";
}

function fecharpopup(popup){
    document.getElementById(`${popup}`).style.display = "none";
    document.body.style.overflow = "auto";
}





















/////////////////////////////////////////////

document.addEventListener('DOMContentLoaded', function () {
    var listaDeAtaquesExemplo = [
        { arma: 'Espada', teste: 'Força', dano: '1d8' },
        { arma: 'Arco', teste: 'Destreza', dano: '1d10' },
        { arma: 'Cajado', teste: 'Inteligência', dano: '1d6' },
    ];
    criarAtaques(listaDeAtaquesExemplo);
});

function criarAtaques(listaDeAtaques) {
    var divAtaques = document.getElementById('ataquesContainer');
    divAtaques.innerHTML = ''; // Reset once before adding attacks

    listaDeAtaques.forEach(function (ataque, index) {
        // Create attack container
        var divAtaque = document.createElement('div');
        divAtaque.classList.add('ataque');

        // Create attack elements
        var tituloH2 = document.createElement('h2');
        tituloH2.textContent = 'Novo Ataque';
        divAtaque.appendChild(tituloH2);

        // Create dados element
        var divDados = document.createElement('div');
        divDados.classList.add('dados');

        var propriedadesExibidas = ['arma', 'teste', 'dano'];
        propriedadesExibidas.forEach(function (propriedade) {
            var divDado = document.createElement('div');
            divDado.classList.add('dado');
            var label = document.createElement('label');
            label.textContent = propriedade.charAt(0).toUpperCase() + propriedade.slice(1);
            divDado.appendChild(label);
            var input = document.createElement('input');
            input.type = 'text';
            input.value = ataque[propriedade];
            divDado.appendChild(input);
            divDados.appendChild(divDado);
        });

        // Add dados element to attack container
        divAtaque.appendChild(divDados);

        // Create botoes element
        var divBotoes = document.createElement('div');
        divBotoes.classList.add('botoes');

        var btnRemover = document.createElement('button');
        btnRemover.id = 'remover_' + index;
        btnRemover.textContent = 'Remover';
        // Add event handler for the remover button if needed
        divBotoes.appendChild(btnRemover);

        var btnEditar = document.createElement('button');
        btnEditar.id = 'editar_' + index;
        btnEditar.textContent = 'Editar';
        // Add event handler for the editar button if needed
        divBotoes.appendChild(btnEditar);

        // Add botoes element to attack container
        divAtaque.appendChild(divBotoes);

        // Add attack container to ataquesContainer
        divAtaques.appendChild(divAtaque);
    });
}

criarAtaques(listaDeAtaquesExemplo);