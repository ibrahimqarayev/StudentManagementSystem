package service.inter;



public abstract interface Process {

    public abstract void processLogic();

    public default void process() {
        processLogic();
    }

}
