package mv.sdd.threads;

public class TelechargerFichierTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Téléchargement du fichier a commencé : " + Thread.currentThread().getName());

//        int temps = (int)(Math.random() * 10000);
//        try {
//            Thread.sleep(temps);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            System.out.println("Téléchargement de l'octet " + i);
        }

        System.out.println("Téléchargement terminé du fichier : " + Thread.currentThread().getName());
    }
}
