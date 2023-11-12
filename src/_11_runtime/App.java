package _11_runtime;

public class App {
  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();
    int availableProcessors = runtime.availableProcessors();
    long freeMemory = runtime.freeMemory();
    long maxMemory = runtime.maxMemory();
    long totalMemory = runtime.totalMemory();
    StringBuilder builder = new StringBuilder();
    builder.append("=== Runtime Class ===\n");
    builder.append("Available Processors:\t" + availableProcessors + "\n");
    builder.append("Free Memory:\t" + freeMemory + "\n");
    builder.append("Total Memory:\t" + totalMemory + "\n");
    builder.append("Max Memory:\t" + maxMemory + "\n");
    System.out.println(builder.toString());
    /*
     * Output:
     * === Runtime Class ===
     * Available Processors: 8
     * Free Memory: 249097536
     * Total Memory: 251658240
     * Max Memory: 3999268864
     */
  }
}
