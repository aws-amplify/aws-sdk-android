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
 * Returns a set of temporary security credentials that you can use to access
 * AWS resources that you might not normally have access to. These temporary
 * credentials consist of an access key ID, a secret access key, and a security
 * token. Typically, you use <code>AssumeRole</code> within your account or for
 * cross-account access. For a comparison of <code>AssumeRole</code> with other
 * API operations that produce temporary credentials, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html"
 * >Requesting Temporary Security Credentials</a> and <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
 * >Comparing the AWS STS API operations</a> in the <i>IAM User Guide</i>.
 * </p>
 * <important>
 * <p>
 * You cannot use AWS account root user credentials to call
 * <code>AssumeRole</code>. You must use credentials for an IAM user or an IAM
 * role to call <code>AssumeRole</code>.
 * </p>
 * </important>
 * <p>
 * For cross-account access, imagine that you own multiple accounts and need to
 * access resources in each account. You could create long-term credentials in
 * each account to access those resources. However, managing all those
 * credentials and remembering which one can access which account can be time
 * consuming. Instead, you can create one set of long-term credentials in one
 * account. Then use temporary security credentials to access all the other
 * accounts by assuming roles in those accounts. For more information about
 * roles, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM
 * Roles</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * By default, the temporary security credentials created by
 * <code>AssumeRole</code> last for one hour. However, you can use the optional
 * <code>DurationSeconds</code> parameter to specify the duration of your
 * session. You can provide a value from 900 seconds (15 minutes) up to the
 * maximum session duration setting for the role. This setting can have a value
 * from 1 hour to 12 hours. To learn how to view the maximum value for your
 * role, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
 * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User
 * Guide</i>. The maximum session duration limit applies when you use the
 * <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
 * commands. However the limit does not apply when you use those operations to
 * create a console URL. For more information, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html"
 * >Using IAM Roles</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * The temporary security credentials created by <code>AssumeRole</code> can be
 * used to make API calls to any AWS service with the following exception: You
 * cannot call the AWS STS <code>GetFederationToken</code> or
 * <code>GetSessionToken</code> API operations.
 * </p>
 * <p>
 * (Optional) You can pass inline or managed <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
 * >session policies</a> to this operation. You can pass a single JSON policy
 * document to use as an inline session policy. You can also specify up to 10
 * managed policies to use as managed session policies. The plain text that you
 * use for both inline and managed session policies shouldn't exceed 2048
 * characters. Passing policies to this operation returns new temporary
 * credentials. The resulting session's permissions are the intersection of the
 * role's identity-based policy and the session policies. You can use the role's
 * temporary credentials in subsequent AWS API calls to access resources in the
 * account that owns the role. You cannot use session policies to grant more
 * permissions than those allowed by the identity-based policy of the role that
 * is being assumed. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
 * >Session Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * To assume a role from a different account, your AWS account must be trusted
 * by the role. The trust relationship is defined in the role's trust policy
 * when the role is created. That trust policy states which accounts are allowed
 * to delegate that access to users in the account.
 * </p>
 * <p>
 * A user who wants to access a role in a different account must also have
 * permissions that are delegated from the user account administrator. The
 * administrator must attach a policy that allows the user to call
 * <code>AssumeRole</code> for the ARN of the role in the other account. If the
 * user is in the same account as the role, then you can do either of the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Attach a policy to the user (identical to the previous user in a different
 * account).
 * </p>
 * </li>
 * <li>
 * <p>
 * Add the user as a principal directly in the role's trust policy.
 * </p>
 * </li>
 * </ul>
 * <p>
 * In this case, the trust policy acts as an IAM resource-based policy. Users in
 * the same account as the role do not need explicit permission to assume the
 * role. For more information about trust policies and resource-based policies,
 * see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html">IAM
 * Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * <b>Using MFA with AssumeRole</b>
 * </p>
 * <p>
 * (Optional) You can include multi-factor authentication (MFA) information when
 * you call <code>AssumeRole</code>. This is useful for cross-account scenarios
 * to ensure that the user that assumes the role has been authenticated with an
 * AWS MFA device. In that scenario, the trust policy of the role being assumed
 * includes a condition that tests for MFA authentication. If the caller does
 * not include valid MFA information, the request to assume the role is denied.
 * The condition in a trust policy that tests for MFA authentication might look
 * like the following example.
 * </p>
 * <p>
 * <code>"Condition": {"Bool": {"aws:MultiFactorAuthPresent": true}}</code>
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/MFAProtectedAPI.html"
 * >Configuring MFA-Protected API Access</a> in the <i>IAM User Guide</i> guide.
 * </p>
 * <p>
 * To use MFA with <code>AssumeRole</code>, you pass values for the
 * <code>SerialNumber</code> and <code>TokenCode</code> parameters. The
 * <code>SerialNumber</code> value identifies the user's hardware or virtual MFA
 * device. The <code>TokenCode</code> is the time-based one-time password (TOTP)
 * that the MFA device produces.
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
     * cross-account API requests that use the temporary security credentials
     * will expose the role session name to the external account in their AWS
     * CloudTrail logs.
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
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as managed session policies. The policies must exist in the
     * same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs.
     * However, the plain text that you use for both inline and managed session
     * policies shouldn't exceed 2048 characters. For more information about
     * ARNs, see <a href="general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the AWS General
     * Reference.
     * </p>
     * <note>
     * <p>
     * The characters in this parameter count towards the 2048 character session
     * policy guideline. However, an AWS conversion compresses the session
     * policies into a packed binary format that has a separate limit. This is
     * the enforced limit. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policy is to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent AWS API calls to access resources in
     * the account that owns the role. You cannot use session policies to grant
     * more permissions than those allowed by the identity-based policy of the
     * role that is being assumed. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private java.util.List<PolicyDescriptorType> policyArns;

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session
     * policy.
     * </p>
     * <p>
     * This parameter is optional. Passing policies to this operation returns
     * new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session
     * policies. You can use the role's temporary credentials in subsequent AWS
     * API calls to access resources in the account that owns the role. You
     * cannot use session policies to grant more permissions than those allowed
     * by the identity-based policy of the role that is being assumed. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plain text that you use for both inline and managed session policies
     * shouldn't exceed 2048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The characters in this parameter count towards the 2048 character session
     * policy guideline. However, an AWS conversion compresses the session
     * policies into a packed binary format that has a separate limit. This is
     * the enforced limit. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policy is to the upper size limit.
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
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration
     * of a console session that you might request using the returned
     * credentials. The request to the federation endpoint for a console sign-in
     * token takes a <code>SessionDuration</code> parameter that specifies the
     * maximum length of the console session. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
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
     * A unique identifier that might be required when you assume a role in
     * another account. If the administrator of the account to which the role
     * belongs provided you with an external ID, then provide that value in the
     * <code>ExternalId</code> parameter. This value can be any string, such as
     * a passphrase or account number. A cross-account role is usually set up to
     * trust everyone in an account. Therefore, the administrator of the
     * trusting account might send an external ID to the administrator of the
     * trusted account. That way, only someone with the ID can assume the role,
     * rather than everyone in the account. For more information about the
     * external ID, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to Use an External ID When Granting Access to Your AWS Resources to
     * a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
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
     * cross-account API requests that use the temporary security credentials
     * will expose the role session name to the external account in their AWS
     * CloudTrail logs.
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
     *         that use the temporary security credentials will expose the role
     *         session name to the external account in their AWS CloudTrail
     *         logs.
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
     * cross-account API requests that use the temporary security credentials
     * will expose the role session name to the external account in their AWS
     * CloudTrail logs.
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
     *            cross-account API requests that use the temporary security
     *            credentials will expose the role session name to the external
     *            account in their AWS CloudTrail logs.
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
     * cross-account API requests that use the temporary security credentials
     * will expose the role session name to the external account in their AWS
     * CloudTrail logs.
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
     *            cross-account API requests that use the temporary security
     *            credentials will expose the role session name to the external
     *            account in their AWS CloudTrail logs.
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
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as managed session policies. The policies must exist in the
     * same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs.
     * However, the plain text that you use for both inline and managed session
     * policies shouldn't exceed 2048 characters. For more information about
     * ARNs, see <a href="general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the AWS General
     * Reference.
     * </p>
     * <note>
     * <p>
     * The characters in this parameter count towards the 2048 character session
     * policy guideline. However, an AWS conversion compresses the session
     * policies into a packed binary format that has a separate limit. This is
     * the enforced limit. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policy is to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent AWS API calls to access resources in
     * the account that owns the role. You cannot use session policies to grant
     * more permissions than those allowed by the identity-based policy of the
     * role that is being assumed. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARNs) of the IAM managed policies that
     *         you want to use as managed session policies. The policies must
     *         exist in the same account as the role.
     *         </p>
     *         <p>
     *         This parameter is optional. You can provide up to 10 managed
     *         policy ARNs. However, the plain text that you use for both inline
     *         and managed session policies shouldn't exceed 2048 characters.
     *         For more information about ARNs, see <a
     *         href="general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a> in the AWS
     *         General Reference.
     *         </p>
     *         <note>
     *         <p>
     *         The characters in this parameter count towards the 2048 character
     *         session policy guideline. However, an AWS conversion compresses
     *         the session policies into a packed binary format that has a
     *         separate limit. This is the enforced limit. The
     *         <code>PackedPolicySize</code> response element indicates by
     *         percentage how close the policy is to the upper size limit.
     *         </p>
     *         </note>
     *         <p>
     *         Passing policies to this operation returns new temporary
     *         credentials. The resulting session's permissions are the
     *         intersection of the role's identity-based policy and the session
     *         policies. You can use the role's temporary credentials in
     *         subsequent AWS API calls to access resources in the account that
     *         owns the role. You cannot use session policies to grant more
     *         permissions than those allowed by the identity-based policy of
     *         the role that is being assumed. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *         >Session Policies</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public java.util.List<PolicyDescriptorType> getPolicyArns() {
        return policyArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as managed session policies. The policies must exist in the
     * same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs.
     * However, the plain text that you use for both inline and managed session
     * policies shouldn't exceed 2048 characters. For more information about
     * ARNs, see <a href="general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the AWS General
     * Reference.
     * </p>
     * <note>
     * <p>
     * The characters in this parameter count towards the 2048 character session
     * policy guideline. However, an AWS conversion compresses the session
     * policies into a packed binary format that has a separate limit. This is
     * the enforced limit. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policy is to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent AWS API calls to access resources in
     * the account that owns the role. You cannot use session policies to grant
     * more permissions than those allowed by the identity-based policy of the
     * role that is being assumed. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @param policyArns <p>
     *            The Amazon Resource Names (ARNs) of the IAM managed policies
     *            that you want to use as managed session policies. The policies
     *            must exist in the same account as the role.
     *            </p>
     *            <p>
     *            This parameter is optional. You can provide up to 10 managed
     *            policy ARNs. However, the plain text that you use for both
     *            inline and managed session policies shouldn't exceed 2048
     *            characters. For more information about ARNs, see <a
     *            href="general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *            Resource Names (ARNs) and AWS Service Namespaces</a> in the
     *            AWS General Reference.
     *            </p>
     *            <note>
     *            <p>
     *            The characters in this parameter count towards the 2048
     *            character session policy guideline. However, an AWS conversion
     *            compresses the session policies into a packed binary format
     *            that has a separate limit. This is the enforced limit. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policy is to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            Passing policies to this operation returns new temporary
     *            credentials. The resulting session's permissions are the
     *            intersection of the role's identity-based policy and the
     *            session policies. You can use the role's temporary credentials
     *            in subsequent AWS API calls to access resources in the account
     *            that owns the role. You cannot use session policies to grant
     *            more permissions than those allowed by the identity-based
     *            policy of the role that is being assumed. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setPolicyArns(java.util.Collection<PolicyDescriptorType> policyArns) {
        if (policyArns == null) {
            this.policyArns = null;
            return;
        }

        this.policyArns = new java.util.ArrayList<PolicyDescriptorType>(policyArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as managed session policies. The policies must exist in the
     * same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs.
     * However, the plain text that you use for both inline and managed session
     * policies shouldn't exceed 2048 characters. For more information about
     * ARNs, see <a href="general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the AWS General
     * Reference.
     * </p>
     * <note>
     * <p>
     * The characters in this parameter count towards the 2048 character session
     * policy guideline. However, an AWS conversion compresses the session
     * policies into a packed binary format that has a separate limit. This is
     * the enforced limit. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policy is to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent AWS API calls to access resources in
     * the account that owns the role. You cannot use session policies to grant
     * more permissions than those allowed by the identity-based policy of the
     * role that is being assumed. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyArns <p>
     *            The Amazon Resource Names (ARNs) of the IAM managed policies
     *            that you want to use as managed session policies. The policies
     *            must exist in the same account as the role.
     *            </p>
     *            <p>
     *            This parameter is optional. You can provide up to 10 managed
     *            policy ARNs. However, the plain text that you use for both
     *            inline and managed session policies shouldn't exceed 2048
     *            characters. For more information about ARNs, see <a
     *            href="general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *            Resource Names (ARNs) and AWS Service Namespaces</a> in the
     *            AWS General Reference.
     *            </p>
     *            <note>
     *            <p>
     *            The characters in this parameter count towards the 2048
     *            character session policy guideline. However, an AWS conversion
     *            compresses the session policies into a packed binary format
     *            that has a separate limit. This is the enforced limit. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policy is to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            Passing policies to this operation returns new temporary
     *            credentials. The resulting session's permissions are the
     *            intersection of the role's identity-based policy and the
     *            session policies. You can use the role's temporary credentials
     *            in subsequent AWS API calls to access resources in the account
     *            that owns the role. You cannot use session policies to grant
     *            more permissions than those allowed by the identity-based
     *            policy of the role that is being assumed. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleRequest withPolicyArns(PolicyDescriptorType... policyArns) {
        if (getPolicyArns() == null) {
            this.policyArns = new java.util.ArrayList<PolicyDescriptorType>(policyArns.length);
        }
        for (PolicyDescriptorType value : policyArns) {
            this.policyArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as managed session policies. The policies must exist in the
     * same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs.
     * However, the plain text that you use for both inline and managed session
     * policies shouldn't exceed 2048 characters. For more information about
     * ARNs, see <a href="general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the AWS General
     * Reference.
     * </p>
     * <note>
     * <p>
     * The characters in this parameter count towards the 2048 character session
     * policy guideline. However, an AWS conversion compresses the session
     * policies into a packed binary format that has a separate limit. This is
     * the enforced limit. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policy is to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent AWS API calls to access resources in
     * the account that owns the role. You cannot use session policies to grant
     * more permissions than those allowed by the identity-based policy of the
     * role that is being assumed. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyArns <p>
     *            The Amazon Resource Names (ARNs) of the IAM managed policies
     *            that you want to use as managed session policies. The policies
     *            must exist in the same account as the role.
     *            </p>
     *            <p>
     *            This parameter is optional. You can provide up to 10 managed
     *            policy ARNs. However, the plain text that you use for both
     *            inline and managed session policies shouldn't exceed 2048
     *            characters. For more information about ARNs, see <a
     *            href="general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *            Resource Names (ARNs) and AWS Service Namespaces</a> in the
     *            AWS General Reference.
     *            </p>
     *            <note>
     *            <p>
     *            The characters in this parameter count towards the 2048
     *            character session policy guideline. However, an AWS conversion
     *            compresses the session policies into a packed binary format
     *            that has a separate limit. This is the enforced limit. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policy is to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            Passing policies to this operation returns new temporary
     *            credentials. The resulting session's permissions are the
     *            intersection of the role's identity-based policy and the
     *            session policies. You can use the role's temporary credentials
     *            in subsequent AWS API calls to access resources in the account
     *            that owns the role. You cannot use session policies to grant
     *            more permissions than those allowed by the identity-based
     *            policy of the role that is being assumed. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleRequest withPolicyArns(java.util.Collection<PolicyDescriptorType> policyArns) {
        setPolicyArns(policyArns);
        return this;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session
     * policy.
     * </p>
     * <p>
     * This parameter is optional. Passing policies to this operation returns
     * new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session
     * policies. You can use the role's temporary credentials in subsequent AWS
     * API calls to access resources in the account that owns the role. You
     * cannot use session policies to grant more permissions than those allowed
     * by the identity-based policy of the role that is being assumed. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plain text that you use for both inline and managed session policies
     * shouldn't exceed 2048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The characters in this parameter count towards the 2048 character session
     * policy guideline. However, an AWS conversion compresses the session
     * policies into a packed binary format that has a separate limit. This is
     * the enforced limit. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policy is to the upper size limit.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         An IAM policy in JSON format that you want to use as an inline
     *         session policy.
     *         </p>
     *         <p>
     *         This parameter is optional. Passing policies to this operation
     *         returns new temporary credentials. The resulting session's
     *         permissions are the intersection of the role's identity-based
     *         policy and the session policies. You can use the role's temporary
     *         credentials in subsequent AWS API calls to access resources in
     *         the account that owns the role. You cannot use session policies
     *         to grant more permissions than those allowed by the
     *         identity-based policy of the role that is being assumed. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *         >Session Policies</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The plain text that you use for both inline and managed session
     *         policies shouldn't exceed 2048 characters. The JSON policy
     *         characters can be any ASCII character from the space character to
     *         the end of the valid character list ( through \u00FF). It can
     *         also include the tab ( ), linefeed ( ), and carriage return ( )
     *         characters.
     *         </p>
     *         <note>
     *         <p>
     *         The characters in this parameter count towards the 2048 character
     *         session policy guideline. However, an AWS conversion compresses
     *         the session policies into a packed binary format that has a
     *         separate limit. This is the enforced limit. The
     *         <code>PackedPolicySize</code> response element indicates by
     *         percentage how close the policy is to the upper size limit.
     *         </p>
     *         </note>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session
     * policy.
     * </p>
     * <p>
     * This parameter is optional. Passing policies to this operation returns
     * new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session
     * policies. You can use the role's temporary credentials in subsequent AWS
     * API calls to access resources in the account that owns the role. You
     * cannot use session policies to grant more permissions than those allowed
     * by the identity-based policy of the role that is being assumed. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plain text that you use for both inline and managed session policies
     * shouldn't exceed 2048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The characters in this parameter count towards the 2048 character session
     * policy guideline. However, an AWS conversion compresses the session
     * policies into a packed binary format that has a separate limit. This is
     * the enforced limit. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policy is to the upper size limit.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            An IAM policy in JSON format that you want to use as an inline
     *            session policy.
     *            </p>
     *            <p>
     *            This parameter is optional. Passing policies to this operation
     *            returns new temporary credentials. The resulting session's
     *            permissions are the intersection of the role's identity-based
     *            policy and the session policies. You can use the role's
     *            temporary credentials in subsequent AWS API calls to access
     *            resources in the account that owns the role. You cannot use
     *            session policies to grant more permissions than those allowed
     *            by the identity-based policy of the role that is being
     *            assumed. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The plain text that you use for both inline and managed
     *            session policies shouldn't exceed 2048 characters. The JSON
     *            policy characters can be any ASCII character from the space
     *            character to the end of the valid character list ( through
     *            \u00FF). It can also include the tab ( ), linefeed ( ), and
     *            carriage return ( ) characters.
     *            </p>
     *            <note>
     *            <p>
     *            The characters in this parameter count towards the 2048
     *            character session policy guideline. However, an AWS conversion
     *            compresses the session policies into a packed binary format
     *            that has a separate limit. This is the enforced limit. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policy is to the upper size limit.
     *            </p>
     *            </note>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session
     * policy.
     * </p>
     * <p>
     * This parameter is optional. Passing policies to this operation returns
     * new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session
     * policies. You can use the role's temporary credentials in subsequent AWS
     * API calls to access resources in the account that owns the role. You
     * cannot use session policies to grant more permissions than those allowed
     * by the identity-based policy of the role that is being assumed. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plain text that you use for both inline and managed session policies
     * shouldn't exceed 2048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The characters in this parameter count towards the 2048 character session
     * policy guideline. However, an AWS conversion compresses the session
     * policies into a packed binary format that has a separate limit. This is
     * the enforced limit. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policy is to the upper size limit.
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
     *            An IAM policy in JSON format that you want to use as an inline
     *            session policy.
     *            </p>
     *            <p>
     *            This parameter is optional. Passing policies to this operation
     *            returns new temporary credentials. The resulting session's
     *            permissions are the intersection of the role's identity-based
     *            policy and the session policies. You can use the role's
     *            temporary credentials in subsequent AWS API calls to access
     *            resources in the account that owns the role. You cannot use
     *            session policies to grant more permissions than those allowed
     *            by the identity-based policy of the role that is being
     *            assumed. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The plain text that you use for both inline and managed
     *            session policies shouldn't exceed 2048 characters. The JSON
     *            policy characters can be any ASCII character from the space
     *            character to the end of the valid character list ( through
     *            \u00FF). It can also include the tab ( ), linefeed ( ), and
     *            carriage return ( ) characters.
     *            </p>
     *            <note>
     *            <p>
     *            The characters in this parameter count towards the 2048
     *            character session policy guideline. However, an AWS conversion
     *            compresses the session policies into a packed binary format
     *            that has a separate limit. This is the enforced limit. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policy is to the upper size limit.
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
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration
     * of a console session that you might request using the returned
     * credentials. The request to the federation endpoint for a console sign-in
     * token takes a <code>SessionDuration</code> parameter that specifies the
     * maximum length of the console session. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
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
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *         >View the Maximum Session Duration Setting for a Role</a> in the
     *         <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         By default, the value is set to <code>3600</code> seconds.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>DurationSeconds</code> parameter is separate from the
     *         duration of a console session that you might request using the
     *         returned credentials. The request to the federation endpoint for
     *         a console sign-in token takes a <code>SessionDuration</code>
     *         parameter that specifies the maximum length of the console
     *         session. For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
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
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration
     * of a console session that you might request using the returned
     * credentials. The request to the federation endpoint for a console sign-in
     * token takes a <code>SessionDuration</code> parameter that specifies the
     * maximum length of the console session. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
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
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *            >View the Maximum Session Duration Setting for a Role</a> in
     *            the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            By default, the value is set to <code>3600</code> seconds.
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
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
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
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration
     * of a console session that you might request using the returned
     * credentials. The request to the federation endpoint for a console sign-in
     * token takes a <code>SessionDuration</code> parameter that specifies the
     * maximum length of the console session. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
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
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *            >View the Maximum Session Duration Setting for a Role</a> in
     *            the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            By default, the value is set to <code>3600</code> seconds.
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
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
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
     * A unique identifier that might be required when you assume a role in
     * another account. If the administrator of the account to which the role
     * belongs provided you with an external ID, then provide that value in the
     * <code>ExternalId</code> parameter. This value can be any string, such as
     * a passphrase or account number. A cross-account role is usually set up to
     * trust everyone in an account. Therefore, the administrator of the
     * trusting account might send an external ID to the administrator of the
     * trusted account. That way, only someone with the ID can assume the role,
     * rather than everyone in the account. For more information about the
     * external ID, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to Use an External ID When Granting Access to Your AWS Resources to
     * a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
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
     *         A unique identifier that might be required when you assume a role
     *         in another account. If the administrator of the account to which
     *         the role belongs provided you with an external ID, then provide
     *         that value in the <code>ExternalId</code> parameter. This value
     *         can be any string, such as a passphrase or account number. A
     *         cross-account role is usually set up to trust everyone in an
     *         account. Therefore, the administrator of the trusting account
     *         might send an external ID to the administrator of the trusted
     *         account. That way, only someone with the ID can assume the role,
     *         rather than everyone in the account. For more information about
     *         the external ID, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     *         >How to Use an External ID When Granting Access to Your AWS
     *         Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The regex used to validate this parameter is a string of
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
     * A unique identifier that might be required when you assume a role in
     * another account. If the administrator of the account to which the role
     * belongs provided you with an external ID, then provide that value in the
     * <code>ExternalId</code> parameter. This value can be any string, such as
     * a passphrase or account number. A cross-account role is usually set up to
     * trust everyone in an account. Therefore, the administrator of the
     * trusting account might send an external ID to the administrator of the
     * trusted account. That way, only someone with the ID can assume the role,
     * rather than everyone in the account. For more information about the
     * external ID, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to Use an External ID When Granting Access to Your AWS Resources to
     * a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
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
     *            A unique identifier that might be required when you assume a
     *            role in another account. If the administrator of the account
     *            to which the role belongs provided you with an external ID,
     *            then provide that value in the <code>ExternalId</code>
     *            parameter. This value can be any string, such as a passphrase
     *            or account number. A cross-account role is usually set up to
     *            trust everyone in an account. Therefore, the administrator of
     *            the trusting account might send an external ID to the
     *            administrator of the trusted account. That way, only someone
     *            with the ID can assume the role, rather than everyone in the
     *            account. For more information about the external ID, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     *            >How to Use an External ID When Granting Access to Your AWS
     *            Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
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
     * A unique identifier that might be required when you assume a role in
     * another account. If the administrator of the account to which the role
     * belongs provided you with an external ID, then provide that value in the
     * <code>ExternalId</code> parameter. This value can be any string, such as
     * a passphrase or account number. A cross-account role is usually set up to
     * trust everyone in an account. Therefore, the administrator of the
     * trusting account might send an external ID to the administrator of the
     * trusted account. That way, only someone with the ID can assume the role,
     * rather than everyone in the account. For more information about the
     * external ID, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to Use an External ID When Granting Access to Your AWS Resources to
     * a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
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
     *            A unique identifier that might be required when you assume a
     *            role in another account. If the administrator of the account
     *            to which the role belongs provided you with an external ID,
     *            then provide that value in the <code>ExternalId</code>
     *            parameter. This value can be any string, such as a passphrase
     *            or account number. A cross-account role is usually set up to
     *            trust everyone in an account. Therefore, the administrator of
     *            the trusting account might send an external ID to the
     *            administrator of the trusted account. That way, only someone
     *            with the ID can assume the role, rather than everyone in the
     *            account. For more information about the external ID, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     *            >How to Use an External ID When Granting Access to Your AWS
     *            Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
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
        if (getPolicyArns() != null)
            sb.append("PolicyArns: " + getPolicyArns() + ",");
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
        hashCode = prime * hashCode + ((getPolicyArns() == null) ? 0 : getPolicyArns().hashCode());
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
        if (other.getPolicyArns() == null ^ this.getPolicyArns() == null)
            return false;
        if (other.getPolicyArns() != null
                && other.getPolicyArns().equals(this.getPolicyArns()) == false)
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
