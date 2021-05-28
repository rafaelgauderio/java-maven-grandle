package modificadores;

public class Gamer {

    public String keyboard() {
        return "Kerbord gamer";
    }

    // quem herda, estender Gamer não vai conseguir sobrescrever mouse
    public final String mouse() {
        return "Mouse gamer";
    }


}
