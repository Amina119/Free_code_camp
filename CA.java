public class CA {
    public static void main(String args[]){

        TeacherAnnouncement teacher = new TeacherAnnouncement();
        StudentAnnouncement student = new StudentAnnouncement();
        AdminAnnouncement admin = new AdminAnnouncement();

        admin.start();
        teacher.start();
        student.start();
        

        admin.setPriority(1);
        teacher.setPriority(2);
        student.setPriority(3);
       
    }
    
}
class AdminAnnouncement extends Thread{
    public void run(){ 
    for(int i=0;i<5;i++){
        System.out.println("Admin"+"School meeting at 2PM");
        try{
                Thread.sleep(500);
            }

                catch(Exception e){
    }
}
    }

}
class TeacherAnnouncement extends Thread{
    public void run(){ 
    for(int i=0;i<5;i++){
        System.out.println("Teacher:"+"Class will start soon");
        try{
                Thread.sleep(500);
            }

                catch(Exception e){

    }
    }
}
}
class StudentAnnouncement extends Thread{
    public void run(){ 
    for(int i=0;i<5;i++){
        System.out.println("Student:"+"Submitting assignment ");
        try{
                Thread.sleep(500);
            }

                catch(Exception e){
                }
    }
}
}