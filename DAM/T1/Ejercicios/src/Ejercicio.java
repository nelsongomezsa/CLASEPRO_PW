import java.util.Scanner;

public class Ejercicio {

    private Scanner lecturateclado;

        /*Hágase una aplicación que permita introducir el número de bebidas y bocadillos
comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00
€). También se podrá introducir el número de alumnos que realizaron la compra
(valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
redondeada a 2 decimales. (CosteBar)

     */
public void ejercicio1(){
    // 1.introducir valores
    //2.guardar en variables
    lecturateclado = new Scanner(System.in);
    System.out.println("cuantos bocatas vais a pedir");
    int numerodebocatas=lecturateclado.nextInt();
    System.out.println("cuantos bebidas vais a pedir");
    int numerobebidas=lecturateclado.nextInt();
    System.out.println("cuantos cuesta cada bocatas");
    double preciobocata=lecturateclado.nextDouble();
    System.out.println("cuantos cuesta cada bebida");
    double preciobebida=lecturateclado.nextDouble();
    System.out.println("cuantos personas entran en la cuenta");

    int personas=lecturateclado.nextInt();
     //3.realizar una serie de calculos
    double preciobocatas = numerodebocatas*preciobocata;
    double preciototalbebidas =numerobebidas*preciobebida;
  double costetotal= preciobocatas+preciototalbebidas;
          double preciopersona = costetotal/personas;
    //4.mostrar datos
    System.out.println("el precio de los bocatas es "+preciobocatas);
    System.out.println("el precio de las bebidas es "+preciototalbebidas);
    System.out.println("el coste total es "+costetotal) ;
    System.out.println("el precio por persona es "+preciopersona) ;
    lecturateclado.close();
    lecturateclado= null;
}

public void ejercicio4(){
    lecturateclado= new Scanner(System.in);
  //1.pedir datos
System.out.println("cuantos segundos quieres pasar a tiempo");
int segundostotal = lecturateclado.nextInt();
  //2.realizar los calculos
    int horas=segundostotal/3600;
    int minutos=(segundostotal%3600)/60;
    int segundos= segundostotal%60;
  //3.mostrar datos
    System.out.println("El numero de horas es "+horas);
    System.out.println("El numero de minutos es "+minutos);
    System.out.println("El numero de segundos es "+segundos);

    lecturateclado.close();
    lecturateclado=null;





}
}
