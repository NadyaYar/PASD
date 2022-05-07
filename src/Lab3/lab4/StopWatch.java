package Lab3.lab4;

public class StopWatch {
    private long startTime;
        private long endTime;
        private long execTime;
        public StopWatch() {
            this.startTime=0;
            this.endTime=0;
            this.endTime=0;
        }
        public void start() {
            this.startTime=System.currentTimeMillis();
        }
        public void stop() {
            this.endTime=System.currentTimeMillis();
            this.execTime=this.endTime-this.startTime;
            if (this.execTime<0)
                this.execTime=0;
        }
        public long getTime() {
            return this.execTime;
        }
}
