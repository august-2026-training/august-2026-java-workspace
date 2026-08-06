public class InvalidOptionException extends Exception{
	int opt;

	public InvalidOptionException(int opt) {
		this.opt = opt;
	}

	@Override
	public String getMessage() {
		return "Option " + opt + " is invalid!!";
	}
}
