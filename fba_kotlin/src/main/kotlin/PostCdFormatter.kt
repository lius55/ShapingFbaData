import java.util.regex.Pattern

class PostCdFormatter {

    fun getPostCd(postCd: String): String {
        var postCd = postCd
        postCd = postCd.replace("[\\-‐ー－−－ｰ 　]".toRegex(), "")
        postCd = String.format("%7s", postCd)
        postCd = postCd.replace(" ".toRegex(), "0")
        return postCd
    }
}