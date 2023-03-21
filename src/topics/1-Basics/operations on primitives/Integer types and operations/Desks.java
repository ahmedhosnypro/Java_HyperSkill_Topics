import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupA = scanner.nextInt();
        int groupB = scanner.nextInt();
        int groupC = scanner.nextInt();
        int[] groups = new int[]{groupA, groupB, groupC};
        int totalDesks = 0;
        for (int group: groups){
            totalDesks+= group/2 + group%2;
        }
        System.out.println(totalDesks);
    }
}