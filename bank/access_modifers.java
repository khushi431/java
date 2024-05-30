import java.util.*;package newpackage;
package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;

    }

}

public class access_modifers {
    public static void main(String args[]) {
        Account a1 = new Account();
        a1.name = "Apna College";
        a1.setPassword("abcd");
        a1.email = "hello@apnacollege.com";
        System.out.println(account1.getPassword());
    }
}
