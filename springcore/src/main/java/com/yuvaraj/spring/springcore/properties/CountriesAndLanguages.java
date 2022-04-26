package com.yuvaraj.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLanguages {
	private Properties countriesAndLangs;

	public Properties getCountriesAndLangs() {
		return countriesAndLangs;
	}

	public void setCountriesAndLangs(Properties countriesAndLangs) {
		this.countriesAndLangs = countriesAndLangs;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguages [countriesAndLangs=" + countriesAndLangs + "]";
	}
}
