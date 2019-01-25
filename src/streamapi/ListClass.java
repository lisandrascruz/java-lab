package streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListClass {

    public static void main(String[] args) {

        List<Integer> itens = Arrays.asList( 11, 10, 16, 5, 85 );

        itens.forEach(item -> System.out.println(item));
        itens.forEach(System.out::println);

        itens.stream().filter(i -> i==85).forEach(System.out::println);

        double count = itens.stream()
                        .mapToDouble(i -> i)
                        .filter(i->i>10)
                        .count();

        List<Integer> itensDouble =
                itens.stream()
                .map(i->i*i)
                .collect(Collectors.toList());

        List<String> numbers = Arrays.asList("1", "2", "3");
        List<Integer> even =
                numbers.stream()
                .map(e -> Integer.valueOf(e))
                .filter(e -> e%2 != 0)
                .collect(Collectors.toList());

        Map<Integer, String> dogs = new HashMap<Integer, String>();
        dogs.put(3, "Susu");
        dogs.put(2, "Mi");
        dogs.put(4, "Mi");
        dogs.put(5, "Mi");
        dogs.put(9, "Mffi");
        dogs.put(9, "Mbii");
        dogs.put(1, "Lala");
        dogs.put(9, "Meei");

        System.out.println(dogs);

        Optional<String> name = dogs.entrySet()
                .stream()
                .filter(i -> i.getKey() == 3)
                .map(Map.Entry::getValue).findFirst();

//        System.out.println(name.get());
//        System.out.println();
    }

}
