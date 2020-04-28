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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * A summary of compliance information by compliance type.
 * </p>
 */
public class ComplianceSummaryItem implements Serializable {
    /**
     * <p>
     * The type of compliance item. For example, the compliance type can be
     * Association, Patch, or Custom:string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     */
    private String complianceType;

    /**
     * <p>
     * A list of COMPLIANT items for the specified compliance type.
     * </p>
     */
    private CompliantSummary compliantSummary;

    /**
     * <p>
     * A list of NON_COMPLIANT items for the specified compliance type.
     * </p>
     */
    private NonCompliantSummary nonCompliantSummary;

    /**
     * <p>
     * The type of compliance item. For example, the compliance type can be
     * Association, Patch, or Custom:string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     *
     * @return <p>
     *         The type of compliance item. For example, the compliance type can
     *         be Association, Patch, or Custom:string.
     *         </p>
     */
    public String getComplianceType() {
        return complianceType;
    }

    /**
     * <p>
     * The type of compliance item. For example, the compliance type can be
     * Association, Patch, or Custom:string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     *
     * @param complianceType <p>
     *            The type of compliance item. For example, the compliance type
     *            can be Association, Patch, or Custom:string.
     *            </p>
     */
    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * The type of compliance item. For example, the compliance type can be
     * Association, Patch, or Custom:string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     *
     * @param complianceType <p>
     *            The type of compliance item. For example, the compliance type
     *            can be Association, Patch, or Custom:string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComplianceSummaryItem withComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }

    /**
     * <p>
     * A list of COMPLIANT items for the specified compliance type.
     * </p>
     *
     * @return <p>
     *         A list of COMPLIANT items for the specified compliance type.
     *         </p>
     */
    public CompliantSummary getCompliantSummary() {
        return compliantSummary;
    }

    /**
     * <p>
     * A list of COMPLIANT items for the specified compliance type.
     * </p>
     *
     * @param compliantSummary <p>
     *            A list of COMPLIANT items for the specified compliance type.
     *            </p>
     */
    public void setCompliantSummary(CompliantSummary compliantSummary) {
        this.compliantSummary = compliantSummary;
    }

    /**
     * <p>
     * A list of COMPLIANT items for the specified compliance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compliantSummary <p>
     *            A list of COMPLIANT items for the specified compliance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComplianceSummaryItem withCompliantSummary(CompliantSummary compliantSummary) {
        this.compliantSummary = compliantSummary;
        return this;
    }

    /**
     * <p>
     * A list of NON_COMPLIANT items for the specified compliance type.
     * </p>
     *
     * @return <p>
     *         A list of NON_COMPLIANT items for the specified compliance type.
     *         </p>
     */
    public NonCompliantSummary getNonCompliantSummary() {
        return nonCompliantSummary;
    }

    /**
     * <p>
     * A list of NON_COMPLIANT items for the specified compliance type.
     * </p>
     *
     * @param nonCompliantSummary <p>
     *            A list of NON_COMPLIANT items for the specified compliance
     *            type.
     *            </p>
     */
    public void setNonCompliantSummary(NonCompliantSummary nonCompliantSummary) {
        this.nonCompliantSummary = nonCompliantSummary;
    }

    /**
     * <p>
     * A list of NON_COMPLIANT items for the specified compliance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nonCompliantSummary <p>
     *            A list of NON_COMPLIANT items for the specified compliance
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComplianceSummaryItem withNonCompliantSummary(NonCompliantSummary nonCompliantSummary) {
        this.nonCompliantSummary = nonCompliantSummary;
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
        if (getComplianceType() != null)
            sb.append("ComplianceType: " + getComplianceType() + ",");
        if (getCompliantSummary() != null)
            sb.append("CompliantSummary: " + getCompliantSummary() + ",");
        if (getNonCompliantSummary() != null)
            sb.append("NonCompliantSummary: " + getNonCompliantSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode
                + ((getCompliantSummary() == null) ? 0 : getCompliantSummary().hashCode());
        hashCode = prime * hashCode
                + ((getNonCompliantSummary() == null) ? 0 : getNonCompliantSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceSummaryItem == false)
            return false;
        ComplianceSummaryItem other = (ComplianceSummaryItem) obj;

        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null
                && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getCompliantSummary() == null ^ this.getCompliantSummary() == null)
            return false;
        if (other.getCompliantSummary() != null
                && other.getCompliantSummary().equals(this.getCompliantSummary()) == false)
            return false;
        if (other.getNonCompliantSummary() == null ^ this.getNonCompliantSummary() == null)
            return false;
        if (other.getNonCompliantSummary() != null
                && other.getNonCompliantSummary().equals(this.getNonCompliantSummary()) == false)
            return false;
        return true;
    }
}
