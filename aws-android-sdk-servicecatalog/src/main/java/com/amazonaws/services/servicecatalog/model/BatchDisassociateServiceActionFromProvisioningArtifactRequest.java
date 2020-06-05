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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disassociates a batch of self-service actions from the specified provisioning
 * artifact.
 * </p>
 */
public class BatchDisassociateServiceActionFromProvisioningArtifactRequest extends
        AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * One or more associations, each consisting of the Action ID, the Product
     * ID, and the Provisioning Artifact ID.
     * </p>
     */
    private java.util.List<ServiceActionAssociation> serviceActionAssociations;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String acceptLanguage;

    /**
     * <p>
     * One or more associations, each consisting of the Action ID, the Product
     * ID, and the Provisioning Artifact ID.
     * </p>
     *
     * @return <p>
     *         One or more associations, each consisting of the Action ID, the
     *         Product ID, and the Provisioning Artifact ID.
     *         </p>
     */
    public java.util.List<ServiceActionAssociation> getServiceActionAssociations() {
        return serviceActionAssociations;
    }

    /**
     * <p>
     * One or more associations, each consisting of the Action ID, the Product
     * ID, and the Provisioning Artifact ID.
     * </p>
     *
     * @param serviceActionAssociations <p>
     *            One or more associations, each consisting of the Action ID,
     *            the Product ID, and the Provisioning Artifact ID.
     *            </p>
     */
    public void setServiceActionAssociations(
            java.util.Collection<ServiceActionAssociation> serviceActionAssociations) {
        if (serviceActionAssociations == null) {
            this.serviceActionAssociations = null;
            return;
        }

        this.serviceActionAssociations = new java.util.ArrayList<ServiceActionAssociation>(
                serviceActionAssociations);
    }

    /**
     * <p>
     * One or more associations, each consisting of the Action ID, the Product
     * ID, and the Provisioning Artifact ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceActionAssociations <p>
     *            One or more associations, each consisting of the Action ID,
     *            the Product ID, and the Provisioning Artifact ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDisassociateServiceActionFromProvisioningArtifactRequest withServiceActionAssociations(
            ServiceActionAssociation... serviceActionAssociations) {
        if (getServiceActionAssociations() == null) {
            this.serviceActionAssociations = new java.util.ArrayList<ServiceActionAssociation>(
                    serviceActionAssociations.length);
        }
        for (ServiceActionAssociation value : serviceActionAssociations) {
            this.serviceActionAssociations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more associations, each consisting of the Action ID, the Product
     * ID, and the Provisioning Artifact ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceActionAssociations <p>
     *            One or more associations, each consisting of the Action ID,
     *            the Product ID, and the Provisioning Artifact ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDisassociateServiceActionFromProvisioningArtifactRequest withServiceActionAssociations(
            java.util.Collection<ServiceActionAssociation> serviceActionAssociations) {
        setServiceActionAssociations(serviceActionAssociations);
        return this;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>
     *         The language code.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param acceptLanguage <p>
     *            The language code.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>en</code> - English (default)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>jp</code> - Japanese
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zh</code> - Chinese
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param acceptLanguage <p>
     *            The language code.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>en</code> - English (default)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>jp</code> - Japanese
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zh</code> - Chinese
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDisassociateServiceActionFromProvisioningArtifactRequest withAcceptLanguage(
            String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
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
        if (getServiceActionAssociations() != null)
            sb.append("ServiceActionAssociations: " + getServiceActionAssociations() + ",");
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: " + getAcceptLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getServiceActionAssociations() == null) ? 0 : getServiceActionAssociations()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisassociateServiceActionFromProvisioningArtifactRequest == false)
            return false;
        BatchDisassociateServiceActionFromProvisioningArtifactRequest other = (BatchDisassociateServiceActionFromProvisioningArtifactRequest) obj;

        if (other.getServiceActionAssociations() == null
                ^ this.getServiceActionAssociations() == null)
            return false;
        if (other.getServiceActionAssociations() != null
                && other.getServiceActionAssociations().equals(this.getServiceActionAssociations()) == false)
            return false;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        return true;
    }
}
