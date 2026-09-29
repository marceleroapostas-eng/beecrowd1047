
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int horaInicio = leitor.nextInt();
        int minutoInicio = leitor.nextInt();
        int horaFim = leitor.nextInt();
        int minutoFim = leitor.nextInt();

        int hora;
        int minuto;

       hora = horaFim - horaInicio;
       minuto = minutoFim - minutoInicio;
       
       if (minuto < 0) {
           minuto = minuto + 60;
           hora--;
       }
       
       if (hora < 0) {
           hora = hora + 24;
       }
       
       if (hora == 0 && minuto == 0) {
           hora = 24;
       }
        System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minuto + " MINUTO(S)");

        leitor.close();
    }
}
