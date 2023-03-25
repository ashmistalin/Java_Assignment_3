import javax.swing.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class Mycalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n)
    {
        int i;
        int sum=0;
        for (i = 1; i <= n; i++)
        {
            if (n<=1000 && n%i==0)
            {
                sum=sum+i;
            }
        }
        if(n>1000)
        {
                System.out.println("Enter a number within the range of 1000.");
        }
        return sum;
    }
}
