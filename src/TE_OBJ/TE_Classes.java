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
		public void setAgentId(int agentID) {
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

		//Attributes.
		private int agentId;
		private String agtFirstName;
		private String agtMiddleInitials;
		private String agtLastName;
		private String agtBusPhone;
		private String agtEmail;
		private String agtPosition;
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
}
