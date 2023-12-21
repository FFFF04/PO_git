package Arabiannights;

public abstract class Genie {
    private int limit;

	private int granted;

    protected Genie(int limit) {
		this.limit = limit;
	}

    public int getLimit() {
		return this.limit;
	}

	public int getGrantedWishes() {
		return this.granted;
	}


    public void incrementGranted(){
        this.granted++;
    }

    public boolean grantwish(){
        if (canGrantWish()){
            incrementGranted();
            doGrantWish();
            return true;
        }
        return false;
    }
    public boolean canGrantWish() {
		return this.granted < this.limit;
	}

    public void doGrantWish() {
		// NOTHING TO DO
	}

}
