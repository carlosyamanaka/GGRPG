const api = axios.create({
    baseURL: 'http://localhost:8080'
});
    
function editanovoagente(step) {
    document.querySelectorAll('.novo-agente').forEach(etapa => {
        etapa.style.display = 'none';
    });
    document.getElementById(`step${step}`).style.display = 'block';
}

const currentUser = firebase.auth().currentUser;

const auth = firebase.auth();

function recuperarUsuario() {
    auth.onAuthStateChanged((user) => {
        if (user) {
            const emailUser = user.email;
            return emailUser;
        } else {
            console.log("Usuário não está logado");
        }
    });
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



function createFicha() {
    const nomeDoPersonagem = document.getElementById('nomeDoPersonagem').value;
    const nomeDoJogador = document.getElementById('nomeDoJogador').value;
    const emailUser = recuperarUsuario();
    axios.post('http://localhost:8080/fichas', {
        "nomeDoPersonagem": nomeDoPersonagem,
        "nomeDoJogador": nomeDoJogador,
        "sistema": "Ordem Paranormal",
        "email_usuario": emailUser
    })
        .then(response => {
            console.log('Ficha created:', response.data);

        })
        .catch(error => {
            console.error('Error creating ficha:', error);
        });
};


function criarPersonagem() {

    createFicha();

    const novoatributo = {
        forca: document.querySelector('input[name="forcaPagina1"]').value,
        agilidade: document.querySelector('input[name="agilidadePagina1"]').value,
        intelecto: document.querySelector('input[name="intelectoPagina1"]').value,
        presenca: document.querySelector('input[name="presencaPagina1"]').value,
        vigor: document.querySelector('input[name="vigorPagina1"]').value,
        id_ficha: 9
    }

    api.post('/atributos', novoatributo).then(response => {
        const dados = response.data;
        console.log(dados); 
    });

    window.location.href = "agentes.html"
}

    
