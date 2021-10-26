package br.com.cod3r.bridge.converter;

import br.com.cod3r.bridge.converter.converters.CSVConverter;
import br.com.cod3r.bridge.converter.converters.Converter;
import br.com.cod3r.bridge.converter.converters.JsonConverter;
import br.com.cod3r.bridge.converter.employees.ITGuy;
import br.com.cod3r.bridge.converter.employees.ProjectManager;

public class Client {

	public static void main(String[] args) {

		Converter csvConverter = new CSVConverter();
		Converter jsonConverter = new JsonConverter();

		ITGuy itGuy = new ITGuy("Joel", 27, 18000.00);
		ProjectManager projectManager = new ProjectManager("Augusto", 26, 7600.00);

		System.out.println(csvConverter.getEmployeeFormated(itGuy));
		System.out.println(jsonConverter.getEmployeeFormated(itGuy));
		System.out.println(csvConverter.getEmployeeFormated(projectManager));
		System.out.println(jsonConverter.getEmployeeFormated(projectManager));
		
	}
}
