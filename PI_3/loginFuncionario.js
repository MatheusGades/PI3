// Função para validar o e-mail
function validarEmail(email) {
    // Validar o e-mail (formato: exemplo@gmail.com)
    const emailRegex = /^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}$/;
    return emailRegex.test(email);
}

// Função para verificar se todos os campos estão preenchidos corretamente
function validarFormulario() {
    let email = document.getElementById("email").value;
    let senha = document.getElementById("senha").value;
    let perfil = document.getElementById("perfil").value;

    // Validação para o campo "E-mail"
    if (!validarEmail(email)) {
        return false;
    }

    // Validação para o campo "Perfil do Usuário"
    if (perfil !== "administrador" && perfil !== "gerente" && perfil !== "funcionario") {
        return false;
    }

    // Verifica se todos os campos estão preenchidos corretamente
    if (validarEmail(email) && senha.trim() !== "" && perfil !== "") {
        return true;
    } else {
        return false;
    }
}

// Adicione um ouvinte de eventos ao formulário para impedir o envio se a validação falhar
document.getElementById("loginFuncionarioForm").addEventListener("submit", function (event) {
    if (!validarFormulario()) {
        event.preventDefault();
    }
});

// Função que será executada quando o botão "Entrar" for clicado
document.getElementById("entrar").addEventListener("click", function() {
    if (validarFormulario()) {
        window.location.href = "TelaSistema.html";
    }
});

// Função que será executada quando o botão "Sair" for clicado
document.getElementById("sair").addEventListener("click", function() {
    window.close();
});
