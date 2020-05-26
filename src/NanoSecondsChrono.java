public class NanoSecondsChrono {
    private long start;
    private long end;
    private long interval;

    public long getInterval() {
        if(this.start == -1 || this.end == -1){
            return -1;
        }
        this.interval = (this.end - this.start);
        return this.interval;
    }

    public void start(){
        this.start = timeStamp();
    }

    public void stop(){
        this.end = timeStamp();
    }

    private long timeStamp(){
        return System.nanoTime();
    }

    public void reset() {
        this.start = -1;
        this.end = -1;
        this.interval = -1;
    }
    
}