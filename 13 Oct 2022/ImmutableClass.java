/*Q.3... Develop a public java class and make sure nobody can
create any object of this class from outside the class*/

public final class ImmutableClass {
	private String name;
	  private int date;
	  ImmutableClass(String name, int date) {
	  // class members are initialized using constructor
	    this.name = name;
	    this.date = date;
	   }
	    public String Name() {
	    return name;
	   }
	    public int Date() {
	    return date;
	   }
	}
	class Main {
	  public static void main(String[] args) {
		// create object of Immutable
	    ImmutableClass obj = new ImmutableClass("Shifa",2022);
	    System.out.println("Name: " + obj.Name());
	    System.out.println("Date: " + obj.Date());
	  }
}
