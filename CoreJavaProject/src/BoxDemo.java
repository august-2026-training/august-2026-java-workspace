
public class BoxDemo {

	public static void main(String[] args) {
		Box box1 = new Box(300, 200, 150);
		
		System.out.println(box1);
		//Box box2 = new Box(300.50, 200.25, 150.75);
		
		BoxGenerics<Integer, Double> box2 = new BoxGenerics<Integer, Double>(300, 200, 150.5);
		System.out.println(box2);
		
		BoxGenerics<Double, Double> box3 = new BoxGenerics<>(300.22, 200.11, 100.44);
		System.out.println(box3);
	}

}
