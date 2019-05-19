import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
/**
 * 创建源源不断的素数 - 有点像IntStream.of(2, 3, 5, 7, 11, 13, 17)，但无限。该流必须能够在几秒钟内产生一百万个素数。
 */
public class Primes {

    private static final int MAX = 1000000;
    private static final boolean[] VALUES = new boolean[MAX];
    private static final Set<Integer> PROCESSED_PRIMES = new HashSet<>();


    static {
        Arrays.fill(VALUES, true);
        rejectByDivider(2);
    }
    public static IntStream stream() {
        return IntStream.iterate(2, prev -> {
            for (int next = prev + 1; next < MAX; next++) {
                if (VALUES[next]) {
                    rejectByDivider(next);
                    return next;
                }
            }
            throw new RuntimeException("MAX不够大");
        });
    }

    private static void rejectByDivider(int divider) {
        if (PROCESSED_PRIMES.contains(divider)) {
            return;
        }

        for (int i = divider * 2; i < MAX; i += divider) {
            VALUES[i] = false;
        }

        PROCESSED_PRIMES.add(divider);
    }
}
