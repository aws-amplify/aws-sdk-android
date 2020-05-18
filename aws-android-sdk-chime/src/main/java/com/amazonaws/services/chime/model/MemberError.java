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
 * The list of errors returned when a member action results in an error.
 * </p>
 */
public class MemberError implements Serializable {
    /**
     * <p>
     * The member ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String memberId;

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
     * The member ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The member ID.
     *         </p>
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * <p>
     * The member ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param memberId <p>
     *            The member ID.
     *            </p>
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The member ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param memberId <p>
     *            The member ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MemberError withMemberId(String memberId) {
        this.memberId = memberId;
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
    public MemberError withErrorCode(String errorCode) {
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
    public MemberError withErrorCode(ErrorCode errorCode) {
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
    public MemberError withErrorMessage(String errorMessage) {
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
        if (getMemberId() != null)
            sb.append("MemberId: " + getMemberId() + ",");
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

        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
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

        if (obj instanceof MemberError == false)
            return false;
        MemberError other = (MemberError) obj;

        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
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
