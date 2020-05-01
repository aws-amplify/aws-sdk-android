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

package com.amazonaws.services.amazonelasticfilesystem.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Returned if the file system you are trying to create already exists, with the
 * creation token you provided.
 * </p>
 */
public class FileSystemAlreadyExistsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String errorCode;

    private String fileSystemId;

    /**
     * Constructs a new FileSystemAlreadyExistsException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public FileSystemAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * Returns the value of the errorCode property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The value of the errorCode property for this object.
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of errorCode
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param errorCode The new value for the errorCode property for this
     *            object.
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Returns the value of the fileSystemId property for this object.
     *
     * @return The value of the fileSystemId property for this object.
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * Sets the value of fileSystemId
     *
     * @param fileSystemId The new value for the fileSystemId property for this
     *            object.
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }
}
