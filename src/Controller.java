public class Controller
{
	private int fibonacci(int currentNumber)
	{
		int fibValue = 0;
		if (currentNumber >= 0)
		{
			if (currentNumber <= 1)
			{
				return 1;
			}
			else
			{
				return fibonacci(currentNumber - 1) + fibonacci(currentNumber - 2);
			}
		}

		return fibValue;
	}

	private int factorial(int currentNumber)
	{
		int facValue = 0;
		if (currentNumber >= 0)
		{
			if (currentNumber <= 1)
			{
				return 1;
			}
			else
			{
				return factorial(currentNumber - 1) * currentNumber;
			}
		}

		return facValue;
	}

	public void start()
	{
		for (int count = 0; count < 80; count++)
		{
			System.out.println(factorial(count));
		}

		System.out.println(factorial(2));
	}

}
