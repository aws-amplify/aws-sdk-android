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
 * The severity of the finding.
 * </p>
 */
public class Severity implements Serializable {
    /**
     * <p>
     * The native severity as defined by the AWS service or integrated partner
     * product that generated the finding.
     * </p>
     */
    private Double product;

    /**
     * <p>
     * The severity value of the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - No issue was found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - The issue does not require action on its own.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - The issue must be addressed but not urgently.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - The issue must be addressed as a priority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - The issue must be remediated immediately to avoid
     * it escalating.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL
     */
    private String label;

    /**
     * <p>
     * Deprecated. This attribute is being deprecated. Instead of providing
     * <code>Normalized</code>, provide <code>Label</code>.
     * </p>
     * <p>
     * If you provide <code>Normalized</code> and do not provide
     * <code>Label</code>, <code>Label</code> is set automatically as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - <code>INFORMATIONAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 1–39 - <code>LOW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 40–69 - <code>MEDIUM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 70–89 - <code>HIGH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 90–100 - <code>CRITICAL</code>
     * </p>
     * </li>
     * </ul>
     */
    private Integer normalized;

    /**
     * <p>
     * The native severity as defined by the AWS service or integrated partner
     * product that generated the finding.
     * </p>
     *
     * @return <p>
     *         The native severity as defined by the AWS service or integrated
     *         partner product that generated the finding.
     *         </p>
     */
    public Double getProduct() {
        return product;
    }

    /**
     * <p>
     * The native severity as defined by the AWS service or integrated partner
     * product that generated the finding.
     * </p>
     *
     * @param product <p>
     *            The native severity as defined by the AWS service or
     *            integrated partner product that generated the finding.
     *            </p>
     */
    public void setProduct(Double product) {
        this.product = product;
    }

    /**
     * <p>
     * The native severity as defined by the AWS service or integrated partner
     * product that generated the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param product <p>
     *            The native severity as defined by the AWS service or
     *            integrated partner product that generated the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Severity withProduct(Double product) {
        this.product = product;
        return this;
    }

    /**
     * <p>
     * The severity value of the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - No issue was found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - The issue does not require action on its own.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - The issue must be addressed but not urgently.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - The issue must be addressed as a priority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - The issue must be remediated immediately to avoid
     * it escalating.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL
     *
     * @return <p>
     *         The severity value of the finding. The allowed values are the
     *         following.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INFORMATIONAL</code> - No issue was found.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LOW</code> - The issue does not require action on its own.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MEDIUM</code> - The issue must be addressed but not
     *         urgently.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HIGH</code> - The issue must be addressed as a priority.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CRITICAL</code> - The issue must be remediated immediately
     *         to avoid it escalating.
     *         </p>
     *         </li>
     *         </ul>
     * @see SeverityLabel
     */
    public String getLabel() {
        return label;
    }

    /**
     * <p>
     * The severity value of the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - No issue was found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - The issue does not require action on its own.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - The issue must be addressed but not urgently.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - The issue must be addressed as a priority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - The issue must be remediated immediately to avoid
     * it escalating.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL
     *
     * @param label <p>
     *            The severity value of the finding. The allowed values are the
     *            following.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INFORMATIONAL</code> - No issue was found.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LOW</code> - The issue does not require action on its
     *            own.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MEDIUM</code> - The issue must be addressed but not
     *            urgently.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HIGH</code> - The issue must be addressed as a priority.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CRITICAL</code> - The issue must be remediated
     *            immediately to avoid it escalating.
     *            </p>
     *            </li>
     *            </ul>
     * @see SeverityLabel
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The severity value of the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - No issue was found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - The issue does not require action on its own.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - The issue must be addressed but not urgently.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - The issue must be addressed as a priority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - The issue must be remediated immediately to avoid
     * it escalating.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL
     *
     * @param label <p>
     *            The severity value of the finding. The allowed values are the
     *            following.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INFORMATIONAL</code> - No issue was found.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LOW</code> - The issue does not require action on its
     *            own.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MEDIUM</code> - The issue must be addressed but not
     *            urgently.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HIGH</code> - The issue must be addressed as a priority.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CRITICAL</code> - The issue must be remediated
     *            immediately to avoid it escalating.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SeverityLabel
     */
    public Severity withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * <p>
     * The severity value of the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - No issue was found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - The issue does not require action on its own.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - The issue must be addressed but not urgently.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - The issue must be addressed as a priority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - The issue must be remediated immediately to avoid
     * it escalating.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL
     *
     * @param label <p>
     *            The severity value of the finding. The allowed values are the
     *            following.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INFORMATIONAL</code> - No issue was found.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LOW</code> - The issue does not require action on its
     *            own.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MEDIUM</code> - The issue must be addressed but not
     *            urgently.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HIGH</code> - The issue must be addressed as a priority.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CRITICAL</code> - The issue must be remediated
     *            immediately to avoid it escalating.
     *            </p>
     *            </li>
     *            </ul>
     * @see SeverityLabel
     */
    public void setLabel(SeverityLabel label) {
        this.label = label.toString();
    }

