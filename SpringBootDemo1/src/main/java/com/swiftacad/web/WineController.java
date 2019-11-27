package com.swiftacad.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swiftacad.model.Wine;

@RestController
public class WineController {
	
	@RequestMapping(value = "/wine", method = RequestMethod.GET)
	public Wine getWine() {
		return new Wine("Cherveno", 1968);
	}

}
