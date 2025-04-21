package JAVAProgramming.Day1;

public class P014FindSumofElementsinArray {
    public static void main(String[] args) {
        int a[] = {1, 10, 3, 4, 5};
        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum = sum + a[i];
//        }

        //Enhanced foe loop
        for (int value:a){
            sum= sum+value;
        }
        System.out.println(sum);
    }
}
