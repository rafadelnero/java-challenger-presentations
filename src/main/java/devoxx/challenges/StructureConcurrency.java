//package devoxx.challenges;
//
//import java.util.Arrays;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.Future;
//import jdk.incubator.concurrent.StructuredTaskScope;
//
//public class StructureConcurrency {
//  public static void main(String[] args) throws ExecutionException, InterruptedException {
//    String result = getBestCharacter() + getCharacter();
//    System.out.println("Result = " + result);
//  }
//
//  private static String getBestCharacter() throws ExecutionException {
//    try (var scope = new StructuredTaskScope.ShutdownOnSuccess<String>()) {
//      // First that is executed will ignore other methods
//      // scope.fork is an asynchronous call
//      Future<String> f1 = scope.fork(StructureConcurrency::getData);
//      Future<String> f2 = scope.fork(StructureConcurrency::getMcCoy);
//      scope.join();
//      return scope.result();
//    } catch (InterruptedException e) {
//      throw new RuntimeException(e);
//    }
//  }
//
//  private static String getCharacter() {
//    try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
//      // Since nothing fails, there will be both results
//      // Those are asynchronous methods
//      Future<String> f1 = scope.fork(StructureConcurrency::getData);
//      Future<String> f2 = scope.fork(StructureConcurrency::getMcCoy);
//      scope.join();
//      return f1.resultNow() + f2.resultNow();
//    } catch (InterruptedException e) {
//      throw new RuntimeException(e);
//    }
//  }
//
//  private static String getData() throws InterruptedException {
//    Thread.sleep(5000);
//    return "Data ";
//  }
//
//  private static String getMcCoy() {
//    return "McCoy ";
//  }
//}
