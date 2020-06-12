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
 * Describes one or more of your clusters.
 * </p>
 */
public class DescribeClustersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of up to 100 cluster names or full cluster Amazon Resource Name
     * (ARN) entries. If you do not specify a cluster, the default cluster is
     * assumed.
     * </p>
     */
    private java.util.List<String> clusters;

    /**
     * <p>
     * Whether to include additional information about your clusters in the
     * response. If this field is omitted, the attachments, statistics, and tags
     * are not included.
     * </p>
     * <p>
     * If <code>ATTACHMENTS</code> is specified, the attachments for the
     * container instances or tasks within the cluster are included.
     * </p>
     * <p>
     * If <code>SETTINGS</code> is specified, the settings for the cluster are
     * included.
     * </p>
     * <p>
     * If <code>STATISTICS</code> is specified, the following additional
     * information, separated by launch type, is included:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * runningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>TAGS</code> is specified, the metadata tags associated with the
     * cluster are included.
     * </p>
     */
    private java.util.List<String> include;

    /**
     * <p>
     * A list of up to 100 cluster names or full cluster Amazon Resource Name
     * (ARN) entries. If you do not specify a cluster, the default cluster is
     * assumed.
     * </p>
     *
     * @return <p>
     *         A list of up to 100 cluster names or full cluster Amazon Resource
     *         Name (ARN) entries. If you do not specify a cluster, the default
     *         cluster is assumed.
     *         </p>
     */
    public java.util.List<String> getClusters() {
        return clusters;
    }

    /**
     * <p>
     * A list of up to 100 cluster names or full cluster Amazon Resource Name
     * (ARN) entries. If you do not specify a cluster, the default cluster is
     * assumed.
     * </p>
     *
     * @param clusters <p>
     *            A list of up to 100 cluster names or full cluster Amazon
     *            Resource Name (ARN) entries. If you do not specify a cluster,
     *            the default cluster is assumed.
     *            </p>
     */
    public void setClusters(java.util.Collection<String> clusters) {
        if (clusters == null) {
            this.clusters = null;
            return;
        }

        this.clusters = new java.util.ArrayList<String>(clusters);
    }

    /**
     * <p>
     * A list of up to 100 cluster names or full cluster Amazon Resource Name
     * (ARN) entries. If you do not specify a cluster, the default cluster is
     * assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusters <p>
     *            A list of up to 100 cluster names or full cluster Amazon
     *            Resource Name (ARN) entries. If you do not specify a cluster,
     *            the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClustersRequest withClusters(String... clusters) {
        if (getClusters() == null) {
            this.clusters = new java.util.ArrayList<String>(clusters.length);
        }
        for (String value : clusters) {
            this.clusters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 cluster names or full cluster Amazon Resource Name
     * (ARN) entries. If you do not specify a cluster, the default cluster is
     * assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusters <p>
     *            A list of up to 100 cluster names or full cluster Amazon
     *            Resource Name (ARN) entries. If you do not specify a cluster,
     *            the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClustersRequest withClusters(java.util.Collection<String> clusters) {
        setClusters(clusters);
        return this;
    }

    /**
     * <p>
     * Whether to include additional information about your clusters in the
     * response. If this field is omitted, the attachments, statistics, and tags
     * are not included.
     * </p>
     * <p>
     * If <code>ATTACHMENTS</code> is specified, the attachments for the
     * container instances or tasks within the cluster are included.
     * </p>
     * <p>
     * If <code>SETTINGS</code> is specified, the settings for the cluster are
     * included.
     * </p>
     * <p>
     * If <code>STATISTICS</code> is specified, the following additional
     * information, separated by launch type, is included:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * runningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>TAGS</code> is specified, the metadata tags associated with the
     * cluster are included.
     * </p>
     *
     * @return <p>
     *         Whether to include additional information about your clusters in
     *         the response. If this field is omitted, the attachments,
     *         statistics, and tags are not included.
     *         </p>
     *         <p>
     *         If <code>ATTACHMENTS</code> is specified, the attachments for the
     *         container instances or tasks within the cluster are included.
     *         </p>
     *         <p>
     *         If <code>SETTINGS</code> is specified, the settings for the
     *         cluster are included.
     *         </p>
     *         <p>
     *         If <code>STATISTICS</code> is specified, the following additional
     *         information, separated by launch type, is included:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         runningEC2TasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         runningFargateTasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         pendingEC2TasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         pendingFargateTasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         activeEC2ServiceCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         activeFargateServiceCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         drainingEC2ServiceCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         drainingFargateServiceCount
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>TAGS</code> is specified, the metadata tags associated
     *         with the cluster are included.
     *         </p>
     */
    public java.util.List<String> getInclude() {
        return include;
    }

    /**
     * <p>
     * Whether to include additional information about your clusters in the
     * response. If this field is omitted, the attachments, statistics, and tags
     * are not included.
     * </p>
     * <p>
     * If <code>ATTACHMENTS</code> is specified, the attachments for the
     * container instances or tasks within the cluster are included.
     * </p>
     * <p>
     * If <code>SETTINGS</code> is specified, the settings for the cluster are
     * included.
     * </p>
     * <p>
     * If <code>STATISTICS</code> is specified, the following additional
     * information, separated by launch type, is included:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * runningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>TAGS</code> is specified, the metadata tags associated with the
     * cluster are included.
     * </p>
     *
     * @param include <p>
     *            Whether to include additional information about your clusters
     *            in the response. If this field is omitted, the attachments,
     *            statistics, and tags are not included.
     *            </p>
     *            <p>
     *            If <code>ATTACHMENTS</code> is specified, the attachments for
     *            the container instances or tasks within the cluster are
     *            included.
     *            </p>
     *            <p>
     *            If <code>SETTINGS</code> is specified, the settings for the
     *            cluster are included.
     *            </p>
     *            <p>
     *            If <code>STATISTICS</code> is specified, the following
     *            additional information, separated by launch type, is included:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            runningEC2TasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            runningFargateTasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            pendingEC2TasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            pendingFargateTasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            activeEC2ServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            activeFargateServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            drainingEC2ServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            drainingFargateServiceCount
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <code>TAGS</code> is specified, the metadata tags
     *            associated with the cluster are included.
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
     * Whether to include additional information about your clusters in the
     * response. If this field is omitted, the attachments, statistics, and tags
     * are not included.
     * </p>
     * <p>
     * If <code>ATTACHMENTS</code> is specified, the attachments for the
     * container instances or tasks within the cluster are included.
     * </p>
     * <p>
     * If <code>SETTINGS</code> is specified, the settings for the cluster are
     * included.
     * </p>
     * <p>
     * If <code>STATISTICS</code> is specified, the following additional
     * information, separated by launch type, is included:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * runningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>TAGS</code> is specified, the metadata tags associated with the
     * cluster are included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param include <p>
     *            Whether to include additional information about your clusters
     *            in the response. If this field is omitted, the attachments,
     *            statistics, and tags are not included.
     *            </p>
     *            <p>
     *            If <code>ATTACHMENTS</code> is specified, the attachments for
     *            the container instances or tasks within the cluster are
     *            included.
     *            </p>
     *            <p>
     *            If <code>SETTINGS</code> is specified, the settings for the
     *            cluster are included.
     *            </p>
     *            <p>
     *            If <code>STATISTICS</code> is specified, the following
     *            additional information, separated by launch type, is included:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            runningEC2TasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            runningFargateTasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            pendingEC2TasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            pendingFargateTasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            activeEC2ServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            activeFargateServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            drainingEC2ServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            drainingFargateServiceCount
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <code>TAGS</code> is specified, the metadata tags
     *            associated with the cluster are included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClustersRequest withInclude(String... include) {
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
     * Whether to include additional information about your clusters in the
     * response. If this field is omitted, the attachments, statistics, and tags
     * are not included.
     * </p>
     * <p>
     * If <code>ATTACHMENTS</code> is specified, the attachments for the
     * container instances or tasks within the cluster are included.
     * </p>
     * <p>
     * If <code>SETTINGS</code> is specified, the settings for the cluster are
     * included.
     * </p>
     * <p>
     * If <code>STATISTICS</code> is specified, the following additional
     * information, separated by launch type, is included:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * runningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>TAGS</code> is specified, the metadata tags associated with the
     * cluster are included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param include <p>
     *            Whether to include additional information about your clusters
     *            in the response. If this field is omitted, the attachments,
     *            statistics, and tags are not included.
     *            </p>
     *            <p>
     *            If <code>ATTACHMENTS</code> is specified, the attachments for
     *            the container instances or tasks within the cluster are
     *            included.
     *            </p>
     *            <p>
     *            If <code>SETTINGS</code> is specified, the settings for the
     *            cluster are included.
     *            </p>
     *            <p>
     *            If <code>STATISTICS</code> is specified, the following
     *            additional information, separated by launch type, is included:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            runningEC2TasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            runningFargateTasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            pendingEC2TasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            pendingFargateTasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            activeEC2ServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            activeFargateServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            drainingEC2ServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            drainingFargateServiceCount
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <code>TAGS</code> is specified, the metadata tags
     *            associated with the cluster are included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClustersRequest withInclude(java.util.Collection<String> include) {
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
        if (getClusters() != null)
            sb.append("clusters: " + getClusters() + ",");
        if (getInclude() != null)
            sb.append("include: " + getInclude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusters() == null) ? 0 : getClusters().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClustersRequest == false)
            return false;
        DescribeClustersRequest other = (DescribeClustersRequest) obj;

        if (other.getClusters() == null ^ this.getClusters() == null)
            return false;
        if (other.getClusters() != null && other.getClusters().equals(this.getClusters()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        return true;
    }
}
