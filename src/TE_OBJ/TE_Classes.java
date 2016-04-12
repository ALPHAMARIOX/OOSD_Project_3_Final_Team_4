package TE_OBJ;

import java.util.Calendar;

public class TE_Classes {
	
	public class Agent {
		
		//Constructor.
		public Agent(){
			
		}
		
		//Properties.
		public int getAgentId() {
			return agentId;
		}
		public void setAgentId(int agentId) {
			this.agentId = agentId;
		}
		public String getAgtFirstName() {
			return agtFirstName;
		}
		public void setAgtFirstName(String agtFirstName) {
			this.agtFirstName = agtFirstName;
		}
		public String getAgtMiddleInitials() {
			return agtMiddleInitials;
		}
		public void setAgtMiddleInitials(String agtMiddleInitials) {
			this.agtMiddleInitials = agtMiddleInitials;
		}
		public String getAgtLastName() {
			return agtLastName;
		}
		public void setAgtLastName(String agtLastName) {
			this.agtLastName = agtLastName;
		}
		public String getAgtBusPhone() {
			return agtBusPhone;
		}
		public void setAgtBusPhone(String agtBusPhone) {
			this.agtBusPhone = agtBusPhone;
		}
		public String getAgtEmail() {
			return agtEmail;
		}
		public void setAgtEmail(String agtEmail) {
			this.agtEmail = agtEmail;
		}
		public String getAgtPosition() {
			return agtPosition;
		}
		public void setAgtPosition(String agtPosition) {
			this.agtPosition = agtPosition;
		}
		public int getAgencyId() {
			return agencyId;
		}
		public void setAgencyId(int agencyId) {
			this.agencyId = agencyId;
		}
		public String getAgtUsername() {
			return agtUsername;
		}
		public void setAgtUsername(String agtUsername) {
			this.agtUsername = agtUsername;
		}
		public String getAgtPassword() {
			return agtPassword;
		}
		public void setAgtPassword(String agtPassword) {
			this.agtPassword = agtPassword;
		}

		//Attributes.
		private int agentId;
		private String agtFirstName;
		private String agtMiddleInitials;
		private String agtLastName;
		private String agtBusPhone;
		private String agtEmail;
		private String agtPosition;
		private int agencyId;
		private String agtUsername;
		private String agtPassword;
	}
	
	public class Package {
		
		//Constructor.
		public Package(){
			
		}
		
		//Properties.
		public int getPackageId() {
			return packageId;
		}
		public void setPackageId(int packageId) {
			this.packageId = packageId;
		}
		public String getPkgName() {
			return pkgName;
		}
		public void setPkgName(String pkgName) {
			this.pkgName = pkgName;
		}
		public Calendar getPkgStartDate() {
			return pkgStartDate;
		}
		public void setPkgStartDate(Calendar pkgStartDate) {
			this.pkgStartDate = pkgStartDate;
		}
		public Calendar getPkgEndDate() {
			return pkgEndDate;
		}
		public void setPkgEndDate(Calendar pkgEndDate) {
			this.pkgEndDate = pkgEndDate;
		}
		public String getPkgDesc() {
			return pkgDesc;
		}
		public void setPkgDesc(String pkgDesc) {
			this.pkgDesc = pkgDesc;
		}
		public double getPkgBasePrice() {
			return pkgBasePrice;
		}
		public void setPkgBasePrice(double pkgBasePrice) {
			this.pkgBasePrice = pkgBasePrice;
		}
		public double getPkgAgencyCommission() {
			return pkgAgencyCommission;
		}
		public void setPkgAgencyCommission(double pkgAgencyCommission) {
			this.pkgAgencyCommission = pkgAgencyCommission;
		}

		//Attributes.
		private int packageId;
		private String pkgName;
		private Calendar pkgStartDate;
		private Calendar pkgEndDate;
		private String pkgDesc;
		private double pkgBasePrice;
		private double pkgAgencyCommission;
	}
	
