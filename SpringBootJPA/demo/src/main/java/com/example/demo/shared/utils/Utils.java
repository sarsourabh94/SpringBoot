package com.example.demo.shared.utils;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class Utils {

	public String getUniqueId()
	{
		UUID uid = UUID.randomUUID();
		return String.valueOf(uid);
	}

}
