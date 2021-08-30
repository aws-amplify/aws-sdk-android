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

/**
 * <p>
 * Contains metadata about a KMS key.
 * </p>
 * <p>
 * This data type is used as a response element for the <a>CreateKey</a> and
 * <a>DescribeKey</a> operations.
 * </p>
 */
public class KeyMetadata implements Serializable {
    /**
     * <p>
     * The twelve-digit account ID of the Amazon Web Services account that owns
     * the KMS key.
     * </p>
     */
    private String aWSAccountId;

    /**
     * <p>
     * The globally unique identifier for the KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key. For examples, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     * >Key Management Service (KMS)</a> in the Example ARNs section of the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * <p>
     * The date and time when the KMS key was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * Specifies whether the KMS key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The description of the KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     */
    private String description;

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operations</a> for which you can use the KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     */
    private String keyUsage;

    /**
     * <p>
     * The current status of the KMS key.
     * </p>
     * <p>
     * For more information about how key state affects the use of a KMS key,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Enabled, Disabled, PendingDeletion,
     * PendingImport, PendingReplicaDeletion, Unavailable, Updating
     */
    private String keyState;

    /**
     * <p>
     * The date and time after which KMS deletes this KMS key. This value is
     * present only when the KMS key is scheduled for deletion, that is, when
     * its <code>KeyState</code> is <code>PendingDeletion</code>.
     * </p>
     * <p>
     * When the primary key in a multi-Region key is scheduled for deletion but
     * still has replica keys, its key state is
     * <code>PendingReplicaDeletion</code> and the length of its waiting period
     * is displayed in the <code>PendingDeletionWindowInDays</code> field.
     * </p>
     */
    private java.util.Date deletionDate;

    /**
     * <p>
     * The time at which the imported key material expires. When the key
     * material expires, KMS deletes the key material and the KMS key becomes
     * unusable. This value is present only for KMS keys whose
     * <code>Origin</code> is <code>EXTERNAL</code> and whose
     * <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>,
     * otherwise this value is omitted.
     * </p>
     */
    private java.util.Date validTo;

    /**
     * <p>
     * The source of the key material for the KMS key. When this value is
     * <code>AWS_KMS</code>, KMS created the key material. When this value is
     * <code>EXTERNAL</code>, the key material was imported or the KMS key
     * doesn't have any key material. When this value is
     * <code>AWS_CLOUDHSM</code>, the key material was created in the CloudHSM
     * cluster associated with a custom key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     */
    private String origin;

    /**
     * <p>
     * A unique identifier for the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> that contains the KMS key. This value is present
     * only when the KMS key is created in a custom key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String customKeyStoreId;

    /**
     * <p>
     * The cluster ID of the CloudHSM cluster that contains the key material for
     * the KMS key. When you create a KMS key in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>, KMS creates the key material for the KMS key in
     * the associated CloudHSM cluster. This value is present only when the KMS
     * key is created in a custom key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     */
    private String cloudHsmClusterId;

    /**
     * <p>
     * Specifies whether the KMS key's key material expires. This value is
     * present only when <code>Origin</code> is <code>EXTERNAL</code>, otherwise
     * this value is omitted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE
     */
    private String expirationModel;

    /**
     * <p>
     * The manager of the KMS key. KMS keys in your Amazon Web Services account
     * are either customer managed or Amazon Web Services managed. For more
     * information about the difference, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys"
     * >KMS keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS, CUSTOMER
     */
    private String keyManager;

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> field.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> fields
     * have the same value. We recommend that you use the <code>KeySpec</code>
     * field in your code. However, to avoid breaking changes, KMS will support
     * both fields.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     */
    private String customerMasterKeySpec;

    /**
     * <p>
     * Describes the type of key material in the KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     */
    private String keySpec;

    /**
     * <p>
     * The encryption algorithms that the KMS key supports. You cannot use the
     * KMS key with other encryption algorithms within KMS.
     * </p>
     * <p>
     * This value is present only when the <code>KeyUsage</code> of the KMS key
     * is <code>ENCRYPT_DECRYPT</code>.
     * </p>
     */
    private java.util.List<String> encryptionAlgorithms = new java.util.ArrayList<String>();

    /**
     * <p>
     * The signing algorithms that the KMS key supports. You cannot use the KMS
     * key with other signing algorithms within KMS.
     * </p>
     * <p>
     * This field appears only when the <code>KeyUsage</code> of the KMS key is
     * <code>SIGN_VERIFY</code>.
     * </p>
     */
    private java.util.List<String> signingAlgorithms = new java.util.ArrayList<String>();

    /**
     * <p>
     * Indicates whether the KMS key is a multi-Region (<code>True</code>) or
     * regional (<code>False</code>) key. This value is <code>True</code> for
     * multi-Region primary and replica keys and <code>False</code> for regional
     * KMS keys.
     * </p>
     * <p>
     * For more information about multi-Region keys, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     * >Using multi-Region keys</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private Boolean multiRegion;

    /**
     * <p>
     * Lists the primary and replica keys in same multi-Region key. This field
     * is present only when the value of the <code>MultiRegion</code> field is
     * <code>True</code>.
     * </p>
     * <p>
     * For more information about any listed KMS key, use the <a>DescribeKey</a>
     * operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MultiRegionKeyType</code> indicates whether the KMS key is a
     * <code>PRIMARY</code> or <code>REPLICA</code> key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PrimaryKey</code> displays the key ARN and Region of the primary
     * key. This field displays the current KMS key if it is the primary key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicaKeys</code> displays the key ARNs and Regions of all replica
     * keys. This field includes the current KMS key if it is a replica key.
     * </p>
     * </li>
     * </ul>
     */
    private MultiRegionConfiguration multiRegionConfiguration;

    /**
     * <p>
     * The waiting period before the primary key in a multi-Region key is
     * deleted. This waiting period begins when the last of its replica keys is
     * deleted. This value is present only when the <code>KeyState</code> of the
     * KMS key is <code>PendingReplicaDeletion</code>. That indicates that the
     * KMS key is the primary key in a multi-Region key, it is scheduled for
     * deletion, and it still has existing replica keys.
     * </p>
     * <p>
     * When a single-Region KMS key or a multi-Region replica key is scheduled
     * for deletion, its deletion date is displayed in the
     * <code>DeletionDate</code> field. However, when the primary key in a
     * multi-Region key is scheduled for deletion, its waiting period doesn't
     * begin until all of its replica keys are deleted. This value displays that
     * waiting period. When the last replica key in the multi-Region key is
     * deleted, the <code>KeyState</code> of the scheduled primary key changes
     * from <code>PendingReplicaDeletion</code> to <code>PendingDeletion</code>
     * and the deletion date appears in the <code>DeletionDate</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     */
    private Integer pendingDeletionWindowInDays;

    /**
     * <p>
     * The twelve-digit account ID of the Amazon Web Services account that owns
     * the KMS key.
     * </p>
     *
     * @return <p>
     *         The twelve-digit account ID of the Amazon Web Services account
     *         that owns the KMS key.
     *         </p>
     */
    public String getAWSAccountId() {
        return aWSAccountId;
    }

