package algorithm;

import java.time.LocalDateTime;
import java.util.function.*;

public class Functional {

  public static void main(String[] args) {

    Supplier<LocalDateTime> time = () -> LocalDateTime.now();

    System.out.println(time.get());

    Consumer<String> c1 = (c) -> System.out.println(c);

    c1.accept("hello");

    BiConsumer<String, Integer> c2 = (input1, input2) -> System.out
        .println("Hello input1 :" + input1 + " input2 :" + input2);

    c2.accept("Maths", 20);

    Function<Integer, Integer> f1 = x -> x * 20;
    System.out.println(f1.apply(12));

    BiFunction<Integer, Integer, Integer> f2 = (a, b) -> a + b;
    System.out.println(f2.apply(12, 24));

    Predicate<Integer> p1 = va1 -> va1 == 2;

    System.out.println(p1.test(4));

    BiPredicate<Integer, Integer> p2 = (v1, v2) -> v1.equals(v2);
    System.out.println(p2.test(4, 4));

  }
}
