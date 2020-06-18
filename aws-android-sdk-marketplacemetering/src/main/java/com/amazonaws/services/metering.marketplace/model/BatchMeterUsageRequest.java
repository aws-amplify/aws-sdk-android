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
 * BatchMeterUsage is called from a SaaS application listed on the AWS
 * Marketplace to post metering records for a set of customers.
 * </p>
 * <p>
 * For identical requests, the API is idempotent; requests can be retried with
 * the same records or a subset of the input records.
 * </p>
 * <p>
 * Every request to BatchMeterUsage is for one product. If you need to meter
 * usage for multiple products, you must make multiple calls to BatchMeterUsage.
 * </p>
 * <p>
 * BatchMeterUsage can process up to 25 UsageRecords at a time.
 * </p>
 */
public class BatchMeterUsageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The set of UsageRecords to submit. BatchMeterUsage accepts up to 25
     * UsageRecords at a time.
     * </p>
     */
    private java.util.List<UsageRecord> usageRecords;

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
     * The set of UsageRecords to submit. BatchMeterUsage accepts up to 25
     * UsageRecords at a time.
     * </p>
     *
     * @return <p>
     *         The set of UsageRecords to submit. BatchMeterUsage accepts up to
     *         25 UsageRecords at a time.
     *         </p>
     */
    public java.util.List<UsageRecord> getUsageRecords() {
        return usageRecords;
    }

    /**
     * <p>
     * The set of UsageRecords to submit. BatchMeterUsage accepts up to 25
     * UsageRecords at a time.
     * </p>
     *
     * @param usageRecords <p>
     *            The set of UsageRecords to submit. BatchMeterUsage accepts up
     *            to 25 UsageRecords at a time.
     *            </p>
     */
    public void setUsageRecords(java.util.Collection<UsageRecord> usageRecords) {
        if (usageRecords == null) {
            this.usageRecords = null;
            return;
        }

        this.usageRecords = new java.util.ArrayList<UsageRecord>(usageRecords);
    }

    /**
     * <p>
     * The set of UsageRecords to submit. BatchMeterUsage accepts up to 25
     * UsageRecords at a time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usageRecords <p>
     *            The set of UsageRecords to submit. BatchMeterUsage accepts up
     *            to 25 UsageRecords at a time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchMeterUsageRequest withUsageRecords(UsageRecord... usageRecords) {
        if (getUsageRecords() == null) {
            this.usageRecords = new java.util.ArrayList<UsageRecord>(usageRecords.length);
        }
        for (UsageRecord value : usageRecords) {
            this.usageRecords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The set of UsageRecords to submit. BatchMeterUsage accepts up to 25
     * UsageRecords at a time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usageRecords <p>
     *            The set of UsageRecords to submit. BatchMeterUsage accepts up
     *            to 25 UsageRecords at a time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchMeterUsageRequest withUsageRecords(java.util.Collection<UsageRecord> usageRecords) {
        setUsageRecords(usageRecords);
        return this;
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
    public BatchMeterUsageRequest withProductCode(String productCode) {
        this.productCode = productCode;
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
        if (getUsageRecords() != null)
            sb.append("UsageRecords: " + getUsageRecords() + ",");
        if (getProductCode() != null)
            sb.append("ProductCode: " + getProductCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUsageRecords() == null) ? 0 : getUsageRecords().hashCode());
        hashCode = prime * hashCode
                + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchMeterUsageRequest == false)
            return false;
        BatchMeterUsageRequest other = (BatchMeterUsageRequest) obj;

        if (other.getUsageRecords() == null ^ this.getUsageRecords() == null)
            return false;
        if (other.getUsageRecords() != null
                && other.getUsageRecords().equals(this.getUsageRecords()) == false)
            return false;
        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null
                && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        return true;
    }
}
