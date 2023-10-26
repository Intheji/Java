package utils;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;

public class JSFunction {
	
	//메세지 알림창을 표시한 후 지정한 url로 이동
	//JspWriter out : JSP가 생성한 결과를 웹 브라우저로 전달
	public static void alertLocation(String msg, String url, JspWriter out) {
			try {
				String script = ""
						+ "<script>"
						+ "		alert('" + msg + "');"
						+ " 	location.href = '" + url + "';"
						+ "</script>";
				out.print(script);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	//메시지 알림창을 표시한 후 이전 페이지로 이동
	public static void alertBack(String msg,  JspWriter out) {
		try {
			String script = ""
					+ "<script>"
					+ "		alert('" + msg + "');"
					+ " 	history.back();"
					+ "</script>";
			out.print(script);
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}
