import java.util.Scanner;

public class Accaunt {
    String typekarta;
    long numberkarta;
    double balance = 1000;

    int deposit(int summa) {
        balance += summa;
        return summa;
    }

    int withdrawal(int summa) {
        balance -= summa;
        return summa;
    }


}
