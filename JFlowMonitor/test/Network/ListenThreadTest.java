/*
 * This file is written by reyoung, reyoung@126.com.
 */

package Network;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Reyoung
 */
public class ListenThreadTest {

    public ListenThreadTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testSomeMethod() throws InterruptedException {
        ListenThread th = new ListenThread(Network.Instance().getDeviceAt(0), Network.Instance());
        th.start();
        th.join();
    }

}