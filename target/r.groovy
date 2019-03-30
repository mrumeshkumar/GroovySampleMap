1

public class RomanConverterTest extends GroovyTestCase {

}

2
void test_should_return_I_when_pass_1(){

}
3

//arrange
RomanConverter stud = new RomanConverter()
def expected = "I"

4 - run code it will fail

now add main class


public class RomanConverter {
}
5 in test
 //act 
		String actualResult = stud.Convert(1);

6
add file
String Convert(int number) {
    retun 0;
}

7
 //assert
          assertEquals actualResult, expected

8 implemw
