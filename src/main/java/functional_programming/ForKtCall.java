package functional_programming;

/**
 * @author : LEX_YU
 */
public class ForKtCall {
    public void postponeComputation(int delay, Runnable computation) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            computation.run();
        }).start();
    }
}
