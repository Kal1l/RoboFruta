import java.util.Scanner;
import exception.MovimentoInvalidoException;
import game2.Ambiente;
import game2.Robo;
public class App {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Ambiente ambiente=new Ambiente();
        Robo robo=new Robo();//Criar 2 objetos de robô
        //Robo robo2=new Robo(); <--- SEGUNDO OBJETO DE ROBÔ
        System.out.println("|Insira a posição da fruta(posições 0-4)|");
        int linha=input.nextInt();
        int coluna=input.nextInt();
        ambiente.matriz(linha,coluna,0,0);
        ambiente.mostrarMatriz();
        String movimento;
        int roboX;int roboY;
        do{
            movimento=input.next();//fazer movimentação através de método randômico
            try {
                robo.mover(movimento);//os dois começam no mesmo local, mas cada um tem movimentos diferentes,usar 2 métodos de mover(?)
            } catch (MovimentoInvalidoException e) {
                e.printStackTrace();
            }
            roboX=robo.getX();
            roboY=robo.getY();
            //matriz ambiente
            ambiente.matriz(linha,coluna,roboX,roboY);
            ambiente.mostrarMatriz();
        }while(robo.comeufruta(linha,coluna)==false);
        System.out.println("|Você ganhou!|");
        input.close();
    }
}