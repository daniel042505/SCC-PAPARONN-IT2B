
package receipt;

public class accounts {
    
     int aid;
    String fname, lname, email, user, pass;
    
    public void addaccounts(int id, String Fname, String Lname, String emailAdd, String username, String password){
        this.aid = id;
        this.fname = Fname;
        this.lname = Lname;
        this.email = emailAdd;
        this.user = username;
        this.pass = password;
    }
    
    public void viewaccounts(){
        System.out.printf("%-5d %-10s %-10s %-20s %-10s %-10s\n",aid, fname, lname, email, user, pass);
    }
}

