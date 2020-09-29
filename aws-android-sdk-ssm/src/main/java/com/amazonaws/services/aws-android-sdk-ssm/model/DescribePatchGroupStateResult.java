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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


public class DescribePatchGroupStateResult implements Serializable {
    /**
     * <p>The number of instances in the patch group.</p>
     */
    private Integer instances;

    /**
     * <p>The number of instances with installed patches.</p>
     */
    private Integer instancesWithInstalledPatches;

    /**
     * <p>The number of instances with patches installed that aren't defined in the patch baseline.</p>
     */
    private Integer instancesWithInstalledOtherPatches;

    /**
     * <p>The number of instances with patches installed by Patch Manager that have not been rebooted after the patch installation. The status of these instances is NON_COMPLIANT.</p>
     */
    private Integer instancesWithInstalledPendingRebootPatches;

    /**
     * <p>The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of <i>INSTALLED_REJECTED</i> were typically installed before they were added to a RejectedPatches list.</p> <note> <p>If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstancesWithInstalledRejectedPatches will always be 0 (zero).</p> </note>
     */
    private Integer instancesWithInstalledRejectedPatches;

    /**
     * <p>The number of instances with missing patches from the patch baseline.</p>
     */
    private Integer instancesWithMissingPatches;

    /**
     * <p>The number of instances with patches from the patch baseline that failed to install.</p>
     */
    private Integer instancesWithFailedPatches;

    /**
     * <p>The number of instances with patches that aren't applicable.</p>
     */
    private Integer instancesWithNotApplicablePatches;

    /**
     * <p>The number of instances with <code>NotApplicable</code> patches beyond the supported limit, which are not reported by name to Systems Manager Inventory.</p>
     */
    private Integer instancesWithUnreportedNotApplicablePatches;

    /**
     * <p>The number of instances in the patch group.</p>
     *
     * @return <p>The number of instances in the patch group.</p>
     */
    public Integer getInstances() {
        return instances;
    }

    /**
     * <p>The number of instances in the patch group.</p>
     *
     * @param instances <p>The number of instances in the patch group.</p>
     */
    public void setInstances(Integer instances) {
        this.instances = instances;
    }

    /**
     * <p>The number of instances in the patch group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances <p>The number of instances in the patch group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchGroupStateResult withInstances(Integer instances) {
        this.instances = instances;
        return this;
    }

    /**
     * <p>The number of instances with installed patches.</p>
     *
     * @return <p>The number of instances with installed patches.</p>
     */
    public Integer getInstancesWithInstalledPatches() {
        return instancesWithInstalledPatches;
    }

    /**
     * <p>The number of instances with installed patches.</p>
     *
     * @param instancesWithInstalledPatches <p>The number of instances with installed patches.</p>
     */
    public void setInstancesWithInstalledPatches(Integer instancesWithInstalledPatches) {
        this.instancesWithInstalledPatches = instancesWithInstalledPatches;
    }

    /**
     * <p>The number of instances with installed patches.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instancesWithInstalledPatches <p>The number of instances with installed patches.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchGroupStateResult withInstancesWithInstalledPatches(Integer instancesWithInstalledPatches) {
        this.instancesWithInstalledPatches = instancesWithInstalledPatches;
        return this;
    }

    /**
     * <p>The number of instances with patches installed that aren't defined in the patch baseline.</p>
     *
     * @return <p>The number of instances with patches installed that aren't defined in the patch baseline.</p>
     */
    public Integer getInstancesWithInstalledOtherPatches() {
        return instancesWithInstalledOtherPatches;
    }

    /**
     * <p>The number of instances with patches installed that aren't defined in the patch baseline.</p>
     *
     * @param instancesWithInstalledOtherPatches <p>The number of instances with patches installed that aren't defined in the patch baseline.</p>
     */
    public void setInstancesWithInstalledOtherPatches(Integer instancesWithInstalledOtherPatches) {
        this.instancesWithInstalledOtherPatches = instancesWithInstalledOtherPatches;
    }

    /**
     * <p>The number of instances with patches installed that aren't defined in the patch baseline.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instancesWithInstalledOtherPatches <p>The number of instances with patches installed that aren't defined in the patch baseline.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchGroupStateResult withInstancesWithInstalledOtherPatches(Integer instancesWithInstalledOtherPatches) {
        this.instancesWithInstalledOtherPatches = instancesWithInstalledOtherPatches;
        return this;
    }

    /**
     * <p>The number of instances with patches installed by Patch Manager that have not been rebooted after the patch installation. The status of these instances is NON_COMPLIANT.</p>
     *
     * @return <p>The number of instances with patches installed by Patch Manager that have not been rebooted after the patch installation. The status of these instances is NON_COMPLIANT.</p>
     */
    public Integer getInstancesWithInstalledPendingRebootPatches() {
        return instancesWithInstalledPendingRebootPatches;
    }

