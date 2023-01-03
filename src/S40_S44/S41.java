package S40_S44;

import java.util.Arrays;

public class S41 {
    /*
    Parametre olarak 2 Int Array kabul eden ve
    2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}
     */
    public static void main(String[] args) {
        int [] Input1={1,2,3,4};
        int [] Input2={5,6};

        arrayBirlestir(Input1,Input2);
    }

    private static void arrayBirlestir(int[] arr1,int[]arr2) {
        int [] yeniArray=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            yeniArray[i]=arr1[i];

        }
        for (int j = 0; j <arr2.length; j++) {
            yeniArray[arr1.length+j]=arr2[j];
        }
        System.out.println(Arrays.toString(yeniArray));

    }
}
