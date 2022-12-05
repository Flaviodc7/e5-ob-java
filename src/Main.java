public class Main {
    static CocheCRUD cocheCrud = new CocheCRUDImpl();

    public static void main(String[] args) {
        cocheCrud.save();
        cocheCrud.delete();
        cocheCrud.findAll();
    }
}