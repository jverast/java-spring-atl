package sessions.session_03;

import sessions.Session;

public class NumberArray extends Session {
    private final int[] list = new int[5];

    public NumberArray() {
        for(int i = 0; i < this.list.length; i ++) {
            this.getData("[" + i + "]: ");
            this.list[i] = Integer.parseInt(this.input);
        }
    }

    public double getAverage() {
        int sum = 0;
        for (int j : this.list) {
            sum += j;
        }
        return (double) sum / this.list.length;
    }

    public int getMax() {
        int max = this.list[0];
        for(int i = 1; i < this.list.length; i ++) {
            if(this.list[i] > max) {
                max = this.list[i];
            }
        }
        return max;
    }

    public int getMin() {
        int min = this.list[0];
        for(int i = 1; i < this.list.length; i ++) {
            if(this.list[i] < min) {
                min = this.list[i];
            }
        }
        return min;
    }

    public void showList() {
        System.out.print("\n[ ");
        for (int i = 0; i < this.list.length; i++) {
            if (i != this.list.length - 1) {
                System.out.print(this.list[i] + ", ");
            } else {
                System.out.print(this.list[i] + " ]");
            }
        }
    }
}
