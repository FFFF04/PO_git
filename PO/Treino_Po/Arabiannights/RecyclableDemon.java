package Arabiannights;

public class RecyclableDemon extends Genie{
    private boolean recycled = false;

    public RecyclableDemon(int limit){
        super(limit);
    }

    @Override
    public boolean canGrantWish() {
		return !this.recycled;
	}

    public boolean recycled(){
        return this.recycled;
    }

    public void recycle(){
        this.recycled = true;
    }

    @Override
	public String toString() {
		return this.recycled ? "Demon has been recycled." : "Recyclable demon has granted "
				+ getGrantedWishes() + " wishes.";
	}
}
