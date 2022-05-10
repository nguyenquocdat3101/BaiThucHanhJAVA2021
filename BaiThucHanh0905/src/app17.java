public static void main(String[] args){
    // khai báo1ArrayList có tên là arrlistString
   // có kiểu là String
    ArrayList<Integer> arrlistInteger=new Arraylist<>();
   // thêm các phần tử sử dụng phương thức add()
    arrlistInteger.add(0);
    arrlistInteger.add(7);
    arrlistInteger.add(1);
    arrlistInteger.add(9);
   // duyệt theo kích thước của arrListInteger
   // sử dụng vòng lặp for duyệt theo đối tượng
   // trong đó kiều dữ liệu của biến number
   // phải trùng với kiểu dữ liệu của arrlistInteger
    System.out.println("Các phần tử có trong arrListInteger là: ");
for (int number : arrListInteger){
    System.out.print(number + "\t");
}
}