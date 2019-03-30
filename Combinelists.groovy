import org.junit.Test

public class SampleUnitTest{
   @Test
	public void combine_two_lists_plus(){
	
		def first = ["a", "b", "c"]
		def second = ["d", "e", "f"]
	
		assert ["a", "b", "c", "d", "e", "f"] == (first + second)
	    println "hello testing"
	}
}