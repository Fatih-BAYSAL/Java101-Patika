package BoxingMatch;

public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Fatih Baysal", 20, 120, 100,30 );
        Fighter f2 = new Fighter("Ahmet Solar", 20, 85, 85,30);


        Match match = new Match(f1,f2,85,100);
        match.run();

    }
}
