package tracking;

import java.nio.ByteBuffer;

/**
 *
 * 根据 https://gist.github.com/prasanthj/48e7063cac88eb396bc9961fb3149b58 测试 Native Memory Tracking
 * 首先加上 JVM 运行参数： -XX:NativeMemoryTracking=detail -Xms128M -Xmx128M -XX:MaxDirectMemorySize=1024M
 * 通过 jps 获取 pid
 * 然后通过 jcmd 获取 Native Memory Tracking 内容
 * jcmd ${pid} VM.native_memory
 *
 * 例如：
 * ~ jps
 * 53472
 * 99760
 * 35078 Jps
 * 34906 Launcher
 * 34907 BaselineDirect
 *
 * ps -p 34907 -o pcpu,rss,size,vsize
 * ps: size: keyword not found
 *  %CPU    RSS      VSZ
 *   0.0 1082824  7863628
 *
 * jcmd 34907 VM.native_memory
 * 34907:
 *
 * Native Memory Tracking:
 *
 * Total: reserved=2552393KB, committed=1253425KB
 * -                 Java Heap (reserved=131072KB, committed=131072KB)
 *                             (mmap: reserved=131072KB, committed=131072KB)
 *
 * -                     Class (reserved=1068164KB, committed=16260KB)
 *                             (classes #640)
 *                             (malloc=11396KB #241)
 *                             (mmap: reserved=1056768KB, committed=4864KB)
 *
 * -                    Thread (reserved=23649KB, committed=23649KB)
 *                             (thread #24)
 *                             (stack: reserved=23552KB, committed=23552KB)
 *                             (malloc=69KB #127)
 *                             (arena=28KB #43)
 *
 * -                      Code (reserved=249695KB, committed=2631KB)
 *                             (malloc=95KB #414)
 *                             (mmap: reserved=249600KB, committed=2536KB)
 *
 * -                        GC (reserved=17485KB, committed=17485KB)
 *                             (malloc=12689KB #138)
 *                             (mmap: reserved=4796KB, committed=4796KB)
 *
 * -                  Compiler (reserved=134KB, committed=134KB)
 *                             (malloc=3KB #34)
 *                             (arena=131KB #7)
 *
 * -                  Internal (reserved=1060145KB, committed=1060145KB)
 *                             (malloc=1060113KB #1766)
 *                             (mmap: reserved=32KB, committed=32KB)
 *
 * -                    Symbol (reserved=1713KB, committed=1713KB)
 *                             (malloc=1066KB #195)
 *                             (arena=648KB #1)
 *
 * -    Native Memory Tracking (reserved=161KB, committed=161KB)
 *                             (malloc=94KB #1321)
 *                             (tracking overhead=67KB)
 *
 * -               Arena Chunk (reserved=176KB, committed=176KB)
 *                             (malloc=176KB)
 *
 * @author moqi
 * On 9/18/20 09:24
 */

public class BaselineDirect {
    private static final ByteBuffer BUFFER = ByteBuffer.allocateDirect(1024 * 1024 * 1024);

    public static void main(String[] args) throws Exception {
        System.out.println("Direct allocation: " + BUFFER.capacity());
        System.out.println("Native memory used: " + sun.misc.SharedSecrets.getJavaNioAccess().getDirectBufferPool().getMemoryUsed());
        System.out.println("Max direct memory: " + sun.misc.VM.maxDirectMemory());
        Thread.sleep(1000000);
    }

}
