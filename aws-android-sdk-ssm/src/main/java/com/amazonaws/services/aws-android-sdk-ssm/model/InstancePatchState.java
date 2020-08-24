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


/**
 * <p>Defines the high-level patch compliance state for a managed instance, providing information about the number of installed, missing, not applicable, and failed patches along with metadata about the operation when this information was gathered for the instance.</p>
 */
public class InstancePatchState implements Serializable {
    /**
     * <p>The ID of the managed instance the high-level patch compliance information was collected for.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>The name of the patch group the managed instance belongs to.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String patchGroup;

    /**
     * <p>The ID of the patch baseline used to patch the instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     */
    private String baselineId;

    /**
     * <p>The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$<br/>
     */
    private String snapshotId;

    /**
     * <p>An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list, which you maintain in an S3 bucket in YAML format and specify in the SSM document <code>AWS-RunPatchBaseline</code>, overrides the patches specified by the default patch baseline.</p> <p>For more information about the <code>InstallOverrideList</code> parameter, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-about-aws-runpatchbaseline.html">About the SSM document AWS-RunPatchBaseline</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^https://.+$|^s3://([^/]+)/(.*?([^/]+))$<br/>
     */
    private String installOverrideList;

    /**
     * <p>Placeholder information. This field will always be empty in the current release of the service.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String ownerInformation;

    /**
     * <p>The number of patches from the patch baseline that are installed on the instance.</p>
     */
    private Integer installedCount;

    /**
     * <p>The number of patches not specified in the patch baseline that are installed on the instance.</p>
     */
    private Integer installedOtherCount;

    /**
     * <p>The number of patches installed by Patch Manager since the last time the instance was rebooted.</p>
     */
    private Integer installedPendingRebootCount;

    /**
     * <p>The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of <i>InstalledRejected</i> were typically installed before they were added to a RejectedPatches list.</p> <note> <p>If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstalledRejectedCount will always be 0 (zero).</p> </note>
     */
    private Integer installedRejectedCount;

    /**
     * <p>The number of patches from the patch baseline that are applicable for the instance but aren't currently installed.</p>
     */
    private Integer missingCount;

    /**
     * <p>The number of patches from the patch baseline that were attempted to be installed during the last patching operation, but failed to install.</p>
     */
    private Integer failedCount;

    /**
     * <p>The number of patches beyond the supported limit of <code>NotApplicableCount</code> that are not reported by name to Systems Manager Inventory.</p>
     */
    private Integer unreportedNotApplicableCount;

    /**
     * <p>The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't installed on the instance. This number may be truncated if the list of patch names is very large. The number of patches beyond this limit are reported in <code>UnreportedNotApplicableCount</code>.</p>
     */
    private Integer notApplicableCount;

    /**
     * <p>The time the most recent patching operation was started on the instance.</p>
     */
    private java.util.Date operationStartTime;

    /**
     * <p>The time the most recent patching operation completed on the instance.</p>
     */
    private java.util.Date operationEndTime;

    /**
     * <p>The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scan, Install
     */
    private String operation;

    /**
     * <p>The time of the last attempt to patch the instance with <code>NoReboot</code> specified as the reboot option.</p>
     */
    private java.util.Date lastNoRebootInstallOperationTime;

    /**
     * <p>Indicates the reboot option specified in the patch baseline.</p> <note> <p>Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager <code>Scan</code> operations.</p> </note> <ul> <li> <p> <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches are detected with a status of <code>InstalledPendingReboot</code>.</p> </li> <li> <p> <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not be in effect until a reboot is performed.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RebootIfNeeded, NoReboot
     */
    private String rebootOption;

    /**
     * <p>The ID of the managed instance the high-level patch compliance information was collected for.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>The ID of the managed instance the high-level patch compliance information was collected for.</p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>The ID of the managed instance the high-level patch compliance information was collected for.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>The ID of the managed instance the high-level patch compliance information was collected for.</p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>The ID of the managed instance the high-level patch compliance information was collected for.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>The ID of the managed instance the high-level patch compliance information was collected for.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>The name of the patch group the managed instance belongs to.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>The name of the patch group the managed instance belongs to.</p>
     */
    public String getPatchGroup() {
        return patchGroup;
    }

