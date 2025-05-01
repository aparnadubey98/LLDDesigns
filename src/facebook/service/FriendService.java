package facebook.service;

import facebook.constants.FriendStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendService {
    final Map<String, List<String>> friendRequests;
    final Map<String, List<String>> friendsList;

    public FriendService() {
        this.friendRequests = new HashMap<>();
        this.friendsList = new HashMap<>();
    }

    public void acceptFriendRequest(String fromUserId, String toUserId) {
        if (friendRequests.containsKey(toUserId)) {
            List<String> requests = friendRequests.get(toUserId);
            if (requests.contains(fromUserId)) {
                requests.remove(fromUserId);
                friendsList.computeIfAbsent(toUserId, k -> new ArrayList<>()).add(fromUserId);
                friendsList.computeIfAbsent(fromUserId, k -> new ArrayList<>()).add(toUserId);
            }
        }
    }

    public void rejectFriendRequest(String fromUserId, String toUserId) {
        if (friendRequests.containsKey(toUserId)) {
            List<String> requests = friendRequests.get(toUserId);
            if (requests.contains(fromUserId)) {
                requests.remove(fromUserId);
            }
        }
    }

    public void unfriend(String userId1, String userId2) {
        if (friendsList.containsKey(userId1)) {
            List<String> friends = friendsList.get(userId1);
            if (friends.contains(userId2)) {
                friends.remove(userId2);
            }
        }
        if (friendsList.containsKey(userId2)) {
            List<String> friends = friendsList.get(userId2);
            if (friends.contains(userId1)) {
                friends.remove(userId1);
            }
        }
    }

    public List<String> getFriendRequests(String userId) {
        return friendRequests.getOrDefault(userId, new ArrayList<>());
    }

    public List<String> getFriendsList(String userId) {
        return friendsList.getOrDefault(userId, new ArrayList<>());
    }

    public FriendStatus getFriendStatus(String userId1, String userId2) {
        if (friendRequests.containsKey(userId1) && friendRequests.get(userId1).contains(userId2)) {
            return FriendStatus.PENDING;
        }
        if (friendsList.containsKey(userId1) && friendsList.get(userId1).contains(userId2)) {
            return FriendStatus.ACCEPTED;
        }
        if (friendsList.containsKey(userId2) && friendsList.get(userId2).contains(userId1)) {
            return FriendStatus.ACCEPTED;
        }
        return FriendStatus.NONE;
    }

    public void sendFriendRequest(String fromUserId, String toUserId) {
        if (friendsList.containsKey(fromUserId) && friendsList.get(fromUserId).contains(toUserId)) {
            throw new RuntimeException("Already friends");
        }
        if (friendRequests.containsKey(fromUserId) && friendRequests.get(fromUserId).contains(toUserId)) {
            throw new RuntimeException("Friend request already sent");
        }
        friendRequests.computeIfAbsent(fromUserId, k -> new ArrayList<>()).add(toUserId);
    }

    public void cancelFriendRequest(String fromUserId, String toUserId) {
        if (friendRequests.containsKey(fromUserId)) {
            List<String> requests = friendRequests.get(fromUserId);
            requests.remove(toUserId);
        }
    }
}