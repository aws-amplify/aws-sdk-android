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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an AWS access key.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>CreateAccessKey</a>
 * and <a>ListAccessKeys</a> operations.
 * </p>
 * <note>
 * <p>
 * The <code>SecretAccessKey</code> value is returned only in response to
 * <a>CreateAccessKey</a>. You can get a secret access key only when you first
 * create an access key; you cannot recover the secret access key later. If you
 * lose a secret access key, you must create a new access key.
 * </p>
 * </note>
 */
public class AccessKey implements Serializable {
    /**
     * <p>
     * The name of the IAM user that the access key is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The ID for this access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String accessKeyId;

    /**
     * <p>
     * The status of the access key. <code>Active</code> means that the key is
     * valid for API calls, while <code>Inactive</code> means it is not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String status;

    /**
     * <p>
     * The secret key used to sign requests.
     * </p>
     */
    private String secretAccessKey;

    /**
     * <p>
     * The date when the access key was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The name of the IAM user that the access key is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the IAM user that the access key is associated with.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name of the IAM user that the access key is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the IAM user that the access key is associated
     *            with.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user that the access key is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the IAM user that the access key is associated
     *            with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessKey withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The ID for this access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The ID for this access key.
     *         </p>
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * <p>
     * The ID for this access key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param accessKeyId <p>
     *            The ID for this access key.
     *            </p>
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The ID for this access key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param accessKeyId <p>
     *            The ID for this access key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessKey withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * <p>
     * The status of the access key. <code>Active</code> means that the key is
     * valid for API calls, while <code>Inactive</code> means it is not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return <p>
     *         The status of the access key. <code>Active</code> means that the
     *         key is valid for API calls, while <code>Inactive</code> means it
     *         is not.
     *         </p>
     * @see StatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the access key. <code>Active</code> means that the key is
     * valid for API calls, while <code>Inactive</code> means it is not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the access key. <code>Active</code> means that
     *            the key is valid for API calls, while <code>Inactive</code>
     *            means it is not.
     *            </p>
     * @see StatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the access key. <code>Active</code> means that the key is
     * valid for API calls, while <code>Inactive</code> means it is not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the access key. <code>Active</code> means that
     *            the key is valid for API calls, while <code>Inactive</code>
     *            means it is not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public AccessKey withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the access key. <code>Active</code> means that the key is
     * valid for API calls, while <code>Inactive</code> means it is not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the access key. <code>Active</code> means that
     *            the key is valid for API calls, while <code>Inactive</code>
     *            means it is not.
     *            </p>
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the access key. <code>Active</code> means that the key is
     * valid for API calls, while <code>Inactive</code> means it is not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the access key. <code>Active</code> means that
     *            the key is valid for API calls, while <code>Inactive</code>
     *            means it is not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public AccessKey withStatus(StatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The secret key used to sign requests.
     * </p>
     *
     * @return <p>
     *         The secret key used to sign requests.
     *         </p>
     */
    public String getSecretAccessKey() {
        return secretAccessKey;
    }

    /**
     * <p>
     * The secret key used to sign requests.
     * </p>
     *
     * @param secretAccessKey <p>
     *            The secret key used to sign requests.
     *            </p>
     */
    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * <p>
     * The secret key used to sign requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secretAccessKey <p>
     *            The secret key used to sign requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessKey withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * <p>
     * The date when the access key was created.
     * </p>
     *
     * @return <p>
     *         The date when the access key was created.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date when the access key was created.
     * </p>
     *
     * @param createDate <p>
     *            The date when the access key was created.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date when the access key was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date when the access key was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessKey withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: " + getAccessKeyId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSecretAccessKey() != null)
            sb.append("SecretAccessKey: " + getSecretAccessKey() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode
                + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSecretAccessKey() == null) ? 0 : getSecretAccessKey().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessKey == false)
            return false;
        AccessKey other = (AccessKey) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null
                && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSecretAccessKey() == null ^ this.getSecretAccessKey() == null)
            return false;
        if (other.getSecretAccessKey() != null
                && other.getSecretAccessKey().equals(this.getSecretAccessKey()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        return true;
    }
}
