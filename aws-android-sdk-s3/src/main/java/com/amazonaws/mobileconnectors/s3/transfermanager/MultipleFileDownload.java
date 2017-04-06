/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.s3.transfermanager;

import java.io.IOException;

/**
 * Multiple file download of an entire virtual directory.
 * 
 * @deprecated The Transfer Manager is now deprecated in favor of the
 *             {@link com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility}
 */
@Deprecated
public interface MultipleFileDownload extends Transfer {

    /**
     * Returns the key prefix of the virtual directory being downloaded.
     */
    public String getKeyPrefix();

    /**
     * Returns the name of the bucket from which files are downloaded.
     */
    public String getBucketName();

    /**
     * Cancels this download.
     *
     * @throws IOException
     */
    public void abort() throws IOException;
}
