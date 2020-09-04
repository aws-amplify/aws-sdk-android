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
 * <p>Defines the basic information about a patch baseline.</p>
 */
public class PatchBaselineIdentity implements Serializable {
    /**
     * <p>The ID of the patch baseline.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     */
    private String baselineId;

    /**
     * <p>The name of the patch baseline.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String baselineName;

    /**
     * <p>Defines the operating system the patch baseline applies to. The Default value is WINDOWS. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     */
    private String operatingSystem;

    /**
     * <p>The description of the patch baseline.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String baselineDescription;

    /**
     * <p>Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.</p>
     */
    private Boolean defaultBaseline;

    /**
     * <p>The ID of the patch baseline.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     *
     * @return <p>The ID of the patch baseline.</p>
     */
    public String getBaselineId() {
        return baselineId;
    }

    /**
     * <p>The ID of the patch baseline.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     *
     * @param baselineId <p>The ID of the patch baseline.</p>
     */
    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    /**
     * <p>The ID of the patch baseline.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     *
     * @param baselineId <p>The ID of the patch baseline.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PatchBaselineIdentity withBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }

    /**
     * <p>The name of the patch baseline.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>The name of the patch baseline.</p>
     */
    public String getBaselineName() {
        return baselineName;
    }

    /**
     * <p>The name of the patch baseline.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param baselineName <p>The name of the patch baseline.</p>
     */
    public void setBaselineName(String baselineName) {
        this.baselineName = baselineName;
    }

    /**
     * <p>The name of the patch baseline.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param baselineName <p>The name of the patch baseline.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PatchBaselineIdentity withBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }

    /**
     * <p>Defines the operating system the patch baseline applies to. The Default value is WINDOWS. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @return <p>Defines the operating system the patch baseline applies to. The Default value is WINDOWS. </p>
     *
     * @see OperatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * <p>Defines the operating system the patch baseline applies to. The Default value is WINDOWS. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>Defines the operating system the patch baseline applies to. The Default value is WINDOWS. </p>
     *
     * @see OperatingSystem
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>Defines the operating system the patch baseline applies to. The Default value is WINDOWS. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>Defines the operating system the patch baseline applies to. The Default value is WINDOWS. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see OperatingSystem
     */
    public PatchBaselineIdentity withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * <p>Defines the operating system the patch baseline applies to. The Default value is WINDOWS. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>Defines the operating system the patch baseline applies to. The Default value is WINDOWS. </p>
     *
     * @see OperatingSystem
     */
    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
    }

    /**
     * <p>Defines the operating system the patch baseline applies to. The Default value is WINDOWS. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>Defines the operating system the patch baseline applies to. The Default value is WINDOWS. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see OperatingSystem
     */
    public PatchBaselineIdentity withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>The description of the patch baseline.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>The description of the patch baseline.</p>
     */
    public String getBaselineDescription() {
        return baselineDescription;
    }

    /**
     * <p>The description of the patch baseline.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param baselineDescription <p>The description of the patch baseline.</p>
     */
    public void setBaselineDescription(String baselineDescription) {
        this.baselineDescription = baselineDescription;
    }

    /**
     * <p>The description of the patch baseline.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param baselineDescription <p>The description of the patch baseline.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PatchBaselineIdentity withBaselineDescription(String baselineDescription) {
        this.baselineDescription = baselineDescription;
        return this;
    }

    /**
     * <p>Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.</p>
     *
     * @return <p>Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.</p>
     */
    public Boolean isDefaultBaseline() {
        return defaultBaseline;
    }

    /**
     * <p>Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.</p>
     *
     * @return <p>Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.</p>
     */
    public Boolean getDefaultBaseline() {
        return defaultBaseline;
    }

    /**
     * <p>Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.</p>
     *
     * @param defaultBaseline <p>Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.</p>
     */
    public void setDefaultBaseline(Boolean defaultBaseline) {
        this.defaultBaseline = defaultBaseline;
    }

    /**
     * <p>Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultBaseline <p>Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PatchBaselineIdentity withDefaultBaseline(Boolean defaultBaseline) {
        this.defaultBaseline = defaultBaseline;
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
        if (getBaselineId() != null) sb.append("BaselineId: " + getBaselineId() + ",");
        if (getBaselineName() != null) sb.append("BaselineName: " + getBaselineName() + ",");
        if (getOperatingSystem() != null) sb.append("OperatingSystem: " + getOperatingSystem() + ",");
        if (getBaselineDescription() != null) sb.append("BaselineDescription: " + getBaselineDescription() + ",");
        if (getDefaultBaseline() != null) sb.append("DefaultBaseline: " + getDefaultBaseline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineId() == null) ? 0 : getBaselineId().hashCode());
        hashCode = prime * hashCode + ((getBaselineName() == null) ? 0 : getBaselineName().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getBaselineDescription() == null) ? 0 : getBaselineDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultBaseline() == null) ? 0 : getDefaultBaseline().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PatchBaselineIdentity == false) return false;
        PatchBaselineIdentity other = (PatchBaselineIdentity)obj;

        if (other.getBaselineId() == null ^ this.getBaselineId() == null) return false;
        if (other.getBaselineId() != null && other.getBaselineId().equals(this.getBaselineId()) == false) return false;
        if (other.getBaselineName() == null ^ this.getBaselineName() == null) return false;
        if (other.getBaselineName() != null && other.getBaselineName().equals(this.getBaselineName()) == false) return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null) return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false) return false;
        if (other.getBaselineDescription() == null ^ this.getBaselineDescription() == null) return false;
        if (other.getBaselineDescription() != null && other.getBaselineDescription().equals(this.getBaselineDescription()) == false) return false;
        if (other.getDefaultBaseline() == null ^ this.getDefaultBaseline() == null) return false;
        if (other.getDefaultBaseline() != null && other.getDefaultBaseline().equals(this.getDefaultBaseline()) == false) return false;
        return true;
    }
}
