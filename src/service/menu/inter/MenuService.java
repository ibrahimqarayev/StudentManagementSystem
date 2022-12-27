package service.menu.inter;

import bean.Config;

public interface MenuService {

    default void processSave() {
        processAbstract();
        Config.save();
    }

    default void process() {
        processAbstractSave();
    }

    public abstract void processAbstract();

    public abstract void processAbstractSave();
}
