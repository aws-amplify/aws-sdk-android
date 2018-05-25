/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Attaches a key policy to the specified customer master key (CMK).
 * </p>
 * <p>
 * For more information about key policies, see <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key
 * Policies</a> in the <i>AWS Key Management Service Developer Guide</i>.
 * </p>
 */
public class PutKeyPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique identifier for the CMK.
     * </p>
     * <p>
     * Use the CMK's unique identifier or its Amazon Resource Name (ARN). For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-
     * 56ef-1234567890ab
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * <p>
     * The name of the key policy.
     * </p>
     * <p>
     * This value must be <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String policyName;

    /**
     * <p>
     * The key policy to attach to the CMK.
     * </p>
     * <p>
     * If you do not set <code>BypassPolicyLockoutSafetyCheck</code> to true,
     * the policy must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must allow the principal making the <code>PutKeyPolicy</code> request
     * to make a subsequent <code>PutKeyPolicy</code> request on the CMK. This
     * reduces the likelihood that the CMK becomes unmanageable. For more
     * information, refer to the scenario in the <a href=
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
     * Use this parameter only when you intend to prevent the principal making
     * the request from making a subsequent <code>PutKeyPolicy</code> request on
     * the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     */
    private Boolean bypassPolicyLockoutSafetyCheck;

    /**
     * <p>
     * A unique identifier for the CMK.
     * </p>
     * <p>
     * Use the CMK's unique identifier or its Amazon Resource Name (ARN). For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-
     * 56ef-1234567890ab
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A unique identifier for the CMK.
     *         </p>
     *         <p>
     *         Use the CMK's unique identifier or its Amazon Resource Name
     *         (ARN). For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Unique ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-
     *         56ef-1234567890ab
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * A unique identifier for the CMK.
     * </p>
     * <p>
     * Use the CMK's unique identifier or its Amazon Resource Name (ARN). For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-
     * 56ef-1234567890ab
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId <p>
     *            A unique identifier for the CMK.
     *            </p>
     *            <p>
     *            Use the CMK's unique identifier or its Amazon Resource Name
     *            (ARN). For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Unique ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN:
     *            arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-
     *            56ef-1234567890ab
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * A unique identifier for the CMK.
     * </p>
     * <p>
     * Use the CMK's unique identifier or its Amazon Resource Name (ARN). For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-
     * 56ef-1234567890ab
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId <p>
     *            A unique identifier for the CMK.
     *            </p>
     *            <p>
     *            Use the CMK's unique identifier or its Amazon Resource Name
     *            (ARN). For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Unique ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN:
     *            arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-
     *            56ef-1234567890ab
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutKeyPolicyRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The name of the key policy.
     * </p>
     * <p>
     * This value must be <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The name of the key policy.
     *         </p>
     *         <p>
     *         This value must be <code>default</code>.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The name of the key policy.
     * </p>
     * <p>
     * This value must be <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param policyName <p>
     *            The name of the key policy.
     *            </p>
     *            <p>
     *            This value must be <code>default</code>.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the key policy.
     * </p>
     * <p>
     * This value must be <code>default</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param policyName <p>
     *            The name of the key policy.
     *            </p>
     *            <p>
     *            This value must be <code>default</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutKeyPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The key policy to attach to the CMK.
     * </p>
     * <p>
     * If you do not set <code>BypassPolicyLockoutSafetyCheck</code> to true,
     * the policy must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must allow the principal making the <code>PutKeyPolicy</code> request
     * to make a subsequent <code>PutKeyPolicy</code> request on the CMK. This
     * reduces the likelihood that the CMK becomes unmanageable. For more
     * information, refer to the scenario in the <a href=
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
     *         If you do not set <code>BypassPolicyLockoutSafetyCheck</code> to
     *         true, the policy must meet the following criteria:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         It must allow the principal making the <code>PutKeyPolicy</code>
     *         request to make a subsequent <code>PutKeyPolicy</code> request on
     *         the CMK. This reduces the likelihood that the CMK becomes
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
     * If you do not set <code>BypassPolicyLockoutSafetyCheck</code> to true,
     * the policy must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must allow the principal making the <code>PutKeyPolicy</code> request
     * to make a subsequent <code>PutKeyPolicy</code> request on the CMK. This
     * reduces the likelihood that the CMK becomes unmanageable. For more
     * information, refer to the scenario in the <a href=
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
     *            If you do not set <code>BypassPolicyLockoutSafetyCheck</code>
     *            to true, the policy must meet the following criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            It must allow the principal making the
     *            <code>PutKeyPolicy</code> request to make a subsequent
     *            <code>PutKeyPolicy</code> request on the CMK. This reduces the
     *            likelihood that the CMK becomes unmanageable. For more
     *            information, refer to the scenario in the <a href=
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
     * If you do not set <code>BypassPolicyLockoutSafetyCheck</code> to true,
     * the policy must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must allow the principal making the <code>PutKeyPolicy</code> request
     * to make a subsequent <code>PutKeyPolicy</code> request on the CMK. This
     * reduces the likelihood that the CMK becomes unmanageable. For more
     * information, refer to the scenario in the <a href=
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
     *            If you do not set <code>BypassPolicyLockoutSafetyCheck</code>
     *            to true, the policy must meet the following criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            It must allow the principal making the
     *            <code>PutKeyPolicy</code> request to make a subsequent
     *            <code>PutKeyPolicy</code> request on the CMK. This reduces the
     *            likelihood that the CMK becomes unmanageable. For more
     *            information, refer to the scenario in the <a href=
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
     *            The policy size limit is 32 KiB (32768 bytes).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutKeyPolicyRequest withPolicy(String policy) {
        this.policy = policy;
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
     * Use this parameter only when you intend to prevent the principal making
     * the request from making a subsequent <code>PutKeyPolicy</code> request on
     * the CMK.
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
     *         Use this parameter only when you intend to prevent the principal
     *         making the request from making a subsequent
     *         <code>PutKeyPolicy</code> request on the CMK.
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
     * Use this parameter only when you intend to prevent the principal making
     * the request from making a subsequent <code>PutKeyPolicy</code> request on
     * the CMK.
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
     *         Use this parameter only when you intend to prevent the principal
     *         making the request from making a subsequent
     *         <code>PutKeyPolicy</code> request on the CMK.
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
     * Use this parameter only when you intend to prevent the principal making
     * the request from making a subsequent <code>PutKeyPolicy</code> request on
     * the CMK.
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
     *            Use this parameter only when you intend to prevent the
     *            principal making the request from making a subsequent
     *            <code>PutKeyPolicy</code> request on the CMK.
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
     * Use this parameter only when you intend to prevent the principal making
     * the request from making a subsequent <code>PutKeyPolicy</code> request on
     * the CMK.
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
     *            Use this parameter only when you intend to prevent the
     *            principal making the request from making a subsequent
     *            <code>PutKeyPolicy</code> request on the CMK.
     *            </p>
     *            <p>
     *            The default value is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutKeyPolicyRequest withBypassPolicyLockoutSafetyCheck(
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getBypassPolicyLockoutSafetyCheck() != null)
            sb.append("BypassPolicyLockoutSafetyCheck: " + getBypassPolicyLockoutSafetyCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
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

        if (obj instanceof PutKeyPolicyRequest == false)
            return false;
        PutKeyPolicyRequest other = (PutKeyPolicyRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
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
