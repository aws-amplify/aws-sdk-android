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

package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a set of temporary security credentials (consisting of an access key
 * ID, a secret access key, and a security token) that you can use to access AWS
 * resources that you might not normally have access to. Typically, you use
 * <code>AssumeRole</code> for cross-account access or federation. For a
 * comparison of <code>AssumeRole</code> with the other APIs that produce
 * temporary credentials, see <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html"
 * >Requesting Temporary Security Credentials</a> and <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
 * >Comparing the AWS STS APIs</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * <b>Important:</b> You cannot call <code>AssumeRole</code> by using AWS root
 * account credentials; access is denied. You must use credentials for an IAM
 * user or an IAM role to call <code>AssumeRole</code>.
 * </p>
 * <p>
 * For cross-account access, imagine that you own multiple accounts and need to
 * access resources in each account. You could create long-term credentials in
 * each account to access those resources. However, managing all those
 * credentials and remembering which one can access which account can be time
 * consuming. Instead, you can create one set of long-term credentials in one
 * account and then use temporary security credentials to access all the other
 * accounts by assuming roles in those accounts. For more information about
 * roles, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html"
 * >IAM Roles (Delegation and Federation)</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * For federation, you can, for example, grant single sign-on access to the AWS
 * Management Console. If you already have an identity and authentication system
 * in your corporate network, you don't have to recreate user identities in AWS
 * in order to grant those user identities access to AWS. Instead, after a user
 * has been authenticated, you call <code>AssumeRole</code> (and specify the
 * role with the appropriate permissions) to get temporary security credentials
 * for that user. With those temporary security credentials, you construct a
 * sign-in URL that users can use to access the console. For more information,
 * see <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html#sts-introduction"
 * >Common Scenarios for Temporary Credentials</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * By default, the temporary security credentials created by
 * <code>AssumeRole</code> last for one hour. However, you can use the optional
 * <code>DurationSeconds</code> parameter to specify the duration of your
 * session. You can provide a value from 900 seconds (15 minutes) up to the
 * maximum session duration setting for the role. This setting can have a value
 * from 1 hour to 12 hours. To learn how to view the maximum value for your
 * role, see <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
 * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User
 * Guide</i>. The maximum session duration limit applies when you use the
 * <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
 * operations but does not apply when you use those operations to create a
 * console URL. For more information, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html"
 * >Using IAM Roles</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * The temporary security credentials created by <code>AssumeRole</code> can be
 * used to make API calls to any AWS service with the following exception: you
 * cannot call the STS service's <code>GetFederationToken</code> or
 * <code>GetSessionToken</code> APIs.
 * </p>
 * <p>
 * Optionally, you can pass an IAM access policy to this operation. If you
 * choose not to pass a policy, the temporary security credentials that are
 * returned by the operation have the permissions that are defined in the access
 * policy of the role that is being assumed. If you pass a policy to this
 * operation, the temporary security credentials that are returned by the
 * operation have the permissions that are allowed by both the access policy of
 * the role that is being assumed, <i> <b>and</b> </i> the policy that you pass.
 * This gives you a way to further restrict the permissions for the resulting
 * temporary security credentials. You cannot use the passed policy to grant
 * permissions that are in excess of those allowed by the access policy of the
 * role that is being assumed. For more information, see <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
 * >Permissions for AssumeRole, AssumeRoleWithSAML, and
 * AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * To assume a role, your AWS account must be trusted by the role. The trust
 * relationship is defined in the role's trust policy when the role is created.
 * That trust policy states which accounts are allowed to delegate access to
 * this account's role.
 * </p>
 * <p>
 * The user who wants to access the role must also have permissions delegated
 * from the role's administrator. If the user is in a different account than the
 * role, then the user's administrator must attach a policy that allows the user
 * to call AssumeRole on the ARN of the role in the other account. If the user
 * is in the same account as the role, then you can either attach a policy to
 * the user (identical to the previous different account user), or you can add
 * the user as a principal directly in the role's trust policy. In this case,
 * the trust policy acts as the only resource-based policy in IAM, and users in
 * the same account as the role do not need explicit permission to assume the
 * role. For more information about trust policies and resource-based policies,
 * see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html"
 * >IAM Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * <b>Using MFA with AssumeRole</b>
 * </p>
 * <p>
 * You can optionally include multi-factor authentication (MFA) information when
 * you call <code>AssumeRole</code>. This is useful for cross-account scenarios
 * in which you want to make sure that the user who is assuming the role has
 * been authenticated using an AWS MFA device. In that scenario, the trust
 * policy of the role being assumed includes a condition that tests for MFA
 * authentication; if the caller does not include valid MFA information, the
 * request to assume the role is denied. The condition in a trust policy that
 * tests for MFA authentication might look like the following example.
 * </p>
 * <p>
 * <code>"Condition": {"Bool": {"aws:MultiFactorAuthPresent": true}}</code>
 * </p>
 * <p>
 * For more information, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/MFAProtectedAPI.html"
 * >Configuring MFA-Protected API Access</a> in the <i>IAM User Guide</i> guide.
 * </p>
 * <p>
 * To use MFA with <code>AssumeRole</code>, you pass values for the
 * <code>SerialNumber</code> and <code>TokenCode</code> parameters. The
 * <code>SerialNumber</code> value identifies the user's hardware or virtual MFA
 * device. The <code>TokenCode</code> is the time-based one-time password (TOTP)
 * that the MFA devices produces.
 * </p>
 */
