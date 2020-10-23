package net.asynchronized.yxc;

import java.io.IOException;
import net.asynchronized.yxc.zone.Status;
import net.asynchronized.yxc.zone.Zone;

public class YxcClientDemo {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException Throws error if client has issues
     */
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("To run provide host");
            return;
        }

        YxcClient client = new YxcClient(args[0], Zone.MAIN);
        Status status = client.getStatus();
        System.out.println(status);
    }
}
