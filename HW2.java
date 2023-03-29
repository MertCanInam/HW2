public class HW2 {
  
  // The counter counts until sees a space.
  public static String trimSpacesFromFront(String word1)
  {
    int counter = 0;
    StringBuilder builder = new StringBuilder();
    for (int i = 0 ; i < word1.length() && word1.charAt(i) == ' ' ; i++)
    {
      counter++;
    }
    // for loops starts from counter value and create string again
    for (int i = counter ; i < word1.length() ; i++)
    {      
      builder.append(word1.charAt(i));    
    } 
    
    return builder.toString();
  }
  // if same number of characters and same number entered, return true. If not return false
  public static boolean samePrefix(String word1, String word2, int number) {
    int counter = 0;
    for (int i = 0; i < word1.length() && i < word2.length(); i++)
    {
      if (word1.charAt(i) == word2.charAt(i))
      {
        counter++;
      }
    }
    if (counter == number) {
      return true;
    } else
      return false;
    
  }
  // Counter counts the space at the end of all words except the end of String.This counter is word count.
  public static int countWords(String word)
  {
    int counter=0;
    
    for(int i = 0 ; i < word.length() ; i++)
    {
      if(word.charAt(word.length()-1) != ' ' && i == word.length()-1 || word.charAt(i) != ' ' &&  word.charAt(i+1) == ' ' )
      {
        if(word.charAt(i) == ' ' && word.charAt(i+1) == ' ')
        {
          i++;
        }
        counter++;
      }
      
    }
    
    return counter;
  }
  
  // Every character repeats entered number times but space is not repeat. 
  public static String repeatChars(String word,int number)
  {
    StringBuilder builder = new StringBuilder();
    
    for(int i = 0 ; i < word.length() ; i++)
    {
        for(int j = 0 ; j < number ; j++)
        {
          builder.append(word.charAt(i));    
        } 
    }

    return builder.toString();  
  }
  
  // If word1's first letter is in the word2 , lettercounter increase and word1's second and third like that.
  // If letterCounter equals to word1 length , return true if not return false.
  public static boolean subSequence(String word1,String word2)
  {
    int letterCounter;
    int i ;
    for(i = 0 , letterCounter = 0 ; letterCounter < word1.length() && i < word2.length() ; i++ )
    {
      if(word1.charAt(letterCounter) == word2.charAt(i))
      {
        letterCounter++;
      }
    }
    if(letterCounter == word1.length())
    {
      return true;
    }
    else
      return false;
       
  }
}
