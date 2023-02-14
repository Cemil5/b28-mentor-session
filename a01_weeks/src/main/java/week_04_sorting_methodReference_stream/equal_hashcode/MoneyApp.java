package week_04_sorting_methodReference_stream.equal_hashcode;

public class MoneyApp {
    public static void main(String[] args) {
        Money income = new Money(55, "USD");
        Money expenses = new Money(55, "USD");

        boolean balanced = income.equals(expenses);
        System.out.println(balanced);
    }
}
