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

/**
 * <p>
 * Contains details about an organization. An organization is a collection of
 * accounts that are centrally managed together using consolidated billing,
 * organized hierarchically with organizational units (OUs), and controlled with
 * policies .
 * </p>
 */
public class Organization implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * organization ID string requires "o-" followed by from 10 to 32 lower-case
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^o-[a-z0-9]{10,32}$<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organization.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws:organizations::\d{12}:organization\/o-[a-z0-9]{10,32}<br/>
     */
    private String arn;

    /**
     * <p>
     * Specifies the functionality that currently is available to the
     * organization. If set to "ALL", then all features are enabled and policies
     * can be applied to accounts in the organization. If set to
     * "CONSOLIDATED_BILLING", then only consolidated billing functionality is
     * available. For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS
     * Organizations User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, CONSOLIDATED_BILLING
     */
    private String featureSet;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that is designated as the
     * master account for the organization.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws:organizations::\d{12}:account\/o-[a-z0-9]{10,32}\/\d{12}
     * <br/>
     */
    private String masterAccountArn;

    /**
     * <p>
     * The unique identifier (ID) of the master account of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String masterAccountId;

    /**
     * <p>
     * The email address that is associated with the AWS account that is
     * designated as the master account for the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     * <b>Pattern: </b>[^\s@]+@[^\s@]+\.[^\s@]+<br/>
     */
    private String masterAccountEmail;

    /**
     * <p>
     * A list of policy types that are enabled for this organization. For
     * example, if your organization has all features enabled, then service
     * control policies (SCPs) are included in the list.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can
     * separately enable and disable them at the root level by using
     * <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use
     * <a>ListRoots</a> to see the status of a policy type in that root.
     * </p>
     * </note>
     */
    private java.util.List<PolicyTypeSummary> availablePolicyTypes;

    /**
     * <p>
     * The unique identifier (ID) of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * organization ID string requires "o-" followed by from 10 to 32 lower-case
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^o-[a-z0-9]{10,32}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of an organization.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for an organization ID string requires "o-" followed by from 10
     *         to 32 lower-case letters or digits.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier (ID) of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * organization ID string requires "o-" followed by from 10 to 32 lower-case
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^o-[a-z0-9]{10,32}$<br/>
     *
     * @param id <p>
     *            The unique identifier (ID) of an organization.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an organization ID string requires "o-"
     *            followed by from 10 to 32 lower-case letters or digits.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * organization ID string requires "o-" followed by from 10 to 32 lower-case
     * letters or digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^o-[a-z0-9]{10,32}$<br/>
     *
     * @param id <p>
     *            The unique identifier (ID) of an organization.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an organization ID string requires "o-"
     *            followed by from 10 to 32 lower-case letters or digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Organization withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organization.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws:organizations::\d{12}:organization\/o-[a-z0-9]{10,32}<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an organization.
     *         </p>
     *         <p>
     *         For more information about ARNs in Organizations, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *         >ARN Formats Supported by Organizations</a> in the <i>AWS
     *         Organizations User Guide</i>.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organization.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws:organizations::\d{12}:organization\/o-[a-z0-9]{10,32}<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of an organization.
     *            </p>
     *            <p>
     *            For more information about ARNs in Organizations, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *            >ARN Formats Supported by Organizations</a> in the <i>AWS
     *            Organizations User Guide</i>.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organization.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws:organizations::\d{12}:organization\/o-[a-z0-9]{10,32}<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of an organization.
     *            </p>
     *            <p>
     *            For more information about ARNs in Organizations, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *            >ARN Formats Supported by Organizations</a> in the <i>AWS
     *            Organizations User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Organization withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * Specifies the functionality that currently is available to the
     * organization. If set to "ALL", then all features are enabled and policies
     * can be applied to accounts in the organization. If set to
     * "CONSOLIDATED_BILLING", then only consolidated billing functionality is
     * available. For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS
     * Organizations User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, CONSOLIDATED_BILLING
     *
     * @return <p>
     *         Specifies the functionality that currently is available to the
     *         organization. If set to "ALL", then all features are enabled and
     *         policies can be applied to accounts in the organization. If set
     *         to "CONSOLIDATED_BILLING", then only consolidated billing
     *         functionality is available. For more information, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *         >Enabling All Features in Your Organization</a> in the <i>AWS
     *         Organizations User Guide</i>.
     *         </p>
     * @see OrganizationFeatureSet
     */
    public String getFeatureSet() {
        return featureSet;
    }

    /**
     * <p>
     * Specifies the functionality that currently is available to the
     * organization. If set to "ALL", then all features are enabled and policies
     * can be applied to accounts in the organization. If set to
     * "CONSOLIDATED_BILLING", then only consolidated billing functionality is
     * available. For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS
     * Organizations User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, CONSOLIDATED_BILLING
     *
     * @param featureSet <p>
     *            Specifies the functionality that currently is available to the
     *            organization. If set to "ALL", then all features are enabled
     *            and policies can be applied to accounts in the organization.
     *            If set to "CONSOLIDATED_BILLING", then only consolidated
     *            billing functionality is available. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *            >Enabling All Features in Your Organization</a> in the <i>AWS
     *            Organizations User Guide</i>.
     *            </p>
     * @see OrganizationFeatureSet
     */
    public void setFeatureSet(String featureSet) {
        this.featureSet = featureSet;
    }

    /**
     * <p>
     * Specifies the functionality that currently is available to the
     * organization. If set to "ALL", then all features are enabled and policies
     * can be applied to accounts in the organization. If set to
     * "CONSOLIDATED_BILLING", then only consolidated billing functionality is
     * available. For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS
     * Organizations User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, CONSOLIDATED_BILLING
     *
     * @param featureSet <p>
     *            Specifies the functionality that currently is available to the
     *            organization. If set to "ALL", then all features are enabled
     *            and policies can be applied to accounts in the organization.
     *            If set to "CONSOLIDATED_BILLING", then only consolidated
     *            billing functionality is available. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *            >Enabling All Features in Your Organization</a> in the <i>AWS
     *            Organizations User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrganizationFeatureSet
     */
    public Organization withFeatureSet(String featureSet) {
        this.featureSet = featureSet;
        return this;
    }

    /**
     * <p>
     * Specifies the functionality that currently is available to the
     * organization. If set to "ALL", then all features are enabled and policies
     * can be applied to accounts in the organization. If set to
     * "CONSOLIDATED_BILLING", then only consolidated billing functionality is
     * available. For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS
     * Organizations User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, CONSOLIDATED_BILLING
     *
     * @param featureSet <p>
     *            Specifies the functionality that currently is available to the
     *            organization. If set to "ALL", then all features are enabled
     *            and policies can be applied to accounts in the organization.
     *            If set to "CONSOLIDATED_BILLING", then only consolidated
     *            billing functionality is available. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *            >Enabling All Features in Your Organization</a> in the <i>AWS
     *            Organizations User Guide</i>.
     *            </p>
     * @see OrganizationFeatureSet
     */
    public void setFeatureSet(OrganizationFeatureSet featureSet) {
        this.featureSet = featureSet.toString();
    }

    /**
     * <p>
     * Specifies the functionality that currently is available to the
     * organization. If set to "ALL", then all features are enabled and policies
     * can be applied to accounts in the organization. If set to
     * "CONSOLIDATED_BILLING", then only consolidated billing functionality is
     * available. For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS
     * Organizations User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, CONSOLIDATED_BILLING
     *
     * @param featureSet <p>
     *            Specifies the functionality that currently is available to the
     *            organization. If set to "ALL", then all features are enabled
     *            and policies can be applied to accounts in the organization.
     *            If set to "CONSOLIDATED_BILLING", then only consolidated
     *            billing functionality is available. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *            >Enabling All Features in Your Organization</a> in the <i>AWS
     *            Organizations User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrganizationFeatureSet
     */
    public Organization withFeatureSet(OrganizationFeatureSet featureSet) {
        this.featureSet = featureSet.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that is designated as the
     * master account for the organization.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws:organizations::\d{12}:account\/o-[a-z0-9]{10,32}\/\d{12}
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the account that is designated
     *         as the master account for the organization.
     *         </p>
     *         <p>
     *         For more information about ARNs in Organizations, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *         >ARN Formats Supported by Organizations</a> in the <i>AWS
     *         Organizations User Guide</i>.
     *         </p>
     */
    public String getMasterAccountArn() {
        return masterAccountArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that is designated as the
     * master account for the organization.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws:organizations::\d{12}:account\/o-[a-z0-9]{10,32}\/\d{12}
     * <br/>
     *
     * @param masterAccountArn <p>
     *            The Amazon Resource Name (ARN) of the account that is
     *            designated as the master account for the organization.
     *            </p>
     *            <p>
     *            For more information about ARNs in Organizations, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *            >ARN Formats Supported by Organizations</a> in the <i>AWS
     *            Organizations User Guide</i>.
     *            </p>
     */
    public void setMasterAccountArn(String masterAccountArn) {
        this.masterAccountArn = masterAccountArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that is designated as the
     * master account for the organization.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws:organizations::\d{12}:account\/o-[a-z0-9]{10,32}\/\d{12}
     * <br/>
     *
     * @param masterAccountArn <p>
     *            The Amazon Resource Name (ARN) of the account that is
     *            designated as the master account for the organization.
     *            </p>
     *            <p>
     *            For more information about ARNs in Organizations, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *            >ARN Formats Supported by Organizations</a> in the <i>AWS
     *            Organizations User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Organization withMasterAccountArn(String masterAccountArn) {
        this.masterAccountArn = masterAccountArn;
        return this;
    }

    /**
     * <p>
     * The unique identifier (ID) of the master account of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the master account of an
     *         organization.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for an account ID string requires exactly 12 digits.
     *         </p>
     */
    public String getMasterAccountId() {
        return masterAccountId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the master account of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param masterAccountId <p>
     *            The unique identifier (ID) of the master account of an
     *            organization.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an account ID string requires exactly 12
     *            digits.
     *            </p>
     */
    public void setMasterAccountId(String masterAccountId) {
        this.masterAccountId = masterAccountId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the master account of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param masterAccountId <p>
     *            The unique identifier (ID) of the master account of an
     *            organization.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an account ID string requires exactly 12
     *            digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Organization withMasterAccountId(String masterAccountId) {
        this.masterAccountId = masterAccountId;
        return this;
    }

    /**
     * <p>
     * The email address that is associated with the AWS account that is
     * designated as the master account for the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     * <b>Pattern: </b>[^\s@]+@[^\s@]+\.[^\s@]+<br/>
     *
     * @return <p>
     *         The email address that is associated with the AWS account that is
     *         designated as the master account for the organization.
     *         </p>
     */
    public String getMasterAccountEmail() {
        return masterAccountEmail;
    }

    /**
     * <p>
     * The email address that is associated with the AWS account that is
     * designated as the master account for the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     * <b>Pattern: </b>[^\s@]+@[^\s@]+\.[^\s@]+<br/>
     *
     * @param masterAccountEmail <p>
     *            The email address that is associated with the AWS account that
     *            is designated as the master account for the organization.
     *            </p>
     */
    public void setMasterAccountEmail(String masterAccountEmail) {
        this.masterAccountEmail = masterAccountEmail;
    }

    /**
     * <p>
     * The email address that is associated with the AWS account that is
     * designated as the master account for the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     * <b>Pattern: </b>[^\s@]+@[^\s@]+\.[^\s@]+<br/>
     *
     * @param masterAccountEmail <p>
     *            The email address that is associated with the AWS account that
     *            is designated as the master account for the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Organization withMasterAccountEmail(String masterAccountEmail) {
        this.masterAccountEmail = masterAccountEmail;
        return this;
    }

    /**
     * <p>
     * A list of policy types that are enabled for this organization. For
     * example, if your organization has all features enabled, then service
     * control policies (SCPs) are included in the list.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can
     * separately enable and disable them at the root level by using
     * <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use
     * <a>ListRoots</a> to see the status of a policy type in that root.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of policy types that are enabled for this organization.
     *         For example, if your organization has all features enabled, then
     *         service control policies (SCPs) are included in the list.
     *         </p>
     *         <note>
     *         <p>
     *         Even if a policy type is shown as available in the organization,
     *         you can separately enable and disable them at the root level by
     *         using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use
     *         <a>ListRoots</a> to see the status of a policy type in that root.
     *         </p>
     *         </note>
     */
    public java.util.List<PolicyTypeSummary> getAvailablePolicyTypes() {
        return availablePolicyTypes;
    }

    /**
     * <p>
     * A list of policy types that are enabled for this organization. For
     * example, if your organization has all features enabled, then service
     * control policies (SCPs) are included in the list.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can
     * separately enable and disable them at the root level by using
     * <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use
     * <a>ListRoots</a> to see the status of a policy type in that root.
     * </p>
     * </note>
     *
     * @param availablePolicyTypes <p>
     *            A list of policy types that are enabled for this organization.
     *            For example, if your organization has all features enabled,
     *            then service control policies (SCPs) are included in the list.
     *            </p>
     *            <note>
     *            <p>
     *            Even if a policy type is shown as available in the
     *            organization, you can separately enable and disable them at
     *            the root level by using <a>EnablePolicyType</a> and
     *            <a>DisablePolicyType</a>. Use <a>ListRoots</a> to see the
     *            status of a policy type in that root.
     *            </p>
     *            </note>
     */
    public void setAvailablePolicyTypes(java.util.Collection<PolicyTypeSummary> availablePolicyTypes) {
        if (availablePolicyTypes == null) {
            this.availablePolicyTypes = null;
            return;
        }

        this.availablePolicyTypes = new java.util.ArrayList<PolicyTypeSummary>(availablePolicyTypes);
    }

    /**
     * <p>
     * A list of policy types that are enabled for this organization. For
     * example, if your organization has all features enabled, then service
     * control policies (SCPs) are included in the list.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can
     * separately enable and disable them at the root level by using
     * <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use
     * <a>ListRoots</a> to see the status of a policy type in that root.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availablePolicyTypes <p>
     *            A list of policy types that are enabled for this organization.
     *            For example, if your organization has all features enabled,
     *            then service control policies (SCPs) are included in the list.
     *            </p>
     *            <note>
     *            <p>
     *            Even if a policy type is shown as available in the
     *            organization, you can separately enable and disable them at
     *            the root level by using <a>EnablePolicyType</a> and
     *            <a>DisablePolicyType</a>. Use <a>ListRoots</a> to see the
     *            status of a policy type in that root.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Organization withAvailablePolicyTypes(PolicyTypeSummary... availablePolicyTypes) {
        if (getAvailablePolicyTypes() == null) {
            this.availablePolicyTypes = new java.util.ArrayList<PolicyTypeSummary>(
                    availablePolicyTypes.length);
        }
        for (PolicyTypeSummary value : availablePolicyTypes) {
            this.availablePolicyTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of policy types that are enabled for this organization. For
     * example, if your organization has all features enabled, then service
     * control policies (SCPs) are included in the list.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can
     * separately enable and disable them at the root level by using
     * <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use
     * <a>ListRoots</a> to see the status of a policy type in that root.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availablePolicyTypes <p>
     *            A list of policy types that are enabled for this organization.
     *            For example, if your organization has all features enabled,
     *            then service control policies (SCPs) are included in the list.
     *            </p>
     *            <note>
     *            <p>
     *            Even if a policy type is shown as available in the
     *            organization, you can separately enable and disable them at
     *            the root level by using <a>EnablePolicyType</a> and
     *            <a>DisablePolicyType</a>. Use <a>ListRoots</a> to see the
     *            status of a policy type in that root.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Organization withAvailablePolicyTypes(
            java.util.Collection<PolicyTypeSummary> availablePolicyTypes) {
        setAvailablePolicyTypes(availablePolicyTypes);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getFeatureSet() != null)
            sb.append("FeatureSet: " + getFeatureSet() + ",");
        if (getMasterAccountArn() != null)
            sb.append("MasterAccountArn: " + getMasterAccountArn() + ",");
        if (getMasterAccountId() != null)
            sb.append("MasterAccountId: " + getMasterAccountId() + ",");
        if (getMasterAccountEmail() != null)
            sb.append("MasterAccountEmail: " + getMasterAccountEmail() + ",");
        if (getAvailablePolicyTypes() != null)
            sb.append("AvailablePolicyTypes: " + getAvailablePolicyTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getFeatureSet() == null) ? 0 : getFeatureSet().hashCode());
        hashCode = prime * hashCode
                + ((getMasterAccountArn() == null) ? 0 : getMasterAccountArn().hashCode());
        hashCode = prime * hashCode
                + ((getMasterAccountId() == null) ? 0 : getMasterAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getMasterAccountEmail() == null) ? 0 : getMasterAccountEmail().hashCode());
        hashCode = prime * hashCode
                + ((getAvailablePolicyTypes() == null) ? 0 : getAvailablePolicyTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Organization == false)
            return false;
        Organization other = (Organization) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getFeatureSet() == null ^ this.getFeatureSet() == null)
            return false;
        if (other.getFeatureSet() != null
                && other.getFeatureSet().equals(this.getFeatureSet()) == false)
            return false;
        if (other.getMasterAccountArn() == null ^ this.getMasterAccountArn() == null)
            return false;
        if (other.getMasterAccountArn() != null
                && other.getMasterAccountArn().equals(this.getMasterAccountArn()) == false)
            return false;
        if (other.getMasterAccountId() == null ^ this.getMasterAccountId() == null)
            return false;
        if (other.getMasterAccountId() != null
                && other.getMasterAccountId().equals(this.getMasterAccountId()) == false)
            return false;
        if (other.getMasterAccountEmail() == null ^ this.getMasterAccountEmail() == null)
            return false;
        if (other.getMasterAccountEmail() != null
                && other.getMasterAccountEmail().equals(this.getMasterAccountEmail()) == false)
            return false;
        if (other.getAvailablePolicyTypes() == null ^ this.getAvailablePolicyTypes() == null)
            return false;
        if (other.getAvailablePolicyTypes() != null
                && other.getAvailablePolicyTypes().equals(this.getAvailablePolicyTypes()) == false)
            return false;
        return true;
    }
}
