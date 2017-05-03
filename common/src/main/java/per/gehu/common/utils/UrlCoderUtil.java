package per.gehu.common.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import android.text.TextUtils;

/**
 * 编码类，简单对系统api进行封装，解决把空格转为+号，导致某些接口处理异常的问题
 */
public class UrlCoderUtil {

	public static String decode(String str) {
		if (TextUtils.isEmpty(str)) {
			return "";
		}
		try {
			return URLDecoder.decode(str, "utf-8");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}

	public static String decode(String str, String enc) {
		if (TextUtils.isEmpty(str)) {
			return "";
		}
		try {
			return URLDecoder.decode(str, enc);
		} catch (UnsupportedEncodingException e) {
			return decode(str);
		}
	}
	
	public static String encode(String str) {
		if (TextUtils.isEmpty(str)) {
			return "";
		}
		try {
			return URLEncoder.encode(str, "utf-8").replace("+", "%20");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}
	
	public static String encode(String str, String enc) {
		if (TextUtils.isEmpty(str)) {
			return "";
		}
		try {
			return URLEncoder.encode(str, enc).replace("+", "%20");
		} catch (UnsupportedEncodingException e) {
			return encode(str);
		}
	}
}
