package Arabiannights;

public class FriendlyGenie extends Genie{
    
    public FriendlyGenie(int limit){
        super(limit);
    }

    public int getRemainingWishes(){
        return getLimit() - getGrantedWishes();
    }

    @Override
    public String toString(){
        return "Friendly genie has granted " + getGrantedWishes() + " wishes and still has "
				+ getRemainingWishes() + " to grant.";
    }
}
