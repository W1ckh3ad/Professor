package Classes;

public class Professor {
    private String Name;
    private int ID;

    public Professor(){
        
    }

    public Professor(String name){
        this.Name = name;
    }

    public Professor(Professor p){
        this.Name = p.Name;
        this.ID = p.ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    @Override
    public String toString() {
        return "Proffessor " + this.Name;
    }
}