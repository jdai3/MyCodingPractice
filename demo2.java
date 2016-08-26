public class demo2{
  public static void main(String[] args){
    int[] arr = {4,2,6,3,1，5，9};
    System.out.println(maxxx(arr));
  }
  public static int maxxx(int[] arr){
    int max = 0;
    for(int x =1;x<arr.length-1;x++){
      if(arr[max] >arr[x])
      {
        max = arr[max];
      }
    }
    return max;
  }
}
