package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class BotService {

    public SendMessage Salom(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Assalomu aleykum \n Botga xush kelibsiz☺");
        sendMessage.setChatId(chatId);
        return sendMessage;
    }





}
