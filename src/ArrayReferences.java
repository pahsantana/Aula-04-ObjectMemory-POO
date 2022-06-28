import java.util.Arrays;

public class ArrayReferences {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        // comparação de endereço - shallow equality
        System.out.println(a == b);
        // deep equality
        System.out.println(Arrays.equals(a, b));
        // shallow print - toString() ou toHashcode()
        System.out.println(a);
        System.out.println(b);
        // deep print
        System.out.println(Arrays.toString(a));
        // shallow copy (aliasing)
        int[] c = a;
        System.out.println(Arrays.toString(c));
        // Ambos objetos alterados
        c[1] = 4;

        int[] d = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(d));
    }
}
