

import java.util.Date;

public class InvoiceMaster {
	private int invoiceNo;
	private Date date;
	private int customerId;
	
	InvoiceMaster(int invoiceNo, Date date, int customerId) {
		this.invoiceNo = invoiceNo;
		this.date = date;
		this.customerId = customerId;
	}
	

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public Date getDate() {
		return date;
	}
	public int getCustomerId() {
		return customerId;
	}
}
