public class Operaciones {

    public static void sumar(int op1, int op2) {
        int resultado = op1 + op2;
        System.out.println("el resultado de la suma es " + resultado);
    }
    //ojo al poner privado o publico o protected cambia mucho probar si no te acuerdas

    protected void restar(int op1, int op2) {
        int resultado = op1 - op2;
        System.out.println("el resultado de la resta es " + resultado);
    }
}