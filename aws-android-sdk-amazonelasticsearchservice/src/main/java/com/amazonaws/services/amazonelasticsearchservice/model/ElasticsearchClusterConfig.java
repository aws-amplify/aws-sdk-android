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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the configuration for the domain cluster, such as the type and
 * number of instances.
 * </p>
 */
public class ElasticsearchClusterConfig implements Serializable {
    /**
     * <p>
     * The instance type for an Elasticsearch cluster. UltraWarm instance types
     * are not supported for data instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     */
    private String instanceType;

    /**
     * <p>
     * The number of instances in the specified domain cluster.
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled.
     * See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     * target="_blank">About Dedicated Master Nodes</a> for more information.
     * </p>
     */
    private Boolean dedicatedMasterEnabled;

    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a
     * href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     * target="_blank">About Zone Awareness</a> for more information.
     * </p>
     */
    private Boolean zoneAwarenessEnabled;

    /**
     * <p>
     * Specifies the zone awareness configuration for a domain when zone
     * awareness is enabled.
     * </p>
     */
    private ZoneAwarenessConfig zoneAwarenessConfig;

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     */
    private String dedicatedMasterType;

    /**
     * <p>
     * Total number of dedicated master nodes, active and on standby, for the
     * cluster.
     * </p>
     */
    private Integer dedicatedMasterCount;

    /**
     * <p>
     * True to enable warm storage.
     * </p>
     */
    private Boolean warmEnabled;

    /**
     * <p>
     * The instance type for the Elasticsearch cluster's warm nodes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch
     */
    private String warmType;

    /**
     * <p>
     * The number of warm nodes in the cluster.
     * </p>
     */
    private Integer warmCount;

