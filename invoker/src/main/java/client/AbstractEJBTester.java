package client;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class AbstractEJBTester {
    protected BufferedReader brConsoleReader = null;
    protected InitialContext ctx;

    {
        Properties properties = new Properties();
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("jndi.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
//        properties.put(Context.PROVIDER_URL, "remote://localhost:4447");
//        properties.put(Context.SECURITY_PRINCIPAL, "au");
//        properties.put(Context.SECURITY_CREDENTIALS, "ua");
//        properties.put("jboss.naming.client.ejb.context", true);
        try {
            ctx = new InitialContext(properties);
        } catch (NamingException e) {
            e.printStackTrace();
        }
        brConsoleReader =
                new BufferedReader(new InputStreamReader(System.in));
    }
}
