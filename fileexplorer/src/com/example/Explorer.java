package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 实现此接口，完成功能
 * 考虑，如果File对象是文件夹
 */
public interface Explorer {
    /**
     * 将文件(夹)从源文件夹复制到目的文件夹
     * @param sourceFile
     * @param desFile
     */
    void copyFile(File sourceFile,File desFile) throws IOException;

    /**
     * 删除文件或文件夹
     * @param file
     */
    void delFile(File file);

    /**
     *将文件(夹)从源文件夹剪切到目的文件夹
     * @param sourceFile
     * @param desFile
     */
    void shearFile(File sourceFile,File desFile) throws IOException;

    /**
     * 重命名文件
     * @param desFile
     * @param newName 新名字
     */
    void renameFile(File desFile,String newName);

    /**
     * 打印文件夹中的所有文件的文件名
     * @param file 传入的是目标文件夹的File
     */
    void showFiles(File file);

    /**
     * 创建在指定文件夹中创建文件
     * @param desFile 目标文件夹
     * @param suffix 文件后缀
     * @param name 文件名
     */
    void createFile(File desFile,String suffix,String name) throws IOException;

    /**
     * 将目标文件以特定方式加密
     * @param desFile
     */
    void encode(File desFile) throws FileNotFoundException, IOException;

    /**
     * 将目标文件以特定方式解密
     * @param desFile
     */
    void decode(File desFile) throws IOException;

    /**
     * 将文件内容打印出来
     * @param file
     */
    void printFile(File file);

    /**
     * 将数据写入文件
     * @param file
     * @param data
     */
    void writeData(File file,String data) throws IOException;

    /**
     * 根据正则表达式在查找对应文件
     * @param root
     * @param regex
     */
    void listFilesMatchRegex(File root,String regex);

    /**
     * 模糊查找
     * @param root
     * @param name
     */
    void listFilesMatchString(File root,String name);
}


