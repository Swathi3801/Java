public class User 
{
    private int userid;
    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
    private String usertype;

User(int userid,String username,String password,String email,String firstname,String lastname,String usertype)
{
    this.userid=userid;
    this.username=username;
    this.password=password;
    this.email=email;
    this.firstname=firstname;
    this.lastname=lastname;
    this.usertype=usertype;
}

public int getUserid() {
    return userid;
}

public void setUserid(int userid) {
    this.userid = userid;
}

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getFirstname() {
    return firstname;
}

public void setFirstname(String firstname) {
    this.firstname = firstname;
}

public String getLastname() {
    return lastname;
}

public void setLastname(String lastname) {
    this.lastname = lastname;
}

public String getUsertype() {
    return usertype;
}

public void setUsertype(String usertype) {
    this.usertype = usertype;
}

@Override
public String toString() {
    return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", email=" + email
            + ", firstname=" + firstname + ", lastname=" + lastname + ", usertype=" + usertype + "]";
}

}