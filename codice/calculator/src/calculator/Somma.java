package calculator;

import java.io.IOException;

public class Somma {
	
	public float sum() throws IOException {
		float x = System.in.read();
		float y = System.in.read();
		return x+y;
	}
}
