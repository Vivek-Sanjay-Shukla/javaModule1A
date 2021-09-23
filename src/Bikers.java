public class Bikers {

    public static void main(String []args){

     float racer1 = 100,racer2 =300,racer3=150,racer4=500,racer5=250;

     float average = (racer1+racer2+racer3+racer4+racer5)/5;

        System.out.println("average is "+ average);

      if(racer1>average){
          System.out.println("racer1 qualified");
      }
        if(racer2>average){
            System.out.println("racer2 qualified");
        }
        if(racer3>average){
            System.out.println("racer3 qualified");
        }
        if(racer4>average){
            System.out.println("racer4 qualified");
        }
        if(racer5>average){
            System.out.println("racer5 qualified");
        }



    }
}
