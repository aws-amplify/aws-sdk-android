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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * IAM access key details related to a finding.
 * </p>
 */
public class AwsIamAccessKeyDetails implements Serializable {
    /**
     * <p>
     * The user associated with the IAM access key related to a finding.
     * </p>
     * <p>
     * The <code>UserName</code> parameter has been replaced with the
     * <code>PrincipalName</code> parameter because access keys can also be
     * assigned to principals that are not IAM users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String userName;

    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String status;

    /**
     * <p>
     * The creation date/time of the IAM access key related to a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String createdAt;

    /**
     * <p>
     * The ID of the principal associated with an access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String principalId;

    /**
     * <p>
     * The type of principal associated with an access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String principalType;

    /**
     * <p>
     * The name of the principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String principalName;

    /**
     * <p>
     * The user associated with the IAM access key related to a finding.
     * </p>
     * <p>
     * The <code>UserName</code> parameter has been replaced with the
     * <code>PrincipalName</code> parameter because access keys can also be
     * assigned to principals that are not IAM users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The user associated with the IAM access key related to a finding.
     *         </p>
     *         <p>
     *         The <code>UserName</code> parameter has been replaced with the
     *         <code>PrincipalName</code> parameter because access keys can also
     *         be assigned to principals that are not IAM users.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The user associated with the IAM access key related to a finding.
     * </p>
     * <p>
     * The <code>UserName</code> parameter has been replaced with the
     * <code>PrincipalName</code> parameter because access keys can also be
     * assigned to principals that are not IAM users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param userName <p>
     *            The user associated with the IAM access key related to a
     *            finding.
     *            </p>
     *            <p>
     *            The <code>UserName</code> parameter has been replaced with the
     *            <code>PrincipalName</code> parameter because access keys can
     *            also be assigned to principals that are not IAM users.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user associated with the IAM access key related to a finding.
     * </p>
     * <p>
     * The <code>UserName</code> parameter has been replaced with the
     * <code>PrincipalName</code> parameter because access keys can also be
     * assigned to principals that are not IAM users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param userName <p>
     *            The user associated with the IAM access key related to a
     *            finding.
     *            </p>
     *            <p>
     *            The <code>UserName</code> parameter has been replaced with the
     *            <code>PrincipalName</code> parameter because access keys can
     *            also be assigned to principals that are not IAM users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsIamAccessKeyDetails withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return <p>
     *         The status of the IAM access key related to a finding.
     *         </p>
     * @see AwsIamAccessKeyStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the IAM access key related to a finding.
     *            </p>
     * @see AwsIamAccessKeyStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the IAM access key related to a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AwsIamAccessKeyStatus
     */
    public AwsIamAccessKeyDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the IAM access key related to a finding.
     *            </p>
     * @see AwsIamAccessKeyStatus
     */
    public void setStatus(AwsIamAccessKeyStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the IAM access key related to a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AwsIamAccessKeyStatus
     */
    public AwsIamAccessKeyDetails withStatus(AwsIamAccessKeyStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The creation date/time of the IAM access key related to a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The creation date/time of the IAM access key related to a
     *         finding.
     *         </p>
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The creation date/time of the IAM access key related to a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param createdAt <p>
     *            The creation date/time of the IAM access key related to a
     *            finding.
     *            </p>
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The creation date/time of the IAM access key related to a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param createdAt <p>
     *            The creation date/time of the IAM access key related to a
     *            finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsIamAccessKeyDetails withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The ID of the principal associated with an access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of the principal associated with an access key.
     *         </p>
     */
    public String getPrincipalId() {
        return principalId;
    }

    /**
     * <p>
     * The ID of the principal associated with an access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param principalId <p>
     *            The ID of the principal associated with an access key.
     *            </p>
     */
    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The ID of the principal associated with an access key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param principalId <p>
     *            The ID of the principal associated with an access key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsIamAccessKeyDetails withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * <p>
     * The type of principal associated with an access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The type of principal associated with an access key.
     *         </p>
     */
    public String getPrincipalType() {
        return principalType;
    }

    /**
     * <p>
     * The type of principal associated with an access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param principalType <p>
     *            The type of principal associated with an access key.
     *            </p>
     */
    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The type of principal associated with an access key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param principalType <p>
     *            The type of principal associated with an access key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsIamAccessKeyDetails withPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * <p>
     * The name of the principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the principal.
     *         </p>
     */
    public String getPrincipalName() {
        return principalName;
    }

    /**
     * <p>
     * The name of the principal.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param principalName <p>
     *            The name of the principal.
     *            </p>
     */
    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    /**
     * <p>
     * The name of the principal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param principalName <p>
     *            The name of the principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsIamAccessKeyDetails withPrincipalName(String principalName) {
        this.principalName = principalName;
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: " + getPrincipalId() + ",");
        if (getPrincipalType() != null)
            sb.append("PrincipalType: " + getPrincipalType() + ",");
        if (getPrincipalName() != null)
            sb.append("PrincipalName: " + getPrincipalName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode
                + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        hashCode = prime * hashCode
                + ((getPrincipalName() == null) ? 0 : getPrincipalName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsIamAccessKeyDetails == false)
            return false;
        AwsIamAccessKeyDetails other = (AwsIamAccessKeyDetails) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null
                && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getPrincipalType() == null ^ this.getPrincipalType() == null)
            return false;
        if (other.getPrincipalType() != null
                && other.getPrincipalType().equals(this.getPrincipalType()) == false)
            return false;
        if (other.getPrincipalName() == null ^ this.getPrincipalName() == null)
            return false;
        if (other.getPrincipalName() != null
                && other.getPrincipalName().equals(this.getPrincipalName()) == false)
            return false;
        return true;
    }
}
