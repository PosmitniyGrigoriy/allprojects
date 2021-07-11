package ru.site.zzz.collectionsfood;

import static ru.site.zzz.collectionsfood.FoodUtils.collectFoodToMap;
import static ru.site.zzz.collectionsfood.FoodUtils.addSetsByTypesToMap;
import static ru.site.zzz.collectionsfood.FoodUtils.numberOfProductsOfEachTypeCounted;
import static ru.site.zzz.collectionsfood.FoodUtils.creatingListOfProductsFromMap;
import static ru.site.zzz.collectionsfood.FoodUtils.creatingMultipleProductNames;
import static ru.site.zzz.collectionsfood.TestEntities.getListFoods;
import static ru.site.zzz.collectionsfood.TestEntities.getMapFoods;

public class Start {

	public static void main(String[] args) {
		
		collectFoodToMap(getListFoods());
		addSetsByTypesToMap(getListFoods());
		numberOfProductsOfEachTypeCounted(getListFoods());
		creatingListOfProductsFromMap(getMapFoods());
		creatingMultipleProductNames(getMapFoods());
		
	}

}
