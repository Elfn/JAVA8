/**
 * Created by Elimane on Feb, 2018, at 05:12
 */
public class ServerThread extends Thread{

    private final String setName;

    public ServerThread(String name) {
        this.setName = name;
    }

    @Override
    public void run() {

        int sec = 0;

        while (sec != -1)
        {
            System.out.println("Seconds :"+sec++);
            if(sec == 1000)
            {
                break;
            }
        }
    }
}
