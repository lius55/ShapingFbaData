import java.util.*

fun main(args : Array<String>) {

    val postcdFormatter = PostCdFormatter()
    val phoneList = Arrays.asList(
        "1050001 ",
        " 050001　",
        "105ー0001",
        " 105-0001")

    for (phone in phoneList) {
        println("PostCd=" + postcdFormatter.getPostCd(phone))
    }


    val addressFormatter = AddressFormatter()
    val addressList = Arrays.asList(
        "長野県上田市常入1-12-11常入コーポa5号室",
        "東京都千代田区サウス1-9-1サウスタワー35F",
        "東京都千代田区サウス1-9-1-3501")

    for (address in addressList) {
        println("before:" + addressFormatter.getAddressBeforeStreet(address) + ", " +
            "after:" + addressFormatter.getAddressAfterStreet(address))
    }
}
