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

/**
 * <p>
 * Describes an Elastic Graphics accelerator.
 * </p>
 */
public class ElasticGpus implements Serializable {
    /**
     * <p>
     * The ID of the Elastic Graphics accelerator.
     * </p>
     */
    private String elasticGpuId;

    /**
     * <p>
     * The Availability Zone in the which the Elastic Graphics accelerator
     * resides.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The type of Elastic Graphics accelerator.
     * </p>
     */
    private String elasticGpuType;

    /**
     * <p>
     * The status of the Elastic Graphics accelerator.
     * </p>
     */
    private ElasticGpuHealth elasticGpuHealth;

    /**
     * <p>
     * The state of the Elastic Graphics accelerator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTACHED
     */
    private String elasticGpuState;

    /**
     * <p>
     * The ID of the instance to which the Elastic Graphics accelerator is
     * attached.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The tags assigned to the Elastic Graphics accelerator.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the Elastic Graphics accelerator.
     * </p>
     *
     * @return <p>
     *         The ID of the Elastic Graphics accelerator.
     *         </p>
     */
    public String getElasticGpuId() {
        return elasticGpuId;
    }

    /**
     * <p>
     * The ID of the Elastic Graphics accelerator.
     * </p>
     *
     * @param elasticGpuId <p>
     *            The ID of the Elastic Graphics accelerator.
     *            </p>
     */
    public void setElasticGpuId(String elasticGpuId) {
        this.elasticGpuId = elasticGpuId;
    }

    /**
     * <p>
     * The ID of the Elastic Graphics accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuId <p>
     *            The ID of the Elastic Graphics accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticGpus withElasticGpuId(String elasticGpuId) {
        this.elasticGpuId = elasticGpuId;
        return this;
    }

    /**
     * <p>
     * The Availability Zone in the which the Elastic Graphics accelerator
     * resides.
     * </p>
     *
     * @return <p>
     *         The Availability Zone in the which the Elastic Graphics
     *         accelerator resides.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in the which the Elastic Graphics accelerator
     * resides.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone in the which the Elastic Graphics
     *            accelerator resides.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in the which the Elastic Graphics accelerator
     * resides.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone in the which the Elastic Graphics
     *            accelerator resides.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticGpus withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The type of Elastic Graphics accelerator.
     * </p>
     *
     * @return <p>
     *         The type of Elastic Graphics accelerator.
     *         </p>
     */
    public String getElasticGpuType() {
        return elasticGpuType;
    }

    /**
     * <p>
     * The type of Elastic Graphics accelerator.
     * </p>
     *
     * @param elasticGpuType <p>
     *            The type of Elastic Graphics accelerator.
     *            </p>
     */
    public void setElasticGpuType(String elasticGpuType) {
        this.elasticGpuType = elasticGpuType;
    }

    /**
     * <p>
     * The type of Elastic Graphics accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuType <p>
     *            The type of Elastic Graphics accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticGpus withElasticGpuType(String elasticGpuType) {
        this.elasticGpuType = elasticGpuType;
        return this;
    }

    /**
     * <p>
     * The status of the Elastic Graphics accelerator.
     * </p>
     *
     * @return <p>
     *         The status of the Elastic Graphics accelerator.
     *         </p>
     */
    public ElasticGpuHealth getElasticGpuHealth() {
        return elasticGpuHealth;
    }

    /**
     * <p>
     * The status of the Elastic Graphics accelerator.
     * </p>
     *
     * @param elasticGpuHealth <p>
     *            The status of the Elastic Graphics accelerator.
     *            </p>
     */
    public void setElasticGpuHealth(ElasticGpuHealth elasticGpuHealth) {
        this.elasticGpuHealth = elasticGpuHealth;
    }

    /**
     * <p>
     * The status of the Elastic Graphics accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticGpuHealth <p>
     *            The status of the Elastic Graphics accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticGpus withElasticGpuHealth(ElasticGpuHealth elasticGpuHealth) {
        this.elasticGpuHealth = elasticGpuHealth;
        return this;
    }

    /**
     * <p>
     * The state of the Elastic Graphics accelerator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTACHED
     *
     * @return <p>
     *         The state of the Elastic Graphics accelerator.
     *         </p>
     * @see ElasticGpuState
     */
    public String getElasticGpuState() {
        return elasticGpuState;
    }

