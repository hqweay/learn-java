package algorithm.剑指offer.替换空格;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/14/20 8:32 PM
 */
public class Solution {
  public String replaceSpace(StringBuffer str) {

    int lenNew = 0;
    for(int i = 0; i < str.length();i++){
      if(str.charAt(i) == ' '){
        lenNew += 3;
      }else{
        lenNew++;
      }
    }
    int lenOld = str.length();
    str.setLength(lenNew);
    int lenIndex = lenNew -1;
    for(int i = lenOld -1; i >= 0; i--){
      if(str.charAt(i) == ' '){
        str.setCharAt(lenIndex--, '0');
        str.setCharAt(lenIndex--, '2');
        str.setCharAt(lenIndex--, '%');
      }else{
        str.setCharAt(lenIndex--, str.charAt(i));
      }
    }
    return str.toString();
  }
}
