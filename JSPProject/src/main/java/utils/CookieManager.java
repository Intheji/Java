package utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class CookieManager {
	//쿠키 생성 메서드
	public static void makeCookie(HttpServletResponse response, String cName, String cValue, int cTime) {
		Cookie cookie = new Cookie(cName, cValue);	
		cookie.setPath("/");
		cookie.setMaxAge(cTime);
		response.addCookie(cookie);
	}
	
	//쿠키 검색 메서드
	public static String readCookie(HttpServletRequest request, String cName) {
		String cookieValue = "";
		
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				String cookieName = c.getName();
				if (cookieName.equals(cName)) {
					cookieValue = c.getValue();
				}
			}
		}
		return cookieValue;
	}
		
		//쿠키 삭제
		//쿠키를 삭제하는 방법은 같은 이름의 쿠키를 유지시간 0으로 새로 만들면 됨
	public static void deleteCookie(HttpServletResponse response, String cName) {
		makeCookie(response, cName, "", 0);
	}
}

