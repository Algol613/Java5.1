import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        long expected = 30;
        BonusService service = new BonusService();
        long actual = service.calculate(1_000_60, true);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit1() {
        long expected = 500;
        BonusService service = new BonusService();
        long actual = service.calculate(1_000_000_60, true);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnregistredAndUnderLimit() {
        long expected = 10;
        BonusService service = new BonusService();
        long actual = service.calculate(1_000_60, false);
        assertEquals(expected, actual);
     }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnregistredAndUnderLimit1() {
        long expected = 500;
        BonusService service = new BonusService();
        long actual = service.calculate(1_000_000_60, false);
        assertEquals(expected, actual);
    }
}
