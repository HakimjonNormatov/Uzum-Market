package org.example;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MyBot extends TelegramLongPollingBot {

    private String Language;
    BotService botservice=new BotService();
    MenuUzb menuUzb=new MenuUzb();
    MenuRus menuRus=new MenuRus();
    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()){
            String text = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();
            String firstName = update.getMessage().getChat().getFirstName();
            String lastName = update.getMessage().getChat().getLastName();
            Long id = update.getMessage().getChat().getId();

            info(firstName , lastName , chatId , text);

            if (text.equals("/start")){
                try {
                    execute(botservice.Salom(chatId));
                    execute(botservice.Til(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("O`zbek tili\uD83C\uDDFA\uD83C\uDDFF")){
                try {
                    Language="uz";
                    execute(botservice.ContactUzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Русский язык\uD83C\uDDF7\uD83C\uDDFA")){
                Language="ru";
                try {
                    execute(botservice.ContactRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Sozlamalar⚙\uFE0F")){
                try {
                    execute(menuUzb.Sozlamalar(chatId));
                }catch (TelegramApiException e){
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Tilni O`zgartirish\uD83D\uDD04")) {
                try {
                    execute(menuUzb.TilOzgartirish(chatId));
                }catch (TelegramApiException e){
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Raqamni o`zgartirish\uD83D\uDD04")){
                try {
                    execute(menuUzb.RaqamOzgartirish(chatId));
                }catch (TelegramApiException e){
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("O`zbek tili\uD83C\uDDFA\uD83C\uDDFF\uD83D\uDD04")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Til o`zgardi");
                try {
                    execute(sendMessage);
                    execute(menuUzb.menu(chatId));
                }catch (TelegramApiException e){
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Русский язык\uD83C\uDDF7\uD83C\uDDFA\uD83D\uDD04")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Язык изминился");
                try {
                    execute(sendMessage);
                    execute(menuRus.menu(chatId));
                }catch (TelegramApiException e){
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Настройки⚙\uFE0F")){
                try {
                    execute(menuRus.Sozlamalar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Изменить язык\uD83D\uDD04")){
                try {
                    execute(menuRus.TilOzgartirish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Изменить номер\uD83D\uDD04")){
                try {
                    execute(menuRus.RaqamOzgartirish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Katigoriyalar\uD83D\uDDC2")){
                try {
                    execute(menuUzb.Kategoriyalar(chatId));
                    execute(menuUzb.KategoriyaOrqaga(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Категории\uD83D\uDDC2")){
                try {
                    execute(menuRus.Kategoriyalar(chatId));
                    execute(menuRus.KategoriyaOrqaga(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("👈Orqaga")){
                try {
                    execute(menuUzb.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }if (text.equals("👈 Orqaga")){
                try {
                    execute(menuUzb.Sozlamalar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("👈Назад")){
                try {
                    execute(menuRus.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("👈 Назад")){
                try {
                    execute(menuRus.Sozlamalar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Bizning sayt\uD83D\uDECD")){
                try {
                    execute(menuUzb.Site(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Наш сайт\uD83D\uDECD")){
                try {
                    execute(menuRus.Site(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


        } else if (update.hasMessage() && update.getMessage().hasContact()){
            if (Language.equals("uz")) {
                SendMessage sendMessage = new SendMessage();
                Long chatId = update.getMessage().getChatId();
                String phoneNumber = update.getMessage().getContact().getPhoneNumber();
                String firstName = update.getMessage().getFrom().getFirstName();
                String lastName = update.getMessage().getFrom().getLastName();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Hurmatli " + firstName + " tabriklaymiz ro`yxatdan muvaffaqiyatli o`tdingiz🤗");
                try {
                    execute(sendMessage);
                    execute(menuUzb.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (Language.equals("ru")){
                SendMessage sendMessage = new SendMessage();
                Long chatId = update.getMessage().getChatId();
                String phoneNumber = update.getMessage().getContact().getPhoneNumber();
                String firstName = update.getMessage().getFrom().getFirstName();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Уважаемый "+firstName+" вы успешно зарегистрировались🤗");
                try {
                    execute(sendMessage);
                    execute(menuRus.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            System.out.println(data);
            Long chatId = callbackQuery.getMessage().getChatId();
            Message message = callbackQuery.getMessage();
            if (data.equals("Elektronika")){

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
    private void info(String Firstname , String Lastname , Long Id , String text){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd//MM//yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        System.out.println("Ismi: "+Firstname +"\n "+"Familiyasi: "+Lastname +"\n"+"Id: "+Id+"\n"+"Text: "+text);
    }
}