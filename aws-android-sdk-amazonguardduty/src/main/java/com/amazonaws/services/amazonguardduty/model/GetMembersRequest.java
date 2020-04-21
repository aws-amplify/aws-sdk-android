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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves GuardDuty member accounts (to the current GuardDuty master account)
 * specified by the account IDs.
 * </p>
 */
public class GetMembersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account whose members you
     * want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * A list of account IDs of the GuardDuty member accounts that you want to
     * describe.
     * </p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account whose members you
     * want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The unique ID of the detector of the GuardDuty account whose
     *         members you want to retrieve.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account whose members you
     * want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector of the GuardDuty account whose
     *            members you want to retrieve.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account whose members you
     * want to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector of the GuardDuty account whose
     *            members you want to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMembersRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * A list of account IDs of the GuardDuty member accounts that you want to
     * describe.
     * </p>
     *
     * @return <p>
     *         A list of account IDs of the GuardDuty member accounts that you
     *         want to describe.
     *         </p>
     */
    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * A list of account IDs of the GuardDuty member accounts that you want to
     * describe.
     * </p>
     *
     * @param accountIds <p>
     *            A list of account IDs of the GuardDuty member accounts that
     *            you want to describe.
     *            </p>
     */
    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * A list of account IDs of the GuardDuty member accounts that you want to
     * describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIds <p>
     *            A list of account IDs of the GuardDuty member accounts that
     *            you want to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMembersRequest withAccountIds(String... accountIds) {
        if (getAccountIds() == null) {
            this.accountIds = new java.util.ArrayList<String>(accountIds.length);
        }
        for (String value : accountIds) {
            this.accountIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of account IDs of the GuardDuty member accounts that you want to
     * describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIds <p>
     *            A list of account IDs of the GuardDuty member accounts that
     *            you want to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMembersRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: " + getDetectorId() + ",");
        if (getAccountIds() != null)
            sb.append("AccountIds: " + getAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMembersRequest == false)
            return false;
        GetMembersRequest other = (GetMembersRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null
                && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        return true;
    }
}
