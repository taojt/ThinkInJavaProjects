package c08;

/**
 * Created by taojt on 2016/7/4.
 */

class Wheel{}

public class ArraySize {
    public static void main(String[] args){
        Wheel[] a;
        Wheel[] b = new Wheel[5];
        Wheel[] c = new Wheel[4];
        for (int i = 0;i<c.length;i++){
            c[i] = new Wheel();
        }
        System.out.println(b.length);

        System.out.println(c.length);
        for (int i =0;i < b.length;i++){
            System.out.println("b[" + i + "] = " + b[i]);
        }
        for(int i =0;i< c.length;i++){
            System.out.println("c[" + i+ "] = " + c[i]);
        }

    }

}
