package com.tzh.zip;

public class TestZip {
	public static void main(String[] args) {
		ZipCompress zipCom = new ZipCompress("F:\\test\\压缩文件包.zip", "F:\\test\\zip");
		try {
			zipCom.zip();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
