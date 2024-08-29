		//questao 1
		//numbers.forEach(System.out::println);
		
		//questao2
		//numbers.stream().sorted().distinct().forEach(System.out::println);
		
		//questao3
		//numbers.stream().distinct().filter(n ->  n%2 != 0).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//questao4
		//System.out.println(numbers.stream().skip(3).mapToInt(n -> n).sum());
		
		//questao 5
		//numbers.stream().forEach(n -> System.out.println(n*2));
		
		//questao 6
		//System.out.println(numbers.stream().distinct().collect(Collectors.groupingBy(n -> n%2 != 0))); 
		
		//questao 7
		//System.out.println(numbers.stream().mapToInt(n->n).max().orElseThrow());
		
		//questao 8
		//numbers.stream().limit(3).forEach(System.out::println);
		
		//questao 9
		//numbers.stream().mapToInt(n->n).average().ifPresentOrElse(n -> System.out.println(n), () -> System.out.println(Double.NaN));
		
		//questao 10
		//System.out.println("total = " + numbers.stream().count() + " soma = " + 
		//numbers.stream().mapToInt(n->n).sum() + " media = " + numbers.stream().mapToInt(n->n).average().getAsDouble() + " max = " + numbers.stream().mapToInt(n->n).max());
		
		//questao 11
		//forma 1 - a soma dos numeros adicionadas na data
		//System.out.println(novaData.plusDays(numbers.stream().distinct().sorted().mapToInt(n->n).sum()));  
		//forma 2 - cada numero somado na data por vez
		//numbers.stream().distinct().sorted().mapToInt(n->n).forEach(n -> System.out.println(novaData.plusDays(n)));