import java.util.Scanner;
import exception.MovimentoInvalidoException;
import game.Ambiente;
import game.Robo;
public class App {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Ambiente ambiente=new Ambiente();
        //String cor=input.next();(comentado por praticidade na hora de testar)
        Robo robo=new Robo();
        System.out.println("|Insira a posição da fruta(posições 0-4)|");
        //coordenadas das fruta geradas no próprio main
        int linha=input.nextInt();
        int coluna=input.nextInt();
        //Matriz inicial do programa
        ambiente.matriz(linha,coluna,0,0);
        ambiente.mostrarMatriz();
        //String movimento; //variável pro scanner de movimento
        int roboX;int roboY;
        //loop do jogo
        do{
           
            try {
                robo.mover(robo.aleatorio());
            } catch (MovimentoInvalidoException e) {
                e.printStackTrace();
            }
            //coordenadas do robô são puxadas da própria classe robô
            roboX=robo.getX();
            roboY=robo.getY();
            //matriz ambiente
            ambiente.matriz(linha,coluna,roboX,roboY);
            ambiente.mostrarMatriz();
        }while(robo.comeufruta(linha,coluna)==false);//condição para o fim do jogo: persongaem alcançar a coordenada da fruta
        System.out.println("|Você ganhou!|");
        input.close();
    }
}