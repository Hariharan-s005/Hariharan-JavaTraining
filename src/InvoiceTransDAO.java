import java.sql.SQLException;

public interface InvoiceTransDAO{
InvoiceTrans get(int id) throws SQLException;
	
	
	int insert(InvoiceTrans invoiceTrans) throws SQLException;
	
	int delete(InvoiceTrans invoiceTrans) throws SQLException;
	
	int update(InvoiceTrans invoiceTrans) throws SQLException;
}