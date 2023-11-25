
      const url = 'http://localhost:8080/fichas';

      const div = document.querySelector('.cardagente');

      var nficha;

      const getFichas = async () => {
        try {
          const response = await axios.get(url);
          const fichas = response.data;
          return fichas;
        } catch (error) {
          console.error(error);
        }
};
      
var infos;
      document.addEventListener('DOMContentLoaded', async () => {
        try {
          const fichas = await getFichas();

          const todosAgentes = document.getElementById('todosAgentes');

          for (var ficha of fichas) {
            console.log(ficha);
            var cardAgente = document.createElement('div');
            cardAgente.classList.add('cardagente');

            var nomeDoPersonagem = ficha.nomeDoPersonagem; // Verifique a estrutura dos dados aqui
            var id = ficha.id_ficha; // Verifique a estrutura dos dados aqui

            var h3NomeJogador = document.createElement('h3');
            h3NomeJogador.textContent = nomeDoPersonagem;

            var pClasseJogador = document.createElement('p');
            pClasseJogador.textContent = id;

            cardAgente.appendChild(h3NomeJogador);
            cardAgente.appendChild(pClasseJogador);

            todosAgentes.appendChild(cardAgente);
          }

          const divs = document.querySelectorAll('.cardagente');
          
          divs.forEach(div => {
            div.addEventListener('click', function (event) {
              nficha = event.currentTarget.querySelector(".cardagente > p").textContent;
              if (nficha) {
                infos = axios.get("http://localhost:8080/fichas/${nficha} }");

                infos.then(response => {
                const ficha = response.data;

                const inputNome = document.getElementById("pNome");
                inputNome.value = ficha.nomeDoPersonagem;
                });

                
                window.location.href = 'telaficha.html'
              }
            });
          });


          
        } catch (error) {
          console.error(error);
        }
      });




