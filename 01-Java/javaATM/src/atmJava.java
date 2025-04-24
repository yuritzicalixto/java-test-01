import java.util.Scanner;

public class atmJava {
    public static void main(String[] args) {
        String cliente = "Juan Perez";
        String tipoCuenta = "Corriente";
        double saldo = 1899.89;

        //Adiccionar los datos del cliente
        System.out.println("===============================");
        System.out.println("\nNombre del cliente: "+cliente);
        System.out.println("El tipo de cuenta es: "+tipoCuenta);
        System.out.println("El saldo disponible es de: $ "+saldo);
        System.out.println("\n===============================");

        //Menú de opciones
        String menu = """
                \n*** Escribe el numero de la opción deseada ***
                1.- Consultar saldo
                2.- Retirar efectivo
                3.- Depositar efectivo
                9.- Salir
                """;

        int opcion=0;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo disponibles es: $ "+saldo);
                    break;

                    
                case 2:
                    System.out.println("¿Cuánto deseas retirar? ");
                    double valorRetirado = teclado.nextDouble();

                    if ( valorRetirado > saldo){
                        System.out.println("Saldo insufiente");
                    } else {
                        saldo = saldo - valorRetirado;
                        System.out.println("El saldo actual es: $ "+saldo);
                    }
                    break;


                case 3:
                    System.out.println("¿Cuanto deseas depositar? ");
                    double valorDepositado = teclado.nextDouble();

                    saldo = saldo + valorDepositado;
                    System.out.println("Tu saldo actual es: $ "+saldo);
                    break;


                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;


                default:
                    System.out.println("Opción no valida");
            }
        }
    }
}
