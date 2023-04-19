import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.java_5.RelaxService;

public class RelaxServiceTest {

    @Test
    public void shouldRelaxExact(){
        RelaxService service = new RelaxService();

        int expected = 3;
        int actual = service.calcRelax(10000,3000,20000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRelaxInExact(){
        RelaxService service = new RelaxService();

        int expected = 2;
        int actual = service.calcRelax(100_000,60_000,150_000);

        Assertions.assertEquals(expected, actual);
    }
}
