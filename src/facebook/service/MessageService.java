package facebook.service;

import facebook.model.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageService {
    final Map<String, List<Message>> messagesByUserId;
    final FriendService friendService;

    public MessageService(FriendService friendService) {
        this.messagesByUserId = new HashMap<>();
        this.friendService = friendService;
    }

    public void sendMessage(final String receiverId, final Message message) {
        if (friendService.getFriendsList(message.getSenderId()).contains(receiverId)) {
            messagesByUserId.computeIfAbsent(receiverId, k -> new ArrayList<>()).add(message);
        } else {
            throw new RuntimeException("You are not friends with this user");
        }
    }

    public List<Message> getMessagesByUserId(final String userId) {
        final List<Message> messages = messagesByUserId.getOrDefault(userId, new ArrayList<>());
        messagesByUserId.remove(userId);
        return messages;
    }
}
