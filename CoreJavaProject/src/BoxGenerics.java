import java.util.Objects;

public class BoxGenerics<T, K> {
	private T length;
	private T heigth;
	private K breadth;
	
	public BoxGenerics(T length, T heigth, K breadth) {
		super();
		this.length = length;
		this.heigth = heigth;
		this.breadth = breadth;
	}
	
	public T getLength() {
		return length;
	}
	
	public T getHeigth() {
		return heigth;
	}
	
	public K getBreadth() {
		return breadth;
	}

	@Override
	public int hashCode() {
		return Objects.hash(breadth, heigth, length);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoxGenerics other = (BoxGenerics) obj;
		return Objects.equals(breadth, other.breadth) && Objects.equals(heigth, other.heigth)
				&& Objects.equals(length, other.length);
	}

	@Override
	public String toString() {
		return "BoxGenerics [length=" + length + ", heigth=" + heigth + ", breadth=" + breadth + "]";
	}
}
