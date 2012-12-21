package org.exoplatform.MBean.tqa;

/**
 * Created by IntelliJ IDEA.
 * User: tlili
 * Date: 20/12/12
 * Time: 09:47
 * To change this template use File | Settings | File Templates.
 */


public interface UserMBean {

    public enum Mood {
        HAPPY, SAD, INDIFFERENT
    }

    int getAge();

    void setAge(int age);

    int getIduser();

    void setIduser(int name);

    String getMood();

    void makeSad();

}
