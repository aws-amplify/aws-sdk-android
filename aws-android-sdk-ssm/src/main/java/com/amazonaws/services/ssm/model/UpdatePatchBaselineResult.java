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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class UpdatePatchBaselineResult implements Serializable {
    /**
     * <p>
     * The ID of the deleted patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     */
    private String baselineId;

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * The operating system rule used by the updated patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     */
    private String operatingSystem;

    /**
     * <p>
     * A set of global filters used to exclude patches from the baseline.
     * </p>
     */
    private PatchFilterGroup globalFilters;

    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     */
    private PatchRuleGroup approvalRules;

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     */
    private java.util.List<String> approvedPatches;

    /**
     * <p>
     * The compliance severity level assigned to the patch baseline after the
     * update completed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     */
    private String approvedPatchesComplianceLevel;

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security
     * updates that should be applied to the instances. The default value is
     * 'false'. Applies to Linux instances only.
     * </p>
     */
    private Boolean approvedPatchesEnableNonSecurity;

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     */
    private java.util.List<String> rejectedPatches;

    /**
     * <p>
     * The action specified to take on patches included in the RejectedPatches
     * list. A patch can be allowed only if it is a dependency of another
     * package, or blocked entirely along with packages that include it as a
     * dependency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_AS_DEPENDENCY, BLOCK
     */
    private String rejectedPatchesAction;

    /**
     * <p>
     * The date when the patch baseline was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The date when the patch baseline was last modified.
     * </p>
     */
    private java.util.Date modifiedDate;

    /**
     * <p>
     * A description of the Patch Baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * Information about the patches to use to update the instances, including
     * target operating systems and source repositories. Applies to Linux
     * instances only.
     * </p>
     */
    private java.util.List<PatchSource> sources;

    /**
     * <p>
     * The ID of the deleted patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     *
     * @return <p>
     *         The ID of the deleted patch baseline.
     *         </p>
     */
    public String getBaselineId() {
        return baselineId;
    }

    /**
     * <p>
     * The ID of the deleted patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     *
     * @param baselineId <p>
     *            The ID of the deleted patch baseline.
     *            </p>
     */
    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    /**
     * <p>
     * The ID of the deleted patch baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     *
     * @param baselineId <p>
     *            The ID of the deleted patch baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePatchBaselineResult withBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the patch baseline.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the patch baseline.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the patch baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePatchBaselineResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The operating system rule used by the updated patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @return <p>
     *         The operating system rule used by the updated patch baseline.
     *         </p>
     * @see OperatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * <p>
     * The operating system rule used by the updated patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>
     *            The operating system rule used by the updated patch baseline.
     *            </p>
     * @see OperatingSystem
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The operating system rule used by the updated patch baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>
     *            The operating system rule used by the updated patch baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperatingSystem
     */
    public UpdatePatchBaselineResult withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * <p>
     * The operating system rule used by the updated patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>
     *            The operating system rule used by the updated patch baseline.
     *            </p>
     * @see OperatingSystem
     */
    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
    }

    /**
     * <p>
     * The operating system rule used by the updated patch baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>
     *            The operating system rule used by the updated patch baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperatingSystem
     */
    public UpdatePatchBaselineResult withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>
     * A set of global filters used to exclude patches from the baseline.
     * </p>
     *
     * @return <p>
     *         A set of global filters used to exclude patches from the
     *         baseline.
     *         </p>
     */
    public PatchFilterGroup getGlobalFilters() {
        return globalFilters;
    }

    /**
     * <p>
     * A set of global filters used to exclude patches from the baseline.
     * </p>
     *
     * @param globalFilters <p>
     *            A set of global filters used to exclude patches from the
     *            baseline.
     *            </p>
     */
    public void setGlobalFilters(PatchFilterGroup globalFilters) {
        this.globalFilters = globalFilters;
    }

    /**
     * <p>
     * A set of global filters used to exclude patches from the baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalFilters <p>
     *            A set of global filters used to exclude patches from the
     *            baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePatchBaselineResult withGlobalFilters(PatchFilterGroup globalFilters) {
        this.globalFilters = globalFilters;
        return this;
    }

    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     *
     * @return <p>
     *         A set of rules used to include patches in the baseline.
     *         </p>
     */
    public PatchRuleGroup getApprovalRules() {
        return approvalRules;
    }

    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     *
     * @param approvalRules <p>
     *            A set of rules used to include patches in the baseline.
     *            </p>
     */
    public void setApprovalRules(PatchRuleGroup approvalRules) {
        this.approvalRules = approvalRules;
    }

    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRules <p>
     *            A set of rules used to include patches in the baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePatchBaselineResult withApprovalRules(PatchRuleGroup approvalRules) {
        this.approvalRules = approvalRules;
        return this;
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     *
     * @return <p>
     *         A list of explicitly approved patches for the baseline.
     *         </p>
     */
    public java.util.List<String> getApprovedPatches() {
        return approvedPatches;
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     *
     * @param approvedPatches <p>
     *            A list of explicitly approved patches for the baseline.
     *            </p>
     */
    public void setApprovedPatches(java.util.Collection<String> approvedPatches) {
        if (approvedPatches == null) {
            this.approvedPatches = null;
            return;
        }

        this.approvedPatches = new java.util.ArrayList<String>(approvedPatches);
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvedPatches <p>
     *            A list of explicitly approved patches for the baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePatchBaselineResult withApprovedPatches(String... approvedPatches) {
        if (getApprovedPatches() == null) {
            this.approvedPatches = new java.util.ArrayList<String>(approvedPatches.length);
        }
        for (String value : approvedPatches) {
            this.approvedPatches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvedPatches <p>
     *            A list of explicitly approved patches for the baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePatchBaselineResult withApprovedPatches(
            java.util.Collection<String> approvedPatches) {
        setApprovedPatches(approvedPatches);
        return this;
    }

    /**
     * <p>
     * The compliance severity level assigned to the patch baseline after the
     * update completed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @return <p>
     *         The compliance severity level assigned to the patch baseline
     *         after the update completed.
     *         </p>
     * @see PatchComplianceLevel
     */
    public String getApprovedPatchesComplianceLevel() {
        return approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * The compliance severity level assigned to the patch baseline after the
     * update completed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param approvedPatchesComplianceLevel <p>
     *            The compliance severity level assigned to the patch baseline
     *            after the update completed.
     *            </p>
     * @see PatchComplianceLevel
     */
    public void setApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * The compliance severity level assigned to the patch baseline after the
     * update completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param approvedPatchesComplianceLevel <p>
     *            The compliance severity level assigned to the patch baseline
     *            after the update completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PatchComplianceLevel
     */
    public UpdatePatchBaselineResult withApprovedPatchesComplianceLevel(
            String approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
        return this;
    }

    /**
     * <p>
     * The compliance severity level assigned to the patch baseline after the
     * update completed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param approvedPatchesComplianceLevel <p>
     *            The compliance severity level assigned to the patch baseline
     *            after the update completed.
     *            </p>
     * @see PatchComplianceLevel
     */
    public void setApprovedPatchesComplianceLevel(
            PatchComplianceLevel approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel.toString();
    }

    /**
     * <p>
     * The compliance severity level assigned to the patch baseline after the
     * update completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param approvedPatchesComplianceLevel <p>
     *            The compliance severity level assigned to the patch baseline
     *            after the update completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PatchComplianceLevel
     */
    public UpdatePatchBaselineResult withApprovedPatchesComplianceLevel(
            PatchComplianceLevel approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security
     * updates that should be applied to the instances. The default value is
     * 'false'. Applies to Linux instances only.
     * </p>
     *
     * @return <p>
     *         Indicates whether the list of approved patches includes
     *         non-security updates that should be applied to the instances. The
     *         default value is 'false'. Applies to Linux instances only.
     *         </p>
     */
    public Boolean isApprovedPatchesEnableNonSecurity() {
        return approvedPatchesEnableNonSecurity;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security
     * updates that should be applied to the instances. The default value is
     * 'false'. Applies to Linux instances only.
     * </p>
     *
     * @return <p>
     *         Indicates whether the list of approved patches includes
     *         non-security updates that should be applied to the instances. The
     *         default value is 'false'. Applies to Linux instances only.
     *         </p>
     */
    public Boolean getApprovedPatchesEnableNonSecurity() {
        return approvedPatchesEnableNonSecurity;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security
     * updates that should be applied to the instances. The default value is
     * 'false'. Applies to Linux instances only.
     * </p>
     *
     * @param approvedPatchesEnableNonSecurity <p>
     *            Indicates whether the list of approved patches includes
     *            non-security updates that should be applied to the instances.
     *            The default value is 'false'. Applies to Linux instances only.
     *            </p>
     */
    public void setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security
     * updates that should be applied to the instances. The default value is
     * 'false'. Applies to Linux instances only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvedPatchesEnableNonSecurity <p>
     *            Indicates whether the list of approved patches includes
     *            non-security updates that should be applied to the instances.
     *            The default value is 'false'. Applies to Linux instances only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePatchBaselineResult withApprovedPatchesEnableNonSecurity(
            Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
        return this;
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     *
     * @return <p>
     *         A list of explicitly rejected patches for the baseline.
     *         </p>
     */
    public java.util.List<String> getRejectedPatches() {
        return rejectedPatches;
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     *
     * @param rejectedPatches <p>
     *            A list of explicitly rejected patches for the baseline.
     *            </p>
     */
    public void setRejectedPatches(java.util.Collection<String> rejectedPatches) {
        if (rejectedPatches == null) {
            this.rejectedPatches = null;
            return;
        }

        this.rejectedPatches = new java.util.ArrayList<String>(rejectedPatches);
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rejectedPatches <p>
     *            A list of explicitly rejected patches for the baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePatchBaselineResult withRejectedPatches(String... rejectedPatches) {
        if (getRejectedPatches() == null) {
            this.rejectedPatches = new java.util.ArrayList<String>(rejectedPatches.length);
        }
        for (String value : rejectedPatches) {
            this.rejectedPatches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rejectedPatches <p>
     *            A list of explicitly rejected patches for the baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePatchBaselineResult withRejectedPatches(
            java.util.Collection<String> rejectedPatches) {
        setRejectedPatches(rejectedPatches);
        return this;
    }

    /**
     * <p>
     * The action specified to take on patches included in the RejectedPatches
     * list. A patch can be allowed only if it is a dependency of another
     * package, or blocked entirely along with packages that include it as a
     * dependency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_AS_DEPENDENCY, BLOCK
     *
     * @return <p>
     *         The action specified to take on patches included in the
     *         RejectedPatches list. A patch can be allowed only if it is a
     *         dependency of another package, or blocked entirely along with
     *         packages that include it as a dependency.
     *         </p>
     * @see PatchAction
     */
    public String getRejectedPatchesAction() {
        return rejectedPatchesAction;
    }

    /**
     * <p>
     * The action specified to take on patches included in the RejectedPatches
     * list. A patch can be allowed only if it is a dependency of another
     * package, or blocked entirely along with packages that include it as a
     * dependency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_AS_DEPENDENCY, BLOCK
     *
     * @param rejectedPatchesAction <p>
     *            The action specified to take on patches included in the
     *            RejectedPatches list. A patch can be allowed only if it is a
     *            dependency of another package, or blocked entirely along with
     *            packages that include it as a dependency.
     *            </p>
     * @see PatchAction
     */
    public void setRejectedPatchesAction(String rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction;
    }

    /**
     * <p>
     * The action specified to take on patches included in the RejectedPatches
     * list. A patch can be allowed only if it is a dependency of another
     * package, or blocked entirely along with packages that include it as a
     * dependency.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_AS_DEPENDENCY, BLOCK
     *
     * @param rejectedPatchesAction <p>
     *            The action specified to take on patches included in the
     *            RejectedPatches list. A patch can be allowed only if it is a
     *            dependency of another package, or blocked entirely along with
     *            packages that include it as a dependency.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PatchAction
     */
    public UpdatePatchBaselineResult withRejectedPatchesAction(String rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction;
        return this;
    }

    /**
     * <p>
     * The action specified to take on patches included in the RejectedPatches
     * list. A patch can be allowed only if it is a dependency of another
     * package, or blocked entirely along with packages that include it as a
     * dependency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_AS_DEPENDENCY, BLOCK
     *
     * @param rejectedPatchesAction <p>
     *            The action specified to take on patches included in the
     *            RejectedPatches list. A patch can be allowed only if it is a
     *            dependency of another package, or blocked entirely along with
     *            packages that include it as a dependency.
     *            </p>
     * @see PatchAction
     */
    public void setRejectedPatchesAction(PatchAction rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction.toString();
    }

    /**
     * <p>
     * The action specified to take on patches included in the RejectedPatches
     * list. A patch can be allowed only if it is a dependency of another
     * package, or blocked entirely along with packages that include it as a
     * dependency.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_AS_DEPENDENCY, BLOCK
     *
     * @param rejectedPatchesAction <p>
     *            The action specified to take on patches included in the
     *            RejectedPatches list. A patch can be allowed only if it is a
     *            dependency of another package, or blocked entirely along with
     *            packages that include it as a dependency.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PatchAction
     */
    public UpdatePatchBaselineResult withRejectedPatchesAction(PatchAction rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction.toString();
        return this;
    }

    /**
     * <p>
     * The date when the patch baseline was created.
     * </p>
     *
     * @return <p>
     *         The date when the patch baseline was created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date when the patch baseline was created.
     * </p>
     *
     * @param createdDate <p>
     *            The date when the patch baseline was created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date when the patch baseline was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The date when the patch baseline was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePatchBaselineResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * The date when the patch baseline was last modified.
     * </p>
     *
     * @return <p>
     *         The date when the patch baseline was last modified.
     *         </p>
     */
    public java.util.Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * <p>
     * The date when the patch baseline was last modified.
     * </p>
     *
     * @param modifiedDate <p>
     *            The date when the patch baseline was last modified.
     *            </p>
     */
    public void setModifiedDate(java.util.Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * <p>
     * The date when the patch baseline was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modifiedDate <p>
     *            The date when the patch baseline was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePatchBaselineResult withModifiedDate(java.util.Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * <p>
     * A description of the Patch Baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A description of the Patch Baseline.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the Patch Baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description of the Patch Baseline.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the Patch Baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description of the Patch Baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePatchBaselineResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Information about the patches to use to update the instances, including
     * target operating systems and source repositories. Applies to Linux
     * instances only.
     * </p>
     *
     * @return <p>
     *         Information about the patches to use to update the instances,
     *         including target operating systems and source repositories.
     *         Applies to Linux instances only.
     *         </p>
     */
    public java.util.List<PatchSource> getSources() {
        return sources;
    }

    /**
     * <p>
     * Information about the patches to use to update the instances, including
     * target operating systems and source repositories. Applies to Linux
     * instances only.
     * </p>
     *
     * @param sources <p>
     *            Information about the patches to use to update the instances,
     *            including target operating systems and source repositories.
     *            Applies to Linux instances only.
     *            </p>
     */
    public void setSources(java.util.Collection<PatchSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<PatchSource>(sources);
    }

    /**
     * <p>
     * Information about the patches to use to update the instances, including
     * target operating systems and source repositories. Applies to Linux
     * instances only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sources <p>
     *            Information about the patches to use to update the instances,
     *            including target operating systems and source repositories.
     *            Applies to Linux instances only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePatchBaselineResult withSources(PatchSource... sources) {
        if (getSources() == null) {
            this.sources = new java.util.ArrayList<PatchSource>(sources.length);
        }
        for (PatchSource value : sources) {
            this.sources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the patches to use to update the instances, including
     * target operating systems and source repositories. Applies to Linux
     * instances only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sources <p>
     *            Information about the patches to use to update the instances,
     *            including target operating systems and source repositories.
     *            Applies to Linux instances only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePatchBaselineResult withSources(java.util.Collection<PatchSource> sources) {
        setSources(sources);
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
        if (getBaselineId() != null)
            sb.append("BaselineId: " + getBaselineId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: " + getOperatingSystem() + ",");
        if (getGlobalFilters() != null)
            sb.append("GlobalFilters: " + getGlobalFilters() + ",");
        if (getApprovalRules() != null)
            sb.append("ApprovalRules: " + getApprovalRules() + ",");
        if (getApprovedPatches() != null)
            sb.append("ApprovedPatches: " + getApprovedPatches() + ",");
        if (getApprovedPatchesComplianceLevel() != null)
            sb.append("ApprovedPatchesComplianceLevel: " + getApprovedPatchesComplianceLevel()
                    + ",");
        if (getApprovedPatchesEnableNonSecurity() != null)
            sb.append("ApprovedPatchesEnableNonSecurity: " + getApprovedPatchesEnableNonSecurity()
                    + ",");
        if (getRejectedPatches() != null)
            sb.append("RejectedPatches: " + getRejectedPatches() + ",");
        if (getRejectedPatchesAction() != null)
            sb.append("RejectedPatchesAction: " + getRejectedPatchesAction() + ",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getModifiedDate() != null)
            sb.append("ModifiedDate: " + getModifiedDate() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSources() != null)
            sb.append("Sources: " + getSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineId() == null) ? 0 : getBaselineId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode
                + ((getGlobalFilters() == null) ? 0 : getGlobalFilters().hashCode());
        hashCode = prime * hashCode
                + ((getApprovalRules() == null) ? 0 : getApprovalRules().hashCode());
        hashCode = prime * hashCode
                + ((getApprovedPatches() == null) ? 0 : getApprovedPatches().hashCode());
        hashCode = prime
                * hashCode
                + ((getApprovedPatchesComplianceLevel() == null) ? 0
                        : getApprovedPatchesComplianceLevel().hashCode());
        hashCode = prime
                * hashCode
                + ((getApprovedPatchesEnableNonSecurity() == null) ? 0
                        : getApprovedPatchesEnableNonSecurity().hashCode());
        hashCode = prime * hashCode
                + ((getRejectedPatches() == null) ? 0 : getRejectedPatches().hashCode());
        hashCode = prime
                * hashCode
                + ((getRejectedPatchesAction() == null) ? 0 : getRejectedPatchesAction().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getModifiedDate() == null) ? 0 : getModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePatchBaselineResult == false)
            return false;
        UpdatePatchBaselineResult other = (UpdatePatchBaselineResult) obj;

        if (other.getBaselineId() == null ^ this.getBaselineId() == null)
            return false;
        if (other.getBaselineId() != null
                && other.getBaselineId().equals(this.getBaselineId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null
                && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getGlobalFilters() == null ^ this.getGlobalFilters() == null)
            return false;
        if (other.getGlobalFilters() != null
                && other.getGlobalFilters().equals(this.getGlobalFilters()) == false)
            return false;
        if (other.getApprovalRules() == null ^ this.getApprovalRules() == null)
            return false;
        if (other.getApprovalRules() != null
                && other.getApprovalRules().equals(this.getApprovalRules()) == false)
            return false;
        if (other.getApprovedPatches() == null ^ this.getApprovedPatches() == null)
            return false;
        if (other.getApprovedPatches() != null
                && other.getApprovedPatches().equals(this.getApprovedPatches()) == false)
            return false;
        if (other.getApprovedPatchesComplianceLevel() == null
                ^ this.getApprovedPatchesComplianceLevel() == null)
            return false;
        if (other.getApprovedPatchesComplianceLevel() != null
                && other.getApprovedPatchesComplianceLevel().equals(
                        this.getApprovedPatchesComplianceLevel()) == false)
            return false;
        if (other.getApprovedPatchesEnableNonSecurity() == null
                ^ this.getApprovedPatchesEnableNonSecurity() == null)
            return false;
        if (other.getApprovedPatchesEnableNonSecurity() != null
                && other.getApprovedPatchesEnableNonSecurity().equals(
                        this.getApprovedPatchesEnableNonSecurity()) == false)
            return false;
        if (other.getRejectedPatches() == null ^ this.getRejectedPatches() == null)
            return false;
        if (other.getRejectedPatches() != null
                && other.getRejectedPatches().equals(this.getRejectedPatches()) == false)
            return false;
        if (other.getRejectedPatchesAction() == null ^ this.getRejectedPatchesAction() == null)
            return false;
        if (other.getRejectedPatchesAction() != null
                && other.getRejectedPatchesAction().equals(this.getRejectedPatchesAction()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getModifiedDate() == null ^ this.getModifiedDate() == null)
            return false;
        if (other.getModifiedDate() != null
                && other.getModifiedDate().equals(this.getModifiedDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }
}
