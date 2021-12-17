import java.util.Iterator;  
import java.util.List;  
  
public class Question{  
private int id;  
private String name;  
private List<String> answers;  
private List<String> difficultylevel;  
  
public Question() {}  


   
public Question(int id, String name, List<String> answers , List<String> difficultylevel) {
	super();
	this.id = id;
	this.name = name;
	this.answers = answers;
	this.difficultylevel = difficultylevel;
	 System.out.println("Question() constructor invoked");
}

  
public void displayInfo(){  
    System.out.println(id+" "+name);
  //  System.out.println("answers are:");
    System.out.println("answers are:");  
	
	  for(Iterator<String> itr=answers.iterator();itr.hasNext();){
	  System.out.println(itr.next()); }
	 
	  for(Iterator<String> itr=difficultylevel.iterator();itr.hasNext();){
		  System.out.println(itr.next()); }
	 
} 

public void difficultlvl() {
for(Iterator<String> itr=difficultylevel.iterator();itr.hasNext();){
System.out.println(itr.next()); }
}
  
}