public static void main(String[] args) {
    int number = (int) (System.currentTimeMillis() % 12 + 1);
    String month = "";     
    switch (number) {
        case 1:
            month = "Tháng 1";
            break;
        case 2:
            month = "Tháng 2";
            break;
        case 3:
            month = "Tháng 3";
            break;
        case 4:
            month = "Tháng 4";
            break;
        case 5:
            month = "Tháng 5";
            break;
        case 6:
            month = "Tháng 6";
            break;
        case 7:
            month = "Tháng 7";
            break;
        case 8:
            month = "Tháng 8";
            break;
        case 9:
            month = "Tháng 9";
            break;
        case 10:
            month = "Tháng 10";
            break;
        case 11:
            month = "Tháng 11";
            break;
        case 12:
            month = "Tháng 12";
            break;
    }   
    // kết quả được hiển thị ngẫu nhiên sau mỗi lần biên dịch
    System.out.println(month);
}