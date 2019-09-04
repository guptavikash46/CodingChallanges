import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.*;

public class StreamAPI{

    public static void main(String[] args) {
        Collection<String> vals = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Stream<String> stream = Arrays.stream(new String[]{"a", "b", "c"});

        
    }
}