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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes resource being monitored by an alarm.
 * </p>
 * <p>
 * An alarm is a way to monitor your Amazon Lightsail resource metrics. For more
 * information, see <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms"
 * >Alarms in Amazon Lightsail</a>.
 * </p>
 */
public class MonitoredResourceInfo implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource being monitored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws[^:]*):([a-zA-Z0-9-]+):([a-z0-9-]+):([0-9]+):([a-
     * zA-Z]+)/([a-zA-Z0-9-]+)$<br/>
     */
    private String arn;

    /**
     * <p>
     * The name of the Lightsail resource being monitored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * The Lightsail resource type of the resource being monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only
     * Lightsail resources that can currently be monitored by alarms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     */
    private String resourceType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource being monitored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws[^:]*):([a-zA-Z0-9-]+):([a-z0-9-]+):([0-9]+):([a-
     * zA-Z]+)/([a-zA-Z0-9-]+)$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource being monitored.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource being monitored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws[^:]*):([a-zA-Z0-9-]+):([a-z0-9-]+):([0-9]+):([a-
     * zA-Z]+)/([a-zA-Z0-9-]+)$<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the resource being
     *            monitored.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource being monitored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws[^:]*):([a-zA-Z0-9-]+):([a-z0-9-]+):([0-9]+):([a-
     * zA-Z]+)/([a-zA-Z0-9-]+)$<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the resource being
     *            monitored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoredResourceInfo withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the Lightsail resource being monitored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the Lightsail resource being monitored.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the Lightsail resource being monitored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the Lightsail resource being monitored.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Lightsail resource being monitored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the Lightsail resource being monitored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoredResourceInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type of the resource being monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only
     * Lightsail resources that can currently be monitored by alarms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @return <p>
     *         The Lightsail resource type of the resource being monitored.
     *         </p>
     *         <p>
     *         Instances, load balancers, and relational databases are the only
     *         Lightsail resources that can currently be monitored by alarms.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type of the resource being monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only
     * Lightsail resources that can currently be monitored by alarms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type of the resource being monitored.
     *            </p>
     *            <p>
     *            Instances, load balancers, and relational databases are the
     *            only Lightsail resources that can currently be monitored by
     *            alarms.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type of the resource being monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only
     * Lightsail resources that can currently be monitored by alarms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type of the resource being monitored.
     *            </p>
     *            <p>
     *            Instances, load balancers, and relational databases are the
     *            only Lightsail resources that can currently be monitored by
     *            alarms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public MonitoredResourceInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type of the resource being monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only
     * Lightsail resources that can currently be monitored by alarms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type of the resource being monitored.
     *            </p>
     *            <p>
     *            Instances, load balancers, and relational databases are the
     *            only Lightsail resources that can currently be monitored by
     *            alarms.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The Lightsail resource type of the resource being monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only
     * Lightsail resources that can currently be monitored by alarms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type of the resource being monitored.
     *            </p>
     *            <p>
     *            Instances, load balancers, and relational databases are the
     *            only Lightsail resources that can currently be monitored by
     *            alarms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public MonitoredResourceInfo withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoredResourceInfo == false)
            return false;
        MonitoredResourceInfo other = (MonitoredResourceInfo) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }
}
