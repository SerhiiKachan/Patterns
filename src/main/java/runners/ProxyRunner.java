package runners;

import patterns.structural.proxy.ElectricLockContainerProxy;
import patterns.structural.proxy.SecureContainer;

public class ProxyRunner {

    public static void main(String[] args) {
        SecureContainer electricLock = new ElectricLockContainerProxy("qwerty");
        electricLock.viewContent();
        electricLock.lock();
        electricLock.viewContent();
        electricLock.unlock();
//        electricLock.enterPassword("qwertyuiop");
//        electricLock.enterPassword("qwerty");
//        electricLock.unlock();
        electricLock.viewContent();
    }
}
