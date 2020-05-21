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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class ListBucketMetricsConfigurationsResult implements Serializable {
    /**
     * <p>
     * Indicates whether the returned list of metrics configurations is
     * complete. A value of true indicates that the list is not complete and the
     * NextContinuationToken will be provided for a subsequent request.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * The marker that is used as a starting point for this metrics
     * configuration list response. This value is present if it was sent in the
     * request.
     * </p>
     */
    private String continuationToken;

    /**
     * <p>
     * The marker used to continue a metrics configuration listing that has been
     * truncated. Use the <code>NextContinuationToken</code> from a previously
     * truncated list response to continue the listing. The continuation token
     * is an opaque value that Amazon S3 understands.
     * </p>
     */
    private String nextContinuationToken;

    /**
     * <p>
     * The list of metrics configurations for a bucket.
     * </p>
     */
    private java.util.List<MetricsConfiguration> metricsConfigurationList;

    /**
     * <p>
     * Indicates whether the returned list of metrics configurations is
     * complete. A value of true indicates that the list is not complete and the
     * NextContinuationToken will be provided for a subsequent request.
     * </p>
     *
     * @return <p>
     *         Indicates whether the returned list of metrics configurations is
     *         complete. A value of true indicates that the list is not complete
     *         and the NextContinuationToken will be provided for a subsequent
     *         request.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * Indicates whether the returned list of metrics configurations is
     * complete. A value of true indicates that the list is not complete and the
     * NextContinuationToken will be provided for a subsequent request.
     * </p>
     *
     * @return <p>
     *         Indicates whether the returned list of metrics configurations is
     *         complete. A value of true indicates that the list is not complete
     *         and the NextContinuationToken will be provided for a subsequent
     *         request.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * Indicates whether the returned list of metrics configurations is
     * complete. A value of true indicates that the list is not complete and the
     * NextContinuationToken will be provided for a subsequent request.
     * </p>
     *
     * @param isTruncated <p>
     *            Indicates whether the returned list of metrics configurations
     *            is complete. A value of true indicates that the list is not
     *            complete and the NextContinuationToken will be provided for a
     *            subsequent request.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * Indicates whether the returned list of metrics configurations is
     * complete. A value of true indicates that the list is not complete and the
     * NextContinuationToken will be provided for a subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            Indicates whether the returned list of metrics configurations
     *            is complete. A value of true indicates that the list is not
     *            complete and the NextContinuationToken will be provided for a
     *            subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketMetricsConfigurationsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * The marker that is used as a starting point for this metrics
     * configuration list response. This value is present if it was sent in the
     * request.
     * </p>
     *
     * @return <p>
     *         The marker that is used as a starting point for this metrics
     *         configuration list response. This value is present if it was sent
     *         in the request.
     *         </p>
     */
    public String getContinuationToken() {
        return continuationToken;
    }

    /**
     * <p>
     * The marker that is used as a starting point for this metrics
     * configuration list response. This value is present if it was sent in the
     * request.
     * </p>
     *
     * @param continuationToken <p>
     *            The marker that is used as a starting point for this metrics
     *            configuration list response. This value is present if it was
     *            sent in the request.
     *            </p>
     */
    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * <p>
     * The marker that is used as a starting point for this metrics
     * configuration list response. This value is present if it was sent in the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param continuationToken <p>
     *            The marker that is used as a starting point for this metrics
     *            configuration list response. This value is present if it was
     *            sent in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketMetricsConfigurationsResult withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * <p>
     * The marker used to continue a metrics configuration listing that has been
     * truncated. Use the <code>NextContinuationToken</code> from a previously
     * truncated list response to continue the listing. The continuation token
     * is an opaque value that Amazon S3 understands.
     * </p>
     *
     * @return <p>
     *         The marker used to continue a metrics configuration listing that
     *         has been truncated. Use the <code>NextContinuationToken</code>
     *         from a previously truncated list response to continue the
     *         listing. The continuation token is an opaque value that Amazon S3
     *         understands.
     *         </p>
     */
    public String getNextContinuationToken() {
        return nextContinuationToken;
    }

    /**
     * <p>
     * The marker used to continue a metrics configuration listing that has been
     * truncated. Use the <code>NextContinuationToken</code> from a previously
     * truncated list response to continue the listing. The continuation token
     * is an opaque value that Amazon S3 understands.
     * </p>
     *
     * @param nextContinuationToken <p>
     *            The marker used to continue a metrics configuration listing
     *            that has been truncated. Use the
     *            <code>NextContinuationToken</code> from a previously truncated
     *            list response to continue the listing. The continuation token
     *            is an opaque value that Amazon S3 understands.
     *            </p>
     */
    public void setNextContinuationToken(String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
    }

    /**
     * <p>
     * The marker used to continue a metrics configuration listing that has been
     * truncated. Use the <code>NextContinuationToken</code> from a previously
     * truncated list response to continue the listing. The continuation token
     * is an opaque value that Amazon S3 understands.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextContinuationToken <p>
     *            The marker used to continue a metrics configuration listing
     *            that has been truncated. Use the
     *            <code>NextContinuationToken</code> from a previously truncated
     *            list response to continue the listing. The continuation token
     *            is an opaque value that Amazon S3 understands.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketMetricsConfigurationsResult withNextContinuationToken(
            String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
        return this;
    }

    /**
     * <p>
     * The list of metrics configurations for a bucket.
     * </p>
     *
     * @return <p>
     *         The list of metrics configurations for a bucket.
     *         </p>
     */
    public java.util.List<MetricsConfiguration> getMetricsConfigurationList() {
        return metricsConfigurationList;
    }

    /**
     * <p>
     * The list of metrics configurations for a bucket.
     * </p>
     *
     * @param metricsConfigurationList <p>
     *            The list of metrics configurations for a bucket.
     *            </p>
     */
    public void setMetricsConfigurationList(
            java.util.Collection<MetricsConfiguration> metricsConfigurationList) {
        if (metricsConfigurationList == null) {
            this.metricsConfigurationList = null;
            return;
        }

        this.metricsConfigurationList = new java.util.ArrayList<MetricsConfiguration>(
                metricsConfigurationList);
    }

    /**
     * <p>
     * The list of metrics configurations for a bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricsConfigurationList <p>
     *            The list of metrics configurations for a bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketMetricsConfigurationsResult withMetricsConfigurationList(
            MetricsConfiguration... metricsConfigurationList) {
        if (getMetricsConfigurationList() == null) {
            this.metricsConfigurationList = new java.util.ArrayList<MetricsConfiguration>(
                    metricsConfigurationList.length);
        }
        for (MetricsConfiguration value : metricsConfigurationList) {
            this.metricsConfigurationList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of metrics configurations for a bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricsConfigurationList <p>
     *            The list of metrics configurations for a bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketMetricsConfigurationsResult withMetricsConfigurationList(
            java.util.Collection<MetricsConfiguration> metricsConfigurationList) {
        setMetricsConfigurationList(metricsConfigurationList);
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
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getContinuationToken() != null)
            sb.append("ContinuationToken: " + getContinuationToken() + ",");
        if (getNextContinuationToken() != null)
            sb.append("NextContinuationToken: " + getNextContinuationToken() + ",");
        if (getMetricsConfigurationList() != null)
            sb.append("MetricsConfigurationList: " + getMetricsConfigurationList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode
                + ((getContinuationToken() == null) ? 0 : getContinuationToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getNextContinuationToken() == null) ? 0 : getNextContinuationToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getMetricsConfigurationList() == null) ? 0 : getMetricsConfigurationList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBucketMetricsConfigurationsResult == false)
            return false;
        ListBucketMetricsConfigurationsResult other = (ListBucketMetricsConfigurationsResult) obj;

        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getContinuationToken() == null ^ this.getContinuationToken() == null)
            return false;
        if (other.getContinuationToken() != null
                && other.getContinuationToken().equals(this.getContinuationToken()) == false)
            return false;
        if (other.getNextContinuationToken() == null ^ this.getNextContinuationToken() == null)
            return false;
        if (other.getNextContinuationToken() != null
                && other.getNextContinuationToken().equals(this.getNextContinuationToken()) == false)
            return false;
        if (other.getMetricsConfigurationList() == null
                ^ this.getMetricsConfigurationList() == null)
            return false;
        if (other.getMetricsConfigurationList() != null
                && other.getMetricsConfigurationList().equals(this.getMetricsConfigurationList()) == false)
            return false;
        return true;
    }
}
