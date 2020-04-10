class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	char tip_danok;
	//TODO constructor

	public Item(int id, String name, double price, char tip_danok) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tip_danok = tip_danok;
	}

	//TODO setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getTip_danok() {
		return tip_danok;
	}

	public void setTip_danok(char tip_danok) {
		this.tip_danok = tip_danok;
	}

	double taxReturn (int id,int price,char tip_danok) {
		double taxr;
		if(tip_danok=='A')
		taxr=float(price*18*15)/10000
		elseif(tip_danok=='B')
		taxr=float(price*5*15)/10000
		else
		taxr=float(price*15)/10000
	}
	public double getTaxRetrun(){
		return taxr;
	}
}
