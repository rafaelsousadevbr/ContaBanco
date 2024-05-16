import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        try (// Criada a variável auxiliar para entrada de dados do programa
        Scanner scEntrada = new Scanner(System.in)){
            
            // Criada as variáveis que irão ser manipuladas no programa ContaTerminal
            String numeroAgencia;
            int numeroConta;
            String nomeCliente;
            double saldoDaConta;
            String mensagemFinal = "";

             // Criada as mensagens para solicitação de dados das contas dos correntistas do banco
             System.out.println("Bem-vindo ao Banco RAFADEV-DIO!!!");
            
             System.out.println("Por gentileza, digitar o número da Agência Bancária:");
             numeroAgencia = scEntrada.next();
                         
             System.out.println("Agora digite o número da conta:");
             numeroConta = scEntrada.nextInt();
             scEntrada.nextLine();
 
             System.out.println("Digite por gentileza o nome do titular da conta:");
             nomeCliente = scEntrada.nextLine();
 
             System.out.println("Por gentileza, insira o valor do saldo em conta:");
             saldoDaConta = scEntrada.nextDouble();

            // Sistema retorna uma mensagem de saudação padrão ao correntista com os dados inseridos anteriormente
            mensagemFinal = mensagemFinal.concat("Olá ").concat(nomeCliente)
                    .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                    .concat(numeroAgencia).concat(", conta ").concat(String.valueOf(numeroConta)).concat(" e seu saldo ")
                    .concat(String.valueOf(saldoDaConta)).concat(" já está disponível para saque!");
            System.out.println(mensagemFinal);

            
            // Versão 2 utilizando o operador de concatenação "+"
            // System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em " +
            // "nosso banco, sua agência é " +
            // numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoDaConta
            // + " já está disponível para saque!");
 
        }
    }
}
