public class RString extends RObject implements CharSequence {
    private final String str;

    public RString(String str) {
        this.str = str;
    }

    public String toString() {
        return str;
    }
}