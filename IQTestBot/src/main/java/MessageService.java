public class MessageService {
    private final static String TEST_MESSAGE = "test";
    private final IqBot iqBot = new IqBot();
    public void messageListener(String text) {
        if (text.equals(TEST_MESSAGE)) {
            iqBot.sendMessage("Марта зайка <3");
        }

    }
}
