package com.oauth2.sample.domain.friend.repository;

import com.oauth2.sample.web.security.dto.User;

public interface FriendRepository {
    void selectFriendList(String email);

    void selectAddedMeFriendList(String email);

    void selectBlockList(String email);

    void insert(String email, User user);

    void update(String email);

    void block(String email, String targetEmail);
}
