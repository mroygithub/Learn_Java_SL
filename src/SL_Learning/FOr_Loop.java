package SL_Learning;

public class FOr_Loop {


    // First Learn IF-ELSE bock ...



     int  FIrst_Class = 800 ;
     int  Pass_Mark = 300 ;

    public static void main(String args[]) throws Exception{


        FOr_Loop obj = new FOr_Loop();


       obj.run_A_For_Loop(500);

    }



    public void run_A_For_Loop(int theMaxNum){

        for(int i=1 ; i<=theMaxNum ; i++){

            System.out.println("The Number Is ==>"+i);
        }


    }













}
