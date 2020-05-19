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
 * If the phone number action fails for one or more of the phone numbers in the
 * request, a list of the phone numbers is returned, along with error codes and
 * error messages.
 * </p>
 */
public class PhoneNumberError implements Serializable {
    /**
     * <p>
     * The phone number ID for which the action failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String phoneNumberId;

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BadRequest, Conflict, Forbidden, NotFound,
     * PreconditionFailed, ResourceLimitExceeded, ServiceFailure, AccessDenied,
     * ServiceUnavailable, Throttled, Unauthorized, Unprocessable,
     * VoiceConnectorGroupAssociationsExist, PhoneNumberAssociationsExist
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
     * The phone number ID for which the action failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The phone number ID for which the action failed.
     *         </p>
     */
    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    /**
     * <p>
     * The phone number ID for which the action failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param phoneNumberId <p>
     *            The phone number ID for which the action failed.
     *            </p>
     */
    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    /**
     * <p>
     * The phone number ID for which the action failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param phoneNumberId <p>
     *            The phone number ID for which the action failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberError withPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BadRequest, Conflict, Forbidden, NotFound,
     * PreconditionFailed, ResourceLimitExceeded, ServiceFailure, AccessDenied,
     * ServiceUnavailable, Throttled, Unauthorized, Unprocessable,
     * VoiceConnectorGroupAssociationsExist, PhoneNumberAssociationsExist
     *
     * @return <p>
     *         The error code.
     *         </p>
     * @see ErrorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BadRequest, Conflict, Forbidden, NotFound,
     * PreconditionFailed, ResourceLimitExceeded, ServiceFailure, AccessDenied,
     * ServiceUnavailable, Throttled, Unauthorized, Unprocessable,
     * VoiceConnectorGroupAssociationsExist, PhoneNumberAssociationsExist
     *
     * @param errorCode <p>
     *            The error code.
     *            </p>
     * @see ErrorCode
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BadRequest, Conflict, Forbidden, NotFound,
     * PreconditionFailed, ResourceLimitExceeded, ServiceFailure, AccessDenied,
     * ServiceUnavailable, Throttled, Unauthorized, Unprocessable,
     * VoiceConnectorGroupAssociationsExist, PhoneNumberAssociationsExist
     *
     * @param errorCode <p>
     *            The error code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ErrorCode
     */
    public PhoneNumberError withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BadRequest, Conflict, Forbidden, NotFound,
     * PreconditionFailed, ResourceLimitExceeded, ServiceFailure, AccessDenied,
     * ServiceUnavailable, Throttled, Unauthorized, Unprocessable,
     * VoiceConnectorGroupAssociationsExist, PhoneNumberAssociationsExist
     *
     * @param errorCode <p>
     *            The error code.
     *            </p>
     * @see ErrorCode
     */
    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
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
     * <b>Allowed Values: </b>BadRequest, Conflict, Forbidden, NotFound,
     * PreconditionFailed, ResourceLimitExceeded, ServiceFailure, AccessDenied,
     * ServiceUnavailable, Throttled, Unauthorized, Unprocessable,
     * VoiceConnectorGroupAssociationsExist, PhoneNumberAssociationsExist
     *
     * @param errorCode <p>
     *            The error code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ErrorCode
     */
    public PhoneNumberError withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
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
    public PhoneNumberError withErrorMessage(String errorMessage) {
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
        if (getPhoneNumberId() != null)
            sb.append("PhoneNumberId: " + getPhoneNumberId() + ",");
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
                + ((getPhoneNumberId() == null) ? 0 : getPhoneNumberId().hashCode());
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

        if (obj instanceof PhoneNumberError == false)
            return false;
        PhoneNumberError other = (PhoneNumberError) obj;

        if (other.getPhoneNumberId() == null ^ this.getPhoneNumberId() == null)
            return false;
        if (other.getPhoneNumberId() != null
                && other.getPhoneNumberId().equals(this.getPhoneNumberId()) == false)
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
