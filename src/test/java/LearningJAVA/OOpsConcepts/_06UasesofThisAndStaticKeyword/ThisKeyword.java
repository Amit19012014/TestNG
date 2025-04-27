package LearningJAVA.OOpsConcepts._06UasesofThisAndStaticKeyword;

public class ThisKeyword {

    int x, y; //class variables or instance variables

//    ThisKeyword(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }

    void setData(int x, int y){
       this.x=x;
       this.y=y;
    }
    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {

//        ThisKeyword tk = new ThisKeyword(10,20);
        ThisKeyword tk = new ThisKeyword();
        tk.setData(100,200);
        tk.display();

    }
}
