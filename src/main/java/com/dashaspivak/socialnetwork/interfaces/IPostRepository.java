package com.dashaspivak.socialnetwork.interfaces;

import com.dashaspivak.socialnetwork.model.Post;

/**
 * Created by например on 20.07.2015.
 */
public interface IPostRepository<T extends Post> extends IRepository<T> {
    Iterable<Post> GetUserPostsById(long id);
    Post GetPostById(long id);
}
