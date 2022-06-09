import java.util.Scanner;
import game2.*;
import exception.*;
import java.io.IOException;;
//Erro presente, tem um pequeno problema sendo o de tudo estar invertido, robo1 é o 2° e o 2° é o primeiro
//Erro2 presente, as vezes o robo simplesmente não se move(algo a ver com o random?)
public class App {
    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        Ambiente ambiente=new Ambiente();
        String cor1,cor2;
        System.out.println("Insira a cor do robo1(■) e do robo2(O)");
        cor1=input.next();
        cor2=input.next();
        Robo robo=new Robo(cor1);
        Robo robo2=new Robo(cor2);
        System.out.println("|Insira a posição da fruta(posições 0-4)|");
        int frutaX=input.nextInt();
        int frutaY=input.nextInt();
        ambiente.matriz(frutaX,frutaY,0,0,0,0);
        int roboX=0,roboY=0,robo2X=0,robo2Y=0,contMov1=0,contMov2=0;//contmov = contador de movimentos   
        do{
            System.out.println("----------------------------");
            System.out.println(robo.getCor());
            if(robo.comeufruta(frutaX,frutaY)==true && robo2.comeufruta(frutaX,frutaY)==true){
                System.out.println("Empate, foram realizados "+contMov1+"movimentos pelo"+robo.getCor() +"e" +contMov2+ "movimentos pelo"+robo2.getCor());
                break;
            }
            try {
                robo.mover(robo.aleatorio());
            } catch (MovimentoInvalidoException e) {
                e.printStackTrace();
            }
            contMov1++;
            roboX=robo.getX();
            roboY=robo.getY();
            ambiente.matriz(frutaX,frutaY,roboX,roboY,robo2X,robo2Y);
            ambiente.mostrarMatriz();

            System.in.read();//comando para pausar o programa no meio, usar apenas para testes do programa

            System.out.println(robo2.getCor());
            if(robo.comeufruta(frutaX,frutaY)==true){
                System.out.println(robo.getCor()+" ganhou com "+contMov1+" movimentos");
                break;
            }
            try {
                robo2.mover(robo2.aleatorio());
            } catch (MovimentoInvalidoException e) {
                e.printStackTrace();
            }
            contMov2++; 
            robo2X=robo2.getX();
            robo2Y=robo2.getY();
            ambiente.matriz(frutaX,frutaY,roboX,roboY,robo2X,robo2Y);
            ambiente.mostrarMatriz();
            if(robo2.comeufruta(frutaX,frutaY)==true){
                System.out.println(robo2.getCor()+" ganhou com "+contMov2+" moviementos");
                break;
            }

        }while(true);
        input.close();
    }
}