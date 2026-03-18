class Solution {
    public int evalRPN(String[] t) {
        Stack<Long> s = new Stack<>();

        for (String x : t) {
            if ("+-*/".contains(x)) {
                long b = s.pop(), a = s.pop();
                if (x.equals("+")) s.push(a + b);
                else if (x.equals("-")) s.push(a - b);
                else if (x.equals("*")) s.push(a * b);
                else s.push(a / b);
            } else {
                s.push(Long.parseLong(x));
            }
        }

        return s.pop().intValue();
    }
}