    /**
     * <p>
     * The state of the Elastic Graphics accelerator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTACHED
     *
     * @param elasticGpuState <p>
     *            The state of the Elastic Graphics accelerator.
     *            </p>
     * @see ElasticGpuState
     */
    public void setElasticGpuState(String elasticGpuState) {
        this.elasticGpuState = elasticGpuState;
    }

    /**
     * <p>
     * The state of the Elastic Graphics accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTACHED
     *
     * @param elasticGpuState <p>
     *            The state of the Elastic Graphics accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ElasticGpuState
     */
    public ElasticGpus withElasticGpuState(String elasticGpuState) {
        this.elasticGpuState = elasticGpuState;
        return this;
    }

    /**
     * <p>
     * The state of the Elastic Graphics accelerator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTACHED
     *
     * @param elasticGpuState <p>
     *            The state of the Elastic Graphics accelerator.
     *            </p>
     * @see ElasticGpuState
     */
    public void setElasticGpuState(ElasticGpuState elasticGpuState) {
        this.elasticGpuState = elasticGpuState.toString();
    }

    /**
     * <p>
     * The state of the Elastic Graphics accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTACHED
     *
     * @param elasticGpuState <p>
     *            The state of the Elastic Graphics accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ElasticGpuState
     */
    public ElasticGpus withElasticGpuState(ElasticGpuState elasticGpuState) {
        this.elasticGpuState = elasticGpuState.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the instance to which the Elastic Graphics accelerator is
     * attached.
     * </p>
     *
     * @return <p>
     *         The ID of the instance to which the Elastic Graphics accelerator
     *         is attached.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance to which the Elastic Graphics accelerator is
     * attached.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance to which the Elastic Graphics
     *            accelerator is attached.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance to which the Elastic Graphics accelerator is
     * attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance to which the Elastic Graphics
     *            accelerator is attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticGpus withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Elastic Graphics accelerator.
     * </p>
     *
     * @return <p>
     *         The tags assigned to the Elastic Graphics accelerator.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the Elastic Graphics accelerator.
     * </p>
     *
     * @param tags <p>
     *            The tags assigned to the Elastic Graphics accelerator.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags assigned to the Elastic Graphics accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the Elastic Graphics accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticGpus withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Elastic Graphics accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the Elastic Graphics accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticGpus withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getElasticGpuId() != null)
            sb.append("ElasticGpuId: " + getElasticGpuId() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getElasticGpuType() != null)
            sb.append("ElasticGpuType: " + getElasticGpuType() + ",");
        if (getElasticGpuHealth() != null)
            sb.append("ElasticGpuHealth: " + getElasticGpuHealth() + ",");
        if (getElasticGpuState() != null)
            sb.append("ElasticGpuState: " + getElasticGpuState() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getElasticGpuId() == null) ? 0 : getElasticGpuId().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getElasticGpuType() == null) ? 0 : getElasticGpuType().hashCode());
        hashCode = prime * hashCode
                + ((getElasticGpuHealth() == null) ? 0 : getElasticGpuHealth().hashCode());
        hashCode = prime * hashCode
                + ((getElasticGpuState() == null) ? 0 : getElasticGpuState().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticGpus == false)
            return false;
        ElasticGpus other = (ElasticGpus) obj;

        if (other.getElasticGpuId() == null ^ this.getElasticGpuId() == null)
            return false;
        if (other.getElasticGpuId() != null
                && other.getElasticGpuId().equals(this.getElasticGpuId()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getElasticGpuType() == null ^ this.getElasticGpuType() == null)
            return false;
        if (other.getElasticGpuType() != null
                && other.getElasticGpuType().equals(this.getElasticGpuType()) == false)
            return false;
        if (other.getElasticGpuHealth() == null ^ this.getElasticGpuHealth() == null)
            return false;
        if (other.getElasticGpuHealth() != null
                && other.getElasticGpuHealth().equals(this.getElasticGpuHealth()) == false)
            return false;
        if (other.getElasticGpuState() == null ^ this.getElasticGpuState() == null)
            return false;
        if (other.getElasticGpuState() != null
                && other.getElasticGpuState().equals(this.getElasticGpuState()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
