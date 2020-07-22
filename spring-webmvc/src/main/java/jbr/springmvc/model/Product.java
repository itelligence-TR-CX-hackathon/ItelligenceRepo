package jbr.springmvc.model;

public class Product {

	private int id;
	private String productName;
	private String productDetail;
	private int productPrice;
	private int categoryId;

	public Product() {
		super();
	}

	public Product(int id, String productName, String productDetail, int productPrice, int categoryId) {
		super();
		this.id = id;
		this.productName = productName;
		this.productDetail = productDetail;
		this.productPrice = productPrice;
		this.categoryId = categoryId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
