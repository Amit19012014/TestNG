package JAVAProgramming.Day1;
import java.util.Arrays;
import java.lang.reflect.Array;

public class P016CheckTheEqualityOfTwoArrays {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int b[] ={1,2,3,4,5};

        //Approach 1
//        boolean status = Arrays.equals(a,b);
//        if(status==true){
//            System.out.println("Arrays are equal");
//        }
//        else {
//            System.out.println("Arrays are not equal");
//        }
        //Approach 2

        boolean status = true;

        if (a.length == b.length){
            //compare rest of element
            for (int i=0; i<a.length;i++){
                if (a[i]!=b[i])
                {
                    status = false;
                }
            }
        }
        else {
            status = false;
        }
        if (status == true){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }




    }
}
