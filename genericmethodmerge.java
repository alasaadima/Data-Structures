import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by aamer ali on 27/02/21.
 */
public class genericmethodmerge {
    public static <T> void reveres(T[] arr){
        int n=arr.length-1;
        for (int i =0;i<arr.length/2;i++){
            T a=arr[i];
            arr[i]=arr[n];
            arr[n]=a;
            n--;
            System.out.println(arr[i]);
        }
    }
    public static <e> void merge (e a[],e b[]){
        ArrayList<e> m= new ArrayList<>();
        for (int i =0;i <a.length;i++)
        {
            m.add(a[i]);
        }
        for (int i=0;i<b.length;i++){
            m.add(b[i]);
        }
        System.out.println(Arrays.toString(a)+"    ");
        System.out.println(Arrays.toString(b)+"    ");
        System.out.println("/t/t/t/t/t/t after :");
        System.out.println(m.toString());

    }

    public static void main(String[] args) {
        Integer a[]={11,12,13,14,15};
        String B[]={"amer","Ali","Almaidee"};


        merge(a,a);
        
    }
}
