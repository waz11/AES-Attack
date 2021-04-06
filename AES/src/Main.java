
public class Main {
	static String message_short = "./files/message_short";
	static String message_long = "./files/message_long";
	static String cipher_short = "./files/cipher_short";
	static String cipher_long = "./files/cipher_long";
	static String key_short = "./files/key_short";
	static String key_long = "./files/key_long";

	public static void main(String[] args) {
		Test.test_aes1(key_short, message_short, cipher_short);
		
		Test.test_aes2(key_short, message_short, cipher_short);
		
	}

	public static void print(Object o) {
		System.out.println(o.toString());
	}

}
