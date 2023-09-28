package GangOfFour.ChainOfResponsibility.Logger;

public abstract class AbstractLogger {
    protected int level;

    //next element in chain or responsibility
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }


    public void logMessageSingle(int level, String message) {
        if (this.level == level) {
            write(message);
        } else if (nextLogger != null) {
            nextLogger.logMessageSingle(level, message);
        } else {
            System.out.println("No logger found for level: " + level);
        }
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }


    public void printChain() {
        if (nextLogger != null) {
        System.out.print("["+this.getClass().getSimpleName() + "::" + level+"] -> ");
            nextLogger.printChain();
        }else {
            System.out.println("["+this.getClass().getSimpleName() + "::" + level+"]");
        }
    }

    abstract protected void write(String message);

}


