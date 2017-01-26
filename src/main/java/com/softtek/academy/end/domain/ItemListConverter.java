package com.softtek.academy.end.domain;

import java.util.Arrays;
import java.util.List;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class ItemListConverter implements AttributeConverter<List<String>, String> {

	@Override
	public String convertToDatabaseColumn(List<String> attribute) {
		String result = null;
		for (String element : attribute) {
			result += element + ",";
		}
		return result;
	}

	@Override
	public List<String> convertToEntityAttribute(String dbData) {
		return Arrays.asList(dbData.split("\\s*,\\s*"));
	}

}
