
public class Day4Person {
	public class Person {
		  
	    int age;	
		public Person(int initial_Age) {
	        if(initial_Age<0)
	        {
	            System.out.println("This person is not valid, setting age to 0.");
	            this.age=0;
	        }
	        else
	            this.age=initial_Age;
		}

		public void amIOld() {
	        if(this.age<13)
	            System.out.println("You are young.");
	        if(this.age>=13&&this.age<18)
	            System.out.println("You are a teenager.");
	        if(this.age>=18)
	            System.out.println("You are old.");
	  		
		}

		public void yearPasses() {
	        this.age++;
	  		// Increment the age of the person in here
		}


}
}
