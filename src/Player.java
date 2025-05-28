public class Player {

    public int cardTotal;
    public boolean isHit;
    public Card [] phand;



    public Player(){
        cardTotal=0;
        isHit = true;
        phand= new Card[2];
    }

    public void print(){
        System.out.println("card total: " + cardTotal);
        for(int x=0; x < phand.length; x++){
            phand[x].print();
        }
    }

}
