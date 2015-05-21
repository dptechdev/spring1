package spring1;

//A class that accepts a Domain model to serialize into JSON output using ResponseEntity
//Utility class for @RestController

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class JSONMapper<T> {

	
	public ResponseEntity<Map<String, Iterable<T>>> Serialize(String collectionLabel, Iterable<T> collection) {
		Map<String, Iterable<T>> SerializeJSONMapper = new HashMap<>();
		SerializeJSONMapper.put(collectionLabel, collection);
		return new ResponseEntity<Map<String, Iterable<T>>>(SerializeJSONMapper, HttpStatus.OK);
	}
	
}
