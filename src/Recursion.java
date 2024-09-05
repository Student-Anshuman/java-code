import java.util.*;
public class Recursion {                  //fxn that call itself

                                  // example 1
   //stack height=logn
//    public static int calXpowN(int x,int n) {
//       if(x==0){
//           return 0;
//       }
//       if(n==0) {
//           return 1;
//       }
//       //  n is even
//        if(n % 2 == 0){
//            return calXpowN(x,n/2) * calXpowN(x,n/2);
//        }else{ // n is odd
//            return calXpowN(x,n/2) * calXpowN(x,n/2) * x;
//        }
//
//
//   }

//   public static void main(String args[]){
//       int x=2,n=6;
//       System.out.println(calXpowN(x,n));

                                  //example 2
                                         //tower of hanoi  and time complaxity == O(2 pow n - 1)==~ O(2 pow n)
//    public static void towerOfHanoi(int n, String src,String helper, String dest){
//        if(n==1){
//            System.out.println("transfer  "+ n +" from "+ src+" to "+ dest);
//            return;
//        }
//        towerOfHanoi(n-1, src, dest, helper);
//        System.out.println("transfer disk " + n +" from "+ src+" to"+ dest);
//        towerOfHanoi(n-1, helper, src, dest);
//    }


//    public static void main(String args[]){
//        int n = 3;
//        towerOfHanoi(n, "S", "H", "D");



                                   //example 3          print a string in reverse
//    public static void printReverse(String str, int idx){
//        if(idx==0){
//            System.out.println(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        printReverse(str, idx-1);
//    }
//
//    public static void main(String args[]){
//      String str = "abcd";
//        printReverse(str,str.length()-1);

                                         //example 4   find  first and last occurance of given letter in a string
//    public static int firstOcc = -1;
//    public static int lastOcc = -1;
//    public static void findOcc(String str, int idx, char element){
//        if(idx==str.length()){
//            System.out.println(firstOcc);
//            System.out.println(lastOcc);
//            return;
//        }
//        char currentChar=str.charAt(idx);
//        if(currentChar==element){
//            if(firstOcc==-1){
//                firstOcc=idx;
//            }else{
//                lastOcc=idx;
//            }
//        }
//        findOcc(str, idx+1, element);
//    }
//
//    public static void main(String args[]){
//        String str = "abaacdaefaahf";
//        findOcc(str, 0, 'f');

                                       //example 5
//    public static boolean isShorted(int arr[], int idx) {
//        if (arr[idx] == arr.length-1) {
//            return true;
//        }
//
//        if (arr[idx] < arr[idx + 1]) {
//           return isShorted(arr, idx + 1);
//        } else {
//            return false;
//        }
//    }
//    public static void main(String args[]){
//        int arr[] = {3,6,8,9,6,5};
//        System.out.println(isShorted(arr,0));

                               //   example 6
//    public static void moveXtogeather(String str,int idx, int count, char element, String newStr){
//       if(idx==str.length()){
//           for(int i = 0; i < count; i++){
//               newStr += element;
//           }
//           System.out.println(newStr);
//           return;
//       }
//
//        char currentChar = str.charAt(idx) ;
//       if(currentChar == element){
//           count++;
//           moveXtogeather(str, idx+1, count, element,newStr);
//       }else{
//           newStr += currentChar;
//           moveXtogeather(str, idx+1, count, element, newStr);
//       }
//
//    }
//
//    public static void main(String args[]){
//       String str = "acxbxpxcx" ;
//       moveXtogeather(str, 0, 0, 'c', "");
                                        // example 7 remove duplicates         **important**
//    public static boolean [] map = new boolean[26];
//    public static void removeDup(String str,int idx, String newStr){
//        if(idx==str.length()){
//            System.out.println(newStr);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if(map[currChar - 'a'] == true){
//            removeDup(str,idx+1,newStr);
//        }
//        else{=
//            newStr+=currChar;
//            map[currChar-'a']=true;
//            removeDup(str,idx+1,newStr);
//        }
//
//    }
//
//    public static void main(String args[]){
//        String str = "aaaaaaaa";
//        removeDup(str,0,"");

                                                           //example 8 Subsequences    ***important ***learn
    public static void printSubsequences(String str,int idx,String newStr){
      if(idx==str.length()){
          System.out.println(newStr);
          return;
      }
        char currChar = str.charAt(idx) ;
      //to be
        printSubsequences(str,idx+1,newStr+ currChar);

        //or to not be
        printSubsequences(str,idx+1,newStr);

    }

    public static void main(String args[]){
        String str= "abc";
        printSubsequences(str,0,"");
    }
}
