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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The list of errors returned when errors are encountered during the
 * BatchCreateAttendee and CreateAttendee actions. This includes external user
 * IDs, error codes, and error messages.
 * </p>
 */
public class CreateAttendeeError implements Serializable {
    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity
     * managed by a builder application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     */
    private String externalUserId;

    /**
     * <p>
     * The error code.
     * </p>
     */
    private String errorCode;

    /**
     * <p>
     * The error message.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity
     * managed by a builder application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @return <p>
     *         The Amazon Chime SDK external user ID. Links the attendee to an
     *         identity managed by a builder application.
     *         </p>
     */
    public String getExternalUserId() {
        return externalUserId;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity
     * managed by a builder application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @param externalUserId <p>
     *            The Amazon Chime SDK external user ID. Links the attendee to
     *            an identity managed by a builder application.
     *            </p>
     */
    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity
     * managed by a builder application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @param externalUserId <p>
     *            The Amazon Chime SDK external user ID. Links the attendee to
     *            an identity managed by a builder application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAttendeeError withExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     *
     * @return <p>
     *         The error code.
     *         </p>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     *
     * @param errorCode <p>
     *            The error code.
     *            </p>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCode <p>
     *            The error code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAttendeeError withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The error message.
     * </p>
     *
     * @return <p>
     *         The error message.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * The error message.
     * </p>
     *
     * @param errorMessage <p>
     *            The error message.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            The error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAttendeeError withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        if (getExternalUserId() != null)
            sb.append("ExternalUserId: " + getExternalUserId() + ",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExternalUserId() == null) ? 0 : getExternalUserId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAttendeeError == false)
            return false;
        CreateAttendeeError other = (CreateAttendeeError) obj;

        if (other.getExternalUserId() == null ^ this.getExternalUserId() == null)
            return false;
        if (other.getExternalUserId() != null
                && other.getExternalUserId().equals(this.getExternalUserId()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }
}
