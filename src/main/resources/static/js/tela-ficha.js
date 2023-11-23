function alterarDireita(step) {
    document.querySelectorAll('.subDireita').forEach(sub => {
        sub.style.display = 'none';
    });
    document.getElementById(`${step}`).style.display = 'flex';
}

//slk fi, é mt coisa, pprt, pqp, acho que isso deve criar, nao sei como funfa no js puro, boa sorte kkkkkkkkkkkkkkkkk
// mal consigo imaginar como fazer isso, so fiz no vue e la é diff
// se quiser apagar ai dps e fazer mais simples ou algo diff fica a vontade


function abrirRituais(){
    document.getElementById("addRituais").style.display="flex";
}


function cancelar(popup){
    document.getElementById(`${popup}`).style.display="none";
}

function criarAtaque() {
    // Criar elemento div principal
    var divAtaque = document.createElement('div');
    divAtaque.id = 'ataque';

    // Adicionar título h2
    var tituloH2 = document.createElement('h2');
    tituloH2.textContent = 'Novo Ataque';
    divAtaque.appendChild(tituloH2);

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

        divDados.appendChild(divDado);
    });

    // Adicionar div de dados à div principal
    divAtaque.appendChild(divDados);

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
    divAtaque.appendChild(divBotoes);

    // Adicionar div principal ao corpo do documento (ou a outro local desejado)
    document.body.appendChild(divAtaque);
}

// Chamar a função para criar o ataque
criarAtaque();



