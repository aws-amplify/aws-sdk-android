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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables an Amazon Macie master account to suspend or re-enable a member
 * account.
 * </p>
 */
public class UpdateMemberSessionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for the Amazon Macie resource or account that the
     * request applies to.
     * </p>
     */
    private String id;

    /**
     * <p>
     * Specifies the new status for the account. Valid values are: ENABLED,
     * resume all Amazon Macie activities for the account; and, PAUSED, suspend
     * all Macie activities for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     */
    private String status;

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource or account that the
     * request applies to.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the Amazon Macie resource or account
     *         that the request applies to.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource or account that the
     * request applies to.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the Amazon Macie resource or account
     *            that the request applies to.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource or account that the
     * request applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the Amazon Macie resource or account
     *            that the request applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMemberSessionRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Specifies the new status for the account. Valid values are: ENABLED,
     * resume all Amazon Macie activities for the account; and, PAUSED, suspend
     * all Macie activities for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @return <p>
     *         Specifies the new status for the account. Valid values are:
     *         ENABLED, resume all Amazon Macie activities for the account; and,
     *         PAUSED, suspend all Macie activities for the account.
     *         </p>
     * @see MacieStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies the new status for the account. Valid values are: ENABLED,
     * resume all Amazon Macie activities for the account; and, PAUSED, suspend
     * all Macie activities for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            Specifies the new status for the account. Valid values are:
     *            ENABLED, resume all Amazon Macie activities for the account;
     *            and, PAUSED, suspend all Macie activities for the account.
     *            </p>
     * @see MacieStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the new status for the account. Valid values are: ENABLED,
     * resume all Amazon Macie activities for the account; and, PAUSED, suspend
     * all Macie activities for the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            Specifies the new status for the account. Valid values are:
     *            ENABLED, resume all Amazon Macie activities for the account;
     *            and, PAUSED, suspend all Macie activities for the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MacieStatus
     */
    public UpdateMemberSessionRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies the new status for the account. Valid values are: ENABLED,
     * resume all Amazon Macie activities for the account; and, PAUSED, suspend
     * all Macie activities for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            Specifies the new status for the account. Valid values are:
     *            ENABLED, resume all Amazon Macie activities for the account;
     *            and, PAUSED, suspend all Macie activities for the account.
     *            </p>
     * @see MacieStatus
     */
    public void setStatus(MacieStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Specifies the new status for the account. Valid values are: ENABLED,
     * resume all Amazon Macie activities for the account; and, PAUSED, suspend
     * all Macie activities for the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            Specifies the new status for the account. Valid values are:
     *            ENABLED, resume all Amazon Macie activities for the account;
     *            and, PAUSED, suspend all Macie activities for the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MacieStatus
     */
    public UpdateMemberSessionRequest withStatus(MacieStatus status) {
        this.status = status.toString();
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMemberSessionRequest == false)
            return false;
        UpdateMemberSessionRequest other = (UpdateMemberSessionRequest) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
