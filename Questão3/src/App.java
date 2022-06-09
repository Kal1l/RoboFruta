import java.util.Scanner;
import game3.*;
import exception.*;
import java.io.IOException;
public class App {
    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        Ambiente ambiente=new Ambiente();
        String cor1,cor2;
        System.out.println("Insira a cor do robo1(■) e do robo2(O)");
        cor1=input.next();
        cor2=input.next();
        Robo robo=new Robo(cor1);
        RoboInteligente robo2=new RoboInteligente(cor2);
        int frutaX, frutaY;
        System.out.println("Insira a posição da fruta(posições 0-4)");
        frutaX=input.nextInt();
        frutaY=input.nextInt();
        boolean verificador = true;
        while(verificador){
            if(frutaX > 5 || frutaY > 5 || frutaX < 0 || frutaY < 0){
                System.out.println("Posição invalida ,coloque de novo");
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
                System.out.println("Robô "+robo.getCor()+", "+e);
            }
            contMov1++;
            roboX=robo.getX();
            roboY=robo.getY();
            ambiente.matriz(frutaX,frutaY,roboX,roboY,robo2X,robo2Y);
            ambiente.mostrarMatriz();

            //System.in.read();//comando para pausar o programa no meio, usar apenas para testes do programa

            System.out.println(robo2.getCor());
            if(robo.comeufruta(frutaX,frutaY)==true){
                System.out.println(robo.getCor()+" ganhou");
                break;
            }
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
                System.out.println(robo2.getCor()+" ganhou");
                break;
            }
            else if(robo.comeufruta(frutaX,frutaY)==true && robo2.comeufruta(frutaX,frutaY)==true){
                System.out.println("Empate");
                break;
            }

        }while(true);
        System.out.println("Robô normal fez: "+contMov1+" movimentos;\0Robô inteligente fez: "+contMov2+" movimentos;");
        input.close();
    }
}