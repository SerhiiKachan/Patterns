package patterns.structural.proxy;

public interface SecureContainer {
    void lock();
    void unlock();
    void enterPassword(String password);
    void viewContent();
}
