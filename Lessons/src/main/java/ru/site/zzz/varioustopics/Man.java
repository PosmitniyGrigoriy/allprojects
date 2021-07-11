package ru.site.zzz.varioustopics;

public class Man extends BaseInfo {

	public Man(String name, int height, int weight, ru.site.zzz.varioustopics.ColorEye colorEye,
			ru.site.zzz.varioustopics.ColorSkin colorSkin) {
		super(name, height, weight, colorEye, colorSkin);
	}
	
	public boolean isReadyToDoctor () {
		if (age > 22) {
			return true;
		} else {
			return false;
		}
	}
	
}