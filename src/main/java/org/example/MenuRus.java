package org.example;

import org.telegram.telegrambots.meta.api.methods.ParseMode;
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

public class MenuRus {

    public SendMessage menu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выбирайте Услугу");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2= new KeyboardButton();
        KeyboardButton button3= new KeyboardButton();
        button.setText("Категории\uD83D\uDDC2");
        button1.setText("Наш сайт\uD83D\uDECD");
        button2.setText("Настройки⚙\uFE0F");
        button3.setText("Корзина\uD83D\uDED2");

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
    public SendMessage Sozlamalar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Настройки⚙\uFE0F");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1= new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        button.setText("Изменить язык\uD83D\uDD04");
        button1.setText("Изменить номер\uD83D\uDD04");
        button2.setText("👈Назад");
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
        sendMessage.setText("На какую язык хотите поменять \n\n qaysi tilga o`zgartirmoqchisiz");
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
        sendMessage.setText("Введите номер, который хотите изменить \n " +
                "Номер должен иметь вид +7 **********  ИЛИ +998 *********");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList=new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("👈 Назад");
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
                 <b>Категории</b>
                """);
        sendMessage.setParseMode(ParseMode.HTML);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>>rowlist=new ArrayList<>();
        List<InlineKeyboardButton>row=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Електроника");
        button.setCallbackData("Електроника");
        row.add(button);
        rowlist.add(row);

        button=new InlineKeyboardButton();
        button.setText("Бытовая техника");
        button.setCallbackData("Бытовая техника");
        row.add(button);

        button=new InlineKeyboardButton();
        row=new ArrayList<>();
        button.setText("Одежда");
        button.setCallbackData("Одежда");
        row.add(button);
        rowlist.add(row);

        button=new InlineKeyboardButton();
        button.setText("Аксессуары");
        button.setCallbackData("Аксессуары");
        row.add(button);

        button=new InlineKeyboardButton();
        row=new ArrayList<>();
        button.setText("Красота и уход");
        button.setCallbackData("Красота и уход");
        row.add(button);
        rowlist.add(row);

        button=new InlineKeyboardButton();
        button.setText("Здоровье");
        button.setCallbackData("Здоровье");
        row.add(button);

        button=new InlineKeyboardButton();
        row=new ArrayList<>();
        button.setText("Строительство и ремонт");
        button.setCallbackData("Строительство и ремонт");
        row.add(button);
        rowlist.add(row);

        button=new InlineKeyboardButton();
        button.setText("Автотовары");
        button.setCallbackData("Автотовары");
        row.add(button);

        button=new InlineKeyboardButton();
        row=new ArrayList<>();
        button.setText("Для ребёнок");
        button.setCallbackData("Для ребёнок");
        row.add(button);
        rowlist.add(row);

        button=new InlineKeyboardButton();
        button.setText("Спорт и отдых");
        button.setCallbackData("Спорт и отдых");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage KategoriyaOrqaga(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Хотите воспользоваться другой услугой?");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList=new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();
        button.setText("👈Назад");
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
        sendPhoto.setCaption("Смартфон Xiaomi Redmi 13C, 4GB+128GB I 8GB+256GB, 6.74\" 90Hz, 5000mAh, Dual SIM, 4G LTE\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-електроника минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_elektronika));
        button.setCallbackData("1-електроника чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-електроника плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-електроника назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-електроника корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-електроника вперёд");
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
        sendPhoto.setCaption("Смартфон Xiaomi Redmi 13C, 4GB+128GB I 8GB+256GB, 6.74\" 90Hz, 5000mAh, Dual SIM, 4G LTE\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-електроника минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_elektronika));
        button.setCallbackData("1-електроника чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-електроника плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-електроника назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-електроника корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-електроника вперёд");
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
        sendPhoto.setCaption("Телевизор Premier 43PRM705S, Full HD Смарт ТВ\n\n" +
                "Кратко о товаре:\n" +
                "● Тип матрицы - VA панель\n" +
                "● Разрешение - Full HD (1920 * 1080)\n" +
                "● Смарт TV - Android\n" +
                "● Гарантия - 3 год\n" +
                "Цена:\n" +
                "2 589 000 сум");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-електроника минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_elektronika));
        button.setCallbackData("2-електроника чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-електроника плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-електроника назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("2-електроника корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-електроника вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-електроника минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_elektronika));
        button.setCallbackData("3-електроника чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-електроника плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-електроника назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("3-електроника корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-електроника вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_Elektronika(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckk5o4cjvf2peh8sjehg/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-електроника минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_elektronika));
        button.setCallbackData("4-електроника чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-електроника плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-електроника назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("4-електроника корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-електроника вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_Elektronika(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjjgakkvutv1g2ricde0/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-електроника минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_elektronika));
        button.setCallbackData("5-електроника чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-електроника плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-електроника назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("5-електроника корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-електроника вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_Elektronika(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clk4get6sfhsc0umir90/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-електроника минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_elektronika));
        button.setCallbackData("6-електроника чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-електроника плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-електроника назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("6-електроника корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-електроника вперёд");
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

    public SendPhoto Bir_MaishiyTexnikaSendphoto(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clomahfn7c6gg9ie3om0/original.jpg"));
        sendPhoto.setCaption("Умный робот пылесос Xiaomi Robot Vacuum E12 Global, с функцией сухой и влажной уборки\n\n" +
                "Кратко о товаре:\n" +
                "● Официальная гарантия от производителя: 1 год. \n" +
                "● Откройте мир эффективной и умной уборки с новым Xiaomi Robot Vacuum E12 EU. Это не просто умный робот-пылесос, а настоящий чемпион в мире чистоты. \n" +
                "● Подключившись к приложению Mi Home, вы получаете полный контроль над уборкой. Управляйте умным роботом прямо с вашего смартфона, выбирайте между тремя режимами уборки и наслаждайтесь безупречной чистотой без лишних усилий. \n" +
                "● Xiaomi Robot Vacuum E12 EU оснащен мощным вытяжным мотором 4000 Па, обеспечивающим эффективную уборку всего помещения. Забудьте о пыли и грязи – этот робот-пылесос справится с любыми загрязнениями\n" +
                "Цена:\n" +
                "2 559 000 сум");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Бытовая техника минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_MaishiyTexnika));
        button.setCallbackData("1-Бытовая техника чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Бытовая техника плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Бытовая техника назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Бытовая техника корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Бытовая техника вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_MaishiyTexnikaInline(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clomahfn7c6gg9ie3om0/original.jpg"));
        sendPhoto.setCaption("Умный робот пылесос Xiaomi Robot Vacuum E12 Global, с функцией сухой и влажной уборки\n\n" +
                "Кратко о товаре:\n" +
                "● Официальная гарантия от производителя: 1 год. \n" +
                "● Откройте мир эффективной и умной уборки с новым Xiaomi Robot Vacuum E12 EU. Это не просто умный робот-пылесос, а настоящий чемпион в мире чистоты. \n" +
                "● Подключившись к приложению Mi Home, вы получаете полный контроль над уборкой. Управляйте умным роботом прямо с вашего смартфона, выбирайте между тремя режимами уборки и наслаждайтесь безупречной чистотой без лишних усилий. \n" +
                "● Xiaomi Robot Vacuum E12 EU оснащен мощным вытяжным мотором 4000 Па, обеспечивающим эффективную уборку всего помещения. Забудьте о пыли и грязи – этот робот-пылесос справится с любыми загрязнениями\n" +
                "Цена:\n" +
                "2 559 000 сум");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Бытовая техника минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_MaishiyTexnika));
        button.setCallbackData("1-Бытовая техника чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Бытовая техника плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Бытовая техника назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Бытовая техника корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Бытовая техника вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_MaishiyTexnika(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmcj35bifoubkc6n5f8g/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Бытовая техника минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_MaishiyTexnika));
        button.setCallbackData("2-Бытовая техника чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Бытовая техника плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Бытовая техника назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("2-Бытовая техника корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Бытовая техника вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_MaishiyTexnika(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckjbb6cjvf2sulnvad3g/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Бытовая техника минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_MaishiyTexnika));
        button.setCallbackData("3-Бытовая техника чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Бытовая техника плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Бытовая техника назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("3-Бытовая техника корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Бытовая техника вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_MaishiyTexnika(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/chmpuav5d7kom1tgatb0/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Бытовая техника минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_MaishiyTexnika));
        button.setCallbackData("4-Бытовая техника чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Бытовая техника плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Бытовая техника назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("4-Бытовая техника корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Бытовая техника вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_MaishiyTexnika(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckiempsjvf2sulnv3dng/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Бытовая техника минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_MaishiyTexnika));
        button.setCallbackData("5-Бытовая техника чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Бытовая техника плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Бытовая техника назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("5-Бытовая техника корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Бытовая техника вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_MaishiyTexnika(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmtl0d125ku8jql6hcj0/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Бытовая техника минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_MaishiyTexnika));
        button.setCallbackData("6-Бытовая техника чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Бытовая техника плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Бытовая техника назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("6-Бытовая техника корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Бытовая техника вперёд");
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

    public SendPhoto Bir_KiyimSendphoto(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cfjidl7hgiopn8lc3bvg/original.jpg"));
        sendPhoto.setCaption("Мужской спортивный комплект, штаны с худи, черный\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Одежды минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Kiyimlar));
        button.setCallbackData("1-Одежды чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Одежды плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Одежды назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Одежды корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Одежды вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_KiyimInline(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cfjidl7hgiopn8lc3bvg/original.jpg"));
        sendPhoto.setCaption("Мужской спортивный комплект, штаны с худи, черный\n\n" +
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

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Одежды минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Kiyimlar));
        button.setCallbackData("1-Одежды чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Одежды плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Одежды назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Одежды корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Одежды вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_Kiyim(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn325n3ifoubkc6r8ujg/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Одежды минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Kiyimlar));
        button.setCallbackData("2-Одежды чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Одежды плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Одежды назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("2-Одежды корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Одежды вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_Kiyim(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmjr8u1s99ouqbfqvh20/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Одежды минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Kiyimlar));
        button.setCallbackData("3-Одежды чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Одежды плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Одежды назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("3-Одежды корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Одежды вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_Kiyim(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn50anbifoubkc6rjrig/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Одежды минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Kiyimlar));
        button.setCallbackData("4-Одежды чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Одежды плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Одежды назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("4-Одежды корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Одежды вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_Kiyim(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cg67d37hgiov1qie6pbg/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Одежды минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Kiyimlar));
        button.setCallbackData("5-Одежды чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Одежды плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Одежды назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("5-Одежды корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Одежды вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_Kiyim(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckp9t6sjvf2iqscbnfdg/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Одежды минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Kiyimlar));
        button.setCallbackData("6-Одежды чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Одежды плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Одежды назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("6-Одежды корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Одежды вперёд");
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

    public SendPhoto Bir_AksessuarlarSendphoto(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjj1qrkjvf2ofbh7llcg/original.jpg"));
        sendPhoto.setCaption("Сумка мужская через плечо, барсетка\n\n" +
                "Кратко о товаре:\n" +
                "● Регулируемый ремень\n" +
                "● Прямоугольная форма; базовая модель\n" +
                "● Вид застежки - молния; кнопки\n" +
                "● Модель сумки: через плечо, на плечо, на пояс\n" +
                "● В случае если Вас что-то не устроило, пожалуйста, не торопитесь писать негативный отзыв. Напишите нам в личные сообщения, и мы обязательно решим Вашу проблему!\n" +
                "● Сумка повседневная, на любой случай\n" +
                "Цена:\n" +
                "69 000 сум");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Аксессуары минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Aksessuarlar));
        button.setCallbackData("1-Аксессуары чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Аксессуары плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Аксессуары назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Аксессуары корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Аксессуары вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_AksessuarlarInline(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjj1qrkjvf2ofbh7llcg/original.jpg"));
        sendPhoto.setCaption("Сумка мужская через плечо, барсетка\n\n" +
                "Кратко о товаре:\n" +
                "● Регулируемый ремень\n" +
                "● Прямоугольная форма; базовая модель\n" +
                "● Вид застежки - молния; кнопки\n" +
                "● Модель сумки: через плечо, на плечо, на пояс\n" +
                "● В случае если Вас что-то не устроило, пожалуйста, не торопитесь писать негативный отзыв. Напишите нам в личные сообщения, и мы обязательно решим Вашу проблему!\n" +
                "● Сумка повседневная, на любой случай\n" +
                "Цена:\n" +
                "69 000 сум");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Аксессуары минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Aksessuarlar));
        button.setCallbackData("1-Аксессуары чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Аксессуары плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Аксессуары назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Аксессуары корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Аксессуары вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_Aksessuarlar(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cje50qkjvf2trp6s4nrg/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Аксессуары минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Aksessuarlar));
        button.setCallbackData("2-Аксессуары чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Аксессуары плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Аксессуары назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("2-Аксессуары корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Аксессуары вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_Aksessuarlar(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjcb4lkvutv7iatast50/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Аксессуары минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Aksessuarlar));
        button.setCallbackData("3-Аксессуары чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Аксессуары плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Аксессуары назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("3-Аксессуары корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Аксессуары вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_Aksessuarlar(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clqtjohs99oopol1euj0/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Аксессуары минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Aksessuarlar));
        button.setCallbackData("4-Аксессуары чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Аксессуары плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Аксессуары назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("4-Аксессуары корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Аксессуары вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_Aksessuarlar(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckd380rk9fq1hr1nstrg/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Аксессуары минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Aksessuarlar));
        button.setCallbackData("5-Аксессуары чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Аксессуары плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Аксессуары назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("5-Аксессуары корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Аксессуары вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_Aksessuarlar(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ck6lh83k9fqd6b9u0su0/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Аксессуары минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Aksessuarlar));
        button.setCallbackData("6-Аксессуары чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Аксессуары плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Аксессуары назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("6-Аксессуары корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Аксессуары вперёд");
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

    public SendPhoto Bir_GozallikvaParvarishSendphoto(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn1juc1s99ouqbfth33g/original.jpg"));
        sendPhoto.setCaption("Туалетная вода для мужчин Antonio Banderas Blue Seduction, 100 мл\n\n" +
                "Кратко о товаре:\n" +
                "● Верхние ноты: Дыня, Бергамот, Мята и Черная смородина\n" +
                "● Базовые ноты: Древесные ноты и Амбра\n" +
                "● Производство: Испания\n" +
                "● Тип: Туалетная вода\n" +
                "● Объем: 100m Высокое качество сохраняется до 12 часов\n" +
                "● Туалетная вода для мужчин Antonio Banderas Blue Seduction, 100 мл\n" +
                "Цена:\n" +
                "339 000 сум");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Красота и уход минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Gozallikvaparvarish));
        button.setCallbackData("1-Красота и уход чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Красота и уход плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Красота и уход назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Красота и уход корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Красота и уход вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_GozallikvaParvarishInline(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cn1juc1s99ouqbfth33g/original.jpg"));
        sendPhoto.setCaption("Туалетная вода для мужчин Antonio Banderas Blue Seduction, 100 мл\n\n" +
                "Кратко о товаре:\n" +
                "● Верхние ноты: Дыня, Бергамот, Мята и Черная смородина\n" +
                "● Базовые ноты: Древесные ноты и Амбра\n" +
                "● Производство: Испания\n" +
                "● Тип: Туалетная вода\n" +
                "● Объем: 100m Высокое качество сохраняется до 12 часов\n" +
                "● Туалетная вода для мужчин Antonio Banderas Blue Seduction, 100 мл\n" +
                "Цена:\n" +
                "339 000 сум");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Красота и уход минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Gozallikvaparvarish));
        button.setCallbackData("1-Красота и уход чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Красота и уход плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Красота и уход назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Красота и уход корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Красота и уход вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_GozallikvaParvarish(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cc8ru0eha88139ljb7og/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Красота и уход минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Gozallikvaparvarish));
        button.setCallbackData("2-Красота и уход чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Красота и уход плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Красота и уход назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("2-Красота и уход корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Красота и уход вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_GozallikvaParvarish(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ciff24l6sfhndlbpe9fg/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Красота и уход минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Gozallikvaparvarish));
        button.setCallbackData("3-Красота и уход чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Красота и уход плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Красота и уход назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("3-Красота и уход корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Красота и уход вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_GozallikvaParvarish(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cla8eg7n7c6qm23j0erg/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Красота и уход минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Gozallikvaparvarish));
        button.setCallbackData("4-Красота и уход чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Красота и уход плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Красота и уход назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("4-Красота и уход корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Красота и уход вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_GozallikvaParvarish(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ckft48jk9fq8lb3aautg/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Красота и уход минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Gozallikvaparvarish));
        button.setCallbackData("5-Красота и уход чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Красота и уход плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Красота и уход назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("5-Красота и уход корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Красота и уход вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_GozallikvaParvarish(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cj576slenntd8rfequh0/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Красота и уход минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Gozallikvaparvarish));
        button.setCallbackData("6-Красота и уход чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Красота и уход плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Красота и уход назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("6-Красота и уход корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Красота и уход вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Здоровье минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Salomatlik));
        button.setCallbackData("1-Здоровье чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Здоровье плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Здоровье назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Здоровье корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Здоровье вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Здоровье минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Salomatlik));
        button.setCallbackData("1-Здоровье чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Здоровье плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Здоровье назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Здоровье корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Здоровье вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Здоровье минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Salomatlik));
        button.setCallbackData("2-Здоровье чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Здоровье плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Здоровье назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("2-Здоровье корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Здоровье вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Здоровье минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Salomatlik));
        button.setCallbackData("3-Здоровье чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Здоровье плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Здоровье назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("3-Здоровье корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Здоровье вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Здоровье минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Salomatlik));
        button.setCallbackData("4-Здоровье чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Здоровье плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Здоровье назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("4-Здоровье корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Здоровье вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Здоровье минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Salomatlik));
        button.setCallbackData("5-Здоровье чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Здоровье плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Здоровье назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("5-Здоровье корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Здоровье вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Здоровье минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Salomatlik));
        button.setCallbackData("6-Здоровье чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Здоровье плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Здоровье назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("6-Здоровье корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Здоровье вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Строительство и ремонт минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_QurilishMollari));
        button.setCallbackData("1-Строительство и ремонт чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Строительство и ремонт плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Строительство и ремонт назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Строительство и ремонт корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Строительство и ремонт вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Строительство и ремонт минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_QurilishMollari));
        button.setCallbackData("1-Строительство и ремонт чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Строительство и ремонт плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Строительство и ремонт назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Строительство и ремонт корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Строительство и ремонт вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Строительство и ремонт минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_QurilishMollari));
        button.setCallbackData("2-Строительство и ремонт чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Строительство и ремонт плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Строительство и ремонт назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("2-Строительство и ремонт корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Строительство и ремонт вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Строительство и ремонт минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_QurilishMollari));
        button.setCallbackData("3-Строительство и ремонт чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Строительство и ремонт плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Строительство и ремонт назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("3-Строительство и ремонт корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Строительство и ремонт вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Строительство и ремонт минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_QurilishMollari));
        button.setCallbackData("4-Строительство и ремонт чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Строительство и ремонт плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Строительство и ремонт назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("4-Строительство и ремонт корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Строительство и ремонт вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Строительство и ремонт минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_QurilishMollari));
        button.setCallbackData("5-Строительство и ремонт чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Строительство и ремонт плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Строительство и ремонт назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("5-Строительство и ремонт корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Строительство и ремонт вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Строительство и ремонт минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_QurilishMollari));
        button.setCallbackData("6-Строительство и ремонт чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Строительство и ремонт плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Строительство и ремонт назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("6-Строительство и ремонт корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Строительство и ремонт вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Автотовары минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Avtotovarlar));
        button.setCallbackData("1-Автотовары чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Автотовары плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Автотовары назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Автотовары корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Автотовары вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Автотовары минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Avtotovarlar));
        button.setCallbackData("1-Автотовары чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Автотовары плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Автотовары назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Автотовары корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Автотовары вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Автотовары минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Avtotovarlar));
        button.setCallbackData("2-Автотовары чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Автотовары плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Автотовары назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("2-Автотовары корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Автотовары вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Автотовары минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Avtotovarlar));
        button.setCallbackData("3-Автотовары чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Автотовары плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Автотовары назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("3-Автотовары корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Автотовары вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Автотовары минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Avtotovarlar));
        button.setCallbackData("4-Автотовары чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Автотовары плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Автотовары назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("4-Автотовары корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Автотовары вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Автотовары минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Avtotovarlar));
        button.setCallbackData("5-Автотовары чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Автотовары плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Автотовары назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("5-Автотовары корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Автотовары вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Автотовары минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Avtotovarlar));
        button.setCallbackData("6-Автотовары чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Автотовары плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Автотовары назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("6-Автотовары корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Автотовары вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Для ребёнок минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_BolalarUchun));
        button.setCallbackData("1-Для ребёнок чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Для ребёнок плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Для ребёнок назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Для ребёнок корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Для ребёнок вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Для ребёнок минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_BolalarUchun));
        button.setCallbackData("1-Для ребёнок чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Для ребёнок плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Для ребёнок назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Для ребёнок корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Для ребёнок вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Для ребёнок минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_BolalarUchun));
        button.setCallbackData("2-Для ребёнок чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Для ребёнок плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Для ребёнок назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("2-Для ребёнок корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Для ребёнок вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Для ребёнок минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_BolalarUchun));
        button.setCallbackData("3-Для ребёнок чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Для ребёнок плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Для ребёнок назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("3-Для ребёнок корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Для ребёнок вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Для ребёнок минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_BolalarUchun));
        button.setCallbackData("4-Для ребёнок чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Для ребёнок плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Для ребёнок назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("4-Для ребёнок корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Для ребёнок вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Для ребёнок минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_BolalarUchun));
        button.setCallbackData("5-Для ребёнок чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Для ребёнок плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Для ребёнок назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("5-Для ребёнок корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Для ребёнок вперёд");
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
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Для ребёнок минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_BolalarUchun));
        button.setCallbackData("6-Для ребёнок чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Для ребёнок плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Для ребёнок назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("6-Для ребёнок корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Для ребёнок вперёд");
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

    public SendPhoto Bir_SportvaHordiqsendphoto(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cl12215ennt861io3mjg/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Спорт и отдых минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Sport));
        button.setCallbackData("1-Спорт и отдых чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Спорт и отдых плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Спорт и отдых назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Спорт и отдых корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Спорт и отдых вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup Bir_SportvaHordiqinline(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cl12215ennt861io3mjg/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("1-Спорт и отдых минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Bir_Sport));
        button.setCallbackData("1-Спорт и отдых чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("1-Спорт и отдых плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("1-Спорт и отдых назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("1-Спорт и отдых корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("1-Спорт и отдых вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Ikki_SportvaHordiq(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/clcp2st6sfhgee0maoag/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("2-Спорт и отдых минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Ikki_Sport));
        button.setCallbackData("2-Спорт и отдых чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("2-Спорт и отдых плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("2-Спорт и отдых назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("2-Спорт и отдых корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("2-Спорт и отдых вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Uch_SportvaHordiq(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/ccmm7bbb3ho5lmupnkjg/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("3-Спорт и отдых минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Uch_Sport));
        button.setCallbackData("3-Спорт и отдых чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("3-Спорт и отдых плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("3-Спорт и отдых назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("3-Спорт и отдых корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("3-Спорт и отдых вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Tort_SportvaHordiq(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjl0v3cjvf2ofbh81lt0/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("4-Спорт и отдых минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Tort_Sport));
        button.setCallbackData("4-Спорт и отдых чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("4-Спорт и отдых плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("4-Спорт и отдых назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("4-Спорт и отдых корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("4-Спорт и отдых вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Besh_SportvaHordiq(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cjpilhkjvf2hdh3edh20/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("5-Спорт и отдых минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Besh_Sport));
        button.setCallbackData("5-Спорт и отдых чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("5-Спорт и отдых плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("5-Спорт и отдых назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("5-Спорт и отдых корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("5-Спорт и отдых вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup Olti_SportvaHordiq(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.uzum.uz/cmfvodrifoubkc6no8lg/original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("6-Спорт и отдых минус");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(Olti_Sport));
        button.setCallbackData("6-Спорт и отдых чесло");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("6-Спорт и отдых плюс");
        row.add(button);
        rowlist.add(row);
        button = new InlineKeyboardButton();
        row = new ArrayList<>();

        button.setText("⬅\uFE0F");
        button.setCallbackData("6-Спорт и отдых назад");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("добавить в корзину\uD83D\uDED2");
        button.setCallbackData("6-Спорт и отдых корзина");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText("➡\uFE0F");
        button.setCallbackData("6-Спорт и отдых вперёд");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


}
