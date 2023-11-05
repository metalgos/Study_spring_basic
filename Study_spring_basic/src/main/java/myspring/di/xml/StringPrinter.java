package myspring.di.xml;

public class StringPrinter implements Printer {

	private StringBuffer buffer = new StringBuffer();

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub

		buffer.append(message);

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return buffer.toString();
	}

}
