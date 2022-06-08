import java.util.Scanner;
import exception.MovimentoInvalidoException;
import game2.Ambiente;
import game2.Robo;
public class App {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Ambiente ambiente=new Ambiente();
        Robo robo=new Robo();
        Robo robo2=new Robo();
        System.out.println("|Insira a posição da fruta(posições 0-4)|");
        int linha=input.nextInt();
        int coluna=input.nextInt();
        ambiente.matriz(linha,coluna,0,0,0,0);
        ambiente.mostrarMatriz();
        int roboX;int roboY;int robo2X;int robo2Y;        do{
            try {
                robo.mover(robo.aleatorio());
                
            } catch (MovimentoInvalidoException e) {
                e.printStackTrace();
            }
            try {
                robo2.mover(robo2.aleatorio());
            } catch (MovimentoInvalidoException e) {
                e.printStackTrace();
            }
            roboX=robo.getX();
            roboY=robo.getY();
            robo2X=robo2.getX();
            robo2Y=robo2.getY();

            ambiente.matriz(linha,coluna,roboX,roboY,robo2X,robo2Y);
            ambiente.mostrarMatriz();
            if(robo.comeufruta(linha,coluna)==true){
                System.out.println("Robo1 ganhou");
                break;
            }
            else if(robo2.comeufruta(linha,coluna)==true){
                System.out.println("Robo2 ganhou");
                break;
            }
        }while(true);
        input.close();
    }
}