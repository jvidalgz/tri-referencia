import arbol_binario.NodoBinario;

/**
 * Created by jaime on 06-04-2015.
 */
public class Main {
    public static void main(String[] args) {

        Objeto a = new Objeto("a");
        Objeto b = new Objeto("b");
        Objeto c = new Objeto("c");
        Objeto d = new Objeto("d");
        Objeto e = new Objeto("e");
        Objeto f = new Objeto("f");
        Objeto g = new Objeto("g");
        Objeto h = new Objeto("h");
        Objeto i = new Objeto("i");

        TriReferencia<Objeto> tr1 = new TriReferencia<Objeto>(a, b, c);
        TriReferencia<Objeto> tr2 = new TriReferencia<Objeto>(d, e, f);
        TriReferencia<Objeto> tr3 = new TriReferencia<Objeto>(h, i, g);

        NodoBinario n1 = new NodoBinario(tr1);
        NodoBinario n2 = new NodoBinario(tr2);
        NodoBinario n3 = new NodoBinario(tr3);

        n1.setIzq(n2);
        n1.setDer(n3);


        System.out.println(n1);



    }
}