    /**
     * <p>The number of instances with patches installed by Patch Manager that have not been rebooted after the patch installation. The status of these instances is NON_COMPLIANT.</p>
     *
     * @param instancesWithInstalledPendingRebootPatches <p>The number of instances with patches installed by Patch Manager that have not been rebooted after the patch installation. The status of these instances is NON_COMPLIANT.</p>
     */
    public void setInstancesWithInstalledPendingRebootPatches(Integer instancesWithInstalledPendingRebootPatches) {
        this.instancesWithInstalledPendingRebootPatches = instancesWithInstalledPendingRebootPatches;
    }

    /**
     * <p>The number of instances with patches installed by Patch Manager that have not been rebooted after the patch installation. The status of these instances is NON_COMPLIANT.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instancesWithInstalledPendingRebootPatches <p>The number of instances with patches installed by Patch Manager that have not been rebooted after the patch installation. The status of these instances is NON_COMPLIANT.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchGroupStateResult withInstancesWithInstalledPendingRebootPatches(Integer instancesWithInstalledPendingRebootPatches) {
        this.instancesWithInstalledPendingRebootPatches = instancesWithInstalledPendingRebootPatches;
        return this;
    }

    /**
     * <p>The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of <i>INSTALLED_REJECTED</i> were typically installed before they were added to a RejectedPatches list.</p> <note> <p>If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstancesWithInstalledRejectedPatches will always be 0 (zero).</p> </note>
     *
     * @return <p>The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of <i>INSTALLED_REJECTED</i> were typically installed before they were added to a RejectedPatches list.</p> <note> <p>If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstancesWithInstalledRejectedPatches will always be 0 (zero).</p> </note>
     */
    public Integer getInstancesWithInstalledRejectedPatches() {
        return instancesWithInstalledRejectedPatches;
    }

    /**
     * <p>The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of <i>INSTALLED_REJECTED</i> were typically installed before they were added to a RejectedPatches list.</p> <note> <p>If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstancesWithInstalledRejectedPatches will always be 0 (zero).</p> </note>
     *
     * @param instancesWithInstalledRejectedPatches <p>The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of <i>INSTALLED_REJECTED</i> were typically installed before they were added to a RejectedPatches list.</p> <note> <p>If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstancesWithInstalledRejectedPatches will always be 0 (zero).</p> </note>
     */
    public void setInstancesWithInstalledRejectedPatches(Integer instancesWithInstalledRejectedPatches) {
        this.instancesWithInstalledRejectedPatches = instancesWithInstalledRejectedPatches;
    }

    /**
     * <p>The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of <i>INSTALLED_REJECTED</i> were typically installed before they were added to a RejectedPatches list.</p> <note> <p>If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstancesWithInstalledRejectedPatches will always be 0 (zero).</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instancesWithInstalledRejectedPatches <p>The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of <i>INSTALLED_REJECTED</i> were typically installed before they were added to a RejectedPatches list.</p> <note> <p>If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstancesWithInstalledRejectedPatches will always be 0 (zero).</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchGroupStateResult withInstancesWithInstalledRejectedPatches(Integer instancesWithInstalledRejectedPatches) {
        this.instancesWithInstalledRejectedPatches = instancesWithInstalledRejectedPatches;
        return this;
    }

    /**
     * <p>The number of instances with missing patches from the patch baseline.</p>
     *
     * @return <p>The number of instances with missing patches from the patch baseline.</p>
     */
    public Integer getInstancesWithMissingPatches() {
        return instancesWithMissingPatches;
    }

    /**
     * <p>The number of instances with missing patches from the patch baseline.</p>
     *
     * @param instancesWithMissingPatches <p>The number of instances with missing patches from the patch baseline.</p>
     */
    public void setInstancesWithMissingPatches(Integer instancesWithMissingPatches) {
        this.instancesWithMissingPatches = instancesWithMissingPatches;
    }

