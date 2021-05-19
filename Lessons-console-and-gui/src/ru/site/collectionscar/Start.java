package ru.site.collectionscar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Start {

	public static void main(String[] args) {
		
		Car car1 = new Car(Model.BMW, 5000, Color.BLACK);
		Car car2 = new Car(Model.AUDI, 3500, Color.BLUE);
		Car car3 = new Car(Model.FIAT, 4000, Color.BLACK);
		Car car4 = new Car(Model.TOYOTA, 3850, Color.WHITE);
		Car car5 = new Car(Model.TOYOTA, 2100, Color.YELLOW);
		Car car6 = new Car(Model.FIAT, 8000, Color.PINK);
		Car car7 = new Car(Model.AUDI, 6400, Color.GREEN);
		
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		cars.add(car7);
		
		// —ортирует автомобили по цене (от меньшей к большей)
//		Comparator priceCar = new PriceCarComparator();
//		Collections.sort(cars, priceCar);
//		System.out.println(cars);
		
		// —ортирует модели автомобилей (от A до Z)
//		Comparator modelCar = new ModelCarComparator();
//		Collections.sort(cars, modelCar);
//		System.out.println(cars);
		
		// —ортирует модели автомобилей (от A до Z), если модели одинаковые, то сортирует по цене (от меньшей к большей)
//		Comparator modelAndPriceCar = new ModelAndPriceCarComparator();
//		Collections.sort(cars, modelAndPriceCar);
//		System.out.println(cars);
		
		// ћножество моделей
		Set<Model> setModel = new HashSet<>();
		for(int i = 0; i < cars.size(); i++) {
			setModel.add(cars.get(i).getModel());
		}
		for(Model m : setModel) {
			System.out.println(m);
		}
		
		
		
		
		
		
		
		/** 
		* 1. ѕройтись по всем автомобил€м.
		* 2. —оздать коллекции с названи€ми моделей.
		* 3. ¬ каждую коллекцию с моделью добавить автомобили.
		*/
		
		
		
//		Map<String, List<Car>> mapCars = new HashMap<>();
//		for(int i = 0; i < cars.size(); i++) {
////			mapCars.get(mapCars)
////			ArrayList<Car> (cars.get(i).model) = new ArrayList<>();
//			System.out.println(mapCars);
//			System.out.println(mapCars.containsKey(cars.get(i).getModel() == null));
//			if(mapCars.containsKey(cars.get(i).getModel() == null)) {
//				System.out.println("ss");
//			} else {
//				mapCars.get(cars.get(i).getModel()).add(cars.get(i));
//			}
//			
////		если map.get(модель машины) == null, то создаЄм список из одного элемента.
////		если map.get(модель машины) != null, то map.get(модель машины).add(новый элемент).
//		}
		
		
		
		
		
		
		
		
		List<Model> array = List.copyOf(setModel);
		
		Map<String, List<Car>> mapCars = new HashMap<>();
		for(int i = 0; i < cars.size(); i++) {
			
			if(mapCars.get(cars.get(i)) == null) {
				
				// –абочий код, но нужно по-другому сделать его, чтобы он работал через switch
//				ArrayList<Car> carsList = new ArrayList<>();
//				carsList.add(car3);
//				carsList.add(car4);
//				mapCars.put("BMW", carsList);
				
				
				
				ArrayList<Car> carsList = new ArrayList<>();
				
				switch(i) {
					case 0:
						System.out.println("000");
						break;
					case 1:
						System.out.println("111");
						break;
					case 2:
						System.out.println("222");
						break;
					case 3:
						System.out.println("333");
						break;
					case 4:
						System.out.println("444");
						break;
					case 5:
						System.out.println("555");
						break;
					case 6:
						System.out.println("666");
						break;
					case 7:
						System.out.println("777");
						break;
					case 8:
						System.out.println("888");
						break;
				}
				
				
				
				
			}
			
			
		}
		System.out.println(mapCars);
		
		
		
//		cars.get(i).getModel()
		
		
		
		ArrayList<Car> bmw = new ArrayList<>();
		ArrayList<Car> toyota = new ArrayList<>();
		ArrayList<Car> audi = new ArrayList<>();
		ArrayList<Car> skoda = new ArrayList<>();
		ArrayList<Car> peugeot = new ArrayList<>();
		ArrayList<Car> fiat = new ArrayList<>();
		
		
		
		
//		Map<String, List<Car>> mapCars = new HashMap<>();
		for(int i = 0; i < cars.size(); i++) {
			if(mapCars.get(setModel) == null) {
				ArrayList<Car> car = new ArrayList<>();
			} else {
//				mapCars.put(setModel, mapCars.get(cars).get(i));
			}
			
			
//			ArrayList<Car> car;
//			i = new ArrayList<>();
			
			
//			if(cars.get(i).getModel() == null) {
//				System.out.println(cars.get(i).getModel());
//			} else if (cars.get(i).getModel() == Model.TOYOTA) {
//				
//			}
		}
		
		
		
//		for(int i = 0; i < cars.size(); i++) {
//		if(setModel != null) {
//			ArrayList<Car> (cars.get(i).model);
//			System.out.println(setModel);
//		}
//		}
		
	
		
		
		
		
//		public void setModel(Car addCar) {
//			if(cars.get(0).getModel() == null) {
//				carList = new ArrayList<>();
//			}
//			carList.add(addCar);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Map из моделей. ¬ыводит в формате: модель=[список автомобилей]
//		ArrayList<Car> bmw = new ArrayList<>();
//		ArrayList<Car> toyota = new ArrayList<>();
//		ArrayList<Car> audi = new ArrayList<>();
//		ArrayList<Car> skoda = new ArrayList<>();
//		ArrayList<Car> peugeot = new ArrayList<>();
//		ArrayList<Car> fiat = new ArrayList<>();
//		
//		Map<String, List<Car>> mapCars = new HashMap<>();
//		
//		for(int i = 0; i < cars.size(); i++) {
//			if(cars.get(i).getModel() == Model.BMW) {
//				bmw.add(cars.get(i));
//			} else if (cars.get(i).getModel() == Model.TOYOTA) {
//				toyota.add(cars.get(i));
//			} else if (cars.get(i).getModel() == Model.AUDI) {
//				audi.add(cars.get(i));
//			} else if (cars.get(i).getModel() == Model.SKODA) {
//				skoda.add(cars.get(i));
//			} else if (cars.get(i).getModel() == Model.PEUGEOT) {
//				peugeot.add(cars.get(i));
//			} else if (cars.get(i).getModel() == Model.FIAT) {
//				fiat.add(cars.get(i));
//			}
//		}
//		
//		mapCars.put("BMW", bmw);
//		mapCars.put("TOYOTA", toyota);
//		mapCars.put("AUDI", audi);
//		mapCars.put("SKODA", skoda);
//		mapCars.put("PEUGEOT", peugeot);
//		mapCars.put("FIAT", fiat);
//		
//		System.out.println(mapCars);
		
	}

}
