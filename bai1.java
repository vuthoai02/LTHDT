public class bai1{
  public static void main(String[] args){
    int temp;
    int[] dayso = {1,67,3,53,2,7,9};
    System.out.println("Mảng trước khi sắp xếp:");
    for(int i: dayso){
      System.out.println(i);
    }

    for(int i = dayso.length - 1 ; i > 0 ; i--){
      for(int j = 0; j < i ; j++){
        if(dayso[j] > dayso[j+1]){
          temp = dayso[j];
          dayso[j] = dayso[j+1];
          dayso[j+1] = temp;
        }
      }
    }

    System.out.println("Mảng sau khi sắp xếp");
    for(int i: dayso){
      System.out.println(i);
    }
  }
}