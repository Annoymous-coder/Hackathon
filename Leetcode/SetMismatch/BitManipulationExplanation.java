Bit Manipulation (XOR)

No Extra Space!

The idea is very clear. I should use an example to explain it.

// 1  2  3  4  5 (expected)
// 1  2  2  4  5 (actual)

Note: XOR: x ^ x = 0, x ^ y ^ x = y, x ^ y ^ x ^ x ^ y = x (remember this usage!)

First Pass: By doing XOR for each number above, xor would finally equals 2^3, which is miss^dup; however, we don't know which is which!

Second Pass:

    Then we use xor & ~(xor - 1) to get the rightmost one-bit of xor. For example, if xor in binary is 00011010, the result is 00000010. We call it oneBit.
    Again, for each number above, if a number has that bit on, we put it to a set group; otherwise, throw it to unset group.

// 1  2  3  4  5
// 1  2  2  4  5
//
//    set: 1  1  2  2  2
//  unset: 3  4  4  5  5
//
// notice that I don't actually examine their binary form, just for demonstration

    By doing XOR for set and unset groups, we would have setXor = 2 and unsetXor = 3; however, we don't know which is which! T_T

Third Pass: Decide which is which :)

public int[] findErrorNums(int[] nums) {
  // assume nums is non-empty
  int n = nums.length;

  // first pass
  int xor = 0;
  for (int i = 1; i <= n; ++i) {
    xor ^= (i ^ nums[i - 1]);
  }
  
  // second pass
  int oneBit = xor & ~(xor - 1);
  int setXor = 0, unsetXor = 0;
  for (int i = 1; i <= n; ++i) {
    // for i
    if ((i & oneBit) > 0) {
      setXor ^= i;
    } else {
      unsetXor ^= i;
    }
    // for nums[i - 1]
    if ((nums[i - 1] & oneBit) > 0) {
      setXor ^= nums[i - 1];
    } else {
      unsetXor ^= nums[i - 1];
    }
  }

  // third pass
  int dup = setXor;
  int miss = unsetXor;
  for (int val : nums) {
    if (miss == val) { // miss should be the duplicate
      dup = unsetXor;
      miss = setXor; // exchange
      break;
    }
  }

  return new int[] { dup, miss };
}

Time: O(N)
Space: O(1)