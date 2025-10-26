public class SearchingArray {
    public static void main(String[] args) {
        // int arr[] = {30,40,50,60};
        //  int element = 60;
        //  for(int i=0; i<arr.length; i++){
        //     if(arr[i]==element){
        //         System.out.println("Element is find the  " + i + " index ");
        //         break;

        //     }else{
        //         System.out.println("Element is Not Found ");
        //         break;
        //     

        int arr[] = {20,56,78,54,32};
        int element = 32;
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==element){
                System.out.println("Element is found " + i + " index postions");
                found = true;
            }
        }

        if(!found){
             System.out.println("Element is Not Found ");
        }
    }
}
