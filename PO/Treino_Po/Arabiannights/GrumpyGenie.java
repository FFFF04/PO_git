package Arabiannights;

public class GrumpyGenie extends Genie{
    
    public GrumpyGenie(int limit){
        super(1);
    }

    @Override
    public String toString(){
        return (getGrantedWishes() == 1) ? "Grumpy genie has granted a wish."
        : "Grumpy genie has a wish to grant.";
    }
}