public class AssumeRoleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     */
    private String roleArn;

    /**
     * <p>
     * An identifier for the assumed role session.
     * </p>
     * <p>
     * Use the role session name to uniquely identify a session when the same
     * role is assumed by different principals or for different reasons. In
     * cross-account scenarios, the role session name is visible to, and can be
     * logged by the account that owns the role. The role session name is also
     * used in the ARN of the assumed role principal. This means that subsequent
     * cross-account API requests using the temporary security credentials will
     * expose the role session name to the external account in their CloudTrail
     * logs.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String roleSessionName;

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * This parameter is optional. If you pass a policy, the temporary security
     * credentials that are returned by the operation have the permissions that
     * are allowed by both (the intersection of) the access policy of the role
     * that is being assumed, <i>and</i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and
     * AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * string of characters up to 2048 characters in length. The characters can
     * be any ASCII character from the space character to the end of the valid
     * character list ( -\u00FF). It can also include the tab ( ), linefeed ( ),
     * and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal
     * conversion compresses it into a packed binary format with a separate
     * limit. The PackedPolicySize response element indicates by percentage how
     * close to the upper size limit the policy is, with 100% equaling the
     * maximum allowed size.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String policy;

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) up to the maximum session duration setting for
     * the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For
     * example, if you specify a session duration of 12 hours, but your
     * administrator set the maximum session duration to 6 hours, your operation
     * fails. To learn how to view the maximum value for your role, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to 3600 seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration
     * of a console session that you might request using the returned
     * credentials. The request to the federation endpoint for a console sign-in
     * token takes a <code>SessionDuration</code> parameter that specifies the
     * maximum length of the console session. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the AWS Management
     * Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 43200<br/>
     */
    private Integer durationSeconds;

    /**
     * <p>
     * A unique identifier that is used by third parties when assuming roles in
     * their customers' accounts. For each role that the third party can assume,
     * they should instruct their customers to ensure the role's trust policy
     * checks for the external ID that the third party generated. Each time the
     * third party assumes the role, they should pass the customer's external
     * ID. The external ID is useful in order to help third parties bind a role
     * to the customer who created it. For more information about the external
     * ID, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to Use an External ID When Granting Access to Your AWS Resources to
     * a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validated this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@:/-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 1224<br/>
     * <b>Pattern: </b>[\w+=,.@:\/-]*<br/>
     */
    private String externalId;

    /**
     * <p>
     * The identification number of the MFA device that is associated with the
     * user who is making the <code>AssumeRole</code> call. Specify this value
     * if the trust policy of the role being assumed includes a condition that
     * requires MFA authentication. The value is either the serial number for a
     * hardware device (such as <code>GAHT12345678</code>) or an Amazon Resource
     * Name (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     */
    private String serialNumber;

    /**
     * <p>
     * The value provided by the MFA device, if the trust policy of the role
     * being assumed requires MFA (that is, if the policy includes a condition
     * that tests for MFA). If the role being assumed requires MFA and if the
     * <code>TokenCode</code> value is missing or expired, the
     * <code>AssumeRole</code> call returns an "access denied" error.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * sequence of six numeric digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     */
    private String tokenCode;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the role to assume.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role to assume.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role to assume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * An identifier for the assumed role session.
     * </p>
     * <p>
     * Use the role session name to uniquely identify a session when the same
     * role is assumed by different principals or for different reasons. In
     * cross-account scenarios, the role session name is visible to, and can be
     * logged by the account that owns the role. The role session name is also
     * used in the ARN of the assumed role principal. This means that subsequent
     * cross-account API requests using the temporary security credentials will
     * expose the role session name to the external account in their CloudTrail
     * logs.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return <p>
     *         An identifier for the assumed role session.
     *         </p>
     *         <p>
     *         Use the role session name to uniquely identify a session when the
     *         same role is assumed by different principals or for different
     *         reasons. In cross-account scenarios, the role session name is
     *         visible to, and can be logged by the account that owns the role.
     *         The role session name is also used in the ARN of the assumed role
     *         principal. This means that subsequent cross-account API requests
     *         using the temporary security credentials will expose the role
     *         session name to the external account in their CloudTrail logs.
     *         </p>
     *         <p>
     *         The regex used to validate this parameter is a string of
     *         characters consisting of upper- and lower-case alphanumeric
     *         characters with no spaces. You can also include underscores or
     *         any of the following characters: =,.@-
     *         </p>
     */
    public String getRoleSessionName() {
        return roleSessionName;
    }

    /**
     * <p>
     * An identifier for the assumed role session.
     * </p>
     * <p>
     * Use the role session name to uniquely identify a session when the same
     * role is assumed by different principals or for different reasons. In
     * cross-account scenarios, the role session name is visible to, and can be
     * logged by the account that owns the role. The role session name is also
     * used in the ARN of the assumed role principal. This means that subsequent
     * cross-account API requests using the temporary security credentials will
     * expose the role session name to the external account in their CloudTrail
     * logs.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleSessionName <p>
     *            An identifier for the assumed role session.
     *            </p>
     *            <p>
     *            Use the role session name to uniquely identify a session when
     *            the same role is assumed by different principals or for
     *            different reasons. In cross-account scenarios, the role
     *            session name is visible to, and can be logged by the account
     *            that owns the role. The role session name is also used in the
     *            ARN of the assumed role principal. This means that subsequent
     *            cross-account API requests using the temporary security
     *            credentials will expose the role session name to the external
     *            account in their CloudTrail logs.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@-
     *            </p>
     */
    public void setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
    }

    /**
     * <p>
     * An identifier for the assumed role session.
     * </p>
     * <p>
     * Use the role session name to uniquely identify a session when the same
     * role is assumed by different principals or for different reasons. In
     * cross-account scenarios, the role session name is visible to, and can be
     * logged by the account that owns the role. The role session name is also
     * used in the ARN of the assumed role principal. This means that subsequent
     * cross-account API requests using the temporary security credentials will
     * expose the role session name to the external account in their CloudTrail
     * logs.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleSessionName <p>
     *            An identifier for the assumed role session.
     *            </p>
     *            <p>
     *            Use the role session name to uniquely identify a session when
     *            the same role is assumed by different principals or for
     *            different reasons. In cross-account scenarios, the role
     *            session name is visible to, and can be logged by the account
     *            that owns the role. The role session name is also used in the
     *            ARN of the assumed role principal. This means that subsequent
     *            cross-account API requests using the temporary security
     *            credentials will expose the role session name to the external
     *            account in their CloudTrail logs.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleRequest withRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
        return this;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * This parameter is optional. If you pass a policy, the temporary security
     * credentials that are returned by the operation have the permissions that
     * are allowed by both (the intersection of) the access policy of the role
     * that is being assumed, <i>and</i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and
     * AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * string of characters up to 2048 characters in length. The characters can
     * be any ASCII character from the space character to the end of the valid
     * character list ( -\u00FF). It can also include the tab ( ), linefeed ( ),
     * and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal
     * conversion compresses it into a packed binary format with a separate
     * limit. The PackedPolicySize response element indicates by percentage how
     * close to the upper size limit the policy is, with 100% equaling the
     * maximum allowed size.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         An IAM policy in JSON format.
     *         </p>
     *         <p>
     *         This parameter is optional. If you pass a policy, the temporary
     *         security credentials that are returned by the operation have the
     *         permissions that are allowed by both (the intersection of) the
     *         access policy of the role that is being assumed, <i>and</i> the
     *         policy that you pass. This gives you a way to further restrict
     *         the permissions for the resulting temporary security credentials.
     *         You cannot use the passed policy to grant permissions that are in
     *         excess of those allowed by the access policy of the role that is
     *         being assumed. For more information, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *         >Permissions for AssumeRole, AssumeRoleWithSAML, and
     *         AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The format for this parameter, as described by its regex pattern,
     *         is a string of characters up to 2048 characters in length. The
     *         characters can be any ASCII character from the space character to
     *         the end of the valid character list ( -\u00FF). It can also
     *         include the tab ( ), linefeed ( ), and carriage return ( )
     *         characters.
     *         </p>
     *         <note>
     *         <p>
     *         The policy plain text must be 2048 bytes or shorter. However, an
     *         internal conversion compresses it into a packed binary format
     *         with a separate limit. The PackedPolicySize response element
     *         indicates by percentage how close to the upper size limit the
     *         policy is, with 100% equaling the maximum allowed size.
     *         </p>
     *         </note>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * This parameter is optional. If you pass a policy, the temporary security
     * credentials that are returned by the operation have the permissions that
     * are allowed by both (the intersection of) the access policy of the role
     * that is being assumed, <i>and</i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and
     * AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * string of characters up to 2048 characters in length. The characters can
     * be any ASCII character from the space character to the end of the valid
     * character list ( -\u00FF). It can also include the tab ( ), linefeed ( ),
     * and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal
     * conversion compresses it into a packed binary format with a separate
     * limit. The PackedPolicySize response element indicates by percentage how
     * close to the upper size limit the policy is, with 100% equaling the
     * maximum allowed size.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            An IAM policy in JSON format.
     *            </p>
     *            <p>
     *            This parameter is optional. If you pass a policy, the
     *            temporary security credentials that are returned by the
     *            operation have the permissions that are allowed by both (the
     *            intersection of) the access policy of the role that is being
     *            assumed, <i>and</i> the policy that you pass. This gives you a
     *            way to further restrict the permissions for the resulting
     *            temporary security credentials. You cannot use the passed
     *            policy to grant permissions that are in excess of those
     *            allowed by the access policy of the role that is being
     *            assumed. For more information, see <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *            >Permissions for AssumeRole, AssumeRoleWithSAML, and
     *            AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The format for this parameter, as described by its regex
     *            pattern, is a string of characters up to 2048 characters in
     *            length. The characters can be any ASCII character from the
     *            space character to the end of the valid character list (
     *            -\u00FF). It can also include the tab ( ), linefeed ( ), and
     *            carriage return ( ) characters.
     *            </p>
     *            <note>
     *            <p>
     *            The policy plain text must be 2048 bytes or shorter. However,
     *            an internal conversion compresses it into a packed binary
     *            format with a separate limit. The PackedPolicySize response
     *            element indicates by percentage how close to the upper size
     *            limit the policy is, with 100% equaling the maximum allowed
     *            size.
     *            </p>
     *            </note>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * This parameter is optional. If you pass a policy, the temporary security
     * credentials that are returned by the operation have the permissions that
     * are allowed by both (the intersection of) the access policy of the role
     * that is being assumed, <i>and</i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and
     * AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * string of characters up to 2048 characters in length. The characters can
     * be any ASCII character from the space character to the end of the valid
     * character list ( -\u00FF). It can also include the tab ( ), linefeed ( ),
     * and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal
     * conversion compresses it into a packed binary format with a separate
     * limit. The PackedPolicySize response element indicates by percentage how
     * close to the upper size limit the policy is, with 100% equaling the
     * maximum allowed size.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            An IAM policy in JSON format.
     *            </p>
     *            <p>
     *            This parameter is optional. If you pass a policy, the
     *            temporary security credentials that are returned by the
     *            operation have the permissions that are allowed by both (the
     *            intersection of) the access policy of the role that is being
     *            assumed, <i>and</i> the policy that you pass. This gives you a
     *            way to further restrict the permissions for the resulting
     *            temporary security credentials. You cannot use the passed
     *            policy to grant permissions that are in excess of those
     *            allowed by the access policy of the role that is being
     *            assumed. For more information, see <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *            >Permissions for AssumeRole, AssumeRoleWithSAML, and
     *            AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The format for this parameter, as described by its regex
     *            pattern, is a string of characters up to 2048 characters in
     *            length. The characters can be any ASCII character from the
     *            space character to the end of the valid character list (
     *            -\u00FF). It can also include the tab ( ), linefeed ( ), and
     *            carriage return ( ) characters.
     *            </p>
     *            <note>
     *            <p>
     *            The policy plain text must be 2048 bytes or shorter. However,
     *            an internal conversion compresses it into a packed binary
     *            format with a separate limit. The PackedPolicySize response
     *            element indicates by percentage how close to the upper size
     *            limit the policy is, with 100% equaling the maximum allowed
     *            size.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) up to the maximum session duration setting for
     * the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For
     * example, if you specify a session duration of 12 hours, but your
     * administrator set the maximum session duration to 6 hours, your operation
     * fails. To learn how to view the maximum value for your role, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to 3600 seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration
     * of a console session that you might request using the returned
     * credentials. The request to the federation endpoint for a console sign-in
     * token takes a <code>SessionDuration</code> parameter that specifies the
     * maximum length of the console session. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the AWS Management
     * Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 43200<br/>
     *
     * @return <p>
     *         The duration, in seconds, of the role session. The value can
     *         range from 900 seconds (15 minutes) up to the maximum session
     *         duration setting for the role. This setting can have a value from
     *         1 hour to 12 hours. If you specify a value higher than this
     *         setting, the operation fails. For example, if you specify a
     *         session duration of 12 hours, but your administrator set the
     *         maximum session duration to 6 hours, your operation fails. To
     *         learn how to view the maximum value for your role, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *         >View the Maximum Session Duration Setting for a Role</a> in the
     *         <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         By default, the value is set to 3600 seconds.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>DurationSeconds</code> parameter is separate from the
     *         duration of a console session that you might request using the
     *         returned credentials. The request to the federation endpoint for
     *         a console sign-in token takes a <code>SessionDuration</code>
     *         parameter that specifies the maximum length of the console
     *         session. For more information, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *         >Creating a URL that Enables Federated Users to Access the AWS
     *         Management Console</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         </note>
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) up to the maximum session duration setting for
     * the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For
     * example, if you specify a session duration of 12 hours, but your
     * administrator set the maximum session duration to 6 hours, your operation
     * fails. To learn how to view the maximum value for your role, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to 3600 seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration
     * of a console session that you might request using the returned
     * credentials. The request to the federation endpoint for a console sign-in
     * token takes a <code>SessionDuration</code> parameter that specifies the
     * maximum length of the console session. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the AWS Management
     * Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 43200<br/>
     *
     * @param durationSeconds <p>
     *            The duration, in seconds, of the role session. The value can
     *            range from 900 seconds (15 minutes) up to the maximum session
     *            duration setting for the role. This setting can have a value
     *            from 1 hour to 12 hours. If you specify a value higher than
     *            this setting, the operation fails. For example, if you specify
     *            a session duration of 12 hours, but your administrator set the
     *            maximum session duration to 6 hours, your operation fails. To
     *            learn how to view the maximum value for your role, see <a
     *            href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *            >View the Maximum Session Duration Setting for a Role</a> in
     *            the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            By default, the value is set to 3600 seconds.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>DurationSeconds</code> parameter is separate from
     *            the duration of a console session that you might request using
     *            the returned credentials. The request to the federation
     *            endpoint for a console sign-in token takes a
     *            <code>SessionDuration</code> parameter that specifies the
     *            maximum length of the console session. For more information,
     *            see <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *            >Creating a URL that Enables Federated Users to Access the AWS
     *            Management Console</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            </note>
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) up to the maximum session duration setting for
     * the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For
     * example, if you specify a session duration of 12 hours, but your
     * administrator set the maximum session duration to 6 hours, your operation
     * fails. To learn how to view the maximum value for your role, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to 3600 seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration
     * of a console session that you might request using the returned
     * credentials. The request to the federation endpoint for a console sign-in
     * token takes a <code>SessionDuration</code> parameter that specifies the
     * maximum length of the console session. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the AWS Management
     * Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 43200<br/>
     *
     * @param durationSeconds <p>
     *            The duration, in seconds, of the role session. The value can
     *            range from 900 seconds (15 minutes) up to the maximum session
     *            duration setting for the role. This setting can have a value
     *            from 1 hour to 12 hours. If you specify a value higher than
     *            this setting, the operation fails. For example, if you specify
     *            a session duration of 12 hours, but your administrator set the
     *            maximum session duration to 6 hours, your operation fails. To
     *            learn how to view the maximum value for your role, see <a
     *            href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *            >View the Maximum Session Duration Setting for a Role</a> in
     *            the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            By default, the value is set to 3600 seconds.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>DurationSeconds</code> parameter is separate from
     *            the duration of a console session that you might request using
     *            the returned credentials. The request to the federation
     *            endpoint for a console sign-in token takes a
     *            <code>SessionDuration</code> parameter that specifies the
     *            maximum length of the console session. For more information,
     *            see <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *            >Creating a URL that Enables Federated Users to Access the AWS
     *            Management Console</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleRequest withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * <p>
     * A unique identifier that is used by third parties when assuming roles in
     * their customers' accounts. For each role that the third party can assume,
     * they should instruct their customers to ensure the role's trust policy
     * checks for the external ID that the third party generated. Each time the
     * third party assumes the role, they should pass the customer's external
     * ID. The external ID is useful in order to help third parties bind a role
     * to the customer who created it. For more information about the external
     * ID, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to Use an External ID When Granting Access to Your AWS Resources to
     * a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validated this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@:/-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 1224<br/>
     * <b>Pattern: </b>[\w+=,.@:\/-]*<br/>
     *
     * @return <p>
     *         A unique identifier that is used by third parties when assuming
     *         roles in their customers' accounts. For each role that the third
     *         party can assume, they should instruct their customers to ensure
     *         the role's trust policy checks for the external ID that the third
     *         party generated. Each time the third party assumes the role, they
     *         should pass the customer's external ID. The external ID is useful
     *         in order to help third parties bind a role to the customer who
     *         created it. For more information about the external ID, see <a
     *         href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     *         >How to Use an External ID When Granting Access to Your AWS
     *         Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The regex used to validated this parameter is a string of
     *         characters consisting of upper- and lower-case alphanumeric
     *         characters with no spaces. You can also include underscores or
     *         any of the following characters: =,.@:/-
     *         </p>
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * <p>
     * A unique identifier that is used by third parties when assuming roles in
     * their customers' accounts. For each role that the third party can assume,
     * they should instruct their customers to ensure the role's trust policy
     * checks for the external ID that the third party generated. Each time the
     * third party assumes the role, they should pass the customer's external
     * ID. The external ID is useful in order to help third parties bind a role
     * to the customer who created it. For more information about the external
     * ID, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to Use an External ID When Granting Access to Your AWS Resources to
     * a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validated this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@:/-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 1224<br/>
     * <b>Pattern: </b>[\w+=,.@:\/-]*<br/>
     *
     * @param externalId <p>
     *            A unique identifier that is used by third parties when
     *            assuming roles in their customers' accounts. For each role
     *            that the third party can assume, they should instruct their
     *            customers to ensure the role's trust policy checks for the
     *            external ID that the third party generated. Each time the
     *            third party assumes the role, they should pass the customer's
     *            external ID. The external ID is useful in order to help third
     *            parties bind a role to the customer who created it. For more
     *            information about the external ID, see <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     *            >How to Use an External ID When Granting Access to Your AWS
     *            Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The regex used to validated this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@:/-
     *            </p>
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * A unique identifier that is used by third parties when assuming roles in
     * their customers' accounts. For each role that the third party can assume,
     * they should instruct their customers to ensure the role's trust policy
     * checks for the external ID that the third party generated. Each time the
     * third party assumes the role, they should pass the customer's external
     * ID. The external ID is useful in order to help third parties bind a role
     * to the customer who created it. For more information about the external
     * ID, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to Use an External ID When Granting Access to Your AWS Resources to
     * a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validated this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@:/-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 1224<br/>
     * <b>Pattern: </b>[\w+=,.@:\/-]*<br/>
     *
     * @param externalId <p>
     *            A unique identifier that is used by third parties when
     *            assuming roles in their customers' accounts. For each role
     *            that the third party can assume, they should instruct their
     *            customers to ensure the role's trust policy checks for the
     *            external ID that the third party generated. Each time the
     *            third party assumes the role, they should pass the customer's
     *            external ID. The external ID is useful in order to help third
     *            parties bind a role to the customer who created it. For more
     *            information about the external ID, see <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     *            >How to Use an External ID When Granting Access to Your AWS
     *            Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The regex used to validated this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@:/-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleRequest withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the
     * user who is making the <code>AssumeRole</code> call. Specify this value
     * if the trust policy of the role being assumed includes a condition that
     * requires MFA authentication. The value is either the serial number for a
     * hardware device (such as <code>GAHT12345678</code>) or an Amazon Resource
     * Name (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @return <p>
     *         The identification number of the MFA device that is associated
     *         with the user who is making the <code>AssumeRole</code> call.
     *         Specify this value if the trust policy of the role being assumed
     *         includes a condition that requires MFA authentication. The value
     *         is either the serial number for a hardware device (such as
     *         <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a
     *         virtual device (such as
     *         <code>arn:aws:iam::123456789012:mfa/user</code>).
     *         </p>
     *         <p>
     *         The regex used to validate this parameter is a string of
     *         characters consisting of upper- and lower-case alphanumeric
     *         characters with no spaces. You can also include underscores or
     *         any of the following characters: =,.@-
     *         </p>
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the
     * user who is making the <code>AssumeRole</code> call. Specify this value
     * if the trust policy of the role being assumed includes a condition that
     * requires MFA authentication. The value is either the serial number for a
     * hardware device (such as <code>GAHT12345678</code>) or an Amazon Resource
     * Name (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber <p>
     *            The identification number of the MFA device that is associated
     *            with the user who is making the <code>AssumeRole</code> call.
     *            Specify this value if the trust policy of the role being
     *            assumed includes a condition that requires MFA authentication.
     *            The value is either the serial number for a hardware device
     *            (such as <code>GAHT12345678</code>) or an Amazon Resource Name
     *            (ARN) for a virtual device (such as
     *            <code>arn:aws:iam::123456789012:mfa/user</code>).
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@-
     *            </p>
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the
     * user who is making the <code>AssumeRole</code> call. Specify this value
     * if the trust policy of the role being assumed includes a condition that
     * requires MFA authentication. The value is either the serial number for a
     * hardware device (such as <code>GAHT12345678</code>) or an Amazon Resource
     * Name (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber <p>
     *            The identification number of the MFA device that is associated
     *            with the user who is making the <code>AssumeRole</code> call.
     *            Specify this value if the trust policy of the role being
     *            assumed includes a condition that requires MFA authentication.
     *            The value is either the serial number for a hardware device
     *            (such as <code>GAHT12345678</code>) or an Amazon Resource Name
     *            (ARN) for a virtual device (such as
     *            <code>arn:aws:iam::123456789012:mfa/user</code>).
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleRequest withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * <p>
     * The value provided by the MFA device, if the trust policy of the role
     * being assumed requires MFA (that is, if the policy includes a condition
     * that tests for MFA). If the role being assumed requires MFA and if the
     * <code>TokenCode</code> value is missing or expired, the
     * <code>AssumeRole</code> call returns an "access denied" error.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * sequence of six numeric digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @return <p>
     *         The value provided by the MFA device, if the trust policy of the
     *         role being assumed requires MFA (that is, if the policy includes
     *         a condition that tests for MFA). If the role being assumed
     *         requires MFA and if the <code>TokenCode</code> value is missing
     *         or expired, the <code>AssumeRole</code> call returns an
     *         "access denied" error.
     *         </p>
     *         <p>
     *         The format for this parameter, as described by its regex pattern,
     *         is a sequence of six numeric digits.
     *         </p>
     */
    public String getTokenCode() {
        return tokenCode;
    }

    /**
     * <p>
     * The value provided by the MFA device, if the trust policy of the role
     * being assumed requires MFA (that is, if the policy includes a condition
     * that tests for MFA). If the role being assumed requires MFA and if the
     * <code>TokenCode</code> value is missing or expired, the
     * <code>AssumeRole</code> call returns an "access denied" error.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * sequence of six numeric digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param tokenCode <p>
     *            The value provided by the MFA device, if the trust policy of
     *            the role being assumed requires MFA (that is, if the policy
     *            includes a condition that tests for MFA). If the role being
     *            assumed requires MFA and if the <code>TokenCode</code> value
     *            is missing or expired, the <code>AssumeRole</code> call
     *            returns an "access denied" error.
     *            </p>
     *            <p>
     *            The format for this parameter, as described by its regex
     *            pattern, is a sequence of six numeric digits.
     *            </p>
     */
    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }

    /**
     * <p>
     * The value provided by the MFA device, if the trust policy of the role
     * being assumed requires MFA (that is, if the policy includes a condition
     * that tests for MFA). If the role being assumed requires MFA and if the
     * <code>TokenCode</code> value is missing or expired, the
     * <code>AssumeRole</code> call returns an "access denied" error.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * sequence of six numeric digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param tokenCode <p>
     *            The value provided by the MFA device, if the trust policy of
     *            the role being assumed requires MFA (that is, if the policy
     *            includes a condition that tests for MFA). If the role being
     *            assumed requires MFA and if the <code>TokenCode</code> value
     *            is missing or expired, the <code>AssumeRole</code> call
     *            returns an "access denied" error.
     *            </p>
     *            <p>
     *            The format for this parameter, as described by its regex
     *            pattern, is a sequence of six numeric digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleRequest withTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
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
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getRoleSessionName() != null)
            sb.append("RoleSessionName: " + getRoleSessionName() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: " + getDurationSeconds() + ",");
        if (getExternalId() != null)
            sb.append("ExternalId: " + getExternalId() + ",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: " + getSerialNumber() + ",");
        if (getTokenCode() != null)
            sb.append("TokenCode: " + getTokenCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getRoleSessionName() == null) ? 0 : getRoleSessionName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode
                + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getTokenCode() == null) ? 0 : getTokenCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeRoleRequest == false)
            return false;
        AssumeRoleRequest other = (AssumeRoleRequest) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRoleSessionName() == null ^ this.getRoleSessionName() == null)
            return false;
        if (other.getRoleSessionName() != null
                && other.getRoleSessionName().equals(this.getRoleSessionName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null
                && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null
                && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null
                && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getTokenCode() == null ^ this.getTokenCode() == null)
            return false;
        if (other.getTokenCode() != null
                && other.getTokenCode().equals(this.getTokenCode()) == false)
            return false;
        return true;
    }
}
