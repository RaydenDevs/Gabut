
/**
 * LoadingAnimation and Variant
 * IG: rayden.logs
 */
public class LoadingAnimation {

    public static void main(String[] args) {
        char[] anim = {'|', '/', '-', '\\'};
        double duration = 10; //in second

        int animDuration = 100;
        int animLength = (int) Math.ceil((duration * 1000) / animDuration);

        for (int i = 0; i < animLength; i++) {
            char animPick = anim[i % anim.length];
            System.out.print("Loading " + animPick + "\r");
            System.out.flush();
            TaskWait(animDuration);
        }
        System.out.println("Loading Complete!");
    }

    static void TaskWait(int Duration) {
        try {
            Thread.sleep(Duration);
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.print("Skipped");
        }
    }
}
