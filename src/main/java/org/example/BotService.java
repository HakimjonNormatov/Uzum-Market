package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import javax.security.auth.callback.LanguageCallback;
import java.util.ArrayList;
import java.util.List;

public class BotService {
    public SendMessage Salom(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Assalomu aleykum \n Botga xush kelibsiz☺");
        sendMessage.setChatId(chatId);
        return sendMessage;
    }

    public SendMessage Til(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tilni Tanlang \n Выбирайте язык");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList=new ArrayList<>();
        KeyboardRow row=new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        button.setText("O`zbek tili\uD83C\uDDFA\uD83C\uDDFF");
        button1.setText("Русский язык\uD83C\uDDF7\uD83C\uDDFA");
        row.add(button);
        row.add(button1);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage ContactUzb(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ro`yxatdan o`tish uchun iltimos raqamingizni jo`nating");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList=new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Kontakt jo`natish");
        button.setRequestContact(true);
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setSelective(true);
        return sendMessage;
    }

    public SendMessage ContactRus(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Отправляйте номер для регистрации");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList=new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Переслать контакт");
        button.setRequestContact(true);
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setSelective(true);
        return sendMessage;
    }







}
