package com.xxy;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable{

	public String[] favFood1 = {"Fry Checken", "Tomyam Soup"};
	public String[] favFood2;
	public String[] favFood3;
			
	public String[] getFavFood1() {
		return favFood1;
	}

	public void setFavFood1(String[] favFood1) {
		this.favFood1 = favFood1;
	}

	public String[] getFavFood2() {
		return favFood2;
	}

	public void setFavFood2(String[] favFood2) {
		this.favFood2 = favFood2;
	}

	public String[] getFavFood3() {
		return favFood3;
	}

	public void setFavFood3(String[] favFood3) {
		this.favFood3 = favFood3;
	}

	public String getFavFood1InString() {
		return Arrays.toString(favFood1);
	}
	
	public String getFavFood2InString() {
		return Arrays.toString(favFood2);
	}
	
	public String getFavFood3InString() {
		return Arrays.toString(favFood3);
	}
	
	//Generated by Map
	private static Map<String,Object> food2Value;
	static{
		food2Value = new LinkedHashMap<String,Object>();
		food2Value.put("Food2 - Fry Checken", "Fry Checken"); //label, value
		food2Value.put("Food2 - Tomyam Soup", "Tomyam Soup");
		food2Value.put("Food2 - Mixed Rice", "Mixed Rice");
	}
	
	public Map<String,Object> getFavFood2Value() {
		return food2Value;
	}
	
	//Generated by Object array
	public static class Food{
		public String foodLabel;
		public String foodValue;
		
		public Food(String foodLabel, String foodValue){
			this.foodLabel = foodLabel;
			this.foodValue = foodValue;
		}
		
		public String getFoodLabel(){
			return foodLabel;
		}
		
		public String getFoodValue(){
			return foodValue;
		}
		
	}
	
	public Food[] food3List;
	
	public Food[] getFavFood3Value() {
		
		food3List = new Food[3];
		food3List[0] = new Food("Food3 - Fry Checken", "Fry Checken");
		food3List[1] = new Food("Food3 - Tomyam Soup", "Tomyam Soup");
		food3List[2] = new Food("Food3 - Mixed Rice", "Mixed Rice");
		
		return food3List;
	}
	
}