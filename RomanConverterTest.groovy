package RomanConverterTest
 public class RomanConverterTest extends GroovyTestCase {
  
     void test_should_return_I_when_passed_1(){
          //arrange
          RomanConverter stud = new RomanConverter()
          def expected = "I"

          //act
		String actualResult = stud.Convert(1);
          
          //assert
          assertEquals actualResult, expected
     }
     void test_should_return_II_when_passed_2() {
     
      def stud = new RomanConverter()
      def expected = "II"
      assertEquals stud.Convert(2), expected
   }
   void test_should_return_III_when_passed_3() {
     
      def stud = new RomanConverter()
      def expected = "III"
      assertEquals stud.Convert(3), expected
   }
   void test_should_return_III_when_passed_3() {
     
      def stud = new RomanConverter()
      def expected = "III"
      assertEquals stud.Convert(3), expected
   }
}
public class RomanConverter {

	String Convert(int number) {
      String Result = ""
      if(number==1)
        Result="I" 
     else if (number ==2)
     Result ="II"
     else if (number ==3)
     Result ="III"
      return Result;
   }  

}