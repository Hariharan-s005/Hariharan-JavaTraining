import java.sql.SQLException;

public interface InvoiceMasterDAO {
	
	InvoiceMaster get(int id) throws SQLException;
	
	
	int insert(InvoiceMaster invoiceMaster) throws SQLException;
	
	int delete(InvoiceMaster invoicemMaster) throws SQLException;
	
	int update(InvoiceMaster invoicemMaster) throws SQLException;
}
