

const firebaseConfig = {
    apiKey: "AIzaSyCBFJia4j06OH8ZBhTzbju6yaVby-2cEik",
    authDomain: "ggrpg-2d938.firebaseapp.com",
    databaseURL: "https://ggrpg-2d938-default-rtdb.firebaseio.com",
    projectId: "ggrpg-2d938",
    storageBucket: "ggrpg-2d938.appspot.com",
    messagingSenderId: "840757499698",
    appId: "1:840757499698:web:716f4263d78adeb1e5292b",
    measurementId: "G-KE5EDQ3443"
};  
firebase.initializeApp(firebaseConfig);


function login() {
    const email = document.getElementById('email').value;
    const senha = document.getElementById('senha').value;
    firebase.auth().signInWithEmailAndPassword(
        email, senha
    ).then((response) => {
            console.log("sucesso", response);
            window.location.href = "index.html"
        }).catch(error => {
            console.log("error", error);
        })
}