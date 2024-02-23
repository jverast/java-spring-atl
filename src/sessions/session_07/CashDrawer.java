package sessions.session_07;

import sessions.Session;
import java.util.ArrayList;
import java.util.List;

public class CashDrawer extends Session {
    private final String[] money = { "10", "20", "50", "100", "200", "500", "1000", "5000", "10000" };
    private final List<Money> moneyCount = new ArrayList<>();
    private final int payment;
    private final int cost;

    public CashDrawer() {
        this.payment = (int) inputPayment();
        this.cost = (int) inputCost();

        buildMoneyCount();
    }

    public void show() {
        float change = (float) calculateChange(payment, cost) / 100;

        System.out.print("\nResult: { change: " + change + ", moneyCount: [{");
        for(int i = 0; i < moneyCount.size(); i ++) {
            float type = Integer.parseInt(moneyCount.get(i).type()) / 100f;
            int quantity = moneyCount.get(i).quantity();

            if(i != moneyCount.size() - 1) {
                System.out.print(" type: '" + type + "': quantity: " + quantity + " }, {");
            } else {
                System.out.println(" type: '" + type + "': quantity: " + quantity + " }]}");
            }
        }
    }

    private void buildMoneyCount() {
        int[] change = calculateMoneyChange();

        for(int i = 0; i < change.length; i ++) {
            if(change[i] != 0) {
                moneyCount.add(new Money(this.money[i], change[i]));
            }
        }
    }

    private int[] calculateMoneyChange() {
        int change = calculateChange(payment,cost);

        int[] money = moneyToInt();
        int[] moneyCount = new int[this.money.length];

        for(int i = 0; i < money.length; i ++) {
            while(change >= money[i]) {
                change = change - money[i];
                moneyCount[i] ++;
            }
        }

        return reverse(moneyCount);
    }

    private int calculateChange(int payment, int cost) {
        return payment - cost;
    }

    private int[] moneyToInt() {
        int[] money = new int[this.money.length];

        for(int i = 0; i < this.money.length; i ++) {
            money[this.money.length - 1 - i] = Integer.parseInt(this.money[i]);
        }

        return money;
    }

    private int[] reverse(int[] array) {
        int[] cloned = array.clone();

        for(int i = 0; i < array.length; i ++) {
            cloned[i] = array[array.length - 1 - i];
        }

        return cloned;
    }

    private float inputPayment() {
        getData("Payment: ");
        return Float.parseFloat(this.input) * 100;
    }

    private float inputCost() {
        getData("Cost: ");
        return Float.parseFloat(this.input) * 100;
    }
}
