package main.java;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExercises {
//private Integer [] ints = {1,21,15,7,2,4,7,8,3};
//   private List<Integer> arrL = Arrays.asList(ints);
    private List <Integer>arrL = new ArrayList();
   public void init (){
       arrL.add(3);
       arrL.add(4);
       arrL.add(7);
       arrL.add(1);
       arrL.add(2);
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
       int initSize= arrL.size();
        for(int i = 0; i < initSize; i++){

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
        init();

        for (int i = 0; i < arrL.size();) {

            if (arrL.get(i) < x) {
                list.add(arrL.remove(i));
            } else {
                i++;
            }
        }
        return list;
    }

    //1. jak position jest mniejsze od 0 to wrzucamy na pierwsze miejsce w liście (position jest jak indeks oczywiscie, liczymy od 0)
    //2. jak position jest większe niż nasza lista, to dodajemy zeby był jako ostatni element
    public List<Integer> addAtSpecifiedPosition(int value, int position){
       init();
       return null;
    }




    public List<Integer> getArrL() {
        return arrL;
    }

    public void setArrL(ArrayList<Integer> arrL) {
        this.arrL = arrL;
    }
}
