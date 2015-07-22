package com.dashaspivak.socialnetwork.interfaces;

import com.dashaspivak.socialnetwork.model.Friends;

public interface IFriendsRepository<T extends Friends> extends IRepository<T> {
    Iterable<Friends> GetFriendsListById(long id);
}
