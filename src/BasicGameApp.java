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
                //c.print();

                deck[z] = c;
                z++;
            }
        }// end of y loop
shuffle();
        printDeck();
        p= new Player();
        d= new Dealer();
        deal();
        System.out.println("*");
        System.out.println("player info");
        p.print();
        System.out.println("*");
        System.out.println("dealer's info");
        d.print();


    }//end of basic game const

    public void deal(){
        d.dhand[0]= deck[(int)(Math.random()*52)];
        d.dhand[1]=deck[(int)(Math.random()*52)];


        p.phand[0] = deck [(int)(Math.random()*52)];
        p.phand[1] = deck [(int)(Math.random()*52)];
    }

    public void shuffle(){
        System.out.println("shuffle deck");
        for(int x = 0; x<deck.length; x++){
            int random = (int) (Math.random() * 52);
            Card t = deck[x];
            deck[x] = deck[random];
            deck[random] = t;
        }

    }
    public void printDeck(){

            for(int x = 0; x< deck.length; x++) {
                System.out.println(x);
                deck[x].print();

            }
            }


}