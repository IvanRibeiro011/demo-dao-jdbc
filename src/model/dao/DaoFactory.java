package model.dao;

import db.DB;
import model.dao.impl.SellerDaoImplJdbc;

public class DaoFactory {

	public static SellerDao CreateSellerDao() {
		return new SellerDaoImplJdbc(DB.getConnection());
	}
}
