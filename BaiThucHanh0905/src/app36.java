import java.util.LinkedList;
public class Linked{
    public static void main(String[] args){
       // khai báo 1 LinkedList có tên là list
        // có kiểu là String
        LinkedList<String> list=new LinkedList<String>();
        // Add objects to list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list. add("Java");
        System.out.println("ví dụ sử dụng phương thức addAll()");
        System.out.println("-------------------");
       // thêm các phần tử của list vào listA
        LinkedList<String> listA=new LinkedList<String>();
        listA. addAll(list);
        System.out.print("listA:");
        showlist(listA );
      --");
      System.out.println("\nví dụ sử dụng phương thức retainall()");
System.out.println("--
// khởi tạo listB
LinkedList<String> listB=new LinkedList<String> ();
listB.add("Java");
// xóa những phần tử không thuộc listB khỏi listA
listA.retainAll(listB);
System.out.print("listA:");
showlist(listA);
                                                      -");
System.out.println("\nví du sử dụng phương thức removeAll()");
System.out.println("-----
// xóa những phần tử thuộc listB khỏi list
list.removeAl1(listB);
System.out.print("list:");
showlist(list);
}
                                                      -");
public static void showList(LinkedList<String> list){
// Show list through for-each
for (String obj:list){
    System.out.print("\t"+obj+", ");
}
System.out.println();
