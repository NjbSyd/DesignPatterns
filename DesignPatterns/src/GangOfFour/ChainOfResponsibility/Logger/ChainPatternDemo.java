package GangOfFour.ChainOfResponsibility.Logger;

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger consoleLogger = new ConsoleLogger(LogTypes.INFO);
        AbstractLogger fileLogger = new FileLogger(LogTypes.DEBUG);
        AbstractLogger databaseLogger = new DatabaseLogger(LogTypes.WARNING);
        AbstractLogger errorLogger = new ErrorLogger(LogTypes.ERROR);

        errorLogger.setNextLogger(databaseLogger);
        databaseLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    private static AbstractLogger getSingleLogSkipOthersLogger() {

        AbstractLogger consoleLogger = new ConsoleLogger(LogTypes.INFO);
        AbstractLogger databaseLogger = new DatabaseLogger(LogTypes.WARNING);
        AbstractLogger errorLogger = new ErrorLogger(LogTypes.ERROR);

        consoleLogger.setNextLogger(databaseLogger);
        databaseLogger.setNextLogger(errorLogger);
        return consoleLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        System.out.println("\nLogger chain:");
        loggerChain.printChain();
        System.out.println("\nWith level: 1:INFO");
        loggerChain.logMessage(LogTypes.INFO, "Information Message.");
        System.out.println("\nWith level: 2:DEBUG");
        loggerChain.logMessage(LogTypes.DEBUG, "Debug Message.");
        System.out.println("\nWith level: 3:WARNING");
        loggerChain.logMessage(LogTypes.WARNING, "Warning Message.");
        System.out.println("\nWith level: 4:ERROR");
        loggerChain.logMessage(LogTypes.ERROR, "Error Message.");


        AbstractLogger singleLogSkipOthersLogger = getSingleLogSkipOthersLogger();
        System.out.println("\nLogger chain:");
        singleLogSkipOthersLogger.printChain();
        System.out.println("\nWith level: 1:INFO");
        singleLogSkipOthersLogger.logMessageSingle(LogTypes.INFO, "Information Message.");
        System.out.println("\nWith level: 2:DEBUG");
        singleLogSkipOthersLogger.logMessageSingle(LogTypes.DEBUG, "Debug Message.");
        System.out.println("\nWith level: 3:WARNING");
        singleLogSkipOthersLogger.logMessageSingle(LogTypes.WARNING, "Warning Message.");
        System.out.println("\nWith level: 4:ERROR");
        singleLogSkipOthersLogger.logMessageSingle(LogTypes.ERROR, "Error Message.");

    }
}
