package j20_람다식;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaFunction {

	public static void main(String[] args) {
		int num = 10;
		
		/*
		 * Runnable 매개변수 x, 리턴 x
		 */
		Runnable runnable = () -> {
			System.out.println("그냥 실행되는 함수");
			System.out.println("num: " + num);
		};

		runnable.run();
		
		/*
		 * Supplier 매개변수 x, 리턴 o
		 */
		Supplier<String> supplier = () -> {
			System.out.println("이름을 출력합니다.");
			return "김준일";
		};
		
		System.out.println("이름: " + supplier.get());
		
		/*
		 * Consumer 매개변수 o, 리턴 x
		 */
		Consumer<Integer> consumer = studentCode -> {
			System.out.println("학번: " + studentCode);
		};
		
		consumer.accept(20220001);
		
		/*
		 * Function 매개변수 o, 리턴 o
		 */
		Function<Integer, String> createYear = year -> year + "년";
		
		System.out.println("올해는 " + createYear.apply(LocalDateTime.now().getYear()) + "입니다.");
		
		/*
		 * Predicate 매개변수o, 리턴 Boolean
		 */
		Predicate<Integer> nowYearFlag = year -> year > 2000;
		Predicate<Integer> nowYearFlag2 = year -> year < 2023;
		
		Predicate<Integer> nowMonthFlag = month -> month == LocalDateTime.now().getMonthValue();
		
		System.out.println(nowYearFlag.and(nowYearFlag2).test(2022));
		
		/*
		 * 파라미터 두개
		 */
		BiConsumer<String, Integer> user = (name, age) -> {
			System.out.println("이름: " + name);
			System.out.println("나이: " + age);
		};
		
		user.accept("김준일", 29);
		
		BiFunction<Integer, Integer, String> yearAndMonth 
		= (year, month) -> year + "년 " + month + "월";
		
		int year2 = LocalDateTime.now().getYear();
		int month2 = LocalDateTime.now().getMonthValue();
		
		System.out.println("년, 월: " + yearAndMonth.apply(year2, month2));
		
		BiPredicate<Integer, Integer> yearMonthFlag = (year, month) -> year == year2 && month == month2;
		System.out.println(yearMonthFlag.test(2022, 8));
		
		UnaryOperator<Integer> add = age -> age - 2;
		
		System.out.println(add.apply(29));
		
		BinaryOperator<Integer> add2 = (age, plus) -> age + plus;
		
		System.out.println(add2.apply(29, 1));
	
	}

}





