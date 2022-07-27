package emprestimo;

import java.util.Scanner;

public class agenciaDeEmprestimo extends biblioteca {
    
    static private String nome, aceite;
    static private int idade, x;
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
        String aceite = topou.nextLine(); 
        aceiteProposta(aceite);
    } 

    // Método para verificação de maioridade
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

    /* Método para aceitar ou não a proposta de empréstimo
     * dentro do 1° if o método para parcelar a quantia caso o usuário aceite
     */
    private static void aceiteProposta (String aceite) {
            if(aceite.equals("1")) {
                Scanner topou = new Scanner(System.in);
                System.out.println("Parabéns Empréstimo realizado com sucesso ");
                System.out.println("Digite o número de parcelas, limite de 10 parcelas");
                int x = topou.nextInt();
                prestacao(x);   
            }
            if(aceite.equals("2")) {
                System.out.println("Ok proposta rejeitada, obrigado pelo seu tempo!");
            } else {
                System.exit(0);
            }

        }

        /* Método prestação criado porque a linguagem de programação Java
         * Não aceita divisão de 2 ou mais variáveis ex: limiteEmprestimo /= x;
         * Apenas com algum operando númerico ex: limiteEmprestimo /= 2;
         */ 

    private static void prestacao (int x) {
        switch (x) {
            case 0:
                System.out.println("Digite um numero maior que 0");
                System.out.println("Finalizando o programa");
                break;
            case 1:
                System.out.println(limiteEmprestimo);
                break;
            case 2:
                limiteEmprestimo /= 2;
                System.out.println(limiteEmprestimo); 
                break;
            case 3:
                limiteEmprestimo /= 3;
                System.out.println(limiteEmprestimo); 
                break;
            case 4:
                limiteEmprestimo /= 4;
                System.out.println(limiteEmprestimo); 
                break;
            case 5:
                limiteEmprestimo /= 5;
                System.out.println(limiteEmprestimo); 
                break;
            case 6:
                limiteEmprestimo /= 6;
                System.out.println(limiteEmprestimo); 
                break;
            case 7:
                limiteEmprestimo /= 7;
                System.out.println(limiteEmprestimo); 
                break;
            case 8:
                limiteEmprestimo /= 8;
                System.out.println(limiteEmprestimo); 
                break;
            case 9:
                limiteEmprestimo /= 9;
                System.out.println(limiteEmprestimo); 
                break;
            case 10:
                limiteEmprestimo /= 10;
                System.out.println(limiteEmprestimo); 
                break;
            default:
                System.out.println("Digite um numero entre 1 e 10");
                System.out.println("Finalizando o programa");
                System.exit(0);
        }
    }

        

}
