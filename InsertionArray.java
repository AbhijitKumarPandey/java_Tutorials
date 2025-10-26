public class InsertionArray {
     public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};

        int indexPosition = 2;
        int element = 100;

        // 1 step
        int[] newArray = new int[arr.length+1];
       
        // 2 step  copy paste 
        for(int i=0; i<indexPosition; i++){
            newArray[i] = arr[i];
        }

        // step 3 
        newArray[indexPosition]=element;

        // 4 step 
        for(int i=indexPosition; i<arr.length; i++){
            newArray[i+1] = arr[i];
        }


      //  for(int no:newArray){
      for(int i=0; i<newArray.length; i++){
            System.out.println(newArray[i] + " ");
        }
        }
     }
    

