package OOPs;

//java bean
class Bean
{
//encapsulation-all variables will be private
	
private int id;
private String name;
static String instituteName="Anudip Foundation";//at the time of declaration you need to define it

//setter getter
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

//parameterized constructor
public Bean(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}


public static String getInstituteName() {
	return instituteName;
}
//default constructor
public Bean() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Bean [id=").append(id).append(", name=").append(name).append("]");
	return builder.toString();
}

//toString method


}
public class JavaBeanDemo {

	public static void main(String[] args) {
	
		//initializing object using setter method,so used default constructor
     Bean bean=new Bean(); //naming convention
     bean.setId(101);
     bean.setName("ramesh");
     System.out.println("Id: "+ bean.getId()+" "+" Name: "+ bean.getName()
     +" Institute Name: "+ Bean.getInstituteName());
     
 	//initializing object using constructor,so used parameterized constructor
     Bean bean1=new Bean(102, "rajiv");
     System.out.println("Id: "+ bean1.getId()+" "+" Name: "+ bean1.getName()
     +" Institute Name: "+ Bean.getInstituteName());
     
	}

}



