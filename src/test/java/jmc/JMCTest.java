package jmc;

/**
 * JMC 主页： https://www.oracle.com/java/technologies/jdk-mission-control.html
 *
 * Mac 安装 JMC 报错 Failed to create the Java Virtual Machine 无法启动时参考这个答案： https://stackoverflow.com/a/60912567
 * 即在软件的 Info.plist 中找到添加 JRE 的位置
 *
 * 测试 JMC
 *
 * @author moqi
 * On 9/18/20 09:58
 */

public class JMCTest {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10000; i++) {
            System.out.println("i = " + i);
            Thread.sleep(1000L);
        }
    }

}
