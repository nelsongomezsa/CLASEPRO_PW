import java.util.Scanner;

public class Operadores {

    public void cambiodetipos() {

        double numerodecimal = 5.98;
        int numeroentero = 7;

        //System.out.println((int)numerodecimal);
        //System.out.println((double) numeroentero);
        String palabra = "12";
        int numeropalabra = Integer.valueOf(palabra);


        String palabrabool = "true";
        boolean palabraboolean = Boolean.parseBoolean(palabrabool);

        System.out.print(palabraboolean);

    }

        public void ejercicionotion4tema2(){


            Scanner scanner= new Scanner(System.in);
            System.out.print("que numero quieres comprobar si es par");
            int numero= scanner.nextInt();
            boolean numeroPar= numero % 2 ==0;
            System.out.printf("el numero %d es par: %b %n",numero,numeroPar);





            scanner.close();
        }

        public void ejercicionotio10tema2(){


        Scanner scanner= new Scanner(System.in);
        System.out.println("indica el salario base");
        int salariobasehora=scanner.nextInt();
        System.out.println("indica horas trabajadas");
        int horastrabajadas=scanner.nextInt();
        System.out.println("has realizado horas extras");
        boolean horasextras= scanner.nextBoolean();
        //60 horas



         boolean condicionextras=horastrabajadas>40 && horasextras;
         //si conidicionextras es true
          int horasextrastotal=horastrabajadas-40;
          int salariobase=40*salariobasehora;
          int salariobaseextra= horasextrastotal*salariobase*2;
          int salariototal=salariobase+salariobaseextra;
          System.out.println("has cobrado un total de "+salariototal);
          System.out.println("has cobrado un base de  "+salariobase);
          System.out.println("has cobrado un extra de  "+salariobaseextra);

          public void ejercicio3() {
                //79050
            Scanner scanner= new Scanner(System.in);
            System.out.println("indica un numero de 5 digitos");
            int numeroanalizar: scanner.nextInt();
            if (numeroanalizar>9999 && numeroanalizar<1000) {
            } else {
                System.out.println("numero incorrecto");}
                {
                String numeropalabra = String.valueOf(numeroanalizar);
                char decenasdemil = numeropalabra.charAt(0);
                    char decenasdemil = numeropalabra.charAt(1);
                    char decenasdemil = numeropalabra.charAt(2);
                    char decenasdemil = numeropalabra.charAt(3);


            }


          }



        }


}

