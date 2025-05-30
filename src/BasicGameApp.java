public class BasicGameApp {

    public Player p;
    public Dealer d;
    public Card[] deck;
    public int z = 0;


    public static void main(String[] args) {
        System.out.println("Hello world!");




        new BasicGameApp();
}
    public BasicGameApp() {
        System.out.println("Welcome to Ian's blackjack table");

        deck = new Card[52];


        for(int y = 0; y < 4; y++) {

            for (int x = 0; x < 13; x++) {
                Card c = new Card(x + 1, y);
                c.print();

                deck[z] = c;
                z++;
            }
        }// end of y loop

        p= new Player();
        p.phand[0]= deck[0];
        p.phand[1]=deck[1];
        System.out.println("*****");
        p.phand[0].print();
        p.print();

        System.out.println("dealer's info");
        d= new Dealer();
        d.dhand[0]= deck[(int)(Math.random()*52)];
        d.dhand[1]=deck[3];
        System.out.println("*");
        d.dhand[0].print();
        d.print();


    }//end of basic game const

}