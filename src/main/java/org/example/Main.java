package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReplyService bot = new ReplyService();

        System.out.println(bot.reply("hi", ReplyType.FORMAL));
        System.out.println(bot.reply("hello", ReplyType.FRIENDLY));
        System.out.println(bot.reply("how are you", ReplyType.CONCISE));
        System.out.println(bot.reply("unknown message", ReplyType.FORMAL));
        System.out.println(bot.reply("", ReplyType.FRIENDLY));
    }
}
