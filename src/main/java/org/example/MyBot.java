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
import org.telegram.telegrambots.meta.api.objects.InputFile;
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
            if (text.equals("Savat\uD83D\uDED2")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Hozircha savatingiz bo`sh");
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
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
            }
            if (text.equals("👈 Orqaga")){
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
            if (text.equals("Корзина\uD83D\uDED2")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Ваша корзина пока пуста");
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


        }

        else if (update.hasMessage() && update.getMessage().hasContact()){
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

        }

        else if (update.hasCallbackQuery()) {
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
            if (data.equals("1-elektronika plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_ElektronikaInlinePlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-elektronika minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_ElektronikaInlineMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-elektronika oldinga")||data.equals("3-elektronika orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cn4ucohs99ouqbfu5jt0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Televizor Premier 43PRM705S, Full HD Smart TV \n " +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Matritsa turi - VA paneli\n" +
                        "● Ekran o'lchamlari - Full HD (1920 * 1080)\n" +
                        "● Smart TV - Android\n" +
                        "● Kafolat - 3 yil");

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
            if (data.equals("2-elektronika plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_ElektronikaPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-elektronika minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_ElektronikaMinus(chatId));
                try {
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
            if (data.equals("3-elektronika plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_ElektronikaPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-elektronika minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_ElektronikaMinus(chatId));
                try {
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
            if (data.equals("4-elektronika plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.tort_ElektronikaPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-elektronika minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.tort_ElektronikaMinus(chatId));
                try {
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
            if (data.equals("5-elektronika plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.besh_ElektronikaPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-elektronika minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.besh_ElektronikaMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-elektronika oldinga")||data.equals("1-Maishiy texnika orqaga")){
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
            if (data.equals("6-elektronika plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.olti_ElektronikaPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-elektronika minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.olti_ElektronikaMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-elektronika orqaga")||data.equals("6-Sport oldinga")){
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
            if (data.equals("1-Maishiy texnika plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_MaishiyTexnikaInlinePlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Maishiy texnika minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_MaishiyTexnikaInlineMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Maishiy texnika oldinga")||data.equals("3-Maishiy texnika orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cmcj35bifoubkc6n5f8g/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Mikroto'lqinli pech Goodwell GMF-2012W, Solo, 20 L\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Boshqarish turi: Mexanik\n" +
                        "● Hajmi: 20 L\n" +
                        "● Koson turi: Oq\n" +
                        "● Mikroto'lqinli pechning quvvati: 700 Vt\n" +
                        "● Ishlab chiqaruvchi: Xitoy\n" +
                        "● Kafolat: 3 yil");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_MaishiyTexnika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Maishiy texnika plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_MaishiyTexnikaPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Maishiy texnika minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_MaishiyTexnikaMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Maishiy texnika oldinga")||data.equals("4-Maishiy texnika orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ckjbb6cjvf2sulnvad3g/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Konditsioner TCL TAC - 12CHSD/YA 11 I Invertor, ten bilan\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Elektr tent (harorat -15°C pasayganda ham to'xtovsiz ishlaydi)\n" +
                        "● Invertor motor (past elektr kuchlanishda ham ishlashni davom etadi)\n" +
                        "● R32 freon. Kam shovqin darajasi (19dB gacha)\n" +
                        "● LED displey va kutish rejimi (minimal shovqin darajasini va qulay harorat o'zgarishini ta'minlaydi)\n" +
                        "● Xavfsiz dizayn. Kondensat va elektr o'rtasida aloqa yo'q.");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_MaishiyTexnika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Maishiy texnika plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_MaishiyTexnikaPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Maishiy texnika minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_MaishiyTexnikaMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Maishiy texnika oldinga")||data.equals("5-Maishiy texnika orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/chmpuav5d7kom1tgatb0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Dazmol HADiD BI-101\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● HADID BI-101\n" +
                        "● MODEL NO.:BI-101\n" +
                        "● 220-240V kuchlanish 50-60Hz\n" +
                        "● Quvvat 1200-1600 W\n" +
                        "● Suv idishining hajmi: 200ml.\n" +
                        "● Keramika tagligi\n" +
                        "● Balandligi 250 (mm) 25 sm.\n" +
                        "● Bug'li dazmol\n" +
                        "● Made in P.R.C");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_MaishiyTexnika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Maishiy texnika plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_MaishiyTexnikaPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Maishiy texnika minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_MaishiyTexnikaMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Maishiy texnika oldinga")||data.equals("6-Maishiy texnika orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ckiempsjvf2sulnv3dng/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Portativ tikuv mashinasi Mini Sewing Machine SM-202\n\n" +
                        "Texnik xususiyatlari:\n" +
                        "\n" +
                        " ● Quvvat: 4.8 Vt\n" +
                        "\n" +
                        " ● Chastotasi: 50 Hz\n" +
                        "\n" +
                        " ● Parametrlar (l/g/soat): 19.5*12.5*20 sm\n" +
                        "\n" +
                        " ● Uzluksiz ish vaqti: cheklovlarsiz\n" +
                        "\n" +
                        " ● 2 tezlik");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_MaishiyTexnika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Maishiy texnika plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_MaishiyTexnikaPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Maishiy texnika minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_MaishiyTexnikaMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Maishiy texnika oldinga")||data.equals("1-Kiyimlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cmtl0d125ku8jql6hcj0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Isitgich AIWA CNH1114, 2000 Vt 25 kvadrat metrga, g'ildirakli shassili pechka\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● 25 kvadrat uchun 2 kVt quvvat maydonlarni isitadi\n" +
                        "● Kompakt - qulay dizaynga ega, uni oson olib borish va har qanday sharoitda foydalanish oson\n" +
                        "● Ishonchli va qulay qurilma\n" +
                        "● Rang: oq\n" +
                        "● Kuchi - 2000 Vt");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_MaishiyTexnika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Maishiy texnika plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_MaishiyTexnikaPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Maishiy texnika minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_MaishiyTexnikaMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Maishiy texnika orqaga")||data.equals("6-elektronika oldinga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clomahfn7c6gg9ie3om0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Aqlli robot changyutgich Xiaomi Robot Vacuum E12 Global, quruq va nam tozalash\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Ishlab chiqaruvchidan rasmiy kafolat: 1 yil.\n" +
                        "● Yangi Xiaomi Robot Vacuum E12 EU bilan samarali va aqlli yig‘ishtirish dunyosini oching. Bu oddiy aqlli robot-changyutgich emas, balki tozalik dunyosidagi haqiqiy chempion.\n" +
                        "● Mi Home ilovasiga ulanib, siz yig‘ishtirish ustidan nazoratni qo‘lga kiritasiz. Aqlli robotni bevosita smartfoningizdan boshqaring, yig‘ishtirishning uchta rejimi orasidan tanlang va ortiqcha zo‘riqishlarsiz bekami-ko‘st tozalikdan bahramand bo‘ling.\n" +
                        "● Xiaomi Robot Vacuum E12 EU butun xonani samarali yig‘ishtirilishini ta’minlovchi 4000 Pa kuchli so‘ruvchi motor bilan jihozlangan. Chang va ifloslik haqida unuting - ushbu robot-changyutgich har qanday iflosliklarni uddasidan chiqadi.");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_MaishiyTexnikaInline(chatId));

                try {
                    execute(editMessageMedia);
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
            if (data.equals("1-Kiyimlar plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_KiyimlarInlinePlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Kiyimlar minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_KiyimlarInlineMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Kiyimlar oldinga")||data.equals("3-Kiyimlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cn325n3ifoubkc6r8ujg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Ayollar to'plami: yubka + kofta\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Tantanali tadbirlar va kundalik kiyim uchun javob beradi\n" +
                        "● Keng turadigon fason\n" +
                        "● Har qanday poyabzal bilan kiyinish mumkin\n" +
                        "● Bitta o'lcham 46-52 gacha mos keladi\n" +
                        "● Fasl: kuz qish bohor");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_Kiyimlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Kiyimlar plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_KiyimlarPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Kiyimlar minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_KiyimlarMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Kiyimlar oldinga")||data.equals("4-Kiyimlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cmjr8u1s99ouqbfqvh20/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Bolalar kombinezoni, chaqaloqlar uchun, quloqchalar bilan quyoncha, paxtali\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "Balandligi 52 dan 80 gacha bo'lgan o'lchamlar mavjud, ular chaqaloqlar va bir yarim yoshgacha bo'lgan bolalar uchun juda mos keladi.\n" +
                        "Yumshoq va nozik yuqori sifatli trikotaj mato. Kombinezon 95% paxta va 5% elastandan iborat. Elastanning ozgina foizi kombinezonga shakl beradi, burishmaydi, cho'zilmaydi");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_Kiyimlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Kiyimlar plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_KiyimlarPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Kiyimlar minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_KiyimlarMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Kiyimlar oldinga")||data.equals("5-Kiyimlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cn50anbifoubkc6rjrig/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Erkaklar krossovkalari Skechers GOWALK Flex 216481\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Havo sovutadigan Goga Mat oyoq to'shagini o'z ichiga oladi\n" +
                        "● Nafas oladigan trikotaj ustki\n" +
                        "● Asosiy xususiyatlar Yengil va sezgir ULTRA GO® tamponlama\n" +
                        "● Model har qanday lazzat uchun 3 ta rangda taqdim etilgan\n" +
                        "● Uzoq yurish, sport va kundalik hayot uchun juda mos keladi\n" +
                        "● SKECHERS assortimenti haqida ko'proq bilish uchun do'kon sahifasiga o'ting");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_Kiyimlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Kiyimlar plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_KiyimlarPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Kiyimlar minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_KiyimlarMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Kiyimlar oldinga")||data.equals("6-Kiyimlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cg67d37hgiov1qie6pbg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Ayollar krossovkalari \n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● EVA taglik, usti sun'iy teri");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_Kiyimlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Kiyimlar plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_KiyimlarPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Kiyimlar minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_KiyimlarMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Kiyimlar oldinga")||data.equals("1-Aksessuarlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ckp9t6sjvf2iqscbnfdg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Bolalar etikchalari, ustki qismi parusinalik, o'lchamlari 22-35");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_Kiyimlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Kiyimlar plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_KiyimlarPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Kiyimlar minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_KiyimlarMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Kiyimlar orqaga")||data.equals("6-Maishiy texnika oldinga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cfjidl7hgiopn8lc3bvg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Erkaklar sport to'plami, xudi shim bilan, qora\n\n" +
                        "Ikki ipli yuqori sifatli erkaklar kostyumi. Bahoriy havo uchun ajoyib variant. Ipli qalpoqli qalpoqli, katta kenguru cho'ntak, etagi manjetli. Kesish bepul.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Еrkaklar kostyumi, ikki ipli\n" +
                        "\n" +
                        "Kostyum siqilmaydi, yuqori sifatli mato\n" +
                        "\n" +
                        "Material: 90% paxta 10% polyester\n" +
                        "\n" +
                        "O'lchamlari: S M L XL XXL XXXL (to'liq o'lcham)");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_KiyimlarInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }


            if (data.equals("Aksessuarlar")){
                try {
                    execute(menuUzb.Bir_AksessuarlarSendPhoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Aksessuarlar plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_AksessuarlarPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Aksessuarlar minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_AksessuarlarMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Aksessuarlar oldinga")||data.equals("3-Aksessuarlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cje50qkjvf2trp6s4nrg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Erkaklar va yigitlar uchun 2 tarafli kamar SERRADOR\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Material: germantin\n" +
                        "● Ishlab chiqarilgan davlat: Xitoy\n" +
                        "● Rangi: bir tomoni qora - ikkinchi tomoni jigarrang\n" +
                        "● Eni: 4 sm\n" +
                        "● Bo`yi: 120 sm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_Aksessuarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }
            if (data.equals("2-Aksessuarlar plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_AksessuarlarPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Aksessuarlar minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_AksessuarlarMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Aksessuarlar oldinga")||data.equals("4-Aksessuarlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cjcb4lkvutv7iatast50/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Ayollar uchun sumka\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Yuqori sifatli armatura\n" +
                        "● Material-ekologik teri\n" +
                        "● Tanlash uchun 4 ta rang\n" +
                        "● Yilni o'lcham\n" +
                        "● Sozlanishi tasma\n" +
                        "● Ayollar uchun elkama-sumka");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_Aksessuarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }
            if (data.equals("3-Aksessuarlar plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_AksessuarlarPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Aksessuarlar minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_AksessuarlarMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Aksessuarlar oldinga")||data.equals("5-Aksessuarlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clqtjohs99oopol1euj0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Bolalar uchun qalpoq, bahor va kuz fasliga mos\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Kuz,Bahor va Qish fasli uchun mo'ljallangan qalpoq\n" +
                        "● O'lchamlarii: 1 yoshdan 3 yoshgacha\n" +
                        "● Ishlab chiqaruvchi O'zbekiston\n" +
                        "● 30 gradusdan past haroratda yuvilsin\n" +
                        "● Qiz va o'g'il bolalar uchun\n" +
                        "● Yengil to'qilgan material\n" +
                        "● Farzandingizga qulaylik va uslub bering");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_Aksessuarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }
            if (data.equals("4-Aksessuarlar plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_AksessuarlarPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Aksessuarlar minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_AksessuarlarMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Aksessuarlar oldinga")||data.equals("6-Aksessuarlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ckd380rk9fq1hr1nstrg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Yonadigan uzuk, puls va yurak, fosforli, sevishganlar uchun, qorong'uda yonadigan\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Vaqt o'tishi bilan rangi o'chmaydi\n" +
                        "● Metall turi: zanglamaydigan po'lat\n" +
                        "● Allergiyaga olib kelmaydi\n" +
                        "● Erkaklar va ayollar uchun\n" +
                        "● Uslub: har kuni uchun\n" +
                        "● Nur bilan quvvatlanadi");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_Aksessuarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }
            if (data.equals("5-Aksessuarlar plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_AksessuarlarPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Aksessuarlar minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_AksessuarlarMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Aksessuarlar oldinga")||data.equals("1-Gozallik orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ck6lh83k9fqd6b9u0su0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Soch uchun obodok marvaridlardan, oq marvaridli ayollar aksessuari, bezaklar\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Mahsulotning qadoqlangan og'irligi 40 g\n" +
                        "● Bezatish har qanday zichlik va hajmdagi bukleler uchun javob beradi\n" +
                        "● Boshni siqmaydi\n" +
                        "● Buyum kengligi 1-1.5 sm. Diametri: 15 sm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_Aksessuarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }
            if (data.equals("6-Aksessuarlar plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_AksessuarlarPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Aksessuarlar minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_AksessuarlarMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Aksessuarlar orqaga")||data.equals("6-Kiyimlar oldinga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cjj1qrkjvf2ofbh7llcg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Erkaklar yelkama-sumkasi, barsetka\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Sozlanishi tasma\n" +
                        "● To'rtburchaklar shakli; asosiy model\n" +
                        "● Mahkamlagich turi - chaqmoq; tugmalar\n" +
                        "● Sumka modeli: o'zaro faoliyat\n" +
                        "Agar biror narsa sizga mos kelmasa, salbiy sharh yozishga shoshilmang. Bizga shaxsiy xabar yuboring va biz sizning muammoingizni albatta hal qilamiz!\n" +
                        "● Har kuni, ofisga va ish uchun sumka");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_AksessuarlarInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }


            if (data.equals("Go`zallik va parvarish")){
                try {
                    execute(menuUzb.Bir_GozallikVaParvarishsendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Gozallik plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_GozallikVaParvarishPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Gozallik minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_GozallikVaParvarishMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Gozallik oldinga")||data.equals("3-Gozallik orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cc8ru0eha88139ljb7og/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Soch uchun shampun Garnier Fructis SOS, tiklash, 400 ml\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Ta'siri: ta'mirlash, mustahkamlash, parchalanishga qarshi\n" +
                        "● Soch turi: shikastlangan, uchlari bo'lingan\n\n" +
                        "Narx:\n" +
                        "donasi 48 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_GozallikVaParvarish(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }
            if (data.equals("2-Gozallik plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_GozallikVaParvarishPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Gozallik minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_GozallikVaParvarishMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Gozallik oldinga")||data.equals("4-Gozallik orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ciff24l6sfhndlbpe9fg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Elektr tish cho'tkasi, 3 nasadkalar, batareyalar to'plamda\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● 3 nasadka + batareya kiritilgan\n" +
                        "● Daqiqada 19800 tebranish\n" +
                        "● Namlikka qarshi himoya darajasi IPX7" +
                        "Narx:\n" +
                        "donasi 33 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_GozallikVaParvarish(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }
            if (data.equals("3-Gozallik plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_GozallikVaParvarishPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Gozallik minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_GozallikVaParvarishMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Gozallik oldinga")||data.equals("5-Gozallik orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cj2j9d56sfhndlbrcsp0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Mahsulot haqida qisqacha:\n" +
                        "● Miqdori: ishda 9 ta to'sar\n" +
                        "Narx:\n" +
                        "bir pachkasi 83 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_GozallikVaParvarish(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }
            if (data.equals("4-Gozallik plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_GozallikVaParvarishPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Gozallik minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_GozallikVaParvarishMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Gozallik oldinga")||data.equals("6-Gozallik orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ckft48jk9fq8lb3aautg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Massaj tarog'i, soch uchun\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "Metall tishli yumshoq soch uchun massaj taroq;\n" +
                        "Sochlarni silliq holatda taraydi;\n" +
                        "Sochlarga zarar yetkazmaydi;\n" +
                        "Uzunligi: 21 sm\n" +
                        "Rangi: Jigarrang.\n" +
                        "Narx:\n" +
                        "donasi 21 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_GozallikVaParvarish(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }
            if (data.equals("5-Gozallik plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_GozallikVaParvarishPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Gozallik minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_GozallikVaParvarishMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Gozallik oldinga")||data.equals("1-Salomatlik orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cj576slenntd8rfequh0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Blesk lab uchun Cappuvini\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "Dudaklarni namlaydi va oziqlantiradi\n" +
                        "Qulay format\n" +
                        "Dudaklarga g'ayrioddiy tabiiy soyani beradi\n" +
                        "Narx:\n" +
                        "donasi 25 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_GozallikVaParvarish(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }
            if (data.equals("6-Gozallik plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_GozallikVaParvarishPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Gozallik minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_GozallikVaParvarishMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Gozallik orqaga")||data.equals("6-Aksessuarlar oldinga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cn1juc1s99ouqbfth33g/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Erkaklar uchun xushbo'ylagich suvi Antonio Banderas Blue Seduction, 50 ml\n\n" +
                        "Narx:\n" +
                        "donasi 299 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_GozallikVaParvarishInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }


            if (data.equals("Salomatlik")){
                try {
                    execute(menuUzb.Bir_SalomatlikSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Salomatlik plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_SalomatlikPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Salomatlik minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_SalomatlikMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Salomatlik oldinga")||data.equals("3-Salomatlik orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cg68e97hgiov1qie7320/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Magniy kapsulalari Naturex, 60 kapsula, 150 mg\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Tanadagi magniy etishmovchiligini to'ldirish uchun\n" +
                        "● Uyquni normallashtirish uchun\n" +
                        "● Asabiy qo'zg'aluvchanlik, asabiylashish bilan vaziyatni normallashtirish\n" +
                        "● Charchoqning kuchayishi bilan, jismoniy va aqliy ortiqcha ish sharoitida\n" +
                        "● Og'riq va mushaklarning spazmlarini, oshqozon-ichak spazmlarini kamaytirish uchun\n" +
                        "● Giperventiliya bilan funktsional anksiyete hujumlarida namoyon bo'lishni kamaytiradi\n" +
                        "● Yurak urishini normallashtirish uchun" +
                        "Narx:\n" +
                        "bitta qutisi 37 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_Salomatlik(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Salomatlik plus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_SalomatlikPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Salomatlik minus")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_SalomatlikMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Salomatlik oldinga")||data.equals("4-Salomatlik orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/chqce3l6sfhndlbn5qug/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("O'simlik turmalin plastir, bo'g'inlar va mushaklar uchun og'riq qoldiruvchi vosita, 10 dona\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Turmalin kukuni va o'tlar bilan yamoq mustahkamlangan, bo'g'inlar va burmalar uchun og'riq qoldiruvchi vositadir. 10 dona\n" +
                        "● Og'riqni engillashtiradi. Tendonlar va suyaklarni mustahkamlaydi. Revmatik va oyoq barmoqlaridagi og'riqlarni yo'q qiladi\n" +
                        "● Yaxshi nafas olish qobiliyatini ta'minlaydigan va hatto ayniqsa sezgir terini bezovta qilmaydigan mikro gözenekli to'quv bo'lmagan mato asosida, ko'ndalang cho'zilgan elastik tabiiy matodan qilingan\n" +
                        "● Yamoqda Xitoy tibbiyotining ko'plab samarali o'simliklari mavjud bo'lib, ular antitümör va analjezik ta'sirga ega.\n" +
                        "● Tarkibida faqat tabiiy ekstraktlar va o'tlar mavjud\n" +
                        "● quyidagilar uchun ishlatiladi: osteoxondroz, siyatik, artrit;qo'shma displazi, nevralgiya,miyalji; jarohatlar, ko'karishlar, burmalar va shish\n" +
                        "Narx:\n" +
                        "34 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_Salomatlik(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Salomatlik plus")){
                menuUzb.Uch_Salomatlik++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Salomatlik minus")){
                if (menuUzb.Uch_Salomatlik>1) {
                    menuUzb.Uch_Salomatlik--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Salomatlik oldinga")||data.equals("5-Salomatlik orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cdr712gv1htd23ai529g/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Hallux Valgus Oyoq uchun fiksator, Katta bosh barmoq qeyshiqlikni to'g'irlash\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Valgus harakatlanish qobiliyatini saqlab, bo'g'imning tabiiy holatiga qaytishiga yordam berad\n" +
                        "● Bandajda siz uxlashingiz, yalangoyoq yoki terlik bilan yurishingiz, sayrga chiqishingiz mumkin\n" +
                        "● Mexanizm tufayli mahsulot bo'g'imning individual egilishini aniq takrorlayd\n" +
                        "● Tuzatish yumshoq va og'riqsiz tarzda amalga oshiriladi, bu oyoqlarni chiroyli va sog'lom ko'rinishga qaytarishga yordam beradi\n" +
                        "● Yurish paytida og'riqni kamaytiradi\n" +
                        "● Bosh barmog'ini to'g'ri holatda ushlab turadi\n" +
                        "● Materiallar: yuqori elastik ABS (plastik), neylon, Velcro qisqichi\n" +
                        "● Soni: 1 dona\n" +
                        "Narx:\n" +
                        "donasi 35 000 so'm\n");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_Salomatlik(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Salomatlik plus")){
                menuUzb.Tort_Salomatlik++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Salomatlik minus")){
                if (menuUzb.Tort_Salomatlik>1) {
                    menuUzb.Tort_Salomatlik--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Salomatlik oldinga")||data.equals("6-Salomatlik orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cfor2gfhgiov1qicf6r0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Ortopedik korset orqa bel grijasi uchun, bel-sakral\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Bel dumg'aza qismini mahkam tutib turadi\n" +
                        "● Nafas oluvchi materialdan tayyorlangan\n" +
                        "Narx:\n" +
                        "donasi 229 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_Salomatlik(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Salomatlik plus")){
                menuUzb.Besh_Salomatlik++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Salomatlik minus")){
                if (menuUzb.Besh_Salomatlik>1) {
                    menuUzb.Besh_Salomatlik--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Salomatlik oldinga")||data.equals("1-Qurilish orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cg4sahfhj8j9g699f6fg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Elektr oyoq uqalagichi EMS, miostimulyator\n" +
                        "Narx:\n" +
                        "donasi 29 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_Salomatlik(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Salomatlik plus")){
                menuUzb.Olti_Salomatlik++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Salomatlik minus")){
                if (menuUzb.Olti_Salomatlik>1) {
                    menuUzb.Olti_Salomatlik--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Salomatlik orqaga")||data.equals("6-Gozallik oldinga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cdota3ivtie1lhbdvie0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Avtomatik tonometr bilakda Protech YK-BPA4, 22-32 см\n\n" +
                        "Manjet atrofi: 22 - 32 sm\n" +
                        "\n" +
                        "Displey: 72 x 43.5 mm\n" +
                        "\n" +
                        "Xotira: 99 qiymat\n" +
                        "\n" +
                        "Quvvat: 4 ta aaa batareyasi / elektr tarmog'i\n" +
                        "\n" +
                        "Korpus o'lchami: 140 x 100 x 40 mm\n" +
                        "\n" +
                        "Vazni: 282 g\n" +
                        "\n" +
                        "To'plam: korpus, manjet, shlang, quvvat adapteri, ish uchun qo'llanma\n" +
                        "Narx:\n" +
                        "bir komplekt 415 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_SalomatlikInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (data.equals("Qurilish mollari")){
                try {
                    execute(menuUzb.Bir_QurilishMollariSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Qurilish plus")){
                menuUzb.Bir_QurilishMollari++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_QurilishMollariInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Qurilish minus")){
                if (menuUzb.Bir_QurilishMollari>1){
                    menuUzb.Bir_QurilishMollari--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_QurilishMollariInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Qurilish oldinga")||data.equals("3-Qurilish orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ce4otsavtie1lhbehpj0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Chilangarlik va montaj ishlari bo'yicha to'plam MTX, 12 dona, 135629\n\n" +
                        "Narx:\n" +
                        "bir toplami 303 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_QurilishMollari(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Qurilish plus")){
                menuUzb.Ikki_QurilishMollari++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Qurilish minus")){
                if (menuUzb.Ikki_QurilishMollari>1){
                    menuUzb.Ikki_QurilishMollari--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Qurilish oldinga")||data.equals("4-Qurilish orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cl8skll6sfhgee0lhfb0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Lazer masofa o'lchagich UNI-T\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● UNI-T brendi\n" +
                        "● Lazer turi\n" +
                        "Narx:\n" +
                        "donasi 390 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_QurilishMollari(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Qurilish plus")){
                menuUzb.Uch_QurilishMollari++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Qurilish minus")){
                if (menuUzb.Uch_QurilishMollari>1){
                    menuUzb.Uch_QurilishMollari--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Qurilish oldinga")||data.equals("5-Qurilish orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clkoqj5enntcj8a9pcj0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Simsiz drel-shurup buragich L-Fine 2113, cho'tkasiz, 13 mm\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● 5.Boshlar: 4 mm, 5 mm, 5.5 mm, 6 mm, 7 mm, 8 mm, 9 mm, 10 mm, 12 mm.\n" +
                        "● 1. Kuchlanishi: 21V\n" +
                        "● 2.Maksimal aylanish momenti 40NM\n" +
                        "● 3.Maksimal tezlik 0-1400 r/min\n" +
                        "● 4.Minimal tezlik 0-450 r/min\n" +
                        "Narx:\n" +
                        "bir to`plami 459 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_QurilishMollari(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Qurilish plus")){
                menuUzb.Tort_QurilishMollari++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Qurilish minus")){
                if (menuUzb.Tort_QurilishMollari>1){
                    menuUzb.Tort_QurilishMollari--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Qurilish oldinga")||data.equals("6-Qurilish orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clausel6sfhgee0lvj1g/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Simsiz osma chiroq magnitda, tungi chiroq\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Batareya yoki batareyalar bilan quvvatlanadi\n" +
                        "● Magnitga ega lampochka istalgan joylarda ishlatish mumkin\n" +
                        "● Mini LED lampochka batareyasi bilan ishlaydigan ichki devor tungi chiroqli elektr devor tugmachalari bilan uy uchun favqulodda chiroq\n" +
                        "● LED lampochka\n" +
                        "● O'lcham: 7.5 * 11 * 2 sm, og'irligi 70 g\n" +
                        "Narx:\n" +
                        "donasi 29 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_QurilishMollari(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Qurilish plus")){
                menuUzb.Besh_QurilishMollari++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Qurilish minus")){
                if (menuUzb.Besh_QurilishMollari>1){
                    menuUzb.Besh_QurilishMollari--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Qurilish oldinga")||data.equals("1-Avtotovarlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clgppilennt1kt4dlsbg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Smesitel high tech bukuluvchan oshxona uchun,COCO sultan\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Past qismi tolik latundan yasalgan yani zanglamaydi\n" +
                        "● High tech korinishiga oxshaydi, chiroylik dizayn\n" +
                        "● maxsulotni olganingizda sharx yozishni unutmang iltimos\n" +
                        "● Ushbu COCO SULTAN, BOTU smesitel yangicha korinish yangi dizayn va sifatlik\n" +
                        "● Purjina tepa qismi tolik bukuluvchan bolib,xoxlaganingizcha qayrishingiz mumkun\n" +
                        "● + shlang 40 sm dan 2 ta\n" +
                        "Narx:\n" +
                        "donasi 188 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_QurilishMollari(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Qurilish plus")){
                menuUzb.Olti_QurilishMollari++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Qurilish minus")){
                if (menuUzb.Olti_QurilishMollari>1){
                    menuUzb.Olti_QurilishMollari--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Qurilish orqaga")||data.equals("6-Salomatlik oldinga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clm6uel6sfhsc0un3b0g/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Zanjirli elektr arrasi Biyoti BYT-712\n\n" +
                        "Mahsulot haqida qisqacha\n" +
                        "\n" +
                        "● Dvigatel quvvati - 1800 vt\n" +
                        "● Aylanishlar soni - 4800 / daqiqasiga\n" +
                        "● Moy idishi hajmi - 0.1 litr\n" +
                        "● Shina uzunligi - 405 mm\n" +
                        "● Ishlab chiqaruvchi mamlakat - Xitoy\n" +
                        "Narx:\n" +
                        "donasi 545 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_QurilishMollariInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (data.equals("Avtotovarlar")){
                try {
                    execute(menuUzb.Bir_AvtotovarlarSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Avtotovarlar plus")){
                menuUzb.Bir_Avtotovarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_AvtotovarlarInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Avtotovarlar minus")){
                if (menuUzb.Bir_Avtotovarlar>1){
                    menuUzb.Bir_Avtotovarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_AvtotovarlarInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Avtotovarlar oldinga")||data.equals("3-Avtotovarlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cgf9hffhgiov1qiff820/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("GM Malibu-2 uchun salon havo filtri №13356914\n\n" +
                        "Tur - salon havo filtri.\n" +
                        "\n" +
                        "Ishlab Chiqaruvchi - General Motors.\n" +
                        "\n" +
                        "detal raqami - 13356914\n" +
                        "\n" +
                        "Avtomobil modeli - Malibu-2\n" +
                        "\n" +
                        "Soni -1 dona.\n" +
                        "\n" +
                        "Ehtiyot qismning ma'lum bir avtomobilga qo'llanilishi asl ehtiyot qismlar katalogidagi VIN kodi bilan tekshirilishi lozim.\n" +
                        "Narx:\n" +
                        "donasi 443 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_Avtotovarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Avtotovarlar plus")){
                menuUzb.Ikki_Avtotovarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Avtotovarlar minus")){
                if (menuUzb.Ikki_Avtotovarlar>1){
                    menuUzb.Ikki_Avtotovarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Avtotovarlar oldinga")||data.equals("4-Avtotovarlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cl9h43fn7c6qm23irap0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Fara to'plami GM CAPTIVA №42639353/42639352\n\n" +
                        "Tur - Yoritgich to'plami.\n" +
                        "\n" +
                        "Ishlab Chiqaruvchi - General Motors.\n" +
                        "\n" +
                        "Detal raqami - 42639353/42639352.\n" +
                        "\n" +
                        "Avtomobil modeli - CAPTIVA.\n" +
                        "\n" +
                        "Soni -2 dona.\n" +
                        "\n" +
                        "Ehtiyot qismning ma'lum bir avtomobilga qo'llanilishi asl ehtiyot qismlar katalogidagi VIN kodi bilan tekshirilishi lozimn\n" +
                        "Narx:\n" +
                        "bir para 7 406 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_Avtotovarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Avtotovarlar plus")){
                menuUzb.Uch_Avtotovarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Avtotovarlar minus")){
                if (menuUzb.Uch_Avtotovarlar>1){
                    menuUzb.Uch_Avtotovarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Avtotovarlar oldinga")||data.equals("5-Avtotovarlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ci9fh5l40v9pplt4ca70/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Videoregistrator Lenovo V7 Plus FullHD 2023 ver + 32GB SanDisk, kamerasi Malibu shaklida\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Lenovo V7 Plus FullHD orqa kamerasi Malibu shaklida\n" +
                        "● Sovg'a Micro SD SanDisk Ultra 32GB 10 class\n" +
                        "● Video sifati: 1920*1080 (Full HD)\n" +
                        "● Ko'rish burchagi: old-170° orqa-140°\n" +
                        "● To'liq sensorli ekran: 9.66\"\n" +
                        "● Protsessor: General Plus\n" +
                        "● Ikki kanalli yozish: Bor\n" +
                        "● Mikrofon: Bor\n" +
                        "● Tungi rejim: Bor\n" +
                        "● Kafolat 1 oy faqat registratorga. Orqa kamera va quvvat simi uchun hech qanday kafolat yo'q\n" +
                        "Narx:\n" +
                        "bir to`plami 599 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_Avtotovarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Avtotovarlar plus")){
                menuUzb.Tort_Avtotovarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Avtotovarlar minus")){
                if (menuUzb.Tort_Avtotovarlar>1){
                    menuUzb.Tort_Avtotovarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Avtotovarlar oldinga")||data.equals("6-Avtotovarlar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cl2h1o5ennt861iodaq0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Avtomobil avariya vaziyatlar uchun to'plami 5 tasi 1 da, aptechka, o't o'chirish moslamasi, jilet, favqulodda holat belgisi\n\n" +
                        "5 tasi 1 da qulay sumkada muhim avtoulovchilar to'plami\n" +
                        "\n" +
                        "1. Yong'in o'chirish moslamasi - avtomobil ichida yoki uning atrofida yuzaga kelishi mumkin bo'lgan yong'inlarni o'chirish uchun.\n" +
                        "\n" +
                        "2. Jabrlanganlarga yordam berish uchun mini asboblar to'plami: jgut va paxta..\n" +
                        "\n" +
                        "3. Favqulodda to'xtash belgisi - boshqa haydovchilarni mashina to'xtaganligi yoki favqulodda vaziyatda ekanligi haqida ogohlantirish.\n" +
                        "\n" +
                        "4. Apelsin jilet - yo'l ishlari yoki yo'lda favqulodda vaziyatlar paytida haydovchining ko'rinishini ta'minlash.\n" +
                        "\n" +
                        "5. Sizga kerak bo'lgan hamma narsani sig'dira oladigan qulay kanvas sumkasi\n" +
                        "\n" +
                        "Har bir avtoulovchi o'zining shaxsiy ehtiyojlari va transport vositasidan foydalanishiga qarab o'zining favqulodda to'plamini, shu jumladan zarur vositalar va xavfsizlik uskunalarini yig'ishi mumkin.\n" +
                        "Narx:\n" +
                        "bir to`plami 109 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_Avtotovarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Avtotovarlar plus")){
                menuUzb.Besh_Avtotovarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Avtotovarlar minus")){
                if (menuUzb.Besh_Avtotovarlar>1){
                    menuUzb.Besh_Avtotovarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Avtotovarlar oldinga")||data.equals("1-Bolalar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cfihkhvhgiopn8lc08dg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Havo xushbo'ylantirgich avtomobil uchun\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Quyosh batareyasining mavjudligi batareyalarsiz ishlashga imkon beradi\n" +
                        "● Yo'lingizni diversifikatsiya qilish uchun ajoyib imkoniyat\n" +
                        "● Aylanadigan pichoqlar\n" +
                        "● Har qanday sirt uchun mavjud\n" +
                        "● Xushbo'y moy avtomobildagi hidni yaxshilaydi\n" +
                        "● Havoni xushbo'ylashtiradigan aromatizator\n" +
                        "Narx:\n" +
                        "donasi 75 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_Avtotovarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Avtotovarlar plus")){
                menuUzb.Olti_Avtotovarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Avtotovarlar minus")){
                 if(menuUzb.Olti_Avtotovarlar>1) {
                     menuUzb.Olti_Avtotovarlar--;
                 }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Avtotovarlar orqaga")||data.equals("6-Qurilish oldinga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cgeqrh7hgiov1qifdtqg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("O't oldiruvchi svechasi GM Tracker 1.8 uchun №25197812\n\n" +
                        "ur - o't oldiruvchi svechalari\n" +
                        "\n" +
                        "Ishlab Chiqaruvchi - General Motors.\n" +
                        "\n" +
                        "Detal raqami -25197812 \n" +
                        "\n" +
                        "Avtomobil modeli - Tracker 1.8 \n" +
                        "\n" +
                        "Soni -1 dona.\n" +
                        "\n" +
                        "Ehtiyot qismning ma'lum bir avtomobilga qo'llanilishi asl ehtiyot qismlar katalogidagi VIN kodi bilan tekshirilishi lozim. \n" +
                        "Narx:\n" +
                        "donasi 172 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_AvtotovarlarInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (data.equals("Bolalar uchun")){
                try {
                    execute(menuUzb.Bir_BolalarUchunSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Bolalar plus")){
                menuUzb.Bir_BolalarUchun++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_BolalarUchunInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Bolalar minus")){
                if (menuUzb.Bir_BolalarUchun>1){
                    menuUzb.Bir_BolalarUchun--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_BolalarUchunInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Bolalar oldinga")||data.equals("3-Bolalar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cl10d5t6sfhgee0k5fog/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Tolokar, pushkar tutqichli 3 tasi 1 da Sport Car, 4 yoshgacha bo'lgan bolalar uchun\n\n" +
                        "Yukxonasi bor\n" +
                        "\n" +
                        "Ob'ektning kengligi 43 sm\n" +
                        "\n" +
                        "Ob'ektning chuqurligi 85 sm\n" +
                        "\n" +
                        "Paket bilan vazn (kg)4.1 kg\n" +
                        "\n" +
                        "Ob'ektning balandligi 85,5 sm\n" +
                        "\n" +
                        "Paket uzunligi 62 sm\n" +
                        "Narx:\n" +
                        "donasi 260 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_BolalarUchun(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Bolalar plus")){
                menuUzb.Ikki_BolalarUchun++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Bolalar minus")){
                if (menuUzb.Ikki_BolalarUchun>1){
                    menuUzb.Ikki_BolalarUchun--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Bolalar oldinga")||data.equals("4-Bolalar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cl1ob0d6sfhgee0kaeig/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Teknum 531 bolalar aravachasi Kolyaska 3 tasi 1 da, transformer\n\n" +
                        "Narx:\n" +
                        "bir to`plami 1 399 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_BolalarUchun(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Bolalar plus")){
                menuUzb.Uch_BolalarUchun++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Bolalar minus")){
                if (menuUzb.Uch_BolalarUchun>1){
                    menuUzb.Uch_BolalarUchun--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Bolalar oldinga")||data.equals("5-Bolalar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cn0dei9s99ouqbft9r1g/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Konstruktor ajdarho chavandozlari Lego bilan mos\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Qadoqlash: bardoshli qadoqlash tashish va saqlash vaqtida ehtiyot qismlar xavfsizligini ta'minlaydi.\n" +
                        "● Ninja mavzusi: har bir to'plam bolalar uchun mashhur va jozibali Ninja jangchilari mavzusiga asoslangan.\n" +
                        "● To'plamlar seriyasi: 8 xil yig'ish to'plamini o'z ichiga oladi, ularning har biri o'ziga xos haykalchalar va mototsikllar to'plamiga ega.\n" +
                        "● Qismlar soni: har bir to'plamda 52 dan 55 gacha qismlar mavjud bo'lib, ular batafsil modellarni yaratishga imkon beradi.\n" +
                        "Narx:\n" +
                        "bir to`plami 19 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_BolalarUchun(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Bolalar plus")){
                menuUzb.Tort_BolalarUchun++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Bolalar minus")){
                if (menuUzb.Tort_BolalarUchun>1){
                    menuUzb.Tort_BolalarUchun--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Bolalar oldinga")||data.equals("6-Bolalar orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cjeuktcvutvdmqj4hufg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Modellashtirish uchun plastilin Modelling clay, 24 rang\n\n" +
                        "Plastilin - bu sizning tasavvuringizni ochishga va ajoyib san'at asarlarini yaratishga yordam beradigan ko'p qirrali ijodiy vositadir. Yumshoq, egiluvchan va qoliplash juda oson, bu sizga turli shakllar, ob'ektlar va haykallarni osongina modellashtirish imkonini beradi.\n" +
                        "\n" +
                        "7 va undan katta yoshdagi bolalar uchun yaxshilangan formulali plastilin: u elastik bo'ladi, lekin fraktsiyalarni yirtmaydi va shaklini yaxshi ushlab turadi, bu sizga eng nozik qismlarni haykalga solishga imkon beradi. Plastilin chizish texnikasi uchun ideal - plastilinografiya. Tarkibi engil pigmentlarga ega, shuning uchun hunarmandchilik uzoq vaqt saqlanadi va so'nmaydi. Aniq hidsiz, qo'llar va ish yuzasi ifloslanmaydi.\n" +
                        "Narx:\n" +
                        "bir qutisi 22 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_BolalarUchun(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Bolalar plus")){
                menuUzb.Besh_BolalarUchun++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Bolalar minus")){
                if (menuUzb.Besh_BolalarUchun>1){
                    menuUzb.Besh_BolalarUchun--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Bolalar oldinga")||data.equals("1-Sport orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cf4h5k0l08k0o9qi17ug/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Chizma doskasi LCD 8.5inch Writing Tablet, 12 x 16.5 sm\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● LCD 8.5inch\n" +
                        "● Batarekasi uzoq muddatga yetadi\n" +
                        "● 12 x 16.5 sm\n" +
                        "Narx:\n" +
                        "donasi 22 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_BolalarUchun(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Bolalar plus")){
                menuUzb.Olti_BolalarUchun++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Bolalar minus")){
                if (menuUzb.Olti_BolalarUchun>1){
                    menuUzb.Olti_BolalarUchun--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Bolalar orqaga")||data.equals("6-Avtotovarlar oldinga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cmho1j1s99ouqbfqjjqg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Bolalar uchun manej, bolalar o'yinchoqlari bilan mat, chaqaloqlar uchun musiqiy pianino\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Diqqat! Ushbu mahsulot haqida yuqoridagi tavsifda batafsil ma'lumot berilgan\n" +
                        "● Katlanadigan tufayli dizaynlar, uni sayohatlarga olib borish qulay va yo'lda sayohat qilish va bolani ko'ngil ochish joylarga birga olib ketishingiz mumkin\n" +
                        "● Bolalarga ularning umumiy o'sishi va rivojlanishi uchun zarur bo'lgan ko'nikmalarni rivojlantirishga yordam beradi, mushaklarni kuchaytirishga, muvofiqlashtirishga yordam beradi\n" +
                        "● Bolaning rivojlanishi uchun juda foydali, bolalar bog'chasida emaklash uchun yorqin va chiroyli gilam bolaga juda ko'p qiziqarli o'yin soatlari va ko'plab ijobiy his-tuyg'ularni beradi\n" +
                        "● Bola yolg'iz o'tirganda, gilam pianino rolini o'ynaydi, uni interaktiv musiqa stoliga osongina aylantirish mumkin. O'yinchoq vosita ko'nikmalarini o'rgatadi va bolaning eshitish va ko'rish qobiliyatini rivojlantiradi\n" +
                        "Narx:\n" +
                        "bir to`plami 189 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_BolalarUchunInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (data.equals("Sport va hordiq")){
                try {
                    execute(menuUzb.Bir_SportSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Sport plus")){
                menuUzb.Bir_Sport++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_SportInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Sport minus")){
                if (menuUzb.Bir_Sport>1){
                    menuUzb.Bir_Sport--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_SportInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Sport oldinga")||data.equals("3-Sport orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clcp2st6sfhgee0maoag/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Velotrenajor Ax 010\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Maxovik: 4 kg (ichki aylanuvchi disk)\n" +
                        "● Mashg’ulotlarni og’irlashtirish imkoni : 8 xil darajada\n" +
                        "● Monitor: vaqt, masofa, tezlik, puls, kaloriya o’lchaydi\n" +
                        "● Puls: rulda\n" +
                        "● Maks foydalanuvchi vazni: 110 kg\n" +
                        "Narx:\n" +
                        "donasi  1 799 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_Sport(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Sport plus")){
                menuUzb.Ikki_Sport++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_Sport(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Sport minus")){
                if (menuUzb.Ikki_Sport>1){
                    menuUzb.Ikki_Sport--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Ikki_Sport(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Sport oldinga")||data.equals("4-Sport orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ccmm7bbb3ho5lmupnkjg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Sakragichi sport va krossfit mashg'ulotlari uchun\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● 2.8 metr (uzunligi sozlanishi)\n" +
                        "● Sport va krossfit mashg'ulotlari uchun arqondan sakrash\n" +
                        "● Muvofiqlashtirish va chidamlilikni yaxshilaydi\n" +
                        "● PVX qoplangan po'lat sim\n" +
                        "● Arqon burilmaydi\n" +
                        "Narx:\n" +
                        "donasi 49 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_Sport(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Sport plus")){
                menuUzb.Uch_Sport++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_Sport(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Sport minus")){
                if (menuUzb.Uch_Sport>1){
                    menuUzb.Uch_Sport--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Uch_Sport(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Sport oldinga")||data.equals("5-Sport orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cjl0v3cjvf2ofbh81lt0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Futbol to'pi Molten, AFC F5A5000-AC, o'lcham 5\n\n" +
                        "Molten F5A5000-AC futbol to'pi.\n" +
                        "\n" +
                        "O'lchami: 5\n" +
                        "\n" +
                        "Sertifikat: Fifa Quality PRO.\n" +
                        "\n" +
                        "Panellar soni: 32\n" +
                        "\n" +
                        "Professional Acentec texnologiyasi (Cross Fusion Bonding Technology)\n" +
                        "\n" +
                        "Shinalar uchun material: poliuretan (yopishtirilgan, choksiz, suv o'tkazmaydigan)\n" +
                        "\n" +
                        "Kamera: tabiiy lateks.\n" +
                        "\n" +
                        "Yuqori aşınma qarshilik\n" +
                        "Narx:\n" +
                        "donasi 159 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_Sport(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Sport plus")){
                menuUzb.Tort_Sport++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_Sport(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Sport minus")){
                if (menuUzb.Tort_Sport>1){
                    menuUzb.Tort_Sport--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Tort_Sport(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Sport oldinga")||data.equals("6-Sport orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cjpilhkjvf2hdh3edh20/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Batut fitnes va jamping uchun, vazn yo'qotish va o'yin-kulgi uchun\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Diametri (sm): 120.130\n" +
                        "● Fitnes va sakrash uchun batut. Kilo yo'qotish uchun trambolin\n" +
                        "● Yuk ko'tarish qobiliyati: 140 kg\n" +
                        "● Balandligi: 1.5 metr\n" +
                        "● Нar qanday savol bo'lsa UZUM MARKET shaxsiy xabar orqali bog'laning\n" +
                        "Narx:\n" +
                        "donasi 1 050 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_Sport(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Sport plus")){
                menuUzb.Besh_Sport++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_Sport(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Sport minus")){
                if (menuUzb.Besh_Sport>1){
                    menuUzb.Besh_Sport--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Besh_Sport(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Sport oldinga")||data.equals("1-elektronika orqaga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cmfvodrifoubkc6no8lg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Bilyard uchun qo'lqop Predator va Classic, chap va o'ng qo'l, 2 rang\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Hajmi: o'lchamsiz\n" +
                        "● Xususiyat chap va o'ng qo'llar uchun\n" +
                        "● Predator va Classic\n" +
                        "● Rang: qora, ko'k\n" +
                        "● 1 dona o'z ichiga oladi\n" +
                        "Narx:\n" +
                        "donasi 49 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_Sport(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Sport plus")){
                menuUzb.Olti_Sport++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_Sport(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Sport minus")){
                if (menuUzb.Olti_Sport>1){
                    menuUzb.Olti_Sport--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Olti_Sport(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Sport orqaga")||data.equals("6-Bolalar oldinga")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cl12215ennt861io3mjg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Elektr samokat KECHTE M1 Electric Scooter, 8.5\n\n" +
                        "Mahsulot haqida qisqacha:\n" +
                        "● Maksimal yuklama: 120 kg\n" +
                        "● Shinalar: diametri 8,5 dyuym bo‘lgan old va orqa pnevmatik shinalari\n" +
                        "● Foydalanuvchining bo'yi: 120-200 sm\n" +
                        "● Tormozlash tizimi: eABS +orqa ikki kolodkali diskli tormoz\n" +
                        "● Maks. tezlik: 25 km/soat\n" +
                        "● Yurish zaxirasi: 30 km\n" +
                        "● Qiyalikdan ko‘tarilish qobiliyati:16%\n" +
                        "● Foydalanuvchining yoshi: 18 dan 50 yoshgacha\n" +
                        "● Og‘irligi: 13.2 kg\n" +
                        "Narx:\n" +
                        "donasi 3 290 000 so'm");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuUzb.Bir_SportInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            //RUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUSRUS/``/\
            if (data.equals("Електроника")){
                try {
                    execute(menuRus.Bir_Elektronikasendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-електроника плюс")){
                menuRus.Bir_elektronika++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_ElektronikaInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-електроника минус")){
                if (menuRus.Bir_elektronika>1){
                    menuRus.Bir_elektronika--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_ElektronikaInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-електроника вперёд")||data.equals("3-електроника назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cn4ucohs99ouqbfu5jt0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Телевизор Premier 43PRM705S, Full HD Смарт ТВ\n\n" +
                        "Кратко о товаре:\n" +
                        "● Тип матрицы - VA панель\n" +
                        "● Разрешение - Full HD (1920 * 1080)\n" +
                        "● Смарт TV - Android\n" +
                        "● Гарантия - 3 год\n" +
                        "Цена:\n" +
                        "2 589 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Elektronika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-електроника плюс")){
                menuRus.Ikki_elektronika++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Elektronika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-електроника минус")){
                if (menuRus.Ikki_elektronika>1){
                    menuRus.Ikki_elektronika--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Elektronika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-електроника вперёд")||data.equals("4-електроника назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cla6qcnn7c6qm23j01mg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Планшет Xiaomi Redmi Pad SE 8 GB 256 GB 11  FHD\n\n" +
                        "Кратко о товаре:\n" +
                        "●Планшет Xiaomi Redmi Pad SE 8 GB 256 GB 11  FHD\n" +
                        "Цена:\n" +
                        "2 990 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Elektronika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-електроника плюс")){
                menuRus.Uch_elektronika++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Elektronika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-електроника минус")){
                if (menuRus.Uch_elektronika>1){
                    menuRus.Uch_elektronika--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Elektronika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-електроника вперёд")||data.equals("5-електроника назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ckk5o4cjvf2peh8sjehg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Приставка Sony PlayStation 5 Digital, 825 ГБ, Slim Digital, 1000 ГБ\n\n" +
                        "Кратко о товаре:\n" +
                        "● Тактовая частота видеопамяти: 2230 МГц\n" +
                        "● Тип встроенной памяти: 825 ГБ SSD\n" +
                        "● Максимальное разрешение: 8K Ultra HD Поддержка 3D\n" +
                        "● Тип процессора: 8-ядерный AMD Ryzen Zen 2\n" +
                        "● Частота процессора: 3500 МГц\n" +
                        "● Объем оперативной памяти: 16 ГБ\n" +
                        "● Графический процессор: AMD Radeon\n" +
                        "Цена:\n" +
                        "6 789 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Elektronika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-електроника плюс")){
                menuRus.Tort_elektronika++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Elektronika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-електроника минус")){
                if (menuRus.Tort_elektronika>1){
                    menuRus.Tort_elektronika--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Elektronika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-електроника вперёд")||data.equals("6-електроника назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cjjgakkvutv1g2ricde0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Мобильный телефон Novey A11\n\n" +
                        "Кратко о товаре:\n" +
                        "● Диагональ экрана: 1.77\"\n" +
                        "● Стандарт связи: 2G (GSM 850/900/1800/1900)\n" +
                        "● Количество SIM-карт: 2\n" +
                        "● Bluetooth: Есть\n" +
                        "● Дополнительные функции: Фонарик, FM-радио\n" +
                        "● Разъем: Micro USB\n" +
                        "● Аккумулятор: 1050 мА/ч\n" +
                        "Цена:\n" +
                        "штука 191 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Elektronika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-електроника плюс")){
                menuRus.Besh_elektronika++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Elektronika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-електроника минус")){
                if (menuRus.Besh_elektronika>1){
                    menuRus.Besh_elektronika--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Elektronika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-електроника вперёд")||data.equals("1-Бытовая техника назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clk4get6sfhsc0umir90/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Умные наручные часы Zeblaze Vibe 7 Pro\n\n" +
                                "Цена:\n" +
                        "штука 570 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Elektronika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-електроника плюс")){
                menuRus.Olti_elektronika++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Elektronika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-електроника минус")){
                if (menuRus.Olti_elektronika>1){
                    menuRus.Olti_elektronika--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Elektronika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-електроника назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cmfa23hs99ouqbfq6kq0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Смартфон Xiaomi Redmi 13C, 4GB+128GB I 8GB+256GB, 6.74\" 90Hz, 5000mAh, Dual SIM, 4G LTE\n\n" +
                        "Кратко о товаре:\n" +
                        "● Процессор: MediaTek Helio G85\n" +
                        "● Частота обновления: до 90 Гц\n" +
                        "● Яркость: 450 нит (тип), 600 нит\n" +
                        "● Экран: Corning® Gorilla® Glass\n" +
                        "● Дисплей с диагональю: 6,74 дюйма 1600x720, 260 ppi\n" +
                        "● Основная камера 50 Мпс объективом 5P, f/1.8\n" +
                        "● 8-мегапиксельная фронтальная камера f /2.0\n" +
                        "Цена:\n" +
                        "штука 1 589 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_ElektronikaInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("Бытовая техника")){
                try {
                    execute(menuRus.Bir_MaishiyTexnikaSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Бытовая техника плюс")){
                menuRus.Bir_MaishiyTexnika++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_MaishiyTexnikaInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Бытовая техника минус")){
                if (menuRus.Bir_MaishiyTexnika>1){
                    menuRus.Bir_MaishiyTexnika--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_MaishiyTexnikaInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Бытовая техника вперёд")||data.equals("3-Бытовая техника назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cmcj35bifoubkc6n5f8g/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Микроволновая печь Goodwell GMF-2012W, Соло, 20 л\n\n" +
                        "Кратко о товаре:\n" +
                        "● Тип управления: Механическое\n" +
                        "● Объем: 20 л\n" +
                        "● Тип корпуса: Белый\n" +
                        "● Мощность микроволн: 700 Вт\n" +
                        "● Производитель: Китай\n" +
                        "● Гарантия: 3 года\n" +
                        "Цена:\n" +
                        "1 034 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_MaishiyTexnika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Бытовая техника плюс")){
                menuRus.Ikki_MaishiyTexnika++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_MaishiyTexnika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Бытовая техника минус")){
                if (menuRus.Ikki_MaishiyTexnika>1){
                    menuRus.Ikki_MaishiyTexnika--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_MaishiyTexnika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Бытовая техника вперёд")||data.equals("4-Бытовая техника назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ckjbb6cjvf2sulnvad3g/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Кондиционер TCL TAC - 12CHSD/YA 11 I Invertor, с тэном\n\n" +
                        "Кратко о товаре:\n" +
                        "● Электрическая маркиза (работает непрерывно даже при понижении температуры до -15°С)\n" +
                        "● Инвертор (низкое напряжение в электрической системе не является проблемой для этого кондиционера)\n" +
                        "● Хладагент R32. Низкий уровень шума (до 19дБ)\n" +
                        "● Led дисплей и режим Sleep (обеспечивает минимальный уровень шума и комфортную смену температуры)\n" +
                        "● Безопасная конструкция. Отсутствие связи между конденсатом и электричеством.\n" +
                        "● Функцию Super Turbo Start (в режиме охлаждения возможно быстрое быстрое снижение температуры с 27° до 18° за 30 сек., а в режиме обогрева повышение с 20° до 40° за 60 сек)\n" +
                        "Цена:\n" +
                        "4 849 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_MaishiyTexnika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Бытовая техника плюс")){
                menuRus.Uch_MaishiyTexnika++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_MaishiyTexnika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Бытовая техника минус")){
                if (menuRus.Uch_MaishiyTexnika>1){
                    menuRus.Uch_MaishiyTexnika--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_MaishiyTexnika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Бытовая техника вперёд")||data.equals("5-Бытовая техника назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/chmpuav5d7kom1tgatb0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Утюг HADiD BI-101\n\n" +
                        "Кратко о товаре:\n" +
                        "● HADID BI-101\n" +
                        "● MODEL NO.:BI-101\n" +
                        "● Напряжение 220-240V 50-60Hz\n" +
                        "● Мощность 1200-1600W\n" +
                        "● Емкость резервуара для воды: 200 мл.\n" +
                        "● Подошва с керамическим покрытием\n" +
                        "● Высота 250 (мм) 25 см.\n" +
                        "● Паровой утюг\n" +
                        "● Made in P.R.C\n" +
                        "Цена:\n" +
                        "штука 200 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_MaishiyTexnika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Бытовая техника плюс")){
                menuRus.Tort_MaishiyTexnika++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_MaishiyTexnika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Бытовая техника минус")){
                if (menuRus.Tort_MaishiyTexnika>1){
                    menuRus.Tort_MaishiyTexnika--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_MaishiyTexnika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Бытовая техника вперёд")||data.equals("6-Бытовая техника назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ckiempsjvf2sulnv3dng/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Портативная швейная машина Mini Sewing Machine SM-202\n\n" +
                        "Кратко о товаре:\n" +
                        "● Работает: 220В от сети или 4 батарейки \"АА\" • Автоматическая перемотка нити • Материал: пластик, металл • Белый цвет • Вес: 1,25 кг\n" +
                        "● Оборудование: • Швейная машина • Ножная педаль • Нитевдеватель • Катушки • Иголка • Сетевой адаптер • Руководство\n" +
                        "● Мощность: 4.8 Вт\n" +
                        "● Частота: 50 Гц\n" +
                        "● Время работы: без ограничений\n" +
                        "● Параметры (л/г/ч): 19.5 x 12.5 x 20 см\n" +
                        "Цена:\n" +
                        "139 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_MaishiyTexnika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Бытовая техника плюс")){
                menuRus.Besh_MaishiyTexnika++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_MaishiyTexnika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Бытовая техника минус")){
                if (menuRus.Besh_MaishiyTexnika>1){
                    menuRus.Besh_MaishiyTexnika--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_MaishiyTexnika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Бытовая техника вперёд")||data.equals("1-Одежды назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cmtl0d125ku8jql6hcj0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Обогреватель AIWA CNH1114, 2000 Вт на 25 квадратных метров, электрический, с колесиками\n\n" +
                        "Кратко о товаре:\n" +
                        "● 2 кВт мощности на 25 квадратов нагревает площади\n" +
                        "● Он имеет компактный и удобный дизайн, его легко носить с собой и использовать в любых условиях\n" +
                        "● Надежное и удобное устройство\n" +
                        "● Цвет: белый\n" +
                        "● Мощность - 2000 Вт\n" +
                        "Цена:\n" +
                        "450 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_MaishiyTexnika(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Бытовая техника плюс")){
                menuRus.Olti_MaishiyTexnika++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_MaishiyTexnika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Бытовая техника минус")){
                if (menuRus.Olti_MaishiyTexnika>1){
                    menuRus.Olti_MaishiyTexnika--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_MaishiyTexnika(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Бытовая техника назад")||data.equals("6-електроника вперёд")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clomahfn7c6gg9ie3om0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Умный робот пылесос Xiaomi Robot Vacuum E12 Global, с функцией сухой и влажной уборки\n\n" +
                        "Кратко о товаре:\n" +
                        "● Официальная гарантия от производителя: 1 год. \n" +
                        "● Откройте мир эффективной и умной уборки с новым Xiaomi Robot Vacuum E12 EU. Это не просто умный робот-пылесос, а настоящий чемпион в мире чистоты. \n" +
                        "● Подключившись к приложению Mi Home, вы получаете полный контроль над уборкой. Управляйте умным роботом прямо с вашего смартфона, выбирайте между тремя режимами уборки и наслаждайтесь безупречной чистотой без лишних усилий. \n" +
                        "● Xiaomi Robot Vacuum E12 EU оснащен мощным вытяжным мотором 4000 Па, обеспечивающим эффективную уборку всего помещения. Забудьте о пыли и грязи – этот робот-пылесос справится с любыми загрязнениями\n" +
                        "Цена:\n" +
                        "2 559 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_MaishiyTexnikaInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("Одежда")){
                try {
                    execute(menuRus.Bir_KiyimSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Одежды плюс")){
                menuRus.Bir_Kiyimlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_KiyimInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Одежды минус")){
                if (menuRus.Bir_Kiyimlar>1){
                    menuRus.Bir_Kiyimlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_KiyimInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Одежды вперёд")||data.equals("3-Одежды назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cn325n3ifoubkc6r8ujg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Комплект женский: юбка + кофта\n\n" +
                        "Кратко о товаре:\n" +
                        "● Подходит для праздничного выхода и на повседневную носку\n" +
                        "● Свободная посадка\n" +
                        "● Можно носить с любой обувью\n" +
                        "● Единый размер, overrsize подходит на 46-52\n" +
                        "● Сезон: осень зима весна\n" +
                        "Цена:\n" +
                        "188 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Kiyim(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Одежды плюс")){
                menuRus.Ikki_Kiyimlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Kiyim(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Одежды минус")){
                if (menuRus.Ikki_Kiyimlar>1){
                    menuRus.Ikki_Kiyimlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Kiyim(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Одежды вперёд")||data.equals("4-Одежды назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cmjr8u1s99ouqbfqvh20/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Комбинезон детский, для младенцев, с ушками, зайка, хлопковый\n\n" +
                        "Кратко о товаре:\n" +
                        "● Доступны размеры на рост от 52 до 80, идеально подходящих для младенцев и детей до полутора лет. При выборе размера, пожалуйста, внимательно изучите таблицу размеров указанную в описании\n" +
                        "● Мягкая и нежная трикотажная ткань высокого качества. Комбинезон состоит из хлопка 95% и 5% эластана. Маленький процент эластана придает комбинезону форму, не мнется, тянется\n" +
                        "● Изделие обладает высоким стандартом качества, гарантируя долгий срок службы и максимальный комфорт для младенца\n" +
                        "Цена:\n" +
                        "129 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Kiyim(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Одежды плюс")){
                menuRus.Uch_Kiyimlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Kiyim(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Одежды минус")){
                if (menuRus.Uch_Kiyimlar>1){
                    menuRus.Uch_Kiyimlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Kiyim(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Одежды вперёд")||data.equals("5-Одежды назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cn50anbifoubkc6rjrig/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Кроссовки мужские Skechers GOWALK Flex 216481\n\n" +
                        "Кратко о товаре:\n" +
                        "● Включает стельку Goga Mat с воздушным охлаждением\n" +
                        "● Дышащий вязаный верх\n" +
                        "● Ключевая особенность Легкая и отзывчивая амортизация ULTRA GO®\n" +
                        "● Модель представлена в 3х цветах на любой вкус\n" +
                        "● Превосходно подойдет для долгих прогулок пешком, занятиями спортом и для повседневной жизни\n" +
                        "● Для большего ознакомления с ассортиментом SKECHERS просим пройти на страницу магазина\n" +
                        "Цена:\n" +
                        "711 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Kiyim(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Одежды плюс")){
                menuRus.Tort_Kiyimlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Kiyim(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Одежды минус")){
                if (menuRus.Tort_Kiyimlar>1){
                    menuRus.Tort_Kiyimlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Kiyim(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Одежды вперёд")||data.equals("6-Одежды назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cg67d37hgiov1qie6pbg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("женские кроссовки\n\n" +
                        "Стиль: Спортивная обувь\n" +
                        "\n" +
                        "Материал подошвы: Резина\n" +
                        "\n" +
                        "Тип застежки: Крюк/петля\n" +
                        "Цена:\n" +
                        "48 000 сум\n");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Kiyim(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Одежды плюс")){
                menuRus.Besh_Kiyimlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Kiyim(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Одежды минус")){
                if (menuRus.Besh_Kiyimlar>1){
                    menuRus.Besh_Kiyimlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Kiyim(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Одежды вперёд")||data.equals("1-Аксессуары назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ckp9t6sjvf2iqscbnfdg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Детские сапожки, с верхом из парусины, размеры 22-35\n\n" +
                        "Цена:\n" +
                        "119 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Kiyim(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Одежды плюс")){
                menuRus.Olti_Kiyimlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Kiyim(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Одежды минус")){
                if (menuRus.Olti_Kiyimlar>1){
                    menuRus.Olti_Kiyimlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Kiyim(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Одежды назад")||data.equals("6-Бытовая техника вперёд")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cfjidl7hgiopn8lc3bvg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Мужской спортивный комплект, штаны с худи, черный\n\n" +
                        "Качественный мужской костюм с штанами из двунитка. Отличный вариант на Весенний порою. Худи с капюшоном с фиксирующим шнурком, большой карман-кенгуру, низ на манжете. Крой свободный.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Костюм, двунитка\n" +
                        "\n" +
                        "Костюм не колотится , ткань премиум качества\n" +
                        "\n" +
                        "Материал : 90% хлопок 10% полестер\n" +
                        "\n" +
                        "Размеры : S M L XL ХХL XXXL (полномерные)\n" +
                        "Цена:\n" +
                        "210 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_KiyimInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("Аксессуары")){
                try {
                    execute(menuRus.Bir_AksessuarlarSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Аксессуары плюс")){
                menuRus.Bir_Aksessuarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_AksessuarlarInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Аксессуары минус")){
                if (menuRus.Bir_Aksessuarlar>1){
                    menuRus.Bir_Aksessuarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_AksessuarlarInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Аксессуары вперёд")||data.equals("3-Аксессуары назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cje50qkjvf2trp6s4nrg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Ремень для мужчин Alon - SERRADOR\n\n" +
                        "Кратко о товаре:\n" +
                        "● Черный цвет\n" +
                        "● Мужской ремень\n" +
                        "● Материал: Германтин (эко-кожа)\n" +
                        "● Длина: 120 см\n" +
                        "● Ширина: 4 см\n" +
                        "Цена:\n" +
                        "22 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Aksessuarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Аксессуары плюс")){
                menuRus.Ikki_Aksessuarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Aksessuarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Аксессуары минус")){
                if (menuRus.Ikki_Aksessuarlar>1){
                    menuRus.Ikki_Aksessuarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Aksessuarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Аксессуары вперёд")||data.equals("4-Аксессуары назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cjcb4lkvutv7iatast50/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Сумочка женская\n\n" +
                        "Кратко о товаре:\n" +
                        "Качественная фурнитура\n" +
                        "Материал - экокожа\n" +
                        "4 цвета на выбор\n" +
                        "Компактный размер\n" +
                        "Регулируемый ремешок\n" +
                        "Сумка женская через плечо\n" +
                        "Цена:\n" +
                        "219 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Aksessuarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Аксессуары плюс")){
                menuRus.Uch_Aksessuarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Aksessuarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Аксессуары минус")){
                if (menuRus.Uch_Aksessuarlar>1){
                    menuRus.Uch_Aksessuarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Aksessuarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Аксессуары вперёд")||data.equals("5-Аксессуары назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clqtjohs99oopol1euj0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Детская шапочка для весны и осени\n\n" +
                        "Кратко о товаре:\n" +
                        "Подходить для сезонов Осень Зима и Весна\n" +
                        "Размер: от 1 до 3 лет\n" +
                        "Производство: Узбекистан\n" +
                        "Не стирать больше 30* градусов\n" +
                        "Подойдёт для девочек и мальчиков\n" +
                        "Лёгкий вязанный материал\n" +
                        "Подарите ребенку комфорт и стиль\n" +
                        "Цена:\n" +
                        "49 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Aksessuarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Аксессуары плюс")){
                menuRus.Tort_Aksessuarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Aksessuarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Аксессуары минус")){
                if (menuRus.Tort_Aksessuarlar>1){
                    menuRus.Tort_Aksessuarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Aksessuarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Аксессуары вперёд")||data.equals("6-Аксессуары назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ckd380rk9fq1hr1nstrg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Кольцо Пульс сердца, парные кольца\n\n" +
                        "Кратко о товаре:\n" +
                        "● Высокое качество\n" +
                        "● Не боится воды\n" +
                        "● Отличный подарок для второй половины\n" +
                        "● Материал: Нержавейка\n" +
                        "Цена:\n" +
                        "25 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Aksessuarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Аксессуары плюс")){
                menuRus.Besh_Aksessuarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Aksessuarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Аксессуары минус")){
                if (menuRus.Besh_Aksessuarlar>1){
                    menuRus.Besh_Aksessuarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Aksessuarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Аксессуары вперёд")||data.equals("1-Красота и уход назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ck6lh83k9fqd6b9u0su0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Ободок жемчужный для волос, женский аксессуар с жемчугом белого цвета, украшения\n\n" +
                        "Кратко о товаре:\n" +
                        "● Ободок жемчужный для волос, женский, бижутерия, на голову, аксессуары\n" +
                        "● Вес товара с упаковкой 40 г\n" +
                        "● Украшение подходит для локонов любой густоты и объема\n" +
                        "● Не сдавливает голову\n" +
                        "● Ширина предмета 1-1.5 см. Диаметр: 15 см\n" +
                        "Цена:\n" +
                        "19 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Aksessuarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Аксессуары плюс")){
                menuRus.Olti_Aksessuarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Aksessuarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Аксессуары минус")){
                if (menuRus.Olti_Aksessuarlar>1){
                    menuRus.Olti_Aksessuarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Aksessuarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Аксессуары назад")||data.equals("6-Одежды вперёд")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cjj1qrkjvf2ofbh7llcg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Сумка мужская через плечо, барсетка\n\n" +
                        "Кратко о товаре:\n" +
                        "● Регулируемый ремень\n" +
                        "● Прямоугольная форма; базовая модель\n" +
                        "● Вид застежки - молния; кнопки\n" +
                        "● Модель сумки: через плечо, на плечо, на пояс\n" +
                        "● В случае если Вас что-то не устроило, пожалуйста, не торопитесь писать негативный отзыв. Напишите нам в личные сообщения, и мы обязательно решим Вашу проблему!\n" +
                        "● Сумка повседневная, на любой случай\n" +
                        "Цена:\n" +
                        "69 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_AksessuarlarInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("Красота и уход")){
                try {
                    execute(menuRus.Bir_GozallikvaParvarishSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Красота и уход плюс")){
                menuRus.Bir_Gozallikvaparvarish++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_GozallikvaParvarishInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Красота и уход минус")){
                if (menuRus.Bir_Gozallikvaparvarish>1){
                    menuRus.Bir_Gozallikvaparvarish--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_GozallikvaParvarishInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Красота и уход вперёд")||data.equals("3-Красота и уход назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cc8ru0eha88139ljb7og/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Шампунь для волос Garnier Fructis SOS, восстановление, 400 мл\n\n" +
                        "Кратко о товаре:\n" +
                        "● Эффект: восстановление, укрепление, против секущихся концов\n" +
                        "● Тип волос: поврежденные, секущиеся\n" +
                        "Цена:\n" +
                        "48 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_GozallikvaParvarish(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Красота и уход плюс")){
                menuRus.Ikki_Gozallikvaparvarish++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_GozallikvaParvarish(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Красота и уход минус")){
                if (menuRus.Ikki_Gozallikvaparvarish>1){
                    menuRus.Ikki_Gozallikvaparvarish--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_GozallikvaParvarish(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Красота и уход вперёд")||data.equals("4-Красота и уход назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ciff24l6sfhndlbpe9fg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Электрическая зубная щетка, 3 насадки, батарейка в комплекте\n\n" +
                        "Кратко о товаре:\n" +
                        "● 3 насадки + батарейка в комплекте\n" +
                        "● 19800 вибраций в минуту\n" +
                        "● Степень защиты от влаги IPX7\n" +
                        "Цена:\n" +
                        "33 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_GozallikvaParvarish(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Красота и уход плюс")){
                menuRus.Uch_Gozallikvaparvarish++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_GozallikvaParvarish(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Красота и уход минус")){
                if (menuRus.Uch_Gozallikvaparvarish>1){
                    menuRus.Uch_Gozallikvaparvarish--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_GozallikvaParvarish(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Красота и уход вперёд")||data.equals("5-Красота и уход назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cla8eg7n7c6qm23j0erg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Набор косметических кистей для макияжа, 9 шт\n\n" +
                        "Кратко о товаре:\n" +
                        "● Кисточки изготовлены из премиум синтетического ворса, обеспечивая мягкое и эффективное нанесение макияжа.\n" +
                        "● В набор входят кисти для пудры, контуринга, румян, хайлайтера, макияжа век, бровей и другие, обеспечивая полный комплект для макияжа любого уровня сложности и любого стиля\n" +
                        "Цена:\n" +
                        "125 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_GozallikvaParvarish(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Красота и уход плюс")){
                menuRus.Tort_Gozallikvaparvarish++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_GozallikvaParvarish(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Красота и уход минус")){
                if (menuRus.Tort_Gozallikvaparvarish>1){
                    menuRus.Tort_Gozallikvaparvarish--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_GozallikvaParvarish(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Красота и уход вперёд")||data.equals("6-Красота и уход назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ckft48jk9fq8lb3aautg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Массажная расческа, для волос\n\n" +
                        "Кратко о товаре:\n" +
                        "● Массажная расческа для мягких волос с металлическими зубцами;\n" +
                        "● Расчесывает волосы в гладком состоянии;\n" +
                        "● Не повреждает волосы;\n" +
                        "● Длина: 21 см\n" +
                        "● Коричневый цвет\n" +
                        "Цена:\n" +
                        "21 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_GozallikvaParvarish(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Красота и уход плюс")){
                menuRus.Besh_Gozallikvaparvarish++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_GozallikvaParvarish(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Красота и уход минус")){
                if (menuRus.Besh_Gozallikvaparvarish>1){
                    menuRus.Besh_Gozallikvaparvarish--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_GozallikvaParvarish(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Красота и уход вперёд")||data.equals("1-Здоровье назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cj576slenntd8rfequh0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Блеск для губ Cappuvini\n\n" +
                        "Кратко о товаре:\n" +
                        "● Увлажняет и питает губы\n" +
                        "● Удобный формат\n" +
                        "● Приддает губам необычный естественный оттенок\n" +
                        "Цена:\n" +
                        "штука 25 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_GozallikvaParvarish(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Красота и уход плюс")){
                menuRus.Olti_Gozallikvaparvarish++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_GozallikvaParvarish(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Красота и уход минус")){
                if (menuRus.Olti_Gozallikvaparvarish>1){
                    menuRus.Olti_Gozallikvaparvarish--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_GozallikvaParvarish(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Красота и уход назад")||data.equals("6-Аксессуары вперёд")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cn1juc1s99ouqbfth33g/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("Туалетная вода для мужчин Antonio Banderas Blue Seduction, 100 мл\n\n" +
                        "Кратко о товаре:\n" +
                        "● Верхние ноты: Дыня, Бергамот, Мята и Черная смородина\n" +
                        "● Базовые ноты: Древесные ноты и Амбра\n" +
                        "● Производство: Испания\n" +
                        "● Тип: Туалетная вода\n" +
                        "● Объем: 100m Высокое качество сохраняется до 12 часов\n" +
                        "● Туалетная вода для мужчин Antonio Banderas Blue Seduction, 100 мл\n" +
                        "Цена:\n" +
                        "339 000 сум");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_GozallikvaParvarishInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("Здоровье")){
                try {
                    execute(menuRus.Bir_SalomatlikSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Здоровье плюс")){
                menuRus.Bir_Salomatlik++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_SalomatlikInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Здоровье минус")){
                if (menuRus.Bir_Salomatlik>1){
                    menuRus.Bir_Salomatlik--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_SalomatlikInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Здоровье вперёд")||data.equals("3-Здоровье назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cg68e97hgiov1qie7320/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Salomatlik(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Здоровье плюс")){
                menuRus.Ikki_Salomatlik++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Здоровье минус")){
                if (menuRus.Ikki_Salomatlik>1){
                    menuRus.Ikki_Salomatlik--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Здоровье вперёд")||data.equals("4-Здоровье назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/chqce3l6sfhndlbn5qug/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Salomatlik(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Здоровье плюс")){
                menuRus.Uch_Salomatlik++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Здоровье минус")){
                if (menuRus.Uch_Salomatlik>1){
                    menuRus.Uch_Salomatlik--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Здоровье вперёд")||data.equals("5-Здоровье назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cdr712gv1htd23ai529g/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Salomatlik(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Здоровье плюс")){
                menuRus.Tort_Salomatlik++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Здоровье минус")){
                if (menuRus.Tort_Salomatlik>1){
                    menuRus.Tort_Salomatlik--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Здоровье вперёд")||data.equals("6-Здоровье назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cfor2gfhgiov1qicf6r0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Salomatlik(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Здоровье плюс")){
                menuRus.Besh_Salomatlik++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Здоровье минус")){
                if (menuRus.Besh_Salomatlik>1){
                    menuRus.Besh_Salomatlik--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Здоровье вперёд")||data.equals("1-Строительство и ремонт назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cg4sahfhj8j9g699f6fg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Salomatlik(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Здоровье плюс")){
                menuRus.Olti_Salomatlik++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Здоровье минус")){
                if (menuRus.Olti_Salomatlik>1){
                    menuRus.Olti_Salomatlik--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Salomatlik(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Здоровье назад")||data.equals("6-Красота и уход вперёд")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cdota3ivtie1lhbdvie0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_SalomatlikInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("Строительство и ремонт")){
                try {
                    execute(menuRus.Bir_QurilishMollariSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Строительство и ремонт плюс")){
                menuRus.Bir_QurilishMollari++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_QurilishMollariInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Строительство и ремонт минус")){
                if (menuRus.Bir_QurilishMollari>1){
                    menuRus.Bir_QurilishMollari--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_QurilishMollariInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Строительство и ремонт вперёд")||data.equals("3-Строительство и ремонт назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ce4otsavtie1lhbehpj0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_QurilishMollari(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Строительство и ремонт плюс")){
                menuRus.Ikki_QurilishMollari++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Строительство и ремонт минус")){
                if (menuRus.Ikki_QurilishMollari>1){
                    menuRus.Ikki_QurilishMollari--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Строительство и ремонт вперёд")||data.equals("4-Строительство и ремонт назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cl8skll6sfhgee0lhfb0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_QurilishMollari(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Строительство и ремонт плюс")){
                menuRus.Uch_QurilishMollari++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Строительство и ремонт минус")){
                if (menuRus.Uch_QurilishMollari>1){
                    menuRus.Uch_QurilishMollari--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Строительство и ремонт вперёд")||data.equals("5-Строительство и ремонт назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clkoqj5enntcj8a9pcj0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_QurilishMollari(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Строительство и ремонт плюс")){
                menuRus.Tort_QurilishMollari++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Строительство и ремонт минус")){
                if (menuRus.Tort_QurilishMollari>1){
                    menuRus.Tort_QurilishMollari--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Строительство и ремонт вперёд")||data.equals("6-Строительство и ремонт назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clausel6sfhgee0lvj1g/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_QurilishMollari(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Строительство и ремонт плюс")){
                menuRus.Besh_QurilishMollari++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Строительство и ремонт минус")){
                if (menuRus.Besh_QurilishMollari>1){
                    menuRus.Besh_QurilishMollari--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Строительство и ремонт вперёд")||data.equals("1-Автотовары назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clgppilennt1kt4dlsbg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_QurilishMollari(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Строительство и ремонт плюс")){
                menuRus.Olti_QurilishMollari++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Строительство и ремонт минус")){
                if (menuRus.Olti_QurilishMollari>1){
                    menuRus.Olti_QurilishMollari--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_QurilishMollari(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Строительство и ремонт назад")||data.equals("6-Здоровье вперёд")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clm6uel6sfhsc0un3b0g/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_QurilishMollariInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("Автотовары")){
                try {
                    execute(menuRus.Bir_AvtotovarlarSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Автотовары плюс")){
                menuRus.Bir_Avtotovarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_AvtotovarlarInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Автотовары минус")){
                if (menuRus.Bir_Avtotovarlar>1){
                    menuRus.Bir_Avtotovarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_AvtotovarlarInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Автотовары вперёд")||data.equals("3-Автотовары назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cgf9hffhgiov1qiff820/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Avtotovarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Автотовары плюс")){
                menuRus.Ikki_Avtotovarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Автотовары минус")){
                if (menuRus.Ikki_Avtotovarlar>1){
                    menuRus.Ikki_Avtotovarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Автотовары вперёд")||data.equals("4-Автотовары назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cl9h43fn7c6qm23irap0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Avtotovarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Автотовары плюс")){
                menuRus.Uch_Avtotovarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Автотовары минус")){
                if (menuRus.Uch_Avtotovarlar>1){
                    menuRus.Uch_Avtotovarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Автотовары вперёд")||data.equals("5-Автотовары назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ci9fh5l40v9pplt4ca70/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Avtotovarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Автотовары плюс")){
                menuRus.Tort_Avtotovarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Автотовары минус")){
                if (menuRus.Tort_Avtotovarlar>1){
                    menuRus.Tort_Avtotovarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Автотовары вперёд")||data.equals("6-Автотовары назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cl2h1o5ennt861iodaq0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Avtotovarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Автотовары плюс")){
                menuRus.Besh_Avtotovarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Автотовары минус")){
                if (menuRus.Besh_Avtotovarlar>1){
                    menuRus.Besh_Avtotovarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Автотовары вперёд")||data.equals("1-Для ребёнок назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cfihkhvhgiopn8lc08dg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Avtotovarlar(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Автотовары плюс")){
                menuRus.Olti_Avtotovarlar++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Автотовары минус")){
                if (menuRus.Olti_Avtotovarlar>1){
                    menuRus.Olti_Avtotovarlar--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_Avtotovarlar(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Автотовары назад")||data.equals("6-Строительство и ремонт вперёд")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cgeqrh7hgiov1qifdtqg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_AvtotovarlarInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("Для ребёнок")){
                try {
                    execute(menuRus.Bir_BolalarUchunSendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Для ребёнок плюс")){
                menuRus.Bir_BolalarUchun++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_BolalarUchunInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Для ребёнок минус")){
                if (menuRus.Bir_BolalarUchun>1){
                    menuRus.Bir_BolalarUchun--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_BolalarUchunInline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Для ребёнок вперёд")||data.equals("3-Для ребёнок назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cl10d5t6sfhgee0k5fog/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_BolalarUchun(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Для ребёнок плюс")){
                menuRus.Ikki_BolalarUchun++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Для ребёнок минус")){
                if (menuRus.Ikki_BolalarUchun>1){
                    menuRus.Ikki_BolalarUchun--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Для ребёнок вперёд")||data.equals("4-Для ребёнок назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cl1ob0d6sfhgee0kaeig/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_BolalarUchun(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Для ребёнок плюс")){
                menuRus.Uch_BolalarUchun++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Для ребёнок минус")){
                if (menuRus.Uch_BolalarUchun>1){
                    menuRus.Uch_BolalarUchun--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Для ребёнок вперёд")||data.equals("5-Для ребёнок назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cn0dei9s99ouqbft9r1g/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_BolalarUchun(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Для ребёнок плюс")){
                menuRus.Tort_BolalarUchun++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Для ребёнок минус")){
                if (menuRus.Tort_BolalarUchun>1){
                    menuRus.Tort_BolalarUchun--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Для ребёнок вперёд")||data.equals("6-Для ребёнок назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cjeuktcvutvdmqj4hufg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_BolalarUchun(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Для ребёнок плюс")){
                menuRus.Besh_BolalarUchun++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Для ребёнок минус")){
                if (menuRus.Besh_BolalarUchun>1){
                    menuRus.Besh_BolalarUchun--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Для ребёнок вперёд")||data.equals("1-Спорт и отдых назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cf4h5k0l08k0o9qi17ug/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_BolalarUchun(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Для ребёнок плюс")){
                menuRus.Olti_BolalarUchun++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Для ребёнок минус")){
                if (menuRus.Olti_BolalarUchun>1){
                    menuRus.Olti_BolalarUchun--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_BolalarUchun(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Для ребёнок назад")||data.equals("6-Автотовары вперёд")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cmho1j1s99ouqbfqjjqg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_BolalarUchunInline(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("Спорт и отдых")){
                try {
                    execute(menuRus.Bir_SportvaHordiqsendphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("1-Спорт и отдых плюс")){
                menuRus.Bir_Sport++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_SportvaHordiqinline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Спорт и отдых минус")){
                if (menuRus.Bir_Sport>1){
                    menuRus.Bir_Sport--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_SportvaHordiqinline(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("1-Спорт и отдых вперёд")||data.equals("3-Спорт и отдых назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/clcp2st6sfhgee0maoag/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_SportvaHordiq(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("2-Спорт и отдых плюс")){
                menuRus.Ikki_Sport++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_SportvaHordiq(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Спорт и отдых минус")){
                if (menuRus.Ikki_Sport>1){
                    menuRus.Ikki_Sport--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Ikki_SportvaHordiq(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Спорт и отдых вперёд")||data.equals("4-Спорт и отдых назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/ccmm7bbb3ho5lmupnkjg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_SportvaHordiq(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("3-Спорт и отдых плюс")){
                menuRus.Uch_Sport++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_SportvaHordiq(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Спорт и отдых минус")){
                if (menuRus.Uch_Sport>1){
                    menuRus.Uch_Sport--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Uch_SportvaHordiq(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("3-Спорт и отдых вперёд")||data.equals("5-Спорт и отдых назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cjl0v3cjvf2ofbh81lt0/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_SportvaHordiq(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("4-Спорт и отдых плюс")){
                menuRus.Tort_Sport++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_SportvaHordiq(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Спорт и отдых минус")){
                if (menuRus.Tort_Sport>1){
                    menuRus.Tort_Sport--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Tort_SportvaHordiq(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("4-Спорт и отдых вперёд")||data.equals("6-Спорт и отдых назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cjpilhkjvf2hdh3edh20/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_SportvaHordiq(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5-Спорт и отдых плюс")){
                menuRus.Besh_Sport++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_SportvaHordiq(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Спорт и отдых минус")){
                if (menuRus.Besh_Sport>1){
                    menuRus.Besh_Sport--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Besh_SportvaHordiq(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("5-Спорт и отдых вперёд")||data.equals("1-електроника назад")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cmfvodrifoubkc6no8lg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_SportvaHordiq(chatId));

                try {
                    execute(editMessageMedia);
                    execute(editMessageCaption);
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("6-Спорт и отдых плюс")){
                menuRus.Olti_Sport++;
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_SportvaHordiq(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("6-Спорт и отдых минус")){
                if (menuRus.Olti_Sport>1){
                    menuRus.Olti_Sport--;
                }
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Olti_SportvaHordiq(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("2-Спорт и отдых назад")||data.equals("6-Для ребёнок вперёд")){
                EditMessageMedia editMessageMedia = new EditMessageMedia();
                InputMediaPhoto inputMediaPhoto = new InputMediaPhoto("https://images.uzum.uz/cl12215ennt861io3mjg/original.jpg");
                editMessageMedia.setMedia(inputMediaPhoto);
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(message.getMessageId());

                EditMessageCaption editMessageCaption = new EditMessageCaption();
                editMessageCaption.setChatId(chatId);
                editMessageCaption.setMessageId(message.getMessageId());
                editMessageCaption.setCaption("");

                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(message.getMessageId());
                editMessageReplyMarkup.setReplyMarkup(menuRus.Bir_SportvaHordiqinline(chatId));

                try {
                    execute(editMessageMedia);
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