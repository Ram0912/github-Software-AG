package sample;
 
interface Drawable{  
    public void draw(); 
   
} 
public class LambdaExpression {

	 public static void main(String[] args) {  
	        int width=10;  
	          
	        //with lambda  
	        Drawable d2=()->{  
	            System.out.println("Drawing "+width);  
	            System.out.println(width); 
	            
	            
	        };  
	      
	        d2.draw();  
	    }  
}

  
  
 