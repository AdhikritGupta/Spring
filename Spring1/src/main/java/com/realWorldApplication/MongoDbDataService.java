package com.realWorldApplication;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return null;
	}

}
