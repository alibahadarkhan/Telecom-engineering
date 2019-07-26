package com.care.telecomEng.util;

import java.util.Collection;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Util {
	private Util() {
	}

	public static ModelMapper getMapper() {
		return new ModelMapper();
	}

	public static boolean isNotNullAndEmpty(Collection<?> collection) {
		return (collection != null && !collection.isEmpty());
	}

}
