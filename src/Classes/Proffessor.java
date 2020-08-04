package Classes;

public class Proffessor {
    private String Name;
    private int ID;

    public Proffessor(){
        
    }

    public Proffessor(String name){
        this.Name = name;
    }

    public Proffessor(Proffessor p){
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