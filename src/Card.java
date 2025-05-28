public class Card {

    public String number; //ex: 1-K
    public String suit; //ex: club, spade, heart, diamond
    public boolean isEleven; //this is for aces
    public int value; //ex: 1, 2, 10, 15, 21

    public Card (int pnumber, int psuit){
        number = "" + pnumber;
        suit = "diamonds";
        isEleven = false;
        value = pnumber;


        if(pnumber == 1){
            number = "ace";
            value = 1;
        }
        if(pnumber == 11){
            number = "jack";
            value = 10;
        }
        if(pnumber == 12){
            number = "queen";
            value = 10;
        }
        if(pnumber == 13){
            number = "king";
            value = 10;
        }
        if(psuit ==0){
            suit = "diamonds";
        }
        if(psuit ==1){
            suit = "hearts";
        }
        if(psuit ==2){
            suit = "clubs";
        }
        if(psuit ==3){
            suit = "spades";
        }
    }

    public void print(){
        System.out.println("the card is " + number + " of " + suit);
    }

}
