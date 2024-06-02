public class JavaMain {

    public static void main(String[] args){
        System.out.println("Inside Main Method");

        int arr[] = {1,2,2,2,2,3,4,7,8,8,1};

            int maxValue = Integer.MIN_VALUE;

               for(int a : arr){
                  if(a>maxValue)
                    maxValue = a;
               }
             int[] firstIndex = new int[maxValue+1];
             int[] lastIndex = new int[maxValue+1];

             for(int i=0; i <maxValue; i++){
                 firstIndex[i] =  -1;
                 System.out.println("firstIndex "+firstIndex[i]);
             }

            for(int i = 0; i <arr.length; i++) {
                int element = arr[i];

                    if(firstIndex[element] == -1){
                       firstIndex[element] = i;
                       System.out.println("firstIndex "+firstIndex[element]);
                     }
                lastIndex[element]= i;
            }

            for(int i =0; i <arr.length; i++){
                if(firstIndex[i] != -1) {
                    System.out.println("element +  firstIndex + LastIndex " + " " +i+ " "  + firstIndex[i] + " " + lastIndex[i]);
                }
            }
       }
   }
