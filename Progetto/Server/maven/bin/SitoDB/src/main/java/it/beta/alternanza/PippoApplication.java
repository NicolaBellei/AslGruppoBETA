package it.beta.alternanza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.pippo.core.Application;
import ro.pippo.core.route.Route;
import ro.pippo.core.route.RouteContext;
import ro.pippo.core.route.RouteHandler;

/**
 * A simple Pippo application.
 *
 * @see it.beta.alternanza.PippoLauncher#main(String[])
 */
public class PippoApplication extends Application {
    
private boolean authenticate(String username, String password) {
    return !username.isEmpty() && !password.isEmpty();
}
/*
    private final static Logger log = LoggerFactory.getLogger(PippoApplication.class);

*/
    @Override
    protected void onInit() {
        getRouter().ignorePaths("/favicon.ico");

        // send page persona as response
        GET("/persona", routeContext -> {
            routeContext.render("pages/persona");
        });
        GET("/", routeContext -> {
            routeContext.render("index");
        });
        GET("/aggiungipers", routeContext -> {
            routeContext.render("pages/aggiungipers");
        });
        GET("/azienda", routeContext -> {
            routeContext.render("pages/azienda");
        });
        /*
        // authentication filter
GET("/contact.*", routeContext -> {
    if (routeContext.getSession("username") == null) {
        routeContext.setSession("originalDestination", routeContext.getRequest());
        routeContext.redirect("/login");
    } else {
        routeContext.next();
    }
});

// show login page
GET("/login", routeContext -> { 
    routeContext.render("/pages/prova");
        });

// process login submit
POST("/login", routeContext -> {
    String username = routeContext.getParameter("username").toString();
    String password = routeContext.getParameter("password").toString();
    if (authenticate(username, password)) {
        String originalDestination = routeContext.removeSession("originalDestination");
        routeContext.resetSession();

        routeContext.setSession("username", username);
        routeContext.redirect(originalDestination != null ? originalDestination : "/contacts");
    } else {
        routeContext.flashError("Authentication failed");
        routeContext.redirect("/login");
    }
});
*/


    }
}

