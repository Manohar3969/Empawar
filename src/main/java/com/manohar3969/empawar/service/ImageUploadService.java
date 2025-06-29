package com.manohar3969.empawar.service;

import io.imagekit.sdk.ImageKit;
import io.imagekit.sdk.models.FileCreateRequest;
import io.imagekit.sdk.models.results.Result;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Base64;

@Service
public class ImageUploadService {

    public String uploadImage(MultipartFile file) throws Exception {
        // Convert to Base64
        byte[] fileBytes = file.getBytes();
        String base64File = Base64.getEncoder().encodeToString(fileBytes);
        String dataUri = "data:" + file.getContentType() + ";base64," + base64File;

        // Build upload request
        FileCreateRequest request = new FileCreateRequest(dataUri, file.getOriginalFilename());
        request.setFolder("/my-uploads"); // Optional: create folder in ImageKit

        // Upload and return URL
        Result result = ImageKit.getInstance().upload(request);
        return result.getUrl();
    }
}


