package ru.site.zzz.varioustopics;

public class Man2 extends BaseInfo {

	public Man2(String name, int height, int weight, ru.site.zzz.varioustopics.ColorEye colorEye,
			ru.site.zzz.varioustopics.ColorSkin colorSkin) {
		super(name, height, weight, colorEye, colorSkin);
	}

	public boolean isReadyToDoctor () {
		if (age > 20) {
			return true;
		} else {
			return false;
		}
	}
	
}