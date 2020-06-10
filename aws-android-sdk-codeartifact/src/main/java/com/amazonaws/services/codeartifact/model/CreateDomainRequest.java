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

package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a domain. CodeArtifact <i>domains</i> make it easier to manage
 * multiple repositories across an organization. You can use a domain to apply
 * permissions across many repositories owned by different AWS accounts. An
 * asset is stored only once in a domain, even if it's in multiple repositories.
 * </p>
 * <p>
 * Although you can have multiple domains, we recommend a single production
 * domain that contains all published artifacts so that your development teams
 * can find and share packages. You can use a second pre-production domain to
 * test changes to the production domain configuration.
 * </p>
 */
public class CreateDomainRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the domain to create. All domain names in an AWS Region that
     * are in the same AWS account must be unique. The domain name is used as
     * the prefix in DNS hostnames. Do not use sensitive information in a domain
     * name because it is publicly discoverable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     */
    private String domain;

    /**
     * <p>
     * The encryption key for the domain. This is used to encrypt content stored
     * in a domain. An encryption key can be a key ID, a key Amazon Resource
     * Name (ARN), a key alias, or a key alias ARN. To specify an
     * <code>encryptionKey</code>, your IAM role must have
     * <code>kms:DescribeKey</code> and <code>kms:CreateGrant</code> permissions
     * on the encryption key that is used. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestSyntax"
     * >DescribeKey</a> in the <i>AWS Key Management Service API Reference</i>
     * and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >AWS KMS API Permissions Reference</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * CodeArtifact supports only symmetric CMKs. Do not associate an asymmetric
     * CMK with your domain. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using symmetric and asymmetric keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     */
    private String encryptionKey;

    /**
     * <p>
     * The name of the domain to create. All domain names in an AWS Region that
     * are in the same AWS account must be unique. The domain name is used as
     * the prefix in DNS hostnames. Do not use sensitive information in a domain
     * name because it is publicly discoverable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @return <p>
     *         The name of the domain to create. All domain names in an AWS
     *         Region that are in the same AWS account must be unique. The
     *         domain name is used as the prefix in DNS hostnames. Do not use
     *         sensitive information in a domain name because it is publicly
     *         discoverable.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * The name of the domain to create. All domain names in an AWS Region that
     * are in the same AWS account must be unique. The domain name is used as
     * the prefix in DNS hostnames. Do not use sensitive information in a domain
     * name because it is publicly discoverable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param domain <p>
     *            The name of the domain to create. All domain names in an AWS
     *            Region that are in the same AWS account must be unique. The
     *            domain name is used as the prefix in DNS hostnames. Do not use
     *            sensitive information in a domain name because it is publicly
     *            discoverable.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain to create. All domain names in an AWS Region that
     * are in the same AWS account must be unique. The domain name is used as
     * the prefix in DNS hostnames. Do not use sensitive information in a domain
     * name because it is publicly discoverable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param domain <p>
     *            The name of the domain to create. All domain names in an AWS
     *            Region that are in the same AWS account must be unique. The
     *            domain name is used as the prefix in DNS hostnames. Do not use
     *            sensitive information in a domain name because it is publicly
     *            discoverable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p>
     * The encryption key for the domain. This is used to encrypt content stored
     * in a domain. An encryption key can be a key ID, a key Amazon Resource
     * Name (ARN), a key alias, or a key alias ARN. To specify an
     * <code>encryptionKey</code>, your IAM role must have
     * <code>kms:DescribeKey</code> and <code>kms:CreateGrant</code> permissions
     * on the encryption key that is used. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestSyntax"
     * >DescribeKey</a> in the <i>AWS Key Management Service API Reference</i>
     * and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >AWS KMS API Permissions Reference</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * CodeArtifact supports only symmetric CMKs. Do not associate an asymmetric
     * CMK with your domain. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using symmetric and asymmetric keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @return <p>
     *         The encryption key for the domain. This is used to encrypt
     *         content stored in a domain. An encryption key can be a key ID, a
     *         key Amazon Resource Name (ARN), a key alias, or a key alias ARN.
     *         To specify an <code>encryptionKey</code>, your IAM role must have
     *         <code>kms:DescribeKey</code> and <code>kms:CreateGrant</code>
     *         permissions on the encryption key that is used. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestSyntax"
     *         >DescribeKey</a> in the <i>AWS Key Management Service API
     *         Reference</i> and <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *         >AWS KMS API Permissions Reference</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     *         </p>
     *         <important>
     *         <p>
     *         CodeArtifact supports only symmetric CMKs. Do not associate an
     *         asymmetric CMK with your domain. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *         >Using symmetric and asymmetric keys</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     *         </p>
     *         </important>
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the domain. This is used to encrypt content stored
     * in a domain. An encryption key can be a key ID, a key Amazon Resource
     * Name (ARN), a key alias, or a key alias ARN. To specify an
     * <code>encryptionKey</code>, your IAM role must have
     * <code>kms:DescribeKey</code> and <code>kms:CreateGrant</code> permissions
     * on the encryption key that is used. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestSyntax"
     * >DescribeKey</a> in the <i>AWS Key Management Service API Reference</i>
     * and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >AWS KMS API Permissions Reference</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * CodeArtifact supports only symmetric CMKs. Do not associate an asymmetric
     * CMK with your domain. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using symmetric and asymmetric keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param encryptionKey <p>
     *            The encryption key for the domain. This is used to encrypt
     *            content stored in a domain. An encryption key can be a key ID,
     *            a key Amazon Resource Name (ARN), a key alias, or a key alias
     *            ARN. To specify an <code>encryptionKey</code>, your IAM role
     *            must have <code>kms:DescribeKey</code> and
     *            <code>kms:CreateGrant</code> permissions on the encryption key
     *            that is used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestSyntax"
     *            >DescribeKey</a> in the <i>AWS Key Management Service API
     *            Reference</i> and <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *            >AWS KMS API Permissions Reference</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     *            <important>
     *            <p>
     *            CodeArtifact supports only symmetric CMKs. Do not associate an
     *            asymmetric CMK with your domain. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *            >Using symmetric and asymmetric keys</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     *            </important>
     */
    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the domain. This is used to encrypt content stored
     * in a domain. An encryption key can be a key ID, a key Amazon Resource
     * Name (ARN), a key alias, or a key alias ARN. To specify an
     * <code>encryptionKey</code>, your IAM role must have
     * <code>kms:DescribeKey</code> and <code>kms:CreateGrant</code> permissions
     * on the encryption key that is used. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestSyntax"
     * >DescribeKey</a> in the <i>AWS Key Management Service API Reference</i>
     * and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >AWS KMS API Permissions Reference</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * CodeArtifact supports only symmetric CMKs. Do not associate an asymmetric
     * CMK with your domain. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using symmetric and asymmetric keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param encryptionKey <p>
     *            The encryption key for the domain. This is used to encrypt
     *            content stored in a domain. An encryption key can be a key ID,
     *            a key Amazon Resource Name (ARN), a key alias, or a key alias
     *            ARN. To specify an <code>encryptionKey</code>, your IAM role
     *            must have <code>kms:DescribeKey</code> and
     *            <code>kms:CreateGrant</code> permissions on the encryption key
     *            that is used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestSyntax"
     *            >DescribeKey</a> in the <i>AWS Key Management Service API
     *            Reference</i> and <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *            >AWS KMS API Permissions Reference</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     *            <important>
     *            <p>
     *            CodeArtifact supports only symmetric CMKs. Do not associate an
     *            asymmetric CMK with your domain. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *            >Using symmetric and asymmetric keys</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainRequest withEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
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
        if (getDomain() != null)
            sb.append("domain: " + getDomain() + ",");
        if (getEncryptionKey() != null)
            sb.append("encryptionKey: " + getEncryptionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainRequest == false)
            return false;
        CreateDomainRequest other = (CreateDomainRequest) obj;

        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null
                && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        return true;
    }
}
