import java.sql.SQLOutput;

public class SQRService {
    public long sqrCount(long bottom, long top) {
        int x;
        int y = 0;
        for (x = 10; x < 100; x++) {
            if (Math.pow(x, 2) <= top) {
                if (Math.pow(x, 2) >= bottom) {
                    y = y + 1;
                }
            }
        }
        return y;
    }
}
