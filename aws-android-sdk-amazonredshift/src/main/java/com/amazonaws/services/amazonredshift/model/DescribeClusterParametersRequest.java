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
 * Returns a detailed list of parameters contained within the specified Amazon
 * Redshift parameter group. For each parameter the response includes
 * information such as parameter name, description, data type, value, whether
 * the parameter value is modifiable, and so on.
 * </p>
 * <p>
 * You can specify <i>source</i> filter to retrieve parameters of only specific
 * type. For example, to retrieve parameters that were modified by a user action
 * such as from <a>ModifyClusterParameterGroup</a>, you can specify
 * <i>source</i> equal to <i>user</i>.
 * </p>
 * <p>
 * For more information about parameters and parameter groups, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
 * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
 * Management Guide</i>.
 * </p>
 */
public class DescribeClusterParametersRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of a cluster parameter group for which to return details.
     * </p>
     */
    private String parameterGroupName;

    /**
     * <p>
     * The parameter types to return. Specify <code>user</code> to show
     * parameters that are different form the default. Similarly, specify
     * <code>engine-default</code> to show parameters that are the same as the
     * default parameter group.
     * </p>
     * <p>
     * Default: All parameter types returned.
     * </p>
     * <p>
     * Valid Values: <code>user</code> | <code>engine-default</code>
     * </p>
     */
    private String source;

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeClusterParameters</a> request exceed the value specified in
     * <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code>
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the <code>Marker</code>
     * parameter and retrying the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The name of a cluster parameter group for which to return details.
     * </p>
     *
     * @return <p>
     *         The name of a cluster parameter group for which to return
     *         details.
     *         </p>
     */
    public String getParameterGroupName() {
        return parameterGroupName;
    }

    /**
     * <p>
     * The name of a cluster parameter group for which to return details.
     * </p>
     *
     * @param parameterGroupName <p>
     *            The name of a cluster parameter group for which to return
     *            details.
     *            </p>
     */
    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of a cluster parameter group for which to return details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterGroupName <p>
     *            The name of a cluster parameter group for which to return
     *            details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterParametersRequest withParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * <p>
     * The parameter types to return. Specify <code>user</code> to show
     * parameters that are different form the default. Similarly, specify
     * <code>engine-default</code> to show parameters that are the same as the
     * default parameter group.
     * </p>
     * <p>
     * Default: All parameter types returned.
     * </p>
     * <p>
     * Valid Values: <code>user</code> | <code>engine-default</code>
     * </p>
     *
     * @return <p>
     *         The parameter types to return. Specify <code>user</code> to show
     *         parameters that are different form the default. Similarly,
     *         specify <code>engine-default</code> to show parameters that are
     *         the same as the default parameter group.
     *         </p>
     *         <p>
     *         Default: All parameter types returned.
     *         </p>
     *         <p>
     *         Valid Values: <code>user</code> | <code>engine-default</code>
     *         </p>
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * The parameter types to return. Specify <code>user</code> to show
     * parameters that are different form the default. Similarly, specify
     * <code>engine-default</code> to show parameters that are the same as the
     * default parameter group.
     * </p>
     * <p>
     * Default: All parameter types returned.
     * </p>
     * <p>
     * Valid Values: <code>user</code> | <code>engine-default</code>
     * </p>
     *
     * @param source <p>
     *            The parameter types to return. Specify <code>user</code> to
     *            show parameters that are different form the default.
     *            Similarly, specify <code>engine-default</code> to show
     *            parameters that are the same as the default parameter group.
     *            </p>
     *            <p>
     *            Default: All parameter types returned.
     *            </p>
     *            <p>
     *            Valid Values: <code>user</code> | <code>engine-default</code>
     *            </p>
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The parameter types to return. Specify <code>user</code> to show
     * parameters that are different form the default. Similarly, specify
     * <code>engine-default</code> to show parameters that are the same as the
     * default parameter group.
     * </p>
     * <p>
     * Default: All parameter types returned.
     * </p>
     * <p>
     * Valid Values: <code>user</code> | <code>engine-default</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            The parameter types to return. Specify <code>user</code> to
     *            show parameters that are different form the default.
     *            Similarly, specify <code>engine-default</code> to show
     *            parameters that are the same as the default parameter group.
     *            </p>
     *            <p>
     *            Default: All parameter types returned.
     *            </p>
     *            <p>
     *            Valid Values: <code>user</code> | <code>engine-default</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterParametersRequest withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of response records to return in each call. If
     *         the number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the
     *         next set of records by retrying the command with the returned
     *         marker value.
     *         </p>
     *         <p>
     *         Default: <code>100</code>
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
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of response records to return in each call.
     *            If the number of remaining response records exceeds the
     *            specified <code>MaxRecords</code> value, a value is returned
     *            in a <code>marker</code> field of the response. You can
     *            retrieve the next set of records by retrying the command with
     *            the returned marker value.
     *            </p>
     *            <p>
     *            Default: <code>100</code>
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
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
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
     *            specified <code>MaxRecords</code> value, a value is returned
     *            in a <code>marker</code> field of the response. You can
     *            retrieve the next set of records by retrying the command with
     *            the returned marker value.
     *            </p>
     *            <p>
     *            Default: <code>100</code>
     *            </p>
     *            <p>
     *            Constraints: minimum 20, maximum 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterParametersRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeClusterParameters</a> request exceed the value specified in
     * <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code>
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the <code>Marker</code>
     * parameter and retrying the request.
     * </p>
     *
     * @return <p>
     *         An optional parameter that specifies the starting point to return
     *         a set of response records. When the results of a
     *         <a>DescribeClusterParameters</a> request exceed the value
     *         specified in <code>MaxRecords</code>, AWS returns a value in the
     *         <code>Marker</code> field of the response. You can retrieve the
     *         next set of response records by providing the returned marker
     *         value in the <code>Marker</code> parameter and retrying the
     *         request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeClusterParameters</a> request exceed the value specified in
     * <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code>
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the <code>Marker</code>
     * parameter and retrying the request.
     * </p>
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point to
     *            return a set of response records. When the results of a
     *            <a>DescribeClusterParameters</a> request exceed the value
     *            specified in <code>MaxRecords</code>, AWS returns a value in
     *            the <code>Marker</code> field of the response. You can
     *            retrieve the next set of response records by providing the
     *            returned marker value in the <code>Marker</code> parameter and
     *            retrying the request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeClusterParameters</a> request exceed the value specified in
     * <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code>
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the <code>Marker</code>
     * parameter and retrying the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point to
     *            return a set of response records. When the results of a
     *            <a>DescribeClusterParameters</a> request exceed the value
     *            specified in <code>MaxRecords</code>, AWS returns a value in
     *            the <code>Marker</code> field of the response. You can
     *            retrieve the next set of response records by providing the
     *            returned marker value in the <code>Marker</code> parameter and
     *            retrying the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterParametersRequest withMarker(String marker) {
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
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: " + getParameterGroupName() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
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
                + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
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

        if (obj instanceof DescribeClusterParametersRequest == false)
            return false;
        DescribeClusterParametersRequest other = (DescribeClusterParametersRequest) obj;

        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null
                && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
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
