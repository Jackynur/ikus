public class demoConv {

    private double meter;

    demoConv(double meter){
        this.meter = meter;

    }

    public double convCM(){
        return meter*100;
    }

    public double convMM(){
        return meter*1000;
    }

    public void dispConv(){
        System.out.println(meter+" meter ="+convCM()+" cm ="+convMM()+" mm");
    }

    public static void main(String[] args) {
        demoConv obj = new demoConv(1);
        obj.dispConv();
    }


}