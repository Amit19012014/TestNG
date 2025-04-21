package LearningJAVA.Array;

public class ObjectArray {
    public static void main(String[] args) {
        Object a[] = {100,10.5,'A',"Welcome",true}; //Hetrogeneous data
        for (Object a1:a){
            System.out.println(a1);
        }
        System.out.println("====================");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
