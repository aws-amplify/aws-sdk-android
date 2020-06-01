/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.fsx.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * You can't delete a backup while it's being used to restore a file system.
 * </p>
 */
public class BackupRestoringException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The ID of a file system being restored from the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     */
    private String fileSystemId;

    /**
     * Constructs a new BackupRestoringException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public BackupRestoringException(String message) {
        super(message);
    }

    /**
     * <p>
     * The ID of a file system being restored from the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         The ID of a file system being restored from the backup.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of a file system being restored from the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @param fileSystemId <p>
     *            The ID of a file system being restored from the backup.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }
}
