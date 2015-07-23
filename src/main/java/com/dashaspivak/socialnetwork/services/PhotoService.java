package com.dashaspivak.socialnetwork.services;

import com.dashaspivak.socialnetwork.dao.repositories.PhotoRepository;
import com.dashaspivak.socialnetwork.dao.repositories.Repository;
import com.dashaspivak.socialnetwork.interfaces.repositories.IPhotoRepository;
import com.dashaspivak.socialnetwork.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Locale;

public class PhotoService {
    private static IPhotoRepository<Photo> photoRepository;

    @Autowired
    private MessageSource messageSource;

    static {
        photoRepository = new PhotoRepository<>();
    }

    public void AddPhoto(Photo photo, byte[] bytes) throws SQLException {
        try {
            Blob blob = new SerialBlob(bytes);
            photo.setName(blob);
            Repository<Photo> photoRepository = new Repository<Photo>();
            photoRepository.Add(photo);

        } catch (SQLException e){
            Locale locale = LocaleContextHolder.getLocale();
            throw new SQLException(messageSource.getMessage("resource.no_photo_error", null, locale));
        }

    }

}
