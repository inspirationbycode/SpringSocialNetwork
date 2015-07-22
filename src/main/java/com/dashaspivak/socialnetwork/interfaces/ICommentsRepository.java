package com.dashaspivak.socialnetwork.interfaces;


import com.dashaspivak.socialnetwork.model.Comments;

public interface ICommentsRepository<T extends Comments> extends IRepository<T> {
    Iterable<Comments> GetCommentsByPostId(long id);
}
