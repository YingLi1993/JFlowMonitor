/*
 * This file is written by reyoung, reyoung@126.com.
 */

package Logic;
import Network.IPacket;
/**
 *
 * @author Reyoung
 */
public interface IPacketFilter {
    public boolean check(IPacket packet,ICernetReader cernetAddressReader);
}
