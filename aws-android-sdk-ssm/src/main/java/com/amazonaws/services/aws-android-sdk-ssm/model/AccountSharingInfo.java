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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Information includes the AWS account ID where the current document is shared and the version shared with that account.</p>
 */
public class AccountSharingInfo implements Serializable {
    /**
     * <p>The AWS account ID where the current document is shared.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(?i)all|[0-9]{12}<br/>
     */
    private String accountId;

    /**
     * <p>The version of the current document shared with the account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8<br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|[$]ALL)<br/>
     */
    private String sharedDocumentVersion;

    /**
     * <p>The AWS account ID where the current document is shared.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(?i)all|[0-9]{12}<br/>
     *
     * @return <p>The AWS account ID where the current document is shared.</p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>The AWS account ID where the current document is shared.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(?i)all|[0-9]{12}<br/>
     *
     * @param accountId <p>The AWS account ID where the current document is shared.</p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>The AWS account ID where the current document is shared.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(?i)all|[0-9]{12}<br/>
     *
     * @param accountId <p>The AWS account ID where the current document is shared.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AccountSharingInfo withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>The version of the current document shared with the account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8<br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|[$]ALL)<br/>
     *
     * @return <p>The version of the current document shared with the account.</p>
     */
    public String getSharedDocumentVersion() {
        return sharedDocumentVersion;
    }

    /**
     * <p>The version of the current document shared with the account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8<br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|[$]ALL)<br/>
     *
     * @param sharedDocumentVersion <p>The version of the current document shared with the account.</p>
     */
    public void setSharedDocumentVersion(String sharedDocumentVersion) {
        this.sharedDocumentVersion = sharedDocumentVersion;
    }

    /**
     * <p>The version of the current document shared with the account.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8<br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|[$]ALL)<br/>
     *
     * @param sharedDocumentVersion <p>The version of the current document shared with the account.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AccountSharingInfo withSharedDocumentVersion(String sharedDocumentVersion) {
        this.sharedDocumentVersion = sharedDocumentVersion;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccountId() != null) sb.append("AccountId: " + getAccountId() + ",");
        if (getSharedDocumentVersion() != null) sb.append("SharedDocumentVersion: " + getSharedDocumentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getSharedDocumentVersion() == null) ? 0 : getSharedDocumentVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AccountSharingInfo == false) return false;
        AccountSharingInfo other = (AccountSharingInfo)obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false;
        if (other.getSharedDocumentVersion() == null ^ this.getSharedDocumentVersion() == null) return false;
        if (other.getSharedDocumentVersion() != null && other.getSharedDocumentVersion().equals(this.getSharedDocumentVersion()) == false) return false;
        return true;
    }
}
