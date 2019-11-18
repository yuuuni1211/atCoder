import java.util.*;

public class ShiftOnly {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean tryNext = true;
    int max = sc.nextInt();
    long[] master = new long[max];
    int count = 0;

    for (int i = 0; i<max; i++) {
      master[i] = sc.nextInt();
    }

    while(tryNext) {
    for (int i = 0; i < max; i++) {
      if (master[i] % 2 != 0) {
        tryNext = false;
      }
    }
      if (tryNext) {
        for (int i = 0; i < max; i++) {
        master[i] = master[i] / 2;
      }
      count++;
    }
    }
  System.out.println(count);
}
}
