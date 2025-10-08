[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/RPHb6JFs)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=20862195&assignment_repo_type=AssignmentRepo)
# Atividade 4 - Classe e Objeto



## Sumário 
- [Como Utilizar Esse Projteto](#como-utilizar-esse-projeto-)
- [Desafio da Atividade](#desafio-da-atividade-)
- [No Microsoft Teams](#no-microsoft-teams--)
- [Regras](#regras-)
- [Feedback](#feedback-)

## Como Utilizar Esse Projeto 📁

- Nesse projeto há  pasta:
    - FazerVsCode:Exclusiva para realizar no VisualStudio Code. 

- Na sua máquina tem que ter instalado o <a href="https://www.oracle.com/br/java/technologies/downloads/" target="_blank">Java Development Kit (JDK) </a> 
- Caso utilize o VisualStudio Code é necessário que instale a <a href="https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack" target="_blank">Extension Pack for Java</a>


## Escopo da Atividade 🛠️

- Implementar uma classe que seja capaz de simular atuação dos modificadores de acesso e respectivamente os métodos getters/setters: 
- Implemente a Classe Corpo Humano e o Construtor  
- Implemente os métodos Getters
- Implemente os métodos Setters
- Implemente uma classe main que inclua as seguintes informações: Massa, Volume e Densidade



### Após essa implementação responda:

- Na classe Corpo_Humano inclua a linha c1.massa = "2"; logo depois de instanciar o objeto c1. Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?
- Na classe Corpo_Humano altere a linha private float Massa para public float Massa; Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?
- Na classe Corpo_Humano altere a linha public setVolume (float volume) para private setVolume (float volume).Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?
- Coloque as respostas em um arquivo txt

<b>Colocar essa informação no Readme do Git ou Em comentários de código na classe main </b>


## DESAFIO 🚀

- Implementar o Atributo e os Metodos de acesso para Altura;
- Criar um método para calcular o Indíce de Massa Corporal (IMC), sendo: IMC = (Peso/Altura)*2
- Exibir/Imprimir o IMC na classe main


## No Microsoft Teams  👥

- Não há necessidade fazer o upload do projeto 
- Enviar o Link do repositório

## Regras 📄

- Utilize as boas práticas de programação que são sempre mencionadas em aula e nos materiais; 
- Observe sempre os modificadores de acesso em atributos e métodos;
- Observe os nomes de classes e atributos;
- Utilze comentários para elucidar o cenário elaborado;

## Feedback 📨
-  Sua atividade receberá uma pontuação de 0 a 10, que compõe a Nota de Atividades da ATV1;
-  A nota será atribuída no Microsoft Teams

## Respostas ✅
1. Ao implementar a linha *“c1.massa = “2”;”* após instanciar a classe foi gerado dois erros *"massa has private access in CorpoHumano"* e *“incompatible types: String cannot be converted to double”*, com base nisso podemos notar que o atributo *massa* do objeto *c1* tem um acesso privado, ou seja, só pode ser acessado ou alterado dentro da própria classe *CorpoHumano*, além disso, podemos ver que o uso de aspas para atribuir um número para a variável fez o compilador interpretar esse número como uma string.
2. Ao transformar o atributo privado *massa* da classe *CorpoHumano* em um atributo público podemos notar que o erro *“incompatible types: String cannot be converted to double”* continua ocorrendo em [*App.java*](http://App.java), porém, **o erro *"massa has private access in CorpoHumano"* não ocorre mais, logo, quando resolvemos esse problema, colocando 2 ao invés de “2”, podemos notar que o comando “*c1.massa = 2;”* funciona sem resultar em qualquer erro, ou seja, como o atributo *massa* agora é público, podemos acessá-lo e alterá-lo de fora da classe
3. Depois de tornar o método *setter “setVolume()”* em *private* o código continua funcionando normalmente (isso porque não utilizamos *“setVolume()”* em momento algum) ,porém, quando chamamos esse método, o código apresenta um erro *“setVolume(float) has private access in CorpoHumano”* mostrando mais uma vez que um atributo ou método *private* de uma classe só pode ser acessado ou alterado dentro da própria classe, e também vemos que um erro no código pode não estar aparecendo no terminal porque essa parte do erro não está sendo usada
