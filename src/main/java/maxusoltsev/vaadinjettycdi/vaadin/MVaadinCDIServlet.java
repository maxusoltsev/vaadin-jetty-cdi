package maxusoltsev.vaadinjettycdi.vaadin;

import com.vaadin.cdi.server.VaadinCDIServlet;
import com.vaadin.cdi.server.VaadinCDIServletService;
import com.vaadin.server.DeploymentConfiguration;
import com.vaadin.server.ServiceException;
import com.vaadin.server.VaadinServletService;

public class MVaadinCDIServlet extends VaadinCDIServlet{
    @Override
    protected VaadinServletService createServletService(DeploymentConfiguration deploymentConfiguration) throws ServiceException {
        VaadinServletService service = new MVaadinCDIServletService(this,
                deploymentConfiguration);
        service.init();
        return service;

    }
}
