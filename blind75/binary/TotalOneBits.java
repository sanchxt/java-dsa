package blind75.binary;

public class TotalOneBits {
  // BRIAN KERNIGHAN'S ALGO
  // tc: O(1) -> number of iterations are bounded by the number of bits in an integer (32 or 64 generally, so the iterations are fixed)
  // sc: O(1)
  static int hammingWeight(int n) {
    int count = 0;
    while (n != 0) {
      n &= (n - 1);
      count++;
    }
    return count;
  }

  // FOLLOW UP: If this function is called many times, how would you optimize it?
  private final int[] cache = new int[256];
  public TotalOneBits() {
    // Precompute the number of 1's in each byte (0-255)
    for (int i = 0; i < 256; i++) {
      cache[i] = countBits(i);
    }
  }

  private int countBits(int n) {
    int count = 0;
    while (n != 0) {
      n &= (n - 1);
      count++;
    }
    return count;
  }

  // The trade-off is that we use O(256) = O(1) extra space for the cache, but this is a small, constant amount of memory.
  public int hammingWeight2(int n) {
    // Split the 32-bit integer into 4 bytes and look up the precomputed values
    return cache[n & 0xff] +
          cache[(n >>> 8) & 0xff] +
          cache[(n >>> 16) & 0xff] +
          cache[(n >>> 24) & 0xff];
  }

  public static void main(String[] args) {
    System.out.println("total 1 bits: " + hammingWeight(5));
  }
}
