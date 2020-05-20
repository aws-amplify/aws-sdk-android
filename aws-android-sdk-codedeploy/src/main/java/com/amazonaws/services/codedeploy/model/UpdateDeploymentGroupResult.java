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
 * Represents the output of an <code>UpdateDeploymentGroup</code> operation.
 * </p>
 */
public class UpdateDeploymentGroupResult implements Serializable {
    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group
     * contained at least one Auto Scaling group, AWS CodeDeploy successfully
     * removed all corresponding Auto Scaling lifecycle event hooks from the AWS
     * account. If the output contains data, AWS CodeDeploy could not remove
     * some Auto Scaling lifecycle event hooks from the AWS account.
     * </p>
     */
    private java.util.List<AutoScalingGroup> hooksNotCleanedUp;

    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group
     * contained at least one Auto Scaling group, AWS CodeDeploy successfully
     * removed all corresponding Auto Scaling lifecycle event hooks from the AWS
     * account. If the output contains data, AWS CodeDeploy could not remove
     * some Auto Scaling lifecycle event hooks from the AWS account.
     * </p>
     *
     * @return <p>
     *         If the output contains no data, and the corresponding deployment
     *         group contained at least one Auto Scaling group, AWS CodeDeploy
     *         successfully removed all corresponding Auto Scaling lifecycle
     *         event hooks from the AWS account. If the output contains data,
     *         AWS CodeDeploy could not remove some Auto Scaling lifecycle event
     *         hooks from the AWS account.
     *         </p>
     */
    public java.util.List<AutoScalingGroup> getHooksNotCleanedUp() {
        return hooksNotCleanedUp;
    }

    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group
     * contained at least one Auto Scaling group, AWS CodeDeploy successfully
     * removed all corresponding Auto Scaling lifecycle event hooks from the AWS
     * account. If the output contains data, AWS CodeDeploy could not remove
     * some Auto Scaling lifecycle event hooks from the AWS account.
     * </p>
     *
     * @param hooksNotCleanedUp <p>
     *            If the output contains no data, and the corresponding
     *            deployment group contained at least one Auto Scaling group,
     *            AWS CodeDeploy successfully removed all corresponding Auto
     *            Scaling lifecycle event hooks from the AWS account. If the
     *            output contains data, AWS CodeDeploy could not remove some
     *            Auto Scaling lifecycle event hooks from the AWS account.
     *            </p>
     */
    public void setHooksNotCleanedUp(java.util.Collection<AutoScalingGroup> hooksNotCleanedUp) {
        if (hooksNotCleanedUp == null) {
            this.hooksNotCleanedUp = null;
            return;
        }

        this.hooksNotCleanedUp = new java.util.ArrayList<AutoScalingGroup>(hooksNotCleanedUp);
    }

    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group
     * contained at least one Auto Scaling group, AWS CodeDeploy successfully
     * removed all corresponding Auto Scaling lifecycle event hooks from the AWS
     * account. If the output contains data, AWS CodeDeploy could not remove
     * some Auto Scaling lifecycle event hooks from the AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hooksNotCleanedUp <p>
     *            If the output contains no data, and the corresponding
     *            deployment group contained at least one Auto Scaling group,
     *            AWS CodeDeploy successfully removed all corresponding Auto
     *            Scaling lifecycle event hooks from the AWS account. If the
     *            output contains data, AWS CodeDeploy could not remove some
     *            Auto Scaling lifecycle event hooks from the AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupResult withHooksNotCleanedUp(AutoScalingGroup... hooksNotCleanedUp) {
        if (getHooksNotCleanedUp() == null) {
            this.hooksNotCleanedUp = new java.util.ArrayList<AutoScalingGroup>(
                    hooksNotCleanedUp.length);
        }
        for (AutoScalingGroup value : hooksNotCleanedUp) {
            this.hooksNotCleanedUp.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group
     * contained at least one Auto Scaling group, AWS CodeDeploy successfully
     * removed all corresponding Auto Scaling lifecycle event hooks from the AWS
     * account. If the output contains data, AWS CodeDeploy could not remove
     * some Auto Scaling lifecycle event hooks from the AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hooksNotCleanedUp <p>
     *            If the output contains no data, and the corresponding
     *            deployment group contained at least one Auto Scaling group,
     *            AWS CodeDeploy successfully removed all corresponding Auto
     *            Scaling lifecycle event hooks from the AWS account. If the
     *            output contains data, AWS CodeDeploy could not remove some
     *            Auto Scaling lifecycle event hooks from the AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupResult withHooksNotCleanedUp(
            java.util.Collection<AutoScalingGroup> hooksNotCleanedUp) {
        setHooksNotCleanedUp(hooksNotCleanedUp);
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
        if (getHooksNotCleanedUp() != null)
            sb.append("hooksNotCleanedUp: " + getHooksNotCleanedUp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHooksNotCleanedUp() == null) ? 0 : getHooksNotCleanedUp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeploymentGroupResult == false)
            return false;
        UpdateDeploymentGroupResult other = (UpdateDeploymentGroupResult) obj;

        if (other.getHooksNotCleanedUp() == null ^ this.getHooksNotCleanedUp() == null)
            return false;
        if (other.getHooksNotCleanedUp() != null
                && other.getHooksNotCleanedUp().equals(this.getHooksNotCleanedUp()) == false)
            return false;
        return true;
    }
}
