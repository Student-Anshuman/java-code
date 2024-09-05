import java.util.*;
public class arraypratiseset1 {
    public static void main(String []args){
        //pratise problem 1
//       int []numbers= {43,56,89};
//        int sum=0;
//       for(int i=0; i<numbers.length; i++){
//
//           sum+=numbers[i];
//
//       }
//        System.out.println(sum);

        //pratise problem 2           sum of float numbers
//       float numbers[]={54.4f, 87.4f, 98.36f, 67.89f, 57.87f};
//       float sum=0;
//          for(int i=0;i<numbers.length;i++){
//            sum+=numbers[i];
//        }
//
//
//        System.out.println(sum);

        //pratice problem 3
//        int numbers[]={34,56,87,98,35,12,47,88,67,99,100};
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        boolean isInArray = false;
//        for(int element:numbers){
//            if(x==element){
//                isInArray = true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("given number is present in this array");
//        }else{
//            System.out.println("given number is not present in this array");
//        }

       // practise problem 4
        int phyMarks[]={99,98,99,97,98,88,89,90,99,100,96,};

        int sum=0;
        float average;
        for(int element:phyMarks){
            sum+=element;
            average=sum/phyMarks.length;
        }
        average=sum/phyMarks.length;
        System.out.println("average is:"+ average );

        //practise problem 5
//        Scanner sc=new Scanner(System.in);
//        int [][] mat1=new int[2][3];
//        int [][] mat2=new int[2][3];
//        int [][] matSum=new int[2][3];
//        //input of mat1
//        for(int i=0; i<2; i++){
//            for(int j=0; j<3; j++){
//                mat1[i][j]=sc.nextInt();
//            }
//        }
//        //input mat2
//        for(int i=0; i<2; i++){
//            for(int j=0; j<3; j++){
//                mat2[i][j]=sc.nextInt();
//            }
//        }
        //if matrix element is known then we can take  array element such type
//        int mat1[][]={{1,2,3},
//                       {3,2,1}};
//        int mat2[][]={{4,5,6},
//                       {6,5,4}};
//        int matSum[][]={{0,0,0},
//                        {0,0,0}};
//        //output sum of matrices
//        for(int i=0; i<2; i++){                  //2==mat1.length
//            for(int j=0; j<3; j++){              //3==mat1[i].length
//                matSum[i][j]=mat1[i][j] + mat2[i][j];
//                System.out.print(matSum[i][j] + " ");
//
//            }
//            System.out.println();
//        }

        /*int num[]={1,2,3,4,5,6};
        int l=num.length;
         int a=Math.floorDiv(l,2);          //got greatest integer for mid point
        int temp;
        for(int i=0; i<a; i++){
            //swap a[i] and a[l-1-i] with the help of another varriable temp
            temp=num[i];
            num[i]=num[l-1-i];
            num[l-1-i]=temp;
        }

        for(int i=0; i<l;i++){
            System.out.println(num[i]);
        }
       */

    }
}
