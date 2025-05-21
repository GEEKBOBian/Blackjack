public class BasicGameApp {

    public Player p;
    public Dealer d;
    public Card[] deck;


    public static void main(String[] args) {
        System.out.println("Hello world!");


        new BasicGameApp();
}
    public BasicGameApp() {
        System.out.println("Welcome to Ian's blackjack table");

        deck = new Card[52];

        for(int y = 0; y < 4; y++) {

            for (int x = 0; x < 13; x++) {
                Card c = new Card(x + 1);
                c.print();

                deck[x] = c;
            }

        }
    }
}