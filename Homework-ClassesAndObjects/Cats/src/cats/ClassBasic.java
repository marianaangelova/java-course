package cats;

public class ClassBasic {

	public static void main(String[] args) {
		Cat[] cats = new Cat[10];
		
		cats[0] = new Cat("Pissy",2);
		cats[1] = new Cat("Leila",3);
		cats[2] = new Cat("Chucky",2);
		cats[3] = new Cat("Tom",3);
		cats[4] = new Cat("Mike",2);
		cats[5] = new Cat("Blacky",4);
		cats[6] = new Cat("Missy",2);
		cats[7] = new Cat("Kitty",9);
		cats[8] = new Cat("Ani",11);
		cats[9] = new Cat("Bella",2);
		
		for (int i = 0; i < cats.length; i++) {
			cats[i].say();
		}
	}

}
