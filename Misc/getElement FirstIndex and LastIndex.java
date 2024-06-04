public class JavaMain {

    public static void main(String[] args){
        System.out.println("Inside Main Method");

        int arr[] = {1,2,2,2,2,3,4,7,8,8,1};

            int maxValue = Integer.MIN_VALUE;
            int minValue = Integer.MAX_VALUE;
            int range = 0;

            int firstIndex[] = new int[100];
            int[] lastIndex = new int[100];

            for(int i =0 ; i <arr.length;i++ ){
                firstIndex[i] = -1;
            }

            for(int i =0 ; i< arr.length; i++){
                int element = arr[i];
                if(firstIndex[element] == -1){
                    firstIndex[element] = i;
                }
                lastIndex[element] = i;
            }

            for(int i = 0 ; i <arr.length; i++){
                int element = arr[i];
                if(firstIndex[element] != -1){
                    System.out.println("element + firstIndex + lastIndex"+element+ " "+firstIndex[element]+ " "+lastIndex[element]);
                    firstIndex[element] = -1;
                }
            }
       }

}