    /**
     * <p>The number of instances with missing patches from the patch baseline.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instancesWithMissingPatches <p>The number of instances with missing patches from the patch baseline.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchGroupStateResult withInstancesWithMissingPatches(Integer instancesWithMissingPatches) {
        this.instancesWithMissingPatches = instancesWithMissingPatches;
        return this;
    }

    /**
     * <p>The number of instances with patches from the patch baseline that failed to install.</p>
     *
     * @return <p>The number of instances with patches from the patch baseline that failed to install.</p>
     */
    public Integer getInstancesWithFailedPatches() {
        return instancesWithFailedPatches;
    }

    /**
     * <p>The number of instances with patches from the patch baseline that failed to install.</p>
     *
     * @param instancesWithFailedPatches <p>The number of instances with patches from the patch baseline that failed to install.</p>
     */
    public void setInstancesWithFailedPatches(Integer instancesWithFailedPatches) {
        this.instancesWithFailedPatches = instancesWithFailedPatches;
    }

    /**
     * <p>The number of instances with patches from the patch baseline that failed to install.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instancesWithFailedPatches <p>The number of instances with patches from the patch baseline that failed to install.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchGroupStateResult withInstancesWithFailedPatches(Integer instancesWithFailedPatches) {
        this.instancesWithFailedPatches = instancesWithFailedPatches;
        return this;
    }

    /**
     * <p>The number of instances with patches that aren't applicable.</p>
     *
     * @return <p>The number of instances with patches that aren't applicable.</p>
     */
    public Integer getInstancesWithNotApplicablePatches() {
        return instancesWithNotApplicablePatches;
    }

    /**
     * <p>The number of instances with patches that aren't applicable.</p>
     *
     * @param instancesWithNotApplicablePatches <p>The number of instances with patches that aren't applicable.</p>
     */
    public void setInstancesWithNotApplicablePatches(Integer instancesWithNotApplicablePatches) {
        this.instancesWithNotApplicablePatches = instancesWithNotApplicablePatches;
    }

    /**
     * <p>The number of instances with patches that aren't applicable.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instancesWithNotApplicablePatches <p>The number of instances with patches that aren't applicable.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchGroupStateResult withInstancesWithNotApplicablePatches(Integer instancesWithNotApplicablePatches) {
        this.instancesWithNotApplicablePatches = instancesWithNotApplicablePatches;
        return this;
    }

    /**
     * <p>The number of instances with <code>NotApplicable</code> patches beyond the supported limit, which are not reported by name to Systems Manager Inventory.</p>
     *
     * @return <p>The number of instances with <code>NotApplicable</code> patches beyond the supported limit, which are not reported by name to Systems Manager Inventory.</p>
     */
    public Integer getInstancesWithUnreportedNotApplicablePatches() {
        return instancesWithUnreportedNotApplicablePatches;
    }

    /**
     * <p>The number of instances with <code>NotApplicable</code> patches beyond the supported limit, which are not reported by name to Systems Manager Inventory.</p>
     *
     * @param instancesWithUnreportedNotApplicablePatches <p>The number of instances with <code>NotApplicable</code> patches beyond the supported limit, which are not reported by name to Systems Manager Inventory.</p>
     */
    public void setInstancesWithUnreportedNotApplicablePatches(Integer instancesWithUnreportedNotApplicablePatches) {
        this.instancesWithUnreportedNotApplicablePatches = instancesWithUnreportedNotApplicablePatches;
    }

