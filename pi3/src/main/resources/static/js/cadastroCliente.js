// Função para validar o nome (apenas letras e espaços)
function validarNome(nome) {
    const nomeRegex = /^[A-Za-z\s]+$/;
    return nomeRegex.test(nome);
}

// Função para validar o CPF (formato: XXX.XXX.XXX-XX)
function validarCPF(cpf) {
    const cpfRegex = /^\d{3}\.\d{3}\.\d{3}-\d{2}$/;
    return cpfRegex.test(cpf);
}

// Função para validar o e-mail formato: exemplo@gmail.com)
function validarEmail(email) {
    const emailRegex = /^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}$/;
    return emailRegex.test(email);
}

// Função para validar o telefone (formato: (XX) XXXXX-XXXX)
function validarTelefone(telefone) {
    const telefoneRegex = /^\(\d{2}\) \d{5}-\d{4}$/;
    return telefoneRegex.test(telefone);
}

// Função para verificar se todos os campos estão preenchidos corretamente
function validarFormulario() {
    let nome = document.getElementById("nome").value;
    let cpf = document.getElementById("cpf").value;
    let email = document.getElementById("email").value;
    let endereco = document.getElementById("endereco").value;
    let telefone = document.getElementById("telefone").value;

    if (validarNome(nome) && validarCPF(cpf) && validarEmail(email) && endereco.trim() !== "" && validarTelefone(telefone)) {
        return true; 
    } else {
        return false; 
    }
}

// Ouvinte de eventos ao formulário para impedir o envio se a validação falhar
document.getElementById("cadastro-form").addEventListener("submit", function (event) {
    if (!validarFormulario()) {
        event.preventDefault();
    }
});

// Função que será executada quando o botão "Próximo" for clicado
document.getElementById("proximo").addEventListener("click", function() {
    if (validarFormulario()) {
        window.location.href = "/opcoes"; 
    }
});

  // Função que será executada quando o botão "Sair" for clicado
document.getElementById("sair").addEventListener("click", function() {
   window.close(); 
});