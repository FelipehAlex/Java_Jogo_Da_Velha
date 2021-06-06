package program;


import java.util.Scanner;
import teste.ChecarVencedor;

public class Program {

    public static void main(String[] args) {

        String[] tabela = new String[]{"_", "_", "_", "_", "_", "_", "_", "_", "_"};

        String j1 = "X";
        String j2 = "O";

        Scanner sc = new Scanner(System.in);

        int jogador = 1;
        int jogador_numero_1 = 0;
        int jogador_numero_2 = 0;

        while (true) {
            //jogador 1
            if (jogador == 1) {
                System.out.print("Digite uma posição entre '0' e 8: ");
                jogador_numero_1 = sc.nextInt();

                if (ChecarVencedor.verificaTabela(tabela, jogador_numero_1)) {
                    tabela[jogador_numero_1] = j1;
                    jogador = 2;
                    System.out.print(ChecarVencedor.desenhoTabela(tabela));
                } else {
                    System.out.println(ChecarVencedor.desenhoTabela(tabela));
                    System.out.println("Posição ja ocupada");
                }
            }

            if (ChecarVencedor.verificaVitoria(tabela, j1)) {
                System.out.print("Jogador numero 1 ganhou");
                break;
            }
            if (ChecarVencedor.verificaEmpate(tabela)) {
                System.out.print("Empate");
                break;
            }

            //jogador 2
            if (jogador == 2) {
                System.out.print("Digite uma posição entre '0' e 8: ");
                jogador_numero_2 = sc.nextInt();
                
                if(ChecarVencedor.verificaTabela(tabela, jogador_numero_2)){
                    tabela[jogador_numero_2] = j2;
                    jogador = 1;
                    System.out.println(ChecarVencedor.desenhoTabela(tabela));
                }
                else{
                    System.out.println(ChecarVencedor.desenhoTabela(tabela));
                    System.out.println("Posição já ocupada");
                }
            }
            if (ChecarVencedor.verificaVitoria(tabela, j2)){
                System.out.println("Jogador numero 2 ganhou");
                break;
            }
            if (ChecarVencedor.verificaEmpate(tabela)){
                System.out.println("Empate");
                break;
            }

        }

    }

}
