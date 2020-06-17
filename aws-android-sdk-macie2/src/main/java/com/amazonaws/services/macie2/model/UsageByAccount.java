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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides data for a specific usage metric and the corresponding quota for an
 * account. The value for the metric is an aggregated value that reports usage
 * during the past 30 days.
 * </p>
 */
public class UsageByAccount implements Serializable {
    /**
     * <p>
     * The type of currency that the value for the metric (estimatedCost) is
     * reported in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     */
    private String currency;

    /**
     * <p>
     * The estimated value for the metric.
     * </p>
     */
    private String estimatedCost;

    /**
     * <p>
     * The current value for the quota that corresponds to the metric specified
     * by the type field.
     * </p>
     */
    private ServiceLimit serviceLimit;

    /**
     * <p>
     * The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION,
     * for monitoring S3 buckets; and, SENSITIVE_DATA_DISCOVERY, for analyzing
     * sensitive data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA_INVENTORY_EVALUATION,
     * SENSITIVE_DATA_DISCOVERY
     */
    private String type;

    /**
     * <p>
     * The type of currency that the value for the metric (estimatedCost) is
     * reported in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @return <p>
     *         The type of currency that the value for the metric
     *         (estimatedCost) is reported in.
     *         </p>
     * @see Currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * <p>
     * The type of currency that the value for the metric (estimatedCost) is
     * reported in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currency <p>
     *            The type of currency that the value for the metric
     *            (estimatedCost) is reported in.
     *            </p>
     * @see Currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * <p>
     * The type of currency that the value for the metric (estimatedCost) is
     * reported in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currency <p>
     *            The type of currency that the value for the metric
     *            (estimatedCost) is reported in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Currency
     */
    public UsageByAccount withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * <p>
     * The type of currency that the value for the metric (estimatedCost) is
     * reported in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currency <p>
     *            The type of currency that the value for the metric
     *            (estimatedCost) is reported in.
     *            </p>
     * @see Currency
     */
    public void setCurrency(Currency currency) {
        this.currency = currency.toString();
    }

    /**
     * <p>
     * The type of currency that the value for the metric (estimatedCost) is
     * reported in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currency <p>
     *            The type of currency that the value for the metric
     *            (estimatedCost) is reported in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Currency
     */
    public UsageByAccount withCurrency(Currency currency) {
        this.currency = currency.toString();
        return this;
    }

    /**
     * <p>
     * The estimated value for the metric.
     * </p>
     *
     * @return <p>
     *         The estimated value for the metric.
     *         </p>
     */
    public String getEstimatedCost() {
        return estimatedCost;
    }

    /**
     * <p>
     * The estimated value for the metric.
     * </p>
     *
     * @param estimatedCost <p>
     *            The estimated value for the metric.
     *            </p>
     */
    public void setEstimatedCost(String estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    /**
     * <p>
     * The estimated value for the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param estimatedCost <p>
     *            The estimated value for the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageByAccount withEstimatedCost(String estimatedCost) {
        this.estimatedCost = estimatedCost;
        return this;
    }

    /**
     * <p>
     * The current value for the quota that corresponds to the metric specified
     * by the type field.
     * </p>
     *
     * @return <p>
     *         The current value for the quota that corresponds to the metric
     *         specified by the type field.
     *         </p>
     */
    public ServiceLimit getServiceLimit() {
        return serviceLimit;
    }

    /**
     * <p>
     * The current value for the quota that corresponds to the metric specified
     * by the type field.
     * </p>
     *
     * @param serviceLimit <p>
     *            The current value for the quota that corresponds to the metric
     *            specified by the type field.
     *            </p>
     */
    public void setServiceLimit(ServiceLimit serviceLimit) {
        this.serviceLimit = serviceLimit;
    }

    /**
     * <p>
     * The current value for the quota that corresponds to the metric specified
     * by the type field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceLimit <p>
     *            The current value for the quota that corresponds to the metric
     *            specified by the type field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageByAccount withServiceLimit(ServiceLimit serviceLimit) {
        this.serviceLimit = serviceLimit;
        return this;
    }

    /**
     * <p>
     * The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION,
     * for monitoring S3 buckets; and, SENSITIVE_DATA_DISCOVERY, for analyzing
     * sensitive data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA_INVENTORY_EVALUATION,
     * SENSITIVE_DATA_DISCOVERY
     *
     * @return <p>
     *         The name of the metric. Possible values are:
     *         DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and,
     *         SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
     *         </p>
     * @see UsageType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION,
     * for monitoring S3 buckets; and, SENSITIVE_DATA_DISCOVERY, for analyzing
     * sensitive data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA_INVENTORY_EVALUATION,
     * SENSITIVE_DATA_DISCOVERY
     *
     * @param type <p>
     *            The name of the metric. Possible values are:
     *            DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and,
     *            SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
     *            </p>
     * @see UsageType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION,
     * for monitoring S3 buckets; and, SENSITIVE_DATA_DISCOVERY, for analyzing
     * sensitive data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA_INVENTORY_EVALUATION,
     * SENSITIVE_DATA_DISCOVERY
     *
     * @param type <p>
     *            The name of the metric. Possible values are:
     *            DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and,
     *            SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageType
     */
    public UsageByAccount withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION,
     * for monitoring S3 buckets; and, SENSITIVE_DATA_DISCOVERY, for analyzing
     * sensitive data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA_INVENTORY_EVALUATION,
     * SENSITIVE_DATA_DISCOVERY
     *
     * @param type <p>
     *            The name of the metric. Possible values are:
     *            DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and,
     *            SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
     *            </p>
     * @see UsageType
     */
    public void setType(UsageType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION,
     * for monitoring S3 buckets; and, SENSITIVE_DATA_DISCOVERY, for analyzing
     * sensitive data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA_INVENTORY_EVALUATION,
     * SENSITIVE_DATA_DISCOVERY
     *
     * @param type <p>
     *            The name of the metric. Possible values are:
     *            DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and,
     *            SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageType
     */
    public UsageByAccount withType(UsageType type) {
        this.type = type.toString();
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
        if (getCurrency() != null)
            sb.append("currency: " + getCurrency() + ",");
        if (getEstimatedCost() != null)
            sb.append("estimatedCost: " + getEstimatedCost() + ",");
        if (getServiceLimit() != null)
            sb.append("serviceLimit: " + getServiceLimit() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        hashCode = prime * hashCode
                + ((getEstimatedCost() == null) ? 0 : getEstimatedCost().hashCode());
        hashCode = prime * hashCode
                + ((getServiceLimit() == null) ? 0 : getServiceLimit().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageByAccount == false)
            return false;
        UsageByAccount other = (UsageByAccount) obj;

        if (other.getCurrency() == null ^ this.getCurrency() == null)
            return false;
        if (other.getCurrency() != null && other.getCurrency().equals(this.getCurrency()) == false)
            return false;
        if (other.getEstimatedCost() == null ^ this.getEstimatedCost() == null)
            return false;
        if (other.getEstimatedCost() != null
                && other.getEstimatedCost().equals(this.getEstimatedCost()) == false)
            return false;
        if (other.getServiceLimit() == null ^ this.getServiceLimit() == null)
            return false;
        if (other.getServiceLimit() != null
                && other.getServiceLimit().equals(this.getServiceLimit()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
