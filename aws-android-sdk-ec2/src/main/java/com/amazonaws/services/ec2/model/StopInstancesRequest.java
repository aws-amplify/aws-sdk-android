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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Stops an Amazon EBS-backed instance.
 * </p>
 * <p>
 * You can use the Stop action to hibernate an instance if the instance is <a
 * href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#enabling-hibernation"
 * >enabled for hibernation</a> and it meets the <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites"
 * >hibernation prerequisites</a>. For more information, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
 * >Hibernate your instance</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 * <p>
 * We don't charge usage for a stopped instance, or data transfer fees; however,
 * your root partition Amazon EBS volume remains and continues to persist your
 * data, and you are charged for Amazon EBS volume usage. Every time you start
 * your Windows instance, Amazon EC2 charges you for a full instance hour. If
 * you stop and restart your Windows instance, a new instance hour begins and
 * Amazon EC2 charges you for another full instance hour even if you are still
 * within the same 60-minute period when it was stopped. Every time you start
 * your Linux instance, Amazon EC2 charges a one-minute minimum for instance
 * usage, and thereafter charges per second for instance usage.
 * </p>
 * <p>
 * You can't stop or hibernate instance store-backed instances. You can't use
 * the Stop action to hibernate Spot Instances, but you can specify that Amazon
 * EC2 should hibernate Spot Instances when they are interrupted. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-interruptions.html#hibernate-spot-instances"
 * >Hibernating interrupted Spot Instances</a> in the <i>Amazon Elastic Compute
 * Cloud User Guide</i>.
 * </p>
 * <p>
 * When you stop or hibernate an instance, we shut it down. You can restart your
 * instance at any time. Before stopping or hibernating an instance, make sure
 * it is in a state from which it can be restarted. Stopping an instance does
 * not preserve data stored in RAM, but hibernating an instance does preserve
 * data stored in RAM. If an instance cannot hibernate successfully, a normal
 * shutdown occurs.
 * </p>
 * <p>
 * Stopping and hibernating an instance is different to rebooting or terminating
 * it. For example, when you stop or hibernate an instance, the root device and
 * any other devices attached to the instance persist. When you terminate an
 * instance, the root device and any other devices attached during the instance
 * launch are automatically deleted. For more information about the differences
 * between rebooting, stopping, hibernating, and terminating instances, see <a
 * href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"
 * >Instance lifecycle</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 * <p>
 * When you stop an instance, we attempt to shut it down forcibly after a short
 * while. If your instance appears stuck in the stopping state after a period of
 * time, there may be an issue with the underlying host computer. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesStopping.html"
 * >Troubleshooting stopping your instance</a> in the <i>Amazon Elastic Compute
 * Cloud User Guide</i>.
 * </p>
 */
