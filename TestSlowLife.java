import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

public class TestSlowLife {
	
	int SIZE = 15;
	
    /*
     * Pinning test for MainPanel.convertToInt()
	 */
	
	//Testing the convertToInt() method which 
	//should return a positive integer has the same value 
	//as the passing in parameter
	@Test
	public void testConvertToIntPositive(){	
	   MainPanel mp = new MainPanel(SIZE);
	   try{
		   Random rand = new Random();
		   int numInput= Math.abs(rand.nextInt());
		   int numOutPut = mp.convertToInt(numInput);
		   assertEquals(numInput,numOutPut);
	   }catch(Exception ex){
		   fail();
	   }
	}
	
	//Testing the convertToInt() method which
	//returning the same negative value as passing in
	@Test
	public void testConvertToIntNegative(){
		  MainPanel mp = new MainPanel(SIZE);
		   try{
			   Random rand = new Random();
			   int numInput= Math.abs(rand.nextInt())*(-1);
			   int numOutPut = mp.convertToInt(numInput);
			   assertEquals(numInput,numOutPut);
		   }catch(Exception ex){
			   fail();
		   }
	}
	
	@Test
	public void testConvertToIntZero(){
		 MainPanel mp = new MainPanel(SIZE);
		   try{
			   int numInput = 0;
			   int numOutPut = mp.convertToInt(numInput);
			   assertEquals(numInput,numOutPut);
		   }catch(Exception ex){
			   fail();
		   }
	}
	
	/*
	 * Pinning test for Cell.toString()
	 */
	@Test
	  public void testToStringDeadByMutator(){
	    Cell cell = new Cell();
	    cell.setAlive(false);
	    String result = cell.toString();
	    assertEquals(result,".");
	  }

	  @Test
	  public void TestToStringAliveByMutator(){
	    Cell cell = new Cell();
	    cell.setAlive(true);
	    String result = cell.toString();
	    assertEquals(result,"X");
	  }

	  @Test
	  public void testToStringConstructorDead(){
	    Cell cell = new Cell(false);
	    String result = cell.toString();
	    assertEquals(result,".");
	  }

	  @Test
	  public void testToStringConstructorAlive(){
	    Cell cell = new Cell(true);
	    String result = cell.toString();
	    assertEquals(result,"X");
	  }
	  
	  /*
	    * Pinning test for MainPanel.runContinuous()
	   */
		//Manually testing runContinous() by seeing the counter increasing
		@Test
		public void testRunContinuous(){
			 MainPanel mp = new MainPanel(SIZE);
			 try{
				  mp.runContinuous();
			   }catch(Exception ex){
				   fail();
			   }	
		}
}
