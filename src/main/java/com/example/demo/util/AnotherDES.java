package com.example.demo.util;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.Key;

public class AnotherDES {

  Cipher cipher = null;

  public AnotherDES() {
    init();
  }

  public void init() {
    try {
      KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
      keyGenerator.init(56);
      cipher = Cipher.getInstance("DES");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // 二进制转换字符串
  public static String bytesToHexString(byte[] src) {
    StringBuilder stringBuilder = new StringBuilder("");
    if (src == null || src.length <= 0) {
      return null;
    }
    for (int i = 0; i < src.length; i++) {
      int v = src[i] & 0xFF;
      String hv = Integer.toHexString(v);
      if (hv.length() < 2) {
        stringBuilder.append(0);
      }
      stringBuilder.append(hv);
    }
    return stringBuilder.toString();
  }

  public static byte[] hexStringToByte(String hex) {
    int len = (hex.length() / 2);
    byte[] result = new byte[len];
    char[] achar = hex.toCharArray();
    for (int i = 0; i < len; i++) {
      int pos = i * 2;
      result[i] = (byte) (toByte(achar[pos]) << 4 | toByte(achar[pos + 1]));
    }
    return result;
  }

  private static byte toByte(char c) {
    byte b = (byte) "0123456789abcdef".indexOf(c);
    return b;
  }

  // 获取Key
  public Key getKey(byte[] passKey) {
    Key convertSecretKey = null;
    try {
      DESKeySpec deSedeKeySpec = new DESKeySpec(passKey);
      SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
      convertSecretKey = factory.generateSecret(deSedeKeySpec);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return convertSecretKey;
  }

  // 加密
  public byte[] encode(byte[] source, Key key) throws Exception {
    cipher.init(Cipher.ENCRYPT_MODE, key);
    byte[] encodeSource = cipher.doFinal(source);
    return encodeSource;
  }

  // 解密
  public String decode(byte[] encodeSource, Key key) throws Exception {
    cipher.init(Cipher.DECRYPT_MODE, key);
    byte[] decodeRes = cipher.doFinal(encodeSource);
    return new String(decodeRes, "UTF-8");
  }

  public static void main(String[] args) throws Exception {
    AnotherDES dt = new AnotherDES();
    byte[] passKey = new byte[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    System.out.println(passKey.length);
    Key key = dt.getKey(passKey);
    String obj = "就先测试这句吧";
    System.out.println("加密前:" + obj);
    byte[] source = dt.encode(obj.getBytes("UTF-8"), key);
    System.out.println("加密后:" + bytesToHexString(source));
    String res = dt.decode(source, key);
    System.out.println("解密后:" + res);
    String s1 = "0815d22bf5ae0bdd9d37594cedd4be6c1fead86115544517";
    String s2 = "0815d22bf5ae0bdd9d37594cedd4be6c1fead86115544517";
    System.out.println(s1.equals(s2));
  }
}
