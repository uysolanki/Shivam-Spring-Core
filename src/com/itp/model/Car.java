package com.itp.model;

public class Car {
			private String carMfgName;
			private String carModel;
			private double carPrice;
			private String carColor;
			
			private Engine itpengine;
			private Gear itpgear;
			
			public Car() {}
			public Car(String carMfgName, String carModel, double carPrice, String carColor, Engine itpengine,
					Gear itpgear) {
				this.carMfgName = carMfgName;
				this.carModel = carModel;
				this.carPrice = carPrice;
				this.carColor = carColor;
				this.itpengine = itpengine;
				this.itpgear = itpgear;
			}
			
			public Car(String carMfgName, String carModel, double carPrice, String carColor) {
				this.carMfgName = carMfgName;
				this.carModel = carModel;
				this.carPrice = carPrice;
				this.carColor = carColor;
			}
			public String getCarMfgName() {
				return carMfgName;
			}
			public void setCarMfgName(String carMfgName) {
				this.carMfgName = carMfgName;
			}
			public String getCarModel() {
				return carModel;
			}
			public void setCarModel(String carModel) {
				this.carModel = carModel;
			}
			public double getCarPrice() {
				return carPrice;
			}
			public void setCarPrice(double carPrice) {
				this.carPrice = carPrice;
			}
			public String getCarColor() {
				return carColor;
			}
			public void setCarColor(String carColor) {
				this.carColor = carColor;
			}
			public Engine getItpengine() {
				return itpengine;
			}
			public void setItpengine(Engine itpengine) {
				this.itpengine = itpengine;
			}
			public Gear getItpgear() {
				return itpgear;
			}
			public void setItpgear(Gear itpgear) {
				this.itpgear = itpgear;
			}
			@Override
			public String toString() {
				return "Car [carMfgName=" + carMfgName + ", carModel=" + carModel + ", carPrice=" + carPrice
						+ ", carColor=" + carColor + ", itpengine=" + itpengine + ", itpgear=" + itpgear + "]";
			}
			
			
			
			
}
