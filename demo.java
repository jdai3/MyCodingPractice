//正则表达式
//1.match strings,规则匹配整个字符串，只要有一处不符合规则，匹配结束返回false。
//2.正则表达式切割。split

class demo{
  public static void main (String[] args){
    //demo();
    checkQQ();//如何直接输入qq号进行判断？--已解
    //xsplitdemo();
  }
  public static void demo(){
    String str ="28064089";
    String reg = "[a-zA-Z]\\d*";//第一位为字母，后面全是数字，
    boolean b = str.matches(reg);
    System.out.println(b);
  }
  //check球球号，1.不能0开头 2.总共5-10位 3.全为数字0-9
  public static void checkQQ(){  //function的民命规则？
    String qq = "2806408900";
    String check = "[1-9]\\d{4,9}";
    boolean bb = qq.matches(check);
    System.out.println(bb);
    boolean flag = true;
    if (bb ==flag){
      System.out.println("qq号 "+qq+" 建立成功");
    }else{
      System.out.println("qq号不符合规则，请重新命名：");
    }
  }
  public static void splitdemo(){
    String str ="zz,44 777       ,iiii";
    String reg =",";
    String[] arr = str.split(reg);
    for(String s: arr){
      System.out.println(s);
    }
  }

}
