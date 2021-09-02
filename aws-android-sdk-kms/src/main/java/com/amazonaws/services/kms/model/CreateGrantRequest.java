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
 * Adds a grant to a KMS key.
 * </p>
 * <p>
 * A <i>grant</i> is a policy instrument that allows Amazon Web Services
 * principals to use KMS keys in cryptographic operations. It also can allow
 * them to view a KMS key (<a>DescribeKey</a>) and create and manage grants.
 * When authorizing access to a KMS key, grants are considered along with key
 * policies and IAM policies. Grants are often used for temporary permissions
 * because you can create one, use its permissions, and delete it without
 * changing your key policies or IAM policies.
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
 * The <code>CreateGrant</code> operation returns a <code>GrantToken</code> and
 * a <code>GrantId</code>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * When you create, retire, or revoke a grant, there might be a brief delay,
 * usually less than five minutes, until the grant is available throughout KMS.
 * This state is known as <i>eventual consistency</i>. Once the grant has
 * achieved eventual consistency, the grantee principal can use the permissions
 * in the grant without identifying the grant.
 * </p>
 * <p>
 * However, to use the permissions in the grant immediately, use the
 * <code>GrantToken</code> that <code>CreateGrant</code> returns. For details,
 * see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
 * >Using a grant token</a> in the <i> <i>Key Management Service Developer
 * Guide</i> </i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>CreateGrant</code> operation also returns a <code>GrantId</code>.
 * You can use the <code>GrantId</code> and a key identifier to identify the
 * grant in the <a>RetireGrant</a> and <a>RevokeGrant</a> operations. To find
 * the grant ID, use the <a>ListGrants</a> or <a>ListRetirableGrants</a>
 * operations.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The KMS key that you use for this operation must be in a compatible key
 * state. For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * <b>Cross-account use</b>: Yes. To perform this operation on a KMS key in a
 * different Amazon Web Services account, specify the key ARN in the value of
 * the <code>KeyId</code> parameter.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:CreateGrant</a> (key policy)
 * </p>
 * <p>
 * <b>Related operations:</b>
 * </p>
 * <ul>
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
 * <li>
 * <p>
 * <a>RevokeGrant</a>
 * </p>
 * </li>
 * </ul>
 */
