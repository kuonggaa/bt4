public class NextDateCalculator {
    public static void main(String[] args) {
        int d = 31; // Ngày
        int m = 12; // Tháng
        int y = 2023; // Năm

        int[] nextDate = calculateNextDate(d, m, y);
        System.out.println("Ngày tiếp theo là: " + nextDate[0] + "/" + nextDate[1] + "/" + nextDate[2]);
    }

    public static int[] calculateNextDate(int d, int m, int y) {
        // Các tháng có 31 ngày
        int[] months31 = {1, 3, 5, 7, 8, 10, 12};
        // Các tháng có 30 ngày
        int[] months30 = {4, 6, 9, 11};

        // Kiểm tra nếu tháng là tháng cuối năm
        if (m == 12) {
            // Nếu ngày là 31, thì ngày, tháng, năm tiếp theo là 1/1/năm tiếp theo
            if (d == 31) {
                return new int[]{1, 1, y + 1};
            } else {
                return new int[]{d + 1, m, y};
            }
        }

        // Kiểm tra tháng có 31 ngày
        if (contains(months31, m)) {
            // Nếu ngày là 31, thì ngày, tháng, năm tiếp theo là 1/tháng tiếp theo
            if (d == 31) {
                return new int[]{1, m + 1, y};
            }
        }
        // Kiểm tra tháng có 30 ngày
        else if (contains(months30, m)) {
            // Nếu ngày là 30, thì ngày, tháng, năm tiếp theo là 1/tháng tiếp theo
            if (d == 30) {
                return new int[]{1, m + 1, y};
            }
        }
        // Tháng 2
        else {
            // Kiểm tra năm nhuận
            if (isLeapYear(y)) {
                // Nếu ngày là 29, thì ngày, tháng, năm tiếp theo là 1/3/năm hiện tại
                if (d == 29) {
                    return new int[]{1, 3, y};
                }
            } else {
                // Nếu ngày là 28, thì ngày, tháng, năm tiếp theo là 1/3/năm hiện tại
                if (d == 28) {
                    return new int[]{1, 3, y};
                }
            }
        }
        // Trường hợp còn lại: tăng ngày lên 1
        return new int[]{d + 1, m, y};
    }

    // Hàm kiểm tra một giá trị có tồn tại trong mảng không
    public static boolean contains(int[] arr, int key) {
        for (int i : arr) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    // Hàm kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
