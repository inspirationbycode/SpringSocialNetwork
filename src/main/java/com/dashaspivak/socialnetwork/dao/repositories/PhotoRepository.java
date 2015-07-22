package com.dashaspivak.socialnetwork.dao.repositories;

import com.dashaspivak.socialnetwork.interfaces.IPhotoRepository;
import com.dashaspivak.socialnetwork.model.Photo;

public class PhotoRepository<T extends Photo> extends Repository<T> implements IPhotoRepository<T> {
}
