package Reversmethod;

/**
 * Created by aamer ali on 13/02/21.
 */
public class Reversmethod {
    static int[] a ={9,5,7,4,2,5,3};


    public void Revers(int[] a) {
        int x = a.length-1;
        for (int i =0; i<a.length/2 ;i++){

            int temp =a[i];
            a[x]=temp;
            x--;
        }

    }


    public void print() {


        for (int i = 0; i<a.length; i++)
        {
            System.out.println(a[i]+"  ");

        }
        System.out.println("\n\n");


}

    public static void main(String[] args) {

        Reversmethod r=new Reversmethod();
        System.out.println("#Before : ");
        r.print();
        System.out.println("#After  : ");
        r.Revers(a);
        r.print();
    }
    }
