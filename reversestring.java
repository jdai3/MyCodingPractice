public class reversestring{
  public static void main( String args[]){
    //String arry = "Hello World";
    //int[] chars = new int[ary.length()];
  }
  public static String reverse(String arry){ //WHY STRING RATHER THAN VOID?
    char[] ary = arry.toCharArray();
    int i = 0;
    int j = ary.length - 1;
    while (i < j) {
      char x;
      x = ary[i];
      ary[i] = ary[j];
      ary[j] = x;
      i++;
      j--;
    }
  return new String(ary);
  }
}
  //System.out.println[ary.charAt(i)];
