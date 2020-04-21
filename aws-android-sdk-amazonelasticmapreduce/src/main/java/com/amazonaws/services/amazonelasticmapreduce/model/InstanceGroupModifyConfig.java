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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Modify the size or configurations of an instance group.
 * </p>
 */
public class InstanceGroupModifyConfig implements Serializable {
    /**
     * <p>
     * Unique ID of the instance group to expand or shrink.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String instanceGroupId;

    /**
     * <p>
     * Target size for the instance group.
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * The EC2 InstanceIds to terminate. After you terminate the instances, the
     * instance group will not return to its original requested size.
     * </p>
     */
    private java.util.List<String> eC2InstanceIdsToTerminate;

    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     */
    private ShrinkPolicy shrinkPolicy;

    /**
     * <p>
     * A list of new or modified configurations to apply for an instance group.
     * </p>
     */
    private java.util.List<Configuration> configurations;

    /**
     * <p>
     * Unique ID of the instance group to expand or shrink.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Unique ID of the instance group to expand or shrink.
     *         </p>
     */
    public String getInstanceGroupId() {
        return instanceGroupId;
    }

    /**
     * <p>
     * Unique ID of the instance group to expand or shrink.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceGroupId <p>
     *            Unique ID of the instance group to expand or shrink.
     *            </p>
     */
    public void setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
    }

    /**
     * <p>
     * Unique ID of the instance group to expand or shrink.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceGroupId <p>
     *            Unique ID of the instance group to expand or shrink.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupModifyConfig withInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
        return this;
    }

    /**
     * <p>
     * Target size for the instance group.
     * </p>
     *
     * @return <p>
     *         Target size for the instance group.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * Target size for the instance group.
     * </p>
     *
     * @param instanceCount <p>
     *            Target size for the instance group.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * Target size for the instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            Target size for the instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupModifyConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * The EC2 InstanceIds to terminate. After you terminate the instances, the
     * instance group will not return to its original requested size.
     * </p>
     *
     * @return <p>
     *         The EC2 InstanceIds to terminate. After you terminate the
     *         instances, the instance group will not return to its original
     *         requested size.
     *         </p>
     */
    public java.util.List<String> getEC2InstanceIdsToTerminate() {
        return eC2InstanceIdsToTerminate;
    }

    /**
     * <p>
     * The EC2 InstanceIds to terminate. After you terminate the instances, the
     * instance group will not return to its original requested size.
     * </p>
     *
     * @param eC2InstanceIdsToTerminate <p>
     *            The EC2 InstanceIds to terminate. After you terminate the
     *            instances, the instance group will not return to its original
     *            requested size.
     *            </p>
     */
    public void setEC2InstanceIdsToTerminate(java.util.Collection<String> eC2InstanceIdsToTerminate) {
        if (eC2InstanceIdsToTerminate == null) {
            this.eC2InstanceIdsToTerminate = null;
            return;
        }

        this.eC2InstanceIdsToTerminate = new java.util.ArrayList<String>(eC2InstanceIdsToTerminate);
    }

    /**
     * <p>
     * The EC2 InstanceIds to terminate. After you terminate the instances, the
     * instance group will not return to its original requested size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2InstanceIdsToTerminate <p>
     *            The EC2 InstanceIds to terminate. After you terminate the
     *            instances, the instance group will not return to its original
     *            requested size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupModifyConfig withEC2InstanceIdsToTerminate(
            String... eC2InstanceIdsToTerminate) {
        if (getEC2InstanceIdsToTerminate() == null) {
            this.eC2InstanceIdsToTerminate = new java.util.ArrayList<String>(
                    eC2InstanceIdsToTerminate.length);
        }
        for (String value : eC2InstanceIdsToTerminate) {
            this.eC2InstanceIdsToTerminate.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 InstanceIds to terminate. After you terminate the instances, the
     * instance group will not return to its original requested size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2InstanceIdsToTerminate <p>
     *            The EC2 InstanceIds to terminate. After you terminate the
     *            instances, the instance group will not return to its original
     *            requested size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupModifyConfig withEC2InstanceIdsToTerminate(
            java.util.Collection<String> eC2InstanceIdsToTerminate) {
        setEC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate);
        return this;
    }

    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     *
     * @return <p>
     *         Policy for customizing shrink operations.
     *         </p>
     */
    public ShrinkPolicy getShrinkPolicy() {
        return shrinkPolicy;
    }

    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     *
     * @param shrinkPolicy <p>
     *            Policy for customizing shrink operations.
     *            </p>
     */
    public void setShrinkPolicy(ShrinkPolicy shrinkPolicy) {
        this.shrinkPolicy = shrinkPolicy;
    }

    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shrinkPolicy <p>
     *            Policy for customizing shrink operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupModifyConfig withShrinkPolicy(ShrinkPolicy shrinkPolicy) {
        this.shrinkPolicy = shrinkPolicy;
        return this;
    }

    /**
     * <p>
     * A list of new or modified configurations to apply for an instance group.
     * </p>
     *
     * @return <p>
     *         A list of new or modified configurations to apply for an instance
     *         group.
     *         </p>
     */
    public java.util.List<Configuration> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * A list of new or modified configurations to apply for an instance group.
     * </p>
     *
     * @param configurations <p>
     *            A list of new or modified configurations to apply for an
     *            instance group.
     *            </p>
     */
    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new java.util.ArrayList<Configuration>(configurations);
    }

    /**
     * <p>
     * A list of new or modified configurations to apply for an instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <p>
     *            A list of new or modified configurations to apply for an
     *            instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupModifyConfig withConfigurations(Configuration... configurations) {
        if (getConfigurations() == null) {
            this.configurations = new java.util.ArrayList<Configuration>(configurations.length);
        }
        for (Configuration value : configurations) {
            this.configurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of new or modified configurations to apply for an instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <p>
     *            A list of new or modified configurations to apply for an
     *            instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupModifyConfig withConfigurations(
            java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
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
        if (getInstanceGroupId() != null)
            sb.append("InstanceGroupId: " + getInstanceGroupId() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getEC2InstanceIdsToTerminate() != null)
            sb.append("EC2InstanceIdsToTerminate: " + getEC2InstanceIdsToTerminate() + ",");
        if (getShrinkPolicy() != null)
            sb.append("ShrinkPolicy: " + getShrinkPolicy() + ",");
        if (getConfigurations() != null)
            sb.append("Configurations: " + getConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceGroupId() == null) ? 0 : getInstanceGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getEC2InstanceIdsToTerminate() == null) ? 0 : getEC2InstanceIdsToTerminate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getShrinkPolicy() == null) ? 0 : getShrinkPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceGroupModifyConfig == false)
            return false;
        InstanceGroupModifyConfig other = (InstanceGroupModifyConfig) obj;

        if (other.getInstanceGroupId() == null ^ this.getInstanceGroupId() == null)
            return false;
        if (other.getInstanceGroupId() != null
                && other.getInstanceGroupId().equals(this.getInstanceGroupId()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getEC2InstanceIdsToTerminate() == null
                ^ this.getEC2InstanceIdsToTerminate() == null)
            return false;
        if (other.getEC2InstanceIdsToTerminate() != null
                && other.getEC2InstanceIdsToTerminate().equals(this.getEC2InstanceIdsToTerminate()) == false)
            return false;
        if (other.getShrinkPolicy() == null ^ this.getShrinkPolicy() == null)
            return false;
        if (other.getShrinkPolicy() != null
                && other.getShrinkPolicy().equals(this.getShrinkPolicy()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null
                && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        return true;
    }
}
