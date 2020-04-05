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
    void shouldCalculateForRegisteredAndOverLimit() {
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
    void shouldCalculateForUnregistredAndOverLimit() {
        long expected = 500;
        BonusService service = new BonusService();
        long actual = service.calculate(1_000_000_60, false);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndBorderLimit() {
        long expected = 0;
        BonusService service = new BonusService();
        long actual = service.calculate(0, true);
        assertEquals(expected, actual);
    }
}
