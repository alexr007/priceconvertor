package proc;

/**
 * Created by alexr on 12.02.2017.
 */
public class UnQuoted implements Process{
    private final String origin;

    public UnQuoted(String origin) {
        this.origin = origin;
    }

    public UnQuoted(Process origin) {
        this(origin.data());
    }

    public String data() {
        return ((origin != null)
            &&(origin.startsWith("\""))
            &&(origin.endsWith("\""))) ?
            origin.substring(1, origin.length() - 1)
            : origin;
    }
}