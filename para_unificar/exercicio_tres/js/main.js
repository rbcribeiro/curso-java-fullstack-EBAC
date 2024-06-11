$(document).ready(function () {
  $("#telefone").mask("(00) 00000-0000", {
    placeholder: "(__) _____-____",
  });
  $("#cpf").mask("000.000.000-00", {
    placeholder: "___.___.___-__",
  });
  $("#cep").mask("00000-000", {
    placeholder: "_____-___ CEP",
  });

  $("form").validate({
    rules: {
      nomeCompleto: {
        required: true,
      },
      email: {
        required: true,
        email: true,
      },
      telefone: {
        required: true,
      },
      cpf: {
        required: true,
      },
      rua: {
        required: true,
      },
      bairro: {
        required: true,
      },
      cidadeUf: {
        required: true,
      },
      cep: {
        required: true,
      },
    },
    messages: {
      nome: "Por favor, insira seu nome",
    },
    submitHandler: function (form) {
      console.log(form);
    },
    invalidHandler: function (evento, validador) {
      let camposIncorretos = validador.numberOfInvalids();
      if (camposIncorretos) {
        alert(`Existem ${camposIncorretos} campos incorretos`);
      }
    },
  });

  $(".lista-veiculos button").click(function () {
    const destino = $("#contato");

    const nomeVeiculo = $(this).parent().find("h3").text();

    $("#veiculo-interesse").val(nomeVeiculo);

    $("html").animate(
      {
        scrollTop: destino.offset().top,
      },
      1000
    );
  });
});
