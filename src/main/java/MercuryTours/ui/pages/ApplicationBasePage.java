package MercuryTours.ui.pages;

import MercuryTours.ui.components.SideMenu;
import MercuryTours.ui.components.TopMenu;

/**
 * ApplicationBasePage class
 *
 * @author Limbert Vargas
 * @version 1.0
 */
public abstract class ApplicationBasePage extends Base {

    private TopMenu topMenu;
    private SideMenu sideMenu;

    public ApplicationBasePage() {
        super();
        topMenu = new TopMenu();
        sideMenu = new SideMenu();
    }

       public TopMenu getTopMenu() {
        return topMenu;
    }

    public SideMenu getSideMenu() {
        return sideMenu;
    }
}
