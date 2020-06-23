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
 * Creates an AWS account that is automatically a member of the organization
 * whose credentials made the request. This is an asynchronous request that AWS
 * performs in the background. Because <code>CreateAccount</code> operates
 * asynchronously, it can return a successful completion message even though
 * account initialization might still be in progress. You might need to wait a
 * few minutes before you can successfully access the account. To check the
 * status of the request, do one of the following:
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
 * For information on using AWS CloudTrail with AWS Organizations, see <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html"
 * >Monitoring the Activity in Your Organization</a> in the <i>AWS Organizations
 * User Guide.</i>
 * </p>
 * </li>
 * </ul>
 * <p/>
 * <p>
 * The user who calls the API to create an account must have the
 * <code>organizations:CreateAccount</code> permission. If you enabled all
 * features in the organization, AWS Organizations creates the required
 * service-linked role named <code>AWSServiceRoleForOrganizations</code>. For
 * more information, see <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html#orgs_integrate_services-using_slrs"
 * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations
 * User Guide</i>.
 * </p>
 * <p>
 * AWS Organizations preconfigures the new member account with a role (named
 * <code>OrganizationAccountAccessRole</code> by default) that grants users in
 * the master account administrator permissions in the new member account.
 * Principals in the master account can assume the role. AWS Organizations
 * clones the company name and address information for the new account from the
 * organization's master account.
 * </p>
 * <p>
 * This operation can be called only from the organization's master account.
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
 * operate as a standalone account, such as a payment method and signing the end
 * user license agreement (EULA) is <i>not</i> automatically collected. If you
 * must remove an account from your organization later, you can do so only after
 * you provide the missing information. Follow the steps at <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
 * > To leave an organization as a member account</a> in the <i>AWS
 * Organizations User Guide</i>.
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
 * Using <code>CreateAccount</code> to create multiple temporary accounts isn't
 * recommended. You can only close an account from the Billing and Cost
 * Management Console, and you must be signed in as the root user. For
 * information on the requirements and process for closing an account, see <a
 * href=
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
public class CreateAccountRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The email address of the owner to assign to the new member account. This
     * email address must not already be associated with another AWS account.
     * You must use a valid email address to complete account creation. You
     * can't access the root user of the account or remove an account that was
     * created with an invalid email address.
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
     * preconfigures in the new member account. This role trusts the master
     * account, allowing users in the master account to assume the role, as
     * permitted by the master account administrator. The role has administrator
     * permissions in the new member account.
     * </p>
     * <p>
     * If you don't specify this parameter, the role name defaults to
     * <code>OrganizationAccountAccessRole</code>.
     * </p>
     * <p>
     * For more information about how to use this role to access the member
     * account, see the following links:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     * >Accessing and Administering the Member Accounts in Your Organization</a>
     * in the <i>AWS Organizations User Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * Steps 2 and 3 in <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html"
     * >Tutorial: Delegate Access Across AWS Accounts Using IAM Roles</a> in the
     * <i>IAM User Guide</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter. The pattern can include uppercase
     * letters, lowercase letters, digits with no spaces, and any of the
     * following characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w+=,.@-]{1,64}<br/>
     */
    private String roleName;

    /**
     * <p>
     * If set to <code>ALLOW</code>, the new account enables IAM users to access
     * account billing information <i>if</i> they have the required permissions.
     * If set to <code>DENY</code>, only the root user of the new account can
     * access account billing information. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the
     * <i>AWS Billing and Cost Management User Guide</i>.
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
     * The email address of the owner to assign to the new member account. This
     * email address must not already be associated with another AWS account.
     * You must use a valid email address to complete account creation. You
     * can't access the root user of the account or remove an account that was
     * created with an invalid email address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     * <b>Pattern: </b>[^\s@]+@[^\s@]+\.[^\s@]+<br/>
     *
     * @return <p>
     *         The email address of the owner to assign to the new member
     *         account. This email address must not already be associated with
     *         another AWS account. You must use a valid email address to
     *         complete account creation. You can't access the root user of the
     *         account or remove an account that was created with an invalid
     *         email address.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email address of the owner to assign to the new member account. This
     * email address must not already be associated with another AWS account.
     * You must use a valid email address to complete account creation. You
     * can't access the root user of the account or remove an account that was
     * created with an invalid email address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     * <b>Pattern: </b>[^\s@]+@[^\s@]+\.[^\s@]+<br/>
     *
     * @param email <p>
     *            The email address of the owner to assign to the new member
     *            account. This email address must not already be associated
     *            with another AWS account. You must use a valid email address
     *            to complete account creation. You can't access the root user
     *            of the account or remove an account that was created with an
     *            invalid email address.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the owner to assign to the new member account. This
     * email address must not already be associated with another AWS account.
     * You must use a valid email address to complete account creation. You
     * can't access the root user of the account or remove an account that was
     * created with an invalid email address.
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
     *            account. This email address must not already be associated
     *            with another AWS account. You must use a valid email address
     *            to complete account creation. You can't access the root user
     *            of the account or remove an account that was created with an
     *            invalid email address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccountRequest withEmail(String email) {
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
    public CreateAccountRequest withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * <p>
     * (Optional)
     * </p>
     * <p>
     * The name of an IAM role that AWS Organizations automatically
     * preconfigures in the new member account. This role trusts the master
     * account, allowing users in the master account to assume the role, as
     * permitted by the master account administrator. The role has administrator
     * permissions in the new member account.
     * </p>
     * <p>
     * If you don't specify this parameter, the role name defaults to
     * <code>OrganizationAccountAccessRole</code>.
     * </p>
     * <p>
     * For more information about how to use this role to access the member
     * account, see the following links:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     * >Accessing and Administering the Member Accounts in Your Organization</a>
     * in the <i>AWS Organizations User Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * Steps 2 and 3 in <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html"
     * >Tutorial: Delegate Access Across AWS Accounts Using IAM Roles</a> in the
     * <i>IAM User Guide</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter. The pattern can include uppercase
     * letters, lowercase letters, digits with no spaces, and any of the
     * following characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w+=,.@-]{1,64}<br/>
     *
     * @return <p>
     *         (Optional)
     *         </p>
     *         <p>
     *         The name of an IAM role that AWS Organizations automatically
     *         preconfigures in the new member account. This role trusts the
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
     *         member account, see the following links:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     *         >Accessing and Administering the Member Accounts in Your
     *         Organization</a> in the <i>AWS Organizations User Guide</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Steps 2 and 3 in <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html"
     *         >Tutorial: Delegate Access Across AWS Accounts Using IAM
     *         Roles</a> in the <i>IAM User Guide</i>
     *         </p>
     *         </li>
     *         </ul>
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
     * preconfigures in the new member account. This role trusts the master
     * account, allowing users in the master account to assume the role, as
     * permitted by the master account administrator. The role has administrator
     * permissions in the new member account.
     * </p>
     * <p>
     * If you don't specify this parameter, the role name defaults to
     * <code>OrganizationAccountAccessRole</code>.
     * </p>
     * <p>
     * For more information about how to use this role to access the member
     * account, see the following links:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     * >Accessing and Administering the Member Accounts in Your Organization</a>
     * in the <i>AWS Organizations User Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * Steps 2 and 3 in <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html"
     * >Tutorial: Delegate Access Across AWS Accounts Using IAM Roles</a> in the
     * <i>IAM User Guide</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter. The pattern can include uppercase
     * letters, lowercase letters, digits with no spaces, and any of the
     * following characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w+=,.@-]{1,64}<br/>
     *
     * @param roleName <p>
     *            (Optional)
     *            </p>
     *            <p>
     *            The name of an IAM role that AWS Organizations automatically
     *            preconfigures in the new member account. This role trusts the
     *            master account, allowing users in the master account to assume
     *            the role, as permitted by the master account administrator.
     *            The role has administrator permissions in the new member
     *            account.
     *            </p>
     *            <p>
     *            If you don't specify this parameter, the role name defaults to
     *            <code>OrganizationAccountAccessRole</code>.
     *            </p>
     *            <p>
     *            For more information about how to use this role to access the
     *            member account, see the following links:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     *            >Accessing and Administering the Member Accounts in Your
     *            Organization</a> in the <i>AWS Organizations User Guide</i>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Steps 2 and 3 in <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html"
     *            >Tutorial: Delegate Access Across AWS Accounts Using IAM
     *            Roles</a> in the <i>IAM User Guide</i>
     *            </p>
     *            </li>
     *            </ul>
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
     * preconfigures in the new member account. This role trusts the master
     * account, allowing users in the master account to assume the role, as
     * permitted by the master account administrator. The role has administrator
     * permissions in the new member account.
     * </p>
     * <p>
     * If you don't specify this parameter, the role name defaults to
     * <code>OrganizationAccountAccessRole</code>.
     * </p>
     * <p>
     * For more information about how to use this role to access the member
     * account, see the following links:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     * >Accessing and Administering the Member Accounts in Your Organization</a>
     * in the <i>AWS Organizations User Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * Steps 2 and 3 in <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html"
     * >Tutorial: Delegate Access Across AWS Accounts Using IAM Roles</a> in the
     * <i>IAM User Guide</i>
     * </p>
     * </li>
     * </ul>
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
     * <b>Pattern: </b>[\w+=,.@-]{1,64}<br/>
     *
     * @param roleName <p>
     *            (Optional)
     *            </p>
     *            <p>
     *            The name of an IAM role that AWS Organizations automatically
     *            preconfigures in the new member account. This role trusts the
     *            master account, allowing users in the master account to assume
     *            the role, as permitted by the master account administrator.
     *            The role has administrator permissions in the new member
     *            account.
     *            </p>
     *            <p>
     *            If you don't specify this parameter, the role name defaults to
     *            <code>OrganizationAccountAccessRole</code>.
     *            </p>
     *            <p>
     *            For more information about how to use this role to access the
     *            member account, see the following links:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     *            >Accessing and Administering the Member Accounts in Your
     *            Organization</a> in the <i>AWS Organizations User Guide</i>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Steps 2 and 3 in <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html"
     *            >Tutorial: Delegate Access Across AWS Accounts Using IAM
     *            Roles</a> in the <i>IAM User Guide</i>
     *            </p>
     *            </li>
     *            </ul>
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
    public CreateAccountRequest withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * <p>
     * If set to <code>ALLOW</code>, the new account enables IAM users to access
     * account billing information <i>if</i> they have the required permissions.
     * If set to <code>DENY</code>, only the root user of the new account can
     * access account billing information. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the
     * <i>AWS Billing and Cost Management User Guide</i>.
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
     *         If set to <code>ALLOW</code>, the new account enables IAM users
     *         to access account billing information <i>if</i> they have the
     *         required permissions. If set to <code>DENY</code>, only the root
     *         user of the new account can access account billing information.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     *         >Activating Access to the Billing and Cost Management Console</a>
     *         in the <i>AWS Billing and Cost Management User Guide</i>.
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
     * If set to <code>ALLOW</code>, the new account enables IAM users to access
     * account billing information <i>if</i> they have the required permissions.
     * If set to <code>DENY</code>, only the root user of the new account can
     * access account billing information. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the
     * <i>AWS Billing and Cost Management User Guide</i>.
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
     *            If set to <code>ALLOW</code>, the new account enables IAM
     *            users to access account billing information <i>if</i> they
     *            have the required permissions. If set to <code>DENY</code>,
     *            only the root user of the new account can access account
     *            billing information. For more information, see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     *            >Activating Access to the Billing and Cost Management
     *            Console</a> in the <i>AWS Billing and Cost Management User
     *            Guide</i>.
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
     * If set to <code>ALLOW</code>, the new account enables IAM users to access
     * account billing information <i>if</i> they have the required permissions.
     * If set to <code>DENY</code>, only the root user of the new account can
     * access account billing information. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the
     * <i>AWS Billing and Cost Management User Guide</i>.
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
     *            If set to <code>ALLOW</code>, the new account enables IAM
     *            users to access account billing information <i>if</i> they
     *            have the required permissions. If set to <code>DENY</code>,
     *            only the root user of the new account can access account
     *            billing information. For more information, see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     *            >Activating Access to the Billing and Cost Management
     *            Console</a> in the <i>AWS Billing and Cost Management User
     *            Guide</i>.
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
    public CreateAccountRequest withIamUserAccessToBilling(String iamUserAccessToBilling) {
        this.iamUserAccessToBilling = iamUserAccessToBilling;
        return this;
    }

    /**
     * <p>
     * If set to <code>ALLOW</code>, the new account enables IAM users to access
     * account billing information <i>if</i> they have the required permissions.
     * If set to <code>DENY</code>, only the root user of the new account can
     * access account billing information. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the
     * <i>AWS Billing and Cost Management User Guide</i>.
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
     *            If set to <code>ALLOW</code>, the new account enables IAM
     *            users to access account billing information <i>if</i> they
     *            have the required permissions. If set to <code>DENY</code>,
     *            only the root user of the new account can access account
     *            billing information. For more information, see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     *            >Activating Access to the Billing and Cost Management
     *            Console</a> in the <i>AWS Billing and Cost Management User
     *            Guide</i>.
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
     * If set to <code>ALLOW</code>, the new account enables IAM users to access
     * account billing information <i>if</i> they have the required permissions.
     * If set to <code>DENY</code>, only the root user of the new account can
     * access account billing information. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the
     * <i>AWS Billing and Cost Management User Guide</i>.
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
     *            If set to <code>ALLOW</code>, the new account enables IAM
     *            users to access account billing information <i>if</i> they
     *            have the required permissions. If set to <code>DENY</code>,
     *            only the root user of the new account can access account
     *            billing information. For more information, see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     *            >Activating Access to the Billing and Cost Management
     *            Console</a> in the <i>AWS Billing and Cost Management User
     *            Guide</i>.
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
    public CreateAccountRequest withIamUserAccessToBilling(
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

        if (obj instanceof CreateAccountRequest == false)
            return false;
        CreateAccountRequest other = (CreateAccountRequest) obj;

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
