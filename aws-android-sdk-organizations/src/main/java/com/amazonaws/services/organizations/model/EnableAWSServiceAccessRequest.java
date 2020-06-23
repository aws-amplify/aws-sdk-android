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
 * Enables the integration of an AWS service (the service that is specified by
 * <code>ServicePrincipal</code>) with AWS Organizations. When you enable
 * integration, you allow the specified service to create a <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html"
 * >service-linked role</a> in all the accounts in your organization. This
 * allows the service to perform operations on your behalf in your organization
 * and its accounts.
 * </p>
 * <important>
 * <p>
 * We recommend that you enable integration between AWS Organizations and the
 * specified AWS service by using the console or commands that are provided by
 * the specified service. Doing so ensures that the service is aware that it can
 * create the resources that are required for the integration. How the service
 * creates those resources in the organization's accounts depends on that
 * service. For more information, see the documentation for the other AWS
 * service.
 * </p>
 * </important>
 * <p>
 * For more information about enabling services to integrate with AWS
 * Organizations, see <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html"
 * >Integrating AWS Organizations with Other AWS Services</a> in the <i>AWS
 * Organizations User Guide.</i>
 * </p>
 * <p>
 * This operation can be called only from the organization's master account and
 * only if the organization has <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
 * >enabled all features</a>.
 * </p>
 */
public class EnableAWSServiceAccessRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The service principal name of the AWS service for which you want to
     * enable integration with your organization. This is typically in the form
     * of a URL, such as <code> <i>service-abbreviation</i>.amazonaws.com</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String servicePrincipal;

    /**
     * <p>
     * The service principal name of the AWS service for which you want to
     * enable integration with your organization. This is typically in the form
     * of a URL, such as <code> <i>service-abbreviation</i>.amazonaws.com</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return <p>
     *         The service principal name of the AWS service for which you want
     *         to enable integration with your organization. This is typically
     *         in the form of a URL, such as
     *         <code> <i>service-abbreviation</i>.amazonaws.com</code>.
     *         </p>
     */
    public String getServicePrincipal() {
        return servicePrincipal;
    }

    /**
     * <p>
     * The service principal name of the AWS service for which you want to
     * enable integration with your organization. This is typically in the form
     * of a URL, such as <code> <i>service-abbreviation</i>.amazonaws.com</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param servicePrincipal <p>
     *            The service principal name of the AWS service for which you
     *            want to enable integration with your organization. This is
     *            typically in the form of a URL, such as
     *            <code> <i>service-abbreviation</i>.amazonaws.com</code>.
     *            </p>
     */
    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    /**
     * <p>
     * The service principal name of the AWS service for which you want to
     * enable integration with your organization. This is typically in the form
     * of a URL, such as <code> <i>service-abbreviation</i>.amazonaws.com</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param servicePrincipal <p>
     *            The service principal name of the AWS service for which you
     *            want to enable integration with your organization. This is
     *            typically in the form of a URL, such as
     *            <code> <i>service-abbreviation</i>.amazonaws.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableAWSServiceAccessRequest withServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
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
        if (getServicePrincipal() != null)
            sb.append("ServicePrincipal: " + getServicePrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServicePrincipal() == null) ? 0 : getServicePrincipal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableAWSServiceAccessRequest == false)
            return false;
        EnableAWSServiceAccessRequest other = (EnableAWSServiceAccessRequest) obj;

        if (other.getServicePrincipal() == null ^ this.getServicePrincipal() == null)
            return false;
        if (other.getServicePrincipal() != null
                && other.getServicePrincipal().equals(this.getServicePrincipal()) == false)
            return false;
        return true;
    }
}
