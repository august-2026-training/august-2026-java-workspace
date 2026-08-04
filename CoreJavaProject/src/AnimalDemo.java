
public class AnimalDemo {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.livingThing();
		animal.mobility();
		
		System.out.println("-------");
		
		Snake snake = new Snake();
		snake.livingThing();
		snake.mobility();
		snake.attacks();
		
		System.out.println("-------");
		
		Dog dog = new Dog();
		dog.livingThing();
		dog.mobility();
		dog.friend();
		
		System.out.println("-------");
		
		Animal animal1 = new Snake();
		animal1.livingThing();
		animal1.mobility(); // here we acheive dynamic polymorphism
		//animal1.attacks();
		
		System.out.println("===========");
		Exhibition exhibition = new Exhibition();
		Snake snake1 = new Snake();
		exhibition.exhibit(snake1);
		
		Dog dog1 = new Dog();
		exhibition.exhibit(dog1);
		
		
	}

}
