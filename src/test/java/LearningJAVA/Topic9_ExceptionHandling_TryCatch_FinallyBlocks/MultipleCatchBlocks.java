package LearningJAVA.Topic9_ExceptionHandling_TryCatch_FinallyBlocks;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Program is started");

        String s = null;

//       try {
//            System.out.println(s.length());
//        } catch (ArithmeticException e) {
//            System.out.println("handled Exception");
//            System.out.println(e.getMessage());
//        } catch (NullPointerException e) {
//            System.out.println("handled Exception");
//            System.out.println(e.getMessage());
//        } catch (NumberFormatException e) {
//            System.out.println("handled Exception");
//            System.out.println(e.getMessage());
//        }

        try {
            System.out.println(s.length());
        }catch (Exception e){
            System.out.println("handled Exception");
            System.out.println(e.getMessage());
        }

        System.out.println("Program finished");
    }
}
