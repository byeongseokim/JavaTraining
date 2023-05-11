package t20230511;

import java.util.Scanner;
public class RangeError extends RuntimeException {
	RangeError(int n) {
		super("범위 밖 값:" + n);
	}
}

class ParameterRangeError extends RangeError {
	public ParameterRangeError(int n) {
		super(n);
	}

}

class ResultRanngeError extends RangeError {
	ResultRanngeError(int n) { super(n); }

}
