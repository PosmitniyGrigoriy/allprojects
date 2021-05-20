package ru.site.collectionsfood;

import static ru.site.collectionsfood.FoodUtils.collectFoodToMap;
import static ru.site.collectionsfood.FoodUtils.addSetsByTypesToMap;
import static ru.site.collectionsfood.TestEntities.getListFoods;

public class Start {

	public static void main(String[] args) {
		
		collectFoodToMap(getListFoods());
		addSetsByTypesToMap(getListFoods());
		
	}

}
