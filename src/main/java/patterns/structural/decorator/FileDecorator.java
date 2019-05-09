package patterns.structural.decorator;

public abstract class FileDecorator implements Data {

    protected Data data;

    public FileDecorator(Data data) {
        this.data = data;
    }
}
