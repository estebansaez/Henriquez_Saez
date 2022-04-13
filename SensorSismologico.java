import java.util.Scanner;

public class SensorSismologico {

    public static void main(String[] args){
        System.out.println(lectura());
        matriz();
    }

    public static int[][] matriz(){
        int matriz[][] = new int[cantidadDias()][24];
        llenarMatriz();
        return matriz;
    }
    public static double lectura(){
        double decimal=(Math.random()*9.5+1);
        double generarLectura=(Math.round(decimal*100.0)/100.0);
        return generarLectura;
    }

    public static void masIntenso() {
            int[][] matriz = {{45, 66, 75}, {41, 99, 69}, {17, 28, 39}};
            int numeroMayor = matriz[0][0];
            String mayorPosicion = "0,0";
            for(int x = 0; x < matriz.length; x++) {
                for (int y = 0; y < matriz[x].length; y++) {
                    if (matriz[x][y] > numeroMayor) {
                        numeroMayor = matriz[x][y];
                        mayorPosicion = x + "," + y;
                        System.out.println("la posision: "+"("+ mayorPosicion +")"+ " y la intensidad fue " +numeroMayor);
                    }
                }
            }
    }

    public static int cantidadDias() {
        System.out.println("Ingrese los dias a registrar: ");
        int n;
        n = scanner();

        if(n<2 || n>31) {
            System.out.println("Error, ingrese los datos nuevamente");
        }
        return n;
    }
    public static int scanner(){
        Scanner teclado=new Scanner(System.in);
        int entrada;
        entrada = teclado.nextInt();
        return entrada;
    }
    public static void  mostrarMatriz(){
        int [][] matriz= new int[3][3];
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[x][y]);
            }
        }
    }
    public static double [][] llenarMatriz(){
        double [][] matriz= new double[3][3];
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                matriz[x][y] = lectura();
                System.out.print ("["+matriz[x][y]+"]");
            }
        }
        return matriz;
    }
}
