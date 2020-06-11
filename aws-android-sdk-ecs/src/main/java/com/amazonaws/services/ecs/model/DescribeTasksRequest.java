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
 * Describes a specified task or tasks.
 * </p>
 */
public class DescribeTasksRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the task or tasks to describe. If you do not specify a cluster, the
     * default cluster is assumed. This parameter is required if the task or
     * tasks you are describing were launched in any cluster other than the
     * default cluster.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * A list of up to 100 task IDs or full ARN entries.
     * </p>
     */
    private java.util.List<String> tasks;

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the task. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     */
    private java.util.List<String> include;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the task or tasks to describe. If you do not specify a cluster, the
     * default cluster is assumed. This parameter is required if the task or
     * tasks you are describing were launched in any cluster other than the
     * default cluster.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that hosts the task or tasks to describe. If you do not specify a
     *         cluster, the default cluster is assumed. This parameter is
     *         required if the task or tasks you are describing were launched in
     *         any cluster other than the default cluster.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the task or tasks to describe. If you do not specify a cluster, the
     * default cluster is assumed. This parameter is required if the task or
     * tasks you are describing were launched in any cluster other than the
     * default cluster.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the task or tasks to describe. If you do
     *            not specify a cluster, the default cluster is assumed. This
     *            parameter is required if the task or tasks you are describing
     *            were launched in any cluster other than the default cluster.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the task or tasks to describe. If you do not specify a cluster, the
     * default cluster is assumed. This parameter is required if the task or
     * tasks you are describing were launched in any cluster other than the
     * default cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the task or tasks to describe. If you do
     *            not specify a cluster, the default cluster is assumed. This
     *            parameter is required if the task or tasks you are describing
     *            were launched in any cluster other than the default cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTasksRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * A list of up to 100 task IDs or full ARN entries.
     * </p>
     *
     * @return <p>
     *         A list of up to 100 task IDs or full ARN entries.
     *         </p>
     */
    public java.util.List<String> getTasks() {
        return tasks;
    }

    /**
     * <p>
     * A list of up to 100 task IDs or full ARN entries.
     * </p>
     *
     * @param tasks <p>
     *            A list of up to 100 task IDs or full ARN entries.
     *            </p>
     */
    public void setTasks(java.util.Collection<String> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new java.util.ArrayList<String>(tasks);
    }

    /**
     * <p>
     * A list of up to 100 task IDs or full ARN entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tasks <p>
     *            A list of up to 100 task IDs or full ARN entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTasksRequest withTasks(String... tasks) {
        if (getTasks() == null) {
            this.tasks = new java.util.ArrayList<String>(tasks.length);
        }
        for (String value : tasks) {
            this.tasks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 task IDs or full ARN entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tasks <p>
     *            A list of up to 100 task IDs or full ARN entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTasksRequest withTasks(java.util.Collection<String> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the task. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     *
     * @return <p>
     *         Specifies whether you want to see the resource tags for the task.
     *         If <code>TAGS</code> is specified, the tags are included in the
     *         response. If this field is omitted, tags are not included in the
     *         response.
     *         </p>
     */
    public java.util.List<String> getInclude() {
        return include;
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the task. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     *
     * @param include <p>
     *            Specifies whether you want to see the resource tags for the
     *            task. If <code>TAGS</code> is specified, the tags are included
     *            in the response. If this field is omitted, tags are not
     *            included in the response.
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
     * Specifies whether you want to see the resource tags for the task. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param include <p>
     *            Specifies whether you want to see the resource tags for the
     *            task. If <code>TAGS</code> is specified, the tags are included
     *            in the response. If this field is omitted, tags are not
     *            included in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTasksRequest withInclude(String... include) {
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
     * Specifies whether you want to see the resource tags for the task. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param include <p>
     *            Specifies whether you want to see the resource tags for the
     *            task. If <code>TAGS</code> is specified, the tags are included
     *            in the response. If this field is omitted, tags are not
     *            included in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTasksRequest withInclude(java.util.Collection<String> include) {
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
        if (getTasks() != null)
            sb.append("tasks: " + getTasks() + ",");
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
        hashCode = prime * hashCode + ((getTasks() == null) ? 0 : getTasks().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTasksRequest == false)
            return false;
        DescribeTasksRequest other = (DescribeTasksRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        return true;
    }
}
