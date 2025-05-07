package LearningJAVA.ExceptionHandling_TryCatch_FinallyBlocks;

public class FinallyBlockDemo {
    public static void main(String[] args) {

        String s = "welcome";

//        Exception occurred, catch block handled
//        Exception occurred, catch block NOT handled
//        Exception does not occur, catch block ignored
        try {
            System.out.println(s.length());
        } catch (NullPointerException e){
            System.out.println("Catch block handled Exception");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("you entered into finally block");
        }

        System.out.println("Program finished");
    }
}
