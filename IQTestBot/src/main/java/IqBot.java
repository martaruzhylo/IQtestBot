import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class IqBot extends TelegramLongPollingBot {
    private static final String TOKEN = "906208031:AAGxSmmJ1WYBkVHuq5GKyrc7KasBOK2HNZ0";
    private static final String BOT_NAME = "iq_test_bot";
    private long USER_ID;
    private final MessageService messageService = new MessageService();

    public void onUpdateReceived(Update update) {
        String text = update.getMessage().getText();
        USER_ID = update.getMessage().getChatId();
        messageService.messageListener(text);
    }

    public void sendMessage(String text) {
        SendMessage message = new SendMessage();
        message.setChatId(USER_ID);
        message.setText(text);
        try {
            execute(message);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

    public String getBotUsername() {
        return null;
    }

    public String getBotToken() {
        return null;
    }
}
