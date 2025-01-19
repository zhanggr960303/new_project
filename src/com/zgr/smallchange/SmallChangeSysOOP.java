package com.zgr.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类完成零钱通的各个功能
 * @version 1.0
 * @author zhanggengrui
 */
public class SmallChangeSysOOP {

    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "-------零钱通明细-------";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化
    String note = "";

    public void mainMenu(){
        do {
            System.out.println("========零钱通菜单情况========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");

            System.out.println("请选择（1-4）:");
            key = scanner.next();
            switch (key) {
                case "1" :
                    this.detail();
                    break;
                case "2" :
                    this.income();
                    break;
                case "3" :
                    this.pay();
                    break;
                case "4" :
                   this.exit();
                   loop = false;
                   break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        } while (loop);
    }

    public void detail(){
        System.out.println(details);
    }

    public void income() {
        System.out.print("收益入账金额:");
        money = scanner.nextDouble();
        if(money <= 0) {
            System.out.println("收益金额金额需要大于0");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void pay(){
        System.out.println("消费金额:");
        money = scanner.nextDouble();
        if(money <= 0 || money > balance) {
            System.out.println("消费金额应该在0-" + balance + "之间");
            return;
        }
        System.out.println("请输入消费说明:");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void exit(){
        System.out.println("4 退出");
        String choice = "";
        while(true) {
            System.out.println("你确定要退出吗？");
            choice = scanner.next();
            if("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
    }
}
