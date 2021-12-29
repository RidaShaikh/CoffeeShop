/*
This is Employee class for Employee object that implements Serialiazable interface
for manipulating with files
 */
package coffeshop;

import java.io.Serializable;

public class Employee implements Serializable {
    
    private String name;
    private String email;
    private String gender;
    private String mobile;
    private String address;
    private String password;
    
    public Employee(String name, String email, String gender,
            String mobile, String address, String password) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.mobile = mobile;
        this.address = address;
        this.password = password;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getGender() {
        return this.gender;
    }
    public String getMobile() {
        return this.mobile;
    }
    public String getAddress() {
        return this.address;
    }
    public String getPassword() {
        return this.password;
    }
}
