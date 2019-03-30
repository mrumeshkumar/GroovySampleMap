class StudentTest extends GroovyTestCase {
   public void testDisplay() {
     
      def stud = new Student(name : 'Joe', ID : 1)
      def expected = 'Joe1'
      assertToString(stud.Display(), expected)
   }
   public void testLength() {
        def result = new Student().length([2, 3, 8, 9, 0, 1, 5, 7])
        assertEquals 8, result
    }
}

 
