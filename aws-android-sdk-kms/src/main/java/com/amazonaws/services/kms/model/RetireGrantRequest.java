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
 * Deletes a grant. Typically, you retire a grant when you no longer need its
 * permissions. To identify the grant to retire, use a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
 * >grant token</a>, or both the grant ID and a key identifier (key ID or key
 * ARN) of the KMS key. The <a>CreateGrant</a> operation returns both values.
 * </p>
 * <p>
 * This operation can be called by the <i>retiring principal</i> for a grant, by
 * the <i>grantee principal</i> if the grant allows the <code>RetireGrant</code>
 * operation, and by the Amazon Web Services account (root user) in which the
 * grant is created. It can also be called by principals to whom permission for
 * retiring a grant is delegated. For details, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#grant-delete"
 * >Retiring and revoking grants</a> in the <i>Key Management Service Developer
 * Guide</i>.
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
 * <b>Cross-account use</b>: Yes. You can retire a grant on a KMS key in a
 * different Amazon Web Services account.
 * </p>
 * <p>
 * <b>Required permissions:</b>:Permission to retire a grant is determined
 * primarily by the grant. For details, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#grant-delete"
 * >Retiring and revoking grants</a> in the <i>Key Management Service Developer
 * Guide</i>.
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
 * <a>RevokeGrant</a>
 * </p>
 * </li>
 * </ul>
 */
