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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an on-premises instance.
 * </p>
 */
public class InstanceInfo implements Serializable {
    /**
     * <p>
     * The name of the on-premises instance.
     * </p>
     */
    private String instanceName;

    /**
     * <p>
     * The ARN of the IAM session associated with the on-premises instance.
     * </p>
     */
    private String iamSessionArn;

    /**
     * <p>
     * The IAM user ARN associated with the on-premises instance.
     * </p>
     */
    private String iamUserArn;

    /**
     * <p>
     * The ARN of the on-premises instance.
     * </p>
     */
    private String instanceArn;

    /**
     * <p>
     * The time at which the on-premises instance was registered.
     * </p>
     */
    private java.util.Date registerTime;

    /**
     * <p>
     * If the on-premises instance was deregistered, the time at which the
     * on-premises instance was deregistered.
     * </p>
     */
    private java.util.Date deregisterTime;

    /**
     * <p>
     * The tags currently associated with the on-premises instance.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the on-premises instance.
     * </p>
     *
     * @return <p>
     *         The name of the on-premises instance.
     *         </p>
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * <p>
     * The name of the on-premises instance.
     * </p>
     *
     * @param instanceName <p>
     *            The name of the on-premises instance.
     *            </p>
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the on-premises instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceName <p>
     *            The name of the on-premises instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM session associated with the on-premises instance.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM session associated with the on-premises
     *         instance.
     *         </p>
     */
    public String getIamSessionArn() {
        return iamSessionArn;
    }

    /**
     * <p>
     * The ARN of the IAM session associated with the on-premises instance.
     * </p>
     *
     * @param iamSessionArn <p>
     *            The ARN of the IAM session associated with the on-premises
     *            instance.
     *            </p>
     */
    public void setIamSessionArn(String iamSessionArn) {
        this.iamSessionArn = iamSessionArn;
    }

    /**
     * <p>
     * The ARN of the IAM session associated with the on-premises instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamSessionArn <p>
     *            The ARN of the IAM session associated with the on-premises
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceInfo withIamSessionArn(String iamSessionArn) {
        this.iamSessionArn = iamSessionArn;
        return this;
    }

    /**
     * <p>
     * The IAM user ARN associated with the on-premises instance.
     * </p>
     *
     * @return <p>
     *         The IAM user ARN associated with the on-premises instance.
     *         </p>
     */
    public String getIamUserArn() {
        return iamUserArn;
    }

    /**
     * <p>
     * The IAM user ARN associated with the on-premises instance.
     * </p>
     *
     * @param iamUserArn <p>
     *            The IAM user ARN associated with the on-premises instance.
     *            </p>
     */
    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }

    /**
     * <p>
     * The IAM user ARN associated with the on-premises instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamUserArn <p>
     *            The IAM user ARN associated with the on-premises instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceInfo withIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the on-premises instance.
     * </p>
     *
     * @return <p>
     *         The ARN of the on-premises instance.
     *         </p>
     */
    public String getInstanceArn() {
        return instanceArn;
    }

    /**
     * <p>
     * The ARN of the on-premises instance.
     * </p>
     *
     * @param instanceArn <p>
     *            The ARN of the on-premises instance.
     *            </p>
     */
    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The ARN of the on-premises instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceArn <p>
     *            The ARN of the on-premises instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceInfo withInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
        return this;
    }

    /**
     * <p>
     * The time at which the on-premises instance was registered.
     * </p>
     *
     * @return <p>
     *         The time at which the on-premises instance was registered.
     *         </p>
     */
    public java.util.Date getRegisterTime() {
        return registerTime;
    }

    /**
     * <p>
     * The time at which the on-premises instance was registered.
     * </p>
     *
     * @param registerTime <p>
     *            The time at which the on-premises instance was registered.
     *            </p>
     */
    public void setRegisterTime(java.util.Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * <p>
     * The time at which the on-premises instance was registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registerTime <p>
     *            The time at which the on-premises instance was registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceInfo withRegisterTime(java.util.Date registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    /**
     * <p>
     * If the on-premises instance was deregistered, the time at which the
     * on-premises instance was deregistered.
     * </p>
     *
     * @return <p>
     *         If the on-premises instance was deregistered, the time at which
     *         the on-premises instance was deregistered.
     *         </p>
     */
    public java.util.Date getDeregisterTime() {
        return deregisterTime;
    }

    /**
     * <p>
     * If the on-premises instance was deregistered, the time at which the
     * on-premises instance was deregistered.
     * </p>
     *
     * @param deregisterTime <p>
     *            If the on-premises instance was deregistered, the time at
     *            which the on-premises instance was deregistered.
     *            </p>
     */
    public void setDeregisterTime(java.util.Date deregisterTime) {
        this.deregisterTime = deregisterTime;
    }

    /**
     * <p>
     * If the on-premises instance was deregistered, the time at which the
     * on-premises instance was deregistered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deregisterTime <p>
     *            If the on-premises instance was deregistered, the time at
     *            which the on-premises instance was deregistered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceInfo withDeregisterTime(java.util.Date deregisterTime) {
        this.deregisterTime = deregisterTime;
        return this;
    }

    /**
     * <p>
     * The tags currently associated with the on-premises instance.
     * </p>
     *
     * @return <p>
     *         The tags currently associated with the on-premises instance.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags currently associated with the on-premises instance.
     * </p>
     *
     * @param tags <p>
     *            The tags currently associated with the on-premises instance.
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
     * The tags currently associated with the on-premises instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags currently associated with the on-premises instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceInfo withTags(Tag... tags) {
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
     * The tags currently associated with the on-premises instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags currently associated with the on-premises instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceInfo withTags(java.util.Collection<Tag> tags) {
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
        if (getInstanceName() != null)
            sb.append("instanceName: " + getInstanceName() + ",");
        if (getIamSessionArn() != null)
            sb.append("iamSessionArn: " + getIamSessionArn() + ",");
        if (getIamUserArn() != null)
            sb.append("iamUserArn: " + getIamUserArn() + ",");
        if (getInstanceArn() != null)
            sb.append("instanceArn: " + getInstanceArn() + ",");
        if (getRegisterTime() != null)
            sb.append("registerTime: " + getRegisterTime() + ",");
        if (getDeregisterTime() != null)
            sb.append("deregisterTime: " + getDeregisterTime() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode
                + ((getIamSessionArn() == null) ? 0 : getIamSessionArn().hashCode());
        hashCode = prime * hashCode + ((getIamUserArn() == null) ? 0 : getIamUserArn().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode
                + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        hashCode = prime * hashCode
                + ((getDeregisterTime() == null) ? 0 : getDeregisterTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceInfo == false)
            return false;
        InstanceInfo other = (InstanceInfo) obj;

        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null
                && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getIamSessionArn() == null ^ this.getIamSessionArn() == null)
            return false;
        if (other.getIamSessionArn() != null
                && other.getIamSessionArn().equals(this.getIamSessionArn()) == false)
            return false;
        if (other.getIamUserArn() == null ^ this.getIamUserArn() == null)
            return false;
        if (other.getIamUserArn() != null
                && other.getIamUserArn().equals(this.getIamUserArn()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null
                && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getRegisterTime() == null ^ this.getRegisterTime() == null)
            return false;
        if (other.getRegisterTime() != null
                && other.getRegisterTime().equals(this.getRegisterTime()) == false)
            return false;
        if (other.getDeregisterTime() == null ^ this.getDeregisterTime() == null)
            return false;
        if (other.getDeregisterTime() != null
                && other.getDeregisterTime().equals(this.getDeregisterTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
