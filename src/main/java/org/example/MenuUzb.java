package org.example;

import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MenuUzb {
    public SendMessage menu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Hizmatni tanlang");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
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

    public SendMessage Sozlamalar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Sozlamalar⚙\uFE0F");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
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

    public SendMessage TilOzgartirish(Long chatid) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("На какую язык хотите поменять \nqaysi tilga o`zgartirmoqchisiz");
        sendMessage.setChatId(chatid);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
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

    public SendMessage RaqamOzgartirish(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ozgartirmoqchi bo`lgan raqamingizni  \n " +
                " +7 **********  YOKI +998 ********* korinishida yuboring");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
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

    public SendMessage Kategoriyalar(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("""
                 <b>Kategoriyalar</b>
                """);
        sendMessage.setParseMode(ParseMode.HTML);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Elektronika");
        button.setCallbackData("Elektronika");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        button.setText("Maishiy Texnika");
        button.setCallbackData("Maishiy Texnika");
        row.add(button);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("Kiyimlar");
        button.setCallbackData("Kiyimlar");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        button.setText("Aksessuarlar");
        button.setCallbackData("Aksessuarlar");
        row.add(button);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("Go`zallik va parvarish");
        button.setCallbackData("Go`zallik va parvarish");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        button.setText("Salomatlik");
        button.setCallbackData("Salomatlik");
        row.add(button);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("Qurilish mollari");
        button.setCallbackData("Qurilish mollari");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        button.setText("Avtotovarlar");
        button.setCallbackData("Avtotovarlar");
        row.add(button);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("Bolalar uchun");
        button.setCallbackData("Bolalar uchun");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        button.setText("Sport va hordiq");
        button.setCallbackData("Sport va hordiq");
        row.add(button);
        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage KategoriyaOrqaga(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("yana qaysidur hizmatdan foydalanishni hohlaysizmi? ");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
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

    public SendMessage Site(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("""
                <b>Uzum Market: "https://uzum.uz/ru"</b>
                """);
        sendMessage.setParseMode(ParseMode.HTML);
        return sendMessage;
    }

    int Bir_elektronika=1;
    int Ikki_elektronika=1;
    int Uch_elektronika=1;
    int Tort_elektronika=1;
    int Besh_elektronika=1;
    int Olti_elektronika=1;

    public SendMessage ElektronikaUchunSendMessage(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("""
                <b>Katerogira: Elektronika</b>
                """);
        sendMessage.setParseMode(ParseMode.HTML);
        return sendMessage;
    }
    public SendPhoto Bir_Elektronikasendphoto(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmfa23hs99ouqbfq6kq0/original.jpg"));
        sendPhoto.setCaption("Smartfon Xiaomi Redmi 13C 4GB+128GB, 8GB+256GB, 6.74 90Hz, 5000 mA/soat, Dual SIM, 4G LTE \n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Ekran: Corning® Gorilla® Glass\n" +
                "● Batareya: 5000mAh (turi) 18W PD zaryadlashni qo'llab-quvvatlaydi\n" +
                "● Xavfsizlik: TouchID\n" +
                "● Кino kamerasi / HDR rejimi / tungi rejim / portret rejimi / 50 Mp rejimi\n" +
                "● Asosiy kamera 50 Mp 5p ob'ektiv, f/1.8\n" +
                "● 8 megapikselli old kamera f/2.0\n" +
                "● Protsessor: MediaTek Helio G85\n" +
                "● Diagonali displey: 6,74 dyum 1600x720, 260 ppi\n" +
                "● Yangilanish tezligi: 90 Hz gacha\n" +
                "● Yorqinligi: 450 nit (turi), 600 nit\n\n "+ElektronikaUchunSendMessage(chatId));

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_elektronika));
        button.setCallbackData("1-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_ElektronikaInline(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmfa23hs99ouqbfq6kq0/original.jpg"));
        sendPhoto.setCaption("Smartfon Xiaomi Redmi 13C 4GB+128GB, 8GB+256GB, 6.74  90Hz, 5000 mA/soat, Dual SIM, 4G LTE \n  " +
                "Mahsulot haqida qisqacha:\n" +
                "● Ekran: Corning® Gorilla® Glass\n" +
                "● Batareya: 5000mAh (turi) 18W PD zaryadlashni qo'llab-quvvatlaydi\n" +
                "● Xavfsizlik: TouchID\n" +
                "● Кino kamerasi / HDR rejimi / tungi rejim / portret rejimi / 50 Mp rejimi\n" +
                "● Asosiy kamera 50 Mp 5p ob'ektiv, f/1.8\n" +
                "● 8 megapikselli old kamera f/2.0\n" +
                "● Protsessor: MediaTek Helio G85\n" +
                "● Diagonali displey: 6,74 dyum 1600x720, 260 ppi\n" +
                "● Yangilanish tezligi: 90 Hz gacha\n" +
                "● Yorqinligi: 450 nit (turi), 600 nit\n\n "+ElektronikaUchunSendMessage(chatId));

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_elektronika));
        button.setCallbackData("1-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Bir_ElektronikaInlinePlus(Long chatId) {
        Bir_elektronika++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmfa23hs99ouqbfq6kq0/original.jpg"));
        sendPhoto.setCaption("Smartfon Xiaomi Redmi 13C 4GB+128GB, 8GB+256GB, 6.74  90Hz, 5000 mA/soat, Dual SIM, 4G LTE \n  " +
                "Mahsulot haqida qisqacha:\n" +
                "● Ekran: Corning® Gorilla® Glass\n" +
                "● Batareya: 5000mAh (turi) 18W PD zaryadlashni qo'llab-quvvatlaydi\n" +
                "● Xavfsizlik: TouchID\n" +
                "● Кino kamerasi / HDR rejimi / tungi rejim / portret rejimi / 50 Mp rejimi\n" +
                "● Asosiy kamera 50 Mp 5p ob'ektiv, f/1.8\n" +
                "● 8 megapikselli old kamera f/2.0\n" +
                "● Protsessor: MediaTek Helio G85\n" +
                "● Diagonali displey: 6,74 dyum 1600x720, 260 ppi\n" +
                "● Yangilanish tezligi: 90 Hz gacha\n" +
                "● Yorqinligi: 450 nit (turi), 600 nit\n\n "+ElektronikaUchunSendMessage(chatId));

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_elektronika));
        button.setCallbackData("1-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Bir_ElektronikaInlineMinus(Long chatId) {
        if (Bir_elektronika>1){
            Bir_elektronika--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmfa23hs99ouqbfq6kq0/original.jpg"));
        sendPhoto.setCaption("Smartfon Xiaomi Redmi 13C 4GB+128GB, 8GB+256GB, 6.74  90Hz, 5000 mA/soat, Dual SIM, 4G LTE \n  " +
                "Mahsulot haqida qisqacha:\n" +
                "● Ekran: Corning® Gorilla® Glass\n" +
                "● Batareya: 5000mAh (turi) 18W PD zaryadlashni qo'llab-quvvatlaydi\n" +
                "● Xavfsizlik: TouchID\n" +
                "● Кino kamerasi / HDR rejimi / tungi rejim / portret rejimi / 50 Mp rejimi\n" +
                "● Asosiy kamera 50 Mp 5p ob'ektiv, f/1.8\n" +
                "● 8 megapikselli old kamera f/2.0\n" +
                "● Protsessor: MediaTek Helio G85\n" +
                "● Diagonali displey: 6,74 dyum 1600x720, 260 ppi\n" +
                "● Yangilanish tezligi: 90 Hz gacha\n" +
                "● Yorqinligi: 450 nit (turi), 600 nit\n\n "+ElektronikaUchunSendMessage(chatId));

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_elektronika));
        button.setCallbackData("1-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup Ikki_Elektronika(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://uzum.uz/uz/product/televizor-premier-43prm705s-full-hd-smart-910164?SG=1415458"));
        sendPhoto.setCaption("Televizor Premier 43PRM705S, Full HD Smart TV \n " +
                "Mahsulot haqida qisqacha:\n" +
                "● Matritsa turi - VA paneli\n" +
                "● Ekran o'lchamlari - Full HD (1920 * 1080)\n" +
                "● Smart TV - Android\n" +
                "● Kafolat - 3 yil");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_elektronika));
        button.setCallbackData("2-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_ElektronikaPlus(Long chatId) {
        Ikki_elektronika++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://uzum.uz/uz/product/televizor-premier-43prm705s-full-hd-smart-910164?SG=1415458"));
        sendPhoto.setCaption("Televizor Premier 43PRM705S, Full HD Smart TV \n " +
                "Mahsulot haqida qisqacha:\n" +
                "● Matritsa turi - VA paneli\n" +
                "● Ekran o'lchamlari - Full HD (1920 * 1080)\n" +
                "● Smart TV - Android\n" +
                "● Kafolat - 3 yil");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_elektronika));
        button.setCallbackData("2-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_ElektronikaMinus(Long chatId) {
        if (Ikki_elektronika>1){
            Ikki_elektronika--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://uzum.uz/uz/product/televizor-premier-43prm705s-full-hd-smart-910164?SG=1415458"));
        sendPhoto.setCaption("Televizor Premier 43PRM705S, Full HD Smart TV \n " +
                "Mahsulot haqida qisqacha:\n" +
                "● Matritsa turi - VA paneli\n" +
                "● Ekran o'lchamlari - Full HD (1920 * 1080)\n" +
                "● Smart TV - Android\n" +
                "● Kafolat - 3 yil");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_elektronika));
        button.setCallbackData("2-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup Uch_Elektronika(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cla6qcnn7c6qm23j01mg/original.jpg"));
        sendPhoto.setCaption("Planshet Xiaomi Redmi Pad SE Global 4/6/128GB, 8/256GB, katta akkumulator, 8000 mAs\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Ikki Wi-Fi diapazonlarini qo‘llab-quvvatlash: 2.4 GGs va 5 GGs,\n" +
                "● Bluetooth 5.0 boshqa qurilmalarga va internet tarmog‘iga barqaror va tez ulanishni ta’minlaydi\n" +
                "● Ushbu gadjet 2.4 GGsgacha tezlik olish qobiliyatiga ega bo‘lgan 6-nm texjarayon va 8 yadrolarga ega bo‘lgan Snapdragon® 680 protsessor bilan jihozlangan,\n" +
                "bu barcha ilovalar va dasturlarning tez va ravon ishlashini ta’minlaydi.\n" +
                "● Planshet o‘z ichiga LPDDR4X 4/6/8GB operativ xotirani\n" +
                "va eMMC 5.1 128/256GB ichki xotirani kiritadi, bu ma’lumotlarning\n" +
                "katta miqdorini saqlashga va ularga ishlov berishning yuqori\n" +
                "tezligini ta’minlash imkonini beradi\n" +
                "● PUBG Mobile o‘yinida, siz 60 FPSgacha olasiz.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_elektronika));
        button.setCallbackData("3-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_ElektronikaPlus(Long chatId) {
        Uch_elektronika++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cla6qcnn7c6qm23j01mg/original.jpg"));
        sendPhoto.setCaption("Planshet Xiaomi Redmi Pad SE Global 4/6/128GB, 8/256GB, katta akkumulator, 8000 mAs\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Ikki Wi-Fi diapazonlarini qo‘llab-quvvatlash: 2.4 GGs va 5 GGs,\n" +
                "● Bluetooth 5.0 boshqa qurilmalarga va internet tarmog‘iga barqaror va tez ulanishni ta’minlaydi\n" +
                "● Ushbu gadjet 2.4 GGsgacha tezlik olish qobiliyatiga ega bo‘lgan 6-nm texjarayon va 8 yadrolarga ega bo‘lgan Snapdragon® 680 protsessor bilan jihozlangan,\n" +
                "bu barcha ilovalar va dasturlarning tez va ravon ishlashini ta’minlaydi.\n" +
                "● Planshet o‘z ichiga LPDDR4X 4/6/8GB operativ xotirani\n" +
                "va eMMC 5.1 128/256GB ichki xotirani kiritadi, bu ma’lumotlarning\n" +
                "katta miqdorini saqlashga va ularga ishlov berishning yuqori\n" +
                "tezligini ta’minlash imkonini beradi\n" +
                "● PUBG Mobile o‘yinida, siz 60 FPSgacha olasiz.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_elektronika));
        button.setCallbackData("3-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_ElektronikaMinus(Long chatId) {
        if (Uch_elektronika>1){
            Uch_elektronika--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cla6qcnn7c6qm23j01mg/original.jpg"));
        sendPhoto.setCaption("Planshet Xiaomi Redmi Pad SE Global 4/6/128GB, 8/256GB, katta akkumulator, 8000 mAs\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Ikki Wi-Fi diapazonlarini qo‘llab-quvvatlash: 2.4 GGs va 5 GGs,\n" +
                "● Bluetooth 5.0 boshqa qurilmalarga va internet tarmog‘iga barqaror va tez ulanishni ta’minlaydi\n" +
                "● Ushbu gadjet 2.4 GGsgacha tezlik olish qobiliyatiga ega bo‘lgan 6-nm texjarayon va 8 yadrolarga ega bo‘lgan Snapdragon® 680 protsessor bilan jihozlangan,\n" +
                "bu barcha ilovalar va dasturlarning tez va ravon ishlashini ta’minlaydi.\n" +
                "● Planshet o‘z ichiga LPDDR4X 4/6/8GB operativ xotirani\n" +
                "va eMMC 5.1 128/256GB ichki xotirani kiritadi, bu ma’lumotlarning\n" +
                "katta miqdorini saqlashga va ularga ishlov berishning yuqori\n" +
                "tezligini ta’minlash imkonini beradi\n" +
                "● PUBG Mobile o‘yinida, siz 60 FPSgacha olasiz.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_elektronika));
        button.setCallbackData("3-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup tort_Elektronika(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckk5o4cjvf2peh8sjehg/original.jpg"));
        sendPhoto.setCaption("Sony PlayStation 5 Slim 1000 GB disk drayveri bilan \n\n " +
                "Mahsulot haqida qisqacha:\n" +
                "● Protsessor chastotasi: 3500 MGts\n" +
                "● RAM: 16 GB\n" +
                "● GPU: AMD Radeon\n" +
                "● Video xotira soati: 2230 MGts\n" +
                "● O'rnatilgan xotira turi: 825 GB SSD\n" +
                "● Optik haydovchi turi: Blu-ray/DVD\n" +
                "● Maksimal ruxsat: 8K Ultra HD qo'llab-quvvatlash\n" +
                "● Yaponiya 3-chi tahrir\n" +
                "● Protsessor turi: 8 yadroli AMD Ryzen Zen 2");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_elektronika));
        button.setCallbackData("4-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup tort_ElektronikaPlus(Long chatId) {
        Tort_elektronika++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckk5o4cjvf2peh8sjehg/original.jpg"));
        sendPhoto.setCaption("Sony PlayStation 5 Slim 1000 GB disk drayveri bilan \n\n " +
                "Mahsulot haqida qisqacha:\n" +
                "● Protsessor chastotasi: 3500 MGts\n" +
                "● RAM: 16 GB\n" +
                "● GPU: AMD Radeon\n" +
                "● Video xotira soati: 2230 MGts\n" +
                "● O'rnatilgan xotira turi: 825 GB SSD\n" +
                "● Optik haydovchi turi: Blu-ray/DVD\n" +
                "● Maksimal ruxsat: 8K Ultra HD qo'llab-quvvatlash\n" +
                "● Yaponiya 3-chi tahrir\n" +
                "● Protsessor turi: 8 yadroli AMD Ryzen Zen 2");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_elektronika));
        button.setCallbackData("4-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup tort_ElektronikaMinus(Long chatId) {
        if (Tort_elektronika>1){
            Tort_elektronika--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckk5o4cjvf2peh8sjehg/original.jpg"));
        sendPhoto.setCaption("Sony PlayStation 5 Slim 1000 GB disk drayveri bilan \n\n " +
                "Mahsulot haqida qisqacha:\n" +
                "● Protsessor chastotasi: 3500 MGts\n" +
                "● RAM: 16 GB\n" +
                "● GPU: AMD Radeon\n" +
                "● Video xotira soati: 2230 MGts\n" +
                "● O'rnatilgan xotira turi: 825 GB SSD\n" +
                "● Optik haydovchi turi: Blu-ray/DVD\n" +
                "● Maksimal ruxsat: 8K Ultra HD qo'llab-quvvatlash\n" +
                "● Yaponiya 3-chi tahrir\n" +
                "● Protsessor turi: 8 yadroli AMD Ryzen Zen 2");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_elektronika));
        button.setCallbackData("4-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup besh_Elektronika(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjjgakkvutv1g2ricde0/original.jpg"));
        sendPhoto.setCaption("Mobil telefon Novey A11 \n " +
                "Mahsulot haqida qisqacha:\n" +
                "● Ekran diagonali: 1.77\n" +
                "● Aloqa standarti: 2G (GSM 850/900/1800/1900)\n" +
                "● SIM kartalar soni: 2\n" +
                "● Bluetooth: Ha\n" +
                "● Qo'shimcha funktsiyalar: Chiroq, FM radio\n" +
                "● Ulagich: Micro USB\n" +
                "● Batareya: 1050 mA/soat");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_elektronika));
        button.setCallbackData("5-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup besh_ElektronikaPlus(Long chatId) {
        Besh_elektronika++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjjgakkvutv1g2ricde0/original.jpg"));
        sendPhoto.setCaption("Mobil telefon Novey A11 \n " +
                "Mahsulot haqida qisqacha:\n" +
                "● Ekran diagonali: 1.77\n" +
                "● Aloqa standarti: 2G (GSM 850/900/1800/1900)\n" +
                "● SIM kartalar soni: 2\n" +
                "● Bluetooth: Ha\n" +
                "● Qo'shimcha funktsiyalar: Chiroq, FM radio\n" +
                "● Ulagich: Micro USB\n" +
                "● Batareya: 1050 mA/soat");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_elektronika));
        button.setCallbackData("5-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup besh_ElektronikaMinus(Long chatId) {
        if (Besh_elektronika>1){
            Besh_elektronika--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjjgakkvutv1g2ricde0/original.jpg"));
        sendPhoto.setCaption("Mobil telefon Novey A11 \n " +
                "Mahsulot haqida qisqacha:\n" +
                "● Ekran diagonali: 1.77\n" +
                "● Aloqa standarti: 2G (GSM 850/900/1800/1900)\n" +
                "● SIM kartalar soni: 2\n" +
                "● Bluetooth: Ha\n" +
                "● Qo'shimcha funktsiyalar: Chiroq, FM radio\n" +
                "● Ulagich: Micro USB\n" +
                "● Batareya: 1050 mA/soat");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_elektronika));
        button.setCallbackData("5-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup olti_Elektronika(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clk4get6sfhsc0umir90/original.jpg"));
        sendPhoto.setCaption("Aqlli qo'l soati Zeblaze Vibe 7 Pro");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_elektronika));
        button.setCallbackData("6-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup olti_ElektronikaPlus(Long chatId) {
        Olti_elektronika++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clk4get6sfhsc0umir90/original.jpg"));
        sendPhoto.setCaption("Aqlli qo'l soati Zeblaze Vibe 7 Pro");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_elektronika));
        button.setCallbackData("6-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup olti_ElektronikaMinus(Long chatId) {
        if (Olti_elektronika>1){
            Olti_elektronika--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clk4get6sfhsc0umir90/original.jpg"));
        sendPhoto.setCaption("Aqlli qo'l soati Zeblaze Vibe 7 Pro");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-elektronika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_elektronika));
        button.setCallbackData("6-elektronika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-elektronika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-elektronika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-elektronika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-elektronika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    int Bir_MaishiyTexnika=1;
    int Ikki_MaishiyTexnika=1;
    int Uch_MaishiyTexnika=1;
    int Tort_MaishiyTexnika=1;
    int Besh_MaishiyTexnika=1;
    int Olti_MaishiyTexnika=1;

    public SendPhoto Bir_MaishiyTexnikaSendphoto(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clomahfn7c6gg9ie3om0/original.jpg"));
        sendPhoto.setCaption("Aqlli robot changyutgich Xiaomi Robot Vacuum E12 Global, quruq va nam tozalash\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Ishlab chiqaruvchidan rasmiy kafolat: 1 yil. \n" +
                "● Yangi Xiaomi Robot Vacuum E12 EU bilan samarali va aqlli yig‘ishtirish dunyosini oching. Bu oddiy aqlli robot-changyutgich emas, balki tozalik dunyosidagi haqiqiy chempion.\n" +
                "● Mi Home ilovasiga ulanib, siz yig‘ishtirish ustidan nazoratni qo‘lga kiritasiz. Aqlli robotni bevosita smartfoningizdan boshqaring, yig‘ishtirishning uchta rejimi orasidan tanlang va ortiqcha zo‘riqishlarsiz bekami-ko‘st tozalikdan bahramand bo‘ling.\n" +
                "● Xiaomi Robot Vacuum E12 EU butun xonani samarali yig‘ishtirilishini ta’minlovchi 4000 Pa kuchli so‘ruvchi motor bilan jihozlangan. Chang va ifloslik haqida unuting - ushbu robot-changyutgich har qanday iflosliklarni uddasidan chiqadi.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_MaishiyTexnika));
        button.setCallbackData("1-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_MaishiyTexnikaInline(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clomahfn7c6gg9ie3om0/original.jpg"));
        sendPhoto.setCaption("Aqlli robot changyutgich Xiaomi Robot Vacuum E12 Global, quruq va nam tozalash\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Ishlab chiqaruvchidan rasmiy kafolat: 1 yil.\n" +
                "● Yangi Xiaomi Robot Vacuum E12 EU bilan samarali va aqlli yig‘ishtirish dunyosini oching. Bu oddiy aqlli robot-changyutgich emas, balki tozalik dunyosidagi haqiqiy chempion.\n" +
                "● Mi Home ilovasiga ulanib, siz yig‘ishtirish ustidan nazoratni qo‘lga kiritasiz. Aqlli robotni bevosita smartfoningizdan boshqaring, yig‘ishtirishning uchta rejimi orasidan tanlang va ortiqcha zo‘riqishlarsiz bekami-ko‘st tozalikdan bahramand bo‘ling.\n" +
                "● Xiaomi Robot Vacuum E12 EU butun xonani samarali yig‘ishtirilishini ta’minlovchi 4000 Pa kuchli so‘ruvchi motor bilan jihozlangan. Chang va ifloslik haqida unuting - ushbu robot-changyutgich har qanday iflosliklarni uddasidan chiqadi.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_MaishiyTexnika));
        button.setCallbackData("1-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Bir_MaishiyTexnikaInlinePlus(Long chatId){
        Bir_MaishiyTexnika++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clomahfn7c6gg9ie3om0/original.jpg"));
        sendPhoto.setCaption("Aqlli robot changyutgich Xiaomi Robot Vacuum E12 Global, quruq va nam tozalash\n\n" +
                "Mahsulot haqida qisqacha:\\n\" +\n" +
                "● Ishlab chiqaruvchidan rasmiy kafolat: 1 yil.\n" +
                "● Yangi Xiaomi Robot Vacuum E12 EU bilan samarali va aqlli yig‘ishtirish dunyosini oching. Bu oddiy aqlli robot-changyutgich emas, balki tozalik dunyosidagi haqiqiy chempion.\n" +
                "● Mi Home ilovasiga ulanib, siz yig‘ishtirish ustidan nazoratni qo‘lga kiritasiz. Aqlli robotni bevosita smartfoningizdan boshqaring, yig‘ishtirishning uchta rejimi orasidan tanlang va ortiqcha zo‘riqishlarsiz bekami-ko‘st tozalikdan bahramand bo‘ling.\n" +
                "● Xiaomi Robot Vacuum E12 EU butun xonani samarali yig‘ishtirilishini ta’minlovchi 4000 Pa kuchli so‘ruvchi motor bilan jihozlangan. Chang va ifloslik haqida unuting - ushbu robot-changyutgich har qanday iflosliklarni uddasidan chiqadi.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_MaishiyTexnika));
        button.setCallbackData("1-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Bir_MaishiyTexnikaInlineMinus(Long chatId){
        if (Bir_MaishiyTexnika>1){
            Bir_MaishiyTexnika--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clomahfn7c6gg9ie3om0/original.jpg"));
        sendPhoto.setCaption("Aqlli robot changyutgich Xiaomi Robot Vacuum E12 Global, quruq va nam tozalash\n\n " +
                "Mahsulot haqida qisqacha:\n" +
                "● Ishlab chiqaruvchidan rasmiy kafolat: 1 yil.\n" +
                "● Yangi Xiaomi Robot Vacuum E12 EU bilan samarali va aqlli yig‘ishtirish dunyosini oching. Bu oddiy aqlli robot-changyutgich emas, balki tozalik dunyosidagi haqiqiy chempion.\n" +
                "● Mi Home ilovasiga ulanib, siz yig‘ishtirish ustidan nazoratni qo‘lga kiritasiz. Aqlli robotni bevosita smartfoningizdan boshqaring, yig‘ishtirishning uchta rejimi orasidan tanlang va ortiqcha zo‘riqishlarsiz bekami-ko‘st tozalikdan bahramand bo‘ling.\n" +
                "● Xiaomi Robot Vacuum E12 EU butun xonani samarali yig‘ishtirilishini ta’minlovchi 4000 Pa kuchli so‘ruvchi motor bilan jihozlangan. Chang va ifloslik haqida unuting - ushbu robot-changyutgich har qanday iflosliklarni uddasidan chiqadi.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_MaishiyTexnika));
        button.setCallbackData("1-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup Ikki_MaishiyTexnika(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmcj35bifoubkc6n5f8g/original.jpg"));
        sendPhoto.setCaption("Mikroto'lqinli pech Goodwell GMF-2012W, Solo, 20 L\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Boshqarish turi: Mexanik\n" +
                "● Hajmi: 20 L\n" +
                "● Koson turi: Oq\n" +
                "● Mikroto'lqinli pechning quvvati: 700 Vt\n" +
                "● Ishlab chiqaruvchi: Xitoy\n" +
                "● Kafolat: 3 yil");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_MaishiyTexnika));
        button.setCallbackData("2-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_MaishiyTexnikaPlus(Long chatId){
        Ikki_MaishiyTexnika++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmcj35bifoubkc6n5f8g/original.jpg"));
        sendPhoto.setCaption("Mikroto'lqinli pech Goodwell GMF-2012W, Solo, 20 L\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Boshqarish turi: Mexanik\n" +
                "● Hajmi: 20 L\n" +
                "● Koson turi: Oq\n" +
                "● Mikroto'lqinli pechning quvvati: 700 Vt\n" +
                "● Ishlab chiqaruvchi: Xitoy\n" +
                "● Kafolat: 3 yil");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_MaishiyTexnika));
        button.setCallbackData("2-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_MaishiyTexnikaMinus(Long chatId){
        if (Ikki_MaishiyTexnika>1){
            Ikki_MaishiyTexnika--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmcj35bifoubkc6n5f8g/original.jpg"));
        sendPhoto.setCaption("Mikroto'lqinli pech Goodwell GMF-2012W, Solo, 20 L\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Boshqarish turi: Mexanik\n" +
                "● Hajmi: 20 L\n" +
                "● Koson turi: Oq\n" +
                "● Mikroto'lqinli pechning quvvati: 700 Vt\n" +
                "● Ishlab chiqaruvchi: Xitoy\n" +
                "● Kafolat: 3 yil");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_MaishiyTexnika));
        button.setCallbackData("2-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup Uch_MaishiyTexnika(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckjbb6cjvf2sulnvad3g/original.jpg"));
        sendPhoto.setCaption("Konditsioner TCL TAC - 12CHSD/YA 11 I Invertor, ten bilan\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Elektr tent (harorat -15°C pasayganda ham to'xtovsiz ishlaydi)\n" +
                "● Invertor motor (past elektr kuchlanishda ham ishlashni davom etadi)\n" +
                "● R32 freon. Kam shovqin darajasi (19dB gacha)\n" +
                "● LED displey va kutish rejimi (minimal shovqin darajasini va qulay harorat o'zgarishini ta'minlaydi)\n" +
                "● Xavfsiz dizayn. Kondensat va elektr o'rtasida aloqa yo'q.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_MaishiyTexnika));
        button.setCallbackData("3-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_MaishiyTexnikaPlus(Long chatId){
        Uch_MaishiyTexnika++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckjbb6cjvf2sulnvad3g/original.jpg"));
        sendPhoto.setCaption("Konditsioner TCL TAC - 12CHSD/YA 11 I Invertor, ten bilan\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Elektr tent (harorat -15°C pasayganda ham to'xtovsiz ishlaydi)\n" +
                "● Invertor motor (past elektr kuchlanishda ham ishlashni davom etadi)\n" +
                "● R32 freon. Kam shovqin darajasi (19dB gacha)\n" +
                "● LED displey va kutish rejimi (minimal shovqin darajasini va qulay harorat o'zgarishini ta'minlaydi)\n" +
                "● Xavfsiz dizayn. Kondensat va elektr o'rtasida aloqa yo'q.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_MaishiyTexnika));
        button.setCallbackData("3-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_MaishiyTexnikaMinus(Long chatId){
        if (Uch_MaishiyTexnika>1){
            Uch_MaishiyTexnika--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckjbb6cjvf2sulnvad3g/original.jpg"));
        sendPhoto.setCaption("Konditsioner TCL TAC - 12CHSD/YA 11 I Invertor, ten bilan\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Elektr tent (harorat -15°C pasayganda ham to'xtovsiz ishlaydi)\n" +
                "● Invertor motor (past elektr kuchlanishda ham ishlashni davom etadi)\n" +
                "● R32 freon. Kam shovqin darajasi (19dB gacha)\n" +
                "● LED displey va kutish rejimi (minimal shovqin darajasini va qulay harorat o'zgarishini ta'minlaydi)\n" +
                "● Xavfsiz dizayn. Kondensat va elektr o'rtasida aloqa yo'q.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_MaishiyTexnika));
        button.setCallbackData("3-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup Tort_MaishiyTexnika(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/chmpuav5d7kom1tgatb0/original.jpg"));
        sendPhoto.setCaption("Dazmol HADiD BI-101\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_MaishiyTexnika));
        button.setCallbackData("4-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_MaishiyTexnikaPlus(Long chatId){
        Tort_MaishiyTexnika++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/chmpuav5d7kom1tgatb0/original.jpg"));
        sendPhoto.setCaption("Dazmol HADiD BI-101\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_MaishiyTexnika));
        button.setCallbackData("4-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_MaishiyTexnikaMinus(Long chatId){
        if (Tort_MaishiyTexnika>1){
            Tort_MaishiyTexnika--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/chmpuav5d7kom1tgatb0/original.jpg"));
        sendPhoto.setCaption("Dazmol HADiD BI-101\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_MaishiyTexnika));
        button.setCallbackData("4-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup Besh_MaishiyTexnika(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckiempsjvf2sulnv3dng/original.jpg"));
        sendPhoto.setCaption("Portativ tikuv mashinasi Mini Sewing Machine SM-202\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_MaishiyTexnika));
        button.setCallbackData("5-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_MaishiyTexnikaPlus(Long chatId){
        Besh_MaishiyTexnika++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckiempsjvf2sulnv3dng/original.jpg"));
        sendPhoto.setCaption("Portativ tikuv mashinasi Mini Sewing Machine SM-202\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_MaishiyTexnika));
        button.setCallbackData("5-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_MaishiyTexnikaMinus(Long chatId){
        if (Besh_MaishiyTexnika>1){
            Besh_elektronika--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckiempsjvf2sulnv3dng/original.jpg"));
        sendPhoto.setCaption("Portativ tikuv mashinasi Mini Sewing Machine SM-202\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_MaishiyTexnika));
        button.setCallbackData("5-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup Olti_MaishiyTexnika(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmtl0d125ku8jql6hcj0/original.jpg"));
        sendPhoto.setCaption("Isitgich AIWA CNH1114, 2000 Vt 25 kvadrat metrga, g'ildirakli shassili pechka\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● 25 kvadrat uchun 2 kVt quvvat maydonlarni isitadi\n" +
                "● Kompakt - qulay dizaynga ega, uni oson olib borish va har qanday sharoitda foydalanish oson\n" +
                "● Ishonchli va qulay qurilma\n" +
                "● Rang: oq\n" +
                "● Kuchi - 2000 Vt");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_MaishiyTexnika));
        button.setCallbackData("6-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_MaishiyTexnikaPlus(Long chatId){
        Olti_MaishiyTexnika++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmtl0d125ku8jql6hcj0/original.jpg"));
        sendPhoto.setCaption("Isitgich AIWA CNH1114, 2000 Vt 25 kvadrat metrga, g'ildirakli shassili pechka\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● 25 kvadrat uchun 2 kVt quvvat maydonlarni isitadi\n" +
                "● Kompakt - qulay dizaynga ega, uni oson olib borish va har qanday sharoitda foydalanish oson\n" +
                "● Ishonchli va qulay qurilma\n" +
                "● Rang: oq\n" +
                "● Kuchi - 2000 Vt");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_MaishiyTexnika));
        button.setCallbackData("6-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_MaishiyTexnikaMinus(Long chatId){
        if (Olti_MaishiyTexnika>1){
            Olti_MaishiyTexnika--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmtl0d125ku8jql6hcj0/original.jpg"));
        sendPhoto.setCaption("Isitgich AIWA CNH1114, 2000 Vt 25 kvadrat metrga, g'ildirakli shassili pechka\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● 25 kvadrat uchun 2 kVt quvvat maydonlarni isitadi\n" +
                "● Kompakt - qulay dizaynga ega, uni oson olib borish va har qanday sharoitda foydalanish oson\n" +
                "● Ishonchli va qulay qurilma\n" +
                "● Rang: oq\n" +
                "● Kuchi - 2000 Vt");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Maishiy texnika minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_MaishiyTexnika));
        button.setCallbackData("6-Maishiy texnika soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Maishiy texnika plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Maishiy texnika orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Maishiy texnika savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Maishiy texnika oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    int Bir_Kiyimlar=1;
    int Ikki_Kiyimlar=1;
    int Uch_Kiyimlar=1;
    int Tort_Kiyimlar=1;
    int Besh_Kiyimlar=1;
    int Olti_Kiyimlar=1;

    public SendPhoto Bir_KiyimlarSendphoto(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cfjidl7hgiopn8lc3bvg/original.jpg"));
        sendPhoto.setCaption("Erkaklar sport to'plami, xudi shim bilan, qora\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Kiyimlar));
        button.setCallbackData("1-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_KiyimlarInline(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cfjidl7hgiopn8lc3bvg/original.jpg"));
        sendPhoto.setCaption("Erkaklar sport to'plami, xudi shim bilan, qora\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Kiyimlar));
        button.setCallbackData("1-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Bir_KiyimlarInlinePlus(Long chatId){
        Bir_Kiyimlar++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cfjidl7hgiopn8lc3bvg/original.jpg"));
        sendPhoto.setCaption("Erkaklar sport to'plami, xudi shim bilan, qora\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Kiyimlar));
        button.setCallbackData("1-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Bir_KiyimlarInlineMinus(Long chatId){
        if (Bir_Kiyimlar>1){
            Bir_Kiyimlar--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cfjidl7hgiopn8lc3bvg/original.jpg"));
        sendPhoto.setCaption("Erkaklar sport to'plami, xudi shim bilan, qora\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Kiyimlar));
        button.setCallbackData("1-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup Ikki_Kiyimlar(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn325n3ifoubkc6r8ujg/original.jpg"));
        sendPhoto.setCaption("Ayollar to'plami: yubka + kofta\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Tantanali tadbirlar va kundalik kiyim uchun javob beradi\n" +
                "● Keng turadigon fason\n" +
                "● Har qanday poyabzal bilan kiyinish mumkin\n" +
                "● Bitta o'lcham 46-52 gacha mos keladi\n" +
                "● Fasl: kuz qish bohor");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Kiyimlar));
        button.setCallbackData("2-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_KiyimlarPlus(Long chatId){
        Ikki_Kiyimlar++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn325n3ifoubkc6r8ujg/original.jpg"));
        sendPhoto.setCaption("Ayollar to'plami: yubka + kofta\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Tantanali tadbirlar va kundalik kiyim uchun javob beradi\n" +
                "● Keng turadigon fason\n" +
                "● Har qanday poyabzal bilan kiyinish mumkin\n" +
                "● Bitta o'lcham 46-52 gacha mos keladi\n" +
                "● Fasl: kuz qish bohor");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Kiyimlar));
        button.setCallbackData("2-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_KiyimlarMinus(Long chatId){
        if (Ikki_Kiyimlar>1){
            Ikki_Kiyimlar--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn325n3ifoubkc6r8ujg/original.jpg"));
        sendPhoto.setCaption("Ayollar to'plami: yubka + kofta\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Tantanali tadbirlar va kundalik kiyim uchun javob beradi\n" +
                "● Keng turadigon fason\n" +
                "● Har qanday poyabzal bilan kiyinish mumkin\n" +
                "● Bitta o'lcham 46-52 gacha mos keladi\n" +
                "● Fasl: kuz qish bohor");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Kiyimlar));
        button.setCallbackData("2-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup Uch_Kiyimlar(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmjr8u1s99ouqbfqvh20/original.jpg"));
        sendPhoto.setCaption("Bolalar kombinezoni, chaqaloqlar uchun, quloqchalar bilan quyoncha, paxtali\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "Balandligi 52 dan 80 gacha bo'lgan o'lchamlar mavjud, ular chaqaloqlar va bir yarim yoshgacha bo'lgan bolalar uchun juda mos keladi.\n" +
                "Yumshoq va nozik yuqori sifatli trikotaj mato. Kombinezon 95% paxta va 5% elastandan iborat. Elastanning ozgina foizi kombinezonga shakl beradi, burishmaydi, cho'zilmaydi");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Kiyimlar));
        button.setCallbackData("3-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_KiyimlarPlus(Long chatId){
        Uch_Kiyimlar++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmjr8u1s99ouqbfqvh20/original.jpg"));
        sendPhoto.setCaption("Bolalar kombinezoni, chaqaloqlar uchun, quloqchalar bilan quyoncha, paxtali\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "Balandligi 52 dan 80 gacha bo'lgan o'lchamlar mavjud, ular chaqaloqlar va bir yarim yoshgacha bo'lgan bolalar uchun juda mos keladi.\n" +
                "Yumshoq va nozik yuqori sifatli trikotaj mato. Kombinezon 95% paxta va 5% elastandan iborat. Elastanning ozgina foizi kombinezonga shakl beradi, burishmaydi, cho'zilmaydi");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Kiyimlar));
        button.setCallbackData("3-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_KiyimlarMinus(Long chatId){
        if (Uch_Kiyimlar>1){
            Uch_Kiyimlar--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmjr8u1s99ouqbfqvh20/original.jpg"));
        sendPhoto.setCaption("Bolalar kombinezoni, chaqaloqlar uchun, quloqchalar bilan quyoncha, paxtali\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "Balandligi 52 dan 80 gacha bo'lgan o'lchamlar mavjud, ular chaqaloqlar va bir yarim yoshgacha bo'lgan bolalar uchun juda mos keladi.\n" +
                "Yumshoq va nozik yuqori sifatli trikotaj mato. Kombinezon 95% paxta va 5% elastandan iborat. Elastanning ozgina foizi kombinezonga shakl beradi, burishmaydi, cho'zilmaydi");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Kiyimlar));
        button.setCallbackData("3-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup Tort_Kiyimlar(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(""));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Kiyimlar));
        button.setCallbackData("4-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_KiyimlarPlus(Long chatId){
        Tort_Kiyimlar++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(""));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Kiyimlar));
        button.setCallbackData("4-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_KiyimlarMinus(Long chatId){
        if (Tort_Kiyimlar>1){
            Tort_Kiyimlar--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(""));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Kiyimlar));
        button.setCallbackData("4-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup Besh_Kiyimlar(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(""));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Kiyimlar));
        button.setCallbackData("5-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_KiyimlarPlus(Long chatId){
        Besh_Kiyimlar++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(""));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Kiyimlar));
        button.setCallbackData("5-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_KiyimlarMinus(Long chatId){
        if (Besh_Kiyimlar>1){
            Besh_Kiyimlar--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(""));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Kiyimlar));
        button.setCallbackData("5-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public InlineKeyboardMarkup Olti_Kiyimlar(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(""));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Kiyimlar));
        button.setCallbackData("6-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup Olti_KiyimlarPlus(Long chatId){
        Olti_Kiyimlar++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(""));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Kiyimlar));
        button.setCallbackData("6-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup Olti_KiyimlarMinus(Long chatId){
        if (Olti_Kiyimlar>1){
            Olti_Kiyimlar--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(""));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Kiyimlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Kiyimlar));
        button.setCallbackData("6-Kiyimlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Kiyimlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Kiyimlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Kiyimlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Kiyimlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }





}