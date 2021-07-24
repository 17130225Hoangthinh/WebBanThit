package com.nlufrozenfood.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VNConstants {
	
	public final static String VNP = "VNProvince";
	
	public final static Map<String, String> mapOfVNProvince = new HashMap<String, String>() {
		{
			put("AG", "An Giang");
			put("BN", "Bắc Ninh");
			put("BG", "Bắc Giang");
            put("BD", "Bình Dương");
            put("BT", "Bình Thuận");
            put("BD", "Bình Dương");
            put("CM", "Cà Mau");
            put("CT", "Cần Thơ");
            put("CB", "Cao Bằng");
            put("DN", "Đà Nẵng");
            put("DN", "Đắc Nông");
            put("DL", "Đắk Lắk");
            put("DB", "Điện Biên");
            put("DN", "Đông Nai");
            put("GL", "Gia Lai");
            put("HN", "Hà Nam");
            put("HG", "Hà Giang");
            put("HT", "Hà Tĩnh");
            put("HD", "Hải Dương");
            put("HG", "Hậu Giang");
            put("HB", "Hòa Bình");
            put("HN", "Hà Nội");
            put("HCM", "Hồ Chí Minh");
            put("KH", "Khánh Hòa");
            put("KG", "Kiên Giang");
            put("KT", "Kon Tum");
            put("LC", "Lai Châu");
            put("LD", "Lâm Đồng");
            put("LS", "Lạng Sơn");
            put("LA", "Long An");
            put("ND", "Nam Định");
            put("NA", "Nghệ An");
            put("NB", "Ninh Bình");
            put("QB", "Quảng Bình");
            put("QN", "Quảng Nam");
            put("SL", "Sơn la");
            put("TN", "Tây Ninh");
     
		}
	};
	
	public final static List<String> listOfVNProvince = new ArrayList<>(mapOfVNProvince.keySet());
	public final static List<String> listOfVNProvinceName = new ArrayList<>(mapOfVNProvince.values());

}