public class RetireGrantRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies the grant to be retired. You can use a grant token to identify
     * a new grant even before it has achieved eventual consistency.
     * </p>
     * <p>
     * Only the <a>CreateGrant</a> operation returns a grant token. For details,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     * >Grant token</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-eventual-consistency"
     * >Eventual consistency</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     */
    private String grantToken;

    /**
     * <p>
     * The key ARN KMS key associated with the grant. To find the key ARN, use
     * the <a>ListKeys</a> operation.
     * </p>
     * <p>
     * For example:
     * <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * Identifies the grant to retire. To get the grant ID, use
     * <a>CreateGrant</a>, <a>ListGrants</a>, or <a>ListRetirableGrants</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Grant ID Example -
     * 0123456789012345678901234567890123456789012345678901234567890123
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String grantId;

    /**
     * <p>
     * Identifies the grant to be retired. You can use a grant token to identify
     * a new grant even before it has achieved eventual consistency.
     * </p>
     * <p>
     * Only the <a>CreateGrant</a> operation returns a grant token. For details,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     * >Grant token</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-eventual-consistency"
     * >Eventual consistency</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @return <p>
     *         Identifies the grant to be retired. You can use a grant token to
     *         identify a new grant even before it has achieved eventual
     *         consistency.
     *         </p>
     *         <p>
     *         Only the <a>CreateGrant</a> operation returns a grant token. For
     *         details, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     *         >Grant token</a> and <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-eventual-consistency"
     *         >Eventual consistency</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     */
    public String getGrantToken() {
        return grantToken;
    }

    /**
     * <p>
     * Identifies the grant to be retired. You can use a grant token to identify
     * a new grant even before it has achieved eventual consistency.
     * </p>
     * <p>
     * Only the <a>CreateGrant</a> operation returns a grant token. For details,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     * >Grant token</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-eventual-consistency"
     * >Eventual consistency</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @param grantToken <p>
     *            Identifies the grant to be retired. You can use a grant token
     *            to identify a new grant even before it has achieved eventual
     *            consistency.
     *            </p>
     *            <p>
     *            Only the <a>CreateGrant</a> operation returns a grant token.
     *            For details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     *            >Grant token</a> and <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-eventual-consistency"
     *            >Eventual consistency</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     */
    public void setGrantToken(String grantToken) {
        this.grantToken = grantToken;
    }

    /**
     * <p>
     * Identifies the grant to be retired. You can use a grant token to identify
     * a new grant even before it has achieved eventual consistency.
     * </p>
     * <p>
     * Only the <a>CreateGrant</a> operation returns a grant token. For details,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     * >Grant token</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-eventual-consistency"
     * >Eventual consistency</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @param grantToken <p>
     *            Identifies the grant to be retired. You can use a grant token
     *            to identify a new grant even before it has achieved eventual
     *            consistency.
     *            </p>
     *            <p>
     *            Only the <a>CreateGrant</a> operation returns a grant token.
     *            For details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     *            >Grant token</a> and <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-eventual-consistency"
     *            >Eventual consistency</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RetireGrantRequest withGrantToken(String grantToken) {
        this.grantToken = grantToken;
        return this;
    }

    /**
     * <p>
     * The key ARN KMS key associated with the grant. To find the key ARN, use
     * the <a>ListKeys</a> operation.
     * </p>
     * <p>
     * For example:
     * <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The key ARN KMS key associated with the grant. To find the key
     *         ARN, use the <a>ListKeys</a> operation.
     *         </p>
     *         <p>
     *         For example:
     *         <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The key ARN KMS key associated with the grant. To find the key ARN, use
     * the <a>ListKeys</a> operation.
     * </p>
     * <p>
     * For example:
     * <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The key ARN KMS key associated with the grant. To find the key
     *            ARN, use the <a>ListKeys</a> operation.
     *            </p>
     *            <p>
     *            For example:
     *            <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The key ARN KMS key associated with the grant. To find the key ARN, use
     * the <a>ListKeys</a> operation.
     * </p>
     * <p>
     * For example:
     * <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The key ARN KMS key associated with the grant. To find the key
     *            ARN, use the <a>ListKeys</a> operation.
     *            </p>
     *            <p>
     *            For example:
     *            <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RetireGrantRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Identifies the grant to retire. To get the grant ID, use
     * <a>CreateGrant</a>, <a>ListGrants</a>, or <a>ListRetirableGrants</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Grant ID Example -
     * 0123456789012345678901234567890123456789012345678901234567890123
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         Identifies the grant to retire. To get the grant ID, use
     *         <a>CreateGrant</a>, <a>ListGrants</a>, or
     *         <a>ListRetirableGrants</a>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Grant ID Example -
     *         0123456789012345678901234567890123456789012345678901234567890123
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getGrantId() {
        return grantId;
    }

    /**
     * <p>
     * Identifies the grant to retire. To get the grant ID, use
     * <a>CreateGrant</a>, <a>ListGrants</a>, or <a>ListRetirableGrants</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Grant ID Example -
     * 0123456789012345678901234567890123456789012345678901234567890123
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId <p>
     *            Identifies the grant to retire. To get the grant ID, use
     *            <a>CreateGrant</a>, <a>ListGrants</a>, or
     *            <a>ListRetirableGrants</a>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Grant ID Example -
     *            0123456789012345678901234567890123456789012345678901234567890123
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }

    /**
     * <p>
     * Identifies the grant to retire. To get the grant ID, use
     * <a>CreateGrant</a>, <a>ListGrants</a>, or <a>ListRetirableGrants</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Grant ID Example -
     * 0123456789012345678901234567890123456789012345678901234567890123
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId <p>
     *            Identifies the grant to retire. To get the grant ID, use
     *            <a>CreateGrant</a>, <a>ListGrants</a>, or
     *            <a>ListRetirableGrants</a>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Grant ID Example -
     *            0123456789012345678901234567890123456789012345678901234567890123
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RetireGrantRequest withGrantId(String grantId) {
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
        if (getGrantToken() != null)
            sb.append("GrantToken: " + getGrantToken() + ",");
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

        hashCode = prime * hashCode + ((getGrantToken() == null) ? 0 : getGrantToken().hashCode());
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

        if (obj instanceof RetireGrantRequest == false)
            return false;
        RetireGrantRequest other = (RetireGrantRequest) obj;

        if (other.getGrantToken() == null ^ this.getGrantToken() == null)
            return false;
        if (other.getGrantToken() != null
                && other.getGrantToken().equals(this.getGrantToken()) == false)
            return false;
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
