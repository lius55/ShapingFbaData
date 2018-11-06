import java.util.regex.Pattern

class AddressFormatter {

    private val ADDRESS_REGEX = "^[一-龠｡-ﾟ+ぁ-ゞァ-ヶ 　]+([0-9０-９]+[\\-‐ー－−－ｰ町丁目番号条 　]+){0,5}[0-9０-９号階]+"

    fun getAddressAfterStreet(address: String): String {
        val pattern = Pattern.compile(ADDRESS_REGEX)
        val matcher = pattern.matcher(address)
        val matched = if (matcher.find()) matcher.group(0) else ""
        return address.substring(matched.length)
    }

    fun getAddressBeforeStreet(address: String): String {
        val pattern = Pattern.compile(ADDRESS_REGEX)
        val matcher = pattern.matcher(address)
        return if (matcher.find()) matcher.group(0) else ""
    }
}