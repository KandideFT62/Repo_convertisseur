package fr.bdpedia.modeles;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Temperature implements Serializable {
	
	//
	private double temp;
	private String fonction;

	public Temperature() {
		super();
	}
	public Temperature(double temp, String fonction) {
		this.temp = temp;
		this.fonction = fonction;
	}
	//
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	//
	public String getResult() {
		double res = 0.0;
		if (fonction.equals("getCelsiusFromFarenheit")){
			res = (temp - 32) * 5/9;
		}else if(fonction.equals("getCelsiusFromKelvin")) {
			res = (temp + 273.15);
		}else if(fonction.equals("getFarenheitFromCelsius")) {
			res = (temp * 9/5) + 32;
		}else if(fonction.equals("getFarenheitFromKelvin")) {
			res = (temp * 9/5) + 523.67;
		}else if(fonction.equals("getKelvinFromCelsius")) {
			res = (temp - 273.15);
		}else if(fonction.equals("getKelvinFromFarenheit")) {
			res= (temp - 523.67) * 5/9;
		}
		DecimalFormat df = new DecimalFormat("0.0");
		return df.format(res);
	}
}
