import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(isBalancedBrackets(input));
    }

    private static boolean isBalancedBrackets(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char currentChar : input.toCharArray()) {
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                switch (currentChar) {
                    case ')' -> {
                        if (top != '(') return false;
                    }

                    case '}' -> {
                        if (top != '{') {
                            return false;
                        }
                    }
                    case ']' -> {
                        if (top != '[') {
                            return false;
                        }
                    }
                    default -> {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}