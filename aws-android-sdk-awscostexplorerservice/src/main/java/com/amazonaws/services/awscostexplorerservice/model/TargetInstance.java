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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Details on recommended instance.
 * </p>
 */
public class TargetInstance implements Serializable {
    /**
     * <p>
     * Expected cost to operate this instance type on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedMonthlyCost;

    /**
     * <p>
     * Estimated savings resulting from modification, on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedMonthlySavings;

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs
     * for this instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String currencyCode;

    /**
     * <p>
     * Indicates whether or not this recommendation is the defaulted Amazon Web
     * Services recommendation.
     * </p>
     */
    private Boolean defaultTargetInstance;

    /**
     * <p>
     * Details on the target instance type.
     * </p>
     */
    private ResourceDetails resourceDetails;

    /**
     * <p>
     * Expected utilization metrics for target instance type.
     * </p>
     */
    private ResourceUtilization expectedResourceUtilization;

    /**
     * <p>
     * Expected cost to operate this instance type on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Expected cost to operate this instance type on a monthly basis.
     *         </p>
     */
    public String getEstimatedMonthlyCost() {
        return estimatedMonthlyCost;
    }

    /**
     * <p>
     * Expected cost to operate this instance type on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedMonthlyCost <p>
     *            Expected cost to operate this instance type on a monthly
     *            basis.
     *            </p>
     */
    public void setEstimatedMonthlyCost(String estimatedMonthlyCost) {
        this.estimatedMonthlyCost = estimatedMonthlyCost;
    }

    /**
     * <p>
     * Expected cost to operate this instance type on a monthly basis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedMonthlyCost <p>
     *            Expected cost to operate this instance type on a monthly
     *            basis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetInstance withEstimatedMonthlyCost(String estimatedMonthlyCost) {
        this.estimatedMonthlyCost = estimatedMonthlyCost;
        return this;
    }

    /**
     * <p>
     * Estimated savings resulting from modification, on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Estimated savings resulting from modification, on a monthly
     *         basis.
     *         </p>
     */
    public String getEstimatedMonthlySavings() {
        return estimatedMonthlySavings;
    }

    /**
     * <p>
     * Estimated savings resulting from modification, on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedMonthlySavings <p>
     *            Estimated savings resulting from modification, on a monthly
     *            basis.
     *            </p>
     */
    public void setEstimatedMonthlySavings(String estimatedMonthlySavings) {
        this.estimatedMonthlySavings = estimatedMonthlySavings;
    }

    /**
     * <p>
     * Estimated savings resulting from modification, on a monthly basis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedMonthlySavings <p>
     *            Estimated savings resulting from modification, on a monthly
     *            basis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetInstance withEstimatedMonthlySavings(String estimatedMonthlySavings) {
        this.estimatedMonthlySavings = estimatedMonthlySavings;
        return this;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs
     * for this instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The currency code that Amazon Web Services used to calculate the
     *         costs for this instance.
     *         </p>
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs
     * for this instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currencyCode <p>
     *            The currency code that Amazon Web Services used to calculate
     *            the costs for this instance.
     *            </p>
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs
     * for this instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currencyCode <p>
     *            The currency code that Amazon Web Services used to calculate
     *            the costs for this instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetInstance withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * Indicates whether or not this recommendation is the defaulted Amazon Web
     * Services recommendation.
     * </p>
     *
     * @return <p>
     *         Indicates whether or not this recommendation is the defaulted
     *         Amazon Web Services recommendation.
     *         </p>
     */
    public Boolean isDefaultTargetInstance() {
        return defaultTargetInstance;
    }

    /**
     * <p>
     * Indicates whether or not this recommendation is the defaulted Amazon Web
     * Services recommendation.
     * </p>
     *
     * @return <p>
     *         Indicates whether or not this recommendation is the defaulted
     *         Amazon Web Services recommendation.
     *         </p>
     */
    public Boolean getDefaultTargetInstance() {
        return defaultTargetInstance;
    }

    /**
     * <p>
     * Indicates whether or not this recommendation is the defaulted Amazon Web
     * Services recommendation.
     * </p>
     *
     * @param defaultTargetInstance <p>
     *            Indicates whether or not this recommendation is the defaulted
     *            Amazon Web Services recommendation.
     *            </p>
     */
    public void setDefaultTargetInstance(Boolean defaultTargetInstance) {
        this.defaultTargetInstance = defaultTargetInstance;
    }

