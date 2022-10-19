public class Main {
    public static void printSeparator() {
        System.out.println("+++++++++++++++");
        System.out.println("---------------");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum() {
        return 42;
    }
    public static void main(String[] args) {
        printSeparator();
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum();
        printIssues(total);
    }
}