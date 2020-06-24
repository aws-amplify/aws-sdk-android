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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Changes the status of the specified access key from Active to Inactive, or
 * vice versa. This operation can be used to disable a user's key as part of a
 * key rotation workflow.
 * </p>
 * <p>
 * If the <code>UserName</code> is not specified, the user name is determined
 * implicitly based on the AWS access key ID used to sign the request. This
 * operation works for access keys under the AWS account. Consequently, you can
 * use this operation to manage AWS account root user credentials even if the
 * AWS account has no associated users.
 * </p>
 * <p>
 * For information about rotating keys, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingCredentials.html"
 * >Managing Keys and Certificates</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class UpdateAccessKeyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the user whose key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The access key ID of the secret access key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String accessKeyId;

    /**
     * <p>
     * The status you want to assign to the secret access key.
     * <code>Active</code> means that the key can be used for API calls to AWS,
     * while <code>Inactive</code> means that the key cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String status;

    /**
     * <p>
     * The name of the user whose key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the user whose key you want to update.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of upper and lowercase
     *         alphanumeric characters with no spaces. You can also include any
     *         of the following characters: _+=,.@-
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name of the user whose key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the user whose key you want to update.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user whose key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the user whose key you want to update.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccessKeyRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The access key ID of the secret access key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The access key ID of the secret access key you want to update.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters that can consist of any upper or lowercased
     *         letter or digit.
     *         </p>
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * <p>
     * The access key ID of the secret access key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param accessKeyId <p>
     *            The access key ID of the secret access key you want to update.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters that can consist of any upper or
     *            lowercased letter or digit.
     *            </p>
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The access key ID of the secret access key you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
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
     *            The access key ID of the secret access key you want to update.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters that can consist of any upper or
     *            lowercased letter or digit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccessKeyRequest withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * <p>
     * The status you want to assign to the secret access key.
     * <code>Active</code> means that the key can be used for API calls to AWS,
     * while <code>Inactive</code> means that the key cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return <p>
     *         The status you want to assign to the secret access key.
     *         <code>Active</code> means that the key can be used for API calls
     *         to AWS, while <code>Inactive</code> means that the key cannot be
     *         used.
     *         </p>
     * @see StatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status you want to assign to the secret access key.
     * <code>Active</code> means that the key can be used for API calls to AWS,
     * while <code>Inactive</code> means that the key cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status you want to assign to the secret access key.
     *            <code>Active</code> means that the key can be used for API
     *            calls to AWS, while <code>Inactive</code> means that the key
     *            cannot be used.
     *            </p>
     * @see StatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status you want to assign to the secret access key.
     * <code>Active</code> means that the key can be used for API calls to AWS,
     * while <code>Inactive</code> means that the key cannot be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status you want to assign to the secret access key.
     *            <code>Active</code> means that the key can be used for API
     *            calls to AWS, while <code>Inactive</code> means that the key
     *            cannot be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public UpdateAccessKeyRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status you want to assign to the secret access key.
     * <code>Active</code> means that the key can be used for API calls to AWS,
     * while <code>Inactive</code> means that the key cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status you want to assign to the secret access key.
     *            <code>Active</code> means that the key can be used for API
     *            calls to AWS, while <code>Inactive</code> means that the key
     *            cannot be used.
     *            </p>
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status you want to assign to the secret access key.
     * <code>Active</code> means that the key can be used for API calls to AWS,
     * while <code>Inactive</code> means that the key cannot be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status you want to assign to the secret access key.
     *            <code>Active</code> means that the key can be used for API
     *            calls to AWS, while <code>Inactive</code> means that the key
     *            cannot be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public UpdateAccessKeyRequest withStatus(StatusType status) {
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: " + getAccessKeyId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccessKeyRequest == false)
            return false;
        UpdateAccessKeyRequest other = (UpdateAccessKeyRequest) obj;

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
        return true;
    }
}
