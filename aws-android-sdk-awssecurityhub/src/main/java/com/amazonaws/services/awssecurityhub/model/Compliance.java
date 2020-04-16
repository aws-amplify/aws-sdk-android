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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Exclusive to findings that are generated as the result of a check run against
 * a specific rule in a supported security standard, such as CIS AWS
 * Foundations. Contains security standard-related finding details.
 * </p>
 * <p>
 * Values include the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Allowed values are the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>PASSED</code> - Standards check passed for all evaluated resources.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WARNING</code> - Some information is missing or this check is not
 * supported given your configuration.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>FAILED</code> - Standards check failed for at least one evaluated
 * resource.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>NOT_AVAILABLE</code> - Check could not be performed due to a service
 * outage, API error, or because the result of the AWS Config evaluation was
 * <code>NOT_APPLICABLE</code>. If the AWS Config evaluation result was
 * <code> NOT_APPLICABLE</code>, then after 3 days, Security Hub automatically
 * archives the finding.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 */
public class Compliance implements Serializable {
    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSED, WARNING, FAILED, NOT_AVAILABLE
     */
    private String status;

    /**
     * <p>
     * List of requirements that are related to a standards control.
     * </p>
     */
    private java.util.List<String> relatedRequirements;

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSED, WARNING, FAILED, NOT_AVAILABLE
     *
     * @return <p>
     *         The result of a standards check.
     *         </p>
     * @see ComplianceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSED, WARNING, FAILED, NOT_AVAILABLE
     *
     * @param status <p>
     *            The result of a standards check.
     *            </p>
     * @see ComplianceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSED, WARNING, FAILED, NOT_AVAILABLE
     *
     * @param status <p>
     *            The result of a standards check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComplianceStatus
     */
    public Compliance withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSED, WARNING, FAILED, NOT_AVAILABLE
     *
     * @param status <p>
     *            The result of a standards check.
     *            </p>
     * @see ComplianceStatus
     */
    public void setStatus(ComplianceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSED, WARNING, FAILED, NOT_AVAILABLE
     *
     * @param status <p>
     *            The result of a standards check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComplianceStatus
     */
    public Compliance withStatus(ComplianceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * List of requirements that are related to a standards control.
     * </p>
     *
     * @return <p>
     *         List of requirements that are related to a standards control.
     *         </p>
     */
    public java.util.List<String> getRelatedRequirements() {
        return relatedRequirements;
    }

    /**
     * <p>
     * List of requirements that are related to a standards control.
     * </p>
     *
     * @param relatedRequirements <p>
     *            List of requirements that are related to a standards control.
     *            </p>
     */
    public void setRelatedRequirements(java.util.Collection<String> relatedRequirements) {
        if (relatedRequirements == null) {
            this.relatedRequirements = null;
            return;
        }

        this.relatedRequirements = new java.util.ArrayList<String>(relatedRequirements);
    }

    /**
     * <p>
     * List of requirements that are related to a standards control.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relatedRequirements <p>
     *            List of requirements that are related to a standards control.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Compliance withRelatedRequirements(String... relatedRequirements) {
        if (getRelatedRequirements() == null) {
            this.relatedRequirements = new java.util.ArrayList<String>(relatedRequirements.length);
        }
        for (String value : relatedRequirements) {
            this.relatedRequirements.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of requirements that are related to a standards control.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relatedRequirements <p>
     *            List of requirements that are related to a standards control.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Compliance withRelatedRequirements(java.util.Collection<String> relatedRequirements) {
        setRelatedRequirements(relatedRequirements);
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getRelatedRequirements() != null)
            sb.append("RelatedRequirements: " + getRelatedRequirements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getRelatedRequirements() == null) ? 0 : getRelatedRequirements().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Compliance == false)
            return false;
        Compliance other = (Compliance) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRelatedRequirements() == null ^ this.getRelatedRequirements() == null)
            return false;
        if (other.getRelatedRequirements() != null
                && other.getRelatedRequirements().equals(this.getRelatedRequirements()) == false)
            return false;
        return true;
    }
}
