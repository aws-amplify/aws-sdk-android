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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This action is available if all of the following are true:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You're authorized to create accounts in the AWS GovCloud (US) Region. For
 * more information on the AWS GovCloud (US) Region, see the <a
 * href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/welcome.html">
 * <i>AWS GovCloud User Guide</i>.</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * You already have an account in the AWS GovCloud (US) Region that is
 * associated with your master account in the commercial Region.
 * </p>
 * </li>
 * <li>
 * <p>
 * You call this action from the master account of your organization in the
 * commercial Region.
 * </p>
 * </li>
 * <li>
 * <p>
 * You have the <code>organizations:CreateGovCloudAccount</code> permission. AWS
 * Organizations creates the required service-linked role named
 * <code>AWSServiceRoleForOrganizations</code>. For more information, see <a
 * href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html#orgs_integrate_services-using_slrs"
 * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations
 * User Guide.</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * AWS automatically enables AWS CloudTrail for AWS GovCloud (US) accounts, but
 * you should also do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Verify that AWS CloudTrail is enabled to store logs.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create an S3 bucket for AWS CloudTrail log storage.
 * </p>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/verifying-cloudtrail.html"
 * >Verifying AWS CloudTrail Is Enabled</a> in the <i>AWS GovCloud User
 * Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You call this action from the master account of your organization in the
 * commercial Region to create a standalone AWS account in the AWS GovCloud (US)
 * Region. After the account is created, the master account of an organization
 * in the AWS GovCloud (US) Region can invite it to that organization. For more
 * information on inviting standalone accounts in the AWS GovCloud (US) to join
 * an organization, see <a href=
 * "http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html"
 * >AWS Organizations</a> in the <i>AWS GovCloud User Guide.</i>
 * </p>
 * <p>
 * Calling <code>CreateGovCloudAccount</code> is an asynchronous request that
 * AWS performs in the background. Because <code>CreateGovCloudAccount</code>
 * operates asynchronously, it can return a successful completion message even
 * though account initialization might still be in progress. You might need to
 * wait a few minutes before you can successfully access the account. To check
 * the status of the request, do one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the <code>OperationId</code> response element from this operation to
 * provide as a parameter to the <a>DescribeCreateAccountStatus</a> operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * Check the AWS CloudTrail log for the <code>CreateAccountResult</code> event.
 * For information on using AWS CloudTrail with Organizations, see <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html"
 * >Monitoring the Activity in Your Organization</a> in the <i>AWS Organizations
 * User Guide.</i>
 * </p>
 * </li>
 * </ul>
 * <p/>
 * <p>
 * When you call the <code>CreateGovCloudAccount</code> action, you create two
 * accounts: a standalone account in the AWS GovCloud (US) Region and an
 * associated account in the commercial Region for billing and support purposes.
 * The account in the commercial Region is automatically a member of the
 * organization whose credentials made the request. Both accounts are associated
 * with the same email address.
 * </p>
 * <p>
 * A role is created in the new account in the commercial Region that allows the
 * master account in the organization in the commercial Region to assume it. An
 * AWS GovCloud (US) account is then created and associated with the commercial
 * account that you just created. A role is created in the new AWS GovCloud (US)
 * account that can be assumed by the AWS GovCloud (US) account that is
 * associated with the master account of the commercial organization. For more
 * information and to view a diagram that explains how account access works, see
 * <a href=
 * "http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html"
 * >AWS Organizations</a> in the <i>AWS GovCloud User Guide.</i>
 * </p>
 * <p>
 * For more information about creating accounts, see <a href=
 * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_create.html"
 * >Creating an AWS Account in Your Organization</a> in the <i>AWS Organizations
 * User Guide.</i>
 * </p>
 * <important>
 * <ul>
 * <li>
 * <p>
 * When you create an account in an organization using the AWS Organizations
 * console, API, or CLI commands, the information required for the account to
 * operate as a standalone account is <i>not</i> automatically collected. This
 * includes a payment method and signing the end user license agreement (EULA).
 * If you must remove an account from your organization later, you can do so
 * only after you provide the missing information. Follow the steps at <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
 * > To leave an organization as a member account</a> in the <i>AWS
 * Organizations User Guide.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * If you get an exception that indicates that you exceeded your account limits
 * for the organization, contact <a
 * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you get an exception that indicates that the operation failed because your
 * organization is still initializing, wait one hour and then try again. If the
 * error persists, contact <a
 * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Using <code>CreateGovCloudAccount</code> to create multiple temporary
 * accounts isn't recommended. You can only close an account from the AWS
 * Billing and Cost Management console, and you must be signed in as the root
 * user. For information on the requirements and process for closing an account,
 * see <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_close.html"
 * >Closing an AWS Account</a> in the <i>AWS Organizations User Guide</i>.
 * </p>
 * </li>
 * </ul>
 * </important> <note>
 * <p>
 * When you create a member account with this operation, you can choose whether
 * to create the account with the <b>IAM User and Role Access to Billing
 * Information</b> switch enabled. If you enable it, IAM users and roles that
 * have appropriate permissions can view billing information for the account. If
 * you disable it, only the account root user can access billing information.
 * For information about how to disable this switch for an account, see <a href=
 * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html"
 * >Granting Access to Your Billing Information and Tools</a>.
 * </p>
 * </note>
 */
