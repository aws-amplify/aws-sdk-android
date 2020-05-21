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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the error that's returned when you cannot delete a launch template
 * version.
 * </p>
 */
public class ResponseError implements Serializable {
    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>launchTemplateIdDoesNotExist,
     * launchTemplateIdMalformed, launchTemplateNameDoesNotExist,
     * launchTemplateNameMalformed, launchTemplateVersionDoesNotExist,
     * unexpectedError
     */
    private String code;

    /**
     * <p>
     * The error message, if applicable.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>launchTemplateIdDoesNotExist,
     * launchTemplateIdMalformed, launchTemplateNameDoesNotExist,
     * launchTemplateNameMalformed, launchTemplateVersionDoesNotExist,
     * unexpectedError
     *
     * @return <p>
     *         The error code.
     *         </p>
     * @see LaunchTemplateErrorCode
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>launchTemplateIdDoesNotExist,
     * launchTemplateIdMalformed, launchTemplateNameDoesNotExist,
     * launchTemplateNameMalformed, launchTemplateVersionDoesNotExist,
     * unexpectedError
     *
     * @param code <p>
     *            The error code.
     *            </p>
     * @see LaunchTemplateErrorCode
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>launchTemplateIdDoesNotExist,
     * launchTemplateIdMalformed, launchTemplateNameDoesNotExist,
     * launchTemplateNameMalformed, launchTemplateVersionDoesNotExist,
     * unexpectedError
     *
     * @param code <p>
     *            The error code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchTemplateErrorCode
     */
    public ResponseError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>launchTemplateIdDoesNotExist,
     * launchTemplateIdMalformed, launchTemplateNameDoesNotExist,
     * launchTemplateNameMalformed, launchTemplateVersionDoesNotExist,
     * unexpectedError
     *
     * @param code <p>
     *            The error code.
     *            </p>
     * @see LaunchTemplateErrorCode
     */
    public void setCode(LaunchTemplateErrorCode code) {
        this.code = code.toString();
    }

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>launchTemplateIdDoesNotExist,
     * launchTemplateIdMalformed, launchTemplateNameDoesNotExist,
     * launchTemplateNameMalformed, launchTemplateVersionDoesNotExist,
     * unexpectedError
     *
     * @param code <p>
     *            The error code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchTemplateErrorCode
     */
    public ResponseError withCode(LaunchTemplateErrorCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * The error message, if applicable.
     * </p>
     *
     * @return <p>
     *         The error message, if applicable.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The error message, if applicable.
     * </p>
     *
     * @param message <p>
     *            The error message, if applicable.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error message, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The error message, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResponseError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseError == false)
            return false;
        ResponseError other = (ResponseError) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
