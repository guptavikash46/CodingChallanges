import java.util.Comparator;

public class ComparatorSort implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        Integer a = o1;
        Integer b = o2;
        return b.compareTo(a);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    

}