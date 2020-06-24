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
 * Creates an AWS organization. The account whose user is calling the
 * <code>CreateOrganization</code> operation automatically becomes the <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/orgs_getting-started_concepts.html#account"
 * >master account</a> of the new organization.
 * </p>
 * <p>
 * This operation must be called using credentials from the account that is to
 * become the new organization's master account. The principal must also have
 * the relevant IAM permissions.
 * </p>
 * <p>
 * By default (or if you set the <code>FeatureSet</code> parameter to
 * <code>ALL</code>), the new organization is created with all features enabled
 * and service control policies automatically enabled in the root. If you
 * instead choose to create the organization supporting only the consolidated
 * billing features by setting the <code>FeatureSet</code> parameter to
 * <code>CONSOLIDATED_BILLING"</code>, no policy types are enabled by default,
 * and you can't use organization policies
 * </p>
 */
public class CreateOrganizationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the feature set supported by the new organization. Each feature
     * set supports different levels of functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONSOLIDATED_BILLING</code>: All member accounts have their bills
     * consolidated to and paid by the master account. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     * >Consolidated billing</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * The consolidated billing feature subset isn't available for organizations
     * in the AWS GovCloud (US) Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: In addition to all the features supported by the
     * consolidated billing feature set, the master account can also apply any
     * policy type to any member account in the organization. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     * >All features</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, CONSOLIDATED_BILLING
     */
    private String featureSet;

    /**
     * <p>
     * Specifies the feature set supported by the new organization. Each feature
     * set supports different levels of functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONSOLIDATED_BILLING</code>: All member accounts have their bills
     * consolidated to and paid by the master account. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     * >Consolidated billing</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * The consolidated billing feature subset isn't available for organizations
     * in the AWS GovCloud (US) Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: In addition to all the features supported by the
     * consolidated billing feature set, the master account can also apply any
     * policy type to any member account in the organization. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     * >All features</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, CONSOLIDATED_BILLING
     *
     * @return <p>
     *         Specifies the feature set supported by the new organization. Each
     *         feature set supports different levels of functionality.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CONSOLIDATED_BILLING</code>: All member accounts have their
     *         bills consolidated to and paid by the master account. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     *         >Consolidated billing</a> in the <i>AWS Organizations User
     *         Guide.</i>
     *         </p>
     *         <p>
     *         The consolidated billing feature subset isn't available for
     *         organizations in the AWS GovCloud (US) Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL</code>: In addition to all the features supported by
     *         the consolidated billing feature set, the master account can also
     *         apply any policy type to any member account in the organization.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     *         >All features</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         </ul>
     * @see OrganizationFeatureSet
     */
    public String getFeatureSet() {
        return featureSet;
    }

    /**
     * <p>
     * Specifies the feature set supported by the new organization. Each feature
     * set supports different levels of functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONSOLIDATED_BILLING</code>: All member accounts have their bills
     * consolidated to and paid by the master account. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     * >Consolidated billing</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * The consolidated billing feature subset isn't available for organizations
     * in the AWS GovCloud (US) Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: In addition to all the features supported by the
     * consolidated billing feature set, the master account can also apply any
     * policy type to any member account in the organization. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     * >All features</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, CONSOLIDATED_BILLING
     *
     * @param featureSet <p>
     *            Specifies the feature set supported by the new organization.
     *            Each feature set supports different levels of functionality.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CONSOLIDATED_BILLING</code>: All member accounts have
     *            their bills consolidated to and paid by the master account.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     *            >Consolidated billing</a> in the <i>AWS Organizations User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            The consolidated billing feature subset isn't available for
     *            organizations in the AWS GovCloud (US) Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL</code>: In addition to all the features supported by
     *            the consolidated billing feature set, the master account can
     *            also apply any policy type to any member account in the
     *            organization. For more information, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     *            >All features</a> in the <i>AWS Organizations User Guide.</i>
     *            </p>
     *            </li>
     *            </ul>
     * @see OrganizationFeatureSet
     */
    public void setFeatureSet(String featureSet) {
        this.featureSet = featureSet;
    }

    /**
     * <p>
     * Specifies the feature set supported by the new organization. Each feature
     * set supports different levels of functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONSOLIDATED_BILLING</code>: All member accounts have their bills
     * consolidated to and paid by the master account. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     * >Consolidated billing</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * The consolidated billing feature subset isn't available for organizations
     * in the AWS GovCloud (US) Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: In addition to all the features supported by the
     * consolidated billing feature set, the master account can also apply any
     * policy type to any member account in the organization. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     * >All features</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, CONSOLIDATED_BILLING
     *
     * @param featureSet <p>
     *            Specifies the feature set supported by the new organization.
     *            Each feature set supports different levels of functionality.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CONSOLIDATED_BILLING</code>: All member accounts have
     *            their bills consolidated to and paid by the master account.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     *            >Consolidated billing</a> in the <i>AWS Organizations User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            The consolidated billing feature subset isn't available for
     *            organizations in the AWS GovCloud (US) Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL</code>: In addition to all the features supported by
     *            the consolidated billing feature set, the master account can
     *            also apply any policy type to any member account in the
     *            organization. For more information, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     *            >All features</a> in the <i>AWS Organizations User Guide.</i>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrganizationFeatureSet
     */
    public CreateOrganizationRequest withFeatureSet(String featureSet) {
        this.featureSet = featureSet;
        return this;
    }

    /**
     * <p>
     * Specifies the feature set supported by the new organization. Each feature
     * set supports different levels of functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONSOLIDATED_BILLING</code>: All member accounts have their bills
     * consolidated to and paid by the master account. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     * >Consolidated billing</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * The consolidated billing feature subset isn't available for organizations
     * in the AWS GovCloud (US) Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: In addition to all the features supported by the
     * consolidated billing feature set, the master account can also apply any
     * policy type to any member account in the organization. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     * >All features</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, CONSOLIDATED_BILLING
     *
     * @param featureSet <p>
     *            Specifies the feature set supported by the new organization.
     *            Each feature set supports different levels of functionality.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CONSOLIDATED_BILLING</code>: All member accounts have
     *            their bills consolidated to and paid by the master account.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     *            >Consolidated billing</a> in the <i>AWS Organizations User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            The consolidated billing feature subset isn't available for
     *            organizations in the AWS GovCloud (US) Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL</code>: In addition to all the features supported by
     *            the consolidated billing feature set, the master account can
     *            also apply any policy type to any member account in the
     *            organization. For more information, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     *            >All features</a> in the <i>AWS Organizations User Guide.</i>
     *            </p>
     *            </li>
     *            </ul>
     * @see OrganizationFeatureSet
     */
    public void setFeatureSet(OrganizationFeatureSet featureSet) {
        this.featureSet = featureSet.toString();
    }

    /**
     * <p>
     * Specifies the feature set supported by the new organization. Each feature
     * set supports different levels of functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONSOLIDATED_BILLING</code>: All member accounts have their bills
     * consolidated to and paid by the master account. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     * >Consolidated billing</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * The consolidated billing feature subset isn't available for organizations
     * in the AWS GovCloud (US) Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: In addition to all the features supported by the
     * consolidated billing feature set, the master account can also apply any
     * policy type to any member account in the organization. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     * >All features</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, CONSOLIDATED_BILLING
     *
     * @param featureSet <p>
     *            Specifies the feature set supported by the new organization.
     *            Each feature set supports different levels of functionality.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CONSOLIDATED_BILLING</code>: All member accounts have
     *            their bills consolidated to and paid by the master account.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     *            >Consolidated billing</a> in the <i>AWS Organizations User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            The consolidated billing feature subset isn't available for
     *            organizations in the AWS GovCloud (US) Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL</code>: In addition to all the features supported by
     *            the consolidated billing feature set, the master account can
     *            also apply any policy type to any member account in the
     *            organization. For more information, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     *            >All features</a> in the <i>AWS Organizations User Guide.</i>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrganizationFeatureSet
     */
    public CreateOrganizationRequest withFeatureSet(OrganizationFeatureSet featureSet) {
        this.featureSet = featureSet.toString();
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
        if (getFeatureSet() != null)
            sb.append("FeatureSet: " + getFeatureSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureSet() == null) ? 0 : getFeatureSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOrganizationRequest == false)
            return false;
        CreateOrganizationRequest other = (CreateOrganizationRequest) obj;

        if (other.getFeatureSet() == null ^ this.getFeatureSet() == null)
            return false;
        if (other.getFeatureSet() != null
                && other.getFeatureSet().equals(this.getFeatureSet()) == false)
            return false;
        return true;
    }
}