    /**
     * <p>The name of the patch group the managed instance belongs to.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param patchGroup <p>The name of the patch group the managed instance belongs to.</p>
     */
    public void setPatchGroup(String patchGroup) {
        this.patchGroup = patchGroup;
    }

    /**
     * <p>The name of the patch group the managed instance belongs to.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param patchGroup <p>The name of the patch group the managed instance belongs to.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withPatchGroup(String patchGroup) {
        this.patchGroup = patchGroup;
        return this;
    }

    /**
     * <p>The ID of the patch baseline used to patch the instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     *
     * @return <p>The ID of the patch baseline used to patch the instance.</p>
     */
    public String getBaselineId() {
        return baselineId;
    }

    /**
     * <p>The ID of the patch baseline used to patch the instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     *
     * @param baselineId <p>The ID of the patch baseline used to patch the instance.</p>
     */
    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    /**
     * <p>The ID of the patch baseline used to patch the instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     *
     * @param baselineId <p>The ID of the patch baseline used to patch the instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }

    /**
     * <p>The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.</p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$<br/>
     *
     * @param snapshotId <p>The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.</p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$<br/>
     *
     * @param snapshotId <p>The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list, which you maintain in an S3 bucket in YAML format and specify in the SSM document <code>AWS-RunPatchBaseline</code>, overrides the patches specified by the default patch baseline.</p> <p>For more information about the <code>InstallOverrideList</code> parameter, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-about-aws-runpatchbaseline.html">About the SSM document AWS-RunPatchBaseline</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^https://.+$|^s3://([^/]+)/(.*?([^/]+))$<br/>
     *
     * @return <p>An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list, which you maintain in an S3 bucket in YAML format and specify in the SSM document <code>AWS-RunPatchBaseline</code>, overrides the patches specified by the default patch baseline.</p> <p>For more information about the <code>InstallOverrideList</code> parameter, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-about-aws-runpatchbaseline.html">About the SSM document AWS-RunPatchBaseline</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    public String getInstallOverrideList() {
        return installOverrideList;
    }

    /**
     * <p>An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list, which you maintain in an S3 bucket in YAML format and specify in the SSM document <code>AWS-RunPatchBaseline</code>, overrides the patches specified by the default patch baseline.</p> <p>For more information about the <code>InstallOverrideList</code> parameter, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-about-aws-runpatchbaseline.html">About the SSM document AWS-RunPatchBaseline</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^https://.+$|^s3://([^/]+)/(.*?([^/]+))$<br/>
     *
     * @param installOverrideList <p>An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list, which you maintain in an S3 bucket in YAML format and specify in the SSM document <code>AWS-RunPatchBaseline</code>, overrides the patches specified by the default patch baseline.</p> <p>For more information about the <code>InstallOverrideList</code> parameter, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-about-aws-runpatchbaseline.html">About the SSM document AWS-RunPatchBaseline</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    public void setInstallOverrideList(String installOverrideList) {
        this.installOverrideList = installOverrideList;
    }

    /**
     * <p>An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list, which you maintain in an S3 bucket in YAML format and specify in the SSM document <code>AWS-RunPatchBaseline</code>, overrides the patches specified by the default patch baseline.</p> <p>For more information about the <code>InstallOverrideList</code> parameter, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-about-aws-runpatchbaseline.html">About the SSM document AWS-RunPatchBaseline</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^https://.+$|^s3://([^/]+)/(.*?([^/]+))$<br/>
     *
     * @param installOverrideList <p>An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list, which you maintain in an S3 bucket in YAML format and specify in the SSM document <code>AWS-RunPatchBaseline</code>, overrides the patches specified by the default patch baseline.</p> <p>For more information about the <code>InstallOverrideList</code> parameter, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-about-aws-runpatchbaseline.html">About the SSM document AWS-RunPatchBaseline</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withInstallOverrideList(String installOverrideList) {
        this.installOverrideList = installOverrideList;
        return this;
    }

    /**
     * <p>Placeholder information. This field will always be empty in the current release of the service.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>Placeholder information. This field will always be empty in the current release of the service.</p>
     */
    public String getOwnerInformation() {
        return ownerInformation;
    }

