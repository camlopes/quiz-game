import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String[] questoes = {"Qual a principal função de um roteador?",
                             "Qual parte do computador é considerado o cerebro?",
                             "O que é um metodo em Java?",
                             "Como é declarado uma classe em Java?",
                             "Qual foi a primeira linguagem de programação comercial?"};
        String[][] opcoes = {{"1. Armazenar arquivos", "2. Encriptar dados", "3. Direcionar o trafego de internet", "4. Fazer a administração de senhas"},
                             {"1. CPU", "2. Hard drive", "3. RAM", "4. GPU"},
                             {"1. Um método é uma variável especial que armazena dados dentro de uma classe", "2. Um método é uma estrutura de controle que permite repetir um bloco de código várias vezes.", "3. Um método é um bloco de código que executa uma tarefa específica e pode retornar um valor.", "4.  Um método é um arquivo separado que contém funções para serem usadas em um programa Java."},
                             {"1. create class MinhaClasse {...}", "2. public class MinhaClasse {...}", "3. class: MinhaClasse {...}", "4. define class MinhaClasse {...}"},
                             {"1. C", "2. Assembly", "3. Fortran", "4. Java"}};
        int[] gabarito = {3, 1, 3, 2, 3};
        int questoesCorretas = 0;
        int resposta;

        Scanner scanner = new Scanner(System.in);

        System.out.println("****************************");
        System.out.println("Bem vindo ao Java Quiz Game!");
        System.out.println("****************************");

        for(int i = 0; i < questoes.length; i++){
            System.out.println(questoes[i]);

            for(int j = 0; j < opcoes[i].length; j++){
                System.out.println(opcoes[i][j]);
            }

            System.out.print("Qual a opção correta? ");
            resposta = scanner.nextInt();

            if(resposta == gabarito[i]){
                System.out.println("********");
                System.out.println("CORRETO!");
                System.out.println("********");
                questoesCorretas += 1;
            } else {
                System.out.println("********");
                System.out.println(" ERROU! ");
                System.out.println("********");
            }
        }

        System.out.println("Voce acertou " + questoesCorretas + " de 5 questoes");

        scanner.close();
    }
}
