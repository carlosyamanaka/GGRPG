


function login() {
    //Promisses sao assincronas
    firebase.auth().signInWithEmailAndPassword(
        form.email().value, form.password().value
    ).then(response => {
            window.location.href = "../html/index.html"
        }).catch(error => {
            console.log("error", error);
        })
}