// Função que será executada quando o botão "Cliente" for clicado
document.getElementById("cliente").addEventListener("click", function() {
    window.location.href = "/cadastro";
  });

// Função que será executada quando o botão "Funcionário" for clicado
document.getElementById("funcionario").addEventListener("click", function() {
    window.location.href = "/login";
  });
  
  
// Função que será executada quando o botão "Sair" for clicado
document.getElementById("sair").addEventListener("click", function() {
    window.close(); 
  });
