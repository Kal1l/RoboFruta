import java.util.Scanner;
import exception.MovimentoInvalidoException;
import game2.Ambiente;
import game2.Robo;
public class App {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Ambiente ambiente=new Ambiente();
        String cor1,cor2;
        System.out.println("Insira a cor do robo1(■) e do robo2(O)");
        cor1=input.next();
        cor2=input.next();
        Robo robo=new Robo(cor1);
        Robo robo2=new Robo(cor2);
        System.out.println("|Insira a posição da fruta(posições 0-4)|");
        int linha=input.nextInt();
        int coluna=input.nextInt();
        ambiente.matriz(linha,coluna,0,0,0,0);
        int roboX,roboY,robo2X,robo2Y,mover1=0,mover2=0;   
        do{
            try {
                robo.mover(robo.aleatorio());
                
            } catch (MovimentoInvalidoException e) {
                e.printStackTrace();
            }
            mover1++;
            try {
                robo2.mover(robo2.aleatorio());
            } catch (MovimentoInvalidoException e) {
                e.printStackTrace();
            }
            mover2++;
            roboX=robo.getX();
            roboY=robo.getY();
            robo2X=robo2.getX();
            robo2Y=robo2.getY();

            ambiente.matriz(linha,coluna,roboX,roboY,robo2X,robo2Y);
            ambiente.mostrarMatriz();
            if(robo.comeufruta(linha,coluna)==true && robo2.comeufruta(linha,coluna)==true){
                System.out.println("Empate, foram realizados "+mover1+"movimentos pelo robo1(■), e "+mover2+"movimentos pelo robo2(O)");
            }
            else if(robo.comeufruta(linha,coluna)==true){
                System.out.println(cor1+" ganhou com "+mover1+" movimentos");
                break;
            }
            else if(robo2.comeufruta(linha,coluna)==true){
                System.out.println(cor2+" ganhou com "+mover2+" moviementos");
                break;
            }
        }while(true);
        input.close();
    }
}