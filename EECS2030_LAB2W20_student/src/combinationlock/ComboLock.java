package combinationlock;


	/**
	   A class to simulate a combination lock.
	*/
	public class ComboLock
	{
	   private int secret1;
	   private int secret2;
	   private int secret3;

	   // 0: nothing entered, 1: secret1 done, 2: secret2 done, 
	   // 3: secret3 done and unlocked
	   private int lockState;

	   private int currentNumber;
	   private boolean validSoFar;

	   /**
	      Initializes the combination of the lock.
	      @param secret1 first number to turn right to
	      @param secret2 second number to turn left to
	      @param secret3 third number to turn right to
	   */
	   public ComboLock(int secret1, int secret2, int secret3)
	   {
		   this.secret1  = secret1;
		   this.secret2 = secret2;
		   this.secret3 = secret3;
		   currentNumber = 0;
		   lockState = 0;
		   validSoFar = false;
		   
		   
	      
	   }

	   /**
	      Resets the state of the lock so that it can be opened again.
	   */
	   public void reset()
	   {
		   
		   currentNumber = 0;
		   lockState = 0;
		   validSoFar = false;
	     
	   }

	   /**
	      Turns lock left given number of ticks.
	      @param ticks number of ticks to turn left
	   */
	   public void turnLeft(int ticks)
	   {
		   currentNumber = ticks;
		   if ((secret2 == currentNumber)&&(lockState ==1) && validSoFar) {
			   validSoFar = true;
			   lockState = 2;
		   }
		   else {
			   validSoFar = false;
		   }
	      
	   }

	   /**
	      Turns lock right given number of ticks
	      @param ticks number of ticks to turn right
	   */
	   public void turnRight(int ticks)
	   {
		   currentNumber = ticks;
		   if ((secret1 == currentNumber)&&(lockState == 0)) {
			   validSoFar = true;
			   lockState = 1;
		   }
		   else if ((secret3 == currentNumber) && (lockState == 2) && validSoFar){
			   validSoFar = true;
			   lockState = 3;
		   }
		   else {
			   validSoFar = false;
		   }
	      
	   }

	   /**
	      Returns true if the lock can be opened now
	      @return true if lock is in open state
	   */
	   public boolean open()
	   {
		   return lockState == 3;
	      
	   }
	}



