package com.javalearning;

import java.util.HashMap;
import java.util.Map;

public class Key_Value {
	public String showMap(String key){
		Map<String,String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		
		return map.get(key);
	}

}
