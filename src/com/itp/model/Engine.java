package com.itp.model;

public class Engine {

		private int engineLitre;
		private int engineCC;
		private String engineType;
		private String engineMfgName;
		
		public Engine() {} //no args constructor
		
		public Engine(int engineLitre, int engineCC, String engineType, String engineMfgName)//All Args Constructor 
		{
			this.engineLitre = engineLitre;
			this.engineCC = engineCC;
			this.engineType = engineType;
			this.engineMfgName = engineMfgName;
			System.out.println("Engine All Args constructor called");
		}
		
		public Engine(int engineLitre, int engineCC, String engineType)//All Args Constructor 
		{
			this.engineLitre = engineLitre;
			this.engineCC = engineCC;
			this.engineType = engineType;
		}
		
		public Engine(Engine temp)//Copy Constructor 
		{
			this.engineLitre = temp.engineLitre;
			this.engineCC = temp.engineCC;
			this.engineType = temp.engineType;
			this.engineMfgName = temp.engineMfgName;
		}

		@Override
		public String toString() {
			return "Engine [engineLitre=" + engineLitre + ", engineCC=" + engineCC + ", engineType=" + engineType
					+ ", engineMfgName=" + engineMfgName + "]";
		}

		public int getEngineLitre() {
			return engineLitre;
		}

		public void setEngineLitre(int engineLitre) {
			this.engineLitre = engineLitre;
		}

		public int getEngineCC() {
			return engineCC;
		}

		public void setEngineCC(int engineCC) {
			this.engineCC = engineCC;
		}

		public String getEngineType() {
			return engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

		public String getEngineMfgName() {
			return engineMfgName;
		}

		public void setEngineMfgName(String engineMfgName) {
			this.engineMfgName = engineMfgName;
		}
		
}
