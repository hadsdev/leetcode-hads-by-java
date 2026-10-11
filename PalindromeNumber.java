public class PalindromeNumber {

//  public boolean isPalindrome(int x) {
//    if(x<0) return false;
//    String s = String.valueOf(x);
//    for(int i=0;i<s.length()/2;i++){
//      if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
//    }
//    return true;
//  }

//  public boolean isPalindrome(int x) {
//    if(x<0) return false;
//    String s = String.valueOf(x);
//    StringBuilder sb = new StringBuilder(s);
//    if(!s.equals(sb.reverse().toString())) return false;
//    return true;
//  }

  public boolean isPalindrome(int x) {
    System.out.println("Hello World");
    if(x<0) return false;
    int rev = 0;
    for(int i=x;i!=0;i/=10){
      rev = rev*10 + i%10;
    }
    if(rev!=x) return false;
    return true;
  }

}
