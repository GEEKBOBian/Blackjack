public class Dealer {

    public int cardTotal;
    public boolean isOver17;
    public Card [] dhand;

    public Dealer(){
        cardTotal = 0;
        isOver17 = false;
        dhand = new Card [2];
    }
    public void print(){
        System.out.println("card total: " + cardTotal);
        for(int x=0; x < dhand.length; x++){
            dhand[x].print();
        }
    }


}
