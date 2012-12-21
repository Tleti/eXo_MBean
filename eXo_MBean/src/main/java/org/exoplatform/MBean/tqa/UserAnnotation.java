package org.exoplatform.MBean.tqa;

import org.jboss.cache.jmx.annotations.MBean;
import org.jboss.cache.jmx.annotations.ManagedAttribute;
import org.jboss.cache.jmx.annotations.ManagedOperation;

@MBean
public class UserAnnotation {


    @ManagedAttribute
    private int Age;
    @ManagedAttribute
    private int Iduser;


    public UserAnnotation(int Iduser, int Age) {
        this.Iduser = Iduser;
        this.Age = Age;
    }

    @ManagedOperation
    public int getIduser() {
        return Iduser;
    }

    @ManagedOperation
    public int getAge() {
        return Age;
    }

    @ManagedOperation
    public void setIduser(int Iduser) {
        this.Iduser = Iduser;
    }

    @ManagedOperation

    public void setAge(int age) {
        this.Age = age;
    }

    @ManagedOperation

    public void Ageplus() {
        Age++;
    }
}
