# Desafio QA
Técnicas de teste escolhidas:
Teste funcional para validar a funcionalidade da aplicação, analisando os resultados<br />
Teste não funcional para testar capacidade de execução simultânea da rotina<br />
Teste de interface, validando a estrutura da aplicação, tais como existência dos campos e seus comportamentos<br />
Teste unitário - API – Validação da resposta do endpoint<br />
Automação realizada utilizando seguintes ferramentas:<br />
Selenium WebDriver, JUnit, e linguagem de programação Java. Validando os cenários positivos e negativos, executados em um projeto maven do Eclipse IDE.<br />
Teste de API realizado com o Postman e JavaScript - “Collection exportada para o diretório do projeto de teste”<br />
Teste não funcional realizado com as ferramentas NodeJs e Newman utilizando JavaScript
“foi realizado requisição para simular o investimento diretamente na api, 100 execuções em paralelo, sem falhas”

Testes UI<br />
**Contexto: Simulador investimento**<br />
DADO que acesso a url “https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca”<br />
Cenário: Deve validar campos existentes na aplicação<br />
ENTAO o sistema exibe simulador de investimento com campos conforme a “documentacao”<br />

Cenário: Deve validar campos obrigatórios<br />
E seleciono simular<br />
ENTAO o sistema impede a simulacao<br />
E critica o preenchimento dos campos<br />
Cenário: Deve realizar simulacao para o perfil Para Voce em Meses<br />
QUANDO seleciono o perfil Para Voce<br />
E informo o valor a aplicar “R$5.000,00”<br />
E informo o valor a poupar “R$300,00”<br />
E informo o tempo “48”<br />
E seleciono a opcao “Meses”<br />
E clico na opcao simular<br />
ENTAO o sistema retorna o valor a ser guardado no periodo<br />

Cenário: Deve realizar simulacao para o perfil Para Voce em Anos<br />
QUANDO seleciono o perfil Para Voce<br />
E informo o valor a aplicar “R$5.000,00”<br />
E informo o valor a poupar “R$300,00”<br />
E informo o tempo “2”<br />
E seleciono a opcao “Anos”<br />
E clico na opcao simular<br />
ENTAO o sistema retorna o valor a ser guardado no periodo<br />

Cenário: Deve realizar simulacao para o perfil Para Empresa em Meses <br />
QUANDO seleciono o perfil Para Empresa<br />
E informo o valor a aplicar “R$5.000,00”<br />
E informo o valor a poupar “R$300,00”<br />
E informo o tempo “48”<br />
E seleciono a opcao “Meses”<br />
E clico na opcao simular<br />
ENTAO o sistema retorna o valor a ser guardado<br />
Cenário: Deve realizar simulacao para o perfil Para Empresa em Anos<br />
QUANDO seleciono o perfil Para Empresa<br />
E informo o valor a aplicar “R$5.000,00”<br />
E informo o valor a poupar “R$300,00”<br />
E informo o tempo “2”<br />
E seleciono a opcao “Anos”<br />
E clico na opcao simular<br />
ENTAO o sistema retorna o valor a ser guardado no periodo<br />
Cenário: Deve limpar formulario<br />
QUANDO seleciono o perfil Para Voce<br />
E informo o valor a aplicar “R$5.000,00”<br />
E informo o valor a poupar “R$300,00”<br />
E informo o tempo “48”<br />
E seleciono a opcao “Meses”<br />
E clico na opcao Limpar formulario<br />
ENTAO o sistema limpa o formulario para nova simulacao<br />

Cenário: Deve refazer simulacao<br />
QUANDO seleciono o perfil Para Voce<br />
E informo o valor a aplicar “R$9.999.999.99”<br />
E informo o valor a poupar “R$9.999.999.99”<br />
E informo o tempo “48”<br />
E seleciono a opcao “Meses”<br />
E clico na opcao simular<br />
ENTAO o sistema impede a simulacao<br />
E critica valor maximo nos campos<br />

**Contexto: Refazer simulacao**<br />
DADO que realizei uma simulacao<br />
E estou na tela de retorno<br />
QUANDO clico na opcao Refazer simulacao<br />
ENTAO o sistema retorna a tela de simulacao<br />
E apresenta campos vazios para nova simulacao<br />
