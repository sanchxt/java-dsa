package A2Z.basic_hashing;

import java.util.Scanner;

public class NumberHashing {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Length: ");
    int n = sc.nextInt();
    int arr[] = new int [n];
    System.out.println("\nNumbers: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    // pre-compute
    int hash[] = new int[13];
    for (int i = 0; i < n; i++) {
      hash[arr[i]] += 1;
    }

    int q = sc.nextInt();
    System.out.println("\n\nNumbers: ");
    while (q-- != 0) {
      int number = sc.nextInt();
      System.out.println(hash[number]);
    }
    sc.close();
  }
}
