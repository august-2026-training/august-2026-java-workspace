
public class Exhibition {
	void exhibit(Animal animalG) {
		animalG.livingThing();
		animalG.mobility();
		
		if(animalG instanceof Snake) {
			Snake snake3 = (Snake)animalG; // explicit casting
			snake3.attacks();
		}else if(animalG instanceof Dog){
			Dog dog3 = (Dog)animalG;
			dog3.friend();
		}
	}
}
