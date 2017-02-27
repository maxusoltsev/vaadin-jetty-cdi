see https://github.com/vaadin/cdi/issues/179

Overrided:
- CDIUIProvider
- VaadinCDIServlet
- VaadinServletService

to use CDI.current().getBeanManager() in CDIUIProvider.getBeanManager():

    public BeanManager getBeanManager() {

        if (beanManager == null) {
            beanManager = CDI.current().getBeanManager();
        }
        if (beanManager == null) {
            beanManager = super.getBeanManager();
        }
        return beanManager;
    }


usage:
run
mvn install -Prun jetty:run
and point your browser to http://localhost:8080/

View maxusoltsev.vaadinjettycdi.MyUI will be injected as @CDIUI