import java.util.Scanner;
import game2.*;
import exception.*;
import game.Robo;
public class App {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Ambiente ambiente=new Ambiente();
        String cor1,cor2;
        System.out.println("Insira a cor do robo1(■) e do robo2(O)");
        cor1=input.next();
        cor2=input.next();
        Robo robo=new Robo(cor1);
        Robo robo2=new Robo(cor2);
        int frutaX, frutaY;
        System.out.println("Insira a posição da fruta(posições 0-4)");
        frutaX=input.nextInt();
        frutaY=input.nextInt();
        boolean verificador = true;
        while(verificador){
            if(frutaX > 5 || frutaY > 5 || frutaX < 0 || frutaY < 0){
                System.out.println("Posição invalida, insira novamente(posições 0-4): ");
                frutaX = input.nextInt();
                frutaY = input.nextInt();
            } else{
                verificador = !verificador;
            }
        }
        ambiente.matriz(frutaX,frutaY,0,0,0,0);
        int roboX=0,roboY=0,robo2X=0,robo2Y=0,contMov1=0,contMov2=0;//contmov = contador de movimentos   
        do{
            System.out.println("----------------------------");
            System.out.println(robo.getCor());
            try {
                robo.mover(robo.aleatorio());
            } catch (MovimentoInvalidoException e) {
                //caso haja um movimento invalido ele imprime o erro juntamente com a cor do robô que cometeu o erro
                System.out.println("Robô "+robo.getCor()+", "+e);
            }
            contMov1++;//aumenta a cada movimento realizado pelo robô
            roboX=robo.getX();
            roboY=robo.getY();
            ambiente.matriz(frutaX,frutaY,roboX,roboY,robo2X,robo2Y);
            ambiente.mostrarMatriz();
            if(robo.comeufruta(frutaX,frutaY)==true){
                //caso um dos robôs alcance a posição da fruta, o jogo se encerra indicando quem venceu
                System.out.println(robo.getCor()+" ganhou!");
                break;
            }
            System.out.println(robo2.getCor());
            try {
                robo2.mover(robo2.aleatorio());
            } catch (MovimentoInvalidoException e) {
                System.out.println("Robô "+robo2.getCor()+", "+e);
            }
            contMov2++; 
            robo2X=robo2.getX();
            robo2Y=robo2.getY();
            ambiente.matriz(frutaX,frutaY,roboX,roboY,robo2X,robo2Y);
            ambiente.mostrarMatriz();
            if(robo2.comeufruta(frutaX,frutaY)==true){
                System.out.println(robo2.getCor()+" ganhou!");
                break;
            }
        }while(true);
        //indicando a quantidade de movimentos de cada robô
        System.out.println("Movimentos do robô"+robo.getCor()+" "+contMov1+";\0Movimentos do robô"+robo2.getCor()+" "+contMov2+";");
        input.close();
    }
}