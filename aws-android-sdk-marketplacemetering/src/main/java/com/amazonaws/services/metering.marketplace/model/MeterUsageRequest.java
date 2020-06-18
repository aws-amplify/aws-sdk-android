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

package com.amazonaws.services.metering.marketplace.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * API to emit metering records. For identical requests, the API is idempotent.
 * It simply returns the metering record ID.
 * </p>
 * <p>
 * MeterUsage is authenticated on the buyer's AWS account using credentials from
 * the EC2 instance, ECS task, or EKS pod.
 * </p>
 */
public class MeterUsageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace.
     * The product code should be the same as the one used during the publishing
     * of a new product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String productCode;

    /**
     * <p>
     * Timestamp, in UTC, for which the usage is being reported. Your
     * application can meter usage for up to one hour in the past. Make sure the
     * timestamp value is not before the start of the software usage.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * It will be one of the fcp dimension name provided during the publishing
     * of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String usageDimension;

    /**
     * <p>
     * Consumption value for the hour. Defaults to <code>0</code> if not
     * specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer usageQuantity;

    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does
     * not make the request. If you have the permissions, the request returns
     * DryRunOperation; otherwise, it returns UnauthorizedException. Defaults to
     * <code>false</code> if not specified.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace.
     * The product code should be the same as the one used during the publishing
     * of a new product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         Product code is used to uniquely identify a product in AWS
     *         Marketplace. The product code should be the same as the one used
     *         during the publishing of a new product.
     *         </p>
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace.
     * The product code should be the same as the one used during the publishing
     * of a new product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param productCode <p>
     *            Product code is used to uniquely identify a product in AWS
     *            Marketplace. The product code should be the same as the one
     *            used during the publishing of a new product.
     *            </p>
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace.
     * The product code should be the same as the one used during the publishing
     * of a new product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param productCode <p>
     *            Product code is used to uniquely identify a product in AWS
     *            Marketplace. The product code should be the same as the one
     *            used during the publishing of a new product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MeterUsageRequest withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    /**
     * <p>
     * Timestamp, in UTC, for which the usage is being reported. Your
     * application can meter usage for up to one hour in the past. Make sure the
     * timestamp value is not before the start of the software usage.
     * </p>
     *
     * @return <p>
     *         Timestamp, in UTC, for which the usage is being reported. Your
     *         application can meter usage for up to one hour in the past. Make
     *         sure the timestamp value is not before the start of the software
     *         usage.
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * Timestamp, in UTC, for which the usage is being reported. Your
     * application can meter usage for up to one hour in the past. Make sure the
     * timestamp value is not before the start of the software usage.
     * </p>
     *
     * @param timestamp <p>
     *            Timestamp, in UTC, for which the usage is being reported. Your
     *            application can meter usage for up to one hour in the past.
     *            Make sure the timestamp value is not before the start of the
     *            software usage.
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Timestamp, in UTC, for which the usage is being reported. Your
     * application can meter usage for up to one hour in the past. Make sure the
     * timestamp value is not before the start of the software usage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            Timestamp, in UTC, for which the usage is being reported. Your
     *            application can meter usage for up to one hour in the past.
     *            Make sure the timestamp value is not before the start of the
     *            software usage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MeterUsageRequest withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * It will be one of the fcp dimension name provided during the publishing
     * of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         It will be one of the fcp dimension name provided during the
     *         publishing of the product.
     *         </p>
     */
    public String getUsageDimension() {
        return usageDimension;
    }

    /**
     * <p>
     * It will be one of the fcp dimension name provided during the publishing
     * of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param usageDimension <p>
     *            It will be one of the fcp dimension name provided during the
     *            publishing of the product.
     *            </p>
     */
    public void setUsageDimension(String usageDimension) {
        this.usageDimension = usageDimension;
    }

    /**
     * <p>
     * It will be one of the fcp dimension name provided during the publishing
     * of the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param usageDimension <p>
     *            It will be one of the fcp dimension name provided during the
     *            publishing of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MeterUsageRequest withUsageDimension(String usageDimension) {
        this.usageDimension = usageDimension;
        return this;
    }

    /**
     * <p>
     * Consumption value for the hour. Defaults to <code>0</code> if not
     * specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return <p>
     *         Consumption value for the hour. Defaults to <code>0</code> if not
     *         specified.
     *         </p>
     */
    public Integer getUsageQuantity() {
        return usageQuantity;
    }

    /**
     * <p>
     * Consumption value for the hour. Defaults to <code>0</code> if not
     * specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param usageQuantity <p>
     *            Consumption value for the hour. Defaults to <code>0</code> if
     *            not specified.
     *            </p>
     */
    public void setUsageQuantity(Integer usageQuantity) {
        this.usageQuantity = usageQuantity;
    }

    /**
     * <p>
     * Consumption value for the hour. Defaults to <code>0</code> if not
     * specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param usageQuantity <p>
     *            Consumption value for the hour. Defaults to <code>0</code> if
     *            not specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MeterUsageRequest withUsageQuantity(Integer usageQuantity) {
        this.usageQuantity = usageQuantity;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does
     * not make the request. If you have the permissions, the request returns
     * DryRunOperation; otherwise, it returns UnauthorizedException. Defaults to
     * <code>false</code> if not specified.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the permissions required for the action,
     *         but does not make the request. If you have the permissions, the
     *         request returns DryRunOperation; otherwise, it returns
     *         UnauthorizedException. Defaults to <code>false</code> if not
     *         specified.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does
     * not make the request. If you have the permissions, the request returns
     * DryRunOperation; otherwise, it returns UnauthorizedException. Defaults to
     * <code>false</code> if not specified.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the permissions required for the action,
     *         but does not make the request. If you have the permissions, the
     *         request returns DryRunOperation; otherwise, it returns
     *         UnauthorizedException. Defaults to <code>false</code> if not
     *         specified.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does
     * not make the request. If you have the permissions, the request returns
     * DryRunOperation; otherwise, it returns UnauthorizedException. Defaults to
     * <code>false</code> if not specified.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the permissions required for the
     *            action, but does not make the request. If you have the
     *            permissions, the request returns DryRunOperation; otherwise,
     *            it returns UnauthorizedException. Defaults to
     *            <code>false</code> if not specified.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does
     * not make the request. If you have the permissions, the request returns
     * DryRunOperation; otherwise, it returns UnauthorizedException. Defaults to
     * <code>false</code> if not specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the permissions required for the
     *            action, but does not make the request. If you have the
     *            permissions, the request returns DryRunOperation; otherwise,
     *            it returns UnauthorizedException. Defaults to
     *            <code>false</code> if not specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MeterUsageRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getProductCode() != null)
            sb.append("ProductCode: " + getProductCode() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getUsageDimension() != null)
            sb.append("UsageDimension: " + getUsageDimension() + ",");
        if (getUsageQuantity() != null)
            sb.append("UsageQuantity: " + getUsageQuantity() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getUsageDimension() == null) ? 0 : getUsageDimension().hashCode());
        hashCode = prime * hashCode
                + ((getUsageQuantity() == null) ? 0 : getUsageQuantity().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeterUsageRequest == false)
            return false;
        MeterUsageRequest other = (MeterUsageRequest) obj;

        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null
                && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getUsageDimension() == null ^ this.getUsageDimension() == null)
            return false;
        if (other.getUsageDimension() != null
                && other.getUsageDimension().equals(this.getUsageDimension()) == false)
            return false;
        if (other.getUsageQuantity() == null ^ this.getUsageQuantity() == null)
            return false;
        if (other.getUsageQuantity() != null
                && other.getUsageQuantity().equals(this.getUsageQuantity()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
