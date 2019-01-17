/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the instance protection settings of the specified instances.
 * </p>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
 * >Instance Protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
 * </p>
 */
public class SetInstanceProtectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * One or more instance IDs.
     * </p>
     */
    private java.util.List<String> instanceIds = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon
     * EC2 Auto Scaling when scaling in.
     * </p>
     */
    private Boolean protectedFromScaleIn;

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     *
     * @return <p>
     *         One or more instance IDs.
     *         </p>
     */
    public java.util.List<String> getInstanceIds() {
        return instanceIds;
    }

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     *
     * @param instanceIds <p>
     *            One or more instance IDs.
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
     * One or more instance IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceIds <p>
     *            One or more instance IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetInstanceProtectionRequest withInstanceIds(String... instanceIds) {
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
     * One or more instance IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceIds <p>
     *            One or more instance IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetInstanceProtectionRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the Auto Scaling group.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetInstanceProtectionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon
     * EC2 Auto Scaling when scaling in.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance is protected from termination by
     *         Amazon EC2 Auto Scaling when scaling in.
     *         </p>
     */
    public Boolean isProtectedFromScaleIn() {
        return protectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon
     * EC2 Auto Scaling when scaling in.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instance is protected from termination by
     *         Amazon EC2 Auto Scaling when scaling in.
     *         </p>
     */
    public Boolean getProtectedFromScaleIn() {
        return protectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon
     * EC2 Auto Scaling when scaling in.
     * </p>
     *
     * @param protectedFromScaleIn <p>
     *            Indicates whether the instance is protected from termination
     *            by Amazon EC2 Auto Scaling when scaling in.
     *            </p>
     */
    public void setProtectedFromScaleIn(Boolean protectedFromScaleIn) {
        this.protectedFromScaleIn = protectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon
     * EC2 Auto Scaling when scaling in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protectedFromScaleIn <p>
     *            Indicates whether the instance is protected from termination
     *            by Amazon EC2 Auto Scaling when scaling in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetInstanceProtectionRequest withProtectedFromScaleIn(Boolean protectedFromScaleIn) {
        this.protectedFromScaleIn = protectedFromScaleIn;
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getProtectedFromScaleIn() != null)
            sb.append("ProtectedFromScaleIn: " + getProtectedFromScaleIn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getProtectedFromScaleIn() == null) ? 0 : getProtectedFromScaleIn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetInstanceProtectionRequest == false)
            return false;
        SetInstanceProtectionRequest other = (SetInstanceProtectionRequest) obj;

        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null
                && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getProtectedFromScaleIn() == null ^ this.getProtectedFromScaleIn() == null)
            return false;
        if (other.getProtectedFromScaleIn() != null
                && other.getProtectedFromScaleIn().equals(this.getProtectedFromScaleIn()) == false)
            return false;
        return true;
    }
}
