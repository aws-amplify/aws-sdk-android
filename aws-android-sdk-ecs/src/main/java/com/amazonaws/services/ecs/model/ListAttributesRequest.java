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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the attributes for Amazon ECS resources within a specified target type
 * and cluster. When you specify a target type and cluster,
 * <code>ListAttributes</code> returns a list of attribute objects, one for each
 * attribute on each resource. You can filter the list of results to a single
 * attribute name to only return results that have that name. You can also
 * filter the results by attribute name and value, for example, to see which
 * container instances in a cluster are running a Linux AMI (
 * <code>ecs.os-type=linux</code>).
 * </p>
 */
public class ListAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to list
     * attributes. If you do not specify a cluster, the default cluster is
     * assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The type of the target with which to list attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>container-instance
     */
    private String targetType;

    /**
     * <p>
     * The name of the attribute with which to filter the results.
     * </p>
     */
    private String attributeName;

    /**
     * <p>
     * The value of the attribute with which to filter results. You must also
     * specify an attribute name to use this parameter.
     * </p>
     */
    private String attributeValue;

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListAttributes</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of cluster results returned by
     * <code>ListAttributes</code> in paginated output. When this parameter is
     * used, <code>ListAttributes</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>ListAttributes</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListAttributes</code> returns up
     * to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to list
     * attributes. If you do not specify a cluster, the default cluster is
     * assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         to list attributes. If you do not specify a cluster, the default
     *         cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to list
     * attributes. If you do not specify a cluster, the default cluster is
     * assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster to list attributes. If you do not specify a cluster,
     *            the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to list
     * attributes. If you do not specify a cluster, the default cluster is
     * assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster to list attributes. If you do not specify a cluster,
     *            the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttributesRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The type of the target with which to list attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>container-instance
     *
     * @return <p>
     *         The type of the target with which to list attributes.
     *         </p>
     * @see TargetType
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * <p>
     * The type of the target with which to list attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>container-instance
     *
     * @param targetType <p>
     *            The type of the target with which to list attributes.
     *            </p>
     * @see TargetType
     */
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The type of the target with which to list attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>container-instance
     *
     * @param targetType <p>
     *            The type of the target with which to list attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetType
     */
    public ListAttributesRequest withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * <p>
     * The type of the target with which to list attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>container-instance
     *
     * @param targetType <p>
     *            The type of the target with which to list attributes.
     *            </p>
     * @see TargetType
     */
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType.toString();
    }

    /**
     * <p>
     * The type of the target with which to list attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>container-instance
     *
     * @param targetType <p>
     *            The type of the target with which to list attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetType
     */
    public ListAttributesRequest withTargetType(TargetType targetType) {
        this.targetType = targetType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the attribute with which to filter the results.
     * </p>
     *
     * @return <p>
     *         The name of the attribute with which to filter the results.
     *         </p>
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * The name of the attribute with which to filter the results.
     * </p>
     *
     * @param attributeName <p>
     *            The name of the attribute with which to filter the results.
     *            </p>
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the attribute with which to filter the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeName <p>
     *            The name of the attribute with which to filter the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttributesRequest withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * <p>
     * The value of the attribute with which to filter results. You must also
     * specify an attribute name to use this parameter.
     * </p>
     *
     * @return <p>
     *         The value of the attribute with which to filter results. You must
     *         also specify an attribute name to use this parameter.
     *         </p>
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * <p>
     * The value of the attribute with which to filter results. You must also
     * specify an attribute name to use this parameter.
     * </p>
     *
     * @param attributeValue <p>
     *            The value of the attribute with which to filter results. You
     *            must also specify an attribute name to use this parameter.
     *            </p>
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The value of the attribute with which to filter results. You must also
     * specify an attribute name to use this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeValue <p>
     *            The value of the attribute with which to filter results. You
     *            must also specify an attribute name to use this parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttributesRequest withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListAttributes</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     *
     * @return <p>
     *         The <code>nextToken</code> value returned from a
     *         <code>ListAttributes</code> request indicating that more results
     *         are available to fulfill the request and further calls will be
     *         needed. If <code>maxResults</code> was provided, it is possible
     *         the number of results to be fewer than <code>maxResults</code>.
     *         </p>
     *         <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only
     *         used to retrieve the next items in a list and not for other
     *         programmatic purposes.
     *         </p>
     *         </note>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListAttributes</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a
     *            <code>ListAttributes</code> request indicating that more
     *            results are available to fulfill the request and further calls
     *            will be needed. If <code>maxResults</code> was provided, it is
     *            possible the number of results to be fewer than
     *            <code>maxResults</code>.
     *            </p>
     *            <note>
     *            <p>
     *            This token should be treated as an opaque identifier that is
     *            only used to retrieve the next items in a list and not for
     *            other programmatic purposes.
     *            </p>
     *            </note>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListAttributes</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a
     *            <code>ListAttributes</code> request indicating that more
     *            results are available to fulfill the request and further calls
     *            will be needed. If <code>maxResults</code> was provided, it is
     *            possible the number of results to be fewer than
     *            <code>maxResults</code>.
     *            </p>
     *            <note>
     *            <p>
     *            This token should be treated as an opaque identifier that is
     *            only used to retrieve the next items in a list and not for
     *            other programmatic purposes.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttributesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by
     * <code>ListAttributes</code> in paginated output. When this parameter is
     * used, <code>ListAttributes</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>ListAttributes</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListAttributes</code> returns up
     * to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     *
     * @return <p>
     *         The maximum number of cluster results returned by
     *         <code>ListAttributes</code> in paginated output. When this
     *         parameter is used, <code>ListAttributes</code> only returns
     *         <code>maxResults</code> results in a single page along with a
     *         <code>nextToken</code> response element. The remaining results of
     *         the initial request can be seen by sending another
     *         <code>ListAttributes</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and
     *         100. If this parameter is not used, then
     *         <code>ListAttributes</code> returns up to 100 results and a
     *         <code>nextToken</code> value if applicable.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by
     * <code>ListAttributes</code> in paginated output. When this parameter is
     * used, <code>ListAttributes</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>ListAttributes</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListAttributes</code> returns up
     * to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of cluster results returned by
     *            <code>ListAttributes</code> in paginated output. When this
     *            parameter is used, <code>ListAttributes</code> only returns
     *            <code>maxResults</code> results in a single page along with a
     *            <code>nextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>ListAttributes</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            100. If this parameter is not used, then
     *            <code>ListAttributes</code> returns up to 100 results and a
     *            <code>nextToken</code> value if applicable.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by
     * <code>ListAttributes</code> in paginated output. When this parameter is
     * used, <code>ListAttributes</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>ListAttributes</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListAttributes</code> returns up
     * to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of cluster results returned by
     *            <code>ListAttributes</code> in paginated output. When this
     *            parameter is used, <code>ListAttributes</code> only returns
     *            <code>maxResults</code> results in a single page along with a
     *            <code>nextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>ListAttributes</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            100. If this parameter is not used, then
     *            <code>ListAttributes</code> returns up to 100 results and a
     *            <code>nextToken</code> value if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttributesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getCluster() != null)
            sb.append("cluster: " + getCluster() + ",");
        if (getTargetType() != null)
            sb.append("targetType: " + getTargetType() + ",");
        if (getAttributeName() != null)
            sb.append("attributeName: " + getAttributeName() + ",");
        if (getAttributeValue() != null)
            sb.append("attributeValue: " + getAttributeValue() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAttributesRequest == false)
            return false;
        ListAttributesRequest other = (ListAttributesRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null
                && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null
                && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
