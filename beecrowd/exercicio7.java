import java.util.Scanner;

// lidar com tempo -> converte tudo para mesma unidade
//inicio -> minutosInicio = (h1 * 60) + m1
// mesma coisa para o final
// se minutosAlarme for menor que minutos inicio -> significa que o alarme tocara no dia seguinte, entao preciso somar as 1440 min do dia seguinte
// diferenca = (1440 - minutos inicio) + minutos alarme
public class exercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h1,m1,h2,m2;
        h1 = sc.nextInt();
        m1 = sc.nextInt();
        h2 = sc.nextInt();
        m2 = sc.nextInt();
        while(h1 != 0){
            int minutosInicio = h1 * 60 + m1;
            int minutosAlarme = h2 * 60 + m2;
            int minutosSono;
            if(minutosAlarme <= minutosInicio){
                // alarme no dia seguinte, um dia depois(somar 1 dia)
                minutosSono = (1440 - minutosInicio) + minutosAlarme;
            } else{
                minutosSono = minutosAlarme - minutosInicio;
            }
            System.out.println(minutosSono);
            h1 = sc.nextInt();
            m1 = sc.nextInt();
            h2 = sc.nextInt();
            m2 = sc.nextInt();
        }
        sc.close();
    }
}
