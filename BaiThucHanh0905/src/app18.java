public static void main(String[] args) {
   // khai báo1ArrayList có tên là arrlistString
  // có kiểu là String
    ArrayList<Float> arrListFloat = new ArrayList<>();
   // thêm các phần tử sử dụng phương thức add()
   // chữfcho biết các số thêm vào là số thực
   // nếu không có chữ này thì trình biên dịch sẽ hiểu đây là số double
   // và sẽ báo lỗi dữ liệu
    arrlistFloat.add(0.7f);
    arrlistFloat.add(7.26f);
    arrlistFloat.add(1.02f);
    arrListFloat.add(9.3f);
   // khai báo một Iterator có kiểu là Float
    Iterator<Float> iterator = arrListFloat.iterator();
    System.out.println("Các phần tử có trong arrlistFloat là: ");
    while (iterator.hasNext()){
        System.out.print(iterator.next()+"\t");
  }
}