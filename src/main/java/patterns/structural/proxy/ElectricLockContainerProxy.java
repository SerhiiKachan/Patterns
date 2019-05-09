package patterns.structural.proxy;

import static java.util.Objects.isNull;
import static enums.LockStatus.LOCKED;
import static enums.LockStatus.UNLOCKED;

public class ElectricLockContainerProxy implements SecureContainer {

    private ElectricLockContainer electricLockContainer;
    private final String originalPassword;

    public ElectricLockContainerProxy(String password) {
        originalPassword = password;
    }

    @Override
    public void lock() {
        ensureLockCreated();
        System.out.println("Current: " + electricLockContainer.getLockStatus().getLocked() + " - LOCKING...");
        electricLockContainer.setLockStatus(LOCKED);
    }

    @Override
    public void unlock() {
        ensureLockCreated();
        System.out.println("Current: " + electricLockContainer.getLockStatus().getLocked() + " - UNLOCKING...");
        electricLockContainer.setLockStatus(UNLOCKED);
    }

    @Override
    public void enterPassword(String password) {
        System.out.println("No need to enter password, it is saved to the system");
    }

    @Override
    public void viewContent() {
        ensureLockCreated();
        System.out.println("Current: " + electricLockContainer.getLockStatus().getLocked() + " - VIEWING CONTENT...");
        if (electricLockContainer.getLockStatus().getLocked().equals("unlocked")) {
            System.out.println("{");
            electricLockContainer.getContent().forEach(System.out::println);
            System.out.println("}");
        } else
            System.out.println("Unlock the container to view the content");
    }

    private void ensureLockCreated() {
        if (isNull(electricLockContainer))
            electricLockContainer = new ElectricLockContainer(originalPassword);
    }
}