	public class ProductSupplier
    {
		//Constructor.
		public ProductSupplier() {
			
		}
		
		//Properties.
        public int getProductSupplierId() { 
        	return productSupplierId;
        }
        public void setProductSupplierId(int productSupplierId) {
        	this.productSupplierId = productSupplierId;
        }
        public Product getMyProduct() { 
        	return myProduct;
        }
        public void setMyProduct(Product myProduct) {
        	this.myProduct = myProduct;
        }
        public Supplier getMySupplier() { 
        	return mySupplier;
        }
        public void setMySupplier(Supplier mySupplier) {
        	this.mySupplier = mySupplier;
        }
        
        private int productSupplierId;
        private Product myProduct;
        private Supplier mySupplier;
        
        //Scrap yard of unused constructors from C#.
        //public int ProductId { get; set; }
        //public int SupplierId { get; set; }
        //public string SupName { get; set; }
        //public string ProdName { get; set; }
    }
	
	public class Product
    {
        //Constructor.
		public Product() {
			
		}
		
		//Class attributes.
        private int productId;
        private String prodName;

        //Class properties.
        public int getProductId() { 
        	return productId;
        }
        public void setProductId(int productId) {
        	this.productId = productId;
        }
        public String getProdName() { 
        	return prodName;
        }
        public void setProdName(String prodName) {
        	this.prodName = prodName;
        }
    }
	
	public class Supplier
    {
        //Constructor.
		public Supplier() {
			
		}
		
		//Class attributes.
        private int supplierId;
        private String supName;

        //Class properties.
        public int getSupplierId() { 
        	return supplierId;
        }
        public void setSupplierId(int supplierId) {
        	this.supplierId = supplierId;
        }
        public String getSupName() { 
        	return supName;
        }
        public void setSupName(String supName) {
        	this.supName = supName;
        }
    }
	
	public class Customer
	{
		//Constructor.
		public Customer() {
			
		}
		
		//Class attributes.
		private int customerId;
		private String custFirstName;
		private String custLastName;
		private String custAddress;
		private String custCity;
		private String custProv;
		private String custPostal;
		private String custHomePhone;
		private String custBusPhone;
		private String custEmail;
		private String custPassword;
		private int agtId;
		
		//Properties.
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustFirstName() {
			return custFirstName;
		}
		public void setCustFirstName(String custFirstName) {
			this.custFirstName = custFirstName;
		}
		public String getCustLastName() {
			return custLastName;
		}
		public void setCustLastName(String custLastName) {
			this.custLastName = custLastName;
		}
		public String getCustAddress() {
			return custAddress;
		}
		public void setCustAddress(String custAddress) {
			this.custAddress = custAddress;
		}
		public String getCustCity() {
			return custCity;
		}
		public void setCustCity(String custCity) {
			this.custCity = custCity;
		}
		public String getCustProv() {
			return custProv;
		}
		public void setCustProv(String custProv) {
			this.custProv = custProv;
		}
		public String getCustPostal() {
			return custPostal;
		}
		public void setCustPostal(String custPostal) {
			this.custPostal = custPostal;
		}
		public String getCustHomePhone() {
			return custHomePhone;
		}
		public void setCustHomePhone(String custHomePhone) {
			this.custHomePhone = custHomePhone;
		}
		public String getCustBusPhone() {
			return custBusPhone;
		}
		public void setCustBusPhone(String custBusPhone) {
			this.custBusPhone = custBusPhone;
		}
		public String getCustEmail() {
			return custEmail;
		}
		public void setCustEmail(String custEmail) {
			this.custEmail = custEmail;
		}
		public String getCustPassword() {
			return custPassword;
		}
		public void setCustPassword(String custPassword) {
			this.custPassword = custPassword;
		}
		public int getAgtId() {
			return agtId;
		}
		public void setAgtId(int agtId) {
			this.agtId = agtId;
		}
	}
}
