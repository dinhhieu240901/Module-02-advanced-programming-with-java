package com.codegym.thuchanh.deployment_adapter;

import com.codegym.FileUtil;

import java.io.File;

public class FileCalculatorAdapter implements FileCalculator {

    @Override
    public long calculateSize(String path) {
        FileUtil fileUtil = new FileUtil();
        File file = new File(path);
        return fileUtil.calculateSize(file);
    }
}