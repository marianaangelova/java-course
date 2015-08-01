package ClassTask;

public class Manipulating {

	public static void main(String[] args) {
		Policeman jonny = new Policeman(200,3500,"officer");
		jonny.present();
		jonny.sayRank();
		
		Policeman matt = new Policeman(180,3000,"sub-officer");
		matt.present();
		matt.sayRank();
		
		Doctor haus = new Doctor(250,5000,10,10);
		haus.present();
		haus.sayDuties();
		
		Doctor dolittle = new Doctor(150,3500,10,5);
		dolittle.present();
		dolittle.sayDuties();
	}

}
