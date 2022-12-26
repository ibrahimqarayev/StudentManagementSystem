package service.menu.inter;

public interface MenuService {

    default void process() {
        processAbstract();
    }

    public abstract void processAbstract();
}
