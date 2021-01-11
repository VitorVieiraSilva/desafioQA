#Desafio QA

Técnicas de teste escolhidas:
Teste funcional para validar a funcionalidade da aplicação, analisando os resultados
Teste não funcional para testar capacidade de execução simultânea da rotina
Teste de interface, validando a estrutura da aplicação, tais como existência dos campos e seus comportamentos
Teste unitário - API – Validação da resposta do endpoint
Automação realizada utilizando seguintes ferramentas:
Selenium WebDriver, JUnit, e linguagem de programação Java. Validando os cenários positivos e negativos, executados em um projeto maven do Eclipse IDE.
Teste de API realizado com o Postman e JavaScript - “Collection exportada para o diretório do projeto de teste”
Teste não funcional realizado com as ferramentas NodeJs e Newman utilizando JavaScript
“foi realizado requisição para simular o investimento diretamente na api, 100 execuções em paralelo, sem falhas”

Testes UI
**Contexto: Simulador investimento**
DADO que acesso a url “https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca”
Cenário: Deve validar campos existentes na aplicação
ENTAO o sistema exibe simulador de investimento com campos conforme a “documentacao”
Cenário: Deve validar campos obrigatórios
E seleciono simular
ENTAO o sistema impede a simulacao
E critica o preenchimento dos campos

Cenário: Deve realizar simulacao para o perfil Para Voce em Meses
QUANDO seleciono o perfil Para Voce
E informo o valor a aplicar “R$5.000,00”
E informo o valor a poupar “R$300,00”
E informo o tempo “48”
E seleciono a opcao “Meses”
E clico na opcao simular
ENTAO o sistema retorna o valor a ser guardado no periodo

Cenário: Deve realizar simulacao para o perfil Para Voce em Anos
QUANDO seleciono o perfil Para Voce
E informo o valor a aplicar “R$5.000,00”
E informo o valor a poupar “R$300,00”
E informo o tempo “2”
E seleciono a opcao “Anos”
E clico na opcao simular
ENTAO o sistema retorna o valor a ser guardado no periodo

Cenário: Deve realizar simulacao para o perfil Para Empresa em Meses 
QUANDO seleciono o perfil Para Empresa
E informo o valor a aplicar “R$5.000,00”
E informo o valor a poupar “R$300,00”
E informo o tempo “48”
E seleciono a opcao “Meses”
E clico na opcao simular
ENTAO o sistema retorna o valor a ser guardado

Cenário: Deve realizar simulacao para o perfil Para Empresa em Anos 
QUANDO seleciono o perfil Para Empresa
E informo o valor a aplicar “R$5.000,00”
E informo o valor a poupar “R$300,00”
E informo o tempo “2”
E seleciono a opcao “Anos”
E clico na opcao simular
ENTAO o sistema retorna o valor a ser guardado no periodo

Cenário: Deve limpar formulario
QUANDO seleciono o perfil Para Voce
E informo o valor a aplicar “R$5.000,00”
E informo o valor a poupar “R$300,00”
E informo o tempo “48”
E seleciono a opcao “Meses”
E clico na opcao Limpar formulario
ENTAO o sistema limpa o formulario para nova simulacao

Cenário: Deve refazer simulacao
QUANDO seleciono o perfil Para Voce
E informo o valor a aplicar “R$9.999.999.99”
E informo o valor a poupar “R$9.999.999.99”
E informo o tempo “48”
E seleciono a opcao “Meses”
E clico na opcao simular
ENTAO o sistema impede a simulacao
E critica valor maximo nos campos

**Contexto: Refazer simulacao**
DADO que realizei uma simulacao
E estou na tela de retorno
QUANDO clico na opcao Refazer simulacao
ENTAO o sistema retorna a tela de simulacao
E apresenta campos vazios para nova simulacao
