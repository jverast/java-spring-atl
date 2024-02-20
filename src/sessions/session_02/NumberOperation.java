package sessions.session_02;

public class NumberOperation {
    public double average(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public double min(double[] numbers) {
        double lowest = numbers[0];
        for( int i = 1; i < numbers.length; i ++) {
            if(numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        return lowest;
    }

    public void countToHundred() {
        int i = 1;
        while( i < 101) {
            if (i != 100) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }

            i ++;
        }
    }
}
