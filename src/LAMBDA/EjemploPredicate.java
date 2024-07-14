package LAMBDA;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import LAMBDA.MODELS.User;

public class EjemploPredicate {
  public static void main(String[] args) {

	Predicate<Integer> test = num -> num > 10;
	boolean result = test.test(11);
	System.out.println("result: " + result);

	Predicate<String> testTwo = role -> role.equals("ROLE_ADMIN");
	System.out.println(testTwo.test("NUEVA"));

	BiPredicate<String, String> testThree = String::equals;
	System.out.println(testThree.test("Luisda", "Jesusda"));

	BiPredicate<Integer, Integer> testFour = (i, j) -> i < j;
	boolean resusltTwo = testFour.test(1, 2);
	System.out.println(resusltTwo);

	User userOne = new User();
	userOne.setName("Luisda");
	User userTwo = new User();
	userTwo.setName("Jesusda");

	BiPredicate<User, User> predicateTest = (uOne, uTwo) -> uOne.getName().equals(uTwo.getName());
	System.out.println(predicateTest.test(userOne, userTwo));
  }
}
