package depinv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message again");

		JSONFormatter formatter = new JSONFormatter();
		MessagePrinter messagePrinter = new MessagePrinter();
		PrintWriter printWriter = new PrintWriter(new FileWriter("test_msg.txt"));
		
		messagePrinter.writeMessage(msg, formatter, printWriter);
	}

}
