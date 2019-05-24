package com.esa.collection.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.esa.collection.model.EmployeeTextModel;

public class EmployeeTextService {
	public static String read;
	public static String getData = "";
	public static int iteration = 0;
	public static String id=null, name=null, entrydate=null, grade=null, salary=null;
	
	public static EmployeeTextModel splitData(String saveData, int getIter){
		EmployeeTextModel model = new EmployeeTextModel();
		if(getIter == 1){
			id = saveData;
		}else if(getIter == 2){
			name = saveData;
		}else if(getIter == 3){
			entrydate = saveData;
		}else if(getIter == 4){
			grade = saveData;
		}else if(getIter == 5){
			salary = saveData;
			
			model.setId(id);
			model.setName(name);
			model.setEntrydate(entrydate);
			model.setGrade(grade);
			model.setSalary(salary);
		}
		return model;
	}
	
	public static List<EmployeeTextModel> employeeTextModel(File fileToProcess)throws IOException{
		List<EmployeeTextModel> listemployee = new ArrayList<EmployeeTextModel>();
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(fileToProcess));
		while((read = br.readLine()) != null){
			read=read.replace("{", "");
			read=read.replace("}", ",");
			for(int i=0;i<read.length();i++){
				if(read.charAt(i) != ','){
					getData += read.charAt(i);
				}
				if(read.charAt(i) == ','||read.charAt(i) == '}'){
					iteration++;
					EmployeeTextModel separatedData = splitData(getData, iteration);
					if(iteration == 5){
						listemployee.add(separatedData);
						iteration =0;
					}
					getData = "";
				}
			}
		}
		return listemployee;
	}
	
	
}
