import java.sql.SQLException;

public interface ItemMasterDAO {
ItemMaster get(int id) throws SQLException;
	
	
	int insert(ItemMaster itemMaster) throws SQLException;
	
	int delete(ItemMaster itemMaster) throws SQLException;
	
	int update(ItemMaster itemMaster) throws SQLException;
}
