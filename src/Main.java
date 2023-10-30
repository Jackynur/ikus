public class Main {

    private double angka1;
    private double angka2;


    public Main(double a, double b) {
        angka1 = a;
        angka2 = b;
    }



    public double tambah() {
        return angka1 + angka2;
    }



    public static void main(String[] args) {
        Main kalkulator = new Main(10, 5);
        System.out.println("Hasil Penambahan: " + kalkulator.tambah());

    }
}

