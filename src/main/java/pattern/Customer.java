package pattern;

public class Customer {

    private String username;
    private String passwd;
    private String fName;
    private String lName;
    private String role;
    private String team;
    public Customer (String username, String passwd, String fName, String lName, String role, String team) {
        this.username = username;
        this.passwd = passwd;
        this.fName = fName;
        this.lName = lName;
        this.role = role;
        this.team = team;
    }

    public String getUsername() {
        return username;
    }

        public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "username='" + username + '\'' +
                ", password='" + passwd + '\'' +
                ", first name='" + fName + '\'' +
                ", last name='" + lName + '\'' +
                ", role='" + role + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}