    /**
     * <p>
     * The severity value of the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFORMATIONAL</code> - No issue was found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOW</code> - The issue does not require action on its own.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIUM</code> - The issue must be addressed but not urgently.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIGH</code> - The issue must be addressed as a priority.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CRITICAL</code> - The issue must be remediated immediately to avoid
     * it escalating.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL
     *
     * @param label <p>
     *            The severity value of the finding. The allowed values are the
     *            following.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INFORMATIONAL</code> - No issue was found.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LOW</code> - The issue does not require action on its
     *            own.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MEDIUM</code> - The issue must be addressed but not
     *            urgently.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HIGH</code> - The issue must be addressed as a priority.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CRITICAL</code> - The issue must be remediated
     *            immediately to avoid it escalating.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SeverityLabel
     */
    public Severity withLabel(SeverityLabel label) {
        this.label = label.toString();
        return this;
    }

    /**
     * <p>
     * Deprecated. This attribute is being deprecated. Instead of providing
     * <code>Normalized</code>, provide <code>Label</code>.
     * </p>
     * <p>
     * If you provide <code>Normalized</code> and do not provide
     * <code>Label</code>, <code>Label</code> is set automatically as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - <code>INFORMATIONAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 1–39 - <code>LOW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 40–69 - <code>MEDIUM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 70–89 - <code>HIGH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 90–100 - <code>CRITICAL</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Deprecated. This attribute is being deprecated. Instead of
     *         providing <code>Normalized</code>, provide <code>Label</code>.
     *         </p>
     *         <p>
     *         If you provide <code>Normalized</code> and do not provide
     *         <code>Label</code>, <code>Label</code> is set automatically as
     *         follows.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         0 - <code>INFORMATIONAL</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1–39 - <code>LOW</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         40–69 - <code>MEDIUM</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         70–89 - <code>HIGH</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         90–100 - <code>CRITICAL</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getNormalized() {
        return normalized;
    }

    /**
     * <p>
     * Deprecated. This attribute is being deprecated. Instead of providing
     * <code>Normalized</code>, provide <code>Label</code>.
     * </p>
     * <p>
     * If you provide <code>Normalized</code> and do not provide
     * <code>Label</code>, <code>Label</code> is set automatically as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - <code>INFORMATIONAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 1–39 - <code>LOW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 40–69 - <code>MEDIUM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 70–89 - <code>HIGH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 90–100 - <code>CRITICAL</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param normalized <p>
     *            Deprecated. This attribute is being deprecated. Instead of
     *            providing <code>Normalized</code>, provide <code>Label</code>.
     *            </p>
     *            <p>
     *            If you provide <code>Normalized</code> and do not provide
     *            <code>Label</code>, <code>Label</code> is set automatically as
     *            follows.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            0 - <code>INFORMATIONAL</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1–39 - <code>LOW</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            40–69 - <code>MEDIUM</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            70–89 - <code>HIGH</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            90–100 - <code>CRITICAL</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setNormalized(Integer normalized) {
        this.normalized = normalized;
    }

    /**
     * <p>
     * Deprecated. This attribute is being deprecated. Instead of providing
     * <code>Normalized</code>, provide <code>Label</code>.
     * </p>
     * <p>
     * If you provide <code>Normalized</code> and do not provide
     * <code>Label</code>, <code>Label</code> is set automatically as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - <code>INFORMATIONAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 1–39 - <code>LOW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 40–69 - <code>MEDIUM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 70–89 - <code>HIGH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * 90–100 - <code>CRITICAL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param normalized <p>
     *            Deprecated. This attribute is being deprecated. Instead of
     *            providing <code>Normalized</code>, provide <code>Label</code>.
     *            </p>
     *            <p>
     *            If you provide <code>Normalized</code> and do not provide
     *            <code>Label</code>, <code>Label</code> is set automatically as
     *            follows.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            0 - <code>INFORMATIONAL</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1–39 - <code>LOW</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            40–69 - <code>MEDIUM</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            70–89 - <code>HIGH</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            90–100 - <code>CRITICAL</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Severity withNormalized(Integer normalized) {
        this.normalized = normalized;
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
        if (getProduct() != null)
            sb.append("Product: " + getProduct() + ",");
        if (getLabel() != null)
            sb.append("Label: " + getLabel() + ",");
        if (getNormalized() != null)
            sb.append("Normalized: " + getNormalized());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProduct() == null) ? 0 : getProduct().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getNormalized() == null) ? 0 : getNormalized().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Severity == false)
            return false;
        Severity other = (Severity) obj;

        if (other.getProduct() == null ^ this.getProduct() == null)
            return false;
        if (other.getProduct() != null && other.getProduct().equals(this.getProduct()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getNormalized() == null ^ this.getNormalized() == null)
            return false;
        if (other.getNormalized() != null
                && other.getNormalized().equals(this.getNormalized()) == false)
            return false;
        return true;
    }
}
