/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a customer master key (CMK).
 * </p>
 * <p>
 * You can use a CMK to encrypt small amounts of data (4 KiB or less) directly,
 * but CMKs are more commonly used to encrypt data encryption keys (DEKs), which
 * are used to encrypt raw data. For more information about DEKs and the
 * difference between CMKs and DEKs, see the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The <a>GenerateDataKey</a> operation
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">
 * AWS Key Management Service Concepts</a> in the <i>AWS Key Management Service
 * Developer Guide</i>
 * </p>
 * </li>
 * </ul>
 */
public class CreateKeyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The key policy to attach to the CMK.
     * </p>
     * <p>
     * If you specify a policy and do not set
     * <code>BypassPolicyLockoutSafetyCheck</code> to true, the policy must meet
     * the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must allow the principal making the <code>CreateKey</code> request to
     * make a subsequent <a>PutKeyPolicy</a> request on the CMK. This reduces
     * the likelihood that the CMK becomes unmanageable. For more information,
     * refer to the scenario in the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The principal(s) specified in the key policy must exist and be visible to
     * AWS KMS. When you create a new AWS principal (for example, an IAM user or
     * role), you might need to enforce a delay before specifying the new
     * principal in a key policy because the new principal might not immediately
     * be visible to AWS KMS. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not specify a policy, AWS KMS attaches a default key policy to
     * the CMK. For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >Default Key Policy</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * The policy size limit is 32 KiB (32768 bytes).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String policy;

    /**
     * <p>
     * A description of the CMK.
     * </p>
     * <p>
     * Use a description that helps you decide whether the CMK is appropriate
     * for a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     */
    private String description;

    /**
     * <p>
     * The intended use of the CMK.
     * </p>
     * <p>
     * You can use CMKs only for symmetric encryption and decryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     */
    private String keyUsage;

    /**
     * <p>
     * The source of the CMK's key material.
     * </p>
     * <p>
     * The default is <code>AWS_KMS</code>, which means AWS KMS creates the key
     * material. When this parameter is set to <code>EXTERNAL</code>, the
     * request creates a CMK without key material so that you can import key
     * material from your existing key management infrastructure. For more
     * information about importing key material into AWS KMS, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * The CMK's <code>Origin</code> is immutable and is set when the CMK is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL
     */
    private String origin;

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the likelihood that the CMK becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     */
    private Boolean bypassPolicyLockoutSafetyCheck;

    /**
     * <p>
     * The key policy to attach to the CMK.
     * </p>
     * <p>
     * If you specify a policy and do not set
     * <code>BypassPolicyLockoutSafetyCheck</code> to true, the policy must meet
     * the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must allow the principal making the <code>CreateKey</code> request to
     * make a subsequent <a>PutKeyPolicy</a> request on the CMK. This reduces
     * the likelihood that the CMK becomes unmanageable. For more information,
     * refer to the scenario in the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The principal(s) specified in the key policy must exist and be visible to
     * AWS KMS. When you create a new AWS principal (for example, an IAM user or
     * role), you might need to enforce a delay before specifying the new
     * principal in a key policy because the new principal might not immediately
     * be visible to AWS KMS. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not specify a policy, AWS KMS attaches a default key policy to
     * the CMK. For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >Default Key Policy</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * The policy size limit is 32 KiB (32768 bytes).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The key policy to attach to the CMK.
     *         </p>
     *         <p>
     *         If you specify a policy and do not set
     *         <code>BypassPolicyLockoutSafetyCheck</code> to true, the policy
     *         must meet the following criteria:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         It must allow the principal making the <code>CreateKey</code>
     *         request to make a subsequent <a>PutKeyPolicy</a> request on the
     *         CMK. This reduces the likelihood that the CMK becomes
     *         unmanageable. For more information, refer to the scenario in the
     *         <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i>AWS Key Management
     *         Service Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The principal(s) specified in the key policy must exist and be
     *         visible to AWS KMS. When you create a new AWS principal (for
     *         example, an IAM user or role), you might need to enforce a delay
     *         before specifying the new principal in a key policy because the
     *         new principal might not immediately be visible to AWS KMS. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *         >Changes that I make are not always immediately visible</a> in
     *         the <i>IAM User Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you do not specify a policy, AWS KMS attaches a default key
     *         policy to the CMK. For more information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     *         >Default Key Policy</a> in the <i>AWS Key Management Service
     *         Developer Guide</i>.
     *         </p>
     *         <p>
     *         The policy size limit is 32 KiB (32768 bytes).
     *         </p>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * The key policy to attach to the CMK.
     * </p>
     * <p>
     * If you specify a policy and do not set
     * <code>BypassPolicyLockoutSafetyCheck</code> to true, the policy must meet
     * the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must allow the principal making the <code>CreateKey</code> request to
     * make a subsequent <a>PutKeyPolicy</a> request on the CMK. This reduces
     * the likelihood that the CMK becomes unmanageable. For more information,
     * refer to the scenario in the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The principal(s) specified in the key policy must exist and be visible to
     * AWS KMS. When you create a new AWS principal (for example, an IAM user or
     * role), you might need to enforce a delay before specifying the new
     * principal in a key policy because the new principal might not immediately
     * be visible to AWS KMS. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not specify a policy, AWS KMS attaches a default key policy to
     * the CMK. For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >Default Key Policy</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * The policy size limit is 32 KiB (32768 bytes).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            The key policy to attach to the CMK.
     *            </p>
     *            <p>
     *            If you specify a policy and do not set
     *            <code>BypassPolicyLockoutSafetyCheck</code> to true, the
     *            policy must meet the following criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            It must allow the principal making the <code>CreateKey</code>
     *            request to make a subsequent <a>PutKeyPolicy</a> request on
     *            the CMK. This reduces the likelihood that the CMK becomes
     *            unmanageable. For more information, refer to the scenario in
     *            the <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The principal(s) specified in the key policy must exist and be
     *            visible to AWS KMS. When you create a new AWS principal (for
     *            example, an IAM user or role), you might need to enforce a
     *            delay before specifying the new principal in a key policy
     *            because the new principal might not immediately be visible to
     *            AWS KMS. For more information, see <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *            >Changes that I make are not always immediately visible</a> in
     *            the <i>IAM User Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you do not specify a policy, AWS KMS attaches a default key
     *            policy to the CMK. For more information, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     *            >Default Key Policy</a> in the <i>AWS Key Management Service
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            The policy size limit is 32 KiB (32768 bytes).
     *            </p>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The key policy to attach to the CMK.
     * </p>
     * <p>
     * If you specify a policy and do not set
     * <code>BypassPolicyLockoutSafetyCheck</code> to true, the policy must meet
     * the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must allow the principal making the <code>CreateKey</code> request to
     * make a subsequent <a>PutKeyPolicy</a> request on the CMK. This reduces
     * the likelihood that the CMK becomes unmanageable. For more information,
     * refer to the scenario in the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The principal(s) specified in the key policy must exist and be visible to
     * AWS KMS. When you create a new AWS principal (for example, an IAM user or
     * role), you might need to enforce a delay before specifying the new
     * principal in a key policy because the new principal might not immediately
     * be visible to AWS KMS. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not specify a policy, AWS KMS attaches a default key policy to
     * the CMK. For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >Default Key Policy</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * The policy size limit is 32 KiB (32768 bytes).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            The key policy to attach to the CMK.
     *            </p>
     *            <p>
     *            If you specify a policy and do not set
     *            <code>BypassPolicyLockoutSafetyCheck</code> to true, the
     *            policy must meet the following criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            It must allow the principal making the <code>CreateKey</code>
     *            request to make a subsequent <a>PutKeyPolicy</a> request on
     *            the CMK. This reduces the likelihood that the CMK becomes
     *            unmanageable. For more information, refer to the scenario in
     *            the <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The principal(s) specified in the key policy must exist and be
     *            visible to AWS KMS. When you create a new AWS principal (for
     *            example, an IAM user or role), you might need to enforce a
     *            delay before specifying the new principal in a key policy
     *            because the new principal might not immediately be visible to
     *            AWS KMS. For more information, see <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *            >Changes that I make are not always immediately visible</a> in
     *            the <i>IAM User Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you do not specify a policy, AWS KMS attaches a default key
     *            policy to the CMK. For more information, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     *            >Default Key Policy</a> in the <i>AWS Key Management Service
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            The policy size limit is 32 KiB (32768 bytes).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * A description of the CMK.
     * </p>
     * <p>
     * Use a description that helps you decide whether the CMK is appropriate
     * for a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @return <p>
     *         A description of the CMK.
     *         </p>
     *         <p>
     *         Use a description that helps you decide whether the CMK is
     *         appropriate for a task.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the CMK.
     * </p>
     * <p>
     * Use a description that helps you decide whether the CMK is appropriate
     * for a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description <p>
     *            A description of the CMK.
     *            </p>
     *            <p>
     *            Use a description that helps you decide whether the CMK is
     *            appropriate for a task.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the CMK.
     * </p>
     * <p>
     * Use a description that helps you decide whether the CMK is appropriate
     * for a task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description <p>
     *            A description of the CMK.
     *            </p>
     *            <p>
     *            Use a description that helps you decide whether the CMK is
     *            appropriate for a task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The intended use of the CMK.
     * </p>
     * <p>
     * You can use CMKs only for symmetric encryption and decryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @return <p>
     *         The intended use of the CMK.
     *         </p>
     *         <p>
     *         You can use CMKs only for symmetric encryption and decryption.
     *         </p>
     * @see KeyUsageType
     */
    public String getKeyUsage() {
        return keyUsage;
    }

    /**
     * <p>
     * The intended use of the CMK.
     * </p>
     * <p>
     * You can use CMKs only for symmetric encryption and decryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            The intended use of the CMK.
     *            </p>
     *            <p>
     *            You can use CMKs only for symmetric encryption and decryption.
     *            </p>
     * @see KeyUsageType
     */
    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }

    /**
     * <p>
     * The intended use of the CMK.
     * </p>
     * <p>
     * You can use CMKs only for symmetric encryption and decryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            The intended use of the CMK.
     *            </p>
     *            <p>
     *            You can use CMKs only for symmetric encryption and decryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyUsageType
     */
    public CreateKeyRequest withKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
        return this;
    }

    /**
     * <p>
     * The intended use of the CMK.
     * </p>
     * <p>
     * You can use CMKs only for symmetric encryption and decryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            The intended use of the CMK.
     *            </p>
     *            <p>
     *            You can use CMKs only for symmetric encryption and decryption.
     *            </p>
     * @see KeyUsageType
     */
    public void setKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
    }

    /**
     * <p>
     * The intended use of the CMK.
     * </p>
     * <p>
     * You can use CMKs only for symmetric encryption and decryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            The intended use of the CMK.
     *            </p>
     *            <p>
     *            You can use CMKs only for symmetric encryption and decryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyUsageType
     */
    public CreateKeyRequest withKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
        return this;
    }

    /**
     * <p>
     * The source of the CMK's key material.
     * </p>
     * <p>
     * The default is <code>AWS_KMS</code>, which means AWS KMS creates the key
     * material. When this parameter is set to <code>EXTERNAL</code>, the
     * request creates a CMK without key material so that you can import key
     * material from your existing key management infrastructure. For more
     * information about importing key material into AWS KMS, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * The CMK's <code>Origin</code> is immutable and is set when the CMK is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL
     *
     * @return <p>
     *         The source of the CMK's key material.
     *         </p>
     *         <p>
     *         The default is <code>AWS_KMS</code>, which means AWS KMS creates
     *         the key material. When this parameter is set to
     *         <code>EXTERNAL</code>, the request creates a CMK without key
     *         material so that you can import key material from your existing
     *         key management infrastructure. For more information about
     *         importing key material into AWS KMS, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *         >Importing Key Material</a> in the <i>AWS Key Management Service
     *         Developer Guide</i>.
     *         </p>
     *         <p>
     *         The CMK's <code>Origin</code> is immutable and is set when the
     *         CMK is created.
     *         </p>
     * @see OriginType
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * <p>
     * The source of the CMK's key material.
     * </p>
     * <p>
     * The default is <code>AWS_KMS</code>, which means AWS KMS creates the key
     * material. When this parameter is set to <code>EXTERNAL</code>, the
     * request creates a CMK without key material so that you can import key
     * material from your existing key management infrastructure. For more
     * information about importing key material into AWS KMS, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * The CMK's <code>Origin</code> is immutable and is set when the CMK is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL
     *
     * @param origin <p>
     *            The source of the CMK's key material.
     *            </p>
     *            <p>
     *            The default is <code>AWS_KMS</code>, which means AWS KMS
     *            creates the key material. When this parameter is set to
     *            <code>EXTERNAL</code>, the request creates a CMK without key
     *            material so that you can import key material from your
     *            existing key management infrastructure. For more information
     *            about importing key material into AWS KMS, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >Importing Key Material</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            The CMK's <code>Origin</code> is immutable and is set when the
     *            CMK is created.
     *            </p>
     * @see OriginType
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * The source of the CMK's key material.
     * </p>
     * <p>
     * The default is <code>AWS_KMS</code>, which means AWS KMS creates the key
     * material. When this parameter is set to <code>EXTERNAL</code>, the
     * request creates a CMK without key material so that you can import key
     * material from your existing key management infrastructure. For more
     * information about importing key material into AWS KMS, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * The CMK's <code>Origin</code> is immutable and is set when the CMK is
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL
     *
     * @param origin <p>
     *            The source of the CMK's key material.
     *            </p>
     *            <p>
     *            The default is <code>AWS_KMS</code>, which means AWS KMS
     *            creates the key material. When this parameter is set to
     *            <code>EXTERNAL</code>, the request creates a CMK without key
     *            material so that you can import key material from your
     *            existing key management infrastructure. For more information
     *            about importing key material into AWS KMS, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >Importing Key Material</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            The CMK's <code>Origin</code> is immutable and is set when the
     *            CMK is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OriginType
     */
    public CreateKeyRequest withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * <p>
     * The source of the CMK's key material.
     * </p>
     * <p>
     * The default is <code>AWS_KMS</code>, which means AWS KMS creates the key
     * material. When this parameter is set to <code>EXTERNAL</code>, the
     * request creates a CMK without key material so that you can import key
     * material from your existing key management infrastructure. For more
     * information about importing key material into AWS KMS, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * The CMK's <code>Origin</code> is immutable and is set when the CMK is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL
     *
     * @param origin <p>
     *            The source of the CMK's key material.
     *            </p>
     *            <p>
     *            The default is <code>AWS_KMS</code>, which means AWS KMS
     *            creates the key material. When this parameter is set to
     *            <code>EXTERNAL</code>, the request creates a CMK without key
     *            material so that you can import key material from your
     *            existing key management infrastructure. For more information
     *            about importing key material into AWS KMS, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >Importing Key Material</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            The CMK's <code>Origin</code> is immutable and is set when the
     *            CMK is created.
     *            </p>
     * @see OriginType
     */
    public void setOrigin(OriginType origin) {
        this.origin = origin.toString();
    }

    /**
     * <p>
     * The source of the CMK's key material.
     * </p>
     * <p>
     * The default is <code>AWS_KMS</code>, which means AWS KMS creates the key
     * material. When this parameter is set to <code>EXTERNAL</code>, the
     * request creates a CMK without key material so that you can import key
     * material from your existing key management infrastructure. For more
     * information about importing key material into AWS KMS, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * The CMK's <code>Origin</code> is immutable and is set when the CMK is
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL
     *
     * @param origin <p>
     *            The source of the CMK's key material.
     *            </p>
     *            <p>
     *            The default is <code>AWS_KMS</code>, which means AWS KMS
     *            creates the key material. When this parameter is set to
     *            <code>EXTERNAL</code>, the request creates a CMK without key
     *            material so that you can import key material from your
     *            existing key management infrastructure. For more information
     *            about importing key material into AWS KMS, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >Importing Key Material</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            The CMK's <code>Origin</code> is immutable and is set when the
     *            CMK is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OriginType
     */
    public CreateKeyRequest withOrigin(OriginType origin) {
        this.origin = origin.toString();
        return this;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the likelihood that the CMK becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     *
     * @return <p>
     *         A flag to indicate whether to bypass the key policy lockout
     *         safety check.
     *         </p>
     *         <important>
     *         <p>
     *         Setting this value to true increases the likelihood that the CMK
     *         becomes unmanageable. Do not set this value to true
     *         indiscriminately.
     *         </p>
     *         <p>
     *         For more information, refer to the scenario in the <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i>AWS Key Management
     *         Service Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you include a policy in the request
     *         and you intend to prevent the principal making the request from
     *         making a subsequent <a>PutKeyPolicy</a> request on the CMK.
     *         </p>
     *         <p>
     *         The default value is false.
     *         </p>
     */
    public Boolean isBypassPolicyLockoutSafetyCheck() {
        return bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the likelihood that the CMK becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     *
     * @return <p>
     *         A flag to indicate whether to bypass the key policy lockout
     *         safety check.
     *         </p>
     *         <important>
     *         <p>
     *         Setting this value to true increases the likelihood that the CMK
     *         becomes unmanageable. Do not set this value to true
     *         indiscriminately.
     *         </p>
     *         <p>
     *         For more information, refer to the scenario in the <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i>AWS Key Management
     *         Service Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you include a policy in the request
     *         and you intend to prevent the principal making the request from
     *         making a subsequent <a>PutKeyPolicy</a> request on the CMK.
     *         </p>
     *         <p>
     *         The default value is false.
     *         </p>
     */
    public Boolean getBypassPolicyLockoutSafetyCheck() {
        return bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the likelihood that the CMK becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     *
     * @param bypassPolicyLockoutSafetyCheck <p>
     *            A flag to indicate whether to bypass the key policy lockout
     *            safety check.
     *            </p>
     *            <important>
     *            <p>
     *            Setting this value to true increases the likelihood that the
     *            CMK becomes unmanageable. Do not set this value to true
     *            indiscriminately.
     *            </p>
     *            <p>
     *            For more information, refer to the scenario in the <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            </important>
     *            <p>
     *            Use this parameter only when you include a policy in the
     *            request and you intend to prevent the principal making the
     *            request from making a subsequent <a>PutKeyPolicy</a> request
     *            on the CMK.
     *            </p>
     *            <p>
     *            The default value is false.
     *            </p>
     */
    public void setBypassPolicyLockoutSafetyCheck(Boolean bypassPolicyLockoutSafetyCheck) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the likelihood that the CMK becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bypassPolicyLockoutSafetyCheck <p>
     *            A flag to indicate whether to bypass the key policy lockout
     *            safety check.
     *            </p>
     *            <important>
     *            <p>
     *            Setting this value to true increases the likelihood that the
     *            CMK becomes unmanageable. Do not set this value to true
     *            indiscriminately.
     *            </p>
     *            <p>
     *            For more information, refer to the scenario in the <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            </important>
     *            <p>
     *            Use this parameter only when you include a policy in the
     *            request and you intend to prevent the principal making the
     *            request from making a subsequent <a>PutKeyPolicy</a> request
     *            on the CMK.
     *            </p>
     *            <p>
     *            The default value is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withBypassPolicyLockoutSafetyCheck(
            Boolean bypassPolicyLockoutSafetyCheck) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
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
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getKeyUsage() != null)
            sb.append("KeyUsage: " + getKeyUsage() + ",");
        if (getOrigin() != null)
            sb.append("Origin: " + getOrigin() + ",");
        if (getBypassPolicyLockoutSafetyCheck() != null)
            sb.append("BypassPolicyLockoutSafetyCheck: " + getBypassPolicyLockoutSafetyCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime
                * hashCode
                + ((getBypassPolicyLockoutSafetyCheck() == null) ? 0
                        : getBypassPolicyLockoutSafetyCheck().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeyRequest == false)
            return false;
        CreateKeyRequest other = (CreateKeyRequest) obj;

        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
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
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getBypassPolicyLockoutSafetyCheck() == null
                ^ this.getBypassPolicyLockoutSafetyCheck() == null)
            return false;
        if (other.getBypassPolicyLockoutSafetyCheck() != null
                && other.getBypassPolicyLockoutSafetyCheck().equals(
                        this.getBypassPolicyLockoutSafetyCheck()) == false)
            return false;
        return true;
    }
}
