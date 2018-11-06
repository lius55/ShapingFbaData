public class PostCdFormatter {

	public String getPostCd(String postCd) {
		postCd = postCd.replaceAll("[\\-‐ー－−－ｰ 　]", "");
		postCd = String.format("%7s", postCd);
		postCd = postCd.replaceAll(" ", "0");
		return postCd;
	}
}
