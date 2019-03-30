Package RomanConverterTest
public class RomanConverterClass {

	public String convert(int number) {
		// TODO Auto-generated method stub
		String Result = ""
		if(number== 1)
        {
            Result="I"
        }
        else if(number== 2)
        {
            Result="II"
        }
        else if(number== 3)
        {
            Result="III"
        }
        else if (number ==0)
        {
            Result= "Invalid Number"
        }
        else
        {
            Result=""
        }
		
		return Result
	}

}