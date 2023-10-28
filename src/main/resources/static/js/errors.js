function getErrorMessage(error) {
    if (error.code == "auth/missing-email") {
        return "O campo de email não pode ficar vazio";
    }
    if (error.code == "auth/missing-password") {
        return "O campo de senha não pode ficar vazio";
    }
    if (error.code == "auth/user-not-found") {
        return "Usuário nao encontrado";
    }
    if (error.code == "auth/wrong-password") {
        return "Senha inválida";
    }
    if (error.code == "auth/weak-password") {
        return "Sua senha precisa ter pelo menos 6 caracteres";
    }
    //Exclusivos login
    if (error.code == "auth/invalid-email") {
        return "Email inválido";
    }
    if (error.code == "auth/invalid-login-credentials") {
        return "Credenciais de login inválidas";
    }
    //Exclusivos registro
    if (error.code == "auth/email-already-in-use") {
        return "Email já cadastrado";
    }
    
    return error.message;
}