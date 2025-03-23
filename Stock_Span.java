import java.util.Scanner;

public class Stock_Span {
    public static int[] calculateStockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];

        for (int i = 0; i < n; i++) {
            span[i] = 1; // Initial span is 1 (the current day itself)
            for (int j = i - 1; j >= 0 && prices[j] <= prices[i]; j--) {
                span[i]++;
            }
        }
        return span;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of stock prices:");
        int n = scanner.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter the stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int[] spans = calculateStockSpan(prices);

        // Find the maximum span and its corresponding stock price
        int maxSpan = 0;
        int stockPriceWithMaxSpan = 0;
        for (int i = 0; i < spans.length; i++) {
            if (spans[i] > maxSpan) {
                maxSpan = spans[i];
                stockPriceWithMaxSpan = prices[i];
            }
        }

        System.out.println("Stock spans:");
        for (int span : spans) {
            System.out.print(span + " ");
        }

        System.out.println("\nMaximum span: " + maxSpan);
        System.out.println("Stock price with maximum span: " + stockPriceWithMaxSpan);

        scanner.close();
    }
}