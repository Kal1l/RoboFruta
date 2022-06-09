import java.util.Scanner;
import exception.*;
import game.*;
public class App {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Ambiente ambiente=new Ambiente();
        String cor=input.next();
        Robo robo=new Robo(cor);
        System.out.println("Insira a posição da fruta(posições 0-4)");
        //coordenadas das fruta geradas no próprio main
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
        //Matriz inicial do programa
        ambiente.matriz(frutaX,frutaY,0,0);
        ambiente.mostrarMatriz();
        String movimento; //variável pro scanner de movimento
        int roboX;int roboY;
        //loop do jogo
        do{
           movimento=input.next();
            try {
                robo.mover(movimento);
            } catch (MovimentoInvalidoException e) {
                System.out.println(e);
            }
            //coordenadas do robô são puxadas da própria classe robô
            roboX=robo.getX();
            roboY=robo.getY();
            //matriz ambiente
            ambiente.matriz(frutaX,frutaY,roboX,roboY);
            ambiente.mostrarMatriz();
        }while(robo.comeufruta(frutaX,frutaY)==false);//condição para o fim do jogo: persongaem alcançar a coordenada da fruta
        System.out.println("Você ganhou!");
        input.close();
    }
}