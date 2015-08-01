package cars;

public class Manipulations {

	public static void main(String[] args) {

		Car audi = new Automobile(2000,5.6);
		Car opel = new Automobile(1500,4.6);
		Car pegeout = new Automobile(3500,7);
		Car citroen = new Automobile(20000,10);
		Car renault = new Automobile(100000,9);
		Car mercedes = new SUV(10000,true);
		Car toyota = new SUV(15000,false);
		Car mitsubishi = new SUV(5500,true);
		Car mazda = new SUV(6000,true);
		Car lamborghini = new SUV(7500,false);
		
		Car[] cars = {audi, opel,pegeout,citroen,renault,mercedes,toyota,
				mitsubishi,mazda,lamborghini
		};
		sortCars(cars);
		
		for (int i = 0; i < cars.length; i++) {
			cars[i].sayPrice();
		}
	}
	public static void sortCars(Car[] cars) {
		for(int i=0;i<cars.length;i++){
			
			boolean sort = false;
			
			for(int j=1;j<=(cars.length-1 - i);j++){
				if(cars[j-1].getPrice()>cars[j].getPrice()){
					int swap = cars[j-1].getPrice();
					cars[j-1].setPrice(cars[j].getPrice());
					cars[j].setPrice(swap);
					sort=true;
				}
			}
			
			if(sort = false){
				break;
			}
			
		}
	}
}
