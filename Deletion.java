public class Deletion {
    public static void main(String[] args) {
        int arr[] = {40,50,60,70,80};

        int indexPosition = 4;
        int[] newArray = new int[arr.length-1];

        int j=0;

        for(int i=0; i<arr.length; i++){
            if(i==indexPosition){
                continue;
            }
            newArray[j] = arr[i];
            j++;
        }
        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }
    
}
