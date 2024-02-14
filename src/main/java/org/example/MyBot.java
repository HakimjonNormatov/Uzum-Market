package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()){
            String text = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();

            if (text.equals("/start")){

            }


        }

    }

    @Override
    public String getBotUsername() {
        return "AsosiyUzum_bot";
    }

    @Override
    public String getBotToken() {
        return "6278691791:AAHUo1ctSTY8e12o9KUoywgrMUXFlTO4lGU";
    }
}
