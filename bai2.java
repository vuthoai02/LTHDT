import java.util.Scanner;
public class bai2{
  int binarysearch(int arr[], int l, int r, int x) {
    if (r >= l) {
      int mid = l + (r - l) / 2;  
      if (arr[mid] == x)
        return mid;    
      if (arr[mid] > x)
        return binarysearch(arr, l, mid - 1, x);  
      return binarysearch(arr, mid + 1, r, x);
    }
    return -1;
  }
  public static void main(String[] args) {
    bai2 ob = new bai2();
    int arr[] = {7, 14, 19, 21, 24, 28, 29 };
    int n = arr.length;
    System.out.println("Giá trị của mảng :");
    for(int i: arr){
      System.out.print(i+" ");
    }
    System.out.print("\n");
    int x;
    Scanner scanner= new Scanner(System.in);
    System.out.println("Nhập giá trị cần tìm kiếm: ");
    x = scanner.nextInt();
    int result = ob.binarysearch(arr, 0, n - 1, x);
    if (result == -1){
      System.out.println("Phần tử " + x + " không tồn tại.");
      scanner.close();
    }
    else{
      System.out.println("Phần tử " + x + " được tìm thấy tại vị trí: " + result);
      scanner.close();
    }
  }
}