/**
 * 
 */
package com.afpa.cda.atos.module.tp1;

import java.io.ByteArrayInputStream;

public class CrashTest {

  public static void main(String[] args) {
    byte[] tableau = "hello the world".getBytes();
    ByteArrayInputStream stream = new ByteArrayInputStream(tableau);

    int octet;
    while ((octet = stream.read()) != -1) {
      System.out.print((char) octet);
    }
  }

}
