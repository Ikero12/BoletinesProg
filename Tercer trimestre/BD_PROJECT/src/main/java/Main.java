import DB.*;

public class Main {
    public static void main(String[] args) {
    Connect.connection();
    //CreateTable.createNewTable("Personas");
    Insert.insert("Personas",3,"sumorenito","19191919A");
    Select.selectSimple();


    }
}