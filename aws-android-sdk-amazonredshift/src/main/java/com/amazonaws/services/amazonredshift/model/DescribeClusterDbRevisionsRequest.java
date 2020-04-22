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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns an array of <code>ClusterDbRevision</code> objects.
 * </p>
 */
public class DescribeClusterDbRevisionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A unique identifier for a cluster whose <code>ClusterDbRevisions</code>
     * you are requesting. This parameter is case sensitive. All clusters
     * defined for an account are returned by default.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified MaxRecords
     * value, a value is returned in the <code>marker</code> field of the
     * response. You can retrieve the next set of response records by providing
     * the returned <code>marker</code> value in the <code>marker</code>
     * parameter and retrying the request.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * An optional parameter that specifies the starting point for returning a
     * set of response records. When the results of a
     * <code>DescribeClusterDbRevisions</code> request exceed the value
     * specified in <code>MaxRecords</code>, Amazon Redshift returns a value in
     * the <code>marker</code> field of the response. You can retrieve the next
     * set of response records by providing the returned <code>marker</code>
     * value in the <code>marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <code>ClusterIdentifier</code>
     * parameter, or the <code>marker</code> parameter, but not both.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A unique identifier for a cluster whose <code>ClusterDbRevisions</code>
     * you are requesting. This parameter is case sensitive. All clusters
     * defined for an account are returned by default.
     * </p>
     *
     * @return <p>
     *         A unique identifier for a cluster whose
     *         <code>ClusterDbRevisions</code> you are requesting. This
     *         parameter is case sensitive. All clusters defined for an account
     *         are returned by default.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for a cluster whose <code>ClusterDbRevisions</code>
     * you are requesting. This parameter is case sensitive. All clusters
     * defined for an account are returned by default.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            A unique identifier for a cluster whose
     *            <code>ClusterDbRevisions</code> you are requesting. This
     *            parameter is case sensitive. All clusters defined for an
     *            account are returned by default.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for a cluster whose <code>ClusterDbRevisions</code>
     * you are requesting. This parameter is case sensitive. All clusters
     * defined for an account are returned by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            A unique identifier for a cluster whose
     *            <code>ClusterDbRevisions</code> you are requesting. This
     *            parameter is case sensitive. All clusters defined for an
     *            account are returned by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterDbRevisionsRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified MaxRecords
     * value, a value is returned in the <code>marker</code> field of the
     * response. You can retrieve the next set of response records by providing
     * the returned <code>marker</code> value in the <code>marker</code>
     * parameter and retrying the request.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of response records to return in each call. If
     *         the number of remaining response records exceeds the specified
     *         MaxRecords value, a value is returned in the <code>marker</code>
     *         field of the response. You can retrieve the next set of response
     *         records by providing the returned <code>marker</code> value in
     *         the <code>marker</code> parameter and retrying the request.
     *         </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: minimum 20, maximum 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified MaxRecords
     * value, a value is returned in the <code>marker</code> field of the
     * response. You can retrieve the next set of response records by providing
     * the returned <code>marker</code> value in the <code>marker</code>
     * parameter and retrying the request.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of response records to return in each call.
     *            If the number of remaining response records exceeds the
     *            specified MaxRecords value, a value is returned in the
     *            <code>marker</code> field of the response. You can retrieve
     *            the next set of response records by providing the returned
     *            <code>marker</code> value in the <code>marker</code> parameter
     *            and retrying the request.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: minimum 20, maximum 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified MaxRecords
     * value, a value is returned in the <code>marker</code> field of the
     * response. You can retrieve the next set of response records by providing
     * the returned <code>marker</code> value in the <code>marker</code>
     * parameter and retrying the request.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of response records to return in each call.
     *            If the number of remaining response records exceeds the
     *            specified MaxRecords value, a value is returned in the
     *            <code>marker</code> field of the response. You can retrieve
     *            the next set of response records by providing the returned
     *            <code>marker</code> value in the <code>marker</code> parameter
     *            and retrying the request.
     *            </p>
     *            <p>
     *            Default: 100
     *            </p>
     *            <p>
     *            Constraints: minimum 20, maximum 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterDbRevisionsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point for returning a
     * set of response records. When the results of a
     * <code>DescribeClusterDbRevisions</code> request exceed the value
     * specified in <code>MaxRecords</code>, Amazon Redshift returns a value in
     * the <code>marker</code> field of the response. You can retrieve the next
     * set of response records by providing the returned <code>marker</code>
     * value in the <code>marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <code>ClusterIdentifier</code>
     * parameter, or the <code>marker</code> parameter, but not both.
     * </p>
     *
     * @return <p>
     *         An optional parameter that specifies the starting point for
     *         returning a set of response records. When the results of a
     *         <code>DescribeClusterDbRevisions</code> request exceed the value
     *         specified in <code>MaxRecords</code>, Amazon Redshift returns a
     *         value in the <code>marker</code> field of the response. You can
     *         retrieve the next set of response records by providing the
     *         returned <code>marker</code> value in the <code>marker</code>
     *         parameter and retrying the request.
     *         </p>
     *         <p>
     *         Constraints: You can specify either the
     *         <code>ClusterIdentifier</code> parameter, or the
     *         <code>marker</code> parameter, but not both.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point for returning a
     * set of response records. When the results of a
     * <code>DescribeClusterDbRevisions</code> request exceed the value
     * specified in <code>MaxRecords</code>, Amazon Redshift returns a value in
     * the <code>marker</code> field of the response. You can retrieve the next
     * set of response records by providing the returned <code>marker</code>
     * value in the <code>marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <code>ClusterIdentifier</code>
     * parameter, or the <code>marker</code> parameter, but not both.
     * </p>
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point for
     *            returning a set of response records. When the results of a
     *            <code>DescribeClusterDbRevisions</code> request exceed the
     *            value specified in <code>MaxRecords</code>, Amazon Redshift
     *            returns a value in the <code>marker</code> field of the
     *            response. You can retrieve the next set of response records by
     *            providing the returned <code>marker</code> value in the
     *            <code>marker</code> parameter and retrying the request.
     *            </p>
     *            <p>
     *            Constraints: You can specify either the
     *            <code>ClusterIdentifier</code> parameter, or the
     *            <code>marker</code> parameter, but not both.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point for returning a
     * set of response records. When the results of a
     * <code>DescribeClusterDbRevisions</code> request exceed the value
     * specified in <code>MaxRecords</code>, Amazon Redshift returns a value in
     * the <code>marker</code> field of the response. You can retrieve the next
     * set of response records by providing the returned <code>marker</code>
     * value in the <code>marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <code>ClusterIdentifier</code>
     * parameter, or the <code>marker</code> parameter, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point for
     *            returning a set of response records. When the results of a
     *            <code>DescribeClusterDbRevisions</code> request exceed the
     *            value specified in <code>MaxRecords</code>, Amazon Redshift
     *            returns a value in the <code>marker</code> field of the
     *            response. You can retrieve the next set of response records by
     *            providing the returned <code>marker</code> value in the
     *            <code>marker</code> parameter and retrying the request.
     *            </p>
     *            <p>
     *            Constraints: You can specify either the
     *            <code>ClusterIdentifier</code> parameter, or the
     *            <code>marker</code> parameter, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterDbRevisionsRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterDbRevisionsRequest == false)
            return false;
        DescribeClusterDbRevisionsRequest other = (DescribeClusterDbRevisionsRequest) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
