package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MenuRus {


    public SendMessage menu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выбирайте Услугу");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2= new KeyboardButton();
        button.setText("Категории\uD83D\uDDC2");
        button1.setText("Про насℹ\uFE0F");
        button2.setText("Настройки⚙\uFE0F");

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
        sendMessage.setText("Настройки⚙\uFE0F");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        button.setText("Изменить язык\uD83D\uDD04");
        button1.setText("Изменить номер\uD83D\uDD04");
        row.add(button);
        row.add(button1);
        rowList.add(row);
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
        sendMessage.setText("Введите номер, который хотите изменить");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList=new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Переслать контакт");
        row.add(button);
        rowList.add(row);
        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
}
