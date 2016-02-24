package TE_OBJ;

public class TE_Classes {
	
	public class Agent {
		
		//Constructor.
		public Agent(){
			
		}
		
		//Properties.
		private int agentID;
		public int getAgentID() {
			return agentID;
		}
		public void setAgentID(int agentID) {
			this.agentID = agentID;
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
	}
}
