/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Helper class that helps in creating and writing data to temporary files.
 */
public class FileUtils {

    /**
     * Returns a reference to the file created with the given file name in the
     * System's temporary directory.
     *
     * @param fileName
     * @return a reference to the file
     * @throws IOException
     */
    public static File createTempFileForTesting(String fileName) throws IOException {
        return File.createTempFile(String.valueOf(System.currentTimeMillis()),
                fileName);

    }

    /**
     * Creates a file with the given name in the System's temporary directory.
     * Adds the data to the given file and returns the reference to the file.
     *
     * @param fileName
     * @param data
     * @return reference to the file.
     * @throws IOException
     */
    public static File createTempFileForTesting(String fileName, String data)
            throws IOException {
        return appendDataToTempFile(File.createTempFile(
                String.valueOf(System.currentTimeMillis()), fileName), data);

    }

    /**
     * Appends the given data to the file specified in the input and returns the
     * reference to the file.
     *
     * @param file
     * @param dataToAppend
     * @return reference to the file.
     * @throws IOException
     */
    public static File appendDataToTempFile(File file, String dataToAppend)
            throws IOException {
        FileWriter outputWriter = new FileWriter(file);

        try {
            outputWriter.append(dataToAppend);
        } finally {
            outputWriter.close();
        }

        return file;
    }

}
