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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the specified grant. You revoke a grant to terminate the permissions
 * that the grant allows. For more information, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/managing-grants.html#grant-delete"
 * >Retiring and revoking grants</a> in the <i> <i>Key Management Service
 * Developer Guide</i> </i>.
 * </p>
 * <p>
 * When you create, retire, or revoke a grant, there might be a brief delay,
 * usually less than five minutes, until the grant is available throughout KMS.
 * This state is known as <i>eventual consistency</i>. For details, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-eventual-consistency"
 * >Eventual consistency</a> in the <i> <i>Key Management Service Developer
 * Guide</i> </i>.
 * </p>
 * <p>
 * For detailed information about grants, including grant terminology, see <a
 * href
 * ="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html">Using
 * grants</a> in the <i> <i>Key Management Service Developer Guide</i> </i>. For
 * examples of working with grants in several programming languages, see <a
 * href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-grants.html"
 * >Programming grants</a>.
 * </p>
 * <p>
 * <b>Cross-account use</b>: Yes. To perform this operation on a KMS key in a
 * different Amazon Web Services account, specify the key ARN in the value of
 * the <code>KeyId</code> parameter.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:RevokeGrant</a> (key policy).
 * </p>
 * <p>
 * <b>Related operations:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateGrant</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListGrants</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListRetirableGrants</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RetireGrant</a>
 * </p>
 * </li>
 * </ul>
 */
public class RevokeGrantRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique identifier for the KMS key associated with the grant. To get the
     * key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key. To specify a KMS key in a
     * different Amazon Web Services account, you must use the key ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * Identifies the grant to revoke. To get the grant ID, use
     * <a>CreateGrant</a>, <a>ListGrants</a>, or <a>ListRetirableGrants</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String grantId;

    /**
     * <p>
     * A unique identifier for the KMS key associated with the grant. To get the
     * key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key. To specify a KMS key in a
     * different Amazon Web Services account, you must use the key ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         A unique identifier for the KMS key associated with the grant. To
     *         get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     *         <a>DescribeKey</a>.
     *         </p>
     *         <p>
     *         Specify the key ID or key ARN of the KMS key. To specify a KMS
     *         key in a different Amazon Web Services account, you must use the
     *         key ARN.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN:
     *         <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a KMS key, use <a>ListKeys</a>
     *         or <a>DescribeKey</a>.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * A unique identifier for the KMS key associated with the grant. To get the
     * key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key. To specify a KMS key in a
     * different Amazon Web Services account, you must use the key ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            A unique identifier for the KMS key associated with the grant.
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of the KMS key. To specify a KMS
     *            key in a different Amazon Web Services account, you must use
     *            the key ARN.
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * A unique identifier for the KMS key associated with the grant. To get the
     * key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key. To specify a KMS key in a
     * different Amazon Web Services account, you must use the key ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            A unique identifier for the KMS key associated with the grant.
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of the KMS key. To specify a KMS
     *            key in a different Amazon Web Services account, you must use
     *            the key ARN.
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevokeGrantRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Identifies the grant to revoke. To get the grant ID, use
     * <a>CreateGrant</a>, <a>ListGrants</a>, or <a>ListRetirableGrants</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         Identifies the grant to revoke. To get the grant ID, use
     *         <a>CreateGrant</a>, <a>ListGrants</a>, or
     *         <a>ListRetirableGrants</a>.
     *         </p>
     */
    public String getGrantId() {
        return grantId;
    }

    /**
     * <p>
     * Identifies the grant to revoke. To get the grant ID, use
     * <a>CreateGrant</a>, <a>ListGrants</a>, or <a>ListRetirableGrants</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId <p>
     *            Identifies the grant to revoke. To get the grant ID, use
     *            <a>CreateGrant</a>, <a>ListGrants</a>, or
     *            <a>ListRetirableGrants</a>.
     *            </p>
     */
    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }

    /**
     * <p>
     * Identifies the grant to revoke. To get the grant ID, use
     * <a>CreateGrant</a>, <a>ListGrants</a>, or <a>ListRetirableGrants</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId <p>
     *            Identifies the grant to revoke. To get the grant ID, use
     *            <a>CreateGrant</a>, <a>ListGrants</a>, or
     *            <a>ListRetirableGrants</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevokeGrantRequest withGrantId(String grantId) {
        this.grantId = grantId;
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getGrantId() != null)
            sb.append("GrantId: " + getGrantId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getGrantId() == null) ? 0 : getGrantId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeGrantRequest == false)
            return false;
        RevokeGrantRequest other = (RevokeGrantRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getGrantId() == null ^ this.getGrantId() == null)
            return false;
        if (other.getGrantId() != null && other.getGrantId().equals(this.getGrantId()) == false)
            return false;
        return true;
    }
}