public class StopInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The IDs of the instances.
     * </p>
     */
    private java.util.List<String> instanceIds;

    /**
     * <p>
     * Hibernates the instance if the instance was enabled for hibernation at
     * launch. If the instance cannot hibernate successfully, a normal shutdown
     * occurs. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     * >Hibernate your instance</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean hibernate;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * Forces the instances to stop. The instances do not have an opportunity to
     * flush file system caches or file system metadata. If you use this option,
     * you must perform file system check and repair procedures. This option is
     * not recommended for Windows instances.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     *
     * @return <p>
     *         The IDs of the instances.
     *         </p>
     */
    public java.util.List<String> getInstanceIds() {
        return instanceIds;
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     *
     * @param instanceIds <p>
     *            The IDs of the instances.
     *            </p>
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new java.util.ArrayList<String>(instanceIds);
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceIds <p>
     *            The IDs of the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopInstancesRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) {
            this.instanceIds = new java.util.ArrayList<String>(instanceIds.length);
        }
        for (String value : instanceIds) {
            this.instanceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceIds <p>
     *            The IDs of the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * Hibernates the instance if the instance was enabled for hibernation at
     * launch. If the instance cannot hibernate successfully, a normal shutdown
     * occurs. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     * >Hibernate your instance</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         Hibernates the instance if the instance was enabled for
     *         hibernation at launch. If the instance cannot hibernate
     *         successfully, a normal shutdown occurs. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     *         >Hibernate your instance</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean isHibernate() {
        return hibernate;
    }

    /**
     * <p>
     * Hibernates the instance if the instance was enabled for hibernation at
     * launch. If the instance cannot hibernate successfully, a normal shutdown
     * occurs. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     * >Hibernate your instance</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         Hibernates the instance if the instance was enabled for
     *         hibernation at launch. If the instance cannot hibernate
     *         successfully, a normal shutdown occurs. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     *         >Hibernate your instance</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean getHibernate() {
        return hibernate;
    }

    /**
     * <p>
     * Hibernates the instance if the instance was enabled for hibernation at
     * launch. If the instance cannot hibernate successfully, a normal shutdown
     * occurs. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     * >Hibernate your instance</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @param hibernate <p>
     *            Hibernates the instance if the instance was enabled for
     *            hibernation at launch. If the instance cannot hibernate
     *            successfully, a normal shutdown occurs. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     *            >Hibernate your instance</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     */
    public void setHibernate(Boolean hibernate) {
        this.hibernate = hibernate;
    }

    /**
     * <p>
     * Hibernates the instance if the instance was enabled for hibernation at
     * launch. If the instance cannot hibernate successfully, a normal shutdown
     * occurs. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     * >Hibernate your instance</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hibernate <p>
     *            Hibernates the instance if the instance was enabled for
     *            hibernation at launch. If the instance cannot hibernate
     *            successfully, a normal shutdown occurs. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     *            >Hibernate your instance</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopInstancesRequest withHibernate(Boolean hibernate) {
        this.hibernate = hibernate;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopInstancesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Forces the instances to stop. The instances do not have an opportunity to
     * flush file system caches or file system metadata. If you use this option,
     * you must perform file system check and repair procedures. This option is
     * not recommended for Windows instances.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         Forces the instances to stop. The instances do not have an
     *         opportunity to flush file system caches or file system metadata.
     *         If you use this option, you must perform file system check and
     *         repair procedures. This option is not recommended for Windows
     *         instances.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * Forces the instances to stop. The instances do not have an opportunity to
     * flush file system caches or file system metadata. If you use this option,
     * you must perform file system check and repair procedures. This option is
     * not recommended for Windows instances.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         Forces the instances to stop. The instances do not have an
     *         opportunity to flush file system caches or file system metadata.
     *         If you use this option, you must perform file system check and
     *         repair procedures. This option is not recommended for Windows
     *         instances.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * Forces the instances to stop. The instances do not have an opportunity to
     * flush file system caches or file system metadata. If you use this option,
     * you must perform file system check and repair procedures. This option is
     * not recommended for Windows instances.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @param force <p>
     *            Forces the instances to stop. The instances do not have an
     *            opportunity to flush file system caches or file system
     *            metadata. If you use this option, you must perform file system
     *            check and repair procedures. This option is not recommended
     *            for Windows instances.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Forces the instances to stop. The instances do not have an opportunity to
     * flush file system caches or file system metadata. If you use this option,
     * you must perform file system check and repair procedures. This option is
     * not recommended for Windows instances.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            Forces the instances to stop. The instances do not have an
     *            opportunity to flush file system caches or file system
     *            metadata. If you use this option, you must perform file system
     *            check and repair procedures. This option is not recommended
     *            for Windows instances.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopInstancesRequest withForce(Boolean force) {
        this.force = force;
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
        if (getInstanceIds() != null)
            sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getHibernate() != null)
            sb.append("Hibernate: " + getHibernate() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getForce() != null)
            sb.append("Force: " + getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getHibernate() == null) ? 0 : getHibernate().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopInstancesRequest == false)
            return false;
        StopInstancesRequest other = (StopInstancesRequest) obj;

        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null
                && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getHibernate() == null ^ this.getHibernate() == null)
            return false;
        if (other.getHibernate() != null
                && other.getHibernate().equals(this.getHibernate()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }
}
