import java.sql.SQLException;

public interface CustomerMasterDAO {
	CustomerMaster get(int id) throws SQLException;
	
	
	int insert(CustomerMaster customerMaster) throws SQLException;
	
	int delete(CustomerMaster customerMaster) throws SQLException;
	
	int update(CustomerMaster customerMaster) throws SQLException;
}
