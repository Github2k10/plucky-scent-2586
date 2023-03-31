package com.dao;

import java.sql.Date;
import java.util.List;

import com.dto.CriminalDto;
import com.exception.CriminalNotFoundException;
import com.exception.InvalidDataException;
import com.exception.SomeThingWentWrongException;

public interface CriminalDao {
	public boolean addCriminal(CriminalDto criminal) throws InvalidDataException, SomeThingWentWrongException;
	public boolean updateCriminal(int criminal_id, String name, Date date, String gender, String mark, Date first_arrest, String arrestArea) throws CriminalNotFoundException, SomeThingWentWrongException;
	public boolean assignCrime(int crime_id, int criminal_id);
	public boolean removeCrime(int crime_d, int criminal_id);
	public boolean deleteCriminal(int criminal_id);
	public List<CriminalDto> searchCriminalByName(String name);
}
