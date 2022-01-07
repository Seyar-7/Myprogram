
public class Copy_objects_car {
        
	
	  private String make;
	  private String model;
	  private int year;
	  
	  
	  Copy_objects_car(Copy_objects_car x){
		  this.copy(x);
	  }
	  
	  
	  
	  Copy_objects_car(String make,String model,int year){
		  this.setmake(make);
		  this.setmodel(model);
		  this.setyear(year);
	  }
	  
	  public String getmake() {
		  return make;
	  }
	  public String getmodel() {
		  return model;
	  }
	  public int getyear() {
		  return year;
	  }
	  public void setmake(String make) {
		  this.make = make;
	  }
	  public void setmodel(String model) {
		  this.model = model;
	  }
	  public void setyear(int year) {
		  this.year = year;
	  }
	  public void copy(Copy_objects_car x) {
		 this.setmake(x.getmake());
		 this.setmodel(x.getmodel());
		 this.setyear(x.getyear());
	  }
	  
}


