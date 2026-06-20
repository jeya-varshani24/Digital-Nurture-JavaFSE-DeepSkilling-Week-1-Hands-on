import java.util.*;
public class FinancialForecast {

    public static double futureValue(double presentValue, double growthRate, int years) {
        if(years == 0) {
            return presentValue;
        }

        else{
            return futureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the present value: ");
        double presentValue = sc.nextDouble();

        System.out.println("Enter the growth rate: ");
        double growthRate = sc.nextDouble();

        System.out.println("Enter the number of years: ");
        int years = sc.nextInt();

        double result = futureValue(presentValue, growthRate, years);

        System.out.println("Future Value = Rs." + result);
    }
}