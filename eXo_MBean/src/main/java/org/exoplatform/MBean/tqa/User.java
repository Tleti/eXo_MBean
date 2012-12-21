package org.exoplatform.MBean.tqa;

/**
 * Created by IntelliJ IDEA.
 * User: tlili
 * Date: 20/12/12
 * Time: 09:48
 * To change this template use File | Settings | File Templates.
 */


public class User implements UserMBean {
    private int Age;
    private int Iduser;
    private Mood Mood;

    public User(int Name, int Iduser, Mood Mood) {
        this.Iduser = Name;
        this.Age = Iduser;
        this.Mood = Mood;
    }

    @Override
    public int getIduser() {
        return Iduser;
    }

    @Override
    public int getAge() {
        return Age;
    }

    @Override
    public void setIduser(int Iduser) {
        this.Iduser = Iduser;
    }

    @Override
    public void setAge(int age) {
        this.Age = age;
    }

    @Override
    public String getMood() {
        return Mood.toString();
    }

    @Override
    public void makeSad() {
        Mood = Mood.SAD;
    }

}
