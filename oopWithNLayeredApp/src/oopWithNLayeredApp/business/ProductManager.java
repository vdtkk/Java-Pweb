package oopWithNLayeredApp.business;


import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	
	//istediler ki aynı anda yazılam 3 yere loglama için
	
	private List<Logger> loggers;
	
	
	
public ProductManager(ProductDao productDao,List<Logger> loggers) {
		super();
		this.productDao = productDao;
		this.loggers =loggers;
	}




public void add(Product product) throws Exception {
	
	//iş kuralları
	
	if(product.getUnitPrice()<10)
	{
		//buraya girerse hata mesajı döndürmek için kullanılır.
		//hata mesajı dönerse uygulama durur
		
		throw new Exception("ürün fiyatı 10dan küçük olamaz"); 
		
	}
	
	for(Logger logger:loggers) {
		
	logger.log(product.getName());	
		
	}
	//ProductDao productDao=new  JdbcProductDao();
	productDao.add(product);
}
}
