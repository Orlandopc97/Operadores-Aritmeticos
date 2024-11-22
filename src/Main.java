import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float numero1, numero2, suma, resta, multiplicacion, division, resto;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa los numeros: ");

        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();

        //toma la ultima operacion
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("El suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicaion es: " + multiplicacion);
        System.out.println("La division es: " + division);
        System.out.println("El residuo de la division: " + resto);


        /*
        OPERADORES
            Es un simbolo especial que indica al compilador que debe efectuar una determinada operacion
        ASIGNACION
        ARITMETICAS       +(suma) -(resta) *(multiplicacion) /(division) %(modulo = resto(division))
        CONDICIONALES     &&(AND o y)   || (OR u o) !(NOT o negacion)
        RELACIONALES      ==(igual que)  >,<(mayor que, menor que)  >=,<=(mayor igual que, menor igual que  !=(distinto,diferente)
        OTRAS

        */


    }
}