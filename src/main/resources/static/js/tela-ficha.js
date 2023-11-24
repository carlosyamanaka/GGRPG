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



var baseUrl = "http://localhost:8080";

function urlBase(endpoint) {
    return baseUrl + endpoint;
}


function postarAtaque(){
    var form = document.getElementById('formAddAtaque');
    form.addEventListener('submit', function (event) {
        event.preventDefault();

        var nome = document.querySelector('input[name="AddAtaqueNome"]').value;
        var arma = document.querySelector('input[name="AddAtaqueArma"]').value;
        var dano = document.querySelector('input[name="AddAtaqueDano"]').value;
        var teste = document.querySelector('select[name="AddAtaqueTeste"]').value;

        var novoAtaque = {
            nome: nome,
            arma: arma,
            dano: dano,
            teste: teste,
            ficha:{
                
            }
        };

        axios.post(urlBase("/ataques"), novoAtaque)
            .then(function (response) {
                console.log('FOIII', response.data);
            })
            .catch(function (error) {
                console.error('ISHH', error);
            });
    });    
}
    
/////////////////////////////////////////////

// async function consultaRitual() {
//     try {
//         const response = await axios.get('/rituais');
//         const rituais = response.data;

//         // Aqui você pode manipular os dados recebidos, por exemplo, adicionar à tabela
//         rituais.forEach(ritual => {
//             // Adicione lógica para inserir na tabela
//             console.log(ritual);
//         });
//     } catch (error) {
//         console.error('Erro ao consultar rituais:', error);
//     }
// }


// async function putRitual() {
//     try {
//         const id = selectTabela.getRow1.value; // Certifique-se de que esta parte está correta
//         const response = await axios.get(`/rituais/${id}`);
//         const ritual = response.data;

//         // Aqui você pode manipular os dados do ritual antes de enviar a atualização
//         // Exemplo: ritual.descricao = 'Nova Descrição';

//         await axios.put(`/rituais/${id}`, ritual);
//         console.log('Ritual atualizado com sucesso.');
//     } catch (error) {
//         console.error('Erro ao atualizar ritual:', error);
//     }
// }


// function consultaHabilidade(){
//     selectTabela
//     objRecebeuBD = axios.getAll
//     objRecebeuBD.forEach(function (){
//         selectTabela.insert(objRecebeuBD)
//     }   
// }

// function putHabilidade(){
//     id = selectTabela.getRow1.value;
//     ritual =  axios.getRitualByID(id)
//     axios.put(Habilidade);
// }

// function consultaItem(){
//     selectTabela
//     objRecebeuBD = axios.getAll
//     objRecebeuBD.forEach(function (){
//         selectTabela.insert(objRecebeuBD)
//     }   
// }

// function putItem(){
//     id = selectTabela.getRow1.value;
//     ritual =  axios.getRitualByID(id)
//     axios.put(Item);
// }




function criarAtaques(listaDeAtaques) {
    var divAtaques = document.getElementById('ataquesContainer');
    divAtaques.innerHTML = ''; 

    listaDeAtaques.forEach(function (ataque, index) {

        var divAtaque = document.createElement('div');
        divAtaque.classList.add('ataque');


        var tituloH2 = document.createElement('h2');
        tituloH2.textContent = 'Novo Ataque';
        divAtaque.appendChild(tituloH2);


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