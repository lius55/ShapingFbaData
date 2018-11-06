import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String [] args) {

		PostCdFormatter postcdFormatter = new PostCdFormatter();
		List<String> phoneList = Arrays.asList(
				"1050001 ",
				" 050001　",
				"105ー0001",
				" 105-0001");

		for (String phone : phoneList) {
			System.out.println("PostCd=" + postcdFormatter.getPostCd(phone));
		}

		AddressFormatter addressFormatter = new AddressFormatter();
		List<String> addressList = Arrays.asList(
				"東京都千代田区サウス1-9-1サウスタワー35F",
				"東京都千代田区サウス1-9-1-3501");

		for (String address : addressList) {
			System.out.println("before:" + addressFormatter.getAddressBeforeStreet(address) + ", " +
					"after:" + addressFormatter.getAddressAfterStreet(address));
		}

	}
}
