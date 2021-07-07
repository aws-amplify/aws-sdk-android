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

package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the account identifier for the specified access key ID.
 * </p>
 * <p>
 * Access keys consist of two parts: an access key ID (for example,
 * <code>AKIAIOSFODNN7EXAMPLE</code>) and a secret access key (for example,
 * <code>wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY</code>). For more information
 * about access keys, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html"
 * >Managing Access Keys for IAM Users</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * When you pass an access key ID to this operation, it returns the ID of the
 * Amazon Web Services account to which the keys belong. Access key IDs
 * beginning with <code>AKIA</code> are long-term credentials for an IAM user or
 * the Amazon Web Services account root user. Access key IDs beginning with
 * <code>ASIA</code> are temporary credentials that are created using STS
 * operations. If the account in the response belongs to you, you can sign in as
 * the root user and review your root user access keys. Then, you can pull a <a
 * href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_getting-report.html"
 * >credentials report</a> to learn which IAM user owns the keys. To learn who
 * requested the temporary credentials for an <code>ASIA</code> access key, view
 * the STS events in your <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html"
 * >CloudTrail logs</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * This operation does not indicate the state of the access key. The key might
 * be active, inactive, or deleted. Active keys might not have permissions to
 * perform an operation. Providing a deleted access key might return an error
 * that the key doesn't exist.
 * </p>
 */
public class GetAccessKeyInfoRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of an access key.
     * </p>
     * <p>
     * This parameter allows (through its regex pattern) a string of characters
     * that can consist of any upper- or lowercase letter or digit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String accessKeyId;

    /**
     * <p>
     * The identifier of an access key.
     * </p>
     * <p>
     * This parameter allows (through its regex pattern) a string of characters
     * that can consist of any upper- or lowercase letter or digit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return <p>
     *         The identifier of an access key.
     *         </p>
     *         <p>
     *         This parameter allows (through its regex pattern) a string of
     *         characters that can consist of any upper- or lowercase letter or
     *         digit.
     *         </p>
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * <p>
     * The identifier of an access key.
     * </p>
     * <p>
     * This parameter allows (through its regex pattern) a string of characters
     * that can consist of any upper- or lowercase letter or digit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param accessKeyId <p>
     *            The identifier of an access key.
     *            </p>
     *            <p>
     *            This parameter allows (through its regex pattern) a string of
     *            characters that can consist of any upper- or lowercase letter
     *            or digit.
     *            </p>
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The identifier of an access key.
     * </p>
     * <p>
     * This parameter allows (through its regex pattern) a string of characters
     * that can consist of any upper- or lowercase letter or digit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param accessKeyId <p>
     *            The identifier of an access key.
     *            </p>
     *            <p>
     *            This parameter allows (through its regex pattern) a string of
     *            characters that can consist of any upper- or lowercase letter
     *            or digit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccessKeyInfoRequest withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: " + getAccessKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessKeyInfoRequest == false)
            return false;
        GetAccessKeyInfoRequest other = (GetAccessKeyInfoRequest) obj;

        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null
                && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        return true;
    }
}
