public class Main {

    public static void main(String[] args) {
        System.out.println("proyecto metodos");
        System.out.println("vamos a realizar llamadas a metodos");
        saludar("laura");
        despedir("luis");
        //Operaciones.sumar(4,4);
        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(1,4);
        operacionesMatematicas.restar(1,2);



    }

    public static void saludar( String nombre ){
        System.out.println("hola "+nombre);
        System.out.println("encantado de saludarte");
        System.out.println("vamos a practicar el llamado de metodos");
    }
    public static void despedir(String datos){
        System.out.println("adios "+datos);

    }
}