    /**
     * <p>
     * Indicates whether or not this recommendation is the defaulted Amazon Web
     * Services recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultTargetInstance <p>
     *            Indicates whether or not this recommendation is the defaulted
     *            Amazon Web Services recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetInstance withDefaultTargetInstance(Boolean defaultTargetInstance) {
        this.defaultTargetInstance = defaultTargetInstance;
        return this;
    }

    /**
     * <p>
     * Details on the target instance type.
     * </p>
     *
     * @return <p>
     *         Details on the target instance type.
     *         </p>
     */
    public ResourceDetails getResourceDetails() {
        return resourceDetails;
    }

    /**
     * <p>
     * Details on the target instance type.
     * </p>
     *
     * @param resourceDetails <p>
     *            Details on the target instance type.
     *            </p>
     */
    public void setResourceDetails(ResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    /**
     * <p>
     * Details on the target instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceDetails <p>
     *            Details on the target instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetInstance withResourceDetails(ResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
        return this;
    }

    /**
     * <p>
     * Expected utilization metrics for target instance type.
     * </p>
     *
     * @return <p>
     *         Expected utilization metrics for target instance type.
     *         </p>
     */
    public ResourceUtilization getExpectedResourceUtilization() {
        return expectedResourceUtilization;
    }

    /**
     * <p>
     * Expected utilization metrics for target instance type.
     * </p>
     *
     * @param expectedResourceUtilization <p>
     *            Expected utilization metrics for target instance type.
     *            </p>
     */
    public void setExpectedResourceUtilization(ResourceUtilization expectedResourceUtilization) {
        this.expectedResourceUtilization = expectedResourceUtilization;
    }

    /**
     * <p>
     * Expected utilization metrics for target instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expectedResourceUtilization <p>
     *            Expected utilization metrics for target instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetInstance withExpectedResourceUtilization(
            ResourceUtilization expectedResourceUtilization) {
        this.expectedResourceUtilization = expectedResourceUtilization;
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
        if (getEstimatedMonthlyCost() != null)
            sb.append("EstimatedMonthlyCost: " + getEstimatedMonthlyCost() + ",");
        if (getEstimatedMonthlySavings() != null)
            sb.append("EstimatedMonthlySavings: " + getEstimatedMonthlySavings() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getDefaultTargetInstance() != null)
            sb.append("DefaultTargetInstance: " + getDefaultTargetInstance() + ",");
        if (getResourceDetails() != null)
            sb.append("ResourceDetails: " + getResourceDetails() + ",");
        if (getExpectedResourceUtilization() != null)
            sb.append("ExpectedResourceUtilization: " + getExpectedResourceUtilization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEstimatedMonthlyCost() == null) ? 0 : getEstimatedMonthlyCost().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedMonthlySavings() == null) ? 0 : getEstimatedMonthlySavings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultTargetInstance() == null) ? 0 : getDefaultTargetInstance().hashCode());
        hashCode = prime * hashCode
                + ((getResourceDetails() == null) ? 0 : getResourceDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpectedResourceUtilization() == null) ? 0
                        : getExpectedResourceUtilization().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetInstance == false)
            return false;
        TargetInstance other = (TargetInstance) obj;

        if (other.getEstimatedMonthlyCost() == null ^ this.getEstimatedMonthlyCost() == null)
            return false;
        if (other.getEstimatedMonthlyCost() != null
                && other.getEstimatedMonthlyCost().equals(this.getEstimatedMonthlyCost()) == false)
            return false;
        if (other.getEstimatedMonthlySavings() == null ^ this.getEstimatedMonthlySavings() == null)
            return false;
        if (other.getEstimatedMonthlySavings() != null
                && other.getEstimatedMonthlySavings().equals(this.getEstimatedMonthlySavings()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getDefaultTargetInstance() == null ^ this.getDefaultTargetInstance() == null)
            return false;
        if (other.getDefaultTargetInstance() != null
                && other.getDefaultTargetInstance().equals(this.getDefaultTargetInstance()) == false)
            return false;
        if (other.getResourceDetails() == null ^ this.getResourceDetails() == null)
            return false;
        if (other.getResourceDetails() != null
                && other.getResourceDetails().equals(this.getResourceDetails()) == false)
            return false;
        if (other.getExpectedResourceUtilization() == null
                ^ this.getExpectedResourceUtilization() == null)
            return false;
        if (other.getExpectedResourceUtilization() != null
                && other.getExpectedResourceUtilization().equals(
                        this.getExpectedResourceUtilization()) == false)
            return false;
        return true;
    }
}
