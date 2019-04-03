package com.axing.chapter2.bank1;

public class Bank {
    public static void main(String[] args) {
        //使用static修饰变量，以达到控制所有线程


        TicketWindow ticketWindow1 = new TicketWindow("一号柜台");
        ticketWindow1.start();

        TicketWindow ticketWindow2 = new TicketWindow("二号柜台");
        ticketWindow2.start();

        TicketWindow ticketWindow3 = new TicketWindow("三号柜台");
        ticketWindow3.start();

    }
}