    /**
     * <p>
     * The instance type for an Elasticsearch cluster. UltraWarm instance types
     * are not supported for data instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @return <p>
     *         The instance type for an Elasticsearch cluster. UltraWarm
     *         instance types are not supported for data instances.
     *         </p>
     * @see ESPartitionInstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster. UltraWarm instance types
     * are not supported for data instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param instanceType <p>
     *            The instance type for an Elasticsearch cluster. UltraWarm
     *            instance types are not supported for data instances.
     *            </p>
     * @see ESPartitionInstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster. UltraWarm instance types
     * are not supported for data instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param instanceType <p>
     *            The instance type for an Elasticsearch cluster. UltraWarm
     *            instance types are not supported for data instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ESPartitionInstanceType
     */
    public ElasticsearchClusterConfig withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster. UltraWarm instance types
     * are not supported for data instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param instanceType <p>
     *            The instance type for an Elasticsearch cluster. UltraWarm
     *            instance types are not supported for data instances.
     *            </p>
     * @see ESPartitionInstanceType
     */
    public void setInstanceType(ESPartitionInstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster. UltraWarm instance types
     * are not supported for data instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param instanceType <p>
     *            The instance type for an Elasticsearch cluster. UltraWarm
     *            instance types are not supported for data instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ESPartitionInstanceType
     */
    public ElasticsearchClusterConfig withInstanceType(ESPartitionInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of instances in the specified domain cluster.
     * </p>
     *
     * @return <p>
     *         The number of instances in the specified domain cluster.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of instances in the specified domain cluster.
     * </p>
     *
     * @param instanceCount <p>
     *            The number of instances in the specified domain cluster.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances in the specified domain cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            The number of instances in the specified domain cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchClusterConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled.
     * See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     * target="_blank">About Dedicated Master Nodes</a> for more information.
     * </p>
     *
     * @return <p>
     *         A boolean value to indicate whether a dedicated master node is
     *         enabled. See <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     *         target="_blank">About Dedicated Master Nodes</a> for more
     *         information.
     *         </p>
     */
    public Boolean isDedicatedMasterEnabled() {
        return dedicatedMasterEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled.
     * See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     * target="_blank">About Dedicated Master Nodes</a> for more information.
     * </p>
     *
     * @return <p>
     *         A boolean value to indicate whether a dedicated master node is
     *         enabled. See <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     *         target="_blank">About Dedicated Master Nodes</a> for more
     *         information.
     *         </p>
     */
    public Boolean getDedicatedMasterEnabled() {
        return dedicatedMasterEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled.
     * See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     * target="_blank">About Dedicated Master Nodes</a> for more information.
     * </p>
     *
     * @param dedicatedMasterEnabled <p>
     *            A boolean value to indicate whether a dedicated master node is
     *            enabled. See <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     *            target="_blank">About Dedicated Master Nodes</a> for more
     *            information.
     *            </p>
     */
    public void setDedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled.
     * See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     * target="_blank">About Dedicated Master Nodes</a> for more information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dedicatedMasterEnabled <p>
     *            A boolean value to indicate whether a dedicated master node is
     *            enabled. See <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     *            target="_blank">About Dedicated Master Nodes</a> for more
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchClusterConfig withDedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
        return this;
    }

    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a
     * href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     * target="_blank">About Zone Awareness</a> for more information.
     * </p>
     *
     * @return <p>
     *         A boolean value to indicate whether zone awareness is enabled.
     *         See <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     *         target="_blank">About Zone Awareness</a> for more information.
     *         </p>
     */
    public Boolean isZoneAwarenessEnabled() {
        return zoneAwarenessEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a
     * href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     * target="_blank">About Zone Awareness</a> for more information.
     * </p>
     *
     * @return <p>
     *         A boolean value to indicate whether zone awareness is enabled.
     *         See <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     *         target="_blank">About Zone Awareness</a> for more information.
     *         </p>
     */
    public Boolean getZoneAwarenessEnabled() {
        return zoneAwarenessEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a
     * href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     * target="_blank">About Zone Awareness</a> for more information.
     * </p>
     *
     * @param zoneAwarenessEnabled <p>
     *            A boolean value to indicate whether zone awareness is enabled.
     *            See <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     *            target="_blank">About Zone Awareness</a> for more information.
     *            </p>
     */
    public void setZoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a
     * href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     * target="_blank">About Zone Awareness</a> for more information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param zoneAwarenessEnabled <p>
     *            A boolean value to indicate whether zone awareness is enabled.
     *            See <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     *            target="_blank">About Zone Awareness</a> for more information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchClusterConfig withZoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
        return this;
    }

    /**
     * <p>
     * Specifies the zone awareness configuration for a domain when zone
     * awareness is enabled.
     * </p>
     *
     * @return <p>
     *         Specifies the zone awareness configuration for a domain when zone
     *         awareness is enabled.
     *         </p>
     */
    public ZoneAwarenessConfig getZoneAwarenessConfig() {
        return zoneAwarenessConfig;
    }

    /**
     * <p>
     * Specifies the zone awareness configuration for a domain when zone
     * awareness is enabled.
     * </p>
     *
     * @param zoneAwarenessConfig <p>
     *            Specifies the zone awareness configuration for a domain when
     *            zone awareness is enabled.
     *            </p>
     */
    public void setZoneAwarenessConfig(ZoneAwarenessConfig zoneAwarenessConfig) {
        this.zoneAwarenessConfig = zoneAwarenessConfig;
    }

    /**
     * <p>
     * Specifies the zone awareness configuration for a domain when zone
     * awareness is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param zoneAwarenessConfig <p>
     *            Specifies the zone awareness configuration for a domain when
     *            zone awareness is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchClusterConfig withZoneAwarenessConfig(
            ZoneAwarenessConfig zoneAwarenessConfig) {
        this.zoneAwarenessConfig = zoneAwarenessConfig;
        return this;
    }

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @return <p>
     *         The instance type for a dedicated master node.
     *         </p>
     * @see ESPartitionInstanceType
     */
    public String getDedicatedMasterType() {
        return dedicatedMasterType;
    }

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param dedicatedMasterType <p>
     *            The instance type for a dedicated master node.
     *            </p>
     * @see ESPartitionInstanceType
     */
    public void setDedicatedMasterType(String dedicatedMasterType) {
        this.dedicatedMasterType = dedicatedMasterType;
    }

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param dedicatedMasterType <p>
     *            The instance type for a dedicated master node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ESPartitionInstanceType
     */
    public ElasticsearchClusterConfig withDedicatedMasterType(String dedicatedMasterType) {
        this.dedicatedMasterType = dedicatedMasterType;
        return this;
    }

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param dedicatedMasterType <p>
     *            The instance type for a dedicated master node.
     *            </p>
     * @see ESPartitionInstanceType
     */
    public void setDedicatedMasterType(ESPartitionInstanceType dedicatedMasterType) {
        this.dedicatedMasterType = dedicatedMasterType.toString();
    }

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param dedicatedMasterType <p>
     *            The instance type for a dedicated master node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ESPartitionInstanceType
     */
    public ElasticsearchClusterConfig withDedicatedMasterType(
            ESPartitionInstanceType dedicatedMasterType) {
        this.dedicatedMasterType = dedicatedMasterType.toString();
        return this;
    }

    /**
     * <p>
     * Total number of dedicated master nodes, active and on standby, for the
     * cluster.
     * </p>
     *
     * @return <p>
     *         Total number of dedicated master nodes, active and on standby,
     *         for the cluster.
     *         </p>
     */
    public Integer getDedicatedMasterCount() {
        return dedicatedMasterCount;
    }

    /**
     * <p>
     * Total number of dedicated master nodes, active and on standby, for the
     * cluster.
     * </p>
     *
     * @param dedicatedMasterCount <p>
     *            Total number of dedicated master nodes, active and on standby,
     *            for the cluster.
     *            </p>
     */
    public void setDedicatedMasterCount(Integer dedicatedMasterCount) {
        this.dedicatedMasterCount = dedicatedMasterCount;
    }

    /**
     * <p>
     * Total number of dedicated master nodes, active and on standby, for the
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dedicatedMasterCount <p>
     *            Total number of dedicated master nodes, active and on standby,
     *            for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchClusterConfig withDedicatedMasterCount(Integer dedicatedMasterCount) {
        this.dedicatedMasterCount = dedicatedMasterCount;
        return this;
    }

    /**
     * <p>
     * True to enable warm storage.
     * </p>
     *
     * @return <p>
     *         True to enable warm storage.
     *         </p>
     */
    public Boolean isWarmEnabled() {
        return warmEnabled;
    }

    /**
     * <p>
     * True to enable warm storage.
     * </p>
     *
     * @return <p>
     *         True to enable warm storage.
     *         </p>
     */
    public Boolean getWarmEnabled() {
        return warmEnabled;
    }

    /**
     * <p>
     * True to enable warm storage.
     * </p>
     *
     * @param warmEnabled <p>
     *            True to enable warm storage.
     *            </p>
     */
    public void setWarmEnabled(Boolean warmEnabled) {
        this.warmEnabled = warmEnabled;
    }

    /**
     * <p>
     * True to enable warm storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warmEnabled <p>
     *            True to enable warm storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchClusterConfig withWarmEnabled(Boolean warmEnabled) {
        this.warmEnabled = warmEnabled;
        return this;
    }

    /**
     * <p>
     * The instance type for the Elasticsearch cluster's warm nodes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch
     *
     * @return <p>
     *         The instance type for the Elasticsearch cluster's warm nodes.
     *         </p>
     * @see ESWarmPartitionInstanceType
     */
    public String getWarmType() {
        return warmType;
    }

    /**
     * <p>
     * The instance type for the Elasticsearch cluster's warm nodes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch
     *
     * @param warmType <p>
     *            The instance type for the Elasticsearch cluster's warm nodes.
     *            </p>
     * @see ESWarmPartitionInstanceType
     */
    public void setWarmType(String warmType) {
        this.warmType = warmType;
    }

    /**
     * <p>
     * The instance type for the Elasticsearch cluster's warm nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch
     *
     * @param warmType <p>
     *            The instance type for the Elasticsearch cluster's warm nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ESWarmPartitionInstanceType
     */
    public ElasticsearchClusterConfig withWarmType(String warmType) {
        this.warmType = warmType;
        return this;
    }

    /**
     * <p>
     * The instance type for the Elasticsearch cluster's warm nodes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch
     *
     * @param warmType <p>
     *            The instance type for the Elasticsearch cluster's warm nodes.
     *            </p>
     * @see ESWarmPartitionInstanceType
     */
    public void setWarmType(ESWarmPartitionInstanceType warmType) {
        this.warmType = warmType.toString();
    }

    /**
     * <p>
     * The instance type for the Elasticsearch cluster's warm nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch
     *
     * @param warmType <p>
     *            The instance type for the Elasticsearch cluster's warm nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ESWarmPartitionInstanceType
     */
    public ElasticsearchClusterConfig withWarmType(ESWarmPartitionInstanceType warmType) {
        this.warmType = warmType.toString();
        return this;
    }

    /**
     * <p>
     * The number of warm nodes in the cluster.
     * </p>
     *
     * @return <p>
     *         The number of warm nodes in the cluster.
     *         </p>
     */
    public Integer getWarmCount() {
        return warmCount;
    }

    /**
     * <p>
     * The number of warm nodes in the cluster.
     * </p>
     *
     * @param warmCount <p>
     *            The number of warm nodes in the cluster.
     *            </p>
     */
    public void setWarmCount(Integer warmCount) {
        this.warmCount = warmCount;
    }

    /**
     * <p>
     * The number of warm nodes in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warmCount <p>
     *            The number of warm nodes in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchClusterConfig withWarmCount(Integer warmCount) {
        this.warmCount = warmCount;
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
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getDedicatedMasterEnabled() != null)
            sb.append("DedicatedMasterEnabled: " + getDedicatedMasterEnabled() + ",");
        if (getZoneAwarenessEnabled() != null)
            sb.append("ZoneAwarenessEnabled: " + getZoneAwarenessEnabled() + ",");
        if (getZoneAwarenessConfig() != null)
            sb.append("ZoneAwarenessConfig: " + getZoneAwarenessConfig() + ",");
        if (getDedicatedMasterType() != null)
            sb.append("DedicatedMasterType: " + getDedicatedMasterType() + ",");
        if (getDedicatedMasterCount() != null)
            sb.append("DedicatedMasterCount: " + getDedicatedMasterCount() + ",");
        if (getWarmEnabled() != null)
            sb.append("WarmEnabled: " + getWarmEnabled() + ",");
        if (getWarmType() != null)
            sb.append("WarmType: " + getWarmType() + ",");
        if (getWarmCount() != null)
            sb.append("WarmCount: " + getWarmCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getDedicatedMasterEnabled() == null) ? 0 : getDedicatedMasterEnabled()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getZoneAwarenessEnabled() == null) ? 0 : getZoneAwarenessEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getZoneAwarenessConfig() == null) ? 0 : getZoneAwarenessConfig().hashCode());
        hashCode = prime * hashCode
                + ((getDedicatedMasterType() == null) ? 0 : getDedicatedMasterType().hashCode());
        hashCode = prime * hashCode
                + ((getDedicatedMasterCount() == null) ? 0 : getDedicatedMasterCount().hashCode());
        hashCode = prime * hashCode
                + ((getWarmEnabled() == null) ? 0 : getWarmEnabled().hashCode());
        hashCode = prime * hashCode + ((getWarmType() == null) ? 0 : getWarmType().hashCode());
        hashCode = prime * hashCode + ((getWarmCount() == null) ? 0 : getWarmCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticsearchClusterConfig == false)
            return false;
        ElasticsearchClusterConfig other = (ElasticsearchClusterConfig) obj;

        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getDedicatedMasterEnabled() == null ^ this.getDedicatedMasterEnabled() == null)
            return false;
        if (other.getDedicatedMasterEnabled() != null
                && other.getDedicatedMasterEnabled().equals(this.getDedicatedMasterEnabled()) == false)
            return false;
        if (other.getZoneAwarenessEnabled() == null ^ this.getZoneAwarenessEnabled() == null)
            return false;
        if (other.getZoneAwarenessEnabled() != null
                && other.getZoneAwarenessEnabled().equals(this.getZoneAwarenessEnabled()) == false)
            return false;
        if (other.getZoneAwarenessConfig() == null ^ this.getZoneAwarenessConfig() == null)
            return false;
        if (other.getZoneAwarenessConfig() != null
                && other.getZoneAwarenessConfig().equals(this.getZoneAwarenessConfig()) == false)
            return false;
        if (other.getDedicatedMasterType() == null ^ this.getDedicatedMasterType() == null)
            return false;
        if (other.getDedicatedMasterType() != null
                && other.getDedicatedMasterType().equals(this.getDedicatedMasterType()) == false)
            return false;
        if (other.getDedicatedMasterCount() == null ^ this.getDedicatedMasterCount() == null)
            return false;
        if (other.getDedicatedMasterCount() != null
                && other.getDedicatedMasterCount().equals(this.getDedicatedMasterCount()) == false)
            return false;
        if (other.getWarmEnabled() == null ^ this.getWarmEnabled() == null)
            return false;
        if (other.getWarmEnabled() != null
                && other.getWarmEnabled().equals(this.getWarmEnabled()) == false)
            return false;
        if (other.getWarmType() == null ^ this.getWarmType() == null)
            return false;
        if (other.getWarmType() != null && other.getWarmType().equals(this.getWarmType()) == false)
            return false;
        if (other.getWarmCount() == null ^ this.getWarmCount() == null)
            return false;
        if (other.getWarmCount() != null
                && other.getWarmCount().equals(this.getWarmCount()) == false)
            return false;
        return true;
    }
}
