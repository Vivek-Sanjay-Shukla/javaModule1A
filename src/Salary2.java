public class Salary2 {

    public static void main(String []args){

        float basic = 25000;
        float DA,HRA,CCA,PF,PT;
        float gross,net;

        DA = (float)(0.7*basic);
        HRA = (float)(0.3*basic);
        CCA = 240;

        gross = DA+HRA+CCA+basic;
        net = gross - (float)(0.1*basic) - 100;
        System.out.println("gross = "+gross+"  net = "+ net);


    }

}
