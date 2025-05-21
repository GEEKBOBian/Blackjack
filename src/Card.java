public class Card {

    public String number; //ex: 1-K
    public String suit; //ex: club, spade, heart, diamond
    public boolean isEleven; //this is for aces
    public int value; //ex: 1, 2, 10, 15, 21

    public Card (int pnumber, int psuit){
        number = "ten";
        suit = "diamonds";
        isEleven = false;
        value = pnumber;

        if(pnumber == 13){
            number = "king";
            value = 10;
        }
        if(psuit ==2){
            suit = "hearts";
        }
    }

    public void print(){
        System.out.println("the card is " + number + " of " + suit);
    }

}
