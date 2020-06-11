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
 * Returns a list of container instances in a specified cluster. You can filter
 * the results of a <code>ListContainerInstances</code> operation with cluster
 * query language statements inside the <code>filter</code> parameter. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
 * >Cluster Query Language</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 */
public class ListContainerInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instances to list. If you do not specify a cluster,
     * the default cluster is assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * You can filter the results of a <code>ListContainerInstances</code>
     * operation with cluster query language statements. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     * >Cluster Query Language</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     */
    private String filter;

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListContainerInstances</code> request indicating that more results
     * are available to fulfill the request and further calls will be needed. If
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
     * The maximum number of container instance results returned by
     * <code>ListContainerInstances</code> in paginated output. When this
     * parameter is used, <code>ListContainerInstances</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListContainerInstances</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListContainerInstances</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Filters the container instances by status. For example, if you specify
     * the <code>DRAINING</code> status, the results include only container
     * instances that have been set to <code>DRAINING</code> using
     * <a>UpdateContainerInstancesState</a>. If you do not specify this
     * parameter, the default is to include container instances set to all
     * states other than <code>INACTIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DRAINING, REGISTERING, DEREGISTERING,
     * REGISTRATION_FAILED
     */
    private String status;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instances to list. If you do not specify a cluster,
     * the default cluster is assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that hosts the container instances to list. If you do not specify
     *         a cluster, the default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instances to list. If you do not specify a cluster,
     * the default cluster is assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the container instances to list. If you do
     *            not specify a cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instances to list. If you do not specify a cluster,
     * the default cluster is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the container instances to list. If you do
     *            not specify a cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContainerInstancesRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * You can filter the results of a <code>ListContainerInstances</code>
     * operation with cluster query language statements. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     * >Cluster Query Language</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         You can filter the results of a
     *         <code>ListContainerInstances</code> operation with cluster query
     *         language statements. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     *         >Cluster Query Language</a> in the <i>Amazon Elastic Container
     *         Service Developer Guide</i>.
     *         </p>
     */
    public String getFilter() {
        return filter;
    }

    /**
     * <p>
     * You can filter the results of a <code>ListContainerInstances</code>
     * operation with cluster query language statements. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     * >Cluster Query Language</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     *
     * @param filter <p>
     *            You can filter the results of a
     *            <code>ListContainerInstances</code> operation with cluster
     *            query language statements. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     *            >Cluster Query Language</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * You can filter the results of a <code>ListContainerInstances</code>
     * operation with cluster query language statements. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     * >Cluster Query Language</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            You can filter the results of a
     *            <code>ListContainerInstances</code> operation with cluster
     *            query language statements. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     *            >Cluster Query Language</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContainerInstancesRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListContainerInstances</code> request indicating that more results
     * are available to fulfill the request and further calls will be needed. If
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
     *         <code>ListContainerInstances</code> request indicating that more
     *         results are available to fulfill the request and further calls
     *         will be needed. If <code>maxResults</code> was provided, it is
     *         possible the number of results to be fewer than
     *         <code>maxResults</code>.
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
     * <code>ListContainerInstances</code> request indicating that more results
     * are available to fulfill the request and further calls will be needed. If
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
     *            <code>ListContainerInstances</code> request indicating that
     *            more results are available to fulfill the request and further
     *            calls will be needed. If <code>maxResults</code> was provided,
     *            it is possible the number of results to be fewer than
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
     * <code>ListContainerInstances</code> request indicating that more results
     * are available to fulfill the request and further calls will be needed. If
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
     *            <code>ListContainerInstances</code> request indicating that
     *            more results are available to fulfill the request and further
     *            calls will be needed. If <code>maxResults</code> was provided,
     *            it is possible the number of results to be fewer than
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
    public ListContainerInstancesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of container instance results returned by
     * <code>ListContainerInstances</code> in paginated output. When this
     * parameter is used, <code>ListContainerInstances</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListContainerInstances</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListContainerInstances</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     *
     * @return <p>
     *         The maximum number of container instance results returned by
     *         <code>ListContainerInstances</code> in paginated output. When
     *         this parameter is used, <code>ListContainerInstances</code> only
     *         returns <code>maxResults</code> results in a single page along
     *         with a <code>nextToken</code> response element. The remaining
     *         results of the initial request can be seen by sending another
     *         <code>ListContainerInstances</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and
     *         100. If this parameter is not used, then
     *         <code>ListContainerInstances</code> returns up to 100 results and
     *         a <code>nextToken</code> value if applicable.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of container instance results returned by
     * <code>ListContainerInstances</code> in paginated output. When this
     * parameter is used, <code>ListContainerInstances</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListContainerInstances</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListContainerInstances</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of container instance results returned by
     *            <code>ListContainerInstances</code> in paginated output. When
     *            this parameter is used, <code>ListContainerInstances</code>
     *            only returns <code>maxResults</code> results in a single page
     *            along with a <code>nextToken</code> response element. The
     *            remaining results of the initial request can be seen by
     *            sending another <code>ListContainerInstances</code> request
     *            with the returned <code>nextToken</code> value. This value can
     *            be between 1 and 100. If this parameter is not used, then
     *            <code>ListContainerInstances</code> returns up to 100 results
     *            and a <code>nextToken</code> value if applicable.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of container instance results returned by
     * <code>ListContainerInstances</code> in paginated output. When this
     * parameter is used, <code>ListContainerInstances</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListContainerInstances</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListContainerInstances</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of container instance results returned by
     *            <code>ListContainerInstances</code> in paginated output. When
     *            this parameter is used, <code>ListContainerInstances</code>
     *            only returns <code>maxResults</code> results in a single page
     *            along with a <code>nextToken</code> response element. The
     *            remaining results of the initial request can be seen by
     *            sending another <code>ListContainerInstances</code> request
     *            with the returned <code>nextToken</code> value. This value can
     *            be between 1 and 100. If this parameter is not used, then
     *            <code>ListContainerInstances</code> returns up to 100 results
     *            and a <code>nextToken</code> value if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContainerInstancesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Filters the container instances by status. For example, if you specify
     * the <code>DRAINING</code> status, the results include only container
     * instances that have been set to <code>DRAINING</code> using
     * <a>UpdateContainerInstancesState</a>. If you do not specify this
     * parameter, the default is to include container instances set to all
     * states other than <code>INACTIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DRAINING, REGISTERING, DEREGISTERING,
     * REGISTRATION_FAILED
     *
     * @return <p>
     *         Filters the container instances by status. For example, if you
     *         specify the <code>DRAINING</code> status, the results include
     *         only container instances that have been set to
     *         <code>DRAINING</code> using <a>UpdateContainerInstancesState</a>.
     *         If you do not specify this parameter, the default is to include
     *         container instances set to all states other than
     *         <code>INACTIVE</code>.
     *         </p>
     * @see ContainerInstanceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Filters the container instances by status. For example, if you specify
     * the <code>DRAINING</code> status, the results include only container
     * instances that have been set to <code>DRAINING</code> using
     * <a>UpdateContainerInstancesState</a>. If you do not specify this
     * parameter, the default is to include container instances set to all
     * states other than <code>INACTIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DRAINING, REGISTERING, DEREGISTERING,
     * REGISTRATION_FAILED
     *
     * @param status <p>
     *            Filters the container instances by status. For example, if you
     *            specify the <code>DRAINING</code> status, the results include
     *            only container instances that have been set to
     *            <code>DRAINING</code> using
     *            <a>UpdateContainerInstancesState</a>. If you do not specify
     *            this parameter, the default is to include container instances
     *            set to all states other than <code>INACTIVE</code>.
     *            </p>
     * @see ContainerInstanceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Filters the container instances by status. For example, if you specify
     * the <code>DRAINING</code> status, the results include only container
     * instances that have been set to <code>DRAINING</code> using
     * <a>UpdateContainerInstancesState</a>. If you do not specify this
     * parameter, the default is to include container instances set to all
     * states other than <code>INACTIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DRAINING, REGISTERING, DEREGISTERING,
     * REGISTRATION_FAILED
     *
     * @param status <p>
     *            Filters the container instances by status. For example, if you
     *            specify the <code>DRAINING</code> status, the results include
     *            only container instances that have been set to
     *            <code>DRAINING</code> using
     *            <a>UpdateContainerInstancesState</a>. If you do not specify
     *            this parameter, the default is to include container instances
     *            set to all states other than <code>INACTIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContainerInstanceStatus
     */
    public ListContainerInstancesRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Filters the container instances by status. For example, if you specify
     * the <code>DRAINING</code> status, the results include only container
     * instances that have been set to <code>DRAINING</code> using
     * <a>UpdateContainerInstancesState</a>. If you do not specify this
     * parameter, the default is to include container instances set to all
     * states other than <code>INACTIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DRAINING, REGISTERING, DEREGISTERING,
     * REGISTRATION_FAILED
     *
     * @param status <p>
     *            Filters the container instances by status. For example, if you
     *            specify the <code>DRAINING</code> status, the results include
     *            only container instances that have been set to
     *            <code>DRAINING</code> using
     *            <a>UpdateContainerInstancesState</a>. If you do not specify
     *            this parameter, the default is to include container instances
     *            set to all states other than <code>INACTIVE</code>.
     *            </p>
     * @see ContainerInstanceStatus
     */
    public void setStatus(ContainerInstanceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Filters the container instances by status. For example, if you specify
     * the <code>DRAINING</code> status, the results include only container
     * instances that have been set to <code>DRAINING</code> using
     * <a>UpdateContainerInstancesState</a>. If you do not specify this
     * parameter, the default is to include container instances set to all
     * states other than <code>INACTIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DRAINING, REGISTERING, DEREGISTERING,
     * REGISTRATION_FAILED
     *
     * @param status <p>
     *            Filters the container instances by status. For example, if you
     *            specify the <code>DRAINING</code> status, the results include
     *            only container instances that have been set to
     *            <code>DRAINING</code> using
     *            <a>UpdateContainerInstancesState</a>. If you do not specify
     *            this parameter, the default is to include container instances
     *            set to all states other than <code>INACTIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContainerInstanceStatus
     */
    public ListContainerInstancesRequest withStatus(ContainerInstanceStatus status) {
        this.status = status.toString();
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
        if (getFilter() != null)
            sb.append("filter: " + getFilter() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListContainerInstancesRequest == false)
            return false;
        ListContainerInstancesRequest other = (ListContainerInstancesRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
