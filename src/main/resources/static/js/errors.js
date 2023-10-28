function getErrorMessage(error) {
    if (error.code == "auth/invalid-login-credentials") {
        return "Credenciais de login inválidas";
    }
    if (error.code == "auth/invalid-email") {
        return "Email inválido";
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
    return error.message;
}
