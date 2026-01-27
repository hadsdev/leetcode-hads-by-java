import java.util.Map;

public class RomanToInteger {

//  public int romanToInt(String s) {
//    Map<Character,Integer> map = Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
//    int res = 0;
//    for(int i=s.length()-1;i>=0;i--){
//      if(i<s.length()-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
//        res -= map.get(s.charAt(i+1));
//        res += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
//      }else {
//        res+=map.get(s.charAt(i));
//      }
//
//    }
//    return res;
//  }


  public int romanToInt(String s) {
    if (s == null || s.isEmpty()) return 0;
    Map<Character,Integer> map = Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);

    int res = 0;
    for (int i = 0; i < s.length(); i++) {
      int val = map.get(s.charAt(i));
      if (i + 1 < s.length() && val < map.get(s.charAt(i + 1))) {
        res -= val;
      } else {
        res += val;
      }
    }
    return res;
  }
}
