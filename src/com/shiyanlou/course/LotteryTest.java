package com.shiyanlou.course;

import java.util.Scanner;


public class LotteryTest {



    public static void main(String[] args){


        Lottery l= new Lottery();

        Scanner scan = new Scanner(System.in);
        //创建扫描器


        System.out.println("Please input the number of lottery group(s) " +
                "that you want to generate :");


        String groupNum = scan.nextLine();

        l.generateLottery(groupNum);



    }




}