    /**
     * <p>Placeholder information. This field will always be empty in the current release of the service.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param ownerInformation <p>Placeholder information. This field will always be empty in the current release of the service.</p>
     */
    public void setOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
    }

    /**
     * <p>Placeholder information. This field will always be empty in the current release of the service.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param ownerInformation <p>Placeholder information. This field will always be empty in the current release of the service.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
        return this;
    }

    /**
     * <p>The number of patches from the patch baseline that are installed on the instance.</p>
     *
     * @return <p>The number of patches from the patch baseline that are installed on the instance.</p>
     */
    public Integer getInstalledCount() {
        return installedCount;
    }

    /**
     * <p>The number of patches from the patch baseline that are installed on the instance.</p>
     *
     * @param installedCount <p>The number of patches from the patch baseline that are installed on the instance.</p>
     */
    public void setInstalledCount(Integer installedCount) {
        this.installedCount = installedCount;
    }

    /**
     * <p>The number of patches from the patch baseline that are installed on the instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param installedCount <p>The number of patches from the patch baseline that are installed on the instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withInstalledCount(Integer installedCount) {
        this.installedCount = installedCount;
        return this;
    }

    /**
     * <p>The number of patches not specified in the patch baseline that are installed on the instance.</p>
     *
     * @return <p>The number of patches not specified in the patch baseline that are installed on the instance.</p>
     */
    public Integer getInstalledOtherCount() {
        return installedOtherCount;
    }

    /**
     * <p>The number of patches not specified in the patch baseline that are installed on the instance.</p>
     *
     * @param installedOtherCount <p>The number of patches not specified in the patch baseline that are installed on the instance.</p>
     */
    public void setInstalledOtherCount(Integer installedOtherCount) {
        this.installedOtherCount = installedOtherCount;
    }

    /**
     * <p>The number of patches not specified in the patch baseline that are installed on the instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param installedOtherCount <p>The number of patches not specified in the patch baseline that are installed on the instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withInstalledOtherCount(Integer installedOtherCount) {
        this.installedOtherCount = installedOtherCount;
        return this;
    }

    /**
     * <p>The number of patches installed by Patch Manager since the last time the instance was rebooted.</p>
     *
     * @return <p>The number of patches installed by Patch Manager since the last time the instance was rebooted.</p>
     */
    public Integer getInstalledPendingRebootCount() {
        return installedPendingRebootCount;
    }

    /**
     * <p>The number of patches installed by Patch Manager since the last time the instance was rebooted.</p>
     *
     * @param installedPendingRebootCount <p>The number of patches installed by Patch Manager since the last time the instance was rebooted.</p>
     */
    public void setInstalledPendingRebootCount(Integer installedPendingRebootCount) {
        this.installedPendingRebootCount = installedPendingRebootCount;
    }

    /**
     * <p>The number of patches installed by Patch Manager since the last time the instance was rebooted.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param installedPendingRebootCount <p>The number of patches installed by Patch Manager since the last time the instance was rebooted.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withInstalledPendingRebootCount(Integer installedPendingRebootCount) {
        this.installedPendingRebootCount = installedPendingRebootCount;
        return this;
    }

    /**
     * <p>The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of <i>InstalledRejected</i> were typically installed before they were added to a RejectedPatches list.</p> <note> <p>If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstalledRejectedCount will always be 0 (zero).</p> </note>
     *
     * @return <p>The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of <i>InstalledRejected</i> were typically installed before they were added to a RejectedPatches list.</p> <note> <p>If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstalledRejectedCount will always be 0 (zero).</p> </note>
     */
    public Integer getInstalledRejectedCount() {
        return installedRejectedCount;
    }

    /**
     * <p>The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of <i>InstalledRejected</i> were typically installed before they were added to a RejectedPatches list.</p> <note> <p>If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstalledRejectedCount will always be 0 (zero).</p> </note>
     *
     * @param installedRejectedCount <p>The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of <i>InstalledRejected</i> were typically installed before they were added to a RejectedPatches list.</p> <note> <p>If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstalledRejectedCount will always be 0 (zero).</p> </note>
     */
    public void setInstalledRejectedCount(Integer installedRejectedCount) {
        this.installedRejectedCount = installedRejectedCount;
    }

    /**
     * <p>The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of <i>InstalledRejected</i> were typically installed before they were added to a RejectedPatches list.</p> <note> <p>If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstalledRejectedCount will always be 0 (zero).</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param installedRejectedCount <p>The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of <i>InstalledRejected</i> were typically installed before they were added to a RejectedPatches list.</p> <note> <p>If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstalledRejectedCount will always be 0 (zero).</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withInstalledRejectedCount(Integer installedRejectedCount) {
        this.installedRejectedCount = installedRejectedCount;
        return this;
    }

    /**
     * <p>The number of patches from the patch baseline that are applicable for the instance but aren't currently installed.</p>
     *
     * @return <p>The number of patches from the patch baseline that are applicable for the instance but aren't currently installed.</p>
     */
    public Integer getMissingCount() {
        return missingCount;
    }

    /**
     * <p>The number of patches from the patch baseline that are applicable for the instance but aren't currently installed.</p>
     *
     * @param missingCount <p>The number of patches from the patch baseline that are applicable for the instance but aren't currently installed.</p>
     */
    public void setMissingCount(Integer missingCount) {
        this.missingCount = missingCount;
    }

    /**
     * <p>The number of patches from the patch baseline that are applicable for the instance but aren't currently installed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param missingCount <p>The number of patches from the patch baseline that are applicable for the instance but aren't currently installed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withMissingCount(Integer missingCount) {
        this.missingCount = missingCount;
        return this;
    }

    /**
     * <p>The number of patches from the patch baseline that were attempted to be installed during the last patching operation, but failed to install.</p>
     *
     * @return <p>The number of patches from the patch baseline that were attempted to be installed during the last patching operation, but failed to install.</p>
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    /**
     * <p>The number of patches from the patch baseline that were attempted to be installed during the last patching operation, but failed to install.</p>
     *
     * @param failedCount <p>The number of patches from the patch baseline that were attempted to be installed during the last patching operation, but failed to install.</p>
     */
    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    /**
     * <p>The number of patches from the patch baseline that were attempted to be installed during the last patching operation, but failed to install.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failedCount <p>The number of patches from the patch baseline that were attempted to be installed during the last patching operation, but failed to install.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * <p>The number of patches beyond the supported limit of <code>NotApplicableCount</code> that are not reported by name to Systems Manager Inventory.</p>
     *
     * @return <p>The number of patches beyond the supported limit of <code>NotApplicableCount</code> that are not reported by name to Systems Manager Inventory.</p>
     */
    public Integer getUnreportedNotApplicableCount() {
        return unreportedNotApplicableCount;
    }

    /**
     * <p>The number of patches beyond the supported limit of <code>NotApplicableCount</code> that are not reported by name to Systems Manager Inventory.</p>
     *
     * @param unreportedNotApplicableCount <p>The number of patches beyond the supported limit of <code>NotApplicableCount</code> that are not reported by name to Systems Manager Inventory.</p>
     */
    public void setUnreportedNotApplicableCount(Integer unreportedNotApplicableCount) {
        this.unreportedNotApplicableCount = unreportedNotApplicableCount;
    }

    /**
     * <p>The number of patches beyond the supported limit of <code>NotApplicableCount</code> that are not reported by name to Systems Manager Inventory.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param unreportedNotApplicableCount <p>The number of patches beyond the supported limit of <code>NotApplicableCount</code> that are not reported by name to Systems Manager Inventory.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withUnreportedNotApplicableCount(Integer unreportedNotApplicableCount) {
        this.unreportedNotApplicableCount = unreportedNotApplicableCount;
        return this;
    }

    /**
     * <p>The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't installed on the instance. This number may be truncated if the list of patch names is very large. The number of patches beyond this limit are reported in <code>UnreportedNotApplicableCount</code>.</p>
     *
     * @return <p>The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't installed on the instance. This number may be truncated if the list of patch names is very large. The number of patches beyond this limit are reported in <code>UnreportedNotApplicableCount</code>.</p>
     */
    public Integer getNotApplicableCount() {
        return notApplicableCount;
    }

    /**
     * <p>The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't installed on the instance. This number may be truncated if the list of patch names is very large. The number of patches beyond this limit are reported in <code>UnreportedNotApplicableCount</code>.</p>
     *
     * @param notApplicableCount <p>The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't installed on the instance. This number may be truncated if the list of patch names is very large. The number of patches beyond this limit are reported in <code>UnreportedNotApplicableCount</code>.</p>
     */
    public void setNotApplicableCount(Integer notApplicableCount) {
        this.notApplicableCount = notApplicableCount;
    }

    /**
     * <p>The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't installed on the instance. This number may be truncated if the list of patch names is very large. The number of patches beyond this limit are reported in <code>UnreportedNotApplicableCount</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notApplicableCount <p>The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't installed on the instance. This number may be truncated if the list of patch names is very large. The number of patches beyond this limit are reported in <code>UnreportedNotApplicableCount</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withNotApplicableCount(Integer notApplicableCount) {
        this.notApplicableCount = notApplicableCount;
        return this;
    }

    /**
     * <p>The time the most recent patching operation was started on the instance.</p>
     *
     * @return <p>The time the most recent patching operation was started on the instance.</p>
     */
    public java.util.Date getOperationStartTime() {
        return operationStartTime;
    }

    /**
     * <p>The time the most recent patching operation was started on the instance.</p>
     *
     * @param operationStartTime <p>The time the most recent patching operation was started on the instance.</p>
     */
    public void setOperationStartTime(java.util.Date operationStartTime) {
        this.operationStartTime = operationStartTime;
    }

    /**
     * <p>The time the most recent patching operation was started on the instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operationStartTime <p>The time the most recent patching operation was started on the instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withOperationStartTime(java.util.Date operationStartTime) {
        this.operationStartTime = operationStartTime;
        return this;
    }

    /**
     * <p>The time the most recent patching operation completed on the instance.</p>
     *
     * @return <p>The time the most recent patching operation completed on the instance.</p>
     */
    public java.util.Date getOperationEndTime() {
        return operationEndTime;
    }

    /**
     * <p>The time the most recent patching operation completed on the instance.</p>
     *
     * @param operationEndTime <p>The time the most recent patching operation completed on the instance.</p>
     */
    public void setOperationEndTime(java.util.Date operationEndTime) {
        this.operationEndTime = operationEndTime;
    }

    /**
     * <p>The time the most recent patching operation completed on the instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operationEndTime <p>The time the most recent patching operation completed on the instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withOperationEndTime(java.util.Date operationEndTime) {
        this.operationEndTime = operationEndTime;
        return this;
    }

    /**
     * <p>The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scan, Install
     *
     * @return <p>The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).</p>
     *
     * @see PatchOperationType
     */
    public String getOperation() {
        return operation;
    }

    /**
     * <p>The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scan, Install
     *
     * @param operation <p>The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).</p>
     *
     * @see PatchOperationType
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scan, Install
     *
     * @param operation <p>The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PatchOperationType
     */
    public InstancePatchState withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * <p>The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scan, Install
     *
     * @param operation <p>The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).</p>
     *
     * @see PatchOperationType
     */
    public void setOperation(PatchOperationType operation) {
        this.operation = operation.toString();
    }

    /**
     * <p>The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scan, Install
     *
     * @param operation <p>The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PatchOperationType
     */
    public InstancePatchState withOperation(PatchOperationType operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>The time of the last attempt to patch the instance with <code>NoReboot</code> specified as the reboot option.</p>
     *
     * @return <p>The time of the last attempt to patch the instance with <code>NoReboot</code> specified as the reboot option.</p>
     */
    public java.util.Date getLastNoRebootInstallOperationTime() {
        return lastNoRebootInstallOperationTime;
    }

    /**
     * <p>The time of the last attempt to patch the instance with <code>NoReboot</code> specified as the reboot option.</p>
     *
     * @param lastNoRebootInstallOperationTime <p>The time of the last attempt to patch the instance with <code>NoReboot</code> specified as the reboot option.</p>
     */
    public void setLastNoRebootInstallOperationTime(java.util.Date lastNoRebootInstallOperationTime) {
        this.lastNoRebootInstallOperationTime = lastNoRebootInstallOperationTime;
    }

    /**
     * <p>The time of the last attempt to patch the instance with <code>NoReboot</code> specified as the reboot option.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastNoRebootInstallOperationTime <p>The time of the last attempt to patch the instance with <code>NoReboot</code> specified as the reboot option.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchState withLastNoRebootInstallOperationTime(java.util.Date lastNoRebootInstallOperationTime) {
        this.lastNoRebootInstallOperationTime = lastNoRebootInstallOperationTime;
        return this;
    }

    /**
     * <p>Indicates the reboot option specified in the patch baseline.</p> <note> <p>Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager <code>Scan</code> operations.</p> </note> <ul> <li> <p> <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches are detected with a status of <code>InstalledPendingReboot</code>.</p> </li> <li> <p> <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not be in effect until a reboot is performed.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RebootIfNeeded, NoReboot
     *
     * @return <p>Indicates the reboot option specified in the patch baseline.</p> <note> <p>Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager <code>Scan</code> operations.</p> </note> <ul> <li> <p> <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches are detected with a status of <code>InstalledPendingReboot</code>.</p> </li> <li> <p> <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not be in effect until a reboot is performed.</p> </li> </ul>
     *
     * @see RebootOption
     */
    public String getRebootOption() {
        return rebootOption;
    }

    /**
     * <p>Indicates the reboot option specified in the patch baseline.</p> <note> <p>Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager <code>Scan</code> operations.</p> </note> <ul> <li> <p> <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches are detected with a status of <code>InstalledPendingReboot</code>.</p> </li> <li> <p> <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not be in effect until a reboot is performed.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RebootIfNeeded, NoReboot
     *
     * @param rebootOption <p>Indicates the reboot option specified in the patch baseline.</p> <note> <p>Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager <code>Scan</code> operations.</p> </note> <ul> <li> <p> <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches are detected with a status of <code>InstalledPendingReboot</code>.</p> </li> <li> <p> <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not be in effect until a reboot is performed.</p> </li> </ul>
     *
     * @see RebootOption
     */
    public void setRebootOption(String rebootOption) {
        this.rebootOption = rebootOption;
    }

    /**
     * <p>Indicates the reboot option specified in the patch baseline.</p> <note> <p>Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager <code>Scan</code> operations.</p> </note> <ul> <li> <p> <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches are detected with a status of <code>InstalledPendingReboot</code>.</p> </li> <li> <p> <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not be in effect until a reboot is performed.</p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RebootIfNeeded, NoReboot
     *
     * @param rebootOption <p>Indicates the reboot option specified in the patch baseline.</p> <note> <p>Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager <code>Scan</code> operations.</p> </note> <ul> <li> <p> <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches are detected with a status of <code>InstalledPendingReboot</code>.</p> </li> <li> <p> <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not be in effect until a reboot is performed.</p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see RebootOption
     */
    public InstancePatchState withRebootOption(String rebootOption) {
        this.rebootOption = rebootOption;
        return this;
    }

    /**
     * <p>Indicates the reboot option specified in the patch baseline.</p> <note> <p>Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager <code>Scan</code> operations.</p> </note> <ul> <li> <p> <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches are detected with a status of <code>InstalledPendingReboot</code>.</p> </li> <li> <p> <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not be in effect until a reboot is performed.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RebootIfNeeded, NoReboot
     *
     * @param rebootOption <p>Indicates the reboot option specified in the patch baseline.</p> <note> <p>Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager <code>Scan</code> operations.</p> </note> <ul> <li> <p> <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches are detected with a status of <code>InstalledPendingReboot</code>.</p> </li> <li> <p> <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not be in effect until a reboot is performed.</p> </li> </ul>
     *
     * @see RebootOption
     */
    public void setRebootOption(RebootOption rebootOption) {
        this.rebootOption = rebootOption.toString();
    }

    /**
     * <p>Indicates the reboot option specified in the patch baseline.</p> <note> <p>Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager <code>Scan</code> operations.</p> </note> <ul> <li> <p> <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches are detected with a status of <code>InstalledPendingReboot</code>.</p> </li> <li> <p> <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not be in effect until a reboot is performed.</p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RebootIfNeeded, NoReboot
     *
     * @param rebootOption <p>Indicates the reboot option specified in the patch baseline.</p> <note> <p>Reboot options apply to <code>Install</code> operations only. Reboots are not attempted for Patch Manager <code>Scan</code> operations.</p> </note> <ul> <li> <p> <b>RebootIfNeeded</b>: Patch Manager tries to reboot the instance if it installed any patches, or if any patches are detected with a status of <code>InstalledPendingReboot</code>.</p> </li> <li> <p> <b>NoReboot</b>: Patch Manager attempts to install missing packages without trying to reboot the system. Patches installed with this option are assigned a status of <code>InstalledPendingReboot</code>. These patches might not be in effect until a reboot is performed.</p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see RebootOption
     */
    public InstancePatchState withRebootOption(RebootOption rebootOption) {
        this.rebootOption = rebootOption.toString();
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getPatchGroup() != null) sb.append("PatchGroup: " + getPatchGroup() + ",");
        if (getBaselineId() != null) sb.append("BaselineId: " + getBaselineId() + ",");
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getInstallOverrideList() != null) sb.append("InstallOverrideList: " + getInstallOverrideList() + ",");
        if (getOwnerInformation() != null) sb.append("OwnerInformation: " + getOwnerInformation() + ",");
        if (getInstalledCount() != null) sb.append("InstalledCount: " + getInstalledCount() + ",");
        if (getInstalledOtherCount() != null) sb.append("InstalledOtherCount: " + getInstalledOtherCount() + ",");
        if (getInstalledPendingRebootCount() != null) sb.append("InstalledPendingRebootCount: " + getInstalledPendingRebootCount() + ",");
        if (getInstalledRejectedCount() != null) sb.append("InstalledRejectedCount: " + getInstalledRejectedCount() + ",");
        if (getMissingCount() != null) sb.append("MissingCount: " + getMissingCount() + ",");
        if (getFailedCount() != null) sb.append("FailedCount: " + getFailedCount() + ",");
        if (getUnreportedNotApplicableCount() != null) sb.append("UnreportedNotApplicableCount: " + getUnreportedNotApplicableCount() + ",");
        if (getNotApplicableCount() != null) sb.append("NotApplicableCount: " + getNotApplicableCount() + ",");
        if (getOperationStartTime() != null) sb.append("OperationStartTime: " + getOperationStartTime() + ",");
        if (getOperationEndTime() != null) sb.append("OperationEndTime: " + getOperationEndTime() + ",");
        if (getOperation() != null) sb.append("Operation: " + getOperation() + ",");
        if (getLastNoRebootInstallOperationTime() != null) sb.append("LastNoRebootInstallOperationTime: " + getLastNoRebootInstallOperationTime() + ",");
        if (getRebootOption() != null) sb.append("RebootOption: " + getRebootOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPatchGroup() == null) ? 0 : getPatchGroup().hashCode());
        hashCode = prime * hashCode + ((getBaselineId() == null) ? 0 : getBaselineId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getInstallOverrideList() == null) ? 0 : getInstallOverrideList().hashCode());
        hashCode = prime * hashCode + ((getOwnerInformation() == null) ? 0 : getOwnerInformation().hashCode());
        hashCode = prime * hashCode + ((getInstalledCount() == null) ? 0 : getInstalledCount().hashCode());
        hashCode = prime * hashCode + ((getInstalledOtherCount() == null) ? 0 : getInstalledOtherCount().hashCode());
        hashCode = prime * hashCode + ((getInstalledPendingRebootCount() == null) ? 0 : getInstalledPendingRebootCount().hashCode());
        hashCode = prime * hashCode + ((getInstalledRejectedCount() == null) ? 0 : getInstalledRejectedCount().hashCode());
        hashCode = prime * hashCode + ((getMissingCount() == null) ? 0 : getMissingCount().hashCode());
        hashCode = prime * hashCode + ((getFailedCount() == null) ? 0 : getFailedCount().hashCode());
        hashCode = prime * hashCode + ((getUnreportedNotApplicableCount() == null) ? 0 : getUnreportedNotApplicableCount().hashCode());
        hashCode = prime * hashCode + ((getNotApplicableCount() == null) ? 0 : getNotApplicableCount().hashCode());
        hashCode = prime * hashCode + ((getOperationStartTime() == null) ? 0 : getOperationStartTime().hashCode());
        hashCode = prime * hashCode + ((getOperationEndTime() == null) ? 0 : getOperationEndTime().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getLastNoRebootInstallOperationTime() == null) ? 0 : getLastNoRebootInstallOperationTime().hashCode());
        hashCode = prime * hashCode + ((getRebootOption() == null) ? 0 : getRebootOption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstancePatchState == false) return false;
        InstancePatchState other = (InstancePatchState)obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false;
        if (other.getPatchGroup() == null ^ this.getPatchGroup() == null) return false;
        if (other.getPatchGroup() != null && other.getPatchGroup().equals(this.getPatchGroup()) == false) return false;
        if (other.getBaselineId() == null ^ this.getBaselineId() == null) return false;
        if (other.getBaselineId() != null && other.getBaselineId().equals(this.getBaselineId()) == false) return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false;
        if (other.getInstallOverrideList() == null ^ this.getInstallOverrideList() == null) return false;
        if (other.getInstallOverrideList() != null && other.getInstallOverrideList().equals(this.getInstallOverrideList()) == false) return false;
        if (other.getOwnerInformation() == null ^ this.getOwnerInformation() == null) return false;
        if (other.getOwnerInformation() != null && other.getOwnerInformation().equals(this.getOwnerInformation()) == false) return false;
        if (other.getInstalledCount() == null ^ this.getInstalledCount() == null) return false;
        if (other.getInstalledCount() != null && other.getInstalledCount().equals(this.getInstalledCount()) == false) return false;
        if (other.getInstalledOtherCount() == null ^ this.getInstalledOtherCount() == null) return false;
        if (other.getInstalledOtherCount() != null && other.getInstalledOtherCount().equals(this.getInstalledOtherCount()) == false) return false;
        if (other.getInstalledPendingRebootCount() == null ^ this.getInstalledPendingRebootCount() == null) return false;
        if (other.getInstalledPendingRebootCount() != null && other.getInstalledPendingRebootCount().equals(this.getInstalledPendingRebootCount()) == false) return false;
        if (other.getInstalledRejectedCount() == null ^ this.getInstalledRejectedCount() == null) return false;
        if (other.getInstalledRejectedCount() != null && other.getInstalledRejectedCount().equals(this.getInstalledRejectedCount()) == false) return false;
        if (other.getMissingCount() == null ^ this.getMissingCount() == null) return false;
        if (other.getMissingCount() != null && other.getMissingCount().equals(this.getMissingCount()) == false) return false;
        if (other.getFailedCount() == null ^ this.getFailedCount() == null) return false;
        if (other.getFailedCount() != null && other.getFailedCount().equals(this.getFailedCount()) == false) return false;
        if (other.getUnreportedNotApplicableCount() == null ^ this.getUnreportedNotApplicableCount() == null) return false;
        if (other.getUnreportedNotApplicableCount() != null && other.getUnreportedNotApplicableCount().equals(this.getUnreportedNotApplicableCount()) == false) return false;
        if (other.getNotApplicableCount() == null ^ this.getNotApplicableCount() == null) return false;
        if (other.getNotApplicableCount() != null && other.getNotApplicableCount().equals(this.getNotApplicableCount()) == false) return false;
        if (other.getOperationStartTime() == null ^ this.getOperationStartTime() == null) return false;
        if (other.getOperationStartTime() != null && other.getOperationStartTime().equals(this.getOperationStartTime()) == false) return false;
        if (other.getOperationEndTime() == null ^ this.getOperationEndTime() == null) return false;
        if (other.getOperationEndTime() != null && other.getOperationEndTime().equals(this.getOperationEndTime()) == false) return false;
        if (other.getOperation() == null ^ this.getOperation() == null) return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false) return false;
        if (other.getLastNoRebootInstallOperationTime() == null ^ this.getLastNoRebootInstallOperationTime() == null) return false;
        if (other.getLastNoRebootInstallOperationTime() != null && other.getLastNoRebootInstallOperationTime().equals(this.getLastNoRebootInstallOperationTime()) == false) return false;
        if (other.getRebootOption() == null ^ this.getRebootOption() == null) return false;
        if (other.getRebootOption() != null && other.getRebootOption().equals(this.getRebootOption()) == false) return false;
        return true;
    }
}
