package ie.atu;

public class Calculator {

    // Addiction
    public int add(int firstNum, int secondNum)
    {
        if(firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE)
        {
            throw new ArithmeticException("Number cannot be greater than or equal to integer.MAX_VALUE");
        }
        return firstNum + secondNum;
    }

    // Subtraction
    public int sub(int firstNum, int secondNum)
    {
        if(firstNum <= Integer.MIN_VALUE || secondNum <= Integer.MIN_VALUE)
        {
            throw new ArithmeticException("Number cannot be smaller than or equal to integer.MIN_VALUE");
        }

        return firstNum - secondNum;
    }

    //Multiplication
    public int mul(int firstNum, int secondNum)
    {
        if(firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE)
        {
            throw new ArithmeticException("Number cannot be greater than or equal to integer.MAX_VALUE");
        }
        return firstNum * secondNum;
    }

    // Division
    public int div(int firstNum, int secondNum)
    {
        if(secondNum == 0)
        {
            throw new ArithmeticException("Number cannot be divided by 0");
        }
        return firstNum / secondNum;
    }

}
