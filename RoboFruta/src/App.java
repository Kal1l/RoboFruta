import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Ambiente2 ambiente=new Ambiente2(4);
        Scanner input=new Scanner(System.in);
        int linha=input.nextInt();
        int coluna=input.nextInt();
        ambiente.matriz(linha,coluna);
        ambiente.mostrarMatriz();
        input.close();
    }
}