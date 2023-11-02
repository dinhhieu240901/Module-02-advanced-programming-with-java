package com.codegym.baitap.deployment_proxy_pattern;

import java.net.URL;

public class FileDownloader implements Downloader {

    private String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(URL url) {
        // Sử dụng URL và URLConnection để tải file.

    }
}