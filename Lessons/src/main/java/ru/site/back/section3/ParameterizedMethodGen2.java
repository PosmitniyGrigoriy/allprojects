package ru.site.back.section3;

// v1
//public class ParameterizedMethodGen2 {
//	
//	<T> T getAge(T age) {
//		return age;
//	}
//	
//}


//v2
public class ParameterizedMethodGen2<T> {
	
	T getAge(T age) {
		return age;
	}
	
}
