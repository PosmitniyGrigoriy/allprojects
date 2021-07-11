package ru.site.zzz.car;

public class CarMans extends Car {

	@Override
	public int drive (int howlong) {
		
		distance = howlong * 180;
		return distance;
	}
	
}
