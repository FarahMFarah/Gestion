package P1;

public class Note {


	private int code;
	private int cc;
	private int cf;
	private double moy;



	public Note() {

		// TODO Auto-generated constructor stub
	}



	public Note(int code, int cc, int cf) {
		super();
		this.code = code;
		this.cc = cc;
		this.cf = cf;
		
	}



	public int getCode() {
		return code;
	}


	public int getCc() {
		return cc;
	}


	public int getCf() {
		return cf;
	}




	public double getMoy() {
		return moy;
	}



	public void setMoy(double moy) {
		this.moy = moy;
	}
	
	public int moyenne(int cc, int cf)
	{
		int mo=(cc+cf)/2;
				return mo;
		
	}
	
	
}