    /**
     * <p>The number of instances with <code>NotApplicable</code> patches beyond the supported limit, which are not reported by name to Systems Manager Inventory.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instancesWithUnreportedNotApplicablePatches <p>The number of instances with <code>NotApplicable</code> patches beyond the supported limit, which are not reported by name to Systems Manager Inventory.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchGroupStateResult withInstancesWithUnreportedNotApplicablePatches(Integer instancesWithUnreportedNotApplicablePatches) {
        this.instancesWithUnreportedNotApplicablePatches = instancesWithUnreportedNotApplicablePatches;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstances() != null) sb.append("Instances: " + getInstances() + ",");
        if (getInstancesWithInstalledPatches() != null) sb.append("InstancesWithInstalledPatches: " + getInstancesWithInstalledPatches() + ",");
        if (getInstancesWithInstalledOtherPatches() != null) sb.append("InstancesWithInstalledOtherPatches: " + getInstancesWithInstalledOtherPatches() + ",");
        if (getInstancesWithInstalledPendingRebootPatches() != null) sb.append("InstancesWithInstalledPendingRebootPatches: " + getInstancesWithInstalledPendingRebootPatches() + ",");
        if (getInstancesWithInstalledRejectedPatches() != null) sb.append("InstancesWithInstalledRejectedPatches: " + getInstancesWithInstalledRejectedPatches() + ",");
        if (getInstancesWithMissingPatches() != null) sb.append("InstancesWithMissingPatches: " + getInstancesWithMissingPatches() + ",");
        if (getInstancesWithFailedPatches() != null) sb.append("InstancesWithFailedPatches: " + getInstancesWithFailedPatches() + ",");
        if (getInstancesWithNotApplicablePatches() != null) sb.append("InstancesWithNotApplicablePatches: " + getInstancesWithNotApplicablePatches() + ",");
        if (getInstancesWithUnreportedNotApplicablePatches() != null) sb.append("InstancesWithUnreportedNotApplicablePatches: " + getInstancesWithUnreportedNotApplicablePatches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithInstalledPatches() == null) ? 0 : getInstancesWithInstalledPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithInstalledOtherPatches() == null) ? 0 : getInstancesWithInstalledOtherPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithInstalledPendingRebootPatches() == null) ? 0 : getInstancesWithInstalledPendingRebootPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithInstalledRejectedPatches() == null) ? 0 : getInstancesWithInstalledRejectedPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithMissingPatches() == null) ? 0 : getInstancesWithMissingPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithFailedPatches() == null) ? 0 : getInstancesWithFailedPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithNotApplicablePatches() == null) ? 0 : getInstancesWithNotApplicablePatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithUnreportedNotApplicablePatches() == null) ? 0 : getInstancesWithUnreportedNotApplicablePatches().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribePatchGroupStateResult == false) return false;
        DescribePatchGroupStateResult other = (DescribePatchGroupStateResult)obj;

        if (other.getInstances() == null ^ this.getInstances() == null) return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false) return false;
        if (other.getInstancesWithInstalledPatches() == null ^ this.getInstancesWithInstalledPatches() == null) return false;
        if (other.getInstancesWithInstalledPatches() != null && other.getInstancesWithInstalledPatches().equals(this.getInstancesWithInstalledPatches()) == false) return false;
        if (other.getInstancesWithInstalledOtherPatches() == null ^ this.getInstancesWithInstalledOtherPatches() == null) return false;
        if (other.getInstancesWithInstalledOtherPatches() != null && other.getInstancesWithInstalledOtherPatches().equals(this.getInstancesWithInstalledOtherPatches()) == false) return false;
        if (other.getInstancesWithInstalledPendingRebootPatches() == null ^ this.getInstancesWithInstalledPendingRebootPatches() == null) return false;
        if (other.getInstancesWithInstalledPendingRebootPatches() != null && other.getInstancesWithInstalledPendingRebootPatches().equals(this.getInstancesWithInstalledPendingRebootPatches()) == false) return false;
        if (other.getInstancesWithInstalledRejectedPatches() == null ^ this.getInstancesWithInstalledRejectedPatches() == null) return false;
        if (other.getInstancesWithInstalledRejectedPatches() != null && other.getInstancesWithInstalledRejectedPatches().equals(this.getInstancesWithInstalledRejectedPatches()) == false) return false;
        if (other.getInstancesWithMissingPatches() == null ^ this.getInstancesWithMissingPatches() == null) return false;
        if (other.getInstancesWithMissingPatches() != null && other.getInstancesWithMissingPatches().equals(this.getInstancesWithMissingPatches()) == false) return false;
        if (other.getInstancesWithFailedPatches() == null ^ this.getInstancesWithFailedPatches() == null) return false;
        if (other.getInstancesWithFailedPatches() != null && other.getInstancesWithFailedPatches().equals(this.getInstancesWithFailedPatches()) == false) return false;
        if (other.getInstancesWithNotApplicablePatches() == null ^ this.getInstancesWithNotApplicablePatches() == null) return false;
        if (other.getInstancesWithNotApplicablePatches() != null && other.getInstancesWithNotApplicablePatches().equals(this.getInstancesWithNotApplicablePatches()) == false) return false;
        if (other.getInstancesWithUnreportedNotApplicablePatches() == null ^ this.getInstancesWithUnreportedNotApplicablePatches() == null) return false;
        if (other.getInstancesWithUnreportedNotApplicablePatches() != null && other.getInstancesWithUnreportedNotApplicablePatches().equals(this.getInstancesWithUnreportedNotApplicablePatches()) == false) return false;
        return true;
    }
}
