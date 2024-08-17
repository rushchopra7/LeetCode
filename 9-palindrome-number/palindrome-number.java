class Solution {
    public boolean isPalindrome(int x) {
        int reversedNum = 0;  int remainder;
    
    // store the number to originalNum
    int originalNum = x;
    if (x < 0) {  // negative numbers are never palindromes
            return false;
        }
    
    // get the reverse of originalNum
    // store it in variable
    while (x != 0) {
      remainder = x % 10;
      reversedNum = reversedNum * 10 + remainder;
      x /= 10;
    }
    
    // check if reversedNum and originalNum are equal
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
      return true;

    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
      return false;
    }
  }
}
        
    
