package org.hkexample;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.registry.AlgorithmRegistry;

import java.security.Security;
import java.util.Set;

public class App {
  public static void main(String[] args) {
    try {
      final Set pbeAlgorithmsWithoutBouncyCastle = AlgorithmRegistry.getAllPBEAlgorithms();
      System.out.println("#### PBE ALGORITHMS WITHOUT BOUNCY CASTLE ####");
      for (Object algorithms : pbeAlgorithmsWithoutBouncyCastle){
        System.out.println(algorithms);
      }

      Security.addProvider(new BouncyCastleProvider());
      final Set pbeAlgorithmsWithBouncyCastle = AlgorithmRegistry.getAllPBEAlgorithms();
      System.out.println("\n\n\n#### PBE ALGORITHMS WITH BOUNCY CASTLE ####");
      for (Object algorithms : pbeAlgorithmsWithBouncyCastle){
        System.out.println(algorithms);
      }

    } catch (Throwable t) {
      t.printStackTrace(System.err);
    }
  }
}
