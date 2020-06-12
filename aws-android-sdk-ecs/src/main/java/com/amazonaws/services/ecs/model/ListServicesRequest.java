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
 * Lists the services that are running in a specified cluster.
 * </p>
 */
public class ListServicesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the services to list. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListServices</code> request indicating that more results are
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
     * The maximum number of service results returned by
     * <code>ListServices</code> in paginated output. When this parameter is
     * used, <code>ListServices</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>ListServices</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListServices</code> returns up to
     * 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The launch type for the services to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     */
    private String launchType;

    /**
     * <p>
     * The scheduling strategy for services to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REPLICA, DAEMON
     */
    private String schedulingStrategy;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the services to list. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that hosts the services to list. If you do not specify a cluster,
     *         the default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the services to list. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the services to list. If you do not specify
     *            a cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the services to list. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the services to list. If you do not specify
     *            a cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListServicesRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListServices</code> request indicating that more results are
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
     *         <code>ListServices</code> request indicating that more results
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
     * <code>ListServices</code> request indicating that more results are
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
     *            <code>ListServices</code> request indicating that more results
     *            are available to fulfill the request and further calls will be
     *            needed. If <code>maxResults</code> was provided, it is
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
     * <code>ListServices</code> request indicating that more results are
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
     *            <code>ListServices</code> request indicating that more results
     *            are available to fulfill the request and further calls will be
     *            needed. If <code>maxResults</code> was provided, it is
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
    public ListServicesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of service results returned by
     * <code>ListServices</code> in paginated output. When this parameter is
     * used, <code>ListServices</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>ListServices</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListServices</code> returns up to
     * 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     *
     * @return <p>
     *         The maximum number of service results returned by
     *         <code>ListServices</code> in paginated output. When this
     *         parameter is used, <code>ListServices</code> only returns
     *         <code>maxResults</code> results in a single page along with a
     *         <code>nextToken</code> response element. The remaining results of
     *         the initial request can be seen by sending another
     *         <code>ListServices</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and
     *         100. If this parameter is not used, then
     *         <code>ListServices</code> returns up to 10 results and a
     *         <code>nextToken</code> value if applicable.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of service results returned by
     * <code>ListServices</code> in paginated output. When this parameter is
     * used, <code>ListServices</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>ListServices</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListServices</code> returns up to
     * 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of service results returned by
     *            <code>ListServices</code> in paginated output. When this
     *            parameter is used, <code>ListServices</code> only returns
     *            <code>maxResults</code> results in a single page along with a
     *            <code>nextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>ListServices</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            100. If this parameter is not used, then
     *            <code>ListServices</code> returns up to 10 results and a
     *            <code>nextToken</code> value if applicable.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of service results returned by
     * <code>ListServices</code> in paginated output. When this parameter is
     * used, <code>ListServices</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>ListServices</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListServices</code> returns up to
     * 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of service results returned by
     *            <code>ListServices</code> in paginated output. When this
     *            parameter is used, <code>ListServices</code> only returns
     *            <code>maxResults</code> results in a single page along with a
     *            <code>nextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>ListServices</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            100. If this parameter is not used, then
     *            <code>ListServices</code> returns up to 10 results and a
     *            <code>nextToken</code> value if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListServicesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The launch type for the services to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @return <p>
     *         The launch type for the services to list.
     *         </p>
     * @see LaunchType
     */
    public String getLaunchType() {
        return launchType;
    }

    /**
     * <p>
     * The launch type for the services to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type for the services to list.
     *            </p>
     * @see LaunchType
     */
    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type for the services to list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type for the services to list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public ListServicesRequest withLaunchType(String launchType) {
        this.launchType = launchType;
        return this;
    }

    /**
     * <p>
     * The launch type for the services to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type for the services to list.
     *            </p>
     * @see LaunchType
     */
    public void setLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
    }

    /**
     * <p>
     * The launch type for the services to list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type for the services to list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public ListServicesRequest withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The scheduling strategy for services to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REPLICA, DAEMON
     *
     * @return <p>
     *         The scheduling strategy for services to list.
     *         </p>
     * @see SchedulingStrategy
     */
    public String getSchedulingStrategy() {
        return schedulingStrategy;
    }

    /**
     * <p>
     * The scheduling strategy for services to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REPLICA, DAEMON
     *
     * @param schedulingStrategy <p>
     *            The scheduling strategy for services to list.
     *            </p>
     * @see SchedulingStrategy
     */
    public void setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }

    /**
     * <p>
     * The scheduling strategy for services to list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REPLICA, DAEMON
     *
     * @param schedulingStrategy <p>
     *            The scheduling strategy for services to list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SchedulingStrategy
     */
    public ListServicesRequest withSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
        return this;
    }

    /**
     * <p>
     * The scheduling strategy for services to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REPLICA, DAEMON
     *
     * @param schedulingStrategy <p>
     *            The scheduling strategy for services to list.
     *            </p>
     * @see SchedulingStrategy
     */
    public void setSchedulingStrategy(SchedulingStrategy schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy.toString();
    }

    /**
     * <p>
     * The scheduling strategy for services to list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REPLICA, DAEMON
     *
     * @param schedulingStrategy <p>
     *            The scheduling strategy for services to list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SchedulingStrategy
     */
    public ListServicesRequest withSchedulingStrategy(SchedulingStrategy schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy.toString();
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getLaunchType() != null)
            sb.append("launchType: " + getLaunchType() + ",");
        if (getSchedulingStrategy() != null)
            sb.append("schedulingStrategy: " + getSchedulingStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode
                + ((getSchedulingStrategy() == null) ? 0 : getSchedulingStrategy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServicesRequest == false)
            return false;
        ListServicesRequest other = (ListServicesRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
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
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null
                && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getSchedulingStrategy() == null ^ this.getSchedulingStrategy() == null)
            return false;
        if (other.getSchedulingStrategy() != null
                && other.getSchedulingStrategy().equals(this.getSchedulingStrategy()) == false)
            return false;
        return true;
    }
}
