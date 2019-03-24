
package Model;

/**
 *
 * @author Kevin Alux
 */
public final class User {
    private String value;
    private String psw;
    private String email;

    public User(String value, String psw) {
        this.value = value;
        this.psw = psw;
    }
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
    
    public String getValue() {
        return value;
    }

    /**
     * @param name the name to set
     */
    public void setValue(String name) {
        this.value = name;
    }
}
