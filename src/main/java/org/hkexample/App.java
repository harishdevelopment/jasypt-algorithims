package org.hkexample;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.registry.AlgorithmRegistry;

import java.security.Security;
import java.util.Set;

public class App {
  public static void main(String[] args) {
    try {
      Security.addProvider(new BouncyCastleProvider());
      final Set pbeAlgos = AlgorithmRegistry.getAllPBEAlgorithms();
      System.out.println("#### PBE ALGORITHMS ####");
      for (Object algorithms : pbeAlgos){
        System.out.println(algorithms);
      }
    } catch (Throwable t) {
      t.printStackTrace(System.err);
    }
  }
}
