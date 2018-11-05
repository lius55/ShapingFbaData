import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressFormatter {

	private static final String ADDRESS_REGEX = "^[一-龠｡-ﾟ+ぁ-ゞァ-ヶ 　]+([0-9０-９]+[\\-‐ー－−－ｰ町丁目番号条 　]+){0,5}[0-9０-９号階]+";

	public String getAddressAfterStreet(String address) {
		Pattern pattern = Pattern.compile(ADDRESS_REGEX);
		Matcher matcher = pattern.matcher(address);
		String matched = matcher.find() ? matcher.group(0) : "";
		return address.substring(matched.length());
	}

	public String getAddressBeforeStreet(String address) {
		Pattern pattern = Pattern.compile(ADDRESS_REGEX);
		Matcher matcher = pattern.matcher(address);
		return matcher.find() ? matcher.group(0) : "";
	}

}
