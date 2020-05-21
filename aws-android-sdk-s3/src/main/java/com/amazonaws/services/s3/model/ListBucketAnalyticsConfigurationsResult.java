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

public class ListBucketAnalyticsConfigurationsResult implements Serializable {
    /**
     * <p>
     * Indicates whether the returned list of analytics configurations is
     * complete. A value of true indicates that the list is not complete and the
     * NextContinuationToken will be provided for a subsequent request.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * The marker that is used as a starting point for this analytics
     * configuration list response. This value is present if it was sent in the
     * request.
     * </p>
     */
    private String continuationToken;

    /**
     * <p>
     * <code>NextContinuationToken</code> is sent when <code>isTruncated</code>
     * is true, which indicates that there are more analytics configurations to
     * list. The next request must include this
     * <code>NextContinuationToken</code>. The token is obfuscated and is not a
     * usable value.
     * </p>
     */
    private String nextContinuationToken;

    /**
     * <p>
     * The list of analytics configurations for a bucket.
     * </p>
     */
    private java.util.List<AnalyticsConfiguration> analyticsConfigurationList;

    /**
     * <p>
     * Indicates whether the returned list of analytics configurations is
     * complete. A value of true indicates that the list is not complete and the
     * NextContinuationToken will be provided for a subsequent request.
     * </p>
     *
     * @return <p>
     *         Indicates whether the returned list of analytics configurations
     *         is complete. A value of true indicates that the list is not
     *         complete and the NextContinuationToken will be provided for a
     *         subsequent request.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * Indicates whether the returned list of analytics configurations is
     * complete. A value of true indicates that the list is not complete and the
     * NextContinuationToken will be provided for a subsequent request.
     * </p>
     *
     * @return <p>
     *         Indicates whether the returned list of analytics configurations
     *         is complete. A value of true indicates that the list is not
     *         complete and the NextContinuationToken will be provided for a
     *         subsequent request.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * Indicates whether the returned list of analytics configurations is
     * complete. A value of true indicates that the list is not complete and the
     * NextContinuationToken will be provided for a subsequent request.
     * </p>
     *
     * @param isTruncated <p>
     *            Indicates whether the returned list of analytics
     *            configurations is complete. A value of true indicates that the
     *            list is not complete and the NextContinuationToken will be
     *            provided for a subsequent request.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * Indicates whether the returned list of analytics configurations is
     * complete. A value of true indicates that the list is not complete and the
     * NextContinuationToken will be provided for a subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            Indicates whether the returned list of analytics
     *            configurations is complete. A value of true indicates that the
     *            list is not complete and the NextContinuationToken will be
     *            provided for a subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketAnalyticsConfigurationsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * The marker that is used as a starting point for this analytics
     * configuration list response. This value is present if it was sent in the
     * request.
     * </p>
     *
     * @return <p>
     *         The marker that is used as a starting point for this analytics
     *         configuration list response. This value is present if it was sent
     *         in the request.
     *         </p>
     */
    public String getContinuationToken() {
        return continuationToken;
    }

    /**
     * <p>
     * The marker that is used as a starting point for this analytics
     * configuration list response. This value is present if it was sent in the
     * request.
     * </p>
     *
     * @param continuationToken <p>
     *            The marker that is used as a starting point for this analytics
     *            configuration list response. This value is present if it was
     *            sent in the request.
     *            </p>
     */
    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * <p>
     * The marker that is used as a starting point for this analytics
     * configuration list response. This value is present if it was sent in the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param continuationToken <p>
     *            The marker that is used as a starting point for this analytics
     *            configuration list response. This value is present if it was
     *            sent in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketAnalyticsConfigurationsResult withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * <p>
     * <code>NextContinuationToken</code> is sent when <code>isTruncated</code>
     * is true, which indicates that there are more analytics configurations to
     * list. The next request must include this
     * <code>NextContinuationToken</code>. The token is obfuscated and is not a
     * usable value.
     * </p>
     *
     * @return <p>
     *         <code>NextContinuationToken</code> is sent when
     *         <code>isTruncated</code> is true, which indicates that there are
     *         more analytics configurations to list. The next request must
     *         include this <code>NextContinuationToken</code>. The token is
     *         obfuscated and is not a usable value.
     *         </p>
     */
    public String getNextContinuationToken() {
        return nextContinuationToken;
    }

