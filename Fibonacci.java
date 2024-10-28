package swatitest;
import java.util.function.Function;

class FunFibo {
    public void fibon(int num, Function<Integer, String> f) {
        System.out.println(f.apply(num));
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        Function<Integer, String> fn = (n) -> {
            int a = 0;
            int b = 1;
            StringBuilder str = new StringBuilder();
            str.append(a).append(" ").append(b);

            for (int i = 2; i < n; i++) {
                int next = a + b;
                str.append(" ").append(next);
                a = b;
                b = next;
            }

            return str.toString();
        };

        FunFibo fb = new FunFibo();
        fb.fibon(5, fn);
    }
}