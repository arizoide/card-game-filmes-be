# card-game-filmes-be
BackEnd Para fornecer informações de filmes a partir do IMDB


Se você chegou até aqui para visualizar o funcionamento deste sistema, precisa seguir os seguintes passos:

- Inicialização do repositório de configuração (https://github.com/arizoide/configs-microservice).
- Inicialização do service discovery (https://github.com/arizoide/Eureka-Server)
- Inicialização do BE (este aqui) e FE (https://github.com/arizoide/front)

O projeto ainda não está completo, porém já está populando os primeiros 50 itens diretamente do site omdb (dinamicamente pelo Id).

Os próximos passos consistem em:

  - Início e término do Front End, com o engine template Thymeleaf (Atualmente o FE só se registra no service discovery e faz uma chamada de teste, com rest template)
  - Configurar o Feign Client no FE
  - Criação das telas
  - Consumo do BE
  - Adaptação das necessidades vistas no BE
  - Colocar o Swagger para documentação das APIs
  - Peer review do código
  - Criação dos testes integrados e finalização dos unitários.
  - Modificar o populate inicial dos filmes para ser assíncrono.
  - Utilização de tópicos para informar os interessados sobre o andamento dos jogos e disponibilização das informações.\
  - Sistema de rankeamento em um microservice a parte.
