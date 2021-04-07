/**
 * Created by aamer ali on 13/02/21.
 */
public class Clonemethod {
    static int [] a = {7,2,4,1,5,3};
    int [] Backup ;

    public void Clonemethod (int [] s)
    {
        for (int i=0;i<a.length;i++)
        {
            Backup[i]=a[i];
        }
    }

    public void print()
    {
        for (int i=0;i<Backup.length;i++)
        {
            System.out.println(Backup[i]+"  ");
        }
    }


    public static void main(String[] args) {
        System.out.println("original array : ");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]+"  ");
        }
        System.out.println("\n\nBackup array : ");
        Clonemethod c=new Clonemethod();
        c.Clonemethod(a);
        c.print();
    }
}
