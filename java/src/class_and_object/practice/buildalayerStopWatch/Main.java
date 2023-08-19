package class_and_object.practice.buildalayerStopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch= new StopWatch();
        stopWatch.stop();
        System.out.println("a = " + stopWatch.getStartTime());
        System.out.println("b = " + stopWatch.getElapsedTime());
    }
}
