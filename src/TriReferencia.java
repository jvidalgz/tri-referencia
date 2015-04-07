
/**
 * Created by jaime on 06-04-2015.
 */
public class TriReferencia<T> {

    T ref1;
    T ref2;
    T ref3;

    TriReferencia(T r1,T r2,T r3) {
        ref1 = r1;
        ref2 = r2;
        ref3 = r3;
    }

    // imprime a dónde apuntan las tres referencias
    @Override
    public  String toString() {
        return "[ " + ref1.toString() + ", " + ref2.toString() + ", " + ref3.toString() + " ]";
    }

}
