package commons;

public class Resource {
    private int buffer;
    private int bufferSize;

    public Resource() {

    }

    public Resource(int buffer, int bufferSize) {
        this.buffer = buffer;
        this.bufferSize = bufferSize;
    }

    public synchronized void produce() {
        setBuffer(getBuffer() + 1);
    }

    public synchronized void consume() {
        setBuffer(getBuffer() - 1);
    }

    public int getBuffer() {
        return buffer;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }

    public int getBufferSize() {
        return bufferSize;
    }

    public void setBufferSize(int bufferSize) {
        this.bufferSize = bufferSize;
    }
}
