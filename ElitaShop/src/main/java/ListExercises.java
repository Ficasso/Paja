package main.java;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExercises {
//private Integer [] ints = {1,21,15,7,2,4,7,8,3};
//   private List<Integer> arrL = Arrays.asList(ints);
    private List <Integer>arrL = new ArrayList();
   public void init (int x){
       arrL.add(x);
   }

//private ArrayList<Integer> arrL = (ArrayList<Integer>) List.of(1,23,5,7,2,4,7,8,3);
    public int sumElements(List arrL) {
        int sum =0;
        for (int i = 0; i < arrL.size(); i++){
            sum += (int)arrL.get(i);
        }
        return sum;
    }

    public void addEvenElementsOfList(){
        for(int i = 0; i < arrL.size(); i++){

            if(arrL.get(i) % 2 ==0){
                arrL.add(arrL.get(i));
            }
        }
    }

    public int[] getElementsLessThan(int x){
        int [] array = new int[10];
    for (int i = 0; i< arrL.size(); i++){
    if(arrL.get(i) < x){
        for(int j = 0; j < array.length; j++){
            if(array[j] == 0){
                array[j] = arrL.get(i);
                break;
             }
            }
        }
    }
        return array;
    }


//usuwam elementy mniejsze niz x i mam zwrocicic liste tych usuniętych
    public List<Integer> deleteAndReturnElementsLessThan(int x){
        List <Integer> list = new ArrayList<>();
        init(3);
        init(4);
        init(7);
        init(1);
        init(2);

        for (int i = 0; i < arrL.size(); i++) {

            if (arrL.get(i) < x) {
                arrL.remove(i);
                list.add(arrL.get(i));
            }
        }
        return list;
    }




    public List<Integer> getArrL() {
        return arrL;
    }

    public void setArrL(ArrayList<Integer> arrL) {
        this.arrL = arrL;
    }
}
