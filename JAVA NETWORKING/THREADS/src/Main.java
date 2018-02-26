/**
 * Created by Elimane on Feb, 2018, at 04:59
 */
//Thread is a sequential flow of control that we can find in a program
public class Main {
    public static void main(String[] args)
    {
            ServerThread serverThread = new ServerThread("S1");

            serverThread.start();
           // serverThread.run();

    }
}
