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
 * An Active Directory error.
 * </p>
 */
public class ActiveDirectoryErrorException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The directory ID of the directory that an error pertains to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String activeDirectoryId;

    /**
     * <p>
     * The type of Active Directory error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOMAIN_NOT_FOUND, INCOMPATIBLE_DOMAIN_MODE,
     * WRONG_VPC, INVALID_DOMAIN_STAGE
     */
    private String type;

    /**
     * Constructs a new ActiveDirectoryErrorException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ActiveDirectoryErrorException(String message) {
        super(message);
    }

    /**
     * <p>
     * The directory ID of the directory that an error pertains to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return <p>
     *         The directory ID of the directory that an error pertains to.
     *         </p>
     */
    public String getActiveDirectoryId() {
        return activeDirectoryId;
    }

    /**
     * <p>
     * The directory ID of the directory that an error pertains to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param activeDirectoryId <p>
     *            The directory ID of the directory that an error pertains to.
     *            </p>
     */
    public void setActiveDirectoryId(String activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
    }

    /**
     * <p>
     * The type of Active Directory error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOMAIN_NOT_FOUND, INCOMPATIBLE_DOMAIN_MODE,
     * WRONG_VPC, INVALID_DOMAIN_STAGE
     *
     * @return <p>
     *         The type of Active Directory error.
     *         </p>
     * @see ActiveDirectoryErrorType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of Active Directory error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOMAIN_NOT_FOUND, INCOMPATIBLE_DOMAIN_MODE,
     * WRONG_VPC, INVALID_DOMAIN_STAGE
     *
     * @param type <p>
     *            The type of Active Directory error.
     *            </p>
     * @see ActiveDirectoryErrorType
     */
    public void setType(String type) {
        this.type = type;
    }
}
