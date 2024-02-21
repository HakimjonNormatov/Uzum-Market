package org.example;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaPhoto;
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
                try {
                    execute(menuUzb.Bir_Elektronikasendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-elektronika oldinga")||(data.equals("3-elektronika orqaga"))){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://uzum.uz/uz/product/televizor-premier-43prm705s-full-hd-smart-910164?SG=1415458");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Televizor Premier 43PRM705S, Full HD Smart TV \n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Matritsa turi - VA paneli\n" +
                        "● Ekran o'lchamlari - Full HD (1920 * 1080)\n" +
                        "● Smart TV - Android\n" +
                        "● Kafolat - 3 yil\n "+menuUzb.ElektronikaUchunSendMessage(chatId));

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_Elektronika(chatId));
                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);

                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-elektronika oldinga")||(data.equals("4-elektronika orqaga"))){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cla6qcnn7c6qm23j01mg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_Elektronika(chatId));

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Planshet Xiaomi Redmi Pad SE Global 4/6/128GB, 8/256GB, katta akkumulator, 8000 mAs \n \n" +
                       "Mahsulot haqida qisqacha: \n" +
                       "● Ikki Wi-Fi diapazonlarini qo‘llab-quvvatlash: 2.4 GGs va 5 GGs,\n" +
                       "● Bluetooth 5.0 boshqa qurilmalarga va internet tarmog‘iga barqaror va tez ulanishni ta’minlaydi \n" +
                       "● Ushbu gadjet 2.4 GGsgacha tezlik olish qobiliyatiga ega bo‘lgan 6-nm texjarayon va 8 yadrolarga ega bo‘lgan Snapdragon® 680 protsessor bilan jihozlangan, \n" +
                       "bu barcha ilovalar va dasturlarning tez va ravon ishlashini ta’minlaydi. \n" +
                       "● Planshet o‘z ichiga LPDDR4X 4/6/8GB operativ xotirani\n" +
                       "va eMMC 5.1 128/256GB ichki xotirani kiritadi, bu ma’lumotlarning \n" +
                       "katta miqdorini saqlashga va ularga ishlov berishning yuqori " +
                       "tezligini ta’minlash imkonini beradi\n"+
                       "● PUBG Mobile o‘yinida, siz 60 FPSgacha olasiz.");
                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-elektronika oldinga")||(data.equals("5-elektronika orqaga"))){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ckk5o4cjvf2peh8sjehg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());


                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Model: \n" +
                        " Sony PlayStation 5 Slim 1000 GB disk drayveri bilan\n" +
                        " Mahsulot haqida qisqacha:\n" +
                        " ● Protsessor chastotasi: 3500 MGts\n" +
                        " ● RAM: 16 GB\n" +
                        " ● GPU: AMD Radeon\n" +
                        " ● Video xotira soati: 2230 MGts\n" +
                        " ● O'rnatilgan xotira turi: 825 GB SSD\n" +
                        " ● Optik haydovchi turi: Blu-ray/DVD\n" +
                        " ● Maksimal ruxsat: 8K Ultra HD qo'llab-quvvatlash\n" +
                        " ● Yaponiya 3-chi tahrir\n" +
                        " ● Protsessor turi: 8 yadroli AMD Ryzen Zen 2");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.tort_Elektronika(chatId));
                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-elektronika oldinga" )||( data.equals("6-elektronika orqaga"))){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cjjgakkvutv1g2ricde0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.besh_Elektronika(chatId));

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Mobil telefon Novey A11 \n " +
                        "Mahsulot haqida qisqacha:\n" +
                        " ● Ekran diagonali: 1.77\n" +
                        " ● Aloqa standarti: 2G (GSM 850/900/1800/1900)\n" +
                        " ● SIM kartalar soni: 2\n" +
                        " ● Bluetooth: Bor\n" +
                        " ● Qo'shimcha funktsiyalar: Chiroq, FM radio\n" +
                        " ● Ulagich: Micro USB\n" +
                        " ● Batareya: 1050 mA/soat");

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-elektronika oldinga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clk4get6sfhsc0umir90/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.olti_Elektronika(chatId));

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Aqlli qo'l soati Zeblaze Vibe 7 Pro");

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-elektronika orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cmfa23hs99ouqbfq6kq0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Smartfon Xiaomi Redmi 13C 4GB+128GB, 8GB+256GB, 6.74  90Hz, 5000 mA/soat, Dual SIM, 4G LTE \n" +
                        "Mahsulot haqida qisqacha: \n" +
                        "● Ekran: Corning® Gorilla® Glass \n" +
                        "● Batareya: 5000mAh (turi) 18W PD zaryadlashni qo'llab-quvvatlaydi\n" +
                        "● Xavfsizlik: TouchID \n" +
                        "● Кino kamerasi / HDR rejimi / tungi rejim / portret rejimi / 50 Mp rejimi\n" +
                        "● Asosiy kamera 50 Mp 5p ob'ektiv, f/1.8\n" +
                        "● 8 megapikselli old kamera f/2.0\n" +
                        "● Protsessor: MediaTek Helio G85\n" +
                        "● Diagonali displey: 6,74 dyum 1600x720, 260 ppi\n" +
                        "● Yangilanish tezligi: 90 Hz gacha\n" +
                        "● Yorqinligi: 450 nit (turi), 600 nit");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_ElektronikaInline(chatId));
                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



             if (data.equals("Maishiy Texnika")){
                try {
                    execute(menuUzb.Bir_MaishiyTexnikaSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Maishiy texnika oldinga")||data.equals("3-Maishiy texnika orqaga")){

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_MaishiyTexnika(chatId));

                try {
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Maishiy texnika oldinga")||data.equals("4-Maishiy texnika orqaga")){
                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_MaishiyTexnika(chatId));

                try {
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Maishiy texnika oldinga")||data.equals("5-Maishiy texnika orqaga")){
                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_MaishiyTexnika(chatId));

                try {
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Maishiy texnika oldinga")||data.equals("6-Maishiy texnika orqaga")){
                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_MaishiyTexnika(chatId));

                try {
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Maishiy texnika oldinga")){
                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_MaishiyTexnika(chatId));

                try {
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Maishiy texnika orqaga")){
                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_MaishiyTexnikaInline(chatId));

                try {
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



            if (data.equals("Kiyimlar")){
                try {
                    execute(menuUzb.Bir_KiyimlarSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Kiyimlar oldinga")||data.equals("3-Kiyimlar orqaga")){
                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_Kiyimlar(chatId));

                try {
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Kiyimlar oldinga")||data.equals("4-Kiyimlar orqaga")){
                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_Kiyimlar(chatId));

                try {
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Kiyimlar oldinga")||data.equals("5-Kiyimlar orqaga")){
                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_Kiyimlar(chatId));

                try {
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Kiyimlar oldinga")||data.equals("6-Kiyimlar orqaga")){
                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_Kiyimlar(chatId));

                try {
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Kiyimlar oldinga")){
                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_Kiyimlar(chatId));

                try {
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Kiyimlar orqaga")){
                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_KiyimlarInline(chatId));

                try {
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

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