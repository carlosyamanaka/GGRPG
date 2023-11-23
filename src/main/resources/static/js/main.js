 // isso aq verifica se o usuario nao existe, ai joga pro login

firebase.auth().onAuthStateChanged(user =>{
    if(!user){
        window.location.href = "login.html"
    }
})

//funcao para deslogar e mandar pro login

function logout(){
    firebase.auth().signOut().then(() => {
        window.location.href = "login.html";
    }).catch(() => {
        toastr.error("Falha ao deslogar");
    })

}

function criarficha(){
    window.location.href = "http://127.0.0.1:5500/src/main/resources/static/html/telaficha.html";
}