import com.m2i.poe.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalMain {

    public static void main(String[] args) {
        // Fonctionnel
        // f(x) = x + 1, x € R <=>
        Function<Double, Double> f = x -> x + 1; // -> donne
        System.out.println(f.apply(1.0));
        Function<Double, Boolean> predicat = x -> x < 10; // f(x) = x < 10
        // -> Expression Lambda
        ArrayList<Double> l = new ArrayList<>(Arrays.asList(2.0,41.0,72.0,8.0));
        List<Double> res = new ArrayList<>();
        for(double d : l) {
            if(d < 10) {
                res.add(d);
            }
        }
        // <=>
        res = l.stream().filter(x -> x < 10).collect(Collectors.toList());
        Stream<Double> stream =  l.stream().filter(x -> x < 10);
        stream =  l.stream().filter(x -> x < 10).filter(x -> x > 2); // Lazy Loading
        res = stream.collect(Collectors.toList()); // Déclenche le lazy loading
        // map
        stream = l.stream().map(x -> x + 1);
        System.out.println(stream.collect(Collectors.toList()));
        stream = l.stream().map(x -> Math.cos(x));
        System.out.println(stream.collect(Collectors.toList()));
        stream = l.stream().map(x -> Math.cos(x)).filter(x -> Math.abs(x) < 0.5);
        System.out.println(stream.collect(Collectors.toList()));
        Stream<Boolean> stream2 = l.stream().map(x -> x < 10);
        System.out.println(stream2.collect(Collectors.toList()));
        // 1 Créer une collection de 10 doubles
        // 2 Filtrer les chiffres pairs
        // 3 Filtrer les chiffres pairs + appliquer un cos
        // 4 Filtrer les nombres premiers
        // 5 Filtrer les nombres pairs + appliquer une tangeante + filtrer les positifs

        l = new ArrayList<>(Arrays.asList(3.14,404.0,-3.2,-8.0,51.0,22.0,2.0,41.0,72.0,8.0));
        stream = l.stream().filter(x -> x % 2 == 0);
        stream = l.stream().filter(x -> x % 2 == 0).map(x -> x + 1);
        stream = l.stream().filter(x -> Main.isPrime((int)Math.floor(x)));
        stream = l.stream().filter(x -> x % 2 == 0).map(x -> Math.tan(x)).filter(x -> x < 0);

        // Reduce abaisse la dimension de 1
        double i = l.stream().mapToDouble(x -> x).sum();
        i = l.stream().mapToDouble(x->x).reduce(0, (x,y) -> x + y);




    }

    public static double f(double d) {
        return d + 1;
    }
}
