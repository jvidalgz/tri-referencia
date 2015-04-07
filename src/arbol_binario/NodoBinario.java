package arbol_binario;

/**
 * Created by jaime on 06-04-2015.
 */
public class NodoBinario<T> {
    public T dato;
    protected NodoBinario izq;
    protected NodoBinario der;

    // cronstructor
    public NodoBinario(T d) {
        dato = d;
        izq = null;
        der = null;
    }

    public void setIzq(NodoBinario nodoBinario ) {
        this.izq = nodoBinario;
    }

    public void setDer(NodoBinario nodoBinario ) {
        this.der = nodoBinario;
    }


    // imprime un nodo binario
    @Override
    public String toString() {
        // raiz
        String s = "[" + dato + "]";
        //izq y der (Recursividad)
        if ( this.izq != null) {
            s +=  "izq->" + this.izq.toString();
        }

        if(this.der != null) {
            s += "der->" +this.der.toString();
        }
        return s;
    }
}
