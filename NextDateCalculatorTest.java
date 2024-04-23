import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class NextDateCalculatorTest {
    @Test
    public void testNextDate() {
        // Kiểm tra ngày tiếp theo cho ngày cuối cùng của tháng 12
        assertArrayEquals(new int[]{1, 1, 2024}, NextDateCalculator.calculateNextDate(31, 12, 2023));

        // Kiểm tra ngày tiếp theo cho ngày 30 của tháng 4
        assertArrayEquals(new int[]{1, 5, 2023}, NextDateCalculator.calculateNextDate(30, 4, 2023));

        // Kiểm tra ngày tiếp theo cho ngày 28 của tháng 2 năm không nhuận
        assertArrayEquals(new int[]{1, 3, 2023}, NextDateCalculator.calculateNextDate(28, 2, 2023));

        // Kiểm tra ngày tiếp theo cho ngày 29 của tháng 2 năm nhuận
        assertArrayEquals(new int[]{1, 3, 2024}, NextDateCalculator.calculateNextDate(29, 2, 2024));

        // Kiểm tra ngày tiếp theo cho ngày bất kỳ không phải là ngày cuối cùng của một tháng
        assertArrayEquals(new int[]{20, 4, 2023}, NextDateCalculator.calculateNextDate(19, 4, 2023));

        // Kiểm tra ngày tiếp theo cho ngày cuối cùng của tháng 5
        assertArrayEquals(new int[]{1, 6, 2023}, NextDateCalculator.calculateNextDate(31, 5, 2023));

        // Kiểm tra ngày tiếp theo cho ngày cuối cùng của tháng 11
        assertArrayEquals(new int[]{1, 12, 2023}, NextDateCalculator.calculateNextDate(30, 11, 2023));

        // Kiểm tra ngày tiếp theo cho ngày 31 của tháng 1
        assertArrayEquals(new int[]{1, 2, 2023}, NextDateCalculator.calculateNextDate(31, 1, 2023));

        // Kiểm tra ngày tiếp theo cho ngày 15 của tháng 8
        assertArrayEquals(new int[]{16, 8, 2023}, NextDateCalculator.calculateNextDate(15, 8, 2023));
    }
}
