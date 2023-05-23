/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Requested display language code is not supported.
 * </p>
 */
public class UnsupportedDisplayLanguageCodeException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Language code passed in with the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String displayLanguageCode;

    /**
     * Constructs a new UnsupportedDisplayLanguageCodeException with the
     * specified error message.
     *
     * @param message Describes the error encountered.
     */
    public UnsupportedDisplayLanguageCodeException(String message) {
        super(message);
    }

    /**
     * <p>
     * Language code passed in with the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         Language code passed in with the request.
     *         </p>
     */
    public String getDisplayLanguageCode() {
        return displayLanguageCode;
    }

    /**
     * <p>
     * Language code passed in with the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param displayLanguageCode <p>
     *            Language code passed in with the request.
     *            </p>
     */
    public void setDisplayLanguageCode(String displayLanguageCode) {
        this.displayLanguageCode = displayLanguageCode;
    }
}
