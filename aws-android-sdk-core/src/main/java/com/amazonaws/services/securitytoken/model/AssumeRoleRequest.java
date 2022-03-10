/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon Web Services resources that you might not normally have access to.
 * These temporary credentials consist of an access key ID, a secret access key,
 * and a security token. Typically, you use <code>AssumeRole</code> within your
 * account or for cross-account access. For a comparison of
 * <code>AssumeRole</code> with other API operations that produce temporary
 * credentials, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html"
 * >Requesting Temporary Security Credentials</a> and <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
 * >Comparing the Amazon Web Services STS API operations</a> in the <i>IAM User
 * Guide</i>.
 * </p>
 * <p>
 * <b>Permissions</b>
 * </p>
 * <p>
 * The temporary security credentials created by <code>AssumeRole</code> can be
 * used to make API calls to any Amazon Web Services service with the following
 * exception: You cannot call the Amazon Web Services STS
 * <code>GetFederationToken</code> or <code>GetSessionToken</code> API
 * operations.
 * </p>
 * <p>
 * (Optional) You can pass inline or managed <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
 * >session policies</a> to this operation. You can pass a single JSON policy
 * document to use as an inline session policy. You can also specify up to 10
 * managed policies to use as managed session policies. The plaintext that you
 * use for both inline and managed session policies can't exceed 2,048
 * characters. Passing policies to this operation returns new temporary
 * credentials. The resulting session's permissions are the intersection of the
 * role's identity-based policy and the session policies. You can use the role's
 * temporary credentials in subsequent Amazon Web Services API calls to access
 * resources in the account that owns the role. You cannot use session policies
 * to grant more permissions than those allowed by the identity-based policy of
 * the role that is being assumed. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
 * >Session Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * When you create a role, you create two policies: A role trust policy that
 * specifies <i>who</i> can assume the role and a permissions policy that
 * specifies <i>what</i> can be done with the role. You specify the trusted
 * principal who is allowed to assume the role in the role trust policy.
 * </p>
 * <p>
 * To assume a role from a different account, your Amazon Web Services account
 * must be trusted by the role. The trust relationship is defined in the role's
 * trust policy when the role is created. That trust policy states which
 * accounts are allowed to delegate that access to users in the account.
 * </p>
 * <p>
 * A user who wants to access a role in a different account must also have
 * permissions that are delegated from the user account administrator. The
 * administrator must attach a policy that allows the user to call
 * <code>AssumeRole</code> for the ARN of the role in the other account.
 * </p>
 * <p>
 * To allow a user to assume a role in the same account, you can do either of
 * the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Attach a policy to the user that allows the user to call
 * <code>AssumeRole</code> (as long as the role's trust policy trusts the
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
 * You can do either because the role’s trust policy acts as an IAM
 * resource-based policy. When a resource-based policy grants access to a
 * principal in the same account, no additional identity-based policy is
 * required. For more information about trust policies and resource-based
 * policies, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html">IAM
 * Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * <b>Tags</b>
 * </p>
 * <p>
 * (Optional) You can pass tag key-value pairs to your session. These tags are
 * called session tags. For more information about session tags, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
 * >Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * An administrator must grant you the permissions necessary to pass session
 * tags. The administrator can also create granular permissions to allow you to
 * pass only specific session tags. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html"
 * >Tutorial: Using Tags for Attribute-Based Access Control</a> in the <i>IAM
 * User Guide</i>.
 * </p>
 * <p>
 * You can set the session tags as transitive. Transitive tags persist during
 * role chaining. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
 * >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * <b>Using MFA with AssumeRole</b>
 * </p>
 * <p>
 * (Optional) You can include multi-factor authentication (MFA) information when
 * you call <code>AssumeRole</code>. This is useful for cross-account scenarios
 * to ensure that the user that assumes the role has been authenticated with an
 * Amazon Web Services MFA device. In that scenario, the trust policy of the
 * role being assumed includes a condition that tests for MFA authentication. If
 * the caller does not include valid MFA information, the request to assume the
 * role is denied. The condition in a trust policy that tests for MFA
 * authentication might look like the following example.
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
     * will expose the role session name to the external account in their
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
     * However, the plaintext that you use for both inline and managed session
     * policies can't exceed 2,048 characters. For more information about ARNs,
     * see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent Amazon Web Services API calls to
     * access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the
     * identity-based policy of the role that is being assumed. For more
     * information, see <a href=
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
     * policies. You can use the role's temporary credentials in subsequent
     * Amazon Web Services API calls to access resources in the account that
     * owns the role. You cannot use session policies to grant more permissions
     * than those allowed by the identity-based policy of the role that is being
     * assumed. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies
     * can't exceed 2,048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
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
     * The duration, in seconds, of the role session. The value specified can
     * range from 900 seconds (15 minutes) up to the maximum session duration
     * set for the role. The maximum session duration setting can have a value
     * from 1 hour to 12 hours. If you specify a value higher than this setting
     * or the administrator setting (whichever is lower), the operation fails.
     * For example, if you specify a session duration of 12 hours, but your
     * administrator set the maximum session duration to 6 hours, your operation
     * fails.
     * </p>
     * <p>
     * Role chaining limits your Amazon Web Services CLI or Amazon Web Services
     * API role session to a maximum of one hour. When you use the
     * <code>AssumeRole</code> API operation to assume a role, you can specify
     * the duration of your role session with the <code>DurationSeconds</code>
     * parameter. You can specify a parameter value of up to 43200 seconds (12
     * hours), depending on the maximum session duration setting for your role.
     * However, if you assume a role using role chaining and provide a
     * <code>DurationSeconds</code> parameter value greater than one hour, the
     * operation fails. To learn how to view the maximum value for your role,
     * see <a href=
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
     * >Creating a URL that Enables Federated Users to Access the Amazon Web
     * Services Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 43200<br/>
     */
    private Integer durationSeconds;

    /**
     * <p>
     * A list of session tags that you want to pass. Each session tag consists
     * of a key name and an associated value. For more information about session
     * tags, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     * >Tagging Amazon Web Services STS Sessions</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The
     * plaintext session tag keys can’t exceed 128 characters, and the values
     * can’t exceed 256 characters. For these and additional limits, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already
     * attached to the role. When you do, session tags override a role tag with
     * the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This
     * means that you cannot have separate <code>Department</code> and
     * <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the
     * <code>department</code>=<code>engineering</code> session tag.
     * <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence
     * over the role tag.
     * </p>
     * <p>
     * Additionally, if you used temporary credentials to perform this
     * operation, the new session inherits any transitive session tags from the
     * calling session. If you pass a session tag with the same key as an
     * inherited tag, the operation fails. To view the inherited tags for a
     * session, see the CloudTrail logs. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_ctlogs"
     * >Viewing Session Tags in CloudTrail</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A list of keys for session tags that you want to set as transitive. If
     * you set a tag key as transitive, the corresponding key and value passes
     * to subsequent sessions in a role chain. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     * >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. When you set session tags as transitive, the
     * session policy and session tags packed binary limit is not affected.
     * </p>
     * <p>
     * If you choose not to specify a transitive tag key, then no tags are
     * passed from this session to any subsequent sessions.
     * </p>
     */
    private java.util.List<String> transitiveTagKeys;

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
     * >How to Use an External ID When Granting Access to Your Amazon Web
     * Services Resources to a Third Party</a> in the <i>IAM User Guide</i>.
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
     * being assumed requires MFA. (In other words, if the policy includes a
     * condition that tests for MFA). If the role being assumed requires MFA and
     * if the <code>TokenCode</code> value is missing or expired, the
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
     * The source identity specified by the principal that is calling the
     * <code>AssumeRole</code> operation.
     * </p>
     * <p>
     * You can require users to specify a source identity when they assume a
     * role. You do this by using the <code>sts:SourceIdentity</code> condition
     * key in a role trust policy. You can use source identity information in
     * CloudTrail logs to determine who took actions with a role. You can use
     * the <code>aws:SourceIdentity</code> condition key to further control
     * access to Amazon Web Services resources based on the value of source
     * identity. For more information about using source identity, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >Monitor and control actions taken with assumed roles</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-. You cannot use a value that begins with the text
     * <code>aws:</code>. This prefix is reserved for Amazon Web Services
     * internal use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String sourceIdentity;

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
     * will expose the role session name to the external account in their
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
     * cross-account API requests that use the temporary security credentials
     * will expose the role session name to the external account in their
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
     * cross-account API requests that use the temporary security credentials
     * will expose the role session name to the external account in their
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
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as managed session policies. The policies must exist in the
     * same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs.
     * However, the plaintext that you use for both inline and managed session
     * policies can't exceed 2,048 characters. For more information about ARNs,
     * see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent Amazon Web Services API calls to
     * access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the
     * identity-based policy of the role that is being assumed. For more
     * information, see <a href=
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
     *         policy ARNs. However, the plaintext that you use for both inline
     *         and managed session policies can't exceed 2,048 characters. For
     *         more information about ARNs, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *         Namespaces</a> in the Amazon Web Services General Reference.
     *         </p>
     *         <note>
     *         <p>
     *         An Amazon Web Services conversion compresses the passed session
     *         policies and session tags into a packed binary format that has a
     *         separate limit. Your request can fail for this limit even if your
     *         plaintext meets the other requirements. The
     *         <code>PackedPolicySize</code> response element indicates by
     *         percentage how close the policies and tags for your request are
     *         to the upper size limit.
     *         </p>
     *         </note>
     *         <p>
     *         Passing policies to this operation returns new temporary
     *         credentials. The resulting session's permissions are the
     *         intersection of the role's identity-based policy and the session
     *         policies. You can use the role's temporary credentials in
     *         subsequent Amazon Web Services API calls to access resources in
     *         the account that owns the role. You cannot use session policies
     *         to grant more permissions than those allowed by the
     *         identity-based policy of the role that is being assumed. For more
     *         information, see <a href=
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
     * However, the plaintext that you use for both inline and managed session
     * policies can't exceed 2,048 characters. For more information about ARNs,
     * see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent Amazon Web Services API calls to
     * access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the
     * identity-based policy of the role that is being assumed. For more
     * information, see <a href=
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
     *            policy ARNs. However, the plaintext that you use for both
     *            inline and managed session policies can't exceed 2,048
     *            characters. For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *            Namespaces</a> in the Amazon Web Services General Reference.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            Passing policies to this operation returns new temporary
     *            credentials. The resulting session's permissions are the
     *            intersection of the role's identity-based policy and the
     *            session policies. You can use the role's temporary credentials
     *            in subsequent Amazon Web Services API calls to access
     *            resources in the account that owns the role. You cannot use
     *            session policies to grant more permissions than those allowed
     *            by the identity-based policy of the role that is being
     *            assumed. For more information, see <a href=
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
     * However, the plaintext that you use for both inline and managed session
     * policies can't exceed 2,048 characters. For more information about ARNs,
     * see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent Amazon Web Services API calls to
     * access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the
     * identity-based policy of the role that is being assumed. For more
     * information, see <a href=
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
     *            policy ARNs. However, the plaintext that you use for both
     *            inline and managed session policies can't exceed 2,048
     *            characters. For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *            Namespaces</a> in the Amazon Web Services General Reference.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            Passing policies to this operation returns new temporary
     *            credentials. The resulting session's permissions are the
     *            intersection of the role's identity-based policy and the
     *            session policies. You can use the role's temporary credentials
     *            in subsequent Amazon Web Services API calls to access
     *            resources in the account that owns the role. You cannot use
     *            session policies to grant more permissions than those allowed
     *            by the identity-based policy of the role that is being
     *            assumed. For more information, see <a href=
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
     * However, the plaintext that you use for both inline and managed session
     * policies can't exceed 2,048 characters. For more information about ARNs,
     * see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent Amazon Web Services API calls to
     * access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the
     * identity-based policy of the role that is being assumed. For more
     * information, see <a href=
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
     *            policy ARNs. However, the plaintext that you use for both
     *            inline and managed session policies can't exceed 2,048
     *            characters. For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *            Namespaces</a> in the Amazon Web Services General Reference.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            Passing policies to this operation returns new temporary
     *            credentials. The resulting session's permissions are the
     *            intersection of the role's identity-based policy and the
     *            session policies. You can use the role's temporary credentials
     *            in subsequent Amazon Web Services API calls to access
     *            resources in the account that owns the role. You cannot use
     *            session policies to grant more permissions than those allowed
     *            by the identity-based policy of the role that is being
     *            assumed. For more information, see <a href=
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
     * policies. You can use the role's temporary credentials in subsequent
     * Amazon Web Services API calls to access resources in the account that
     * owns the role. You cannot use session policies to grant more permissions
     * than those allowed by the identity-based policy of the role that is being
     * assumed. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies
     * can't exceed 2,048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
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
     *         credentials in subsequent Amazon Web Services API calls to access
     *         resources in the account that owns the role. You cannot use
     *         session policies to grant more permissions than those allowed by
     *         the identity-based policy of the role that is being assumed. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *         >Session Policies</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The plaintext that you use for both inline and managed session
     *         policies can't exceed 2,048 characters. The JSON policy
     *         characters can be any ASCII character from the space character to
     *         the end of the valid character list ( through \u00FF). It can
     *         also include the tab ( ), linefeed ( ), and carriage return ( )
     *         characters.
     *         </p>
     *         <note>
     *         <p>
     *         An Amazon Web Services conversion compresses the passed session
     *         policies and session tags into a packed binary format that has a
     *         separate limit. Your request can fail for this limit even if your
     *         plaintext meets the other requirements. The
     *         <code>PackedPolicySize</code> response element indicates by
     *         percentage how close the policies and tags for your request are
     *         to the upper size limit.
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
     * policies. You can use the role's temporary credentials in subsequent
     * Amazon Web Services API calls to access resources in the account that
     * owns the role. You cannot use session policies to grant more permissions
     * than those allowed by the identity-based policy of the role that is being
     * assumed. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies
     * can't exceed 2,048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
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
     *            temporary credentials in subsequent Amazon Web Services API
     *            calls to access resources in the account that owns the role.
     *            You cannot use session policies to grant more permissions than
     *            those allowed by the identity-based policy of the role that is
     *            being assumed. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The plaintext that you use for both inline and managed session
     *            policies can't exceed 2,048 characters. The JSON policy
     *            characters can be any ASCII character from the space character
     *            to the end of the valid character list ( through \u00FF). It
     *            can also include the tab ( ), linefeed ( ), and carriage
     *            return ( ) characters.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
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
     * policies. You can use the role's temporary credentials in subsequent
     * Amazon Web Services API calls to access resources in the account that
     * owns the role. You cannot use session policies to grant more permissions
     * than those allowed by the identity-based policy of the role that is being
     * assumed. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies
     * can't exceed 2,048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
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
     *            temporary credentials in subsequent Amazon Web Services API
     *            calls to access resources in the account that owns the role.
     *            You cannot use session policies to grant more permissions than
     *            those allowed by the identity-based policy of the role that is
     *            being assumed. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The plaintext that you use for both inline and managed session
     *            policies can't exceed 2,048 characters. The JSON policy
     *            characters can be any ASCII character from the space character
     *            to the end of the valid character list ( through \u00FF). It
     *            can also include the tab ( ), linefeed ( ), and carriage
     *            return ( ) characters.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
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
     * The duration, in seconds, of the role session. The value specified can
     * range from 900 seconds (15 minutes) up to the maximum session duration
     * set for the role. The maximum session duration setting can have a value
     * from 1 hour to 12 hours. If you specify a value higher than this setting
     * or the administrator setting (whichever is lower), the operation fails.
     * For example, if you specify a session duration of 12 hours, but your
     * administrator set the maximum session duration to 6 hours, your operation
     * fails.
     * </p>
     * <p>
     * Role chaining limits your Amazon Web Services CLI or Amazon Web Services
     * API role session to a maximum of one hour. When you use the
     * <code>AssumeRole</code> API operation to assume a role, you can specify
     * the duration of your role session with the <code>DurationSeconds</code>
     * parameter. You can specify a parameter value of up to 43200 seconds (12
     * hours), depending on the maximum session duration setting for your role.
     * However, if you assume a role using role chaining and provide a
     * <code>DurationSeconds</code> parameter value greater than one hour, the
     * operation fails. To learn how to view the maximum value for your role,
     * see <a href=
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
     * >Creating a URL that Enables Federated Users to Access the Amazon Web
     * Services Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 43200<br/>
     *
     * @return <p>
     *         The duration, in seconds, of the role session. The value
     *         specified can range from 900 seconds (15 minutes) up to the
     *         maximum session duration set for the role. The maximum session
     *         duration setting can have a value from 1 hour to 12 hours. If you
     *         specify a value higher than this setting or the administrator
     *         setting (whichever is lower), the operation fails. For example,
     *         if you specify a session duration of 12 hours, but your
     *         administrator set the maximum session duration to 6 hours, your
     *         operation fails.
     *         </p>
     *         <p>
     *         Role chaining limits your Amazon Web Services CLI or Amazon Web
     *         Services API role session to a maximum of one hour. When you use
     *         the <code>AssumeRole</code> API operation to assume a role, you
     *         can specify the duration of your role session with the
     *         <code>DurationSeconds</code> parameter. You can specify a
     *         parameter value of up to 43200 seconds (12 hours), depending on
     *         the maximum session duration setting for your role. However, if
     *         you assume a role using role chaining and provide a
     *         <code>DurationSeconds</code> parameter value greater than one
     *         hour, the operation fails. To learn how to view the maximum value
     *         for your role, see <a href=
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
     *         >Creating a URL that Enables Federated Users to Access the Amazon
     *         Web Services Management Console</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         </note>
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value specified can
     * range from 900 seconds (15 minutes) up to the maximum session duration
     * set for the role. The maximum session duration setting can have a value
     * from 1 hour to 12 hours. If you specify a value higher than this setting
     * or the administrator setting (whichever is lower), the operation fails.
     * For example, if you specify a session duration of 12 hours, but your
     * administrator set the maximum session duration to 6 hours, your operation
     * fails.
     * </p>
     * <p>
     * Role chaining limits your Amazon Web Services CLI or Amazon Web Services
     * API role session to a maximum of one hour. When you use the
     * <code>AssumeRole</code> API operation to assume a role, you can specify
     * the duration of your role session with the <code>DurationSeconds</code>
     * parameter. You can specify a parameter value of up to 43200 seconds (12
     * hours), depending on the maximum session duration setting for your role.
     * However, if you assume a role using role chaining and provide a
     * <code>DurationSeconds</code> parameter value greater than one hour, the
     * operation fails. To learn how to view the maximum value for your role,
     * see <a href=
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
     * >Creating a URL that Enables Federated Users to Access the Amazon Web
     * Services Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 43200<br/>
     *
     * @param durationSeconds <p>
     *            The duration, in seconds, of the role session. The value
     *            specified can range from 900 seconds (15 minutes) up to the
     *            maximum session duration set for the role. The maximum session
     *            duration setting can have a value from 1 hour to 12 hours. If
     *            you specify a value higher than this setting or the
     *            administrator setting (whichever is lower), the operation
     *            fails. For example, if you specify a session duration of 12
     *            hours, but your administrator set the maximum session duration
     *            to 6 hours, your operation fails.
     *            </p>
     *            <p>
     *            Role chaining limits your Amazon Web Services CLI or Amazon
     *            Web Services API role session to a maximum of one hour. When
     *            you use the <code>AssumeRole</code> API operation to assume a
     *            role, you can specify the duration of your role session with
     *            the <code>DurationSeconds</code> parameter. You can specify a
     *            parameter value of up to 43200 seconds (12 hours), depending
     *            on the maximum session duration setting for your role.
     *            However, if you assume a role using role chaining and provide
     *            a <code>DurationSeconds</code> parameter value greater than
     *            one hour, the operation fails. To learn how to view the
     *            maximum value for your role, see <a href=
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
     *            >Creating a URL that Enables Federated Users to Access the
     *            Amazon Web Services Management Console</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     *            </note>
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value specified can
     * range from 900 seconds (15 minutes) up to the maximum session duration
     * set for the role. The maximum session duration setting can have a value
     * from 1 hour to 12 hours. If you specify a value higher than this setting
     * or the administrator setting (whichever is lower), the operation fails.
     * For example, if you specify a session duration of 12 hours, but your
     * administrator set the maximum session duration to 6 hours, your operation
     * fails.
     * </p>
     * <p>
     * Role chaining limits your Amazon Web Services CLI or Amazon Web Services
     * API role session to a maximum of one hour. When you use the
     * <code>AssumeRole</code> API operation to assume a role, you can specify
     * the duration of your role session with the <code>DurationSeconds</code>
     * parameter. You can specify a parameter value of up to 43200 seconds (12
     * hours), depending on the maximum session duration setting for your role.
     * However, if you assume a role using role chaining and provide a
     * <code>DurationSeconds</code> parameter value greater than one hour, the
     * operation fails. To learn how to view the maximum value for your role,
     * see <a href=
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
     * >Creating a URL that Enables Federated Users to Access the Amazon Web
     * Services Management Console</a> in the <i>IAM User Guide</i>.
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
     *            The duration, in seconds, of the role session. The value
     *            specified can range from 900 seconds (15 minutes) up to the
     *            maximum session duration set for the role. The maximum session
     *            duration setting can have a value from 1 hour to 12 hours. If
     *            you specify a value higher than this setting or the
     *            administrator setting (whichever is lower), the operation
     *            fails. For example, if you specify a session duration of 12
     *            hours, but your administrator set the maximum session duration
     *            to 6 hours, your operation fails.
     *            </p>
     *            <p>
     *            Role chaining limits your Amazon Web Services CLI or Amazon
     *            Web Services API role session to a maximum of one hour. When
     *            you use the <code>AssumeRole</code> API operation to assume a
     *            role, you can specify the duration of your role session with
     *            the <code>DurationSeconds</code> parameter. You can specify a
     *            parameter value of up to 43200 seconds (12 hours), depending
     *            on the maximum session duration setting for your role.
     *            However, if you assume a role using role chaining and provide
     *            a <code>DurationSeconds</code> parameter value greater than
     *            one hour, the operation fails. To learn how to view the
     *            maximum value for your role, see <a href=
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
     *            >Creating a URL that Enables Federated Users to Access the
     *            Amazon Web Services Management Console</a> in the <i>IAM User
     *            Guide</i>.
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
     * A list of session tags that you want to pass. Each session tag consists
     * of a key name and an associated value. For more information about session
     * tags, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     * >Tagging Amazon Web Services STS Sessions</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The
     * plaintext session tag keys can’t exceed 128 characters, and the values
     * can’t exceed 256 characters. For these and additional limits, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already
     * attached to the role. When you do, session tags override a role tag with
     * the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This
     * means that you cannot have separate <code>Department</code> and
     * <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the
     * <code>department</code>=<code>engineering</code> session tag.
     * <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence
     * over the role tag.
     * </p>
     * <p>
     * Additionally, if you used temporary credentials to perform this
     * operation, the new session inherits any transitive session tags from the
     * calling session. If you pass a session tag with the same key as an
     * inherited tag, the operation fails. To view the inherited tags for a
     * session, see the CloudTrail logs. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_ctlogs"
     * >Viewing Session Tags in CloudTrail</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of session tags that you want to pass. Each session tag
     *         consists of a key name and an associated value. For more
     *         information about session tags, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     *         >Tagging Amazon Web Services STS Sessions</a> in the <i>IAM User
     *         Guide</i>.
     *         </p>
     *         <p>
     *         This parameter is optional. You can pass up to 50 session tags.
     *         The plaintext session tag keys can’t exceed 128 characters, and
     *         the values can’t exceed 256 characters. For these and additional
     *         limits, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *         >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         An Amazon Web Services conversion compresses the passed session
     *         policies and session tags into a packed binary format that has a
     *         separate limit. Your request can fail for this limit even if your
     *         plaintext meets the other requirements. The
     *         <code>PackedPolicySize</code> response element indicates by
     *         percentage how close the policies and tags for your request are
     *         to the upper size limit.
     *         </p>
     *         </note>
     *         <p>
     *         You can pass a session tag with the same key as a tag that is
     *         already attached to the role. When you do, session tags override
     *         a role tag with the same key.
     *         </p>
     *         <p>
     *         Tag key–value pairs are not case sensitive, but case is
     *         preserved. This means that you cannot have separate
     *         <code>Department</code> and <code>department</code> tag keys.
     *         Assume that the role has the <code>Department</code>=
     *         <code>Marketing</code> tag and you pass the
     *         <code>department</code>=<code>engineering</code> session tag.
     *         <code>Department</code> and <code>department</code> are not saved
     *         as separate tags, and the session tag passed in the request takes
     *         precedence over the role tag.
     *         </p>
     *         <p>
     *         Additionally, if you used temporary credentials to perform this
     *         operation, the new session inherits any transitive session tags
     *         from the calling session. If you pass a session tag with the same
     *         key as an inherited tag, the operation fails. To view the
     *         inherited tags for a session, see the CloudTrail logs. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_ctlogs"
     *         >Viewing Session Tags in CloudTrail</a> in the <i>IAM User
     *         Guide</i>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of session tags that you want to pass. Each session tag consists
     * of a key name and an associated value. For more information about session
     * tags, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     * >Tagging Amazon Web Services STS Sessions</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The
     * plaintext session tag keys can’t exceed 128 characters, and the values
     * can’t exceed 256 characters. For these and additional limits, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already
     * attached to the role. When you do, session tags override a role tag with
     * the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This
     * means that you cannot have separate <code>Department</code> and
     * <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the
     * <code>department</code>=<code>engineering</code> session tag.
     * <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence
     * over the role tag.
     * </p>
     * <p>
     * Additionally, if you used temporary credentials to perform this
     * operation, the new session inherits any transitive session tags from the
     * calling session. If you pass a session tag with the same key as an
     * inherited tag, the operation fails. To view the inherited tags for a
     * session, see the CloudTrail logs. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_ctlogs"
     * >Viewing Session Tags in CloudTrail</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            A list of session tags that you want to pass. Each session tag
     *            consists of a key name and an associated value. For more
     *            information about session tags, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     *            >Tagging Amazon Web Services STS Sessions</a> in the <i>IAM
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is optional. You can pass up to 50 session
     *            tags. The plaintext session tag keys can’t exceed 128
     *            characters, and the values can’t exceed 256 characters. For
     *            these and additional limits, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *            >IAM and STS Character Limits</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            You can pass a session tag with the same key as a tag that is
     *            already attached to the role. When you do, session tags
     *            override a role tag with the same key.
     *            </p>
     *            <p>
     *            Tag key–value pairs are not case sensitive, but case is
     *            preserved. This means that you cannot have separate
     *            <code>Department</code> and <code>department</code> tag keys.
     *            Assume that the role has the <code>Department</code>=
     *            <code>Marketing</code> tag and you pass the
     *            <code>department</code>=<code>engineering</code> session tag.
     *            <code>Department</code> and <code>department</code> are not
     *            saved as separate tags, and the session tag passed in the
     *            request takes precedence over the role tag.
     *            </p>
     *            <p>
     *            Additionally, if you used temporary credentials to perform
     *            this operation, the new session inherits any transitive
     *            session tags from the calling session. If you pass a session
     *            tag with the same key as an inherited tag, the operation
     *            fails. To view the inherited tags for a session, see the
     *            CloudTrail logs. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_ctlogs"
     *            >Viewing Session Tags in CloudTrail</a> in the <i>IAM User
     *            Guide</i>.
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
     * A list of session tags that you want to pass. Each session tag consists
     * of a key name and an associated value. For more information about session
     * tags, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     * >Tagging Amazon Web Services STS Sessions</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The
     * plaintext session tag keys can’t exceed 128 characters, and the values
     * can’t exceed 256 characters. For these and additional limits, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already
     * attached to the role. When you do, session tags override a role tag with
     * the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This
     * means that you cannot have separate <code>Department</code> and
     * <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the
     * <code>department</code>=<code>engineering</code> session tag.
     * <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence
     * over the role tag.
     * </p>
     * <p>
     * Additionally, if you used temporary credentials to perform this
     * operation, the new session inherits any transitive session tags from the
     * calling session. If you pass a session tag with the same key as an
     * inherited tag, the operation fails. To view the inherited tags for a
     * session, see the CloudTrail logs. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_ctlogs"
     * >Viewing Session Tags in CloudTrail</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of session tags that you want to pass. Each session tag
     *            consists of a key name and an associated value. For more
     *            information about session tags, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     *            >Tagging Amazon Web Services STS Sessions</a> in the <i>IAM
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is optional. You can pass up to 50 session
     *            tags. The plaintext session tag keys can’t exceed 128
     *            characters, and the values can’t exceed 256 characters. For
     *            these and additional limits, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *            >IAM and STS Character Limits</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            You can pass a session tag with the same key as a tag that is
     *            already attached to the role. When you do, session tags
     *            override a role tag with the same key.
     *            </p>
     *            <p>
     *            Tag key–value pairs are not case sensitive, but case is
     *            preserved. This means that you cannot have separate
     *            <code>Department</code> and <code>department</code> tag keys.
     *            Assume that the role has the <code>Department</code>=
     *            <code>Marketing</code> tag and you pass the
     *            <code>department</code>=<code>engineering</code> session tag.
     *            <code>Department</code> and <code>department</code> are not
     *            saved as separate tags, and the session tag passed in the
     *            request takes precedence over the role tag.
     *            </p>
     *            <p>
     *            Additionally, if you used temporary credentials to perform
     *            this operation, the new session inherits any transitive
     *            session tags from the calling session. If you pass a session
     *            tag with the same key as an inherited tag, the operation
     *            fails. To view the inherited tags for a session, see the
     *            CloudTrail logs. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_ctlogs"
     *            >Viewing Session Tags in CloudTrail</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleRequest withTags(Tag... tags) {
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
     * A list of session tags that you want to pass. Each session tag consists
     * of a key name and an associated value. For more information about session
     * tags, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     * >Tagging Amazon Web Services STS Sessions</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The
     * plaintext session tag keys can’t exceed 128 characters, and the values
     * can’t exceed 256 characters. For these and additional limits, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already
     * attached to the role. When you do, session tags override a role tag with
     * the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This
     * means that you cannot have separate <code>Department</code> and
     * <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the
     * <code>department</code>=<code>engineering</code> session tag.
     * <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence
     * over the role tag.
     * </p>
     * <p>
     * Additionally, if you used temporary credentials to perform this
     * operation, the new session inherits any transitive session tags from the
     * calling session. If you pass a session tag with the same key as an
     * inherited tag, the operation fails. To view the inherited tags for a
     * session, see the CloudTrail logs. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_ctlogs"
     * >Viewing Session Tags in CloudTrail</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of session tags that you want to pass. Each session tag
     *            consists of a key name and an associated value. For more
     *            information about session tags, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     *            >Tagging Amazon Web Services STS Sessions</a> in the <i>IAM
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is optional. You can pass up to 50 session
     *            tags. The plaintext session tag keys can’t exceed 128
     *            characters, and the values can’t exceed 256 characters. For
     *            these and additional limits, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *            >IAM and STS Character Limits</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            You can pass a session tag with the same key as a tag that is
     *            already attached to the role. When you do, session tags
     *            override a role tag with the same key.
     *            </p>
     *            <p>
     *            Tag key–value pairs are not case sensitive, but case is
     *            preserved. This means that you cannot have separate
     *            <code>Department</code> and <code>department</code> tag keys.
     *            Assume that the role has the <code>Department</code>=
     *            <code>Marketing</code> tag and you pass the
     *            <code>department</code>=<code>engineering</code> session tag.
     *            <code>Department</code> and <code>department</code> are not
     *            saved as separate tags, and the session tag passed in the
     *            request takes precedence over the role tag.
     *            </p>
     *            <p>
     *            Additionally, if you used temporary credentials to perform
     *            this operation, the new session inherits any transitive
     *            session tags from the calling session. If you pass a session
     *            tag with the same key as an inherited tag, the operation
     *            fails. To view the inherited tags for a session, see the
     *            CloudTrail logs. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_ctlogs"
     *            >Viewing Session Tags in CloudTrail</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A list of keys for session tags that you want to set as transitive. If
     * you set a tag key as transitive, the corresponding key and value passes
     * to subsequent sessions in a role chain. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     * >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. When you set session tags as transitive, the
     * session policy and session tags packed binary limit is not affected.
     * </p>
     * <p>
     * If you choose not to specify a transitive tag key, then no tags are
     * passed from this session to any subsequent sessions.
     * </p>
     *
     * @return <p>
     *         A list of keys for session tags that you want to set as
     *         transitive. If you set a tag key as transitive, the corresponding
     *         key and value passes to subsequent sessions in a role chain. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     *         >Chaining Roles with Session Tags</a> in the <i>IAM User
     *         Guide</i>.
     *         </p>
     *         <p>
     *         This parameter is optional. When you set session tags as
     *         transitive, the session policy and session tags packed binary
     *         limit is not affected.
     *         </p>
     *         <p>
     *         If you choose not to specify a transitive tag key, then no tags
     *         are passed from this session to any subsequent sessions.
     *         </p>
     */
    public java.util.List<String> getTransitiveTagKeys() {
        return transitiveTagKeys;
    }

    /**
     * <p>
     * A list of keys for session tags that you want to set as transitive. If
     * you set a tag key as transitive, the corresponding key and value passes
     * to subsequent sessions in a role chain. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     * >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. When you set session tags as transitive, the
     * session policy and session tags packed binary limit is not affected.
     * </p>
     * <p>
     * If you choose not to specify a transitive tag key, then no tags are
     * passed from this session to any subsequent sessions.
     * </p>
     *
     * @param transitiveTagKeys <p>
     *            A list of keys for session tags that you want to set as
     *            transitive. If you set a tag key as transitive, the
     *            corresponding key and value passes to subsequent sessions in a
     *            role chain. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     *            >Chaining Roles with Session Tags</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is optional. When you set session tags as
     *            transitive, the session policy and session tags packed binary
     *            limit is not affected.
     *            </p>
     *            <p>
     *            If you choose not to specify a transitive tag key, then no
     *            tags are passed from this session to any subsequent sessions.
     *            </p>
     */
    public void setTransitiveTagKeys(java.util.Collection<String> transitiveTagKeys) {
        if (transitiveTagKeys == null) {
            this.transitiveTagKeys = null;
            return;
        }

        this.transitiveTagKeys = new java.util.ArrayList<String>(transitiveTagKeys);
    }

    /**
     * <p>
     * A list of keys for session tags that you want to set as transitive. If
     * you set a tag key as transitive, the corresponding key and value passes
     * to subsequent sessions in a role chain. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     * >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. When you set session tags as transitive, the
     * session policy and session tags packed binary limit is not affected.
     * </p>
     * <p>
     * If you choose not to specify a transitive tag key, then no tags are
     * passed from this session to any subsequent sessions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitiveTagKeys <p>
     *            A list of keys for session tags that you want to set as
     *            transitive. If you set a tag key as transitive, the
     *            corresponding key and value passes to subsequent sessions in a
     *            role chain. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     *            >Chaining Roles with Session Tags</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is optional. When you set session tags as
     *            transitive, the session policy and session tags packed binary
     *            limit is not affected.
     *            </p>
     *            <p>
     *            If you choose not to specify a transitive tag key, then no
     *            tags are passed from this session to any subsequent sessions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleRequest withTransitiveTagKeys(String... transitiveTagKeys) {
        if (getTransitiveTagKeys() == null) {
            this.transitiveTagKeys = new java.util.ArrayList<String>(transitiveTagKeys.length);
        }
        for (String value : transitiveTagKeys) {
            this.transitiveTagKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of keys for session tags that you want to set as transitive. If
     * you set a tag key as transitive, the corresponding key and value passes
     * to subsequent sessions in a role chain. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     * >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. When you set session tags as transitive, the
     * session policy and session tags packed binary limit is not affected.
     * </p>
     * <p>
     * If you choose not to specify a transitive tag key, then no tags are
     * passed from this session to any subsequent sessions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitiveTagKeys <p>
     *            A list of keys for session tags that you want to set as
     *            transitive. If you set a tag key as transitive, the
     *            corresponding key and value passes to subsequent sessions in a
     *            role chain. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     *            >Chaining Roles with Session Tags</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is optional. When you set session tags as
     *            transitive, the session policy and session tags packed binary
     *            limit is not affected.
     *            </p>
     *            <p>
     *            If you choose not to specify a transitive tag key, then no
     *            tags are passed from this session to any subsequent sessions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleRequest withTransitiveTagKeys(java.util.Collection<String> transitiveTagKeys) {
        setTransitiveTagKeys(transitiveTagKeys);
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
     * >How to Use an External ID When Granting Access to Your Amazon Web
     * Services Resources to a Third Party</a> in the <i>IAM User Guide</i>.
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
     *         >How to Use an External ID When Granting Access to Your Amazon
     *         Web Services Resources to a Third Party</a> in the <i>IAM User
     *         Guide</i>.
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
     * >How to Use an External ID When Granting Access to Your Amazon Web
     * Services Resources to a Third Party</a> in the <i>IAM User Guide</i>.
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
     *            >How to Use an External ID When Granting Access to Your Amazon
     *            Web Services Resources to a Third Party</a> in the <i>IAM User
     *            Guide</i>.
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
     * >How to Use an External ID When Granting Access to Your Amazon Web
     * Services Resources to a Third Party</a> in the <i>IAM User Guide</i>.
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
     *            >How to Use an External ID When Granting Access to Your Amazon
     *            Web Services Resources to a Third Party</a> in the <i>IAM User
     *            Guide</i>.
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
     * being assumed requires MFA. (In other words, if the policy includes a
     * condition that tests for MFA). If the role being assumed requires MFA and
     * if the <code>TokenCode</code> value is missing or expired, the
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
     *         role being assumed requires MFA. (In other words, if the policy
     *         includes a condition that tests for MFA). If the role being
     *         assumed requires MFA and if the <code>TokenCode</code> value is
     *         missing or expired, the <code>AssumeRole</code> call returns an
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
     * being assumed requires MFA. (In other words, if the policy includes a
     * condition that tests for MFA). If the role being assumed requires MFA and
     * if the <code>TokenCode</code> value is missing or expired, the
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
     *            the role being assumed requires MFA. (In other words, if the
     *            policy includes a condition that tests for MFA). If the role
     *            being assumed requires MFA and if the <code>TokenCode</code>
     *            value is missing or expired, the <code>AssumeRole</code> call
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
     * being assumed requires MFA. (In other words, if the policy includes a
     * condition that tests for MFA). If the role being assumed requires MFA and
     * if the <code>TokenCode</code> value is missing or expired, the
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
     *            the role being assumed requires MFA. (In other words, if the
     *            policy includes a condition that tests for MFA). If the role
     *            being assumed requires MFA and if the <code>TokenCode</code>
     *            value is missing or expired, the <code>AssumeRole</code> call
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
     * <p>
     * The source identity specified by the principal that is calling the
     * <code>AssumeRole</code> operation.
     * </p>
     * <p>
     * You can require users to specify a source identity when they assume a
     * role. You do this by using the <code>sts:SourceIdentity</code> condition
     * key in a role trust policy. You can use source identity information in
     * CloudTrail logs to determine who took actions with a role. You can use
     * the <code>aws:SourceIdentity</code> condition key to further control
     * access to Amazon Web Services resources based on the value of source
     * identity. For more information about using source identity, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >Monitor and control actions taken with assumed roles</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-. You cannot use a value that begins with the text
     * <code>aws:</code>. This prefix is reserved for Amazon Web Services
     * internal use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return <p>
     *         The source identity specified by the principal that is calling
     *         the <code>AssumeRole</code> operation.
     *         </p>
     *         <p>
     *         You can require users to specify a source identity when they
     *         assume a role. You do this by using the
     *         <code>sts:SourceIdentity</code> condition key in a role trust
     *         policy. You can use source identity information in CloudTrail
     *         logs to determine who took actions with a role. You can use the
     *         <code>aws:SourceIdentity</code> condition key to further control
     *         access to Amazon Web Services resources based on the value of
     *         source identity. For more information about using source
     *         identity, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *         >Monitor and control actions taken with assumed roles</a> in the
     *         <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The regex used to validate this parameter is a string of
     *         characters consisting of upper- and lower-case alphanumeric
     *         characters with no spaces. You can also include underscores or
     *         any of the following characters: =,.@-. You cannot use a value
     *         that begins with the text <code>aws:</code>. This prefix is
     *         reserved for Amazon Web Services internal use.
     *         </p>
     */
    public String getSourceIdentity() {
        return sourceIdentity;
    }

    /**
     * <p>
     * The source identity specified by the principal that is calling the
     * <code>AssumeRole</code> operation.
     * </p>
     * <p>
     * You can require users to specify a source identity when they assume a
     * role. You do this by using the <code>sts:SourceIdentity</code> condition
     * key in a role trust policy. You can use source identity information in
     * CloudTrail logs to determine who took actions with a role. You can use
     * the <code>aws:SourceIdentity</code> condition key to further control
     * access to Amazon Web Services resources based on the value of source
     * identity. For more information about using source identity, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >Monitor and control actions taken with assumed roles</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-. You cannot use a value that begins with the text
     * <code>aws:</code>. This prefix is reserved for Amazon Web Services
     * internal use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param sourceIdentity <p>
     *            The source identity specified by the principal that is calling
     *            the <code>AssumeRole</code> operation.
     *            </p>
     *            <p>
     *            You can require users to specify a source identity when they
     *            assume a role. You do this by using the
     *            <code>sts:SourceIdentity</code> condition key in a role trust
     *            policy. You can use source identity information in CloudTrail
     *            logs to determine who took actions with a role. You can use
     *            the <code>aws:SourceIdentity</code> condition key to further
     *            control access to Amazon Web Services resources based on the
     *            value of source identity. For more information about using
     *            source identity, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *            >Monitor and control actions taken with assumed roles</a> in
     *            the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@-. You cannot use a value
     *            that begins with the text <code>aws:</code>. This prefix is
     *            reserved for Amazon Web Services internal use.
     *            </p>
     */
    public void setSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
    }

    /**
     * <p>
     * The source identity specified by the principal that is calling the
     * <code>AssumeRole</code> operation.
     * </p>
     * <p>
     * You can require users to specify a source identity when they assume a
     * role. You do this by using the <code>sts:SourceIdentity</code> condition
     * key in a role trust policy. You can use source identity information in
     * CloudTrail logs to determine who took actions with a role. You can use
     * the <code>aws:SourceIdentity</code> condition key to further control
     * access to Amazon Web Services resources based on the value of source
     * identity. For more information about using source identity, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >Monitor and control actions taken with assumed roles</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-. You cannot use a value that begins with the text
     * <code>aws:</code>. This prefix is reserved for Amazon Web Services
     * internal use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param sourceIdentity <p>
     *            The source identity specified by the principal that is calling
     *            the <code>AssumeRole</code> operation.
     *            </p>
     *            <p>
     *            You can require users to specify a source identity when they
     *            assume a role. You do this by using the
     *            <code>sts:SourceIdentity</code> condition key in a role trust
     *            policy. You can use source identity information in CloudTrail
     *            logs to determine who took actions with a role. You can use
     *            the <code>aws:SourceIdentity</code> condition key to further
     *            control access to Amazon Web Services resources based on the
     *            value of source identity. For more information about using
     *            source identity, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *            >Monitor and control actions taken with assumed roles</a> in
     *            the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@-. You cannot use a value
     *            that begins with the text <code>aws:</code>. This prefix is
     *            reserved for Amazon Web Services internal use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleRequest withSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
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
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getTransitiveTagKeys() != null)
            sb.append("TransitiveTagKeys: " + getTransitiveTagKeys() + ",");
        if (getExternalId() != null)
            sb.append("ExternalId: " + getExternalId() + ",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: " + getSerialNumber() + ",");
        if (getTokenCode() != null)
            sb.append("TokenCode: " + getTokenCode() + ",");
        if (getSourceIdentity() != null)
            sb.append("SourceIdentity: " + getSourceIdentity());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getTransitiveTagKeys() == null) ? 0 : getTransitiveTagKeys().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode
                + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getTokenCode() == null) ? 0 : getTokenCode().hashCode());
        hashCode = prime * hashCode
                + ((getSourceIdentity() == null) ? 0 : getSourceIdentity().hashCode());
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTransitiveTagKeys() == null ^ this.getTransitiveTagKeys() == null)
            return false;
        if (other.getTransitiveTagKeys() != null
                && other.getTransitiveTagKeys().equals(this.getTransitiveTagKeys()) == false)
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
        if (other.getSourceIdentity() == null ^ this.getSourceIdentity() == null)
            return false;
        if (other.getSourceIdentity() != null
                && other.getSourceIdentity().equals(this.getSourceIdentity()) == false)
            return false;
        return true;
    }
}
