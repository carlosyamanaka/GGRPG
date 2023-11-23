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


function criarAtaque() {
    var divAtaques = document.getElementById('ataques');

    // Adicionar título h2
    var tituloH2 = document.createElement('h2');
    tituloH2.textContent = 'Novo Ataque';
    divAtaques.appendChild(tituloH2);

    // Adicionar div de dados
    var divDados = document.createElement('div');
    divDados.classList.add('dados');

    // Array de dados para criar
    var dados = [
        { label: 'Dano:', type: 'number', value: 104 },
        { label: 'Crítico:', type: 'number', value: 2 },
        { label: 'Ataque Bonus:', type: 'number', value: 0 },
        { label: 'Dano Extra:', type: 'number', value: 0 },
        { label: 'Tipo de Dano:', type: 'text', value: '-' },
        { label: 'Alcance:', type: 'text', value: '-' },
        { label: 'Perícia:', type: 'text', value: 'Luta' },
        { label: 'Atributo Dano:', type: 'text', value: 'Força' }
    ];

    // Criar e adicionar divs de dados
    dados.forEach(function (dado) {
        var divDado = document.createElement('div');
        divDado.classList.add('dado');

        var label = document.createElement('label');
        label.textContent = dado.label;
        divDado.appendChild(label);

        var input = document.createElement('input');
        input.type = dado.type;
        input.value = dado.value;
        divDado.appendChild(input);

        
    });

    // Adicionar div de dados à div principal
    divAtaques.appendChild(divDados);

    // Adicionar div de botões
    var divBotoes = document.createElement('div');
    divBotoes.classList.add('botoes');

    // Adicionar botão Remover
    var btnRemover = document.createElement('button');
    btnRemover.id = 'remover';
    btnRemover.textContent = 'Remover';
    divBotoes.appendChild(btnRemover);

    // Adicionar botão Editar
    var btnEditar = document.createElement('button');
    btnEditar.id = 'editar';
    btnEditar.textContent = 'Editar';
    divBotoes.appendChild(btnEditar);

    // Adicionar div de botões à div principal
    divAtaques.appendChild(divBotoes);


}

// Chamar a função para criar o ataque
criarAtaque();



