class Solution {
    public List<String> fizzBuzz(int n) { String[] arr = new String[n];int a;
     
        for(int i =0 ;i < n;i ++){ 
            a =  i +1 ; 
            arr[i] = Integer.toString(a);
            if (a%3==0 && a%5==0){
                arr[i]= "FizzBuzz" ;

            }else if (a%3==0){
                arr[i] = "Fizz" ;

            }else if (a%5==0){
                arr[i] = "Buzz";
            }


        }  return Arrays.asList(arr) ;
        
    } 
}