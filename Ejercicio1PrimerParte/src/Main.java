public class Main {
    public static void main(String[] args) {

        //asignamos las variables
        int a=2;
        int b=13;
        int c=20;


        System.out.println(sum(a,b,c));

        Coche miCoche= new Coche();
        miCoche.addPuertas();
        System.out.println("Mi coche tiene "+ miCoche.getPuertas() + " puertas");


    }
    public static int sum(int a, int b, int c){
        int res=0;
        res= a+b+c;
        return res;
    }
}