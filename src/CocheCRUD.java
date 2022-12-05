import java.util.List;

public interface CocheCRUD {

    void save();

    List<Coche> findAll();

    void delete();

}
