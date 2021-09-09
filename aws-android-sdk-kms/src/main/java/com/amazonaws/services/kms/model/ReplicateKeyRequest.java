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
 * Replicates a multi-Region key into the specified Region. This operation
 * creates a multi-Region replica key based on a multi-Region primary key in a
 * different Region of the same Amazon Web Services partition. You can create
 * multiple replicas of a primary key, but each must be in a different Region.
 * To create a multi-Region primary key, use the <a>CreateKey</a> operation.
 * </p>
 * <p>
 * This operation supports <i>multi-Region keys</i>, an KMS feature that lets
 * you create multiple interoperable KMS keys in different Amazon Web Services
 * Regions. Because these KMS keys have the same key ID, key material, and other
 * metadata, you can use them interchangeably to encrypt data in one Amazon Web
 * Services Region and decrypt it in a different Amazon Web Services Region
 * without re-encrypting the data or making a cross-Region call. For more
 * information about multi-Region keys, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
 * >Using multi-Region keys</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * A <i>replica key</i> is a fully-functional KMS key that can be used
 * independently of its primary and peer replica keys. A primary key and its
 * replica keys share properties that make them interoperable. They have the
 * same <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id"
 * >key ID</a> and key material. They also have the same <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-spec"
 * >key spec</a>, <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-usage"
 * >key usage</a>, <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-origin"
 * >key material origin</a>, and <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html"
 * >automatic key rotation status</a>. KMS automatically synchronizes these
 * shared properties among related multi-Region keys. All other properties of a
 * replica key can differ, including its <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">key
 * policy</a>, <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
 * >tags</a>, <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-alias.html"
 * >aliases</a>, and <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >key state</a>. KMS pricing and quotas for KMS keys apply to each primary key
 * and replica key.
 * </p>
 * <p>
 * When this operation completes, the new replica key has a transient key state
 * of <code>Creating</code>. This key state changes to <code>Enabled</code> (or
 * <code>PendingImport</code>) after a few seconds when the process of creating
 * the new replica key is complete. While the key state is <code>Creating</code>
 * , you can manage key, but you cannot yet use it in cryptographic operations.
 * If you are creating and using the replica key programmatically, retry on
 * <code>KMSInvalidStateException</code> or call <code>DescribeKey</code> to
 * check its <code>KeyState</code> value before using it. For details about the
 * <code>Creating</code> key state, see <a
 * href="kms/latest/developerguide/key-state.html">Key state: Effect on your KMS
 * key</a> in the <i>Key Management Service Developer Guide</i>.
 * </p>
 * <p>
 * The CloudTrail log of a <code>ReplicateKey</code> operation records a
 * <code>ReplicateKey</code> operation in the primary key's Region and a
 * <a>CreateKey</a> operation in the replica key's Region.
 * </p>
 * <p>
 * If you replicate a multi-Region primary key with imported key material, the
 * replica key is created with no key material. You must import the same key
 * material that you imported into the primary key. For details, see <a
 * href="kms/latest/developerguide/multi-region-keys-import.html">Importing key
 * material into multi-Region keys</a> in the <i>Key Management Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * To convert a replica key to a primary key, use the <a>UpdatePrimaryRegion</a>
 * operation.
 * </p>
 * <note>
 * <p>
 * <code>ReplicateKey</code> uses different default values for the
 * <code>KeyPolicy</code> and <code>Tags</code> parameters than those used in
 * the KMS console. For details, see the parameter descriptions.
 * </p>
 * </note>
 * <p>
 * <b>Cross-account use</b>: No. You cannot use this operation to create a
 * replica key in a different Amazon Web Services account.
 * </p>
 * <p>
 * <b>Required permissions</b>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>kms:ReplicateKey</code> on the primary key (in the primary key's
 * Region). Include this permission in the primary key's key policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>kms:CreateKey</code> in an IAM policy in the replica Region.
 * </p>
 * </li>
 * <li>
 * <p>
 * To use the <code>Tags</code> parameter, <code>kms:TagResource</code> in an
 * IAM policy in the replica Region.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Related operations</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateKey</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePrimaryRegion</a>
 * </p>
 * </li>
 * </ul>
 */
