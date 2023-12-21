package Arabiannights;

public class MagicLamp {
    private int limit;

	private int totalRubs;

	private int rubs;

	private int demons;

    public MagicLamp(int limit){
        this.limit = limit;
    }

    public int getLimit() {
		return this.limit;
	}

	public int getRubs() {
		return this.rubs;
	}

	public int getTotalRubs() {
		return this.totalRubs;
	}

	public int getGenies() {
		return getLimit() - getRubs();
	}

	public int getDemons() {
		return this.demons;
	}

    public Genie rub(int wishes) {
        if (this.rubs < this.limit){
            this.rubs++;
            this.totalRubs++;
            if (totalRubs % 2 == 0) {
                return new FriendlyGenie(wishes);
            }
            return new GrumpyGenie(wishes);
        }
        return new RecyclableDemon(wishes);
    }
    public void feedDemon(RecyclableDemon demon) {
		if (!demon.recycled()) {
			demon.recycle();
			this.rubs = 0;
			this.demons++;
		}
	}
    @Override
	public boolean equals(Object o) {
		return o instanceof MagicLamp && equals((MagicLamp) o);
	}
    
    public boolean equals(MagicLamp l) {
		return getLimit() == l.getLimit() && getGenies() == l.getGenies()
				&& getDemons() == l.getDemons();
	}
    
}

