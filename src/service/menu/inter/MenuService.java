package service.menu.inter;

import bean.Config;

public interface MenuService {

    default void process() {
        processAbstract();
        Config.save();
    }

    public abstract void processAbstract();
}
