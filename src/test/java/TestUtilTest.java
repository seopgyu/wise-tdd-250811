import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUtilTest {
    @Test
    @DisplayName("TestUtil.getScanner()")
    void t1() {
        Scanner sc = TestUtil.genScanner("""
                      등록
                      너 자신을 알라
                      소크라테스
                      """
        );
       String cmd=sc.nextLine();
       String saying=sc.nextLine();
       String author=sc.nextLine();


        assertThat(cmd).isEqualTo("등록");
        assertThat(saying).isEqualTo("너 자신을 알라");
        assertThat(author).isEqualTo("소크라테스");
    }}