public class CreateGrantRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies the KMS key for the grant. The grant gives principals
     * permission to use this KMS key.
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
     * The identity that gets the permissions specified in the grant.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an Amazon Web Services principal.
     * Valid Amazon Web Services principals include Amazon Web Services accounts
     * (root), IAM users, IAM roles, federated users, and assumed role users.
     * For examples of the ARN syntax to use for specifying a principal, see <a
     * href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >Amazon Web Services Identity and Access Management (IAM)</a> in the
     * Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     */
    private String granteePrincipal;

    /**
     * <p>
     * The principal that has permission to use the <a>RetireGrant</a> operation
     * to retire the grant.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an Amazon Web Services principal.
     * Valid Amazon Web Services principals include Amazon Web Services accounts
     * (root), IAM users, federated users, and assumed role users. For examples
     * of the ARN syntax to use for specifying a principal, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >Amazon Web Services Identity and Access Management (IAM)</a> in the
     * Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The grant determines the retiring principal. Other principals might have
     * permission to retire the grant or revoke the grant. For details, see
     * <a>RevokeGrant</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#grant-delete"
     * >Retiring and revoking grants</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     */
    private String retiringPrincipal;

    /**
     * <p>
     * A list of operations that the grant permits.
     * </p>
     * <p>
     * The operation must be supported on the KMS key. For example, you cannot
     * create a grant for a symmetric KMS key that allows the <a>Sign</a>
     * operation, or a grant for an asymmetric KMS key that allows the
     * <a>GenerateDataKey</a> operation. If you try, KMS returns a
     * <code>ValidationError</code> exception. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-grant-operations"
     * >Grant operations</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private java.util.List<String> operations = new java.util.ArrayList<String>();

    /**
     * <p>
     * Specifies a grant constraint.
     * </p>
     * <p>
     * KMS supports the <code>EncryptionContextEquals</code> and
     * <code>EncryptionContextSubset</code> grant constraints. Each constraint
     * value can include up to 8 encryption context pairs. The encryption
     * context value in each constraint cannot exceed 384 characters.
     * </p>
     * <p>
     * These grant constraints allow the permissions in the grant only when the
     * encryption context in the request matches (
     * <code>EncryptionContextEquals</code>) or includes (
     * <code>EncryptionContextSubset</code>) the encryption context specified in
     * this structure. For information about grant constraints, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-grant-overview.html#grant-constraints"
     * >Using grant constraints</a> in the <i>Key Management Service Developer
     * Guide</i>. For more information about encryption context, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i> <i>Key Management Service Developer
     * Guide</i> </i>.
     * </p>
     * <p>
     * The encryption context grant constraints are supported only on operations
     * that include an encryption context. You cannot use an encryption context
     * grant constraint for cryptographic operations with asymmetric KMS keys or
     * for management operations, such as <a>DescribeKey</a> or
     * <a>RetireGrant</a>.
     * </p>
     */
    private GrantConstraints constraints;

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from
     * a new grant that has not yet achieved <i>eventual consistency</i>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     * >Grant token</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     * >Using a grant token</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private java.util.List<String> grantTokens = new java.util.ArrayList<String>();

    /**
     * <p>
     * A friendly name for the grant. Use this value to prevent the unintended
     * creation of duplicate grants when retrying this request.
     * </p>
     * <p>
     * When this value is absent, all <code>CreateGrant</code> requests result
     * in a new grant with a unique <code>GrantId</code> even if all the
     * supplied parameters are identical. This can result in unintended
     * duplicates when you retry the <code>CreateGrant</code> request.
     * </p>
     * <p>
     * When this value is present, you can retry a <code>CreateGrant</code>
     * request with identical parameters; if the grant already exists, the
     * original <code>GrantId</code> is returned without creating a new grant.
     * Note that the returned grant token is unique with every
     * <code>CreateGrant</code> request, even when a duplicate
     * <code>GrantId</code> is returned. All grant tokens for the same grant ID
     * can be used interchangeably.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     */
    private String name;

    /**
     * <p>
     * Identifies the KMS key for the grant. The grant gives principals
     * permission to use this KMS key.
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
     *         Identifies the KMS key for the grant. The grant gives principals
     *         permission to use this KMS key.
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
     * Identifies the KMS key for the grant. The grant gives principals
     * permission to use this KMS key.
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
     *            Identifies the KMS key for the grant. The grant gives
     *            principals permission to use this KMS key.
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
     * Identifies the KMS key for the grant. The grant gives principals
     * permission to use this KMS key.
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
     *            Identifies the KMS key for the grant. The grant gives
     *            principals permission to use this KMS key.
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
    public CreateGrantRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The identity that gets the permissions specified in the grant.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an Amazon Web Services principal.
     * Valid Amazon Web Services principals include Amazon Web Services accounts
     * (root), IAM users, IAM roles, federated users, and assumed role users.
     * For examples of the ARN syntax to use for specifying a principal, see <a
     * href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >Amazon Web Services Identity and Access Management (IAM)</a> in the
     * Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @return <p>
     *         The identity that gets the permissions specified in the grant.
     *         </p>
     *         <p>
     *         To specify the principal, use the <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Name (ARN)</a> of an Amazon Web Services
     *         principal. Valid Amazon Web Services principals include Amazon
     *         Web Services accounts (root), IAM users, IAM roles, federated
     *         users, and assumed role users. For examples of the ARN syntax to
     *         use for specifying a principal, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *         >Amazon Web Services Identity and Access Management (IAM)</a> in
     *         the Example ARNs section of the <i>Amazon Web Services General
     *         Reference</i>.
     *         </p>
     */
    public String getGranteePrincipal() {
        return granteePrincipal;
    }

    /**
     * <p>
     * The identity that gets the permissions specified in the grant.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an Amazon Web Services principal.
     * Valid Amazon Web Services principals include Amazon Web Services accounts
     * (root), IAM users, IAM roles, federated users, and assumed role users.
     * For examples of the ARN syntax to use for specifying a principal, see <a
     * href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >Amazon Web Services Identity and Access Management (IAM)</a> in the
     * Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @param granteePrincipal <p>
     *            The identity that gets the permissions specified in the grant.
     *            </p>
     *            <p>
     *            To specify the principal, use the <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Name (ARN)</a> of an Amazon Web Services
     *            principal. Valid Amazon Web Services principals include Amazon
     *            Web Services accounts (root), IAM users, IAM roles, federated
     *            users, and assumed role users. For examples of the ARN syntax
     *            to use for specifying a principal, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *            >Amazon Web Services Identity and Access Management (IAM)</a>
     *            in the Example ARNs section of the <i>Amazon Web Services
     *            General Reference</i>.
     *            </p>
     */
    public void setGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
    }

    /**
     * <p>
     * The identity that gets the permissions specified in the grant.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an Amazon Web Services principal.
     * Valid Amazon Web Services principals include Amazon Web Services accounts
     * (root), IAM users, IAM roles, federated users, and assumed role users.
     * For examples of the ARN syntax to use for specifying a principal, see <a
     * href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >Amazon Web Services Identity and Access Management (IAM)</a> in the
     * Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @param granteePrincipal <p>
     *            The identity that gets the permissions specified in the grant.
     *            </p>
     *            <p>
     *            To specify the principal, use the <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Name (ARN)</a> of an Amazon Web Services
     *            principal. Valid Amazon Web Services principals include Amazon
     *            Web Services accounts (root), IAM users, IAM roles, federated
     *            users, and assumed role users. For examples of the ARN syntax
     *            to use for specifying a principal, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *            >Amazon Web Services Identity and Access Management (IAM)</a>
     *            in the Example ARNs section of the <i>Amazon Web Services
     *            General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGrantRequest withGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
        return this;
    }

    /**
     * <p>
     * The principal that has permission to use the <a>RetireGrant</a> operation
     * to retire the grant.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an Amazon Web Services principal.
     * Valid Amazon Web Services principals include Amazon Web Services accounts
     * (root), IAM users, federated users, and assumed role users. For examples
     * of the ARN syntax to use for specifying a principal, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >Amazon Web Services Identity and Access Management (IAM)</a> in the
     * Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The grant determines the retiring principal. Other principals might have
     * permission to retire the grant or revoke the grant. For details, see
     * <a>RevokeGrant</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#grant-delete"
     * >Retiring and revoking grants</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @return <p>
     *         The principal that has permission to use the <a>RetireGrant</a>
     *         operation to retire the grant.
     *         </p>
     *         <p>
     *         To specify the principal, use the <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Name (ARN)</a> of an Amazon Web Services
     *         principal. Valid Amazon Web Services principals include Amazon
     *         Web Services accounts (root), IAM users, federated users, and
     *         assumed role users. For examples of the ARN syntax to use for
     *         specifying a principal, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *         >Amazon Web Services Identity and Access Management (IAM)</a> in
     *         the Example ARNs section of the <i>Amazon Web Services General
     *         Reference</i>.
     *         </p>
     *         <p>
     *         The grant determines the retiring principal. Other principals
     *         might have permission to retire the grant or revoke the grant.
     *         For details, see <a>RevokeGrant</a> and <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#grant-delete"
     *         >Retiring and revoking grants</a> in the <i>Key Management
     *         Service Developer Guide</i>.
     *         </p>
     */
    public String getRetiringPrincipal() {
        return retiringPrincipal;
    }

    /**
     * <p>
     * The principal that has permission to use the <a>RetireGrant</a> operation
     * to retire the grant.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an Amazon Web Services principal.
     * Valid Amazon Web Services principals include Amazon Web Services accounts
     * (root), IAM users, federated users, and assumed role users. For examples
     * of the ARN syntax to use for specifying a principal, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >Amazon Web Services Identity and Access Management (IAM)</a> in the
     * Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The grant determines the retiring principal. Other principals might have
     * permission to retire the grant or revoke the grant. For details, see
     * <a>RevokeGrant</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#grant-delete"
     * >Retiring and revoking grants</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @param retiringPrincipal <p>
     *            The principal that has permission to use the
     *            <a>RetireGrant</a> operation to retire the grant.
     *            </p>
     *            <p>
     *            To specify the principal, use the <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Name (ARN)</a> of an Amazon Web Services
     *            principal. Valid Amazon Web Services principals include Amazon
     *            Web Services accounts (root), IAM users, federated users, and
     *            assumed role users. For examples of the ARN syntax to use for
     *            specifying a principal, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *            >Amazon Web Services Identity and Access Management (IAM)</a>
     *            in the Example ARNs section of the <i>Amazon Web Services
     *            General Reference</i>.
     *            </p>
     *            <p>
     *            The grant determines the retiring principal. Other principals
     *            might have permission to retire the grant or revoke the grant.
     *            For details, see <a>RevokeGrant</a> and <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#grant-delete"
     *            >Retiring and revoking grants</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }

    /**
     * <p>
     * The principal that has permission to use the <a>RetireGrant</a> operation
     * to retire the grant.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an Amazon Web Services principal.
     * Valid Amazon Web Services principals include Amazon Web Services accounts
     * (root), IAM users, federated users, and assumed role users. For examples
     * of the ARN syntax to use for specifying a principal, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >Amazon Web Services Identity and Access Management (IAM)</a> in the
     * Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The grant determines the retiring principal. Other principals might have
     * permission to retire the grant or revoke the grant. For details, see
     * <a>RevokeGrant</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#grant-delete"
     * >Retiring and revoking grants</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @param retiringPrincipal <p>
     *            The principal that has permission to use the
     *            <a>RetireGrant</a> operation to retire the grant.
     *            </p>
     *            <p>
     *            To specify the principal, use the <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Name (ARN)</a> of an Amazon Web Services
     *            principal. Valid Amazon Web Services principals include Amazon
     *            Web Services accounts (root), IAM users, federated users, and
     *            assumed role users. For examples of the ARN syntax to use for
     *            specifying a principal, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *            >Amazon Web Services Identity and Access Management (IAM)</a>
     *            in the Example ARNs section of the <i>Amazon Web Services
     *            General Reference</i>.
     *            </p>
     *            <p>
     *            The grant determines the retiring principal. Other principals
     *            might have permission to retire the grant or revoke the grant.
     *            For details, see <a>RevokeGrant</a> and <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#grant-delete"
     *            >Retiring and revoking grants</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGrantRequest withRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
        return this;
    }

    /**
     * <p>
     * A list of operations that the grant permits.
     * </p>
     * <p>
     * The operation must be supported on the KMS key. For example, you cannot
     * create a grant for a symmetric KMS key that allows the <a>Sign</a>
     * operation, or a grant for an asymmetric KMS key that allows the
     * <a>GenerateDataKey</a> operation. If you try, KMS returns a
     * <code>ValidationError</code> exception. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-grant-operations"
     * >Grant operations</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of operations that the grant permits.
     *         </p>
     *         <p>
     *         The operation must be supported on the KMS key. For example, you
     *         cannot create a grant for a symmetric KMS key that allows the
     *         <a>Sign</a> operation, or a grant for an asymmetric KMS key that
     *         allows the <a>GenerateDataKey</a> operation. If you try, KMS
     *         returns a <code>ValidationError</code> exception. For details,
     *         see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-grant-operations"
     *         >Grant operations</a> in the <i>Key Management Service Developer
     *         Guide</i>.
     *         </p>
     */
    public java.util.List<String> getOperations() {
        return operations;
    }

    /**
     * <p>
     * A list of operations that the grant permits.
     * </p>
     * <p>
     * The operation must be supported on the KMS key. For example, you cannot
     * create a grant for a symmetric KMS key that allows the <a>Sign</a>
     * operation, or a grant for an asymmetric KMS key that allows the
     * <a>GenerateDataKey</a> operation. If you try, KMS returns a
     * <code>ValidationError</code> exception. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-grant-operations"
     * >Grant operations</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @param operations <p>
     *            A list of operations that the grant permits.
     *            </p>
     *            <p>
     *            The operation must be supported on the KMS key. For example,
     *            you cannot create a grant for a symmetric KMS key that allows
     *            the <a>Sign</a> operation, or a grant for an asymmetric KMS
     *            key that allows the <a>GenerateDataKey</a> operation. If you
     *            try, KMS returns a <code>ValidationError</code> exception. For
     *            details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-grant-operations"
     *            >Grant operations</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     */
    public void setOperations(java.util.Collection<String> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new java.util.ArrayList<String>(operations);
    }

    /**
     * <p>
     * A list of operations that the grant permits.
     * </p>
     * <p>
     * The operation must be supported on the KMS key. For example, you cannot
     * create a grant for a symmetric KMS key that allows the <a>Sign</a>
     * operation, or a grant for an asymmetric KMS key that allows the
     * <a>GenerateDataKey</a> operation. If you try, KMS returns a
     * <code>ValidationError</code> exception. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-grant-operations"
     * >Grant operations</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operations <p>
     *            A list of operations that the grant permits.
     *            </p>
     *            <p>
     *            The operation must be supported on the KMS key. For example,
     *            you cannot create a grant for a symmetric KMS key that allows
     *            the <a>Sign</a> operation, or a grant for an asymmetric KMS
     *            key that allows the <a>GenerateDataKey</a> operation. If you
     *            try, KMS returns a <code>ValidationError</code> exception. For
     *            details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-grant-operations"
     *            >Grant operations</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGrantRequest withOperations(String... operations) {
        if (getOperations() == null) {
            this.operations = new java.util.ArrayList<String>(operations.length);
        }
        for (String value : operations) {
            this.operations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of operations that the grant permits.
     * </p>
     * <p>
     * The operation must be supported on the KMS key. For example, you cannot
     * create a grant for a symmetric KMS key that allows the <a>Sign</a>
     * operation, or a grant for an asymmetric KMS key that allows the
     * <a>GenerateDataKey</a> operation. If you try, KMS returns a
     * <code>ValidationError</code> exception. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-grant-operations"
     * >Grant operations</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operations <p>
     *            A list of operations that the grant permits.
     *            </p>
     *            <p>
     *            The operation must be supported on the KMS key. For example,
     *            you cannot create a grant for a symmetric KMS key that allows
     *            the <a>Sign</a> operation, or a grant for an asymmetric KMS
     *            key that allows the <a>GenerateDataKey</a> operation. If you
     *            try, KMS returns a <code>ValidationError</code> exception. For
     *            details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-grant-operations"
     *            >Grant operations</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGrantRequest withOperations(java.util.Collection<String> operations) {
        setOperations(operations);
        return this;
    }

    /**
     * <p>
     * Specifies a grant constraint.
     * </p>
     * <p>
     * KMS supports the <code>EncryptionContextEquals</code> and
     * <code>EncryptionContextSubset</code> grant constraints. Each constraint
     * value can include up to 8 encryption context pairs. The encryption
     * context value in each constraint cannot exceed 384 characters.
     * </p>
     * <p>
     * These grant constraints allow the permissions in the grant only when the
     * encryption context in the request matches (
     * <code>EncryptionContextEquals</code>) or includes (
     * <code>EncryptionContextSubset</code>) the encryption context specified in
     * this structure. For information about grant constraints, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-grant-overview.html#grant-constraints"
     * >Using grant constraints</a> in the <i>Key Management Service Developer
     * Guide</i>. For more information about encryption context, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i> <i>Key Management Service Developer
     * Guide</i> </i>.
     * </p>
     * <p>
     * The encryption context grant constraints are supported only on operations
     * that include an encryption context. You cannot use an encryption context
     * grant constraint for cryptographic operations with asymmetric KMS keys or
     * for management operations, such as <a>DescribeKey</a> or
     * <a>RetireGrant</a>.
     * </p>
     *
     * @return <p>
     *         Specifies a grant constraint.
     *         </p>
     *         <p>
     *         KMS supports the <code>EncryptionContextEquals</code> and
     *         <code>EncryptionContextSubset</code> grant constraints. Each
     *         constraint value can include up to 8 encryption context pairs.
     *         The encryption context value in each constraint cannot exceed 384
     *         characters.
     *         </p>
     *         <p>
     *         These grant constraints allow the permissions in the grant only
     *         when the encryption context in the request matches (
     *         <code>EncryptionContextEquals</code>) or includes (
     *         <code>EncryptionContextSubset</code>) the encryption context
     *         specified in this structure. For information about grant
     *         constraints, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/create-grant-overview.html#grant-constraints"
     *         >Using grant constraints</a> in the <i>Key Management Service
     *         Developer Guide</i>. For more information about encryption
     *         context, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *         >Encryption Context</a> in the <i> <i>Key Management Service
     *         Developer Guide</i> </i>.
     *         </p>
     *         <p>
     *         The encryption context grant constraints are supported only on
     *         operations that include an encryption context. You cannot use an
     *         encryption context grant constraint for cryptographic operations
     *         with asymmetric KMS keys or for management operations, such as
     *         <a>DescribeKey</a> or <a>RetireGrant</a>.
     *         </p>
     */
    public GrantConstraints getConstraints() {
        return constraints;
    }

    /**
     * <p>
     * Specifies a grant constraint.
     * </p>
     * <p>
     * KMS supports the <code>EncryptionContextEquals</code> and
     * <code>EncryptionContextSubset</code> grant constraints. Each constraint
     * value can include up to 8 encryption context pairs. The encryption
     * context value in each constraint cannot exceed 384 characters.
     * </p>
     * <p>
     * These grant constraints allow the permissions in the grant only when the
     * encryption context in the request matches (
     * <code>EncryptionContextEquals</code>) or includes (
     * <code>EncryptionContextSubset</code>) the encryption context specified in
     * this structure. For information about grant constraints, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-grant-overview.html#grant-constraints"
     * >Using grant constraints</a> in the <i>Key Management Service Developer
     * Guide</i>. For more information about encryption context, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i> <i>Key Management Service Developer
     * Guide</i> </i>.
     * </p>
     * <p>
     * The encryption context grant constraints are supported only on operations
     * that include an encryption context. You cannot use an encryption context
     * grant constraint for cryptographic operations with asymmetric KMS keys or
     * for management operations, such as <a>DescribeKey</a> or
     * <a>RetireGrant</a>.
     * </p>
     *
     * @param constraints <p>
     *            Specifies a grant constraint.
     *            </p>
     *            <p>
     *            KMS supports the <code>EncryptionContextEquals</code> and
     *            <code>EncryptionContextSubset</code> grant constraints. Each
     *            constraint value can include up to 8 encryption context pairs.
     *            The encryption context value in each constraint cannot exceed
     *            384 characters.
     *            </p>
     *            <p>
     *            These grant constraints allow the permissions in the grant
     *            only when the encryption context in the request matches (
     *            <code>EncryptionContextEquals</code>) or includes (
     *            <code>EncryptionContextSubset</code>) the encryption context
     *            specified in this structure. For information about grant
     *            constraints, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/create-grant-overview.html#grant-constraints"
     *            >Using grant constraints</a> in the <i>Key Management Service
     *            Developer Guide</i>. For more information about encryption
     *            context, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *            >Encryption Context</a> in the <i> <i>Key Management Service
     *            Developer Guide</i> </i>.
     *            </p>
     *            <p>
     *            The encryption context grant constraints are supported only on
     *            operations that include an encryption context. You cannot use
     *            an encryption context grant constraint for cryptographic
     *            operations with asymmetric KMS keys or for management
     *            operations, such as <a>DescribeKey</a> or <a>RetireGrant</a>.
     *            </p>
     */
    public void setConstraints(GrantConstraints constraints) {
        this.constraints = constraints;
    }

    /**
     * <p>
     * Specifies a grant constraint.
     * </p>
     * <p>
     * KMS supports the <code>EncryptionContextEquals</code> and
     * <code>EncryptionContextSubset</code> grant constraints. Each constraint
     * value can include up to 8 encryption context pairs. The encryption
     * context value in each constraint cannot exceed 384 characters.
     * </p>
     * <p>
     * These grant constraints allow the permissions in the grant only when the
     * encryption context in the request matches (
     * <code>EncryptionContextEquals</code>) or includes (
     * <code>EncryptionContextSubset</code>) the encryption context specified in
     * this structure. For information about grant constraints, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-grant-overview.html#grant-constraints"
     * >Using grant constraints</a> in the <i>Key Management Service Developer
     * Guide</i>. For more information about encryption context, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i> <i>Key Management Service Developer
     * Guide</i> </i>.
     * </p>
     * <p>
     * The encryption context grant constraints are supported only on operations
     * that include an encryption context. You cannot use an encryption context
     * grant constraint for cryptographic operations with asymmetric KMS keys or
     * for management operations, such as <a>DescribeKey</a> or
     * <a>RetireGrant</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param constraints <p>
     *            Specifies a grant constraint.
     *            </p>
     *            <p>
     *            KMS supports the <code>EncryptionContextEquals</code> and
     *            <code>EncryptionContextSubset</code> grant constraints. Each
     *            constraint value can include up to 8 encryption context pairs.
     *            The encryption context value in each constraint cannot exceed
     *            384 characters.
     *            </p>
     *            <p>
     *            These grant constraints allow the permissions in the grant
     *            only when the encryption context in the request matches (
     *            <code>EncryptionContextEquals</code>) or includes (
     *            <code>EncryptionContextSubset</code>) the encryption context
     *            specified in this structure. For information about grant
     *            constraints, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/create-grant-overview.html#grant-constraints"
     *            >Using grant constraints</a> in the <i>Key Management Service
     *            Developer Guide</i>. For more information about encryption
     *            context, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *            >Encryption Context</a> in the <i> <i>Key Management Service
     *            Developer Guide</i> </i>.
     *            </p>
     *            <p>
     *            The encryption context grant constraints are supported only on
     *            operations that include an encryption context. You cannot use
     *            an encryption context grant constraint for cryptographic
     *            operations with asymmetric KMS keys or for management
     *            operations, such as <a>DescribeKey</a> or <a>RetireGrant</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGrantRequest withConstraints(GrantConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from
     * a new grant that has not yet achieved <i>eventual consistency</i>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     * >Grant token</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     * >Using a grant token</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of grant tokens.
     *         </p>
     *         <p>
     *         Use a grant token when your permission to call this operation
     *         comes from a new grant that has not yet achieved <i>eventual
     *         consistency</i>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     *         >Grant token</a> and <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     *         >Using a grant token</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     */
    public java.util.List<String> getGrantTokens() {
        return grantTokens;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from
     * a new grant that has not yet achieved <i>eventual consistency</i>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     * >Grant token</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     * >Using a grant token</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @param grantTokens <p>
     *            A list of grant tokens.
     *            </p>
     *            <p>
     *            Use a grant token when your permission to call this operation
     *            comes from a new grant that has not yet achieved <i>eventual
     *            consistency</i>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     *            >Grant token</a> and <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     *            >Using a grant token</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     */
    public void setGrantTokens(java.util.Collection<String> grantTokens) {
        if (grantTokens == null) {
            this.grantTokens = null;
            return;
        }

        this.grantTokens = new java.util.ArrayList<String>(grantTokens);
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from
     * a new grant that has not yet achieved <i>eventual consistency</i>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     * >Grant token</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     * >Using a grant token</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantTokens <p>
     *            A list of grant tokens.
     *            </p>
     *            <p>
     *            Use a grant token when your permission to call this operation
     *            comes from a new grant that has not yet achieved <i>eventual
     *            consistency</i>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     *            >Grant token</a> and <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     *            >Using a grant token</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGrantRequest withGrantTokens(String... grantTokens) {
        if (getGrantTokens() == null) {
            this.grantTokens = new java.util.ArrayList<String>(grantTokens.length);
        }
        for (String value : grantTokens) {
            this.grantTokens.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from
     * a new grant that has not yet achieved <i>eventual consistency</i>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     * >Grant token</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     * >Using a grant token</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantTokens <p>
     *            A list of grant tokens.
     *            </p>
     *            <p>
     *            Use a grant token when your permission to call this operation
     *            comes from a new grant that has not yet achieved <i>eventual
     *            consistency</i>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     *            >Grant token</a> and <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     *            >Using a grant token</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGrantRequest withGrantTokens(java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
        return this;
    }

    /**
     * <p>
     * A friendly name for the grant. Use this value to prevent the unintended
     * creation of duplicate grants when retrying this request.
     * </p>
     * <p>
     * When this value is absent, all <code>CreateGrant</code> requests result
     * in a new grant with a unique <code>GrantId</code> even if all the
     * supplied parameters are identical. This can result in unintended
     * duplicates when you retry the <code>CreateGrant</code> request.
     * </p>
     * <p>
     * When this value is present, you can retry a <code>CreateGrant</code>
     * request with identical parameters; if the grant already exists, the
     * original <code>GrantId</code> is returned without creating a new grant.
     * Note that the returned grant token is unique with every
     * <code>CreateGrant</code> request, even when a duplicate
     * <code>GrantId</code> is returned. All grant tokens for the same grant ID
     * can be used interchangeably.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @return <p>
     *         A friendly name for the grant. Use this value to prevent the
     *         unintended creation of duplicate grants when retrying this
     *         request.
     *         </p>
     *         <p>
     *         When this value is absent, all <code>CreateGrant</code> requests
     *         result in a new grant with a unique <code>GrantId</code> even if
     *         all the supplied parameters are identical. This can result in
     *         unintended duplicates when you retry the <code>CreateGrant</code>
     *         request.
     *         </p>
     *         <p>
     *         When this value is present, you can retry a
     *         <code>CreateGrant</code> request with identical parameters; if
     *         the grant already exists, the original <code>GrantId</code> is
     *         returned without creating a new grant. Note that the returned
     *         grant token is unique with every <code>CreateGrant</code>
     *         request, even when a duplicate <code>GrantId</code> is returned.
     *         All grant tokens for the same grant ID can be used
     *         interchangeably.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name for the grant. Use this value to prevent the unintended
     * creation of duplicate grants when retrying this request.
     * </p>
     * <p>
     * When this value is absent, all <code>CreateGrant</code> requests result
     * in a new grant with a unique <code>GrantId</code> even if all the
     * supplied parameters are identical. This can result in unintended
     * duplicates when you retry the <code>CreateGrant</code> request.
     * </p>
     * <p>
     * When this value is present, you can retry a <code>CreateGrant</code>
     * request with identical parameters; if the grant already exists, the
     * original <code>GrantId</code> is returned without creating a new grant.
     * Note that the returned grant token is unique with every
     * <code>CreateGrant</code> request, even when a duplicate
     * <code>GrantId</code> is returned. All grant tokens for the same grant ID
     * can be used interchangeably.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param name <p>
     *            A friendly name for the grant. Use this value to prevent the
     *            unintended creation of duplicate grants when retrying this
     *            request.
     *            </p>
     *            <p>
     *            When this value is absent, all <code>CreateGrant</code>
     *            requests result in a new grant with a unique
     *            <code>GrantId</code> even if all the supplied parameters are
     *            identical. This can result in unintended duplicates when you
     *            retry the <code>CreateGrant</code> request.
     *            </p>
     *            <p>
     *            When this value is present, you can retry a
     *            <code>CreateGrant</code> request with identical parameters; if
     *            the grant already exists, the original <code>GrantId</code> is
     *            returned without creating a new grant. Note that the returned
     *            grant token is unique with every <code>CreateGrant</code>
     *            request, even when a duplicate <code>GrantId</code> is
     *            returned. All grant tokens for the same grant ID can be used
     *            interchangeably.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name for the grant. Use this value to prevent the unintended
     * creation of duplicate grants when retrying this request.
     * </p>
     * <p>
     * When this value is absent, all <code>CreateGrant</code> requests result
     * in a new grant with a unique <code>GrantId</code> even if all the
     * supplied parameters are identical. This can result in unintended
     * duplicates when you retry the <code>CreateGrant</code> request.
     * </p>
     * <p>
     * When this value is present, you can retry a <code>CreateGrant</code>
     * request with identical parameters; if the grant already exists, the
     * original <code>GrantId</code> is returned without creating a new grant.
     * Note that the returned grant token is unique with every
     * <code>CreateGrant</code> request, even when a duplicate
     * <code>GrantId</code> is returned. All grant tokens for the same grant ID
     * can be used interchangeably.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param name <p>
     *            A friendly name for the grant. Use this value to prevent the
     *            unintended creation of duplicate grants when retrying this
     *            request.
     *            </p>
     *            <p>
     *            When this value is absent, all <code>CreateGrant</code>
     *            requests result in a new grant with a unique
     *            <code>GrantId</code> even if all the supplied parameters are
     *            identical. This can result in unintended duplicates when you
     *            retry the <code>CreateGrant</code> request.
     *            </p>
     *            <p>
     *            When this value is present, you can retry a
     *            <code>CreateGrant</code> request with identical parameters; if
     *            the grant already exists, the original <code>GrantId</code> is
     *            returned without creating a new grant. Note that the returned
     *            grant token is unique with every <code>CreateGrant</code>
     *            request, even when a duplicate <code>GrantId</code> is
     *            returned. All grant tokens for the same grant ID can be used
     *            interchangeably.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGrantRequest withName(String name) {
        this.name = name;
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
        if (getGranteePrincipal() != null)
            sb.append("GranteePrincipal: " + getGranteePrincipal() + ",");
        if (getRetiringPrincipal() != null)
            sb.append("RetiringPrincipal: " + getRetiringPrincipal() + ",");
        if (getOperations() != null)
            sb.append("Operations: " + getOperations() + ",");
        if (getConstraints() != null)
            sb.append("Constraints: " + getConstraints() + ",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: " + getGrantTokens() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getGranteePrincipal() == null) ? 0 : getGranteePrincipal().hashCode());
        hashCode = prime * hashCode
                + ((getRetiringPrincipal() == null) ? 0 : getRetiringPrincipal().hashCode());
        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime * hashCode
                + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        hashCode = prime * hashCode
                + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGrantRequest == false)
            return false;
        CreateGrantRequest other = (CreateGrantRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getGranteePrincipal() == null ^ this.getGranteePrincipal() == null)
            return false;
        if (other.getGranteePrincipal() != null
                && other.getGranteePrincipal().equals(this.getGranteePrincipal()) == false)
            return false;
        if (other.getRetiringPrincipal() == null ^ this.getRetiringPrincipal() == null)
            return false;
        if (other.getRetiringPrincipal() != null
                && other.getRetiringPrincipal().equals(this.getRetiringPrincipal()) == false)
            return false;
        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null
                && other.getOperations().equals(this.getOperations()) == false)
            return false;
        if (other.getConstraints() == null ^ this.getConstraints() == null)
            return false;
        if (other.getConstraints() != null
                && other.getConstraints().equals(this.getConstraints()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null
                && other.getGrantTokens().equals(this.getGrantTokens()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
