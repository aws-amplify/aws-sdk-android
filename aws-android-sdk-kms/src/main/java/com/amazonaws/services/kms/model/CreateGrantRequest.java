/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Adds a grant to a customer master key (CMK). The grant specifies who can use
 * the CMK and under what conditions. When setting permissions, grants are an
 * alternative to key policies.
 * </p>
 * <p>
 * To perform this operation on a CMK in a different AWS account, specify the
 * key ARN in the value of the <code>KeyId</code> parameter. For more
 * information about grants, see <a
 * href="http://docs.aws.amazon.com/kms/latest/developerguide/grants.html"
 * >Grants</a> in the <i>AWS Key Management Service Developer Guide</i>.
 * </p>
 * <p>
 * The result of this operation varies with the key state of the CMK. For
 * details, see <a
 * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
 * Management Service Developer Guide</i>.
 * </p>
 */
public class CreateGrantRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for the customer master key (CMK) that the grant
     * applies to.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To
     * specify a CMK in a different AWS account, you must use the key ARN.
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
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The principal that is given permission to perform the operations that the
     * grant permits.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, IAM roles, federated users, and
     * assumed role users. For examples of the ARN syntax to use for specifying
     * a principal, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     */
    private String granteePrincipal;

    /**
     * <p>
     * The principal that is given permission to retire the grant by using
     * <a>RetireGrant</a> operation.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed role
     * users. For examples of the ARN syntax to use for specifying a principal,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
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
     */
    private java.util.List<String> operations = new java.util.ArrayList<String>();

    /**
     * <p>
     * A structure that you can use to allow certain operations in the grant
     * only when the desired encryption context is present. For more information
     * about encryption context, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html"
     * >Encryption Context</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private GrantConstraints constraints;

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private java.util.List<String> grantTokens = new java.util.ArrayList<String>();

    /**
     * <p>
     * A friendly name for identifying the grant. Use this value to prevent
     * unintended creation of duplicate grants when retrying this request.
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
     * <code>GrantId</code> is returned. All grant tokens obtained in this way
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
     * The unique identifier for the customer master key (CMK) that the grant
     * applies to.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To
     * specify a CMK in a different AWS account, you must use the key ARN.
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
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The unique identifier for the customer master key (CMK) that the
     *         grant applies to.
     *         </p>
     *         <p>
     *         Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     *         To specify a CMK in a different AWS account, you must use the key
     *         ARN.
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
     *         To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     *         <a>DescribeKey</a>.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) that the grant
     * applies to.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To
     * specify a CMK in a different AWS account, you must use the key ARN.
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
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The unique identifier for the customer master key (CMK) that
     *            the grant applies to.
     *            </p>
     *            <p>
     *            Specify the key ID or the Amazon Resource Name (ARN) of the
     *            CMK. To specify a CMK in a different AWS account, you must use
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
     *            To get the key ID and key ARN for a CMK, use <a>ListKeys</a>
     *            or <a>DescribeKey</a>.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) that the grant
     * applies to.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To
     * specify a CMK in a different AWS account, you must use the key ARN.
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
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
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
     *            The unique identifier for the customer master key (CMK) that
     *            the grant applies to.
     *            </p>
     *            <p>
     *            Specify the key ID or the Amazon Resource Name (ARN) of the
     *            CMK. To specify a CMK in a different AWS account, you must use
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
     *            To get the key ID and key ARN for a CMK, use <a>ListKeys</a>
     *            or <a>DescribeKey</a>.
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
     * The principal that is given permission to perform the operations that the
     * grant permits.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, IAM roles, federated users, and
     * assumed role users. For examples of the ARN syntax to use for specifying
     * a principal, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @return <p>
     *         The principal that is given permission to perform the operations
     *         that the grant permits.
     *         </p>
     *         <p>
     *         To specify the principal, use the <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS
     *         principals include AWS accounts (root), IAM users, IAM roles,
     *         federated users, and assumed role users. For examples of the ARN
     *         syntax to use for specifying a principal, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *         >AWS Identity and Access Management (IAM)</a> in the Example ARNs
     *         section of the <i>AWS General Reference</i>.
     *         </p>
     */
    public String getGranteePrincipal() {
        return granteePrincipal;
    }

    /**
     * <p>
     * The principal that is given permission to perform the operations that the
     * grant permits.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, IAM roles, federated users, and
     * assumed role users. For examples of the ARN syntax to use for specifying
     * a principal, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @param granteePrincipal <p>
     *            The principal that is given permission to perform the
     *            operations that the grant permits.
     *            </p>
     *            <p>
     *            To specify the principal, use the <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS
     *            principals include AWS accounts (root), IAM users, IAM roles,
     *            federated users, and assumed role users. For examples of the
     *            ARN syntax to use for specifying a principal, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *            >AWS Identity and Access Management (IAM)</a> in the Example
     *            ARNs section of the <i>AWS General Reference</i>.
     *            </p>
     */
    public void setGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
    }

    /**
     * <p>
     * The principal that is given permission to perform the operations that the
     * grant permits.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, IAM roles, federated users, and
     * assumed role users. For examples of the ARN syntax to use for specifying
     * a principal, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
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
     *            The principal that is given permission to perform the
     *            operations that the grant permits.
     *            </p>
     *            <p>
     *            To specify the principal, use the <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS
     *            principals include AWS accounts (root), IAM users, IAM roles,
     *            federated users, and assumed role users. For examples of the
     *            ARN syntax to use for specifying a principal, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *            >AWS Identity and Access Management (IAM)</a> in the Example
     *            ARNs section of the <i>AWS General Reference</i>.
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
     * The principal that is given permission to retire the grant by using
     * <a>RetireGrant</a> operation.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed role
     * users. For examples of the ARN syntax to use for specifying a principal,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @return <p>
     *         The principal that is given permission to retire the grant by
     *         using <a>RetireGrant</a> operation.
     *         </p>
     *         <p>
     *         To specify the principal, use the <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS
     *         principals include AWS accounts (root), IAM users, federated
     *         users, and assumed role users. For examples of the ARN syntax to
     *         use for specifying a principal, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *         >AWS Identity and Access Management (IAM)</a> in the Example ARNs
     *         section of the <i>AWS General Reference</i>.
     *         </p>
     */
    public String getRetiringPrincipal() {
        return retiringPrincipal;
    }

    /**
     * <p>
     * The principal that is given permission to retire the grant by using
     * <a>RetireGrant</a> operation.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed role
     * users. For examples of the ARN syntax to use for specifying a principal,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @param retiringPrincipal <p>
     *            The principal that is given permission to retire the grant by
     *            using <a>RetireGrant</a> operation.
     *            </p>
     *            <p>
     *            To specify the principal, use the <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS
     *            principals include AWS accounts (root), IAM users, federated
     *            users, and assumed role users. For examples of the ARN syntax
     *            to use for specifying a principal, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *            >AWS Identity and Access Management (IAM)</a> in the Example
     *            ARNs section of the <i>AWS General Reference</i>.
     *            </p>
     */
    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }

    /**
     * <p>
     * The principal that is given permission to retire the grant by using
     * <a>RetireGrant</a> operation.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed role
     * users. For examples of the ARN syntax to use for specifying a principal,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
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
     *            The principal that is given permission to retire the grant by
     *            using <a>RetireGrant</a> operation.
     *            </p>
     *            <p>
     *            To specify the principal, use the <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS
     *            principals include AWS accounts (root), IAM users, federated
     *            users, and assumed role users. For examples of the ARN syntax
     *            to use for specifying a principal, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *            >AWS Identity and Access Management (IAM)</a> in the Example
     *            ARNs section of the <i>AWS General Reference</i>.
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
     *
     * @return <p>
     *         A list of operations that the grant permits.
     *         </p>
     */
    public java.util.List<String> getOperations() {
        return operations;
    }

    /**
     * <p>
     * A list of operations that the grant permits.
     * </p>
     *
     * @param operations <p>
     *            A list of operations that the grant permits.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operations <p>
     *            A list of operations that the grant permits.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operations <p>
     *            A list of operations that the grant permits.
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
     * A structure that you can use to allow certain operations in the grant
     * only when the desired encryption context is present. For more information
     * about encryption context, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html"
     * >Encryption Context</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         A structure that you can use to allow certain operations in the
     *         grant only when the desired encryption context is present. For
     *         more information about encryption context, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html"
     *         >Encryption Context</a> in the <i>AWS Key Management Service
     *         Developer Guide</i>.
     *         </p>
     */
    public GrantConstraints getConstraints() {
        return constraints;
    }

    /**
     * <p>
     * A structure that you can use to allow certain operations in the grant
     * only when the desired encryption context is present. For more information
     * about encryption context, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html"
     * >Encryption Context</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @param constraints <p>
     *            A structure that you can use to allow certain operations in
     *            the grant only when the desired encryption context is present.
     *            For more information about encryption context, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html"
     *            >Encryption Context</a> in the <i>AWS Key Management Service
     *            Developer Guide</i>.
     *            </p>
     */
    public void setConstraints(GrantConstraints constraints) {
        this.constraints = constraints;
    }

    /**
     * <p>
     * A structure that you can use to allow certain operations in the grant
     * only when the desired encryption context is present. For more information
     * about encryption context, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html"
     * >Encryption Context</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param constraints <p>
     *            A structure that you can use to allow certain operations in
     *            the grant only when the desired encryption context is present.
     *            For more information about encryption context, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html"
     *            >Encryption Context</a> in the <i>AWS Key Management Service
     *            Developer Guide</i>.
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
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of grant tokens.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *         >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
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
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @param grantTokens <p>
     *            A list of grant tokens.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *            >Grant Tokens</a> in the <i>AWS Key Management Service
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
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
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
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *            >Grant Tokens</a> in the <i>AWS Key Management Service
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
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
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
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *            >Grant Tokens</a> in the <i>AWS Key Management Service
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
     * A friendly name for identifying the grant. Use this value to prevent
     * unintended creation of duplicate grants when retrying this request.
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
     * <code>GrantId</code> is returned. All grant tokens obtained in this way
     * can be used interchangeably.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @return <p>
     *         A friendly name for identifying the grant. Use this value to
     *         prevent unintended creation of duplicate grants when retrying
     *         this request.
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
     *         All grant tokens obtained in this way can be used
     *         interchangeably.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name for identifying the grant. Use this value to prevent
     * unintended creation of duplicate grants when retrying this request.
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
     * <code>GrantId</code> is returned. All grant tokens obtained in this way
     * can be used interchangeably.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param name <p>
     *            A friendly name for identifying the grant. Use this value to
     *            prevent unintended creation of duplicate grants when retrying
     *            this request.
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
     *            returned. All grant tokens obtained in this way can be used
     *            interchangeably.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name for identifying the grant. Use this value to prevent
     * unintended creation of duplicate grants when retrying this request.
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
     * <code>GrantId</code> is returned. All grant tokens obtained in this way
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
     *            A friendly name for identifying the grant. Use this value to
     *            prevent unintended creation of duplicate grants when retrying
     *            this request.
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
     *            returned. All grant tokens obtained in this way can be used
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
