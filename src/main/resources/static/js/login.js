
function login() {
    const email = document.getElementById('email').value;
    const senha = document.getElementById('senha').value;
    firebase.auth().signInWithEmailAndPassword(
        email, senha
    ).then((response) => {
        console.log("sucesso", response);
        window.location.href = "index.html"
    }).catch(error => {
        const errorMessage = getErrorMessage(error);
        toastr.error(errorMessage);
    });
}

function recoverPassword() {
    const email = document.getElementById('email').value;
    firebase.auth().sendPasswordResetEmail(email).then(() => {
        alert('Email enviado com sucesso');
    }).catch(error => {
        const errorMessage = getErrorMessage(error);
        toastr.error(errorMessage);

    });
}

const confsenha = document.getElementById('confirmesenha').value;

function register() {
    const email = document.getElementById('email').value;
    const senha = document.getElementById('senha').value;
    firebase.auth().createUserWithEmailAndPassword(
        email, senha
    ).then((response) => {  
        window.location.href = "index.html"
    }).catch(error => {
        const errorMessage = getErrorMessage(error);
        toastr.error(errorMessage);
    });
}

function senhaConfirmacao(){
    const senha = document.getElementById('senha').value;
    const senhaConfirmacao = document.getElementById('confirmesenha').value;
    const erro = document.getElementById('errosenhadif');       
    if(senha!= senhaConfirmacao){
        erro.style.display="block";
        document.getElementById('botaoEnvio').disabled=true;
        document.getElementById('botaoEnvio').style.backgroundColor="white";
        document.getElementById('botaoEnvio').style.color="#007bff";
    }else{  
        erro.style.display="none";
        document.getElementById('botaoEnvio').disabled=false;
        document.getElementById('botaoEnvio').style.backgroundColor="#007bff";
        document.getElementById('botaoEnvio').style.color="white";
    }
}

