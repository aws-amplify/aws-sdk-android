/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public interface FileManager {
    public File createDirectory(final String directoryPath);

    public File getDirectory(final String directoryPath);

    public Set<File> listFilesInDirectory(final String directoryPath);

    public Set<File> listFilesInDirectory(final File directory);

    public File createFile(final String filepath) throws IOException;

    public File createFile(final File file) throws IOException;

    public boolean deleteFile(final String filepath);

    public boolean deleteFile(final File file);

    public InputStream newInputStream(final String filepath) throws FileNotFoundException;

    public InputStream newInputStream(final File file) throws FileNotFoundException;

    public OutputStream newOutputStream(final String filepath, final boolean append)
            throws FileNotFoundException;

    public OutputStream newOutputStream(final File file, final boolean append)
            throws FileNotFoundException;
}
