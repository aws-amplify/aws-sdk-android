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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates member accounts of the current AWS account by specifying a list of
 * AWS account IDs. The current AWS account can then invite these members to
 * manage GuardDuty in their accounts.
 * </p>
 */
public class CreateMembersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * associate member accounts with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * A list of account ID and email address pairs of the accounts that you
     * want to associate with the master GuardDuty account.
     * </p>
     */
    private java.util.List<AccountDetail> accountDetails;

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * associate member accounts with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The unique ID of the detector of the GuardDuty account that you
     *         want to associate member accounts with.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * associate member accounts with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector of the GuardDuty account that
     *            you want to associate member accounts with.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * associate member accounts with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector of the GuardDuty account that
     *            you want to associate member accounts with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMembersRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * A list of account ID and email address pairs of the accounts that you
     * want to associate with the master GuardDuty account.
     * </p>
     *
     * @return <p>
     *         A list of account ID and email address pairs of the accounts that
     *         you want to associate with the master GuardDuty account.
     *         </p>
     */
    public java.util.List<AccountDetail> getAccountDetails() {
        return accountDetails;
    }

    /**
     * <p>
     * A list of account ID and email address pairs of the accounts that you
     * want to associate with the master GuardDuty account.
     * </p>
     *
     * @param accountDetails <p>
     *            A list of account ID and email address pairs of the accounts
     *            that you want to associate with the master GuardDuty account.
     *            </p>
     */
    public void setAccountDetails(java.util.Collection<AccountDetail> accountDetails) {
        if (accountDetails == null) {
            this.accountDetails = null;
            return;
        }

        this.accountDetails = new java.util.ArrayList<AccountDetail>(accountDetails);
    }

    /**
     * <p>
     * A list of account ID and email address pairs of the accounts that you
     * want to associate with the master GuardDuty account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountDetails <p>
     *            A list of account ID and email address pairs of the accounts
     *            that you want to associate with the master GuardDuty account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMembersRequest withAccountDetails(AccountDetail... accountDetails) {
        if (getAccountDetails() == null) {
            this.accountDetails = new java.util.ArrayList<AccountDetail>(accountDetails.length);
        }
        for (AccountDetail value : accountDetails) {
            this.accountDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of account ID and email address pairs of the accounts that you
     * want to associate with the master GuardDuty account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountDetails <p>
     *            A list of account ID and email address pairs of the accounts
     *            that you want to associate with the master GuardDuty account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMembersRequest withAccountDetails(
            java.util.Collection<AccountDetail> accountDetails) {
        setAccountDetails(accountDetails);
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
        if (getAccountDetails() != null)
            sb.append("AccountDetails: " + getAccountDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode
                + ((getAccountDetails() == null) ? 0 : getAccountDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMembersRequest == false)
            return false;
        CreateMembersRequest other = (CreateMembersRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getAccountDetails() == null ^ this.getAccountDetails() == null)
            return false;
        if (other.getAccountDetails() != null
                && other.getAccountDetails().equals(this.getAccountDetails()) == false)
            return false;
        return true;
    }
}