public class ReplicateKeyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies the multi-Region primary key that is being replicated. To
     * determine whether a KMS key is a multi-Region primary key, use the
     * <a>DescribeKey</a> operation to check the value of the
     * <code>MultiRegionKeyType</code> property.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
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
     * The Region ID of the Amazon Web Services Region for this replica key.
     * </p>
     * <p>
     * Enter the Region ID, such as <code>us-east-1</code> or
     * <code>ap-southeast-2</code>. For a list of Amazon Web Services Regions in
     * which KMS is supported, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region">KMS
     * service endpoints</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * <p>
     * The replica must be in a different Amazon Web Services Region than its
     * primary key and other replicas of that primary key, but in the same
     * Amazon Web Services partition. KMS must be available in the replica
     * Region. If the Region is not enabled by default, the Amazon Web Services
     * account must be enabled in the Region.
     * </p>
     * <p>
     * For information about Amazon Web Services partitions, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) in the <i>Amazon Web Services General
     * Reference</i>.</a> For information about enabling and disabling Regions,
     * see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable"
     * >Enabling a Region</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable"
     * >Disabling a Region</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([a-z]+-){2,3}\d+$<br/>
     */
    private String replicaRegion;

    /**
     * <p>
     * The key policy to attach to the KMS key. This parameter is optional. If
     * you do not provide a key policy, KMS attaches the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >default key policy</a> to the KMS key.
     * </p>
     * <p>
     * The key policy is not a shared property of multi-Region keys. You can
     * specify the same key policy or a different key policy for each key in a
     * set of related multi-Region keys. KMS does not synchronize this property.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the
     * key policy must give the caller <code>kms:PutKeyPolicy</code> permission
     * on the replica key. This reduces the risk that the KMS key becomes
     * unmanageable. For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to KMS. When you
     * create a new Amazon Web Services principal (for example, an IAM user or
     * role), you might need to enforce a delay before including the new
     * principal in a key policy because the new principal might not be
     * immediately visible to KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>
     * <i>Identity and Access Management User Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * </li>
     * </ul>
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
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is
     * making the request from making a subsequent <code>PutKeyPolicy</code>
     * request on the KMS key.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     */
    private Boolean bypassPolicyLockoutSafetyCheck;

    /**
     * <p>
     * A description of the KMS key. The default value is an empty string (no
     * description).
     * </p>
     * <p>
     * The description is not a shared property of multi-Region keys. You can
     * specify the same description or a different description for each key in a
     * set of related multi-Region keys. KMS does not synchronize this property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     */
    private String description;

    /**
     * <p>
     * Assigns one or more tags to the replica key. Use this parameter to tag
     * the KMS key when it is created. To tag an existing KMS key, use the
     * <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS
     * key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     * >Using ABAC in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Tags are not a shared property of multi-Region keys. You can specify the
     * same tags or different tags for each key in a set of related multi-Region
     * keys. KMS does not synchronize this property.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the
     * tag value are required, but the tag value can be an empty (null) string.
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services
     * generates a cost allocation report with usage and costs aggregated by
     * tags. Tags can also be used to control access to a KMS key. For details,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     */
    private java.util.List<Tag> tags = new java.util.ArrayList<Tag>();

    /**
     * <p>
     * Identifies the multi-Region primary key that is being replicated. To
     * determine whether a KMS key is a multi-Region primary key, use the
     * <a>DescribeKey</a> operation to check the value of the
     * <code>MultiRegionKeyType</code> property.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
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
     *         Identifies the multi-Region primary key that is being replicated.
     *         To determine whether a KMS key is a multi-Region primary key, use
     *         the <a>DescribeKey</a> operation to check the value of the
     *         <code>MultiRegionKeyType</code> property.
     *         </p>
     *         <p>
     *         Specify the key ID or key ARN of a multi-Region primary key.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN:
     *         <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
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
     * Identifies the multi-Region primary key that is being replicated. To
     * determine whether a KMS key is a multi-Region primary key, use the
     * <a>DescribeKey</a> operation to check the value of the
     * <code>MultiRegionKeyType</code> property.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
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
     *            Identifies the multi-Region primary key that is being
     *            replicated. To determine whether a KMS key is a multi-Region
     *            primary key, use the <a>DescribeKey</a> operation to check the
     *            value of the <code>MultiRegionKeyType</code> property.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of a multi-Region primary key.
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
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
     * Identifies the multi-Region primary key that is being replicated. To
     * determine whether a KMS key is a multi-Region primary key, use the
     * <a>DescribeKey</a> operation to check the value of the
     * <code>MultiRegionKeyType</code> property.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
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
     *            Identifies the multi-Region primary key that is being
     *            replicated. To determine whether a KMS key is a multi-Region
     *            primary key, use the <a>DescribeKey</a> operation to check the
     *            value of the <code>MultiRegionKeyType</code> property.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of a multi-Region primary key.
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
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
    public ReplicateKeyRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The Region ID of the Amazon Web Services Region for this replica key.
     * </p>
     * <p>
     * Enter the Region ID, such as <code>us-east-1</code> or
     * <code>ap-southeast-2</code>. For a list of Amazon Web Services Regions in
     * which KMS is supported, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region">KMS
     * service endpoints</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * <p>
     * The replica must be in a different Amazon Web Services Region than its
     * primary key and other replicas of that primary key, but in the same
     * Amazon Web Services partition. KMS must be available in the replica
     * Region. If the Region is not enabled by default, the Amazon Web Services
     * account must be enabled in the Region.
     * </p>
     * <p>
     * For information about Amazon Web Services partitions, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) in the <i>Amazon Web Services General
     * Reference</i>.</a> For information about enabling and disabling Regions,
     * see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable"
     * >Enabling a Region</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable"
     * >Disabling a Region</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([a-z]+-){2,3}\d+$<br/>
     *
     * @return <p>
     *         The Region ID of the Amazon Web Services Region for this replica
     *         key.
     *         </p>
     *         <p>
     *         Enter the Region ID, such as <code>us-east-1</code> or
     *         <code>ap-southeast-2</code>. For a list of Amazon Web Services
     *         Regions in which KMS is supported, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region"
     *         >KMS service endpoints</a> in the <i>Amazon Web Services General
     *         Reference</i>.
     *         </p>
     *         <p>
     *         The replica must be in a different Amazon Web Services Region
     *         than its primary key and other replicas of that primary key, but
     *         in the same Amazon Web Services partition. KMS must be available
     *         in the replica Region. If the Region is not enabled by default,
     *         the Amazon Web Services account must be enabled in the Region.
     *         </p>
     *         <p>
     *         For information about Amazon Web Services partitions, see <a
     *         href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) in the <i>Amazon Web Services
     *         General Reference</i>.</a> For information about enabling and
     *         disabling Regions, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable"
     *         >Enabling a Region</a> and <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable"
     *         >Disabling a Region</a> in the <i>Amazon Web Services General
     *         Reference</i>.
     *         </p>
     */
    public String getReplicaRegion() {
        return replicaRegion;
    }

    /**
     * <p>
     * The Region ID of the Amazon Web Services Region for this replica key.
     * </p>
     * <p>
     * Enter the Region ID, such as <code>us-east-1</code> or
     * <code>ap-southeast-2</code>. For a list of Amazon Web Services Regions in
     * which KMS is supported, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region">KMS
     * service endpoints</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * <p>
     * The replica must be in a different Amazon Web Services Region than its
     * primary key and other replicas of that primary key, but in the same
     * Amazon Web Services partition. KMS must be available in the replica
     * Region. If the Region is not enabled by default, the Amazon Web Services
     * account must be enabled in the Region.
     * </p>
     * <p>
     * For information about Amazon Web Services partitions, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) in the <i>Amazon Web Services General
     * Reference</i>.</a> For information about enabling and disabling Regions,
     * see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable"
     * >Enabling a Region</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable"
     * >Disabling a Region</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([a-z]+-){2,3}\d+$<br/>
     *
     * @param replicaRegion <p>
     *            The Region ID of the Amazon Web Services Region for this
     *            replica key.
     *            </p>
     *            <p>
     *            Enter the Region ID, such as <code>us-east-1</code> or
     *            <code>ap-southeast-2</code>. For a list of Amazon Web Services
     *            Regions in which KMS is supported, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region"
     *            >KMS service endpoints</a> in the <i>Amazon Web Services
     *            General Reference</i>.
     *            </p>
     *            <p>
     *            The replica must be in a different Amazon Web Services Region
     *            than its primary key and other replicas of that primary key,
     *            but in the same Amazon Web Services partition. KMS must be
     *            available in the replica Region. If the Region is not enabled
     *            by default, the Amazon Web Services account must be enabled in
     *            the Region.
     *            </p>
     *            <p>
     *            For information about Amazon Web Services partitions, see <a
     *            href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) in the <i>Amazon Web Services
     *            General Reference</i>.</a> For information about enabling and
     *            disabling Regions, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable"
     *            >Enabling a Region</a> and <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable"
     *            >Disabling a Region</a> in the <i>Amazon Web Services General
     *            Reference</i>.
     *            </p>
     */
    public void setReplicaRegion(String replicaRegion) {
        this.replicaRegion = replicaRegion;
    }

    /**
     * <p>
     * The Region ID of the Amazon Web Services Region for this replica key.
     * </p>
     * <p>
     * Enter the Region ID, such as <code>us-east-1</code> or
     * <code>ap-southeast-2</code>. For a list of Amazon Web Services Regions in
     * which KMS is supported, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region">KMS
     * service endpoints</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * <p>
     * The replica must be in a different Amazon Web Services Region than its
     * primary key and other replicas of that primary key, but in the same
     * Amazon Web Services partition. KMS must be available in the replica
     * Region. If the Region is not enabled by default, the Amazon Web Services
     * account must be enabled in the Region.
     * </p>
     * <p>
     * For information about Amazon Web Services partitions, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) in the <i>Amazon Web Services General
     * Reference</i>.</a> For information about enabling and disabling Regions,
     * see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable"
     * >Enabling a Region</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable"
     * >Disabling a Region</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([a-z]+-){2,3}\d+$<br/>
     *
     * @param replicaRegion <p>
     *            The Region ID of the Amazon Web Services Region for this
     *            replica key.
     *            </p>
     *            <p>
     *            Enter the Region ID, such as <code>us-east-1</code> or
     *            <code>ap-southeast-2</code>. For a list of Amazon Web Services
     *            Regions in which KMS is supported, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region"
     *            >KMS service endpoints</a> in the <i>Amazon Web Services
     *            General Reference</i>.
     *            </p>
     *            <p>
     *            The replica must be in a different Amazon Web Services Region
     *            than its primary key and other replicas of that primary key,
     *            but in the same Amazon Web Services partition. KMS must be
     *            available in the replica Region. If the Region is not enabled
     *            by default, the Amazon Web Services account must be enabled in
     *            the Region.
     *            </p>
     *            <p>
     *            For information about Amazon Web Services partitions, see <a
     *            href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) in the <i>Amazon Web Services
     *            General Reference</i>.</a> For information about enabling and
     *            disabling Regions, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable"
     *            >Enabling a Region</a> and <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable"
     *            >Disabling a Region</a> in the <i>Amazon Web Services General
     *            Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateKeyRequest withReplicaRegion(String replicaRegion) {
        this.replicaRegion = replicaRegion;
        return this;
    }

    /**
     * <p>
     * The key policy to attach to the KMS key. This parameter is optional. If
     * you do not provide a key policy, KMS attaches the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >default key policy</a> to the KMS key.
     * </p>
     * <p>
     * The key policy is not a shared property of multi-Region keys. You can
     * specify the same key policy or a different key policy for each key in a
     * set of related multi-Region keys. KMS does not synchronize this property.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the
     * key policy must give the caller <code>kms:PutKeyPolicy</code> permission
     * on the replica key. This reduces the risk that the KMS key becomes
     * unmanageable. For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to KMS. When you
     * create a new Amazon Web Services principal (for example, an IAM user or
     * role), you might need to enforce a delay before including the new
     * principal in a key policy because the new principal might not be
     * immediately visible to KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>
     * <i>Identity and Access Management User Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The key policy to attach to the KMS key. This parameter is
     *         optional. If you do not provide a key policy, KMS attaches the <a
     *         href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     *         >default key policy</a> to the KMS key.
     *         </p>
     *         <p>
     *         The key policy is not a shared property of multi-Region keys. You
     *         can specify the same key policy or a different key policy for
     *         each key in a set of related multi-Region keys. KMS does not
     *         synchronize this property.
     *         </p>
     *         <p>
     *         If you provide a key policy, it must meet the following criteria:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to
     *         true, the key policy must give the caller
     *         <code>kms:PutKeyPolicy</code> permission on the replica key. This
     *         reduces the risk that the KMS key becomes unmanageable. For more
     *         information, refer to the scenario in the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section of the <i> <i>Key Management
     *         Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each statement in the key policy must contain one or more
     *         principals. The principals in the key policy must exist and be
     *         visible to KMS. When you create a new Amazon Web Services
     *         principal (for example, an IAM user or role), you might need to
     *         enforce a delay before including the new principal in a key
     *         policy because the new principal might not be immediately visible
     *         to KMS. For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *         >Changes that I make are not always immediately visible</a> in
     *         the <i> <i>Identity and Access Management User Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The key policy size quota is 32 kilobytes (32768 bytes).
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * The key policy to attach to the KMS key. This parameter is optional. If
     * you do not provide a key policy, KMS attaches the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >default key policy</a> to the KMS key.
     * </p>
     * <p>
     * The key policy is not a shared property of multi-Region keys. You can
     * specify the same key policy or a different key policy for each key in a
     * set of related multi-Region keys. KMS does not synchronize this property.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the
     * key policy must give the caller <code>kms:PutKeyPolicy</code> permission
     * on the replica key. This reduces the risk that the KMS key becomes
     * unmanageable. For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to KMS. When you
     * create a new Amazon Web Services principal (for example, an IAM user or
     * role), you might need to enforce a delay before including the new
     * principal in a key policy because the new principal might not be
     * immediately visible to KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>
     * <i>Identity and Access Management User Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            The key policy to attach to the KMS key. This parameter is
     *            optional. If you do not provide a key policy, KMS attaches the
     *            <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     *            >default key policy</a> to the KMS key.
     *            </p>
     *            <p>
     *            The key policy is not a shared property of multi-Region keys.
     *            You can specify the same key policy or a different key policy
     *            for each key in a set of related multi-Region keys. KMS does
     *            not synchronize this property.
     *            </p>
     *            <p>
     *            If you provide a key policy, it must meet the following
     *            criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you don't set <code>BypassPolicyLockoutSafetyCheck</code>
     *            to true, the key policy must give the caller
     *            <code>kms:PutKeyPolicy</code> permission on the replica key.
     *            This reduces the risk that the KMS key becomes unmanageable.
     *            For more information, refer to the scenario in the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section of the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each statement in the key policy must contain one or more
     *            principals. The principals in the key policy must exist and be
     *            visible to KMS. When you create a new Amazon Web Services
     *            principal (for example, an IAM user or role), you might need
     *            to enforce a delay before including the new principal in a key
     *            policy because the new principal might not be immediately
     *            visible to KMS. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *            >Changes that I make are not always immediately visible</a> in
     *            the <i> <i>Identity and Access Management User Guide</i> </i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The key policy size quota is 32 kilobytes (32768 bytes).
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The key policy to attach to the KMS key. This parameter is optional. If
     * you do not provide a key policy, KMS attaches the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >default key policy</a> to the KMS key.
     * </p>
     * <p>
     * The key policy is not a shared property of multi-Region keys. You can
     * specify the same key policy or a different key policy for each key in a
     * set of related multi-Region keys. KMS does not synchronize this property.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the
     * key policy must give the caller <code>kms:PutKeyPolicy</code> permission
     * on the replica key. This reduces the risk that the KMS key becomes
     * unmanageable. For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to KMS. When you
     * create a new Amazon Web Services principal (for example, an IAM user or
     * role), you might need to enforce a delay before including the new
     * principal in a key policy because the new principal might not be
     * immediately visible to KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>
     * <i>Identity and Access Management User Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            The key policy to attach to the KMS key. This parameter is
     *            optional. If you do not provide a key policy, KMS attaches the
     *            <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     *            >default key policy</a> to the KMS key.
     *            </p>
     *            <p>
     *            The key policy is not a shared property of multi-Region keys.
     *            You can specify the same key policy or a different key policy
     *            for each key in a set of related multi-Region keys. KMS does
     *            not synchronize this property.
     *            </p>
     *            <p>
     *            If you provide a key policy, it must meet the following
     *            criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you don't set <code>BypassPolicyLockoutSafetyCheck</code>
     *            to true, the key policy must give the caller
     *            <code>kms:PutKeyPolicy</code> permission on the replica key.
     *            This reduces the risk that the KMS key becomes unmanageable.
     *            For more information, refer to the scenario in the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section of the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each statement in the key policy must contain one or more
     *            principals. The principals in the key policy must exist and be
     *            visible to KMS. When you create a new Amazon Web Services
     *            principal (for example, an IAM user or role), you might need
     *            to enforce a delay before including the new principal in a key
     *            policy because the new principal might not be immediately
     *            visible to KMS. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *            >Changes that I make are not always immediately visible</a> in
     *            the <i> <i>Identity and Access Management User Guide</i> </i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The key policy size quota is 32 kilobytes (32768 bytes).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateKeyRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is
     * making the request from making a subsequent <code>PutKeyPolicy</code>
     * request on the KMS key.
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
     *         Setting this value to true increases the risk that the KMS key
     *         becomes unmanageable. Do not set this value to true
     *         indiscriminately.
     *         </p>
     *         <p>
     *         For more information, refer to the scenario in the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you intend to prevent the principal
     *         that is making the request from making a subsequent
     *         <code>PutKeyPolicy</code> request on the KMS key.
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
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is
     * making the request from making a subsequent <code>PutKeyPolicy</code>
     * request on the KMS key.
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
     *         Setting this value to true increases the risk that the KMS key
     *         becomes unmanageable. Do not set this value to true
     *         indiscriminately.
     *         </p>
     *         <p>
     *         For more information, refer to the scenario in the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you intend to prevent the principal
     *         that is making the request from making a subsequent
     *         <code>PutKeyPolicy</code> request on the KMS key.
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
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is
     * making the request from making a subsequent <code>PutKeyPolicy</code>
     * request on the KMS key.
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
     *            Setting this value to true increases the risk that the KMS key
     *            becomes unmanageable. Do not set this value to true
     *            indiscriminately.
     *            </p>
     *            <p>
     *            For more information, refer to the scenario in the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            </important>
     *            <p>
     *            Use this parameter only when you intend to prevent the
     *            principal that is making the request from making a subsequent
     *            <code>PutKeyPolicy</code> request on the KMS key.
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
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is
     * making the request from making a subsequent <code>PutKeyPolicy</code>
     * request on the KMS key.
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
     *            Setting this value to true increases the risk that the KMS key
     *            becomes unmanageable. Do not set this value to true
     *            indiscriminately.
     *            </p>
     *            <p>
     *            For more information, refer to the scenario in the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            </important>
     *            <p>
     *            Use this parameter only when you intend to prevent the
     *            principal that is making the request from making a subsequent
     *            <code>PutKeyPolicy</code> request on the KMS key.
     *            </p>
     *            <p>
     *            The default value is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateKeyRequest withBypassPolicyLockoutSafetyCheck(
            Boolean bypassPolicyLockoutSafetyCheck) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
        return this;
    }

    /**
     * <p>
     * A description of the KMS key. The default value is an empty string (no
     * description).
     * </p>
     * <p>
     * The description is not a shared property of multi-Region keys. You can
     * specify the same description or a different description for each key in a
     * set of related multi-Region keys. KMS does not synchronize this property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @return <p>
     *         A description of the KMS key. The default value is an empty
     *         string (no description).
     *         </p>
     *         <p>
     *         The description is not a shared property of multi-Region keys.
     *         You can specify the same description or a different description
     *         for each key in a set of related multi-Region keys. KMS does not
     *         synchronize this property.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the KMS key. The default value is an empty string (no
     * description).
     * </p>
     * <p>
     * The description is not a shared property of multi-Region keys. You can
     * specify the same description or a different description for each key in a
     * set of related multi-Region keys. KMS does not synchronize this property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description <p>
     *            A description of the KMS key. The default value is an empty
     *            string (no description).
     *            </p>
     *            <p>
     *            The description is not a shared property of multi-Region keys.
     *            You can specify the same description or a different
     *            description for each key in a set of related multi-Region
     *            keys. KMS does not synchronize this property.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the KMS key. The default value is an empty string (no
     * description).
     * </p>
     * <p>
     * The description is not a shared property of multi-Region keys. You can
     * specify the same description or a different description for each key in a
     * set of related multi-Region keys. KMS does not synchronize this property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description <p>
     *            A description of the KMS key. The default value is an empty
     *            string (no description).
     *            </p>
     *            <p>
     *            The description is not a shared property of multi-Region keys.
     *            You can specify the same description or a different
     *            description for each key in a set of related multi-Region
     *            keys. KMS does not synchronize this property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateKeyRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Assigns one or more tags to the replica key. Use this parameter to tag
     * the KMS key when it is created. To tag an existing KMS key, use the
     * <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS
     * key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     * >Using ABAC in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Tags are not a shared property of multi-Region keys. You can specify the
     * same tags or different tags for each key in a set of related multi-Region
     * keys. KMS does not synchronize this property.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the
     * tag value are required, but the tag value can be an empty (null) string.
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services
     * generates a cost allocation report with usage and costs aggregated by
     * tags. Tags can also be used to control access to a KMS key. For details,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     *
     * @return <p>
     *         Assigns one or more tags to the replica key. Use this parameter
     *         to tag the KMS key when it is created. To tag an existing KMS
     *         key, use the <a>TagResource</a> operation.
     *         </p>
     *         <note>
     *         <p>
     *         Tagging or untagging a KMS key can allow or deny permission to
     *         the KMS key. For details, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     *         >Using ABAC in KMS</a> in the <i>Key Management Service Developer
     *         Guide</i>.
     *         </p>
     *         </note>
     *         <p>
     *         To use this parameter, you must have <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *         >kms:TagResource</a> permission in an IAM policy.
     *         </p>
     *         <p>
     *         Tags are not a shared property of multi-Region keys. You can
     *         specify the same tags or different tags for each key in a set of
     *         related multi-Region keys. KMS does not synchronize this
     *         property.
     *         </p>
     *         <p>
     *         Each tag consists of a tag key and a tag value. Both the tag key
     *         and the tag value are required, but the tag value can be an empty
     *         (null) string. You cannot have more than one tag on a KMS key
     *         with the same tag key. If you specify an existing tag key with a
     *         different tag value, KMS replaces the current tag value with the
     *         specified one.
     *         </p>
     *         <p>
     *         When you add tags to an Amazon Web Services resource, Amazon Web
     *         Services generates a cost allocation report with usage and costs
     *         aggregated by tags. Tags can also be used to control access to a
     *         KMS key. For details, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     *         >Tagging Keys</a>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Assigns one or more tags to the replica key. Use this parameter to tag
     * the KMS key when it is created. To tag an existing KMS key, use the
     * <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS
     * key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     * >Using ABAC in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Tags are not a shared property of multi-Region keys. You can specify the
     * same tags or different tags for each key in a set of related multi-Region
     * keys. KMS does not synchronize this property.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the
     * tag value are required, but the tag value can be an empty (null) string.
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services
     * generates a cost allocation report with usage and costs aggregated by
     * tags. Tags can also be used to control access to a KMS key. For details,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     *
     * @param tags <p>
     *            Assigns one or more tags to the replica key. Use this
     *            parameter to tag the KMS key when it is created. To tag an
     *            existing KMS key, use the <a>TagResource</a> operation.
     *            </p>
     *            <note>
     *            <p>
     *            Tagging or untagging a KMS key can allow or deny permission to
     *            the KMS key. For details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     *            >Using ABAC in KMS</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     *            </note>
     *            <p>
     *            To use this parameter, you must have <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *            >kms:TagResource</a> permission in an IAM policy.
     *            </p>
     *            <p>
     *            Tags are not a shared property of multi-Region keys. You can
     *            specify the same tags or different tags for each key in a set
     *            of related multi-Region keys. KMS does not synchronize this
     *            property.
     *            </p>
     *            <p>
     *            Each tag consists of a tag key and a tag value. Both the tag
     *            key and the tag value are required, but the tag value can be
     *            an empty (null) string. You cannot have more than one tag on a
     *            KMS key with the same tag key. If you specify an existing tag
     *            key with a different tag value, KMS replaces the current tag
     *            value with the specified one.
     *            </p>
     *            <p>
     *            When you add tags to an Amazon Web Services resource, Amazon
     *            Web Services generates a cost allocation report with usage and
     *            costs aggregated by tags. Tags can also be used to control
     *            access to a KMS key. For details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     *            >Tagging Keys</a>.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Assigns one or more tags to the replica key. Use this parameter to tag
     * the KMS key when it is created. To tag an existing KMS key, use the
     * <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS
     * key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     * >Using ABAC in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Tags are not a shared property of multi-Region keys. You can specify the
     * same tags or different tags for each key in a set of related multi-Region
     * keys. KMS does not synchronize this property.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the
     * tag value are required, but the tag value can be an empty (null) string.
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services
     * generates a cost allocation report with usage and costs aggregated by
     * tags. Tags can also be used to control access to a KMS key. For details,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Assigns one or more tags to the replica key. Use this
     *            parameter to tag the KMS key when it is created. To tag an
     *            existing KMS key, use the <a>TagResource</a> operation.
     *            </p>
     *            <note>
     *            <p>
     *            Tagging or untagging a KMS key can allow or deny permission to
     *            the KMS key. For details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     *            >Using ABAC in KMS</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     *            </note>
     *            <p>
     *            To use this parameter, you must have <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *            >kms:TagResource</a> permission in an IAM policy.
     *            </p>
     *            <p>
     *            Tags are not a shared property of multi-Region keys. You can
     *            specify the same tags or different tags for each key in a set
     *            of related multi-Region keys. KMS does not synchronize this
     *            property.
     *            </p>
     *            <p>
     *            Each tag consists of a tag key and a tag value. Both the tag
     *            key and the tag value are required, but the tag value can be
     *            an empty (null) string. You cannot have more than one tag on a
     *            KMS key with the same tag key. If you specify an existing tag
     *            key with a different tag value, KMS replaces the current tag
     *            value with the specified one.
     *            </p>
     *            <p>
     *            When you add tags to an Amazon Web Services resource, Amazon
     *            Web Services generates a cost allocation report with usage and
     *            costs aggregated by tags. Tags can also be used to control
     *            access to a KMS key. For details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     *            >Tagging Keys</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateKeyRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Assigns one or more tags to the replica key. Use this parameter to tag
     * the KMS key when it is created. To tag an existing KMS key, use the
     * <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS
     * key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     * >Using ABAC in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Tags are not a shared property of multi-Region keys. You can specify the
     * same tags or different tags for each key in a set of related multi-Region
     * keys. KMS does not synchronize this property.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the
     * tag value are required, but the tag value can be an empty (null) string.
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services
     * generates a cost allocation report with usage and costs aggregated by
     * tags. Tags can also be used to control access to a KMS key. For details,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Assigns one or more tags to the replica key. Use this
     *            parameter to tag the KMS key when it is created. To tag an
     *            existing KMS key, use the <a>TagResource</a> operation.
     *            </p>
     *            <note>
     *            <p>
     *            Tagging or untagging a KMS key can allow or deny permission to
     *            the KMS key. For details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     *            >Using ABAC in KMS</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     *            </note>
     *            <p>
     *            To use this parameter, you must have <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *            >kms:TagResource</a> permission in an IAM policy.
     *            </p>
     *            <p>
     *            Tags are not a shared property of multi-Region keys. You can
     *            specify the same tags or different tags for each key in a set
     *            of related multi-Region keys. KMS does not synchronize this
     *            property.
     *            </p>
     *            <p>
     *            Each tag consists of a tag key and a tag value. Both the tag
     *            key and the tag value are required, but the tag value can be
     *            an empty (null) string. You cannot have more than one tag on a
     *            KMS key with the same tag key. If you specify an existing tag
     *            key with a different tag value, KMS replaces the current tag
     *            value with the specified one.
     *            </p>
     *            <p>
     *            When you add tags to an Amazon Web Services resource, Amazon
     *            Web Services generates a cost allocation report with usage and
     *            costs aggregated by tags. Tags can also be used to control
     *            access to a KMS key. For details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     *            >Tagging Keys</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicateKeyRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getReplicaRegion() != null)
            sb.append("ReplicaRegion: " + getReplicaRegion() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getBypassPolicyLockoutSafetyCheck() != null)
            sb.append("BypassPolicyLockoutSafetyCheck: " + getBypassPolicyLockoutSafetyCheck()
                    + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaRegion() == null) ? 0 : getReplicaRegion().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime
                * hashCode
                + ((getBypassPolicyLockoutSafetyCheck() == null) ? 0
                        : getBypassPolicyLockoutSafetyCheck().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicateKeyRequest == false)
            return false;
        ReplicateKeyRequest other = (ReplicateKeyRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getReplicaRegion() == null ^ this.getReplicaRegion() == null)
            return false;
        if (other.getReplicaRegion() != null
                && other.getReplicaRegion().equals(this.getReplicaRegion()) == false)
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
