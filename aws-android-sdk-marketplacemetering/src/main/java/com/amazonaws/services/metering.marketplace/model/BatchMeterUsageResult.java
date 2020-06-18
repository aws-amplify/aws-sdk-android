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

/**
 * <p>
 * Contains the UsageRecords processed by BatchMeterUsage and any records that
 * have failed due to transient error.
 * </p>
 */
public class BatchMeterUsageResult implements Serializable {
    /**
     * <p>
     * Contains all UsageRecords processed by BatchMeterUsage. These records
     * were either honored by AWS Marketplace Metering Service or were invalid.
     * </p>
     */
    private java.util.List<UsageRecordResult> results;

    /**
     * <p>
     * Contains all UsageRecords that were not processed by BatchMeterUsage.
     * This is a list of UsageRecords. You can retry the failed request by
     * making another BatchMeterUsage call with this list as input in the
     * BatchMeterUsageRequest.
     * </p>
     */
    private java.util.List<UsageRecord> unprocessedRecords;

    /**
     * <p>
     * Contains all UsageRecords processed by BatchMeterUsage. These records
     * were either honored by AWS Marketplace Metering Service or were invalid.
     * </p>
     *
     * @return <p>
     *         Contains all UsageRecords processed by BatchMeterUsage. These
     *         records were either honored by AWS Marketplace Metering Service
     *         or were invalid.
     *         </p>
     */
    public java.util.List<UsageRecordResult> getResults() {
        return results;
    }

    /**
     * <p>
     * Contains all UsageRecords processed by BatchMeterUsage. These records
     * were either honored by AWS Marketplace Metering Service or were invalid.
     * </p>
     *
     * @param results <p>
     *            Contains all UsageRecords processed by BatchMeterUsage. These
     *            records were either honored by AWS Marketplace Metering
     *            Service or were invalid.
     *            </p>
     */
    public void setResults(java.util.Collection<UsageRecordResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<UsageRecordResult>(results);
    }

    /**
     * <p>
     * Contains all UsageRecords processed by BatchMeterUsage. These records
     * were either honored by AWS Marketplace Metering Service or were invalid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            Contains all UsageRecords processed by BatchMeterUsage. These
     *            records were either honored by AWS Marketplace Metering
     *            Service or were invalid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchMeterUsageResult withResults(UsageRecordResult... results) {
        if (getResults() == null) {
            this.results = new java.util.ArrayList<UsageRecordResult>(results.length);
        }
        for (UsageRecordResult value : results) {
            this.results.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains all UsageRecords processed by BatchMeterUsage. These records
     * were either honored by AWS Marketplace Metering Service or were invalid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            Contains all UsageRecords processed by BatchMeterUsage. These
     *            records were either honored by AWS Marketplace Metering
     *            Service or were invalid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchMeterUsageResult withResults(java.util.Collection<UsageRecordResult> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * Contains all UsageRecords that were not processed by BatchMeterUsage.
     * This is a list of UsageRecords. You can retry the failed request by
     * making another BatchMeterUsage call with this list as input in the
     * BatchMeterUsageRequest.
     * </p>
     *
     * @return <p>
     *         Contains all UsageRecords that were not processed by
     *         BatchMeterUsage. This is a list of UsageRecords. You can retry
     *         the failed request by making another BatchMeterUsage call with
     *         this list as input in the BatchMeterUsageRequest.
     *         </p>
     */
    public java.util.List<UsageRecord> getUnprocessedRecords() {
        return unprocessedRecords;
    }

    /**
     * <p>
     * Contains all UsageRecords that were not processed by BatchMeterUsage.
     * This is a list of UsageRecords. You can retry the failed request by
     * making another BatchMeterUsage call with this list as input in the
     * BatchMeterUsageRequest.
     * </p>
     *
     * @param unprocessedRecords <p>
     *            Contains all UsageRecords that were not processed by
     *            BatchMeterUsage. This is a list of UsageRecords. You can retry
     *            the failed request by making another BatchMeterUsage call with
     *            this list as input in the BatchMeterUsageRequest.
     *            </p>
     */
    public void setUnprocessedRecords(java.util.Collection<UsageRecord> unprocessedRecords) {
        if (unprocessedRecords == null) {
            this.unprocessedRecords = null;
            return;
        }

        this.unprocessedRecords = new java.util.ArrayList<UsageRecord>(unprocessedRecords);
    }

    /**
     * <p>
     * Contains all UsageRecords that were not processed by BatchMeterUsage.
     * This is a list of UsageRecords. You can retry the failed request by
     * making another BatchMeterUsage call with this list as input in the
     * BatchMeterUsageRequest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedRecords <p>
     *            Contains all UsageRecords that were not processed by
     *            BatchMeterUsage. This is a list of UsageRecords. You can retry
     *            the failed request by making another BatchMeterUsage call with
     *            this list as input in the BatchMeterUsageRequest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchMeterUsageResult withUnprocessedRecords(UsageRecord... unprocessedRecords) {
        if (getUnprocessedRecords() == null) {
            this.unprocessedRecords = new java.util.ArrayList<UsageRecord>(
                    unprocessedRecords.length);
        }
        for (UsageRecord value : unprocessedRecords) {
            this.unprocessedRecords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains all UsageRecords that were not processed by BatchMeterUsage.
     * This is a list of UsageRecords. You can retry the failed request by
     * making another BatchMeterUsage call with this list as input in the
     * BatchMeterUsageRequest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedRecords <p>
     *            Contains all UsageRecords that were not processed by
     *            BatchMeterUsage. This is a list of UsageRecords. You can retry
     *            the failed request by making another BatchMeterUsage call with
     *            this list as input in the BatchMeterUsageRequest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchMeterUsageResult withUnprocessedRecords(
            java.util.Collection<UsageRecord> unprocessedRecords) {
        setUnprocessedRecords(unprocessedRecords);
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
        if (getResults() != null)
            sb.append("Results: " + getResults() + ",");
        if (getUnprocessedRecords() != null)
            sb.append("UnprocessedRecords: " + getUnprocessedRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode
                + ((getUnprocessedRecords() == null) ? 0 : getUnprocessedRecords().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchMeterUsageResult == false)
            return false;
        BatchMeterUsageResult other = (BatchMeterUsageResult) obj;

        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getUnprocessedRecords() == null ^ this.getUnprocessedRecords() == null)
            return false;
        if (other.getUnprocessedRecords() != null
                && other.getUnprocessedRecords().equals(this.getUnprocessedRecords()) == false)
            return false;
        return true;
    }
}
