public static void main(args) {
  
def map = [
        simple : 123,
        complex: [a: 1, b: 2]
]
def map2 = map.clone()
println map.get('simple')
println map.get('complex')
println map.get('complex').get('a')

/*
RomanConverter rom = new RomanConverter()
println rom.convert(1)
println rom.convert(0)
println rom.convert(5)
*/
//assert map2.get('simple') == map.get('simple')
//assert map2.get('complex') == map.get('complex')
//map2.get('complex').put('c', 3)
//assert map.get('complex').get('c') == 3
}