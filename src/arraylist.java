import java.util.ArrayList;
import java.util.Collections;
 class arraylist {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<String> list1 = new ArrayList<String>();
//        ArrayList<Boolean> list2 = new ArrayList<Boolean>();                    //according to data type
//        ArrayList<Float> list3 = new ArrayList<Float>();

        //Add elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // To get an element
        int element = list.get(0);              // 0 is the index
        System.out.println(element);

        // Add element in between
        list.add(1,8);         // 1 is index and 8 is the element to be added
        System.out.println(list);

        // Set element
        list.set(0,10);
        System.out.println(list);

        //delete element
        list.remove(1);        // 1 is index
        System.out.println(list);

        //size of list
        int size = list.size();
        System.out.println(size);

        //Loops of lists
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Sorting the list
        list.add(0);
        Collections.sort(list);
        System.out.println(list );


    }


}
