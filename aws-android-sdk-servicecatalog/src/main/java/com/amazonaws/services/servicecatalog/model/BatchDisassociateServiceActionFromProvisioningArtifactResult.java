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

public class BatchDisassociateServiceActionFromProvisioningArtifactResult implements Serializable {
    /**
     * <p>
     * An object that contains a list of errors, along with information to help
     * you identify the self-service action.
     * </p>
     */
    private java.util.List<FailedServiceActionAssociation> failedServiceActionAssociations;

    /**
     * <p>
     * An object that contains a list of errors, along with information to help
     * you identify the self-service action.
     * </p>
     *
     * @return <p>
     *         An object that contains a list of errors, along with information
     *         to help you identify the self-service action.
     *         </p>
     */
    public java.util.List<FailedServiceActionAssociation> getFailedServiceActionAssociations() {
        return failedServiceActionAssociations;
    }

    /**
     * <p>
     * An object that contains a list of errors, along with information to help
     * you identify the self-service action.
     * </p>
     *
     * @param failedServiceActionAssociations <p>
     *            An object that contains a list of errors, along with
     *            information to help you identify the self-service action.
     *            </p>
     */
    public void setFailedServiceActionAssociations(
            java.util.Collection<FailedServiceActionAssociation> failedServiceActionAssociations) {
        if (failedServiceActionAssociations == null) {
            this.failedServiceActionAssociations = null;
            return;
        }

        this.failedServiceActionAssociations = new java.util.ArrayList<FailedServiceActionAssociation>(
                failedServiceActionAssociations);
    }

    /**
     * <p>
     * An object that contains a list of errors, along with information to help
     * you identify the self-service action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedServiceActionAssociations <p>
     *            An object that contains a list of errors, along with
     *            information to help you identify the self-service action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDisassociateServiceActionFromProvisioningArtifactResult withFailedServiceActionAssociations(
            FailedServiceActionAssociation... failedServiceActionAssociations) {
        if (getFailedServiceActionAssociations() == null) {
            this.failedServiceActionAssociations = new java.util.ArrayList<FailedServiceActionAssociation>(
                    failedServiceActionAssociations.length);
        }
        for (FailedServiceActionAssociation value : failedServiceActionAssociations) {
            this.failedServiceActionAssociations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains a list of errors, along with information to help
     * you identify the self-service action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedServiceActionAssociations <p>
     *            An object that contains a list of errors, along with
     *            information to help you identify the self-service action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDisassociateServiceActionFromProvisioningArtifactResult withFailedServiceActionAssociations(
            java.util.Collection<FailedServiceActionAssociation> failedServiceActionAssociations) {
        setFailedServiceActionAssociations(failedServiceActionAssociations);
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
        if (getFailedServiceActionAssociations() != null)
            sb.append("FailedServiceActionAssociations: " + getFailedServiceActionAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFailedServiceActionAssociations() == null) ? 0
                        : getFailedServiceActionAssociations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisassociateServiceActionFromProvisioningArtifactResult == false)
            return false;
        BatchDisassociateServiceActionFromProvisioningArtifactResult other = (BatchDisassociateServiceActionFromProvisioningArtifactResult) obj;

        if (other.getFailedServiceActionAssociations() == null
                ^ this.getFailedServiceActionAssociations() == null)
            return false;
        if (other.getFailedServiceActionAssociations() != null
                && other.getFailedServiceActionAssociations().equals(
                        this.getFailedServiceActionAssociations()) == false)
            return false;
        return true;
    }
}
