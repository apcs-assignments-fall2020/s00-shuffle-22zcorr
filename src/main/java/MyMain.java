import java.util.ArrayList;
import java.util.Arrays;
public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int half = arr.length/2;
        int[] half1 = new int[half];
        int[] half2 = new int[arr.length-(half)];
        int[] shuffle = new int[arr.length];
        for(int i = 0; i<half;i++){
            half1[i]=arr[i];
        }
        for(int i = half; i<arr.length;i++){
            half2[i-half]=arr[i];
        }
        int y = 0;
        for(int i = 0; i<arr.length-1;i++){
            shuffle[i]=half1[y];
            i+=1;
            shuffle[i]=half2[y];
            y+=1;
        }
        return shuffle;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        ArrayList<Integer> shuffle = new ArrayList<Integer>();
        ArrayList<Integer> clean = new ArrayList<Integer>();
        int[] shuffleArr = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            clean.add(arr[i]);
        }
        for(int j=arr.length-1;j>-1;j--){
            int randomPick = (int)(Math.random()*j);
            shuffle.add(clean.get(randomPick));
            clean.remove(randomPick);
        }
        for(int k=0;k<arr.length;k++){
            shuffleArr[k]=shuffle.get(k);
        }
        return shuffleArr;
    }


    public static void main(String[] args) {
        int[] test1= new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        System.out.println(Arrays.toString(perfectShuffle(test1)));
        System.out.println(Arrays.toString(selectionShuffle(test1)));


    }
}
