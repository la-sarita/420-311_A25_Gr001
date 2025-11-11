package mv.sdd.threads;

public class TreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        //for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new TelechargerFichierTask());
            thread.start();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            thread.interrupt();
        //}
    }

}
