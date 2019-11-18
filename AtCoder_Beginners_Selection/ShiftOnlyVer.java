import java.util.*;

public class ShiftOnlyVer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int b = 0;
    int[] master = new int[N];
    int count = 0;

    for (int i = 0; i<N; i++) {
      master[i] = sc.nextInt();
      b = master[i] | b;
    }

    while ((b&1) == 0) {
      b = b>>1;
      count++;
    }
    System.out.println(count);
  }
}
