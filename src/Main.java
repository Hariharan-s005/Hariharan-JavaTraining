

import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		
		ItemMasterDAO itemMasterDAO = new ItemMasterDAOImpl();	
		ItemMaster itemMaster = null;
		try {
			itemMaster = itemMasterDAO.get(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(itemMaster.getItemNo()+":"+itemMaster.getItemDes()+":"+itemMaster.getItemPrice()+":"+itemMaster.getItemUnit());
		
		itemMaster.setItemPrice(80000);

		int n=0;
		try {
			n = itemMasterDAO.update(itemMaster);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(n == 1) {
			System.out.println("Succesful");
		}

	}
}
