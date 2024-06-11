function validarFormulario() {
    var campoA = document.getElementById('campoA').value;
    var campoB = document.getElementById('campoB').value;
  
    if (parseFloat(campoB) > parseFloat(campoA)) {
      exibirMensagem(true);
    } else {
      exibirMensagem(false);
    }
  }
  
  function exibirMensagem(valido) {
    var mensagemDiv = document.getElementById('mensagem');
  
    mensagemDiv.innerHTML = '';
  
    var mensagem = document.createElement('p');
    
    if (valido) {
      mensagem.textContent = 'Formulário válido! B é maior que A.';
      mensagem.style.color = 'green';
    } else {
      mensagem.textContent = 'Formulário inválido! B deve ser maior que A.';
      mensagem.style.color = 'red';
    }
  
    mensagemDiv.appendChild(mensagem);
  }
  