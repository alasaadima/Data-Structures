/**
 * Created by aamer ali on 24/02/21.
 */
public class scores {
    public static final int maxentries =  10;
    protected int numentries;
    protected int pr[]entries;
    public scores()
    {
        entries = new pr(maxentries);
        numentries =0;



    }
    public  String tostring()
    {
        String s= "[";
        for (int i =0;i<numentries;i++)
        {
            if (i >0)s +=",";
            s+= entries[i]
        }
        return s + "]";

    }
    public void add(pr e){
        int newscores = e.getScore();
        if (numentries == maxentries){
            if (newscores <=entries[numentries-1].getScore())
                return;
        }
        else
            numentries++;
        int i =numentries-1;
        for ( ;(i >= 1)&&(newscores > entries[i-1].getScore());i--){
            entries [i] = entries [i -1];

            entries [i] = e;
        }
        public static void insertionsort(char[] a ){
        int n = a.length;
        for (int i =1;i<n;i++){
            char cur =a[i];
            int j = i-1;
            while ((j >= 0) && (a[j] > cur))
                a[j+1] = a[j--];
            a[j + 1] =cur;
        }
    }
    }


