/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

/**
 * <p>
 * A list of failed member ARNs, error codes, and error messages.
 * </p>
 */
public class BatchCreateChannelMembershipError implements Serializable {
    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the member that the service
     * couldn't add.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String memberArn;

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BadRequest, Conflict, Forbidden, NotFound,
     * PreconditionFailed, ResourceLimitExceeded, ServiceFailure, AccessDenied,
     * ServiceUnavailable, Throttled, Throttling, Unauthorized, Unprocessable,
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
     * The <code>AppInstanceUserArn</code> of the member that the service
     * couldn't add.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The <code>AppInstanceUserArn</code> of the member that the
     *         service couldn't add.
     *         </p>
     */
    public String getMemberArn() {
        return memberArn;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the member that the service
     * couldn't add.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param memberArn <p>
     *            The <code>AppInstanceUserArn</code> of the member that the
     *            service couldn't add.
     *            </p>
     */
    public void setMemberArn(String memberArn) {
        this.memberArn = memberArn;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the member that the service
     * couldn't add.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param memberArn <p>
     *            The <code>AppInstanceUserArn</code> of the member that the
     *            service couldn't add.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateChannelMembershipError withMemberArn(String memberArn) {
        this.memberArn = memberArn;
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
     * ServiceUnavailable, Throttled, Throttling, Unauthorized, Unprocessable,
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
     * ServiceUnavailable, Throttled, Throttling, Unauthorized, Unprocessable,
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
     * ServiceUnavailable, Throttled, Throttling, Unauthorized, Unprocessable,
     * VoiceConnectorGroupAssociationsExist, PhoneNumberAssociationsExist
     *
     * @param errorCode <p>
     *            The error code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ErrorCode
     */
    public BatchCreateChannelMembershipError withErrorCode(String errorCode) {
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
     * ServiceUnavailable, Throttled, Throttling, Unauthorized, Unprocessable,
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
     * ServiceUnavailable, Throttled, Throttling, Unauthorized, Unprocessable,
     * VoiceConnectorGroupAssociationsExist, PhoneNumberAssociationsExist
     *
     * @param errorCode <p>
     *            The error code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ErrorCode
     */
    public BatchCreateChannelMembershipError withErrorCode(ErrorCode errorCode) {
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
    public BatchCreateChannelMembershipError withErrorMessage(String errorMessage) {
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
        if (getMemberArn() != null)
            sb.append("MemberArn: " + getMemberArn() + ",");
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

        hashCode = prime * hashCode + ((getMemberArn() == null) ? 0 : getMemberArn().hashCode());
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

        if (obj instanceof BatchCreateChannelMembershipError == false)
            return false;
        BatchCreateChannelMembershipError other = (BatchCreateChannelMembershipError) obj;

        if (other.getMemberArn() == null ^ this.getMemberArn() == null)
            return false;
        if (other.getMemberArn() != null
                && other.getMemberArn().equals(this.getMemberArn()) == false)
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
