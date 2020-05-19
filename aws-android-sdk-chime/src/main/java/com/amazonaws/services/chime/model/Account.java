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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon Chime account details. An AWS account can have multiple Amazon
 * Chime accounts.
 * </p>
 */
public class Account implements Serializable {
    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private String awsAccountId;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The Amazon Chime account name.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Chime account type. For more information about different
     * account types, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     * >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Team, EnterpriseDirectory, EnterpriseLWA,
     * EnterpriseOIDC
     */
    private String accountType;

    /**
     * <p>
     * The Amazon Chime account creation timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The default license for the Amazon Chime account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     */
    private String defaultLicense;

    /**
     * <p>
     * Supported licenses for the Amazon Chime account.
     * </p>
     */
    private java.util.List<String> supportedLicenses;

    /**
     * <p>
     * The sign-in delegate groups associated with the account.
     * </p>
     */
    private java.util.List<SigninDelegateGroup> signinDelegateGroups;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     *
     * @return <p>
     *         The AWS account ID.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     *
     * @param awsAccountId <p>
     *            The AWS account ID.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsAccountId <p>
     *            The AWS account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Account withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime account ID.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Account withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The Amazon Chime account name.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime account name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The Amazon Chime account name.
     * </p>
     *
     * @param name <p>
     *            The Amazon Chime account name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The Amazon Chime account name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The Amazon Chime account name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Account withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Chime account type. For more information about different
     * account types, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     * >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Team, EnterpriseDirectory, EnterpriseLWA,
     * EnterpriseOIDC
     *
     * @return <p>
     *         The Amazon Chime account type. For more information about
     *         different account types, see <a href=
     *         "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     *         >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
     *         Administration Guide</i>.
     *         </p>
     * @see AccountType
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * <p>
     * The Amazon Chime account type. For more information about different
     * account types, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     * >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Team, EnterpriseDirectory, EnterpriseLWA,
     * EnterpriseOIDC
     *
     * @param accountType <p>
     *            The Amazon Chime account type. For more information about
     *            different account types, see <a href=
     *            "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     *            >Managing Your Amazon Chime Accounts</a> in the <i>Amazon
     *            Chime Administration Guide</i>.
     *            </p>
     * @see AccountType
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * <p>
     * The Amazon Chime account type. For more information about different
     * account types, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     * >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Team, EnterpriseDirectory, EnterpriseLWA,
     * EnterpriseOIDC
     *
     * @param accountType <p>
     *            The Amazon Chime account type. For more information about
     *            different account types, see <a href=
     *            "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     *            >Managing Your Amazon Chime Accounts</a> in the <i>Amazon
     *            Chime Administration Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountType
     */
    public Account withAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * <p>
     * The Amazon Chime account type. For more information about different
     * account types, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     * >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Team, EnterpriseDirectory, EnterpriseLWA,
     * EnterpriseOIDC
     *
     * @param accountType <p>
     *            The Amazon Chime account type. For more information about
     *            different account types, see <a href=
     *            "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     *            >Managing Your Amazon Chime Accounts</a> in the <i>Amazon
     *            Chime Administration Guide</i>.
     *            </p>
     * @see AccountType
     */
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType.toString();
    }

    /**
     * <p>
     * The Amazon Chime account type. For more information about different
     * account types, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     * >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Team, EnterpriseDirectory, EnterpriseLWA,
     * EnterpriseOIDC
     *
     * @param accountType <p>
     *            The Amazon Chime account type. For more information about
     *            different account types, see <a href=
     *            "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     *            >Managing Your Amazon Chime Accounts</a> in the <i>Amazon
     *            Chime Administration Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountType
     */
    public Account withAccountType(AccountType accountType) {
        this.accountType = accountType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Chime account creation timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime account creation timestamp, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * <p>
     * The Amazon Chime account creation timestamp, in ISO 8601 format.
     * </p>
     *
     * @param createdTimestamp <p>
     *            The Amazon Chime account creation timestamp, in ISO 8601
     *            format.
     *            </p>
     */
    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The Amazon Chime account creation timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimestamp <p>
     *            The Amazon Chime account creation timestamp, in ISO 8601
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Account withCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * <p>
     * The default license for the Amazon Chime account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @return <p>
     *         The default license for the Amazon Chime account.
     *         </p>
     * @see License
     */
    public String getDefaultLicense() {
        return defaultLicense;
    }

    /**
     * <p>
     * The default license for the Amazon Chime account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @param defaultLicense <p>
     *            The default license for the Amazon Chime account.
     *            </p>
     * @see License
     */
    public void setDefaultLicense(String defaultLicense) {
        this.defaultLicense = defaultLicense;
    }

    /**
     * <p>
     * The default license for the Amazon Chime account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @param defaultLicense <p>
     *            The default license for the Amazon Chime account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see License
     */
    public Account withDefaultLicense(String defaultLicense) {
        this.defaultLicense = defaultLicense;
        return this;
    }

    /**
     * <p>
     * The default license for the Amazon Chime account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @param defaultLicense <p>
     *            The default license for the Amazon Chime account.
     *            </p>
     * @see License
     */
    public void setDefaultLicense(License defaultLicense) {
        this.defaultLicense = defaultLicense.toString();
    }

    /**
     * <p>
     * The default license for the Amazon Chime account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @param defaultLicense <p>
     *            The default license for the Amazon Chime account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see License
     */
    public Account withDefaultLicense(License defaultLicense) {
        this.defaultLicense = defaultLicense.toString();
        return this;
    }

    /**
     * <p>
     * Supported licenses for the Amazon Chime account.
     * </p>
     *
     * @return <p>
     *         Supported licenses for the Amazon Chime account.
     *         </p>
     */
    public java.util.List<String> getSupportedLicenses() {
        return supportedLicenses;
    }

    /**
     * <p>
     * Supported licenses for the Amazon Chime account.
     * </p>
     *
     * @param supportedLicenses <p>
     *            Supported licenses for the Amazon Chime account.
     *            </p>
     */
    public void setSupportedLicenses(java.util.Collection<String> supportedLicenses) {
        if (supportedLicenses == null) {
            this.supportedLicenses = null;
            return;
        }

        this.supportedLicenses = new java.util.ArrayList<String>(supportedLicenses);
    }

    /**
     * <p>
     * Supported licenses for the Amazon Chime account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedLicenses <p>
     *            Supported licenses for the Amazon Chime account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Account withSupportedLicenses(String... supportedLicenses) {
        if (getSupportedLicenses() == null) {
            this.supportedLicenses = new java.util.ArrayList<String>(supportedLicenses.length);
        }
        for (String value : supportedLicenses) {
            this.supportedLicenses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Supported licenses for the Amazon Chime account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedLicenses <p>
     *            Supported licenses for the Amazon Chime account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Account withSupportedLicenses(java.util.Collection<String> supportedLicenses) {
        setSupportedLicenses(supportedLicenses);
        return this;
    }

    /**
     * <p>
     * The sign-in delegate groups associated with the account.
     * </p>
     *
     * @return <p>
     *         The sign-in delegate groups associated with the account.
     *         </p>
     */
    public java.util.List<SigninDelegateGroup> getSigninDelegateGroups() {
        return signinDelegateGroups;
    }

    /**
     * <p>
     * The sign-in delegate groups associated with the account.
     * </p>
     *
     * @param signinDelegateGroups <p>
     *            The sign-in delegate groups associated with the account.
     *            </p>
     */
    public void setSigninDelegateGroups(
            java.util.Collection<SigninDelegateGroup> signinDelegateGroups) {
        if (signinDelegateGroups == null) {
            this.signinDelegateGroups = null;
            return;
        }

        this.signinDelegateGroups = new java.util.ArrayList<SigninDelegateGroup>(
                signinDelegateGroups);
    }

    /**
     * <p>
     * The sign-in delegate groups associated with the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signinDelegateGroups <p>
     *            The sign-in delegate groups associated with the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Account withSigninDelegateGroups(SigninDelegateGroup... signinDelegateGroups) {
        if (getSigninDelegateGroups() == null) {
            this.signinDelegateGroups = new java.util.ArrayList<SigninDelegateGroup>(
                    signinDelegateGroups.length);
        }
        for (SigninDelegateGroup value : signinDelegateGroups) {
            this.signinDelegateGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The sign-in delegate groups associated with the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signinDelegateGroups <p>
     *            The sign-in delegate groups associated with the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Account withSigninDelegateGroups(
            java.util.Collection<SigninDelegateGroup> signinDelegateGroups) {
        setSigninDelegateGroups(signinDelegateGroups);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getAccountType() != null)
            sb.append("AccountType: " + getAccountType() + ",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: " + getCreatedTimestamp() + ",");
        if (getDefaultLicense() != null)
            sb.append("DefaultLicense: " + getDefaultLicense() + ",");
        if (getSupportedLicenses() != null)
            sb.append("SupportedLicenses: " + getSupportedLicenses() + ",");
        if (getSigninDelegateGroups() != null)
            sb.append("SigninDelegateGroups: " + getSigninDelegateGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultLicense() == null) ? 0 : getDefaultLicense().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedLicenses() == null) ? 0 : getSupportedLicenses().hashCode());
        hashCode = prime * hashCode
                + ((getSigninDelegateGroups() == null) ? 0 : getSigninDelegateGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Account == false)
            return false;
        Account other = (Account) obj;

        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAccountType() == null ^ this.getAccountType() == null)
            return false;
        if (other.getAccountType() != null
                && other.getAccountType().equals(this.getAccountType()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null
                && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getDefaultLicense() == null ^ this.getDefaultLicense() == null)
            return false;
        if (other.getDefaultLicense() != null
                && other.getDefaultLicense().equals(this.getDefaultLicense()) == false)
            return false;
        if (other.getSupportedLicenses() == null ^ this.getSupportedLicenses() == null)
            return false;
        if (other.getSupportedLicenses() != null
                && other.getSupportedLicenses().equals(this.getSupportedLicenses()) == false)
            return false;
        if (other.getSigninDelegateGroups() == null ^ this.getSigninDelegateGroups() == null)
            return false;
        if (other.getSigninDelegateGroups() != null
                && other.getSigninDelegateGroups().equals(this.getSigninDelegateGroups()) == false)
            return false;
        return true;
    }
}
