const api = axios.create({
    baseURL: 'http://localhost:8080'
});
    
function editanovoagente(step) {
    document.querySelectorAll('.novo-agente').forEach(etapa => {
        etapa.style.display = 'none';
    });
    document.getElementById(`step${step}`).style.display = 'block';
}

var origem;
function escolheOrigem(tipo) {
    origem = tipo;
    var habilidade;
    console.log(origem);
    if (origem == 'artista') {
        habilidade = api.get('/habilidades/1');
    }else if(origem == 'cultista arrependido') {
        habilidade = axios.get('/habilidades/2');
    }else if(origem == 'atleta'){
        habilidade = axios.get('/habilidades/3');
    }
}

var classe;
function escolheClasse(tipo) {
    classe = tipo;
    console.log(classe);
    if(classe == 'combatente'){
        habilidade = axios.get('http://localhost:8080/habilidades/4');
    }else if(classe == 'especialista') {
        habilidade = axios.get('http://localhost:8080/habilidades/5');
    }else if(classe == 'ocultista'){
        habilidade = axios.get('http://localhost:8080/habilidades/6');
    }
}

function criarficha(){
    window.location.href = "http://127.0.0.1:5500/src/main/resources/static/html/telaficha.html";
}


function criarPersonagem(){
    
    const novoatributo = {
        forca: document.querySelector('input[name="forcaPagina1"]').value,
        agilidade: document.querySelector('input[name="agilidadePagina1"]').value,
        intelecto: document.querySelector('input[name="intelectoPagina1"]').value,
        presenca: document.querySelector('input[name="presencaPagina1"]').value,
        vigor: document.querySelector('input[name="vigorPagina1"]').value
    }
    
    api.post('/atributos', novoatributo).then(response => {
        const dados = response.data;
        console.log(dados);
    });

    
    function createFicha() {
        const nomeDoPersonagem = document.getElementById('nomeDoPersonagem').value;
        const nomeDoJogador = document.getElementById('nomeDoJogador').value;
        const sistema = "Ordem Paranormal"
    
        const ficha = {
            nomeDoPersonagem,
            nomeDoJogador,
            sistema,
            id_usuario: 1
        };
    
        axios.post('http://localhost:8080/fichas', ficha)
            .then(response => {
                console.log('Ficha created:', response.data);
            })
            .catch(error => {
                console.error('Error creating ficha:', error);
            });
    };
    

//     const { data } = await axios.post('/fichas', {
//         nomeDoPersonagem: document.querySelector('input[name="nomepersonagem"]').value,
//         nomeDoJogador: document.querySelector('input[name="nomejogador"]').value,
//         sistema:"Ordem Paranormal",
//         usuario:{
            
//         },
//         atributo: novoatributo,
                    
//         propriedade: {
//             origem: origem,
//             classe: classe,
//             trilha: 
//             nex: 
//             peRodada:
//             peTot:
//             peAtual:
//             pvTot:
//             pvAtual:
//             deslocamento:
//             sanidadeTot:
//             sanidadeAtual:
//             defesa:
//         },
//         inventario:{
                
//         },
//         habilidades: habilidade,
//         pericia:{
                
//         },
//         rituais:{

//         },
//         ataques:{

//         }
//     });
// }



// var novoAtaque = {
//     nome: nome,
//     arma: arma,
//     dano: dano,
//     teste: teste,
//     ficha:{
        
//     }
};
