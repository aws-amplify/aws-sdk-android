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

/**
 * <p>
 * The details of the Auto Scaling group for the capacity provider.
 * </p>
 */
public class AutoScalingGroupProvider implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupArn;

    /**
     * <p>
     * The managed scaling settings for the Auto Scaling group capacity
     * provider.
     * </p>
     */
    private ManagedScaling managedScaling;

    /**
     * <p>
     * The managed termination protection setting to use for the Auto Scaling
     * group capacity provider. This determines whether the Auto Scaling group
     * has managed termination protection.
     * </p>
     * <important>
     * <p>
     * When using managed termination protection, managed scaling must also be
     * used otherwise managed termination protection will not work.
     * </p>
     * </important>
     * <p>
     * When managed termination protection is enabled, Amazon ECS prevents the
     * Amazon EC2 instances in an Auto Scaling group that contain tasks from
     * being terminated during a scale-in action. The Auto Scaling group and
     * each instance in the Auto Scaling group must have instance protection
     * from scale-in actions enabled as well. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * When managed termination protection is disabled, your Amazon EC2
     * instances are not protected from termination when the Auto Scaling group
     * scales in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String managedTerminationProtection;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the Auto Scaling group.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that identifies the Auto Scaling
     *         group.
     *         </p>
     */
    public String getAutoScalingGroupArn() {
        return autoScalingGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the Auto Scaling group.
     * </p>
     *
     * @param autoScalingGroupArn <p>
     *            The Amazon Resource Name (ARN) that identifies the Auto
     *            Scaling group.
     *            </p>
     */
    public void setAutoScalingGroupArn(String autoScalingGroupArn) {
        this.autoScalingGroupArn = autoScalingGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingGroupArn <p>
     *            The Amazon Resource Name (ARN) that identifies the Auto
     *            Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroupProvider withAutoScalingGroupArn(String autoScalingGroupArn) {
        this.autoScalingGroupArn = autoScalingGroupArn;
        return this;
    }

    /**
     * <p>
     * The managed scaling settings for the Auto Scaling group capacity
     * provider.
     * </p>
     *
     * @return <p>
     *         The managed scaling settings for the Auto Scaling group capacity
     *         provider.
     *         </p>
     */
    public ManagedScaling getManagedScaling() {
        return managedScaling;
    }

    /**
     * <p>
     * The managed scaling settings for the Auto Scaling group capacity
     * provider.
     * </p>
     *
     * @param managedScaling <p>
     *            The managed scaling settings for the Auto Scaling group
     *            capacity provider.
     *            </p>
     */
    public void setManagedScaling(ManagedScaling managedScaling) {
        this.managedScaling = managedScaling;
    }

    /**
     * <p>
     * The managed scaling settings for the Auto Scaling group capacity
     * provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param managedScaling <p>
     *            The managed scaling settings for the Auto Scaling group
     *            capacity provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroupProvider withManagedScaling(ManagedScaling managedScaling) {
        this.managedScaling = managedScaling;
        return this;
    }

    /**
     * <p>
     * The managed termination protection setting to use for the Auto Scaling
     * group capacity provider. This determines whether the Auto Scaling group
     * has managed termination protection.
     * </p>
     * <important>
     * <p>
     * When using managed termination protection, managed scaling must also be
     * used otherwise managed termination protection will not work.
     * </p>
     * </important>
     * <p>
     * When managed termination protection is enabled, Amazon ECS prevents the
     * Amazon EC2 instances in an Auto Scaling group that contain tasks from
     * being terminated during a scale-in action. The Auto Scaling group and
     * each instance in the Auto Scaling group must have instance protection
     * from scale-in actions enabled as well. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * When managed termination protection is disabled, your Amazon EC2
     * instances are not protected from termination when the Auto Scaling group
     * scales in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The managed termination protection setting to use for the Auto
     *         Scaling group capacity provider. This determines whether the Auto
     *         Scaling group has managed termination protection.
     *         </p>
     *         <important>
     *         <p>
     *         When using managed termination protection, managed scaling must
     *         also be used otherwise managed termination protection will not
     *         work.
     *         </p>
     *         </important>
     *         <p>
     *         When managed termination protection is enabled, Amazon ECS
     *         prevents the Amazon EC2 instances in an Auto Scaling group that
     *         contain tasks from being terminated during a scale-in action. The
     *         Auto Scaling group and each instance in the Auto Scaling group
     *         must have instance protection from scale-in actions enabled as
     *         well. For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *         >Instance Protection</a> in the <i>AWS Auto Scaling User
     *         Guide</i>.
     *         </p>
     *         <p>
     *         When managed termination protection is disabled, your Amazon EC2
     *         instances are not protected from termination when the Auto
     *         Scaling group scales in.
     *         </p>
     * @see ManagedTerminationProtection
     */
    public String getManagedTerminationProtection() {
        return managedTerminationProtection;
    }

    /**
     * <p>
     * The managed termination protection setting to use for the Auto Scaling
     * group capacity provider. This determines whether the Auto Scaling group
     * has managed termination protection.
     * </p>
     * <important>
     * <p>
     * When using managed termination protection, managed scaling must also be
     * used otherwise managed termination protection will not work.
     * </p>
     * </important>
     * <p>
     * When managed termination protection is enabled, Amazon ECS prevents the
     * Amazon EC2 instances in an Auto Scaling group that contain tasks from
     * being terminated during a scale-in action. The Auto Scaling group and
     * each instance in the Auto Scaling group must have instance protection
     * from scale-in actions enabled as well. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * When managed termination protection is disabled, your Amazon EC2
     * instances are not protected from termination when the Auto Scaling group
     * scales in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param managedTerminationProtection <p>
     *            The managed termination protection setting to use for the Auto
     *            Scaling group capacity provider. This determines whether the
     *            Auto Scaling group has managed termination protection.
     *            </p>
     *            <important>
     *            <p>
     *            When using managed termination protection, managed scaling
     *            must also be used otherwise managed termination protection
     *            will not work.
     *            </p>
     *            </important>
     *            <p>
     *            When managed termination protection is enabled, Amazon ECS
     *            prevents the Amazon EC2 instances in an Auto Scaling group
     *            that contain tasks from being terminated during a scale-in
     *            action. The Auto Scaling group and each instance in the Auto
     *            Scaling group must have instance protection from scale-in
     *            actions enabled as well. For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *            >Instance Protection</a> in the <i>AWS Auto Scaling User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            When managed termination protection is disabled, your Amazon
     *            EC2 instances are not protected from termination when the Auto
     *            Scaling group scales in.
     *            </p>
     * @see ManagedTerminationProtection
     */
    public void setManagedTerminationProtection(String managedTerminationProtection) {
        this.managedTerminationProtection = managedTerminationProtection;
    }

    /**
     * <p>
     * The managed termination protection setting to use for the Auto Scaling
     * group capacity provider. This determines whether the Auto Scaling group
     * has managed termination protection.
     * </p>
     * <important>
     * <p>
     * When using managed termination protection, managed scaling must also be
     * used otherwise managed termination protection will not work.
     * </p>
     * </important>
     * <p>
     * When managed termination protection is enabled, Amazon ECS prevents the
     * Amazon EC2 instances in an Auto Scaling group that contain tasks from
     * being terminated during a scale-in action. The Auto Scaling group and
     * each instance in the Auto Scaling group must have instance protection
     * from scale-in actions enabled as well. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * When managed termination protection is disabled, your Amazon EC2
     * instances are not protected from termination when the Auto Scaling group
     * scales in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param managedTerminationProtection <p>
     *            The managed termination protection setting to use for the Auto
     *            Scaling group capacity provider. This determines whether the
     *            Auto Scaling group has managed termination protection.
     *            </p>
     *            <important>
     *            <p>
     *            When using managed termination protection, managed scaling
     *            must also be used otherwise managed termination protection
     *            will not work.
     *            </p>
     *            </important>
     *            <p>
     *            When managed termination protection is enabled, Amazon ECS
     *            prevents the Amazon EC2 instances in an Auto Scaling group
     *            that contain tasks from being terminated during a scale-in
     *            action. The Auto Scaling group and each instance in the Auto
     *            Scaling group must have instance protection from scale-in
     *            actions enabled as well. For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *            >Instance Protection</a> in the <i>AWS Auto Scaling User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            When managed termination protection is disabled, your Amazon
     *            EC2 instances are not protected from termination when the Auto
     *            Scaling group scales in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ManagedTerminationProtection
     */
    public AutoScalingGroupProvider withManagedTerminationProtection(
            String managedTerminationProtection) {
        this.managedTerminationProtection = managedTerminationProtection;
        return this;
    }

    /**
     * <p>
     * The managed termination protection setting to use for the Auto Scaling
     * group capacity provider. This determines whether the Auto Scaling group
     * has managed termination protection.
     * </p>
     * <important>
     * <p>
     * When using managed termination protection, managed scaling must also be
     * used otherwise managed termination protection will not work.
     * </p>
     * </important>
     * <p>
     * When managed termination protection is enabled, Amazon ECS prevents the
     * Amazon EC2 instances in an Auto Scaling group that contain tasks from
     * being terminated during a scale-in action. The Auto Scaling group and
     * each instance in the Auto Scaling group must have instance protection
     * from scale-in actions enabled as well. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * When managed termination protection is disabled, your Amazon EC2
     * instances are not protected from termination when the Auto Scaling group
     * scales in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param managedTerminationProtection <p>
     *            The managed termination protection setting to use for the Auto
     *            Scaling group capacity provider. This determines whether the
     *            Auto Scaling group has managed termination protection.
     *            </p>
     *            <important>
     *            <p>
     *            When using managed termination protection, managed scaling
     *            must also be used otherwise managed termination protection
     *            will not work.
     *            </p>
     *            </important>
     *            <p>
     *            When managed termination protection is enabled, Amazon ECS
     *            prevents the Amazon EC2 instances in an Auto Scaling group
     *            that contain tasks from being terminated during a scale-in
     *            action. The Auto Scaling group and each instance in the Auto
     *            Scaling group must have instance protection from scale-in
     *            actions enabled as well. For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *            >Instance Protection</a> in the <i>AWS Auto Scaling User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            When managed termination protection is disabled, your Amazon
     *            EC2 instances are not protected from termination when the Auto
     *            Scaling group scales in.
     *            </p>
     * @see ManagedTerminationProtection
     */
    public void setManagedTerminationProtection(
            ManagedTerminationProtection managedTerminationProtection) {
        this.managedTerminationProtection = managedTerminationProtection.toString();
    }

    /**
     * <p>
     * The managed termination protection setting to use for the Auto Scaling
     * group capacity provider. This determines whether the Auto Scaling group
     * has managed termination protection.
     * </p>
     * <important>
     * <p>
     * When using managed termination protection, managed scaling must also be
     * used otherwise managed termination protection will not work.
     * </p>
     * </important>
     * <p>
     * When managed termination protection is enabled, Amazon ECS prevents the
     * Amazon EC2 instances in an Auto Scaling group that contain tasks from
     * being terminated during a scale-in action. The Auto Scaling group and
     * each instance in the Auto Scaling group must have instance protection
     * from scale-in actions enabled as well. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * When managed termination protection is disabled, your Amazon EC2
     * instances are not protected from termination when the Auto Scaling group
     * scales in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param managedTerminationProtection <p>
     *            The managed termination protection setting to use for the Auto
     *            Scaling group capacity provider. This determines whether the
     *            Auto Scaling group has managed termination protection.
     *            </p>
     *            <important>
     *            <p>
     *            When using managed termination protection, managed scaling
     *            must also be used otherwise managed termination protection
     *            will not work.
     *            </p>
     *            </important>
     *            <p>
     *            When managed termination protection is enabled, Amazon ECS
     *            prevents the Amazon EC2 instances in an Auto Scaling group
     *            that contain tasks from being terminated during a scale-in
     *            action. The Auto Scaling group and each instance in the Auto
     *            Scaling group must have instance protection from scale-in
     *            actions enabled as well. For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *            >Instance Protection</a> in the <i>AWS Auto Scaling User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            When managed termination protection is disabled, your Amazon
     *            EC2 instances are not protected from termination when the Auto
     *            Scaling group scales in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ManagedTerminationProtection
     */
    public AutoScalingGroupProvider withManagedTerminationProtection(
            ManagedTerminationProtection managedTerminationProtection) {
        this.managedTerminationProtection = managedTerminationProtection.toString();
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
        if (getAutoScalingGroupArn() != null)
            sb.append("autoScalingGroupArn: " + getAutoScalingGroupArn() + ",");
        if (getManagedScaling() != null)
            sb.append("managedScaling: " + getManagedScaling() + ",");
        if (getManagedTerminationProtection() != null)
            sb.append("managedTerminationProtection: " + getManagedTerminationProtection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupArn() == null) ? 0 : getAutoScalingGroupArn().hashCode());
        hashCode = prime * hashCode
                + ((getManagedScaling() == null) ? 0 : getManagedScaling().hashCode());
        hashCode = prime
                * hashCode
                + ((getManagedTerminationProtection() == null) ? 0
                        : getManagedTerminationProtection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingGroupProvider == false)
            return false;
        AutoScalingGroupProvider other = (AutoScalingGroupProvider) obj;

        if (other.getAutoScalingGroupArn() == null ^ this.getAutoScalingGroupArn() == null)
            return false;
        if (other.getAutoScalingGroupArn() != null
                && other.getAutoScalingGroupArn().equals(this.getAutoScalingGroupArn()) == false)
            return false;
        if (other.getManagedScaling() == null ^ this.getManagedScaling() == null)
            return false;
        if (other.getManagedScaling() != null
                && other.getManagedScaling().equals(this.getManagedScaling()) == false)
            return false;
        if (other.getManagedTerminationProtection() == null
                ^ this.getManagedTerminationProtection() == null)
            return false;
        if (other.getManagedTerminationProtection() != null
                && other.getManagedTerminationProtection().equals(
                        this.getManagedTerminationProtection()) == false)
            return false;
        return true;
    }
}
