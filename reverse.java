/**
 * Created by aamer ali on 27/02/21.
 */
interface reverse <T> {
    static Integer[] intarr={1,2,3,4,5};
    static double[] doublearr = {1.2,1.6,1.6,5.6};
    static Character [] chararr = {'a','a','m','p','l','e'};
    static  String [] strarr={"Amer","Ali","Almaidee"};
    static float[] floatarr = {1.2f,1.6f,1.6f,1.5f};


    public static <T> void genericreverse(T[] array){
        int x = array.length -1;
        for (int i =0;i < array.length/2;i++){
            T temp = array[i];

            array[i]=array[x];
            array[x]=temp;
            x--;
        }
    }
    public static <a> void print(a[]array){


        System.out.println("[");
        for (int i=0;i<array.length ;i++){
            if (i<array.length -1)
                System.out.println(array[i]+"   ");
            else
                System.out.println(array[i]+"]");
        }
    }

    public static void main(String[] args) {
        print(intarr);
        genericreverse(intarr);
        genericreverse(chararr);
        System.out.println();
        print(intarr);
        print(chararr);
    }
}

