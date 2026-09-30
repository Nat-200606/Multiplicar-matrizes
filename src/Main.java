import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o n de linhas da primeira matriz:");
        int i1 = input.nextInt();
        System.out.println("Insira o n de colunas da primeira matriz");
        int j1 = input.nextInt();

        System.out.println("Insira o n de linhas da segunda matriz:");
        int i2 = input.nextInt();
        System.out.println("Insira o n de colunas da segunda matriz");
        int j2 = input.nextInt();

        if (j1 == i2){
            int[][] matriz1 = new int[i1][j1];
            System.out.println("digite a primeira matriz");
            for (int x = 0;x<i1;x++){
                for (int y = 0;y<j1;y++){
                    matriz1[x][y] = input.nextInt();

                }
            }

            int[][] matriz2 = new int[i2][j2];
            System.out.println("digite a segunda matriz");
            for (int x = 0;x<i2;x++){
                for (int y = 0;y<j2;y++){
                    matriz2[x][y] = input.nextInt();

                }
            }
            System.out.println();

            int[][] resultado = new int[i1][j2];
            int resultadoElemento = 0;
            for (int x = 0; x < i1;x++){
                for (int y = 0; y < j2; y++){
                    for (int z = 0; z < j1; z++) {

                        resultadoElemento += matriz1[x][z] * matriz2[z][y];

                    }
                    resultado[x][y] = resultadoElemento;
                    resultadoElemento = 0;
                    System.out.print(resultado[x][y] + " ");
                }
                System.out.println();
            }

        }else {
            System.out.println(
                    "impossivel multiplicar, o n de colunas da primeira deve ser igual ao n de linhas da segunda");
        }

    }
}