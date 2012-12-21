package org.exoplatform.MBean.tqa;


import org.exoplatform.container.ExoContainerContext;
import org.exoplatform.container.PortalContainer;
import org.jboss.cache.jmx.ResourceDMBean;
import org.picocontainer.Startable;

import javax.management.MBeanAttributeInfo;
import javax.management.MBeanInfo;
import javax.management.MBeanServer;
import javax.management.ObjectName;

/**
 * Created by IntelliJ IDEA.
 * User: Tleti
 * Date: 26/11/12
 * Time: 17:45
 * To change this template use File | Settings | File Templates.
 */

public class CacheTqa implements Startable {
    static PortalContainer portalContainer;
    MBeanServer mBeanServer;

    public CacheTqa(PortalContainer portalContainer) throws Exception {
        this.portalContainer = portalContainer;
    }

    public void start() {
        try {
            System.out.println();
            System.out.println();

            mBeanServer = ExoContainerContext.getTopContainer().getMBeanServer();
            UserAnnotation user = new UserAnnotation(10, 3);
            ResourceDMBean resourceDMBean = new ResourceDMBean(user);
            ObjectName id = new ObjectName("exo:portal=\"portal\",repository=\"trainingResourceDMBean\"");
            mBeanServer.registerMBean(resourceDMBean, id);
            System.out.println("ResourceDMBean created");
            System.out.println();
            MBeanInfo info = mBeanServer.getMBeanInfo(id);
            MBeanAttributeInfo[] attri = info.getAttributes();
            for (int i = 0; i < attri.length; i++) {
                System.out.println("#################" + attri[i].toString());
            }

            /////////////////////////////////////////////

            User user2 = new User(10, 3, UserMBean.Mood.HAPPY);
            ObjectName id2 = new ObjectName("exo:portal=\"portal\",repository=\"trainingMBean\"");
            mBeanServer.registerMBean(user2, id2);
            System.out.println("MBean created");
            System.out.println();
            MBeanInfo info2 = mBeanServer.getMBeanInfo(id2);
            MBeanAttributeInfo[] attri2 = info2.getAttributes();
            for (int i = 0; i < attri2.length; i++) {
                System.out.println("#################" + attri2[i].toString());
            }

        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }


    public void stop() {
    }
}


