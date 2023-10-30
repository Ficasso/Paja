import java.util.ArrayList;

public class Javastart {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        for (int i =0; i < 10; i++){
            list.add(i);
        }
        System.out.println(list.size());
        System.out.println(list);
    }
}
