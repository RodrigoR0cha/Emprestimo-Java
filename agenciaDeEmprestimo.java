package emprestimo;

import java.util.Scanner;

public class agenciaDeEmprestimo  {
    
    static private String nome, aceite;
    static private int idade;
    static private double remuneracaoMensal, limiteEmprestimo, porcentagem = 30;
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Scanner topou = new Scanner(System.in);
        System.out.println("Olá seja bem vindo(a) a me empresta dinheiro ai!");
        System.out.println("Por favor digite o seu nome: ");
        String nome = teclado.nextLine();
        System.out.println(nome +" por favor digite sua idade: " );
        int idade = teclado.nextInt();
        verificacaoIdade(idade, nome);
        System.out.println(nome + " Qual sua renda mensal: ?");
        remuneracaoMensal = teclado.nextDouble();
        limiteEmprestimo = (porcentagem / 100) * remuneracaoMensal; // calculo para porcentagem de juros 30% da renda
        System.out.println( nome + " Podemos te oferecer essa quantia " + limiteEmprestimo);
        System.out.println(nome + " Você aceita essa oferta de emprestimo?");
        System.out.println("Digite 1 para aceitar ou 2 para rejeitar a proposta!"); 
        String aceite = topou.nextLine(); // Tem um limite de elementos dentro do método Scanner
        aceiteProposta(aceite);

    } 

    private static void verificacaoIdade (int idade, String nome) {
        if(idade >= 18) {
            System.out.println("Ótimo " + nome + " Você pode pedir emprestimo conosco! ");
        } else {
            System.out.println("Que pena " + nome + " Você precisa ter 18 anos ou mais para pedir um emprestimo!");
            System.out.println("Tente novamente quando você for de maior " + nome);
            System.out.println("Encerrando o programa");
            System.exit(0);
        }
    }

    private static void aceiteProposta (String aceite) {
            if(aceite.equals("1")) {
                Scanner vezes = new Scanner(System.in);
                System.out.println("Parabéns Empréstimo realizado com sucesso ");
            }
            if(aceite.equals("2")) {
                System.out.println("Ok proposta rejeitada, obrigado pelo seu tempo!");
            } else {
                System.exit(0);
            }

        }

        

}
