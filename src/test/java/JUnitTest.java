import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("2 + 2는 4이다.") // 테스트 명
    @Test // 테스트 메서드임을 말하는 애너테이션
    public void junitTest() {
        // given
        int a = 2;
        int b = 2;
        int sum = 0;

        // when
        sum = a + b;

        // then
        Assertions.assertEquals(a+b, sum);

    }
}
