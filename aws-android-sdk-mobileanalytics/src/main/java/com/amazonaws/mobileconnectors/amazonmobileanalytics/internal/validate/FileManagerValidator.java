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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.validate;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.FileManager;

import java.io.File;
import java.io.IOException;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class FileManagerValidator {

    public FileManagerValidator() {

    }

    public void validate(AnalyticsContext analyticsContext) {
        FileManager fileManager = analyticsContext.getSystem().getFileManager();
        boolean fileDeleted;
        File validatorFile;

        try {
            validatorFile = fileManager.createFile(new File(fileManager.getDirectory(""),
                    "validatorFile"));
        } catch (IOException e) {
            throw new RuntimeException("Encountered an error accessing the file system", e);
        }

        if (validatorFile == null) {
            throw new RuntimeException(
                    "Encountered an error accessing the file system, could not create files");
        }

        fileDeleted = fileManager.deleteFile(validatorFile);
        if (!fileDeleted) {
            throw new RuntimeException(
                    "Encountered an error accessing the file system, could not delete files");
        }
    }
}
