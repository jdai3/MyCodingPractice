public class jtest{
  public static void main (String[] args){
    //String s = "Start";
    //s = s.substring(0,4) + "le" + s.substring(4);
    //System.out.println(s);
    StringBuilder s = new StringBuilder("Start");
    s.insert(4,"le");
    System.out.println(s);
    String dna = "cgatga";
    //String a = dna.indexOf("atg");
    String b =dna.substring(1,4);
    //System.out.println(a);
    System.out.println(b);
    public String reverse(String s){
      String ret = "";
      for(int k=0; k < s.length(); k +=1){
        ret = s.charAt(k) + ret;
      }
       return ret;
