import java.util.Objects;

public class Box {
	private int length;
	private int height;
	private int breadth;
	
	public Box(int length, int height, int breadth) {
		this.length = length;
		this.height = height;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public int getHeight() {
		return height;
	}

	public int getBreadth() {
		return breadth;
	}

	@Override
	public int hashCode() {
		return Objects.hash(breadth, height, length);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		return breadth == other.breadth && height == other.height && length == other.length;
	}

	@Override
	public String toString() {
		return "Box [length=" + length + ", height=" + height + ", breadth=" + breadth + "]";
	}
}
