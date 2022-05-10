public static void main(String[] args) {
    // khai báo1ArrayList có tên là arrlistString
   // có kiểu là String
    ArrayList<String> arrListString=new ArrayList<>();
   // thêm các phần tử sử dụng phương thức add()
    arrlistString.add("JAVA");
    arrlistString.add("PHP");
    arrlistString.add("C#");
    arrlistString.add("C++");
   // duyệt theo kích thước của arrlistString
   // sử dụng vòng lặp for thông thường
   // phương thức arrListString.size() sẽ trả về số phần tử của arrListString
   // và sau đó lấy phần tử tai vị trí thứithông qua hàm get()
    // sau đó hiến thị giá trị phần tử đó ra
    System.out.println("Các phần tử có trong arrListString là: ");
    for (int i = 0;i< arrlistString.size(); i++){
        System.out.print(arrListString.get(i)+"\t");
    }
}