    /**
     * <p>
     * The twelve-digit account ID of the Amazon Web Services account that owns
     * the KMS key.
     * </p>
     *
     * @param aWSAccountId <p>
     *            The twelve-digit account ID of the Amazon Web Services account
     *            that owns the KMS key.
     *            </p>
     */
    public void setAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
    }

    /**
     * <p>
     * The twelve-digit account ID of the Amazon Web Services account that owns
     * the KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aWSAccountId <p>
     *            The twelve-digit account ID of the Amazon Web Services account
     *            that owns the KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
        return this;
    }

    /**
     * <p>
     * The globally unique identifier for the KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The globally unique identifier for the KMS key.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The globally unique identifier for the KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The globally unique identifier for the KMS key.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The globally unique identifier for the KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The globally unique identifier for the KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key. For examples, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     * >Key Management Service (KMS)</a> in the Example ARNs section of the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the KMS key. For examples, see
     *         <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     *         >Key Management Service (KMS)</a> in the Example ARNs section of
     *         the <i>Amazon Web Services General Reference</i>.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key. For examples, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     * >Key Management Service (KMS)</a> in the Example ARNs section of the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the KMS key. For examples,
     *            see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     *            >Key Management Service (KMS)</a> in the Example ARNs section
     *            of the <i>Amazon Web Services General Reference</i>.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key. For examples, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     * >Key Management Service (KMS)</a> in the Example ARNs section of the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the KMS key. For examples,
     *            see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     *            >Key Management Service (KMS)</a> in the Example ARNs section
     *            of the <i>Amazon Web Services General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The date and time when the KMS key was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the KMS key was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time when the KMS key was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time when the KMS key was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the KMS key was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time when the KMS key was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * Specifies whether the KMS key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     * </p>
     *
     * @return <p>
     *         Specifies whether the KMS key is enabled. When
     *         <code>KeyState</code> is <code>Enabled</code> this value is true,
     *         otherwise it is false.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether the KMS key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     * </p>
     *
     * @return <p>
     *         Specifies whether the KMS key is enabled. When
     *         <code>KeyState</code> is <code>Enabled</code> this value is true,
     *         otherwise it is false.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether the KMS key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether the KMS key is enabled. When
     *            <code>KeyState</code> is <code>Enabled</code> this value is
     *            true, otherwise it is false.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the KMS key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether the KMS key is enabled. When
     *            <code>KeyState</code> is <code>Enabled</code> this value is
     *            true, otherwise it is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The description of the KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @return <p>
     *         The description of the KMS key.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description <p>
     *            The description of the KMS key.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description <p>
     *            The description of the KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operations</a> for which you can use the KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @return <p>
     *         The <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *         >cryptographic operations</a> for which you can use the KMS key.
     *         </p>
     * @see KeyUsageType
     */
    public String getKeyUsage() {
        return keyUsage;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operations</a> for which you can use the KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *            >cryptographic operations</a> for which you can use the KMS
     *            key.
     *            </p>
     * @see KeyUsageType
     */
    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operations</a> for which you can use the KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *            >cryptographic operations</a> for which you can use the KMS
     *            key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyUsageType
     */
    public KeyMetadata withKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operations</a> for which you can use the KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *            >cryptographic operations</a> for which you can use the KMS
     *            key.
     *            </p>
     * @see KeyUsageType
     */
    public void setKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operations</a> for which you can use the KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *            >cryptographic operations</a> for which you can use the KMS
     *            key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyUsageType
     */
    public KeyMetadata withKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the KMS key.
     * </p>
     * <p>
     * For more information about how key state affects the use of a KMS key,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Enabled, Disabled, PendingDeletion,
     * PendingImport, PendingReplicaDeletion, Unavailable, Updating
     *
     * @return <p>
     *         The current status of the KMS key.
     *         </p>
     *         <p>
     *         For more information about how key state affects the use of a KMS
     *         key, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >Key state: Effect on your KMS key</a> in the <i>Key Management
     *         Service Developer Guide</i>.
     *         </p>
     * @see KeyState
     */
    public String getKeyState() {
        return keyState;
    }

    /**
     * <p>
     * The current status of the KMS key.
     * </p>
     * <p>
     * For more information about how key state affects the use of a KMS key,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Enabled, Disabled, PendingDeletion,
     * PendingImport, PendingReplicaDeletion, Unavailable, Updating
     *
     * @param keyState <p>
     *            The current status of the KMS key.
     *            </p>
     *            <p>
     *            For more information about how key state affects the use of a
     *            KMS key, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *            >Key state: Effect on your KMS key</a> in the <i>Key
     *            Management Service Developer Guide</i>.
     *            </p>
     * @see KeyState
     */
    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    /**
     * <p>
     * The current status of the KMS key.
     * </p>
     * <p>
     * For more information about how key state affects the use of a KMS key,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Enabled, Disabled, PendingDeletion,
     * PendingImport, PendingReplicaDeletion, Unavailable, Updating
     *
     * @param keyState <p>
     *            The current status of the KMS key.
     *            </p>
     *            <p>
     *            For more information about how key state affects the use of a
     *            KMS key, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *            >Key state: Effect on your KMS key</a> in the <i>Key
     *            Management Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyState
     */
    public KeyMetadata withKeyState(String keyState) {
        this.keyState = keyState;
        return this;
    }

    /**
     * <p>
     * The current status of the KMS key.
     * </p>
     * <p>
     * For more information about how key state affects the use of a KMS key,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Enabled, Disabled, PendingDeletion,
     * PendingImport, PendingReplicaDeletion, Unavailable, Updating
     *
     * @param keyState <p>
     *            The current status of the KMS key.
     *            </p>
     *            <p>
     *            For more information about how key state affects the use of a
     *            KMS key, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *            >Key state: Effect on your KMS key</a> in the <i>Key
     *            Management Service Developer Guide</i>.
     *            </p>
     * @see KeyState
     */
    public void setKeyState(KeyState keyState) {
        this.keyState = keyState.toString();
    }

    /**
     * <p>
     * The current status of the KMS key.
     * </p>
     * <p>
     * For more information about how key state affects the use of a KMS key,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Enabled, Disabled, PendingDeletion,
     * PendingImport, PendingReplicaDeletion, Unavailable, Updating
     *
     * @param keyState <p>
     *            The current status of the KMS key.
     *            </p>
     *            <p>
     *            For more information about how key state affects the use of a
     *            KMS key, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *            >Key state: Effect on your KMS key</a> in the <i>Key
     *            Management Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyState
     */
    public KeyMetadata withKeyState(KeyState keyState) {
        this.keyState = keyState.toString();
        return this;
    }

    /**
     * <p>
     * The date and time after which KMS deletes this KMS key. This value is
     * present only when the KMS key is scheduled for deletion, that is, when
     * its <code>KeyState</code> is <code>PendingDeletion</code>.
     * </p>
     * <p>
     * When the primary key in a multi-Region key is scheduled for deletion but
     * still has replica keys, its key state is
     * <code>PendingReplicaDeletion</code> and the length of its waiting period
     * is displayed in the <code>PendingDeletionWindowInDays</code> field.
     * </p>
     *
     * @return <p>
     *         The date and time after which KMS deletes this KMS key. This
     *         value is present only when the KMS key is scheduled for deletion,
     *         that is, when its <code>KeyState</code> is
     *         <code>PendingDeletion</code>.
     *         </p>
     *         <p>
     *         When the primary key in a multi-Region key is scheduled for
     *         deletion but still has replica keys, its key state is
     *         <code>PendingReplicaDeletion</code> and the length of its waiting
     *         period is displayed in the
     *         <code>PendingDeletionWindowInDays</code> field.
     *         </p>
     */
    public java.util.Date getDeletionDate() {
        return deletionDate;
    }

    /**
     * <p>
     * The date and time after which KMS deletes this KMS key. This value is
     * present only when the KMS key is scheduled for deletion, that is, when
     * its <code>KeyState</code> is <code>PendingDeletion</code>.
     * </p>
     * <p>
     * When the primary key in a multi-Region key is scheduled for deletion but
     * still has replica keys, its key state is
     * <code>PendingReplicaDeletion</code> and the length of its waiting period
     * is displayed in the <code>PendingDeletionWindowInDays</code> field.
     * </p>
     *
     * @param deletionDate <p>
     *            The date and time after which KMS deletes this KMS key. This
     *            value is present only when the KMS key is scheduled for
     *            deletion, that is, when its <code>KeyState</code> is
     *            <code>PendingDeletion</code>.
     *            </p>
     *            <p>
     *            When the primary key in a multi-Region key is scheduled for
     *            deletion but still has replica keys, its key state is
     *            <code>PendingReplicaDeletion</code> and the length of its
     *            waiting period is displayed in the
     *            <code>PendingDeletionWindowInDays</code> field.
     *            </p>
     */
    public void setDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
    }

    /**
     * <p>
     * The date and time after which KMS deletes this KMS key. This value is
     * present only when the KMS key is scheduled for deletion, that is, when
     * its <code>KeyState</code> is <code>PendingDeletion</code>.
     * </p>
     * <p>
     * When the primary key in a multi-Region key is scheduled for deletion but
     * still has replica keys, its key state is
     * <code>PendingReplicaDeletion</code> and the length of its waiting period
     * is displayed in the <code>PendingDeletionWindowInDays</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionDate <p>
     *            The date and time after which KMS deletes this KMS key. This
     *            value is present only when the KMS key is scheduled for
     *            deletion, that is, when its <code>KeyState</code> is
     *            <code>PendingDeletion</code>.
     *            </p>
     *            <p>
     *            When the primary key in a multi-Region key is scheduled for
     *            deletion but still has replica keys, its key state is
     *            <code>PendingReplicaDeletion</code> and the length of its
     *            waiting period is displayed in the
     *            <code>PendingDeletionWindowInDays</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
        return this;
    }

    /**
     * <p>
     * The time at which the imported key material expires. When the key
     * material expires, KMS deletes the key material and the KMS key becomes
     * unusable. This value is present only for KMS keys whose
     * <code>Origin</code> is <code>EXTERNAL</code> and whose
     * <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>,
     * otherwise this value is omitted.
     * </p>
     *
     * @return <p>
     *         The time at which the imported key material expires. When the key
     *         material expires, KMS deletes the key material and the KMS key
     *         becomes unusable. This value is present only for KMS keys whose
     *         <code>Origin</code> is <code>EXTERNAL</code> and whose
     *         <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>
     *         , otherwise this value is omitted.
     *         </p>
     */
    public java.util.Date getValidTo() {
        return validTo;
    }

    /**
     * <p>
     * The time at which the imported key material expires. When the key
     * material expires, KMS deletes the key material and the KMS key becomes
     * unusable. This value is present only for KMS keys whose
     * <code>Origin</code> is <code>EXTERNAL</code> and whose
     * <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>,
     * otherwise this value is omitted.
     * </p>
     *
     * @param validTo <p>
     *            The time at which the imported key material expires. When the
     *            key material expires, KMS deletes the key material and the KMS
     *            key becomes unusable. This value is present only for KMS keys
     *            whose <code>Origin</code> is <code>EXTERNAL</code> and whose
     *            <code>ExpirationModel</code> is
     *            <code>KEY_MATERIAL_EXPIRES</code>, otherwise this value is
     *            omitted.
     *            </p>
     */
    public void setValidTo(java.util.Date validTo) {
        this.validTo = validTo;
    }

    /**
     * <p>
     * The time at which the imported key material expires. When the key
     * material expires, KMS deletes the key material and the KMS key becomes
     * unusable. This value is present only for KMS keys whose
     * <code>Origin</code> is <code>EXTERNAL</code> and whose
     * <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>,
     * otherwise this value is omitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validTo <p>
     *            The time at which the imported key material expires. When the
     *            key material expires, KMS deletes the key material and the KMS
     *            key becomes unusable. This value is present only for KMS keys
     *            whose <code>Origin</code> is <code>EXTERNAL</code> and whose
     *            <code>ExpirationModel</code> is
     *            <code>KEY_MATERIAL_EXPIRES</code>, otherwise this value is
     *            omitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withValidTo(java.util.Date validTo) {
        this.validTo = validTo;
        return this;
    }

    /**
     * <p>
     * The source of the key material for the KMS key. When this value is
     * <code>AWS_KMS</code>, KMS created the key material. When this value is
     * <code>EXTERNAL</code>, the key material was imported or the KMS key
     * doesn't have any key material. When this value is
     * <code>AWS_CLOUDHSM</code>, the key material was created in the CloudHSM
     * cluster associated with a custom key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @return <p>
     *         The source of the key material for the KMS key. When this value
     *         is <code>AWS_KMS</code>, KMS created the key material. When this
     *         value is <code>EXTERNAL</code>, the key material was imported or
     *         the KMS key doesn't have any key material. When this value is
     *         <code>AWS_CLOUDHSM</code>, the key material was created in the
     *         CloudHSM cluster associated with a custom key store.
     *         </p>
     * @see OriginType
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * <p>
     * The source of the key material for the KMS key. When this value is
     * <code>AWS_KMS</code>, KMS created the key material. When this value is
     * <code>EXTERNAL</code>, the key material was imported or the KMS key
     * doesn't have any key material. When this value is
     * <code>AWS_CLOUDHSM</code>, the key material was created in the CloudHSM
     * cluster associated with a custom key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @param origin <p>
     *            The source of the key material for the KMS key. When this
     *            value is <code>AWS_KMS</code>, KMS created the key material.
     *            When this value is <code>EXTERNAL</code>, the key material was
     *            imported or the KMS key doesn't have any key material. When
     *            this value is <code>AWS_CLOUDHSM</code>, the key material was
     *            created in the CloudHSM cluster associated with a custom key
     *            store.
     *            </p>
     * @see OriginType
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * The source of the key material for the KMS key. When this value is
     * <code>AWS_KMS</code>, KMS created the key material. When this value is
     * <code>EXTERNAL</code>, the key material was imported or the KMS key
     * doesn't have any key material. When this value is
     * <code>AWS_CLOUDHSM</code>, the key material was created in the CloudHSM
     * cluster associated with a custom key store.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @param origin <p>
     *            The source of the key material for the KMS key. When this
     *            value is <code>AWS_KMS</code>, KMS created the key material.
     *            When this value is <code>EXTERNAL</code>, the key material was
     *            imported or the KMS key doesn't have any key material. When
     *            this value is <code>AWS_CLOUDHSM</code>, the key material was
     *            created in the CloudHSM cluster associated with a custom key
     *            store.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OriginType
     */
    public KeyMetadata withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * <p>
     * The source of the key material for the KMS key. When this value is
     * <code>AWS_KMS</code>, KMS created the key material. When this value is
     * <code>EXTERNAL</code>, the key material was imported or the KMS key
     * doesn't have any key material. When this value is
     * <code>AWS_CLOUDHSM</code>, the key material was created in the CloudHSM
     * cluster associated with a custom key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @param origin <p>
     *            The source of the key material for the KMS key. When this
     *            value is <code>AWS_KMS</code>, KMS created the key material.
     *            When this value is <code>EXTERNAL</code>, the key material was
     *            imported or the KMS key doesn't have any key material. When
     *            this value is <code>AWS_CLOUDHSM</code>, the key material was
     *            created in the CloudHSM cluster associated with a custom key
     *            store.
     *            </p>
     * @see OriginType
     */
    public void setOrigin(OriginType origin) {
        this.origin = origin.toString();
    }

    /**
     * <p>
     * The source of the key material for the KMS key. When this value is
     * <code>AWS_KMS</code>, KMS created the key material. When this value is
     * <code>EXTERNAL</code>, the key material was imported or the KMS key
     * doesn't have any key material. When this value is
     * <code>AWS_CLOUDHSM</code>, the key material was created in the CloudHSM
     * cluster associated with a custom key store.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @param origin <p>
     *            The source of the key material for the KMS key. When this
     *            value is <code>AWS_KMS</code>, KMS created the key material.
     *            When this value is <code>EXTERNAL</code>, the key material was
     *            imported or the KMS key doesn't have any key material. When
     *            this value is <code>AWS_CLOUDHSM</code>, the key material was
     *            created in the CloudHSM cluster associated with a custom key
     *            store.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OriginType
     */
    public KeyMetadata withOrigin(OriginType origin) {
        this.origin = origin.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> that contains the KMS key. This value is present
     * only when the KMS key is created in a custom key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         A unique identifier for the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *         >custom key store</a> that contains the KMS key. This value is
     *         present only when the KMS key is created in a custom key store.
     *         </p>
     */
    public String getCustomKeyStoreId() {
        return customKeyStoreId;
    }

    /**
     * <p>
     * A unique identifier for the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> that contains the KMS key. This value is present
     * only when the KMS key is created in a custom key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            A unique identifier for the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a> that contains the KMS key. This value is
     *            present only when the KMS key is created in a custom key
     *            store.
     *            </p>
     */
    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * A unique identifier for the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> that contains the KMS key. This value is present
     * only when the KMS key is created in a custom key store.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            A unique identifier for the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a> that contains the KMS key. This value is
     *            present only when the KMS key is created in a custom key
     *            store.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
        return this;
    }

    /**
     * <p>
     * The cluster ID of the CloudHSM cluster that contains the key material for
     * the KMS key. When you create a KMS key in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>, KMS creates the key material for the KMS key in
     * the associated CloudHSM cluster. This value is present only when the KMS
     * key is created in a custom key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     *
     * @return <p>
     *         The cluster ID of the CloudHSM cluster that contains the key
     *         material for the KMS key. When you create a KMS key in a <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *         >custom key store</a>, KMS creates the key material for the KMS
     *         key in the associated CloudHSM cluster. This value is present
     *         only when the KMS key is created in a custom key store.
     *         </p>
     */
    public String getCloudHsmClusterId() {
        return cloudHsmClusterId;
    }

    /**
     * <p>
     * The cluster ID of the CloudHSM cluster that contains the key material for
     * the KMS key. When you create a KMS key in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>, KMS creates the key material for the KMS key in
     * the associated CloudHSM cluster. This value is present only when the KMS
     * key is created in a custom key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     *
     * @param cloudHsmClusterId <p>
     *            The cluster ID of the CloudHSM cluster that contains the key
     *            material for the KMS key. When you create a KMS key in a <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a>, KMS creates the key material for the
     *            KMS key in the associated CloudHSM cluster. This value is
     *            present only when the KMS key is created in a custom key
     *            store.
     *            </p>
     */
    public void setCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
    }

    /**
     * <p>
     * The cluster ID of the CloudHSM cluster that contains the key material for
     * the KMS key. When you create a KMS key in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>, KMS creates the key material for the KMS key in
     * the associated CloudHSM cluster. This value is present only when the KMS
     * key is created in a custom key store.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 24<br/>
     *
     * @param cloudHsmClusterId <p>
     *            The cluster ID of the CloudHSM cluster that contains the key
     *            material for the KMS key. When you create a KMS key in a <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a>, KMS creates the key material for the
     *            KMS key in the associated CloudHSM cluster. This value is
     *            present only when the KMS key is created in a custom key
     *            store.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
        return this;
    }

    /**
     * <p>
     * Specifies whether the KMS key's key material expires. This value is
     * present only when <code>Origin</code> is <code>EXTERNAL</code>, otherwise
     * this value is omitted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE
     *
     * @return <p>
     *         Specifies whether the KMS key's key material expires. This value
     *         is present only when <code>Origin</code> is <code>EXTERNAL</code>
     *         , otherwise this value is omitted.
     *         </p>
     * @see ExpirationModelType
     */
    public String getExpirationModel() {
        return expirationModel;
    }

    /**
     * <p>
     * Specifies whether the KMS key's key material expires. This value is
     * present only when <code>Origin</code> is <code>EXTERNAL</code>, otherwise
     * this value is omitted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE
     *
     * @param expirationModel <p>
     *            Specifies whether the KMS key's key material expires. This
     *            value is present only when <code>Origin</code> is
     *            <code>EXTERNAL</code>, otherwise this value is omitted.
     *            </p>
     * @see ExpirationModelType
     */
    public void setExpirationModel(String expirationModel) {
        this.expirationModel = expirationModel;
    }

    /**
     * <p>
     * Specifies whether the KMS key's key material expires. This value is
     * present only when <code>Origin</code> is <code>EXTERNAL</code>, otherwise
     * this value is omitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE
     *
     * @param expirationModel <p>
     *            Specifies whether the KMS key's key material expires. This
     *            value is present only when <code>Origin</code> is
     *            <code>EXTERNAL</code>, otherwise this value is omitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExpirationModelType
     */
    public KeyMetadata withExpirationModel(String expirationModel) {
        this.expirationModel = expirationModel;
        return this;
    }

    /**
     * <p>
     * Specifies whether the KMS key's key material expires. This value is
     * present only when <code>Origin</code> is <code>EXTERNAL</code>, otherwise
     * this value is omitted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE
     *
     * @param expirationModel <p>
     *            Specifies whether the KMS key's key material expires. This
     *            value is present only when <code>Origin</code> is
     *            <code>EXTERNAL</code>, otherwise this value is omitted.
     *            </p>
     * @see ExpirationModelType
     */
    public void setExpirationModel(ExpirationModelType expirationModel) {
        this.expirationModel = expirationModel.toString();
    }

    /**
     * <p>
     * Specifies whether the KMS key's key material expires. This value is
     * present only when <code>Origin</code> is <code>EXTERNAL</code>, otherwise
     * this value is omitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE
     *
     * @param expirationModel <p>
     *            Specifies whether the KMS key's key material expires. This
     *            value is present only when <code>Origin</code> is
     *            <code>EXTERNAL</code>, otherwise this value is omitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExpirationModelType
     */
    public KeyMetadata withExpirationModel(ExpirationModelType expirationModel) {
        this.expirationModel = expirationModel.toString();
        return this;
    }

    /**
     * <p>
     * The manager of the KMS key. KMS keys in your Amazon Web Services account
     * are either customer managed or Amazon Web Services managed. For more
     * information about the difference, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys"
     * >KMS keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS, CUSTOMER
     *
     * @return <p>
     *         The manager of the KMS key. KMS keys in your Amazon Web Services
     *         account are either customer managed or Amazon Web Services
     *         managed. For more information about the difference, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys"
     *         >KMS keys</a> in the <i>Key Management Service Developer
     *         Guide</i>.
     *         </p>
     * @see KeyManagerType
     */
    public String getKeyManager() {
        return keyManager;
    }

    /**
     * <p>
     * The manager of the KMS key. KMS keys in your Amazon Web Services account
     * are either customer managed or Amazon Web Services managed. For more
     * information about the difference, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys"
     * >KMS keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS, CUSTOMER
     *
     * @param keyManager <p>
     *            The manager of the KMS key. KMS keys in your Amazon Web
     *            Services account are either customer managed or Amazon Web
     *            Services managed. For more information about the difference,
     *            see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys"
     *            >KMS keys</a> in the <i>Key Management Service Developer
     *            Guide</i>.
     *            </p>
     * @see KeyManagerType
     */
    public void setKeyManager(String keyManager) {
        this.keyManager = keyManager;
    }

    /**
     * <p>
     * The manager of the KMS key. KMS keys in your Amazon Web Services account
     * are either customer managed or Amazon Web Services managed. For more
     * information about the difference, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys"
     * >KMS keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS, CUSTOMER
     *
     * @param keyManager <p>
     *            The manager of the KMS key. KMS keys in your Amazon Web
     *            Services account are either customer managed or Amazon Web
     *            Services managed. For more information about the difference,
     *            see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys"
     *            >KMS keys</a> in the <i>Key Management Service Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyManagerType
     */
    public KeyMetadata withKeyManager(String keyManager) {
        this.keyManager = keyManager;
        return this;
    }

    /**
     * <p>
     * The manager of the KMS key. KMS keys in your Amazon Web Services account
     * are either customer managed or Amazon Web Services managed. For more
     * information about the difference, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys"
     * >KMS keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS, CUSTOMER
     *
     * @param keyManager <p>
     *            The manager of the KMS key. KMS keys in your Amazon Web
     *            Services account are either customer managed or Amazon Web
     *            Services managed. For more information about the difference,
     *            see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys"
     *            >KMS keys</a> in the <i>Key Management Service Developer
     *            Guide</i>.
     *            </p>
     * @see KeyManagerType
     */
    public void setKeyManager(KeyManagerType keyManager) {
        this.keyManager = keyManager.toString();
    }

    /**
     * <p>
     * The manager of the KMS key. KMS keys in your Amazon Web Services account
     * are either customer managed or Amazon Web Services managed. For more
     * information about the difference, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys"
     * >KMS keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS, CUSTOMER
     *
     * @param keyManager <p>
     *            The manager of the KMS key. KMS keys in your Amazon Web
     *            Services account are either customer managed or Amazon Web
     *            Services managed. For more information about the difference,
     *            see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys"
     *            >KMS keys</a> in the <i>Key Management Service Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyManagerType
     */
    public KeyMetadata withKeyManager(KeyManagerType keyManager) {
        this.keyManager = keyManager.toString();
        return this;
    }

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> field.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> fields
     * have the same value. We recommend that you use the <code>KeySpec</code>
     * field in your code. However, to avoid breaking changes, KMS will support
     * both fields.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @return <p>
     *         Instead, use the <code>KeySpec</code> field.
     *         </p>
     *         <p>
     *         The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code>
     *         fields have the same value. We recommend that you use the
     *         <code>KeySpec</code> field in your code. However, to avoid
     *         breaking changes, KMS will support both fields.
     *         </p>
     * @see CustomerMasterKeySpec
     */
    public String getCustomerMasterKeySpec() {
        return customerMasterKeySpec;
    }

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> field.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> fields
     * have the same value. We recommend that you use the <code>KeySpec</code>
     * field in your code. However, to avoid breaking changes, KMS will support
     * both fields.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param customerMasterKeySpec <p>
     *            Instead, use the <code>KeySpec</code> field.
     *            </p>
     *            <p>
     *            The <code>KeySpec</code> and
     *            <code>CustomerMasterKeySpec</code> fields have the same value.
     *            We recommend that you use the <code>KeySpec</code> field in
     *            your code. However, to avoid breaking changes, KMS will
     *            support both fields.
     *            </p>
     * @see CustomerMasterKeySpec
     */
    public void setCustomerMasterKeySpec(String customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec;
    }

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> field.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> fields
     * have the same value. We recommend that you use the <code>KeySpec</code>
     * field in your code. However, to avoid breaking changes, KMS will support
     * both fields.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param customerMasterKeySpec <p>
     *            Instead, use the <code>KeySpec</code> field.
     *            </p>
     *            <p>
     *            The <code>KeySpec</code> and
     *            <code>CustomerMasterKeySpec</code> fields have the same value.
     *            We recommend that you use the <code>KeySpec</code> field in
     *            your code. However, to avoid breaking changes, KMS will
     *            support both fields.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomerMasterKeySpec
     */
    public KeyMetadata withCustomerMasterKeySpec(String customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec;
        return this;
    }

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> field.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> fields
     * have the same value. We recommend that you use the <code>KeySpec</code>
     * field in your code. However, to avoid breaking changes, KMS will support
     * both fields.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param customerMasterKeySpec <p>
     *            Instead, use the <code>KeySpec</code> field.
     *            </p>
     *            <p>
     *            The <code>KeySpec</code> and
     *            <code>CustomerMasterKeySpec</code> fields have the same value.
     *            We recommend that you use the <code>KeySpec</code> field in
     *            your code. However, to avoid breaking changes, KMS will
     *            support both fields.
     *            </p>
     * @see CustomerMasterKeySpec
     */
    public void setCustomerMasterKeySpec(CustomerMasterKeySpec customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec.toString();
    }

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> field.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> fields
     * have the same value. We recommend that you use the <code>KeySpec</code>
     * field in your code. However, to avoid breaking changes, KMS will support
     * both fields.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param customerMasterKeySpec <p>
     *            Instead, use the <code>KeySpec</code> field.
     *            </p>
     *            <p>
     *            The <code>KeySpec</code> and
     *            <code>CustomerMasterKeySpec</code> fields have the same value.
     *            We recommend that you use the <code>KeySpec</code> field in
     *            your code. However, to avoid breaking changes, KMS will
     *            support both fields.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomerMasterKeySpec
     */
    public KeyMetadata withCustomerMasterKeySpec(CustomerMasterKeySpec customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec.toString();
        return this;
    }

    /**
     * <p>
     * Describes the type of key material in the KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @return <p>
     *         Describes the type of key material in the KMS key.
     *         </p>
     * @see KeySpec
     */
    public String getKeySpec() {
        return keySpec;
    }

    /**
     * <p>
     * Describes the type of key material in the KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param keySpec <p>
     *            Describes the type of key material in the KMS key.
     *            </p>
     * @see KeySpec
     */
    public void setKeySpec(String keySpec) {
        this.keySpec = keySpec;
    }

    /**
     * <p>
     * Describes the type of key material in the KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param keySpec <p>
     *            Describes the type of key material in the KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeySpec
     */
    public KeyMetadata withKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }

    /**
     * <p>
     * Describes the type of key material in the KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param keySpec <p>
     *            Describes the type of key material in the KMS key.
     *            </p>
     * @see KeySpec
     */
    public void setKeySpec(KeySpec keySpec) {
        this.keySpec = keySpec.toString();
    }

    /**
     * <p>
     * Describes the type of key material in the KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param keySpec <p>
     *            Describes the type of key material in the KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeySpec
     */
    public KeyMetadata withKeySpec(KeySpec keySpec) {
        this.keySpec = keySpec.toString();
        return this;
    }

    /**
     * <p>
     * The encryption algorithms that the KMS key supports. You cannot use the
     * KMS key with other encryption algorithms within KMS.
     * </p>
     * <p>
     * This value is present only when the <code>KeyUsage</code> of the KMS key
     * is <code>ENCRYPT_DECRYPT</code>.
     * </p>
     *
     * @return <p>
     *         The encryption algorithms that the KMS key supports. You cannot
     *         use the KMS key with other encryption algorithms within KMS.
     *         </p>
     *         <p>
     *         This value is present only when the <code>KeyUsage</code> of the
     *         KMS key is <code>ENCRYPT_DECRYPT</code>.
     *         </p>
     */
    public java.util.List<String> getEncryptionAlgorithms() {
        return encryptionAlgorithms;
    }

    /**
     * <p>
     * The encryption algorithms that the KMS key supports. You cannot use the
     * KMS key with other encryption algorithms within KMS.
     * </p>
     * <p>
     * This value is present only when the <code>KeyUsage</code> of the KMS key
     * is <code>ENCRYPT_DECRYPT</code>.
     * </p>
     *
     * @param encryptionAlgorithms <p>
     *            The encryption algorithms that the KMS key supports. You
     *            cannot use the KMS key with other encryption algorithms within
     *            KMS.
     *            </p>
     *            <p>
     *            This value is present only when the <code>KeyUsage</code> of
     *            the KMS key is <code>ENCRYPT_DECRYPT</code>.
     *            </p>
     */
    public void setEncryptionAlgorithms(java.util.Collection<String> encryptionAlgorithms) {
        if (encryptionAlgorithms == null) {
            this.encryptionAlgorithms = null;
            return;
        }

        this.encryptionAlgorithms = new java.util.ArrayList<String>(encryptionAlgorithms);
    }

    /**
     * <p>
     * The encryption algorithms that the KMS key supports. You cannot use the
     * KMS key with other encryption algorithms within KMS.
     * </p>
     * <p>
     * This value is present only when the <code>KeyUsage</code> of the KMS key
     * is <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionAlgorithms <p>
     *            The encryption algorithms that the KMS key supports. You
     *            cannot use the KMS key with other encryption algorithms within
     *            KMS.
     *            </p>
     *            <p>
     *            This value is present only when the <code>KeyUsage</code> of
     *            the KMS key is <code>ENCRYPT_DECRYPT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withEncryptionAlgorithms(String... encryptionAlgorithms) {
        if (getEncryptionAlgorithms() == null) {
            this.encryptionAlgorithms = new java.util.ArrayList<String>(encryptionAlgorithms.length);
        }
        for (String value : encryptionAlgorithms) {
            this.encryptionAlgorithms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The encryption algorithms that the KMS key supports. You cannot use the
     * KMS key with other encryption algorithms within KMS.
     * </p>
     * <p>
     * This value is present only when the <code>KeyUsage</code> of the KMS key
     * is <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionAlgorithms <p>
     *            The encryption algorithms that the KMS key supports. You
     *            cannot use the KMS key with other encryption algorithms within
     *            KMS.
     *            </p>
     *            <p>
     *            This value is present only when the <code>KeyUsage</code> of
     *            the KMS key is <code>ENCRYPT_DECRYPT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withEncryptionAlgorithms(java.util.Collection<String> encryptionAlgorithms) {
        setEncryptionAlgorithms(encryptionAlgorithms);
        return this;
    }

    /**
     * <p>
     * The signing algorithms that the KMS key supports. You cannot use the KMS
     * key with other signing algorithms within KMS.
     * </p>
     * <p>
     * This field appears only when the <code>KeyUsage</code> of the KMS key is
     * <code>SIGN_VERIFY</code>.
     * </p>
     *
     * @return <p>
     *         The signing algorithms that the KMS key supports. You cannot use
     *         the KMS key with other signing algorithms within KMS.
     *         </p>
     *         <p>
     *         This field appears only when the <code>KeyUsage</code> of the KMS
     *         key is <code>SIGN_VERIFY</code>.
     *         </p>
     */
    public java.util.List<String> getSigningAlgorithms() {
        return signingAlgorithms;
    }

    /**
     * <p>
     * The signing algorithms that the KMS key supports. You cannot use the KMS
     * key with other signing algorithms within KMS.
     * </p>
     * <p>
     * This field appears only when the <code>KeyUsage</code> of the KMS key is
     * <code>SIGN_VERIFY</code>.
     * </p>
     *
     * @param signingAlgorithms <p>
     *            The signing algorithms that the KMS key supports. You cannot
     *            use the KMS key with other signing algorithms within KMS.
     *            </p>
     *            <p>
     *            This field appears only when the <code>KeyUsage</code> of the
     *            KMS key is <code>SIGN_VERIFY</code>.
     *            </p>
     */
    public void setSigningAlgorithms(java.util.Collection<String> signingAlgorithms) {
        if (signingAlgorithms == null) {
            this.signingAlgorithms = null;
            return;
        }

        this.signingAlgorithms = new java.util.ArrayList<String>(signingAlgorithms);
    }

    /**
     * <p>
     * The signing algorithms that the KMS key supports. You cannot use the KMS
     * key with other signing algorithms within KMS.
     * </p>
     * <p>
     * This field appears only when the <code>KeyUsage</code> of the KMS key is
     * <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signingAlgorithms <p>
     *            The signing algorithms that the KMS key supports. You cannot
     *            use the KMS key with other signing algorithms within KMS.
     *            </p>
     *            <p>
     *            This field appears only when the <code>KeyUsage</code> of the
     *            KMS key is <code>SIGN_VERIFY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withSigningAlgorithms(String... signingAlgorithms) {
        if (getSigningAlgorithms() == null) {
            this.signingAlgorithms = new java.util.ArrayList<String>(signingAlgorithms.length);
        }
        for (String value : signingAlgorithms) {
            this.signingAlgorithms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The signing algorithms that the KMS key supports. You cannot use the KMS
     * key with other signing algorithms within KMS.
     * </p>
     * <p>
     * This field appears only when the <code>KeyUsage</code> of the KMS key is
     * <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signingAlgorithms <p>
     *            The signing algorithms that the KMS key supports. You cannot
     *            use the KMS key with other signing algorithms within KMS.
     *            </p>
     *            <p>
     *            This field appears only when the <code>KeyUsage</code> of the
     *            KMS key is <code>SIGN_VERIFY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withSigningAlgorithms(java.util.Collection<String> signingAlgorithms) {
        setSigningAlgorithms(signingAlgorithms);
        return this;
    }

    /**
     * <p>
     * Indicates whether the KMS key is a multi-Region (<code>True</code>) or
     * regional (<code>False</code>) key. This value is <code>True</code> for
     * multi-Region primary and replica keys and <code>False</code> for regional
     * KMS keys.
     * </p>
     * <p>
     * For more information about multi-Region keys, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     * >Using multi-Region keys</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether the KMS key is a multi-Region (
     *         <code>True</code>) or regional (<code>False</code>) key. This
     *         value is <code>True</code> for multi-Region primary and replica
     *         keys and <code>False</code> for regional KMS keys.
     *         </p>
     *         <p>
     *         For more information about multi-Region keys, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     *         >Using multi-Region keys</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     */
    public Boolean isMultiRegion() {
        return multiRegion;
    }

    /**
     * <p>
     * Indicates whether the KMS key is a multi-Region (<code>True</code>) or
     * regional (<code>False</code>) key. This value is <code>True</code> for
     * multi-Region primary and replica keys and <code>False</code> for regional
     * KMS keys.
     * </p>
     * <p>
     * For more information about multi-Region keys, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     * >Using multi-Region keys</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether the KMS key is a multi-Region (
     *         <code>True</code>) or regional (<code>False</code>) key. This
     *         value is <code>True</code> for multi-Region primary and replica
     *         keys and <code>False</code> for regional KMS keys.
     *         </p>
     *         <p>
     *         For more information about multi-Region keys, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     *         >Using multi-Region keys</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     */
    public Boolean getMultiRegion() {
        return multiRegion;
    }

    /**
     * <p>
     * Indicates whether the KMS key is a multi-Region (<code>True</code>) or
     * regional (<code>False</code>) key. This value is <code>True</code> for
     * multi-Region primary and replica keys and <code>False</code> for regional
     * KMS keys.
     * </p>
     * <p>
     * For more information about multi-Region keys, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     * >Using multi-Region keys</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @param multiRegion <p>
     *            Indicates whether the KMS key is a multi-Region (
     *            <code>True</code>) or regional (<code>False</code>) key. This
     *            value is <code>True</code> for multi-Region primary and
     *            replica keys and <code>False</code> for regional KMS keys.
     *            </p>
     *            <p>
     *            For more information about multi-Region keys, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     *            >Using multi-Region keys</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     */
    public void setMultiRegion(Boolean multiRegion) {
        this.multiRegion = multiRegion;
    }

    /**
     * <p>
     * Indicates whether the KMS key is a multi-Region (<code>True</code>) or
     * regional (<code>False</code>) key. This value is <code>True</code> for
     * multi-Region primary and replica keys and <code>False</code> for regional
     * KMS keys.
     * </p>
     * <p>
     * For more information about multi-Region keys, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     * >Using multi-Region keys</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiRegion <p>
     *            Indicates whether the KMS key is a multi-Region (
     *            <code>True</code>) or regional (<code>False</code>) key. This
     *            value is <code>True</code> for multi-Region primary and
     *            replica keys and <code>False</code> for regional KMS keys.
     *            </p>
     *            <p>
     *            For more information about multi-Region keys, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     *            >Using multi-Region keys</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withMultiRegion(Boolean multiRegion) {
        this.multiRegion = multiRegion;
        return this;
    }

    /**
     * <p>
     * Lists the primary and replica keys in same multi-Region key. This field
     * is present only when the value of the <code>MultiRegion</code> field is
     * <code>True</code>.
     * </p>
     * <p>
     * For more information about any listed KMS key, use the <a>DescribeKey</a>
     * operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MultiRegionKeyType</code> indicates whether the KMS key is a
     * <code>PRIMARY</code> or <code>REPLICA</code> key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PrimaryKey</code> displays the key ARN and Region of the primary
     * key. This field displays the current KMS key if it is the primary key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicaKeys</code> displays the key ARNs and Regions of all replica
     * keys. This field includes the current KMS key if it is a replica key.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Lists the primary and replica keys in same multi-Region key. This
     *         field is present only when the value of the
     *         <code>MultiRegion</code> field is <code>True</code>.
     *         </p>
     *         <p>
     *         For more information about any listed KMS key, use the
     *         <a>DescribeKey</a> operation.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MultiRegionKeyType</code> indicates whether the KMS key is
     *         a <code>PRIMARY</code> or <code>REPLICA</code> key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PrimaryKey</code> displays the key ARN and Region of the
     *         primary key. This field displays the current KMS key if it is the
     *         primary key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReplicaKeys</code> displays the key ARNs and Regions of all
     *         replica keys. This field includes the current KMS key if it is a
     *         replica key.
     *         </p>
     *         </li>
     *         </ul>
     */
    public MultiRegionConfiguration getMultiRegionConfiguration() {
        return multiRegionConfiguration;
    }

    /**
     * <p>
     * Lists the primary and replica keys in same multi-Region key. This field
     * is present only when the value of the <code>MultiRegion</code> field is
     * <code>True</code>.
     * </p>
     * <p>
     * For more information about any listed KMS key, use the <a>DescribeKey</a>
     * operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MultiRegionKeyType</code> indicates whether the KMS key is a
     * <code>PRIMARY</code> or <code>REPLICA</code> key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PrimaryKey</code> displays the key ARN and Region of the primary
     * key. This field displays the current KMS key if it is the primary key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicaKeys</code> displays the key ARNs and Regions of all replica
     * keys. This field includes the current KMS key if it is a replica key.
     * </p>
     * </li>
     * </ul>
     *
     * @param multiRegionConfiguration <p>
     *            Lists the primary and replica keys in same multi-Region key.
     *            This field is present only when the value of the
     *            <code>MultiRegion</code> field is <code>True</code>.
     *            </p>
     *            <p>
     *            For more information about any listed KMS key, use the
     *            <a>DescribeKey</a> operation.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>MultiRegionKeyType</code> indicates whether the KMS key
     *            is a <code>PRIMARY</code> or <code>REPLICA</code> key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PrimaryKey</code> displays the key ARN and Region of the
     *            primary key. This field displays the current KMS key if it is
     *            the primary key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReplicaKeys</code> displays the key ARNs and Regions of
     *            all replica keys. This field includes the current KMS key if
     *            it is a replica key.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setMultiRegionConfiguration(MultiRegionConfiguration multiRegionConfiguration) {
        this.multiRegionConfiguration = multiRegionConfiguration;
    }

    /**
     * <p>
     * Lists the primary and replica keys in same multi-Region key. This field
     * is present only when the value of the <code>MultiRegion</code> field is
     * <code>True</code>.
     * </p>
     * <p>
     * For more information about any listed KMS key, use the <a>DescribeKey</a>
     * operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MultiRegionKeyType</code> indicates whether the KMS key is a
     * <code>PRIMARY</code> or <code>REPLICA</code> key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PrimaryKey</code> displays the key ARN and Region of the primary
     * key. This field displays the current KMS key if it is the primary key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicaKeys</code> displays the key ARNs and Regions of all replica
     * keys. This field includes the current KMS key if it is a replica key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiRegionConfiguration <p>
     *            Lists the primary and replica keys in same multi-Region key.
     *            This field is present only when the value of the
     *            <code>MultiRegion</code> field is <code>True</code>.
     *            </p>
     *            <p>
     *            For more information about any listed KMS key, use the
     *            <a>DescribeKey</a> operation.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>MultiRegionKeyType</code> indicates whether the KMS key
     *            is a <code>PRIMARY</code> or <code>REPLICA</code> key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PrimaryKey</code> displays the key ARN and Region of the
     *            primary key. This field displays the current KMS key if it is
     *            the primary key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReplicaKeys</code> displays the key ARNs and Regions of
     *            all replica keys. This field includes the current KMS key if
     *            it is a replica key.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withMultiRegionConfiguration(
            MultiRegionConfiguration multiRegionConfiguration) {
        this.multiRegionConfiguration = multiRegionConfiguration;
        return this;
    }

    /**
     * <p>
     * The waiting period before the primary key in a multi-Region key is
     * deleted. This waiting period begins when the last of its replica keys is
     * deleted. This value is present only when the <code>KeyState</code> of the
     * KMS key is <code>PendingReplicaDeletion</code>. That indicates that the
     * KMS key is the primary key in a multi-Region key, it is scheduled for
     * deletion, and it still has existing replica keys.
     * </p>
     * <p>
     * When a single-Region KMS key or a multi-Region replica key is scheduled
     * for deletion, its deletion date is displayed in the
     * <code>DeletionDate</code> field. However, when the primary key in a
     * multi-Region key is scheduled for deletion, its waiting period doesn't
     * begin until all of its replica keys are deleted. This value displays that
     * waiting period. When the last replica key in the multi-Region key is
     * deleted, the <code>KeyState</code> of the scheduled primary key changes
     * from <code>PendingReplicaDeletion</code> to <code>PendingDeletion</code>
     * and the deletion date appears in the <code>DeletionDate</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     *
     * @return <p>
     *         The waiting period before the primary key in a multi-Region key
     *         is deleted. This waiting period begins when the last of its
     *         replica keys is deleted. This value is present only when the
     *         <code>KeyState</code> of the KMS key is
     *         <code>PendingReplicaDeletion</code>. That indicates that the KMS
     *         key is the primary key in a multi-Region key, it is scheduled for
     *         deletion, and it still has existing replica keys.
     *         </p>
     *         <p>
     *         When a single-Region KMS key or a multi-Region replica key is
     *         scheduled for deletion, its deletion date is displayed in the
     *         <code>DeletionDate</code> field. However, when the primary key in
     *         a multi-Region key is scheduled for deletion, its waiting period
     *         doesn't begin until all of its replica keys are deleted. This
     *         value displays that waiting period. When the last replica key in
     *         the multi-Region key is deleted, the <code>KeyState</code> of the
     *         scheduled primary key changes from
     *         <code>PendingReplicaDeletion</code> to
     *         <code>PendingDeletion</code> and the deletion date appears in the
     *         <code>DeletionDate</code> field.
     *         </p>
     */
    public Integer getPendingDeletionWindowInDays() {
        return pendingDeletionWindowInDays;
    }

    /**
     * <p>
     * The waiting period before the primary key in a multi-Region key is
     * deleted. This waiting period begins when the last of its replica keys is
     * deleted. This value is present only when the <code>KeyState</code> of the
     * KMS key is <code>PendingReplicaDeletion</code>. That indicates that the
     * KMS key is the primary key in a multi-Region key, it is scheduled for
     * deletion, and it still has existing replica keys.
     * </p>
     * <p>
     * When a single-Region KMS key or a multi-Region replica key is scheduled
     * for deletion, its deletion date is displayed in the
     * <code>DeletionDate</code> field. However, when the primary key in a
     * multi-Region key is scheduled for deletion, its waiting period doesn't
     * begin until all of its replica keys are deleted. This value displays that
     * waiting period. When the last replica key in the multi-Region key is
     * deleted, the <code>KeyState</code> of the scheduled primary key changes
     * from <code>PendingReplicaDeletion</code> to <code>PendingDeletion</code>
     * and the deletion date appears in the <code>DeletionDate</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     *
     * @param pendingDeletionWindowInDays <p>
     *            The waiting period before the primary key in a multi-Region
     *            key is deleted. This waiting period begins when the last of
     *            its replica keys is deleted. This value is present only when
     *            the <code>KeyState</code> of the KMS key is
     *            <code>PendingReplicaDeletion</code>. That indicates that the
     *            KMS key is the primary key in a multi-Region key, it is
     *            scheduled for deletion, and it still has existing replica
     *            keys.
     *            </p>
     *            <p>
     *            When a single-Region KMS key or a multi-Region replica key is
     *            scheduled for deletion, its deletion date is displayed in the
     *            <code>DeletionDate</code> field. However, when the primary key
     *            in a multi-Region key is scheduled for deletion, its waiting
     *            period doesn't begin until all of its replica keys are
     *            deleted. This value displays that waiting period. When the
     *            last replica key in the multi-Region key is deleted, the
     *            <code>KeyState</code> of the scheduled primary key changes
     *            from <code>PendingReplicaDeletion</code> to
     *            <code>PendingDeletion</code> and the deletion date appears in
     *            the <code>DeletionDate</code> field.
     *            </p>
     */
    public void setPendingDeletionWindowInDays(Integer pendingDeletionWindowInDays) {
        this.pendingDeletionWindowInDays = pendingDeletionWindowInDays;
    }

    /**
     * <p>
     * The waiting period before the primary key in a multi-Region key is
     * deleted. This waiting period begins when the last of its replica keys is
     * deleted. This value is present only when the <code>KeyState</code> of the
     * KMS key is <code>PendingReplicaDeletion</code>. That indicates that the
     * KMS key is the primary key in a multi-Region key, it is scheduled for
     * deletion, and it still has existing replica keys.
     * </p>
     * <p>
     * When a single-Region KMS key or a multi-Region replica key is scheduled
     * for deletion, its deletion date is displayed in the
     * <code>DeletionDate</code> field. However, when the primary key in a
     * multi-Region key is scheduled for deletion, its waiting period doesn't
     * begin until all of its replica keys are deleted. This value displays that
     * waiting period. When the last replica key in the multi-Region key is
     * deleted, the <code>KeyState</code> of the scheduled primary key changes
     * from <code>PendingReplicaDeletion</code> to <code>PendingDeletion</code>
     * and the deletion date appears in the <code>DeletionDate</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     *
     * @param pendingDeletionWindowInDays <p>
     *            The waiting period before the primary key in a multi-Region
     *            key is deleted. This waiting period begins when the last of
     *            its replica keys is deleted. This value is present only when
     *            the <code>KeyState</code> of the KMS key is
     *            <code>PendingReplicaDeletion</code>. That indicates that the
     *            KMS key is the primary key in a multi-Region key, it is
     *            scheduled for deletion, and it still has existing replica
     *            keys.
     *            </p>
     *            <p>
     *            When a single-Region KMS key or a multi-Region replica key is
     *            scheduled for deletion, its deletion date is displayed in the
     *            <code>DeletionDate</code> field. However, when the primary key
     *            in a multi-Region key is scheduled for deletion, its waiting
     *            period doesn't begin until all of its replica keys are
     *            deleted. This value displays that waiting period. When the
     *            last replica key in the multi-Region key is deleted, the
     *            <code>KeyState</code> of the scheduled primary key changes
     *            from <code>PendingReplicaDeletion</code> to
     *            <code>PendingDeletion</code> and the deletion date appears in
     *            the <code>DeletionDate</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withPendingDeletionWindowInDays(Integer pendingDeletionWindowInDays) {
        this.pendingDeletionWindowInDays = pendingDeletionWindowInDays;
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
        if (getAWSAccountId() != null)
            sb.append("AWSAccountId: " + getAWSAccountId() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getKeyUsage() != null)
            sb.append("KeyUsage: " + getKeyUsage() + ",");
        if (getKeyState() != null)
            sb.append("KeyState: " + getKeyState() + ",");
        if (getDeletionDate() != null)
            sb.append("DeletionDate: " + getDeletionDate() + ",");
        if (getValidTo() != null)
            sb.append("ValidTo: " + getValidTo() + ",");
        if (getOrigin() != null)
            sb.append("Origin: " + getOrigin() + ",");
        if (getCustomKeyStoreId() != null)
            sb.append("CustomKeyStoreId: " + getCustomKeyStoreId() + ",");
        if (getCloudHsmClusterId() != null)
            sb.append("CloudHsmClusterId: " + getCloudHsmClusterId() + ",");
        if (getExpirationModel() != null)
            sb.append("ExpirationModel: " + getExpirationModel() + ",");
        if (getKeyManager() != null)
            sb.append("KeyManager: " + getKeyManager() + ",");
        if (getCustomerMasterKeySpec() != null)
            sb.append("CustomerMasterKeySpec: " + getCustomerMasterKeySpec() + ",");
        if (getKeySpec() != null)
            sb.append("KeySpec: " + getKeySpec() + ",");
        if (getEncryptionAlgorithms() != null)
            sb.append("EncryptionAlgorithms: " + getEncryptionAlgorithms() + ",");
        if (getSigningAlgorithms() != null)
            sb.append("SigningAlgorithms: " + getSigningAlgorithms() + ",");
        if (getMultiRegion() != null)
            sb.append("MultiRegion: " + getMultiRegion() + ",");
        if (getMultiRegionConfiguration() != null)
            sb.append("MultiRegionConfiguration: " + getMultiRegionConfiguration() + ",");
        if (getPendingDeletionWindowInDays() != null)
            sb.append("PendingDeletionWindowInDays: " + getPendingDeletionWindowInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAWSAccountId() == null) ? 0 : getAWSAccountId().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        hashCode = prime * hashCode + ((getKeyState() == null) ? 0 : getKeyState().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionDate() == null) ? 0 : getDeletionDate().hashCode());
        hashCode = prime * hashCode + ((getValidTo() == null) ? 0 : getValidTo().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode
                + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        hashCode = prime * hashCode
                + ((getCloudHsmClusterId() == null) ? 0 : getCloudHsmClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getExpirationModel() == null) ? 0 : getExpirationModel().hashCode());
        hashCode = prime * hashCode + ((getKeyManager() == null) ? 0 : getKeyManager().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomerMasterKeySpec() == null) ? 0 : getCustomerMasterKeySpec().hashCode());
        hashCode = prime * hashCode + ((getKeySpec() == null) ? 0 : getKeySpec().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionAlgorithms() == null) ? 0 : getEncryptionAlgorithms().hashCode());
        hashCode = prime * hashCode
                + ((getSigningAlgorithms() == null) ? 0 : getSigningAlgorithms().hashCode());
        hashCode = prime * hashCode
                + ((getMultiRegion() == null) ? 0 : getMultiRegion().hashCode());
        hashCode = prime
                * hashCode
                + ((getMultiRegionConfiguration() == null) ? 0 : getMultiRegionConfiguration()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPendingDeletionWindowInDays() == null) ? 0
                        : getPendingDeletionWindowInDays().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyMetadata == false)
            return false;
        KeyMetadata other = (KeyMetadata) obj;

        if (other.getAWSAccountId() == null ^ this.getAWSAccountId() == null)
            return false;
        if (other.getAWSAccountId() != null
                && other.getAWSAccountId().equals(this.getAWSAccountId()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null)
            return false;
        if (other.getKeyUsage() != null && other.getKeyUsage().equals(this.getKeyUsage()) == false)
            return false;
        if (other.getKeyState() == null ^ this.getKeyState() == null)
            return false;
        if (other.getKeyState() != null && other.getKeyState().equals(this.getKeyState()) == false)
            return false;
        if (other.getDeletionDate() == null ^ this.getDeletionDate() == null)
            return false;
        if (other.getDeletionDate() != null
                && other.getDeletionDate().equals(this.getDeletionDate()) == false)
            return false;
        if (other.getValidTo() == null ^ this.getValidTo() == null)
            return false;
        if (other.getValidTo() != null && other.getValidTo().equals(this.getValidTo()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null
                && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        if (other.getCloudHsmClusterId() == null ^ this.getCloudHsmClusterId() == null)
            return false;
        if (other.getCloudHsmClusterId() != null
                && other.getCloudHsmClusterId().equals(this.getCloudHsmClusterId()) == false)
            return false;
        if (other.getExpirationModel() == null ^ this.getExpirationModel() == null)
            return false;
        if (other.getExpirationModel() != null
                && other.getExpirationModel().equals(this.getExpirationModel()) == false)
            return false;
        if (other.getKeyManager() == null ^ this.getKeyManager() == null)
            return false;
        if (other.getKeyManager() != null
                && other.getKeyManager().equals(this.getKeyManager()) == false)
            return false;
        if (other.getCustomerMasterKeySpec() == null ^ this.getCustomerMasterKeySpec() == null)
            return false;
        if (other.getCustomerMasterKeySpec() != null
                && other.getCustomerMasterKeySpec().equals(this.getCustomerMasterKeySpec()) == false)
            return false;
        if (other.getKeySpec() == null ^ this.getKeySpec() == null)
            return false;
        if (other.getKeySpec() != null && other.getKeySpec().equals(this.getKeySpec()) == false)
            return false;
        if (other.getEncryptionAlgorithms() == null ^ this.getEncryptionAlgorithms() == null)
            return false;
        if (other.getEncryptionAlgorithms() != null
                && other.getEncryptionAlgorithms().equals(this.getEncryptionAlgorithms()) == false)
            return false;
        if (other.getSigningAlgorithms() == null ^ this.getSigningAlgorithms() == null)
            return false;
        if (other.getSigningAlgorithms() != null
                && other.getSigningAlgorithms().equals(this.getSigningAlgorithms()) == false)
            return false;
        if (other.getMultiRegion() == null ^ this.getMultiRegion() == null)
            return false;
        if (other.getMultiRegion() != null
                && other.getMultiRegion().equals(this.getMultiRegion()) == false)
            return false;
        if (other.getMultiRegionConfiguration() == null
                ^ this.getMultiRegionConfiguration() == null)
            return false;
        if (other.getMultiRegionConfiguration() != null
                && other.getMultiRegionConfiguration().equals(this.getMultiRegionConfiguration()) == false)
            return false;
        if (other.getPendingDeletionWindowInDays() == null
                ^ this.getPendingDeletionWindowInDays() == null)
            return false;
        if (other.getPendingDeletionWindowInDays() != null
                && other.getPendingDeletionWindowInDays().equals(
                        this.getPendingDeletionWindowInDays()) == false)
            return false;
        return true;
    }
}
