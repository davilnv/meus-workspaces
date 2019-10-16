package capitulo05;

public class Craps {
	private enum Status { CONTINUE, WON, LOST};
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	public static void main(String[] args) {
		int myPoint = 0;
		Status gameStatus;
		int sumOfDice = rollDice();
		
		switch (sumOfDice) {
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;
			break;
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			System.out.printf("Pontuação é %d%n", myPoint);
			break;
		}
		
		while (gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();
			
			if (sumOfDice == myPoint)
				gameStatus = Status.WON;
			else
				if (sumOfDice == SEVEN)
					gameStatus = Status.LOST;
		}
		
		if (gameStatus == Status.WON)
			System.out.println("Ganhou!");
		else
			System.out.println("Perdeu!");
	}
	
	public static int rollDice() {
		int die1 = NumerosAleatorios.jogarDados();
		int die2 = NumerosAleatorios.jogarDados();
		
		int sum = die1 + die2;
		
		System.out.printf("Jogada de dados %d + %d = %d%n", die1, die2, sum);
		return sum;
	}
}
