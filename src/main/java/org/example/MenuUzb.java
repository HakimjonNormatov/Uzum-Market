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
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        button.setText("Katigoriyalar\uD83D\uDDC2");
        button1.setText("Bizning sayt\uD83D\uDECD");
        button2.setText("Sozlamalar⚙\uFE0F");
        button3.setText("Savat\uD83D\uDED2");
        row.add(button);
        row.add(button1);
        row1.add(button2);
        row2.add(button3);
        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
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
        sendMessage.setText("На какую язык хотите поменять \n\n qaysi tilga o`zgartirmoqchisiz");
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
                "● Yorqinligi: 450 nit (turi), 600 nit\n\n ");

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
                "● Yorqinligi: 450 nit (turi), 600 nit\n\n ");

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
                "● Yorqinligi: 450 nit (turi), 600 nit\n\n ");

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
                "● Yorqinligi: 450 nit (turi), 600 nit\n\n ");

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
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn4ucohs99ouqbfu5jt0/original.jpg"));
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
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn4ucohs99ouqbfu5jt0/original.jpg"));
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
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn4ucohs99ouqbfu5jt0/original.jpg"));
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
            Besh_MaishiyTexnika--;
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
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn50anbifoubkc6rjrig/original.jpg"));
        sendPhoto.setCaption("Erkaklar krossovkalari Skechers GOWALK Flex 216481\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Havo sovutadigan Goga Mat oyoq to'shagini o'z ichiga oladi\n" +
                "● Nafas oladigan trikotaj ustki\n" +
                "● Asosiy xususiyatlar Yengil va sezgir ULTRA GO® tamponlama\n" +
                "● Model har qanday lazzat uchun 3 ta rangda taqdim etilgan\n" +
                "● Uzoq yurish, sport va kundalik hayot uchun juda mos keladi\n" +
                "● SKECHERS assortimenti haqida ko'proq bilish uchun do'kon sahifasiga o'ting");

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
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn50anbifoubkc6rjrig/original.jpg"));
        sendPhoto.setCaption("Erkaklar krossovkalari Skechers GOWALK Flex 216481\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Havo sovutadigan Goga Mat oyoq to'shagini o'z ichiga oladi\n" +
                "● Nafas oladigan trikotaj ustki\n" +
                "● Asosiy xususiyatlar Yengil va sezgir ULTRA GO® tamponlama\n" +
                "● Model har qanday lazzat uchun 3 ta rangda taqdim etilgan\n" +
                "● Uzoq yurish, sport va kundalik hayot uchun juda mos keladi\n" +
                "● SKECHERS assortimenti haqida ko'proq bilish uchun do'kon sahifasiga o'ting");

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
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn50anbifoubkc6rjrig/original.jpg"));
        sendPhoto.setCaption("Erkaklar krossovkalari Skechers GOWALK Flex 216481\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Havo sovutadigan Goga Mat oyoq to'shagini o'z ichiga oladi\n" +
                "● Nafas oladigan trikotaj ustki\n" +
                "● Asosiy xususiyatlar Yengil va sezgir ULTRA GO® tamponlama\n" +
                "● Model har qanday lazzat uchun 3 ta rangda taqdim etilgan\n" +
                "● Uzoq yurish, sport va kundalik hayot uchun juda mos keladi\n" +
                "● SKECHERS assortimenti haqida ko'proq bilish uchun do'kon sahifasiga o'ting");

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
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cg67d37hgiov1qie6pbg/original.jpg"));
        sendPhoto.setCaption("Ayollar krossovkalari \n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● EVA taglik, usti sun'iy teri");

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
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cg67d37hgiov1qie6pbg/original.jpg"));
        sendPhoto.setCaption("Ayollar krossovkalari \n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● EVA taglik, usti sun'iy teri");

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
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cg67d37hgiov1qie6pbg/original.jpg"));
        sendPhoto.setCaption("Ayollar krossovkalari \n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● EVA taglik, usti sun'iy teri");

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
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckp9t6sjvf2iqscbnfdg/original.jpg"));
        sendPhoto.setCaption("Bolalar etikchalari, ustki qismi parusinalik, o'lchamlari 22-35");

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
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckp9t6sjvf2iqscbnfdg/original.jpg"));
        sendPhoto.setCaption("Bolalar etikchalari, ustki qismi parusinalik, o'lchamlari 22-35");

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
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckp9t6sjvf2iqscbnfdg/original.jpg"));
        sendPhoto.setCaption("Bolalar etikchalari, ustki qismi parusinalik, o'lchamlari 22-35");

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

    int Bir_Aksessuarlar=1;
    int Ikki_Aksessuarlar=1;
    int Uch_Aksessuarlar=1;
    int Tort_Aksessuarlar=1;
    int Besh_Aksessuarlar=1;
    int Olti_Aksessuarlar=1;

    public SendPhoto Bir_AksessuarlarSendPhoto(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjj1qrkjvf2ofbh7llcg/original.jpg"));
        sendPhoto.setCaption("Erkaklar yelkama-sumkasi, barsetka\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Sozlanishi tasma\n" +
                "● To'rtburchaklar shakli; asosiy model\n" +
                "● Mahkamlagich turi - chaqmoq; tugmalar\n" +
                "● Sumka modeli: o'zaro faoliyat\n" +
                "Agar biror narsa sizga mos kelmasa, salbiy sharh yozishga shoshilmang. Bizga shaxsiy xabar yuboring va biz sizning muammoingizni albatta hal qilamiz!\n" +
                "● Har kuni, ofisga va ish uchun sumka");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Aksessuarlar));
        button.setCallbackData("1-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_AksessuarlarInline(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjj1qrkjvf2ofbh7llcg/original.jpg"));
        sendPhoto.setCaption("Erkaklar yelkama-sumkasi, barsetka\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Sozlanishi tasma\n" +
                "● To'rtburchaklar shakli; asosiy model\n" +
                "● Mahkamlagich turi - chaqmoq; tugmalar\n" +
                "● Sumka modeli: o'zaro faoliyat\n" +
                "Agar biror narsa sizga mos kelmasa, salbiy sharh yozishga shoshilmang. Bizga shaxsiy xabar yuboring va biz sizning muammoingizni albatta hal qilamiz!\n" +
                "● Har kuni, ofisga va ish uchun sumka");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Aksessuarlar));
        button.setCallbackData("1-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Bir_AksessuarlarPlus(Long chatId){
        Bir_Aksessuarlar++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjj1qrkjvf2ofbh7llcg/original.jpg"));
        sendPhoto.setCaption("Erkaklar yelkama-sumkasi, barsetka\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Sozlanishi tasma\n" +
                "● To'rtburchaklar shakli; asosiy model\n" +
                "● Mahkamlagich turi - chaqmoq; tugmalar\n" +
                "● Sumka modeli: o'zaro faoliyat\n" +
                "Agar biror narsa sizga mos kelmasa, salbiy sharh yozishga shoshilmang. Bizga shaxsiy xabar yuboring va biz sizning muammoingizni albatta hal qilamiz!\n" +
                "● Har kuni, ofisga va ish uchun sumka");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Aksessuarlar));
        button.setCallbackData("1-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Bir_AksessuarlarMinus(Long chatId){
        if (Bir_Aksessuarlar>1){
            Bir_Aksessuarlar--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjj1qrkjvf2ofbh7llcg/original.jpg"));
        sendPhoto.setCaption("Erkaklar yelkama-sumkasi, barsetka\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Sozlanishi tasma\n" +
                "● To'rtburchaklar shakli; asosiy model\n" +
                "● Mahkamlagich turi - chaqmoq; tugmalar\n" +
                "● Sumka modeli: o'zaro faoliyat\n" +
                "Agar biror narsa sizga mos kelmasa, salbiy sharh yozishga shoshilmang. Bizga shaxsiy xabar yuboring va biz sizning muammoingizni albatta hal qilamiz!\n" +
                "● Har kuni, ofisga va ish uchun sumka");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Aksessuarlar));
        button.setCallbackData("1-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_Aksessuarlar(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cje50qkjvf2trp6s4nrg/original.jpg"));
        sendPhoto.setCaption("Erkaklar va yigitlar uchun 2 tarafli kamar SERRADOR\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Material: germantin\n" +
                "● Ishlab chiqarilgan davlat: Xitoy\n" +
                "● Rangi: bir tomoni qora - ikkinchi tomoni jigarrang\n" +
                "● Eni: 4 sm\n" +
                "● Bo`yi: 120 sm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Aksessuarlar));
        button.setCallbackData("2-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_AksessuarlarPlus(Long chatId){
        Ikki_Aksessuarlar++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cje50qkjvf2trp6s4nrg/original.jpg"));
        sendPhoto.setCaption("Erkaklar va yigitlar uchun 2 tarafli kamar SERRADOR\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Material: germantin\n" +
                "● Ishlab chiqarilgan davlat: Xitoy\n" +
                "● Rangi: bir tomoni qora - ikkinchi tomoni jigarrang\n" +
                "● Eni: 4 sm\n" +
                "● Bo`yi: 120 sm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Aksessuarlar));
        button.setCallbackData("2-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_AksessuarlarMinus(Long chatId){
        if (Ikki_Aksessuarlar>1){
            Ikki_Aksessuarlar--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cje50qkjvf2trp6s4nrg/original.jpg"));
        sendPhoto.setCaption("Erkaklar va yigitlar uchun 2 tarafli kamar SERRADOR\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Material: germantin\n" +
                "● Ishlab chiqarilgan davlat: Xitoy\n" +
                "● Rangi: bir tomoni qora - ikkinchi tomoni jigarrang\n" +
                "● Eni: 4 sm\n" +
                "● Bo`yi: 120 sm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Aksessuarlar));
        button.setCallbackData("2-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_Aksessuarlar(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjcb4lkvutv7iatast50/original.jpg"));
        sendPhoto.setCaption("Ayollar uchun sumka\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Yuqori sifatli armatura\n" +
                "● Material-ekologik teri\n" +
                "● Tanlash uchun 4 ta rang\n" +
                "● Yilni o'lcham\n" +
                "● Sozlanishi tasma\n" +
                "● Ayollar uchun elkama-sumka");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Aksessuarlar));
        button.setCallbackData("3-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_AksessuarlarPlus(Long chatId){
        Uch_Aksessuarlar++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjcb4lkvutv7iatast50/original.jpg"));
        sendPhoto.setCaption("Ayollar uchun sumka\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Yuqori sifatli armatura\n" +
                "● Material-ekologik teri\n" +
                "● Tanlash uchun 4 ta rang\n" +
                "● Yilni o'lcham\n" +
                "● Sozlanishi tasma\n" +
                "● Ayollar uchun elkama-sumka");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Aksessuarlar));
        button.setCallbackData("3-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_AksessuarlarMinus(Long chatId){
        if (Uch_Aksessuarlar>1){
            Uch_Aksessuarlar--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjcb4lkvutv7iatast50/original.jpg"));
        sendPhoto.setCaption("Ayollar uchun sumka\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Yuqori sifatli armatura\n" +
                "● Material-ekologik teri\n" +
                "● Tanlash uchun 4 ta rang\n" +
                "● Yilni o'lcham\n" +
                "● Sozlanishi tasma\n" +
                "● Ayollar uchun elkama-sumka");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Aksessuarlar));
        button.setCallbackData("3-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_Aksessuarlar(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clqtjohs99oopol1euj0/original.jpg"));
        sendPhoto.setCaption("Bolalar uchun qalpoq, bahor va kuz fasliga mos\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Kuz,Bahor va Qish fasli uchun mo'ljallangan qalpoq\n" +
                "● O'lchamlarii: 1 yoshdan 3 yoshgacha\n" +
                "● Ishlab chiqaruvchi O'zbekiston\n" +
                "● 30 gradusdan past haroratda yuvilsin\n" +
                "● Qiz va o'g'il bolalar uchun\n" +
                "● Yengil to'qilgan material\n" +
                "● Farzandingizga qulaylik va uslub bering");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Aksessuarlar));
        button.setCallbackData("4-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_AksessuarlarPlus(Long chatId){
        Tort_Aksessuarlar++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clqtjohs99oopol1euj0/original.jpg"));
        sendPhoto.setCaption("Bolalar uchun qalpoq, bahor va kuz fasliga mos\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Kuz,Bahor va Qish fasli uchun mo'ljallangan qalpoq\n" +
                "● O'lchamlarii: 1 yoshdan 3 yoshgacha\n" +
                "● Ishlab chiqaruvchi O'zbekiston\n" +
                "● 30 gradusdan past haroratda yuvilsin\n" +
                "● Qiz va o'g'il bolalar uchun\n" +
                "● Yengil to'qilgan material\n" +
                "● Farzandingizga qulaylik va uslub bering");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Aksessuarlar));
        button.setCallbackData("4-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_AksessuarlarMinus(Long chatId){
        if (Tort_Aksessuarlar>1){
            Tort_Aksessuarlar--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clqtjohs99oopol1euj0/original.jpg"));
        sendPhoto.setCaption("Bolalar uchun qalpoq, bahor va kuz fasliga mos\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Kuz,Bahor va Qish fasli uchun mo'ljallangan qalpoq\n" +
                "● O'lchamlarii: 1 yoshdan 3 yoshgacha\n" +
                "● Ishlab chiqaruvchi O'zbekiston\n" +
                "● 30 gradusdan past haroratda yuvilsin\n" +
                "● Qiz va o'g'il bolalar uchun\n" +
                "● Yengil to'qilgan material\n" +
                "● Farzandingizga qulaylik va uslub bering");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Aksessuarlar));
        button.setCallbackData("4-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_Aksessuarlar(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckd380rk9fq1hr1nstrg/original.jpg"));
        sendPhoto.setCaption("Yonadigan uzuk, puls va yurak, fosforli, sevishganlar uchun, qorong'uda yonadigan\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Vaqt o'tishi bilan rangi o'chmaydi\n" +
                "● Metall turi: zanglamaydigan po'lat\n" +
                "● Allergiyaga olib kelmaydi\n" +
                "● Erkaklar va ayollar uchun\n" +
                "● Uslub: har kuni uchun\n" +
                "● Nur bilan quvvatlanadi");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Aksessuarlar));
        button.setCallbackData("5-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_AksessuarlarPlus(Long chatId){
        Besh_Aksessuarlar++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckd380rk9fq1hr1nstrg/original.jpg"));
        sendPhoto.setCaption("Yonadigan uzuk, puls va yurak, fosforli, sevishganlar uchun, qorong'uda yonadigan\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Vaqt o'tishi bilan rangi o'chmaydi\n" +
                "● Metall turi: zanglamaydigan po'lat\n" +
                "● Allergiyaga olib kelmaydi\n" +
                "● Erkaklar va ayollar uchun\n" +
                "● Uslub: har kuni uchun\n" +
                "● Nur bilan quvvatlanadi");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Aksessuarlar));
        button.setCallbackData("5-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_AksessuarlarMinus(Long chatId){
        if (Besh_Aksessuarlar>1){
            Besh_Aksessuarlar--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckd380rk9fq1hr1nstrg/original.jpg"));
        sendPhoto.setCaption("Yonadigan uzuk, puls va yurak, fosforli, sevishganlar uchun, qorong'uda yonadigan\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Vaqt o'tishi bilan rangi o'chmaydi\n" +
                "● Metall turi: zanglamaydigan po'lat\n" +
                "● Allergiyaga olib kelmaydi\n" +
                "● Erkaklar va ayollar uchun\n" +
                "● Uslub: har kuni uchun\n" +
                "● Nur bilan quvvatlanadi");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Aksessuarlar));
        button.setCallbackData("5-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_Aksessuarlar(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ck6lh83k9fqd6b9u0su0/original.jpg"));
        sendPhoto.setCaption("Soch uchun obodok marvaridlardan, oq marvaridli ayollar aksessuari, bezaklar\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Mahsulotning qadoqlangan og'irligi 40 g\n" +
                "● Bezatish har qanday zichlik va hajmdagi bukleler uchun javob beradi\n" +
                "● Boshni siqmaydi\n" +
                "● Buyum kengligi 1-1.5 sm. Diametri: 15 sm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Aksessuarlar));
        button.setCallbackData("6-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_AksessuarlarPlus(Long chatId){
        Olti_Aksessuarlar++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ck6lh83k9fqd6b9u0su0/original.jpg"));
        sendPhoto.setCaption("Soch uchun obodok marvaridlardan, oq marvaridli ayollar aksessuari, bezaklar\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Mahsulotning qadoqlangan og'irligi 40 g\n" +
                "● Bezatish har qanday zichlik va hajmdagi bukleler uchun javob beradi\n" +
                "● Boshni siqmaydi\n" +
                "● Buyum kengligi 1-1.5 sm. Diametri: 15 sm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Aksessuarlar));
        button.setCallbackData("6-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_AksessuarlarMinus(Long chatId) {
        if (Olti_Aksessuarlar>1){
            Olti_Aksessuarlar--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ck6lh83k9fqd6b9u0su0/original.jpg"));
        sendPhoto.setCaption("Soch uchun obodok marvaridlardan, oq marvaridli ayollar aksessuari, bezaklar\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Mahsulotning qadoqlangan og'irligi 40 g\n" +
                "● Bezatish har qanday zichlik va hajmdagi bukleler uchun javob beradi\n" +
                "● Boshni siqmaydi\n" +
                "● Buyum kengligi 1-1.5 sm. Diametri: 15 sm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Aksessuarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Aksessuarlar));
        button.setCallbackData("6-Aksessuarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Aksessuarlar plus");
        row.add(button);
        rowlist.add(row);

        button = new InlineKeyboardButton();
        row = new ArrayList<>();
        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Aksessuarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Aksessuarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Aksessuarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    int Bir_Gozallikvaparvarish=1;
    int Ikki_Gozallikvaparvarish=1;
    int Uch_Gozallikvaparvarish=1;
    int Tort_Gozallikvaparvarish=1;
    int Besh_Gozallikvaparvarish=1;
    int Olti_Gozallikvaparvarish=1;

    public SendPhoto Bir_GozallikVaParvarishsendphoto(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn1juc1s99ouqbfth33g/original.jpg"));
        sendPhoto.setCaption("Erkaklar uchun xushbo'ylagich suvi Antonio Banderas Blue Seduction, 50 ml\n\n" +
                "Narx:\n" +
                "donasi 299 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Gozallikvaparvarish));
        button.setCallbackData("1-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_GozallikVaParvarishInline(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn1juc1s99ouqbfth33g/original.jpg"));
        sendPhoto.setCaption("Erkaklar uchun xushbo'ylagich suvi Antonio Banderas Blue Seduction, 50 ml\n\n" +
                "Narx:\n" +
                "donasi 299 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Gozallikvaparvarish));
        button.setCallbackData("1-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Bir_GozallikVaParvarishPlus(Long chatId) {
        Bir_Gozallikvaparvarish++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn1juc1s99ouqbfth33g/original.jpg"));
        sendPhoto.setCaption("Erkaklar uchun xushbo'ylagich suvi Antonio Banderas Blue Seduction, 50 ml\n\n" +
                "Narx:\n" +
                "donasi 299 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Gozallikvaparvarish));
        button.setCallbackData("1-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Bir_GozallikVaParvarishMinus(Long chatId) {
        if (Bir_Gozallikvaparvarish>1) {
            Bir_Gozallikvaparvarish--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn1juc1s99ouqbfth33g/original.jpg"));
        sendPhoto.setCaption("Erkaklar uchun xushbo'ylagich suvi Antonio Banderas Blue Seduction, 50 ml\n\n" +
                "Narx:\n" +
                "donasi 299 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Gozallikvaparvarish));
        button.setCallbackData("1-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_GozallikVaParvarish(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cc8ru0eha88139ljb7og/original.jpg"));
        sendPhoto.setCaption("Soch uchun shampun Garnier Fructis SOS, tiklash, 400 ml\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Ta'siri: ta'mirlash, mustahkamlash, parchalanishga qarshi\n" +
                "● Soch turi: shikastlangan, uchlari bo'lingan\n\n" +
                "Narx:\n" +
                "donasi 48 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Gozallikvaparvarish));
        button.setCallbackData("2-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_GozallikVaParvarishPlus(Long chatId) {
        Ikki_Gozallikvaparvarish++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cc8ru0eha88139ljb7og/original.jpg"));
        sendPhoto.setCaption("Soch uchun shampun Garnier Fructis SOS, tiklash, 400 ml\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Ta'siri: ta'mirlash, mustahkamlash, parchalanishga qarshi\n" +
                "● Soch turi: shikastlangan, uchlari bo'lingan\n\n" +
                "Narx:\n" +
                "donasi 48 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Gozallikvaparvarish));
        button.setCallbackData("2-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_GozallikVaParvarishMinus(Long chatId) {
        if(Ikki_Gozallikvaparvarish>1){
            Ikki_Gozallikvaparvarish--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cc8ru0eha88139ljb7og/original.jpg"));
        sendPhoto.setCaption("Soch uchun shampun Garnier Fructis SOS, tiklash, 400 ml\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Ta'siri: ta'mirlash, mustahkamlash, parchalanishga qarshi\n" +
                "● Soch turi: shikastlangan, uchlari bo'lingan\n\n" +
                "Narx:\n" +
                "donasi 48 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Gozallikvaparvarish));
        button.setCallbackData("2-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_GozallikVaParvarish(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ciff24l6sfhndlbpe9fg/original.jpg"));
        sendPhoto.setCaption("Elektr tish cho'tkasi, 3 nasadkalar, batareyalar to'plamda\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● 3 nasadka + batareya kiritilgan\n" +
                "● Daqiqada 19800 tebranish\n" +
                "● Namlikka qarshi himoya darajasi IPX7" +
                "Narx:\n" +
                "donasi 33 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Gozallikvaparvarish));
        button.setCallbackData("3-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_GozallikVaParvarishPlus(Long chatId) {
        Uch_Gozallikvaparvarish++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ciff24l6sfhndlbpe9fg/original.jpg"));
        sendPhoto.setCaption("Elektr tish cho'tkasi, 3 nasadkalar, batareyalar to'plamda\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● 3 nasadka + batareya kiritilgan\n" +
                "● Daqiqada 19800 tebranish\n" +
                "● Namlikka qarshi himoya darajasi IPX7" +
                "Narx:\n" +
                "donasi 33 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Gozallikvaparvarish));
        button.setCallbackData("3-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_GozallikVaParvarishMinus(Long chatId) {
        if (Uch_Gozallikvaparvarish>1){
            Uch_Gozallikvaparvarish--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ciff24l6sfhndlbpe9fg/original.jpg"));
        sendPhoto.setCaption("Elektr tish cho'tkasi, 3 nasadkalar, batareyalar to'plamda\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● 3 nasadka + batareya kiritilgan\n" +
                "● Daqiqada 19800 tebranish\n" +
                "● Namlikka qarshi himoya darajasi IPX7" +
                "Narx:\n" +
                "donasi 33 000 so'm ");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Gozallikvaparvarish));
        button.setCallbackData("3-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_GozallikVaParvarish(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cj2j9d56sfhndlbrcsp0/original.jpg"));
        sendPhoto.setCaption("Mahsulot haqida qisqacha:\n" +
                "● Miqdori: ishda 9 ta to'sar\n" +
                "Narx:\n" +
                "bir pachkasi 83 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Gozallikvaparvarish));
        button.setCallbackData("4-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_GozallikVaParvarishPlus(Long chatId) {
        Tort_Gozallikvaparvarish++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cj2j9d56sfhndlbrcsp0/original.jpg"));
        sendPhoto.setCaption("Mahsulot haqida qisqacha:\n" +
                "● Miqdori: ishda 9 ta to'sar\n" +
                "Narx:\n" +
                "bir pachkasi 83 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Gozallikvaparvarish));
        button.setCallbackData("4-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_GozallikVaParvarishMinus(Long chatId) {
        if (Tort_Gozallikvaparvarish>1){
            Tort_Gozallikvaparvarish--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cj2j9d56sfhndlbrcsp0/original.jpg"));
        sendPhoto.setCaption("Mahsulot haqida qisqacha:\n" +
                "● Miqdori: ishda 9 ta to'sar\n" +
                "Narx:\n" +
                "bir pachkasi 83 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Gozallikvaparvarish));
        button.setCallbackData("4-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_GozallikVaParvarish(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckft48jk9fq8lb3aautg/original.jpg"));
        sendPhoto.setCaption("Massaj tarog'i, soch uchun\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "Metall tishli yumshoq soch uchun massaj taroq;\n" +
                "Sochlarni silliq holatda taraydi;\n" +
                "Sochlarga zarar yetkazmaydi;\n" +
                "Uzunligi: 21 sm\n" +
                "Rangi: Jigarrang.\n" +
                "Narx:\n" +
                "donasi 21 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Gozallikvaparvarish));
        button.setCallbackData("5-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_GozallikVaParvarishPlus(Long chatId) {
        Besh_Gozallikvaparvarish++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckft48jk9fq8lb3aautg/original.jpg"));
        sendPhoto.setCaption("Massaj tarog'i, soch uchun\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "Metall tishli yumshoq soch uchun massaj taroq;\n" +
                "Sochlarni silliq holatda taraydi;\n" +
                "Sochlarga zarar yetkazmaydi;\n" +
                "Uzunligi: 21 sm\n" +
                "Rangi: Jigarrang.\n" +
                "Narx:\n" +
                "donasi 21 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Gozallikvaparvarish));
        button.setCallbackData("5-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_GozallikVaParvarishMinus(Long chatId) {
        if (Besh_Gozallikvaparvarish>1){
            Besh_Gozallikvaparvarish--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckft48jk9fq8lb3aautg/original.jpg"));
        sendPhoto.setCaption("Massaj tarog'i, soch uchun\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "Metall tishli yumshoq soch uchun massaj taroq;\n" +
                "Sochlarni silliq holatda taraydi;\n" +
                "Sochlarga zarar yetkazmaydi;\n" +
                "Uzunligi: 21 sm\n" +
                "Rangi: Jigarrang.\n" +
                "Narx:\n" +
                "donasi 21 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Gozallikvaparvarish));
        button.setCallbackData("5-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_GozallikVaParvarish(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cj576slenntd8rfequh0/original.jpg"));
        sendPhoto.setCaption("Blesk lab uchun Cappuvini\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "Dudaklarni namlaydi va oziqlantiradi\n" +
                "Qulay format\n" +
                "Dudaklarga g'ayrioddiy tabiiy soyani beradi\n" +
                "Narx:\n" +
                "donasi 25 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Gozallikvaparvarish));
        button.setCallbackData("6-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_GozallikVaParvarishPlus(Long chatId) {
        Olti_Gozallikvaparvarish++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cj576slenntd8rfequh0/original.jpg"));
        sendPhoto.setCaption("Blesk lab uchun Cappuvini\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "Dudaklarni namlaydi va oziqlantiradi\n" +
                "Qulay format\n" +
                "Dudaklarga g'ayrioddiy tabiiy soyani beradi\n" +
                "Narx:\n" +
                "donasi 25 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Gozallikvaparvarish));
        button.setCallbackData("6-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_GozallikVaParvarishMinus(Long chatId) {
        if (Olti_Gozallikvaparvarish>1) {
            Olti_Gozallikvaparvarish--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cj576slenntd8rfequh0/original.jpg"));
        sendPhoto.setCaption("Blesk lab uchun Cappuvini\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "Dudaklarni namlaydi va oziqlantiradi\n" +
                "Qulay format\n" +
                "Dudaklarga g'ayrioddiy tabiiy soyani beradi\n" +
                "Narx:\n" +
                "donasi 25 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Gozallik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Gozallikvaparvarish));
        button.setCallbackData("6-Gozallik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Gozallik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Gozallik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Gozallik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Gozallik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    int Bir_Salomatlik=1;
    int Ikki_Salomatlik=1;
    int Uch_Salomatlik=1;
    int Tort_Salomatlik=1;
    int Besh_Salomatlik=1;
    int Olti_Salomatlik=1;

    public SendPhoto Bir_SalomatlikSendphoto(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cdota3ivtie1lhbdvie0/original.jpg"));
        sendPhoto.setCaption("Avtomatik tonometr bilakda Protech YK-BPA4, 22-32 см\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Salomatlik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Salomatlik));
        button.setCallbackData("1-Salomatlik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Salomatlik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Salomatlik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Salomatlik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Salomatlik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_SalomatlikInline(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cdota3ivtie1lhbdvie0/original.jpg"));
        sendPhoto.setCaption("Avtomatik tonometr bilakda Protech YK-BPA4, 22-32 см\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Salomatlik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Salomatlik));
        button.setCallbackData("1-Salomatlik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Salomatlik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Salomatlik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Salomatlik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Salomatlik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Bir_SalomatlikPlus(Long chatId) {
        Bir_Salomatlik++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cdota3ivtie1lhbdvie0/original.jpg"));
        sendPhoto.setCaption("Avtomatik tonometr bilakda Protech YK-BPA4, 22-32 см\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Salomatlik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Salomatlik));
        button.setCallbackData("1-Salomatlik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Salomatlik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Salomatlik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Salomatlik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Salomatlik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Bir_SalomatlikMinus(Long chatId) {
        if (Bir_Salomatlik>1){
            Bir_Salomatlik--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cdota3ivtie1lhbdvie0/original.jpg"));
        sendPhoto.setCaption("Avtomatik tonometr bilakda Protech YK-BPA4, 22-32 см\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Salomatlik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Salomatlik));
        button.setCallbackData("1-Salomatlik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Salomatlik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Salomatlik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Salomatlik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Salomatlik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_Salomatlik(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cg68e97hgiov1qie7320/original.jpg"));
        sendPhoto.setCaption("Magniy kapsulalari Naturex, 60 kapsula, 150 mg\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Salomatlik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Salomatlik));
        button.setCallbackData("2-Salomatlik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Salomatlik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Salomatlik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Salomatlik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Salomatlik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_SalomatlikPlus(Long chatId) {
        Ikki_Salomatlik++;
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cg68e97hgiov1qie7320/original.jpg"));
        sendPhoto.setCaption("Magniy kapsulalari Naturex, 60 kapsula, 150 mg\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Salomatlik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Salomatlik));
        button.setCallbackData("2-Salomatlik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Salomatlik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Salomatlik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Salomatlik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Salomatlik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_SalomatlikMinus(Long chatId) {
        if (Ikki_Salomatlik>1){
            Ikki_Salomatlik--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cg68e97hgiov1qie7320/original.jpg"));
        sendPhoto.setCaption("Magniy kapsulalari Naturex, 60 kapsula, 150 mg\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Salomatlik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Salomatlik));
        button.setCallbackData("2-Salomatlik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Salomatlik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Salomatlik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Salomatlik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Salomatlik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_Salomatlik(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/chqce3l6sfhndlbn5qug/original.jpg"));
        sendPhoto.setCaption("O'simlik turmalin plastir, bo'g'inlar va mushaklar uchun og'riq qoldiruvchi vosita, 10 dona\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Turmalin kukuni va o'tlar bilan yamoq mustahkamlangan, bo'g'inlar va burmalar uchun og'riq qoldiruvchi vositadir. 10 dona\n" +
                "● Og'riqni engillashtiradi. Tendonlar va suyaklarni mustahkamlaydi. Revmatik va oyoq barmoqlaridagi og'riqlarni yo'q qiladi\n" +
                "● Yaxshi nafas olish qobiliyatini ta'minlaydigan va hatto ayniqsa sezgir terini bezovta qilmaydigan mikro gözenekli to'quv bo'lmagan mato asosida, ko'ndalang cho'zilgan elastik tabiiy matodan qilingan\n" +
                "● Yamoqda Xitoy tibbiyotining ko'plab samarali o'simliklari mavjud bo'lib, ular antitümör va analjezik ta'sirga ega.\n" +
                "● Tarkibida faqat tabiiy ekstraktlar va o'tlar mavjud\n" +
                "● quyidagilar uchun ishlatiladi: osteoxondroz, siyatik, artrit;qo'shma displazi, nevralgiya,miyalji; jarohatlar, ko'karishlar, burmalar va shish\n" +
                "Narx:\n" +
                "34 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Salomatlik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Salomatlik));
        button.setCallbackData("3-Salomatlik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Salomatlik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Salomatlik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Salomatlik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Salomatlik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_Salomatlik(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cdr712gv1htd23ai529g/original.jpg"));
        sendPhoto.setCaption("Hallux Valgus Oyoq uchun fiksator, Katta bosh barmoq qeyshiqlikni to'g'irlash\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Salomatlik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Salomatlik));
        button.setCallbackData("4-Salomatlik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Salomatlik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Salomatlik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Salomatlik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Salomatlik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_Salomatlik(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cfor2gfhgiov1qicf6r0/original.jpg"));
        sendPhoto.setCaption("Ortopedik korset orqa bel grijasi uchun, bel-sakral\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Bel dumg'aza qismini mahkam tutib turadi\n" +
                "● Nafas oluvchi materialdan tayyorlangan\n" +
                "Narx:\n" +
                "donasi 229 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Salomatlik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Salomatlik));
        button.setCallbackData("5-Salomatlik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Salomatlik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Salomatlik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Salomatlik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Salomatlik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_Salomatlik(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cg4sahfhj8j9g699f6fg/original.jpg"));
        sendPhoto.setCaption("Elektr oyoq uqalagichi EMS, miostimulyator\n" +
                "Narx:\n" +
                "donasi 29 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Salomatlik minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Salomatlik));
        button.setCallbackData("6-Salomatlik soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Salomatlik plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Salomatlik orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Salomatlik savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Salomatlik oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    int Bir_QurilishMollari=1;
    int Ikki_QurilishMollari=1;
    int Uch_QurilishMollari=1;
    int Tort_QurilishMollari=1;
    int Besh_QurilishMollari=1;
    int Olti_QurilishMollari=1;

    public SendPhoto Bir_QurilishMollariSendphoto(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clm6uel6sfhsc0un3b0g/original.jpg"));
        sendPhoto.setCaption("Zanjirli elektr arrasi Biyoti BYT-712\n\n" +
                "Mahsulot haqida qisqacha\n" +
                "\n" +
                "● Dvigatel quvvati - 1800 vt\n" +
                "● Aylanishlar soni - 4800 / daqiqasiga\n" +
                "● Moy idishi hajmi - 0.1 litr\n" +
                "● Shina uzunligi - 405 mm\n" +
                "● Ishlab chiqaruvchi mamlakat - Xitoy\n" +
                "Narx:\n" +
                "donasi 545 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Qurilish minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_QurilishMollari));
        button.setCallbackData("1-Qurilish soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Qurilish plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Qurilish orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Qurilish savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Qurilish oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_QurilishMollariInline(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clm6uel6sfhsc0un3b0g/original.jpg"));
        sendPhoto.setCaption("Zanjirli elektr arrasi Biyoti BYT-712\n\n" +
                "Mahsulot haqida qisqacha\n" +
                "\n" +
                "● Dvigatel quvvati - 1800 vt\n" +
                "● Aylanishlar soni - 4800 / daqiqasiga\n" +
                "● Moy idishi hajmi - 0.1 litr\n" +
                "● Shina uzunligi - 405 mm\n" +
                "● Ishlab chiqaruvchi mamlakat - Xitoy\n" +
                "Narx:\n" +
                "donasi 545 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Qurilish minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_QurilishMollari));
        button.setCallbackData("1-Qurilish soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Qurilish plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Qurilish orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Qurilish savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Qurilish oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_QurilishMollari(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ce4otsavtie1lhbehpj0/original.jpg"));
        sendPhoto.setCaption("Chilangarlik va montaj ishlari bo'yicha to'plam MTX, 12 dona, 135629\n\n" +
                "Narx:\n" +
                "bir toplami 303 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Qurilish minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_QurilishMollari));
        button.setCallbackData("2-Qurilish soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Qurilish plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Qurilish orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Qurilish savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Qurilish oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_QurilishMollari(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cl8skll6sfhgee0lhfb0/original.jpg"));
        sendPhoto.setCaption("Lazer masofa o'lchagich UNI-T\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● UNI-T brendi\n" +
                "● Lazer turi\n" +
                "Narx:\n" +
                "donasi 390 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Qurilish minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_QurilishMollari));
        button.setCallbackData("3-Qurilish soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Qurilish plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Qurilish orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Qurilish savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Qurilish oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_QurilishMollari(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clkoqj5enntcj8a9pcj0/original.jpg"));
        sendPhoto.setCaption("Simsiz drel-shurup buragich L-Fine 2113, cho'tkasiz, 13 mm\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● 5.Boshlar: 4 mm, 5 mm, 5.5 mm, 6 mm, 7 mm, 8 mm, 9 mm, 10 mm, 12 mm.\n" +
                "● 1. Kuchlanishi: 21V\n" +
                "● 2.Maksimal aylanish momenti 40NM\n" +
                "● 3.Maksimal tezlik 0-1400 r/min\n" +
                "● 4.Minimal tezlik 0-450 r/min\n" +
                "Narx:\n" +
                "bir to`plami 459 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Qurilish minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_QurilishMollari));
        button.setCallbackData("4-Qurilish soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Qurilish plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Qurilish orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Qurilish savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Qurilish oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_QurilishMollari(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clausel6sfhgee0lvj1g/original.jpg"));
        sendPhoto.setCaption("Simsiz osma chiroq magnitda, tungi chiroq\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Batareya yoki batareyalar bilan quvvatlanadi\n" +
                "● Magnitga ega lampochka istalgan joylarda ishlatish mumkin\n" +
                "● Mini LED lampochka batareyasi bilan ishlaydigan ichki devor tungi chiroqli elektr devor tugmachalari bilan uy uchun favqulodda chiroq\n" +
                "● LED lampochka\n" +
                "● O'lcham: 7.5 * 11 * 2 sm, og'irligi 70 g\n" +
                "Narx:\n" +
                "donasi 29 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Qurilish minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_QurilishMollari));
        button.setCallbackData("5-Qurilish soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Qurilish plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Qurilish orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Qurilish savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Qurilish oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_QurilishMollari(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clgppilennt1kt4dlsbg/original.jpg"));
        sendPhoto.setCaption("Smesitel high tech bukuluvchan oshxona uchun,COCO sultan\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Past qismi tolik latundan yasalgan yani zanglamaydi\n" +
                "● High tech korinishiga oxshaydi, chiroylik dizayn\n" +
                "● maxsulotni olganingizda sharx yozishni unutmang iltimos\n" +
                "● Ushbu COCO SULTAN, BOTU smesitel yangicha korinish yangi dizayn va sifatlik\n" +
                "● Purjina tepa qismi tolik bukuluvchan bolib,xoxlaganingizcha qayrishingiz mumkun\n" +
                "● + shlang 40 sm dan 2 ta\n" +
                "Narx:\n" +
                "donasi 188 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Qurilish minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_QurilishMollari));
        button.setCallbackData("6-Qurilish soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Qurilish plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Qurilish orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Qurilish savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Qurilish oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    int Bir_Avtotovarlar=1;
    int Ikki_Avtotovarlar=1;
    int Uch_Avtotovarlar=1;
    int Tort_Avtotovarlar=1;
    int Besh_Avtotovarlar=1;
    int Olti_Avtotovarlar=1;

    public SendPhoto Bir_AvtotovarlarSendphoto(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cgeqrh7hgiov1qifdtqg/original.jpg"));
        sendPhoto.setCaption("O't oldiruvchi svechasi GM Tracker 1.8 uchun №25197812\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Avtotovarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Avtotovarlar));
        button.setCallbackData("1-Avtotovarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Avtotovarlar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Avtotovarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Avtotovarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Avtotovarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_AvtotovarlarInline(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cgeqrh7hgiov1qifdtqg/original.jpg"));
        sendPhoto.setCaption("O't oldiruvchi svechasi GM Tracker 1.8 uchun №25197812\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Avtotovarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Avtotovarlar));
        button.setCallbackData("1-Avtotovarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Avtotovarlar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Avtotovarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Avtotovarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Avtotovarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_Avtotovarlar(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cgf9hffhgiov1qiff820/original.jpg"));
        sendPhoto.setCaption("GM Malibu-2 uchun salon havo filtri №13356914\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Avtotovarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Avtotovarlar));
        button.setCallbackData("2-Avtotovarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Avtotovarlar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Avtotovarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Avtotovarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Avtotovarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_Avtotovarlar(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cl9h43fn7c6qm23irap0/original.jpg"));
        sendPhoto.setCaption("Fara to'plami GM CAPTIVA №42639353/42639352\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Avtotovarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Avtotovarlar));
        button.setCallbackData("3-Avtotovarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Avtotovarlar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Avtotovarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Avtotovarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Avtotovarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_Avtotovarlar(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ci9fh5l40v9pplt4ca70/original.jpg"));
        sendPhoto.setCaption("Videoregistrator Lenovo V7 Plus FullHD 2023 ver + 32GB SanDisk, kamerasi Malibu shaklida\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Avtotovarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Avtotovarlar));
        button.setCallbackData("4-Avtotovarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Avtotovarlar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Avtotovarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Avtotovarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Avtotovarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_Avtotovarlar(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cl2h1o5ennt861iodaq0/original.jpg"));
        sendPhoto.setCaption("Avtomobil avariya vaziyatlar uchun to'plami 5 tasi 1 da, aptechka, o't o'chirish moslamasi, jilet, favqulodda holat belgisi\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Avtotovarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Avtotovarlar));
        button.setCallbackData("5-Avtotovarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Avtotovarlar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Avtotovarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Avtotovarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Avtotovarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_Avtotovarlar(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cfihkhvhgiopn8lc08dg/original.jpg"));
        sendPhoto.setCaption("Havo xushbo'ylantirgich avtomobil uchun\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Quyosh batareyasining mavjudligi batareyalarsiz ishlashga imkon beradi\n" +
                "● Yo'lingizni diversifikatsiya qilish uchun ajoyib imkoniyat\n" +
                "● Aylanadigan pichoqlar\n" +
                "● Har qanday sirt uchun mavjud\n" +
                "● Xushbo'y moy avtomobildagi hidni yaxshilaydi\n" +
                "● Havoni xushbo'ylashtiradigan aromatizator\n" +
                "Narx:\n" +
                "donasi 75 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Avtotovarlar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Avtotovarlar));
        button.setCallbackData("6-Avtotovarlar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Avtotovarlar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Avtotovarlar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Avtotovarlar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Avtotovarlar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    int Bir_BolalarUchun=1;
    int Ikki_BolalarUchun=1;
    int Uch_BolalarUchun=1;
    int Tort_BolalarUchun=1;
    int Besh_BolalarUchun=1;
    int Olti_BolalarUchun=1;

    public SendPhoto Bir_BolalarUchunSendphoto(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmho1j1s99ouqbfqjjqg/original.jpg"));
        sendPhoto.setCaption("Bolalar uchun manej, bolalar o'yinchoqlari bilan mat, chaqaloqlar uchun musiqiy pianino\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Diqqat! Ushbu mahsulot haqida yuqoridagi tavsifda batafsil ma'lumot berilgan\n" +
                "● Katlanadigan tufayli dizaynlar, uni sayohatlarga olib borish qulay va yo'lda sayohat qilish va bolani ko'ngil ochish joylarga birga olib ketishingiz mumkin\n" +
                "● Bolalarga ularning umumiy o'sishi va rivojlanishi uchun zarur bo'lgan ko'nikmalarni rivojlantirishga yordam beradi, mushaklarni kuchaytirishga, muvofiqlashtirishga yordam beradi\n" +
                "● Bolaning rivojlanishi uchun juda foydali, bolalar bog'chasida emaklash uchun yorqin va chiroyli gilam bolaga juda ko'p qiziqarli o'yin soatlari va ko'plab ijobiy his-tuyg'ularni beradi\n" +
                "● Bola yolg'iz o'tirganda, gilam pianino rolini o'ynaydi, uni interaktiv musiqa stoliga osongina aylantirish mumkin. O'yinchoq vosita ko'nikmalarini o'rgatadi va bolaning eshitish va ko'rish qobiliyatini rivojlantiradi\n" +
                "Narx:\n" +
                "bir to`plami 189 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Bolalar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_BolalarUchun));
        button.setCallbackData("1-Bolalar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Bolalar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Bolalar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Bolalar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Bolalar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_BolalarUchunInline(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmho1j1s99ouqbfqjjqg/original.jpg"));
        sendPhoto.setCaption("Bolalar uchun manej, bolalar o'yinchoqlari bilan mat, chaqaloqlar uchun musiqiy pianino\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Diqqat! Ushbu mahsulot haqida yuqoridagi tavsifda batafsil ma'lumot berilgan\n" +
                "● Katlanadigan tufayli dizaynlar, uni sayohatlarga olib borish qulay va yo'lda sayohat qilish va bolani ko'ngil ochish joylarga birga olib ketishingiz mumkin\n" +
                "● Bolalarga ularning umumiy o'sishi va rivojlanishi uchun zarur bo'lgan ko'nikmalarni rivojlantirishga yordam beradi, mushaklarni kuchaytirishga, muvofiqlashtirishga yordam beradi\n" +
                "● Bolaning rivojlanishi uchun juda foydali, bolalar bog'chasida emaklash uchun yorqin va chiroyli gilam bolaga juda ko'p qiziqarli o'yin soatlari va ko'plab ijobiy his-tuyg'ularni beradi\n" +
                "● Bola yolg'iz o'tirganda, gilam pianino rolini o'ynaydi, uni interaktiv musiqa stoliga osongina aylantirish mumkin. O'yinchoq vosita ko'nikmalarini o'rgatadi va bolaning eshitish va ko'rish qobiliyatini rivojlantiradi\n" +
                "Narx:\n" +
                "bir to`plami 189 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Bolalar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_BolalarUchun));
        button.setCallbackData("1-Bolalar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Bolalar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Bolalar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Bolalar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Bolalar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_BolalarUchun(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cl10d5t6sfhgee0k5fog/original.jpg"));
        sendPhoto.setCaption("Tolokar, pushkar tutqichli 3 tasi 1 da Sport Car, 4 yoshgacha bo'lgan bolalar uchun\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Bolalar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_BolalarUchun));
        button.setCallbackData("2-Bolalar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Bolalar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Bolalar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Bolalar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Bolalar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_BolalarUchun(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cl1ob0d6sfhgee0kaeig/original.jpg"));
        sendPhoto.setCaption("Teknum 531 bolalar aravachasi Kolyaska 3 tasi 1 da, transformer\n\n" +
                "Narx:\n" +
                "bir to`plami 1 399 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Bolalar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_BolalarUchun));
        button.setCallbackData("3-Bolalar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Bolalar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Bolalar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Bolalar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Bolalar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_BolalarUchun(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn0dei9s99ouqbft9r1g/original.jpg"));
        sendPhoto.setCaption("Konstruktor ajdarho chavandozlari Lego bilan mos\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Qadoqlash: bardoshli qadoqlash tashish va saqlash vaqtida ehtiyot qismlar xavfsizligini ta'minlaydi.\n" +
                "● Ninja mavzusi: har bir to'plam bolalar uchun mashhur va jozibali Ninja jangchilari mavzusiga asoslangan.\n" +
                "● To'plamlar seriyasi: 8 xil yig'ish to'plamini o'z ichiga oladi, ularning har biri o'ziga xos haykalchalar va mototsikllar to'plamiga ega.\n" +
                "● Qismlar soni: har bir to'plamda 52 dan 55 gacha qismlar mavjud bo'lib, ular batafsil modellarni yaratishga imkon beradi.\n" +
                "Narx:\n" +
                "bir to`plami 19 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Bolalar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_BolalarUchun));
        button.setCallbackData("4-Bolalar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Bolalar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Bolalar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Bolalar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Bolalar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_BolalarUchun(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjeuktcvutvdmqj4hufg/original.jpg"));
        sendPhoto.setCaption("Modellashtirish uchun plastilin Modelling clay, 24 rang\n\n" +
                "Plastilin - bu sizning tasavvuringizni ochishga va ajoyib san'at asarlarini yaratishga yordam beradigan ko'p qirrali ijodiy vositadir. Yumshoq, egiluvchan va qoliplash juda oson, bu sizga turli shakllar, ob'ektlar va haykallarni osongina modellashtirish imkonini beradi.\n" +
                "\n" +
                "7 va undan katta yoshdagi bolalar uchun yaxshilangan formulali plastilin: u elastik bo'ladi, lekin fraktsiyalarni yirtmaydi va shaklini yaxshi ushlab turadi, bu sizga eng nozik qismlarni haykalga solishga imkon beradi. Plastilin chizish texnikasi uchun ideal - plastilinografiya. Tarkibi engil pigmentlarga ega, shuning uchun hunarmandchilik uzoq vaqt saqlanadi va so'nmaydi. Aniq hidsiz, qo'llar va ish yuzasi ifloslanmaydi.\n" +
                "Narx:\n" +
                "bir qutisi 22 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Bolalar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_BolalarUchun));
        button.setCallbackData("5-Bolalar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Bolalar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Bolalar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Bolalar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Bolalar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_BolalarUchun(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cf4h5k0l08k0o9qi17ug/original.jpg"));
        sendPhoto.setCaption("Chizma doskasi LCD 8.5inch Writing Tablet, 12 x 16.5 sm\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● LCD 8.5inch\n" +
                "● Batarekasi uzoq muddatga yetadi\n" +
                "● 12 x 16.5 sm\n" +
                "Narx:\n" +
                "donasi 22 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Bolalar minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_BolalarUchun));
        button.setCallbackData("6-Bolalar soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Bolalar plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Bolalar orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Bolalar savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Bolalar oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    int Bir_Sport=1;
    int Ikki_Sport=1;
    int Uch_Sport=1;
    int Tort_Sport=1;
    int Besh_Sport=1;
    int Olti_Sport=1;

    public SendPhoto Bir_SportSendphoto(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cl12215ennt861io3mjg/original.jpg"));
        sendPhoto.setCaption("Elektr samokat KECHTE M1 Electric Scooter, 8.5\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Sport minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Sport));
        button.setCallbackData("1-Sport soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Sport plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Sport orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Sport savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Sport oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_SportInline(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cl12215ennt861io3mjg/original.jpg"));
        sendPhoto.setCaption("Elektr samokat KECHTE M1 Electric Scooter, 8.5\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Sport minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Sport));
        button.setCallbackData("1-Sport soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Sport plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Sport orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("1-Sport savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Sport oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_Sport(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clcp2st6sfhgee0maoag/original.jpg"));
        sendPhoto.setCaption("Velotrenajor Ax 010\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Maxovik: 4 kg (ichki aylanuvchi disk)\n" +
                "● Mashg’ulotlarni og’irlashtirish imkoni : 8 xil darajada\n" +
                "● Monitor: vaqt, masofa, tezlik, puls, kaloriya o’lchaydi\n" +
                "● Puls: rulda\n" +
                "● Maks foydalanuvchi vazni: 110 kg\n" +
                "Narx:\n" +
                "donasi  1 799 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Sport minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Sport));
        button.setCallbackData("2-Sport soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Sport plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Sport orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("2-Sport savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Sport oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_Sport(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ccmm7bbb3ho5lmupnkjg/original.jpg"));
        sendPhoto.setCaption("Sakragichi sport va krossfit mashg'ulotlari uchun\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● 2.8 metr (uzunligi sozlanishi)\n" +
                "● Sport va krossfit mashg'ulotlari uchun arqondan sakrash\n" +
                "● Muvofiqlashtirish va chidamlilikni yaxshilaydi\n" +
                "● PVX qoplangan po'lat sim\n" +
                "● Arqon burilmaydi\n" +
                "Narx:\n" +
                "donasi 49 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Sport minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Sport));
        button.setCallbackData("3-Sport soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Sport plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Sport orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("3-Sport savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Sport oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_Sport(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjl0v3cjvf2ofbh81lt0/original.jpg"));
        sendPhoto.setCaption("Futbol to'pi Molten, AFC F5A5000-AC, o'lcham 5\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Sport minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Sport));
        button.setCallbackData("4-Sport soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Sport plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Sport orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("4-Sport savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Sport oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_Sport(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjpilhkjvf2hdh3edh20/original.jpg"));
        sendPhoto.setCaption("Batut fitnes va jamping uchun, vazn yo'qotish va o'yin-kulgi uchun\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Diametri (sm): 120.130\n" +
                "● Fitnes va sakrash uchun batut. Kilo yo'qotish uchun trambolin\n" +
                "● Yuk ko'tarish qobiliyati: 140 kg\n" +
                "● Balandligi: 1.5 metr\n" +
                "● Нar qanday savol bo'lsa UZUM MARKET shaxsiy xabar orqali bog'laning\n" +
                "Narx:\n" +
                "donasi 1 050 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Sport minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Sport));
        button.setCallbackData("5-Sport soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Sport plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Sport orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("5-Sport savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Sport oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_Sport(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmfvodrifoubkc6no8lg/original.jpg"));
        sendPhoto.setCaption("Bilyard uchun qo'lqop Predator va Classic, chap va o'ng qo'l, 2 rang\n\n" +
                "Mahsulot haqida qisqacha:\n" +
                "● Hajmi: o'lchamsiz\n" +
                "● Xususiyat chap va o'ng qo'llar uchun\n" +
                "● Predator va Classic\n" +
                "● Rang: qora, ko'k\n" +
                "● 1 dona o'z ichiga oladi\n" +
                "Narx:\n" +
                "donasi 49 000 so'm");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Sport minus");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Sport));
        button.setCallbackData("6-Sport soni");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Sport plus");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Sport orqaga");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("Savatga qoshish\uD83D\uDED2");
        button.setCallbackData("6-Sport savat");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Sport oldinga");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

}