public class Exercise1{
    public static void main(String[] arg){
         
       /**  for(int i=0;i<10;i++){
            System.out.println("Good morning");
        }*/
    Monday obj1 = new Monday();
    Tuesday obj2 = new Tuesday();
    obj1.start();
    obj2.start();

    obj1.setPriority(0);
    obj2.setPriority(1);
    
    
        }
        

}
 class Monday extends Thread{
    public void run(){  
        for(int i=0;i<10;i++){
            System.out.println(i+1+"."+"Monday");
            try{
                Thread.sleep(1000);
            }

                catch(Exception e){

                }
            }
        }    
    }
        
 class Tuesday extends Thread {
    public void run(){
        for(int i=0;i<10;i++){  
        System.out.println(i+1+"."+"Tuesday");
    }
}

        }