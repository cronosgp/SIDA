package application;

public class Primo {

    public Boolean verPrimo(String num) {
        int n = Integer.parseInt(num.replaceAll("[\\n\\t ]", ""));
        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;
        else
           return false;
    }
}

