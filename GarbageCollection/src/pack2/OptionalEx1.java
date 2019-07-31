package pack2;

import java.util.Optional;

public class OptionalEx1 {

	public static void main(String[] args) {

		String str[] = new String[10];
		str[5] = "java optional class example";
		Optional<String> chk=Optional.ofNullable(str[5]);
		chk.ifPresent(System.out::println);
		System.out.println(chk.get());
		System.out.println(str[5].toString());
	}

}
