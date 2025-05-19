
function enviarFormulario() {
        //Pegar os valores do formulario
        let nome = document.getElementById("nome").value
        let email = document.getElementById("email").value

        //Criar um objeto com os dados
        let contato = {
            nome: nome,
            email: email
        };
        
        //Enviar os dados para o backend
        fetch("/api/contatos", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(contato)
        })
        .then(function() {
            document.getElementById("mensagem").textContent = "Enviado com sucesso!"
            document.getElementById("formContato").reset()
        })

        .catch(function() {
            document.getElementById("mensagem").textContent = "Erro ao enviar."
        })
}