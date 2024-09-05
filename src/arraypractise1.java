import java.util.*;

public class arraypractise1 {


    public void findMax(){
        int arr[] = {12,13,32,11,16,32};
//        int max = 0;
//        for(int i=0; i<arr.length; i++){          // find max value
//            if(max <arr[i]){
//                max = arr[i];
//
//            }
//        }
//        for(int i=0; i<arr.length; i++){             // find index of max value
//            if(arr[i] == max){
//                System.out.println(i);
//            }
//        }
//        System.out.println(max);
        int x = 32;                                   // finding index of x if present in array otherwise return -1
        int ans = -1;
        for(int i=0; i< arr.length;i++){
            if(arr[i] == x){
                ans = i;
                break;                              //break for first comming x otherwise ans is assign last comming x
            }
        }
        System.out.println(ans);




    }

    public static void main(String[] args){
        arraypractise1 obj = new arraypractise1();
 /*     Scanner sc = new Scanner(System.in);
      int numb[]=new int[5];

      //input
        for(int i=0; i<5; i++){
            numb[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for(int i=0; i<5; i++){


            if(numb[i]==x){

                System.out.println(i);

            }
        }

  */
  //     obj.sumOfArray();
        obj.findMax();


    }
}
