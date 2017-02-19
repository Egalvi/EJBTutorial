package client.timer;

import client.AbstractEJBTester;
import ru.egalvi.test.timer.TimerSessionBeanRemote;

import javax.naming.NamingException;
import java.util.Date;

public class EJBTester extends AbstractEJBTester {

    public static void main(String[] args) {

        EJBTester ejbTester = new EJBTester();

        ejbTester.testTimerService();
    }

    private void testTimerService() {
        try {
            TimerSessionBeanRemote timerServiceBean = (TimerSessionBeanRemote) ctx.lookup("javaee7-ejb-tutorial-1.0-SNAPSHOT/TimerSessionBean!ru.egalvi.test.timer.TimerSessionBeanRemote");

            System.out.println("[" + (new Date()).toString() + "]" + "timer created.");
            timerServiceBean.createTimer(2000);
            //The output will be printed in server log

        } catch (NamingException ex) {
            ex.printStackTrace();
        }
    }
}