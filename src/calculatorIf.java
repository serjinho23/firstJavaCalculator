class CalculatorIf {
    static void calcIf(double param1, double param2, char oper) {
        double ans;
        if (oper == '+') {
            ans = param1 + param2;
            System.out.println("" + param1 + " " + oper + " " + param2 + " = " + ans);
        } else if (oper == '-') {
            ans = param1 - param2;
            System.out.println("" + param1 + " " + oper + " " + param2 + " = " + ans);
        } else if (oper == '*') {
            ans = param1 * param2;
            System.out.println("" + param1 + " " + oper + " " + param2 + " = " + ans);
        } else if (oper == '/') {
            ans = param1 / param2;
            System.out.println("" + param1 + " " + oper + " " + param2 + " = " + ans);
        }

    }
    static void calc(double value1, double value2, char operation) {
        double answer;
        switch (operation) {
            case '+':
                answer = value1 + value2;
                System.out.println("" + value1 + " " + operation + " " + value2 + " = " + answer);
                break;
            case '-':
                answer = value1 - value2;
                System.out.println("" + value1 + " " + operation + " " + value2 + " = " + answer);
                break;
            case '*':
                answer = value1 * value2;
                System.out.println("" + value1 + " " + operation + " " + value2 + " = " + answer);
                break;
            case '/':
                answer = value1 / value2;
                System.out.println("" + value1 + " " + operation + " " + value2 + " = " + answer);
        }

    }
    public static void main(String[] args) {
        calcIf(15.0, 5.0, '+');
        calc(9.0, 12.0, '/');
    }
}