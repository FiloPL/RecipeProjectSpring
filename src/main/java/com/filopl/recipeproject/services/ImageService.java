package com.filopl.recipeproject.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by T. FIlo Zegarlicki on 23.04.2022
 **/

public interface ImageService {
    void saveImageFile(Long recipeId, MultipartFile file);
}