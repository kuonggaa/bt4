import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class NextDateCalculatorEquivalenceTest {

    @Test
    public void testNextDate_EquivalenceClass1() {
        // Lớp tương đương: Ngày tiếp theo là ngày đầu tiên của tháng tiếp theo
        int[] result = NextDateCalculator.calculateNextDate(31, 1, 2023);
        assertArrayEquals(new int[]{1, 2, 2023}, result);
    }

    @Test
    public void testNextDate_EquivalenceClass2() {
        // Lớp tương đương: Ngày tiếp theo là ngày cuối cùng của tháng hiện tại
        int[] result = NextDateCalculator.calculateNextDate(30, 4, 2023);
        assertArrayEquals(new int[]{1, 5, 2023}, result);
    }

    @Test
    public void testNextDate_EquivalenceClass3() {
        // Lớp tương đương: Tháng 2 của năm không nhuận
        int[] result = NextDateCalculator.calculateNextDate(28, 2, 2023);
        assertArrayEquals(new int[]{1, 3, 2023}, result);
    }

    @Test
    public void testNextDate_EquivalenceClass4() {
        // Lớp tương đương: Tháng 2 của năm nhuận
        int[] result = NextDateCalculator.calculateNextDate(28, 2, 2024);
        assertArrayEquals(new int[]{29, 2, 2024}, result);
    }
}
