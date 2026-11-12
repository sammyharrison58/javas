import java.util.*;

public class TowerOfHanoiIterative {

    public static void towerOfHanoiIterative(int n, String source, String destination, String auxiliary) {
        int totalMoves = (1 << n) - 1; // 2^n - 1

        // If n is even, swap destination and auxiliary
        if (n % 2 == 0) {
            String temp = destination;
            destination = auxiliary;
            auxiliary = temp;
        }

        // Represent pegs as stacks
        Map<String, Deque<Integer>> pegs = new HashMap<>();
        pegs.put(source, new ArrayDeque<>());
        pegs.put(auxiliary, new ArrayDeque<>());
        pegs.put(destination, new ArrayDeque<>());

        // Put all disks on the source peg (largest at the bottom)
        for (int i = n; i >= 1; i--) {
            pegs.get(source).push(i);
        }

        for (int move = 1; move <= totalMoves; move++) {
            if (move % 3 == 1) {
                legalMove(pegs, source, destination);
            } else if (move % 3 == 2) {
                legalMove(pegs, source, auxiliary);
            } else {
                legalMove(pegs, auxiliary, destination);
            }
        }
    }

    private static void legalMove(Map<String, Deque<Integer>> pegs, String peg1, String peg2) {
        Deque<Integer> stack1 = pegs.get(peg1);
        Deque<Integer> stack2 = pegs.get(peg2);

        if (stack1.isEmpty()) {
            int disk = stack2.pop();
            stack1.push(disk);
            System.out.println("Move disk " + disk + " from " + peg2 + " to " + peg1);
        } else if (stack2.isEmpty()) {
            int disk = stack1.pop();
            stack2.push(disk);
            System.out.println("Move disk " + disk + " from " + peg1 + " to " + peg2);
        } else {
            if (stack1.peek() < stack2.peek()) {
                int disk = stack1.pop();
                stack2.push(disk);
                System.out.println("Move disk " + disk + " from " + peg1 + " to " + peg2);
            } else {
                int disk = stack2.pop();
                stack1.push(disk);
                System.out.println("Move disk " + disk + " from " + peg2 + " to " + peg1);
            }
        }
    }

    public static void main(String[] args) {
        // Example with 3 disks
        towerOfHanoiIterative(3, "A", "C", "B");
    }
}