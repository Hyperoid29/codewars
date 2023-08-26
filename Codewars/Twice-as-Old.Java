/* 
Your function takes two arguments:

current father's age (years)
current age of his son (years)
Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old). The answer is always greater or equal to 0, no matter if it was in the past or it is in the future.
*/


//My Solution


public class TwiceAsOld{

    public static int TwiceAsOld(int dadYears, int sonYears){
     
      int result = 0;
      int doubleSonYears = 0;
      
      if (sonYears * 2 > dadYears) {
        doubleSonYears = sonYears * 2;
        result = doubleSonYears - dadYears;
        return result;
      }
      else if (sonYears * 2 < dadYears) {
        doubleSonYears = sonYears * 2;
        result = dadYears - doubleSonYears;
        return result; 
      }
      else if (sonYears == dadYears) {
        return 0;
      }
      return 0;
      
    
    }
  
  }