public class Sentenciaif {


    public void examenaprobado(int nota) {
        System.out.println("procedemos a evaluar si un examen esta ok");
        System.out.println("la nota que vamos a evaluar es " + nota);
        if (nota >= 5) {
            System.out.println("el examen esta aprobado");
        } else {
            System.out.println("el examen esta suspenso");

        }
        System.out.println("terminando la evaluacion del examen");
        System.out.println("programa finalizado");

    }

    public void notaexamen(int nota) {

        if (nota > 0 && nota <= 10) {

            if (nota < 5) {
                System.out.println("el examen esta suspenso");
            } else if (nota < 8) {
                System.out.println("el examen esta aprobado");
            } else if (nota < 9) {
                System.out.println("el examen es notable");
            } else if (nota < 10) {
                System.out.println("el examen es sobresaliente");

            } else {
                System.out.println("la nota no esta en la escala correcta");
            }
        }


    }
}
