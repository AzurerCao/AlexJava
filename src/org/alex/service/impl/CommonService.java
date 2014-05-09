package org.alex.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("commonService")
public class CommonService {

	private static List<String> database;

	static {
		database = new ArrayList<String>();
		for (int i = 0; i < 300; i++) {
			database.add("alex" + i);
		}
	}

	/**
	 * Return the first 10 result
	 * 
	 * @param prefix
	 * @return
	 */
	public List<String> query(String prefix) {
		List<String> result = new ArrayList<String>();
		for (String s : database) {
			if (s.startsWith(prefix.toLowerCase())) {
				result.add(s);
			}

			if (result.size() > 10) {
				break;
			}
		}
		return result;
	}
}
