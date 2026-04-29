

class Solution {
    public int calPoints(String[] operations) {
        // Create our Stack using the modern Java standard
        Deque<Integer> stack = new ArrayDeque<>();

        for (String op : operations) {
            
            // 1. The "+" Operation: Add the top two scores
            if (op.equals("+")) {
                int topScore = stack.pop();      // Take off the top score temporarily
                int secondScore = stack.peek();  // Look at the new top score
                int newScore = topScore + secondScore;
                
                stack.push(topScore);            // Put the top score back!
                stack.push(newScore);            // Put the new sum on top
            } 
            
            // 2. The "D" Operation: Double the top score
            else if (op.equals("D")) {
                int newScore = stack.peek() * 2;
                stack.push(newScore);
            } 
            
            // 3. The "C" Operation: Cancel the top score
            else if (op.equals("C")) {
                stack.pop();
            } 
            
            // 4. An Integer: Just push it onto the stack
            else {
                // We have to convert the String to an int first
                stack.push(Integer.parseInt(op));
            }
        }

        // Finally, add up all the scores left in the stack
        int totalSum = 0;
        for (int score : stack) {
            totalSum += score;
        }

        return totalSum;
    }
}