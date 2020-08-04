package Classes;

public class Test {
    private int ID;
    private String Owner;

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    @Override
    public String toString() {
        return "Test [ID=" + ID + ", Owner=" + Owner + "]";
    }

    public Test(int id, String owner) {
        ID = id;
        Owner = owner;
    }

    public Test(String owner) {
        Owner = owner;
    }

}