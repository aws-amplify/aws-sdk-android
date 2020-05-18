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
 * Describes the task sets in the specified cluster and service. This is used
 * when a service uses the <code>EXTERNAL</code> deployment controller type. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html"
 * >Amazon ECS Deployment Types</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 */
public class DescribeTaskSetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service that the task sets exist in.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the
     * task sets exist in.
     * </p>
     */
    private String service;

    /**
     * <p>
     * The ID or full Amazon Resource Name (ARN) of task sets to describe.
     * </p>
     */
    private java.util.List<String> taskSets;

    /**
     * <p>
     * Specifies whether to see the resource tags for the task set. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     */
    private java.util.List<String> include;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service that the task sets exist in.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that hosts the service that the task sets exist in.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service that the task sets exist in.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the service that the task sets exist in.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service that the task sets exist in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the service that the task sets exist in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTaskSetsRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the
     * task sets exist in.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the service
     *         that the task sets exist in.
     *         </p>
     */
    public String getService() {
        return service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the
     * task sets exist in.
     * </p>
     *
     * @param service <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            service that the task sets exist in.
     *            </p>
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the
     * task sets exist in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param service <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            service that the task sets exist in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTaskSetsRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * <p>
     * The ID or full Amazon Resource Name (ARN) of task sets to describe.
     * </p>
     *
     * @return <p>
     *         The ID or full Amazon Resource Name (ARN) of task sets to
     *         describe.
     *         </p>
     */
    public java.util.List<String> getTaskSets() {
        return taskSets;
    }

    /**
     * <p>
     * The ID or full Amazon Resource Name (ARN) of task sets to describe.
     * </p>
     *
     * @param taskSets <p>
     *            The ID or full Amazon Resource Name (ARN) of task sets to
     *            describe.
     *            </p>
     */
    public void setTaskSets(java.util.Collection<String> taskSets) {
        if (taskSets == null) {
            this.taskSets = null;
            return;
        }

        this.taskSets = new java.util.ArrayList<String>(taskSets);
    }

    /**
     * <p>
     * The ID or full Amazon Resource Name (ARN) of task sets to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskSets <p>
     *            The ID or full Amazon Resource Name (ARN) of task sets to
     *            describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTaskSetsRequest withTaskSets(String... taskSets) {
        if (getTaskSets() == null) {
            this.taskSets = new java.util.ArrayList<String>(taskSets.length);
        }
        for (String value : taskSets) {
            this.taskSets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ID or full Amazon Resource Name (ARN) of task sets to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskSets <p>
     *            The ID or full Amazon Resource Name (ARN) of task sets to
     *            describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTaskSetsRequest withTaskSets(java.util.Collection<String> taskSets) {
        setTaskSets(taskSets);
        return this;
    }

    /**
     * <p>
     * Specifies whether to see the resource tags for the task set. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     *
     * @return <p>
     *         Specifies whether to see the resource tags for the task set. If
     *         <code>TAGS</code> is specified, the tags are included in the
     *         response. If this field is omitted, tags are not included in the
     *         response.
     *         </p>
     */
    public java.util.List<String> getInclude() {
        return include;
    }

    /**
     * <p>
     * Specifies whether to see the resource tags for the task set. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     *
     * @param include <p>
     *            Specifies whether to see the resource tags for the task set.
     *            If <code>TAGS</code> is specified, the tags are included in
     *            the response. If this field is omitted, tags are not included
     *            in the response.
     *            </p>
     */
    public void setInclude(java.util.Collection<String> include) {
        if (include == null) {
            this.include = null;
            return;
        }

        this.include = new java.util.ArrayList<String>(include);
    }

    /**
     * <p>
     * Specifies whether to see the resource tags for the task set. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param include <p>
     *            Specifies whether to see the resource tags for the task set.
     *            If <code>TAGS</code> is specified, the tags are included in
     *            the response. If this field is omitted, tags are not included
     *            in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTaskSetsRequest withInclude(String... include) {
        if (getInclude() == null) {
            this.include = new java.util.ArrayList<String>(include.length);
        }
        for (String value : include) {
            this.include.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether to see the resource tags for the task set. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param include <p>
     *            Specifies whether to see the resource tags for the task set.
     *            If <code>TAGS</code> is specified, the tags are included in
     *            the response. If this field is omitted, tags are not included
     *            in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTaskSetsRequest withInclude(java.util.Collection<String> include) {
        setInclude(include);
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
        if (getService() != null)
            sb.append("service: " + getService() + ",");
        if (getTaskSets() != null)
            sb.append("taskSets: " + getTaskSets() + ",");
        if (getInclude() != null)
            sb.append("include: " + getInclude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getTaskSets() == null) ? 0 : getTaskSets().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTaskSetsRequest == false)
            return false;
        DescribeTaskSetsRequest other = (DescribeTaskSetsRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getTaskSets() == null ^ this.getTaskSets() == null)
            return false;
        if (other.getTaskSets() != null && other.getTaskSets().equals(this.getTaskSets()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        return true;
    }
}
