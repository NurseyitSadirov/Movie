package clas;

public class Cast {
    private String actorFullName;
    private String Role;


    public Cast(String actorFullName, String role) {
        this.actorFullName = actorFullName;
        Role = role;
    }

    public String getActorFullName() {
        return actorFullName;
    }

    public void setActorFullName(String actorFullName) {
        this.actorFullName = actorFullName;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    @Override
    public String toString() {
        return "Cast{" +
                "actorFullName='" + actorFullName + '\'' +
                ", Role='" + Role + '\''
                ;
    }
}
