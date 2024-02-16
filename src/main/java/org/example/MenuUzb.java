package org.example;

import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MenuUzb {

    public SendMessage menu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Hizmatni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList=new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2= new KeyboardButton();
        button.setText("Katigoriyalar\uD83D\uDDC2");
        button1.setText("Bizning sayt\uD83D\uDECD");
        button2.setText("Sozlamalar⚙\uFE0F");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        rowList.add(row);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage Sozlamalar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Sozlamalar⚙\uFE0F");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1= new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        button.setText("Tilni O`zgartirish\uD83D\uDD04");
        button1.setText("Raqamni o`zgartirish\uD83D\uDD04");
        button2.setText("👈Orqaga");
        row.add(button);
        row.add(button1);
        row1.add(button2);
        rowList.add(row);
        rowList.add(row1);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setResizeKeyboard(true);
        return sendMessage;
    }
    public SendMessage TilOzgartirish(Long chatid){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("На какую язык хотите поменять \nqaysi tilga o`zgartirmoqchisiz");
        sendMessage.setChatId(chatid);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList=new ArrayList<>();
        KeyboardRow row=new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        button.setText("O`zbek tili\uD83C\uDDFA\uD83C\uDDFF\uD83D\uDD04");
        button1.setText("Русский язык\uD83C\uDDF7\uD83C\uDDFA\uD83D\uDD04");
        row.add(button);
        row.add(button1);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage RaqamOzgartirish(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ozgartirmoqchi bo`lgan raqamingizni  \n " +
                " +7 **********  YOKI +998 ********* korinishida yuboring");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList=new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("👈 Orqaga");
        row.add(button);
        rowList.add(row);
        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage Kategoriyalar(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("""
                 <b>Kategoriyalar</b>
                """);
        sendMessage.setParseMode(ParseMode.HTML);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>>rowlist=new ArrayList<>();
        List<InlineKeyboardButton>row=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Elektronika");
        button.setCallbackData("Elektronika");
        row.add(button);
        rowlist.add(row);

        button=new InlineKeyboardButton();
        button.setText("Maishiy Texnika");
        button.setCallbackData("Maishiy Texnika");
        row.add(button);

        button=new InlineKeyboardButton();
        row=new ArrayList<>();
        button.setText("Kiyimlar");
        button.setCallbackData("Kiyimlar");
        row.add(button);
        rowlist.add(row);

        button=new InlineKeyboardButton();
        button.setText("Aksessuarlar");
        button.setCallbackData("Aksessuarlar");
        row.add(button);

        button=new InlineKeyboardButton();
        row=new ArrayList<>();
        button.setText("Go`zallik va parvarish");
        button.setCallbackData("Go`zallik va parvarish");
        row.add(button);
        rowlist.add(row);

        button=new InlineKeyboardButton();
        button.setText("Salomatlik");
        button.setCallbackData("Salomatlik");
        row.add(button);

        button=new InlineKeyboardButton();
        row=new ArrayList<>();
        button.setText("Qurilish mollari");
        button.setCallbackData("Qurilish mollari");
        row.add(button);
        rowlist.add(row);

        button=new InlineKeyboardButton();
        button.setText("Avtotovarlar");
        button.setCallbackData("Avtotovarlar");
        row.add(button);

        button=new InlineKeyboardButton();
        row=new ArrayList<>();
        button.setText("Bolalar uchun");
        button.setCallbackData("Bolalar uchun");
        row.add(button);
        rowlist.add(row);

        button=new InlineKeyboardButton();
        button.setText("Sport va hordiq");
        button.setCallbackData("Sport va hordiq");
        row.add(button);
        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage KategoriyaOrqaga(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("yana qaysidur hizmatdan foydalanishni hohlaysizmi? ");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList=new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();
        button.setText("👈Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setResizeKeyboard(true);
        return sendMessage;
    }
    public SendMessage Site(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("""
                 <b> "https://uzum.uz/ru" Uzum Market </b>
                """);
        sendMessage.setParseMode(ParseMode.HTML);

        return sendMessage;
    }


}