public class CreateGovCloudAccountRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The email address of the owner to assign to the new member account in the
     * commercial Region. This email address must not already be associated with
     * another AWS account. You must use a valid email address to complete
     * account creation. You can't access the root user of the account or remove
     * an account that was created with an invalid email address. Like all
     * request parameters for <code>CreateGovCloudAccount</code>, the request
     * for the email address for the AWS GovCloud (US) account originates from
     * the commercial Region, not from the AWS GovCloud (US) Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     * <b>Pattern: </b>[^\s@]+@[^\s@]+\.[^\s@]+<br/>
     */
    private String email;

    /**
     * <p>
     * The friendly name of the member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[ -\u007E]+<br/>
     */
    private String accountName;

    /**
     * <p>
     * (Optional)
     * </p>
     * <p>
     * The name of an IAM role that AWS Organizations automatically
     * preconfigures in the new member accounts in both the AWS GovCloud (US)
     * Region and in the commercial Region. This role trusts the master account,
     * allowing users in the master account to assume the role, as permitted by
     * the master account administrator. The role has administrator permissions
     * in the new member account.
     * </p>
     * <p>
     * If you don't specify this parameter, the role name defaults to
     * <code>OrganizationAccountAccessRole</code>.
     * </p>
     * <p>
     * For more information about how to use this role to access the member
     * account, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     * >Accessing and Administering the Member Accounts in Your Organization</a>
     * in the <i>AWS Organizations User Guide</i> and steps 2 and 3 in <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html"
     * >Tutorial: Delegate Access Across AWS Accounts Using IAM Roles</a> in the
     * <i>IAM User Guide.</i>
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter. The pattern can include uppercase
     * letters, lowercase letters, digits with no spaces, and any of the
     * following characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]{1,64}<br/>
     */
    private String roleName;

    /**
     * <p>
     * If set to <code>ALLOW</code>, the new linked account in the commercial
     * Region enables IAM users to access account billing information <i>if</i>
     * they have the required permissions. If set to <code>DENY</code>, only the
     * root user of the new account can access account billing information. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the
     * <i>AWS Billing and Cost Management User Guide.</i>
     * </p>
     * <p>
     * If you don't specify this parameter, the value defaults to
     * <code>ALLOW</code>, and IAM users and roles with the required permissions
     * can access billing information for the new account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     */
    private String iamUserAccessToBilling;

    /**
     * <p>
     * The email address of the owner to assign to the new member account in the
     * commercial Region. This email address must not already be associated with
     * another AWS account. You must use a valid email address to complete
     * account creation. You can't access the root user of the account or remove
     * an account that was created with an invalid email address. Like all
     * request parameters for <code>CreateGovCloudAccount</code>, the request
     * for the email address for the AWS GovCloud (US) account originates from
     * the commercial Region, not from the AWS GovCloud (US) Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     * <b>Pattern: </b>[^\s@]+@[^\s@]+\.[^\s@]+<br/>
     *
     * @return <p>
     *         The email address of the owner to assign to the new member
     *         account in the commercial Region. This email address must not
     *         already be associated with another AWS account. You must use a
     *         valid email address to complete account creation. You can't
     *         access the root user of the account or remove an account that was
     *         created with an invalid email address. Like all request
     *         parameters for <code>CreateGovCloudAccount</code>, the request
     *         for the email address for the AWS GovCloud (US) account
     *         originates from the commercial Region, not from the AWS GovCloud
     *         (US) Region.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email address of the owner to assign to the new member account in the
     * commercial Region. This email address must not already be associated with
     * another AWS account. You must use a valid email address to complete
     * account creation. You can't access the root user of the account or remove
     * an account that was created with an invalid email address. Like all
     * request parameters for <code>CreateGovCloudAccount</code>, the request
     * for the email address for the AWS GovCloud (US) account originates from
     * the commercial Region, not from the AWS GovCloud (US) Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     * <b>Pattern: </b>[^\s@]+@[^\s@]+\.[^\s@]+<br/>
     *
     * @param email <p>
     *            The email address of the owner to assign to the new member
     *            account in the commercial Region. This email address must not
     *            already be associated with another AWS account. You must use a
     *            valid email address to complete account creation. You can't
     *            access the root user of the account or remove an account that
     *            was created with an invalid email address. Like all request
     *            parameters for <code>CreateGovCloudAccount</code>, the request
     *            for the email address for the AWS GovCloud (US) account
     *            originates from the commercial Region, not from the AWS
     *            GovCloud (US) Region.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the owner to assign to the new member account in the
     * commercial Region. This email address must not already be associated with
     * another AWS account. You must use a valid email address to complete
     * account creation. You can't access the root user of the account or remove
     * an account that was created with an invalid email address. Like all
     * request parameters for <code>CreateGovCloudAccount</code>, the request
     * for the email address for the AWS GovCloud (US) account originates from
     * the commercial Region, not from the AWS GovCloud (US) Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     * <b>Pattern: </b>[^\s@]+@[^\s@]+\.[^\s@]+<br/>
     *
     * @param email <p>
     *            The email address of the owner to assign to the new member
     *            account in the commercial Region. This email address must not
     *            already be associated with another AWS account. You must use a
     *            valid email address to complete account creation. You can't
     *            access the root user of the account or remove an account that
     *            was created with an invalid email address. Like all request
     *            parameters for <code>CreateGovCloudAccount</code>, the request
     *            for the email address for the AWS GovCloud (US) account
     *            originates from the commercial Region, not from the AWS
     *            GovCloud (US) Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGovCloudAccountRequest withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The friendly name of the member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[ -\u007E]+<br/>
     *
     * @return <p>
     *         The friendly name of the member account.
     *         </p>
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * <p>
     * The friendly name of the member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[ -\u007E]+<br/>
     *
     * @param accountName <p>
     *            The friendly name of the member account.
     *            </p>
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * <p>
     * The friendly name of the member account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[ -\u007E]+<br/>
     *
     * @param accountName <p>
     *            The friendly name of the member account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGovCloudAccountRequest withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * <p>
     * (Optional)
     * </p>
     * <p>
     * The name of an IAM role that AWS Organizations automatically
     * preconfigures in the new member accounts in both the AWS GovCloud (US)
     * Region and in the commercial Region. This role trusts the master account,
     * allowing users in the master account to assume the role, as permitted by
     * the master account administrator. The role has administrator permissions
     * in the new member account.
     * </p>
     * <p>
     * If you don't specify this parameter, the role name defaults to
     * <code>OrganizationAccountAccessRole</code>.
     * </p>
     * <p>
     * For more information about how to use this role to access the member
     * account, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     * >Accessing and Administering the Member Accounts in Your Organization</a>
     * in the <i>AWS Organizations User Guide</i> and steps 2 and 3 in <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html"
     * >Tutorial: Delegate Access Across AWS Accounts Using IAM Roles</a> in the
     * <i>IAM User Guide.</i>
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter. The pattern can include uppercase
     * letters, lowercase letters, digits with no spaces, and any of the
     * following characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]{1,64}<br/>
     *
     * @return <p>
     *         (Optional)
     *         </p>
     *         <p>
     *         The name of an IAM role that AWS Organizations automatically
     *         preconfigures in the new member accounts in both the AWS GovCloud
     *         (US) Region and in the commercial Region. This role trusts the
     *         master account, allowing users in the master account to assume
     *         the role, as permitted by the master account administrator. The
     *         role has administrator permissions in the new member account.
     *         </p>
     *         <p>
     *         If you don't specify this parameter, the role name defaults to
     *         <code>OrganizationAccountAccessRole</code>.
     *         </p>
     *         <p>
     *         For more information about how to use this role to access the
     *         member account, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     *         >Accessing and Administering the Member Accounts in Your
     *         Organization</a> in the <i>AWS Organizations User Guide</i> and
     *         steps 2 and 3 in <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html"
     *         >Tutorial: Delegate Access Across AWS Accounts Using IAM
     *         Roles</a> in the <i>IAM User Guide.</i>
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         that is used to validate this parameter. The pattern can include
     *         uppercase letters, lowercase letters, digits with no spaces, and
     *         any of the following characters: =,.@-
     *         </p>
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * <p>
     * (Optional)
     * </p>
     * <p>
     * The name of an IAM role that AWS Organizations automatically
     * preconfigures in the new member accounts in both the AWS GovCloud (US)
     * Region and in the commercial Region. This role trusts the master account,
     * allowing users in the master account to assume the role, as permitted by
     * the master account administrator. The role has administrator permissions
     * in the new member account.
     * </p>
     * <p>
     * If you don't specify this parameter, the role name defaults to
     * <code>OrganizationAccountAccessRole</code>.
     * </p>
     * <p>
     * For more information about how to use this role to access the member
     * account, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     * >Accessing and Administering the Member Accounts in Your Organization</a>
     * in the <i>AWS Organizations User Guide</i> and steps 2 and 3 in <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html"
     * >Tutorial: Delegate Access Across AWS Accounts Using IAM Roles</a> in the
     * <i>IAM User Guide.</i>
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter. The pattern can include uppercase
     * letters, lowercase letters, digits with no spaces, and any of the
     * following characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]{1,64}<br/>
     *
     * @param roleName <p>
     *            (Optional)
     *            </p>
     *            <p>
     *            The name of an IAM role that AWS Organizations automatically
     *            preconfigures in the new member accounts in both the AWS
     *            GovCloud (US) Region and in the commercial Region. This role
     *            trusts the master account, allowing users in the master
     *            account to assume the role, as permitted by the master account
     *            administrator. The role has administrator permissions in the
     *            new member account.
     *            </p>
     *            <p>
     *            If you don't specify this parameter, the role name defaults to
     *            <code>OrganizationAccountAccessRole</code>.
     *            </p>
     *            <p>
     *            For more information about how to use this role to access the
     *            member account, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     *            >Accessing and Administering the Member Accounts in Your
     *            Organization</a> in the <i>AWS Organizations User Guide</i>
     *            and steps 2 and 3 in <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html"
     *            >Tutorial: Delegate Access Across AWS Accounts Using IAM
     *            Roles</a> in the <i>IAM User Guide.</i>
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> that is used to validate this parameter. The
     *            pattern can include uppercase letters, lowercase letters,
     *            digits with no spaces, and any of the following characters:
     *            =,.@-
     *            </p>
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * (Optional)
     * </p>
     * <p>
     * The name of an IAM role that AWS Organizations automatically
     * preconfigures in the new member accounts in both the AWS GovCloud (US)
     * Region and in the commercial Region. This role trusts the master account,
     * allowing users in the master account to assume the role, as permitted by
     * the master account administrator. The role has administrator permissions
     * in the new member account.
     * </p>
     * <p>
     * If you don't specify this parameter, the role name defaults to
     * <code>OrganizationAccountAccessRole</code>.
     * </p>
     * <p>
     * For more information about how to use this role to access the member
     * account, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     * >Accessing and Administering the Member Accounts in Your Organization</a>
     * in the <i>AWS Organizations User Guide</i> and steps 2 and 3 in <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html"
     * >Tutorial: Delegate Access Across AWS Accounts Using IAM Roles</a> in the
     * <i>IAM User Guide.</i>
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter. The pattern can include uppercase
     * letters, lowercase letters, digits with no spaces, and any of the
     * following characters: =,.@-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]{1,64}<br/>
     *
     * @param roleName <p>
     *            (Optional)
     *            </p>
     *            <p>
     *            The name of an IAM role that AWS Organizations automatically
     *            preconfigures in the new member accounts in both the AWS
     *            GovCloud (US) Region and in the commercial Region. This role
     *            trusts the master account, allowing users in the master
     *            account to assume the role, as permitted by the master account
     *            administrator. The role has administrator permissions in the
     *            new member account.
     *            </p>
     *            <p>
     *            If you don't specify this parameter, the role name defaults to
     *            <code>OrganizationAccountAccessRole</code>.
     *            </p>
     *            <p>
     *            For more information about how to use this role to access the
     *            member account, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     *            >Accessing and Administering the Member Accounts in Your
     *            Organization</a> in the <i>AWS Organizations User Guide</i>
     *            and steps 2 and 3 in <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html"
     *            >Tutorial: Delegate Access Across AWS Accounts Using IAM
     *            Roles</a> in the <i>IAM User Guide.</i>
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> that is used to validate this parameter. The
     *            pattern can include uppercase letters, lowercase letters,
     *            digits with no spaces, and any of the following characters:
     *            =,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGovCloudAccountRequest withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * <p>
     * If set to <code>ALLOW</code>, the new linked account in the commercial
     * Region enables IAM users to access account billing information <i>if</i>
     * they have the required permissions. If set to <code>DENY</code>, only the
     * root user of the new account can access account billing information. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the
     * <i>AWS Billing and Cost Management User Guide.</i>
     * </p>
     * <p>
     * If you don't specify this parameter, the value defaults to
     * <code>ALLOW</code>, and IAM users and roles with the required permissions
     * can access billing information for the new account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @return <p>
     *         If set to <code>ALLOW</code>, the new linked account in the
     *         commercial Region enables IAM users to access account billing
     *         information <i>if</i> they have the required permissions. If set
     *         to <code>DENY</code>, only the root user of the new account can
     *         access account billing information. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     *         >Activating Access to the Billing and Cost Management Console</a>
     *         in the <i>AWS Billing and Cost Management User Guide.</i>
     *         </p>
     *         <p>
     *         If you don't specify this parameter, the value defaults to
     *         <code>ALLOW</code>, and IAM users and roles with the required
     *         permissions can access billing information for the new account.
     *         </p>
     * @see IAMUserAccessToBilling
     */
    public String getIamUserAccessToBilling() {
        return iamUserAccessToBilling;
    }

    /**
     * <p>
     * If set to <code>ALLOW</code>, the new linked account in the commercial
     * Region enables IAM users to access account billing information <i>if</i>
     * they have the required permissions. If set to <code>DENY</code>, only the
     * root user of the new account can access account billing information. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the
     * <i>AWS Billing and Cost Management User Guide.</i>
     * </p>
     * <p>
     * If you don't specify this parameter, the value defaults to
     * <code>ALLOW</code>, and IAM users and roles with the required permissions
     * can access billing information for the new account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param iamUserAccessToBilling <p>
     *            If set to <code>ALLOW</code>, the new linked account in the
     *            commercial Region enables IAM users to access account billing
     *            information <i>if</i> they have the required permissions. If
     *            set to <code>DENY</code>, only the root user of the new
     *            account can access account billing information. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     *            >Activating Access to the Billing and Cost Management
     *            Console</a> in the <i>AWS Billing and Cost Management User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            If you don't specify this parameter, the value defaults to
     *            <code>ALLOW</code>, and IAM users and roles with the required
     *            permissions can access billing information for the new
     *            account.
     *            </p>
     * @see IAMUserAccessToBilling
     */
    public void setIamUserAccessToBilling(String iamUserAccessToBilling) {
        this.iamUserAccessToBilling = iamUserAccessToBilling;
    }

    /**
     * <p>
     * If set to <code>ALLOW</code>, the new linked account in the commercial
     * Region enables IAM users to access account billing information <i>if</i>
     * they have the required permissions. If set to <code>DENY</code>, only the
     * root user of the new account can access account billing information. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the
     * <i>AWS Billing and Cost Management User Guide.</i>
     * </p>
     * <p>
     * If you don't specify this parameter, the value defaults to
     * <code>ALLOW</code>, and IAM users and roles with the required permissions
     * can access billing information for the new account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param iamUserAccessToBilling <p>
     *            If set to <code>ALLOW</code>, the new linked account in the
     *            commercial Region enables IAM users to access account billing
     *            information <i>if</i> they have the required permissions. If
     *            set to <code>DENY</code>, only the root user of the new
     *            account can access account billing information. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     *            >Activating Access to the Billing and Cost Management
     *            Console</a> in the <i>AWS Billing and Cost Management User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            If you don't specify this parameter, the value defaults to
     *            <code>ALLOW</code>, and IAM users and roles with the required
     *            permissions can access billing information for the new
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IAMUserAccessToBilling
     */
    public CreateGovCloudAccountRequest withIamUserAccessToBilling(String iamUserAccessToBilling) {
        this.iamUserAccessToBilling = iamUserAccessToBilling;
        return this;
    }

    /**
     * <p>
     * If set to <code>ALLOW</code>, the new linked account in the commercial
     * Region enables IAM users to access account billing information <i>if</i>
     * they have the required permissions. If set to <code>DENY</code>, only the
     * root user of the new account can access account billing information. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the
     * <i>AWS Billing and Cost Management User Guide.</i>
     * </p>
     * <p>
     * If you don't specify this parameter, the value defaults to
     * <code>ALLOW</code>, and IAM users and roles with the required permissions
     * can access billing information for the new account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param iamUserAccessToBilling <p>
     *            If set to <code>ALLOW</code>, the new linked account in the
     *            commercial Region enables IAM users to access account billing
     *            information <i>if</i> they have the required permissions. If
     *            set to <code>DENY</code>, only the root user of the new
     *            account can access account billing information. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     *            >Activating Access to the Billing and Cost Management
     *            Console</a> in the <i>AWS Billing and Cost Management User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            If you don't specify this parameter, the value defaults to
     *            <code>ALLOW</code>, and IAM users and roles with the required
     *            permissions can access billing information for the new
     *            account.
     *            </p>
     * @see IAMUserAccessToBilling
     */
    public void setIamUserAccessToBilling(IAMUserAccessToBilling iamUserAccessToBilling) {
        this.iamUserAccessToBilling = iamUserAccessToBilling.toString();
    }

    /**
     * <p>
     * If set to <code>ALLOW</code>, the new linked account in the commercial
     * Region enables IAM users to access account billing information <i>if</i>
     * they have the required permissions. If set to <code>DENY</code>, only the
     * root user of the new account can access account billing information. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the
     * <i>AWS Billing and Cost Management User Guide.</i>
     * </p>
     * <p>
     * If you don't specify this parameter, the value defaults to
     * <code>ALLOW</code>, and IAM users and roles with the required permissions
     * can access billing information for the new account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param iamUserAccessToBilling <p>
     *            If set to <code>ALLOW</code>, the new linked account in the
     *            commercial Region enables IAM users to access account billing
     *            information <i>if</i> they have the required permissions. If
     *            set to <code>DENY</code>, only the root user of the new
     *            account can access account billing information. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     *            >Activating Access to the Billing and Cost Management
     *            Console</a> in the <i>AWS Billing and Cost Management User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            If you don't specify this parameter, the value defaults to
     *            <code>ALLOW</code>, and IAM users and roles with the required
     *            permissions can access billing information for the new
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IAMUserAccessToBilling
     */
    public CreateGovCloudAccountRequest withIamUserAccessToBilling(
            IAMUserAccessToBilling iamUserAccessToBilling) {
        this.iamUserAccessToBilling = iamUserAccessToBilling.toString();
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
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getAccountName() != null)
            sb.append("AccountName: " + getAccountName() + ",");
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getIamUserAccessToBilling() != null)
            sb.append("IamUserAccessToBilling: " + getIamUserAccessToBilling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode
                + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime
                * hashCode
                + ((getIamUserAccessToBilling() == null) ? 0 : getIamUserAccessToBilling()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGovCloudAccountRequest == false)
            return false;
        CreateGovCloudAccountRequest other = (CreateGovCloudAccountRequest) obj;

        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getAccountName() == null ^ this.getAccountName() == null)
            return false;
        if (other.getAccountName() != null
                && other.getAccountName().equals(this.getAccountName()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getIamUserAccessToBilling() == null ^ this.getIamUserAccessToBilling() == null)
            return false;
        if (other.getIamUserAccessToBilling() != null
                && other.getIamUserAccessToBilling().equals(this.getIamUserAccessToBilling()) == false)
            return false;
        return true;
    }
}