    /**
     * <p>
     * <code>NextContinuationToken</code> is sent when <code>isTruncated</code>
     * is true, which indicates that there are more analytics configurations to
     * list. The next request must include this
     * <code>NextContinuationToken</code>. The token is obfuscated and is not a
     * usable value.
     * </p>
     *
     * @param nextContinuationToken <p>
     *            <code>NextContinuationToken</code> is sent when
     *            <code>isTruncated</code> is true, which indicates that there
     *            are more analytics configurations to list. The next request
     *            must include this <code>NextContinuationToken</code>. The
     *            token is obfuscated and is not a usable value.
     *            </p>
     */
    public void setNextContinuationToken(String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
    }

    /**
     * <p>
     * <code>NextContinuationToken</code> is sent when <code>isTruncated</code>
     * is true, which indicates that there are more analytics configurations to
     * list. The next request must include this
     * <code>NextContinuationToken</code>. The token is obfuscated and is not a
     * usable value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextContinuationToken <p>
     *            <code>NextContinuationToken</code> is sent when
     *            <code>isTruncated</code> is true, which indicates that there
     *            are more analytics configurations to list. The next request
     *            must include this <code>NextContinuationToken</code>. The
     *            token is obfuscated and is not a usable value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketAnalyticsConfigurationsResult withNextContinuationToken(
            String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
        return this;
    }

    /**
     * <p>
     * The list of analytics configurations for a bucket.
     * </p>
     *
     * @return <p>
     *         The list of analytics configurations for a bucket.
     *         </p>
     */
    public java.util.List<AnalyticsConfiguration> getAnalyticsConfigurationList() {
        return analyticsConfigurationList;
    }

    /**
     * <p>
     * The list of analytics configurations for a bucket.
     * </p>
     *
     * @param analyticsConfigurationList <p>
     *            The list of analytics configurations for a bucket.
     *            </p>
     */
    public void setAnalyticsConfigurationList(
            java.util.Collection<AnalyticsConfiguration> analyticsConfigurationList) {
        if (analyticsConfigurationList == null) {
            this.analyticsConfigurationList = null;
            return;
        }

        this.analyticsConfigurationList = new java.util.ArrayList<AnalyticsConfiguration>(
                analyticsConfigurationList);
    }

    /**
     * <p>
     * The list of analytics configurations for a bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyticsConfigurationList <p>
     *            The list of analytics configurations for a bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketAnalyticsConfigurationsResult withAnalyticsConfigurationList(
            AnalyticsConfiguration... analyticsConfigurationList) {
        if (getAnalyticsConfigurationList() == null) {
            this.analyticsConfigurationList = new java.util.ArrayList<AnalyticsConfiguration>(
                    analyticsConfigurationList.length);
        }
        for (AnalyticsConfiguration value : analyticsConfigurationList) {
            this.analyticsConfigurationList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of analytics configurations for a bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyticsConfigurationList <p>
     *            The list of analytics configurations for a bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketAnalyticsConfigurationsResult withAnalyticsConfigurationList(
            java.util.Collection<AnalyticsConfiguration> analyticsConfigurationList) {
        setAnalyticsConfigurationList(analyticsConfigurationList);
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
        if (getAnalyticsConfigurationList() != null)
            sb.append("AnalyticsConfigurationList: " + getAnalyticsConfigurationList());
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
                + ((getAnalyticsConfigurationList() == null) ? 0 : getAnalyticsConfigurationList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBucketAnalyticsConfigurationsResult == false)
            return false;
        ListBucketAnalyticsConfigurationsResult other = (ListBucketAnalyticsConfigurationsResult) obj;

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
        if (other.getAnalyticsConfigurationList() == null
                ^ this.getAnalyticsConfigurationList() == null)
            return false;
        if (other.getAnalyticsConfigurationList() != null
                && other.getAnalyticsConfigurationList().equals(
                        this.getAnalyticsConfigurationList()) == false)
            return false;
        return true;
    }
}
