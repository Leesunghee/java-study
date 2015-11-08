package ch07.book.Exception;

/**
 * Created by sunghee on 2015. 5. 5..
 */
public class MessageLoader {

    public String load(String messageId) throws MessageNotFoundException {
        switch (messageId) {
            case "M001":
                return "잘못된 값입니다.";
            case "M002":
                return "ID와 암호가 일치하지 않습니다.";

        }

        throw new MessageNotFoundException("잘못된 메시지ID:" + messageId);
    }
}
