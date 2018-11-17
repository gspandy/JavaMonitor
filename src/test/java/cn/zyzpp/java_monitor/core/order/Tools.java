package cn.zyzpp.java_monitor.core.order;

import cn.zyzpp.java_monitor.core.cmd.ExecuteCmd;
import cn.zyzpp.java_monitor.core.entity.JinfoEntity;
import org.junit.Test;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

/**
 * Create by yster@foxmail.com 2018/11/17 0017 13:03
 */
public class Tools {

    @Test
    public void infoTest(){
        JinfoEntity info = Jinfo.info("8224");
        System.out.println(info.toString());
    }

    @Test
    public void system(){
        OperatingSystemMXBean operatingSystem = ManagementFactory.getOperatingSystemMXBean();
        System.out.println("系统名称"+operatingSystem.getName());
        System.out.println("位数"+operatingSystem.getArch());
        System.out.println("处理器数"+operatingSystem.getAvailableProcessors());
        System.out.println("操作系统版本"+operatingSystem.getVersion());
    }

    @Test
    public void toolsTest() throws InterruptedException {
        String s = ExecuteCmd.execute(new String[]{"java", "sun.tools.jinfo.JInfo"});
        System.out.println(s);
    }

}
