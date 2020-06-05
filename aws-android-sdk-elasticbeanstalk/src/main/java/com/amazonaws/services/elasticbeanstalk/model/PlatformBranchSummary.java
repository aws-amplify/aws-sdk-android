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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Summary information about a platform branch.
 * </p>
 */
public class PlatformBranchSummary implements Serializable {
    /**
     * <p>
     * The name of the platform to which this platform branch belongs.
     * </p>
     */
    private String platformName;

    /**
     * <p>
     * The name of the platform branch.
     * </p>
     */
    private String branchName;

    /**
     * <p>
     * The support life cycle state of the platform branch.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> |
     * <code>deprecated</code> | <code>retired</code>
     * </p>
     */
    private String lifecycleState;

    /**
     * <p>
     * An ordinal number that designates the order in which platform branches
     * have been added to a platform. This can be helpful, for example, if your
     * code calls the <code>ListPlatformBranches</code> action and then displays
     * a list of platform branches.
     * </p>
     * <p>
     * A larger <code>BranchOrder</code> value designates a newer platform
     * branch within the platform.
     * </p>
     */
    private Integer branchOrder;

    /**
     * <p>
     * The environment tiers that platform versions in this branch support.
     * </p>
     * <p>
     * Possible values: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     */
    private java.util.List<String> supportedTierList;

    /**
     * <p>
     * The name of the platform to which this platform branch belongs.
     * </p>
     *
     * @return <p>
     *         The name of the platform to which this platform branch belongs.
     *         </p>
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     * <p>
     * The name of the platform to which this platform branch belongs.
     * </p>
     *
     * @param platformName <p>
     *            The name of the platform to which this platform branch
     *            belongs.
     *            </p>
     */
    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    /**
     * <p>
     * The name of the platform to which this platform branch belongs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformName <p>
     *            The name of the platform to which this platform branch
     *            belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformBranchSummary withPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }

    /**
     * <p>
     * The name of the platform branch.
     * </p>
     *
     * @return <p>
     *         The name of the platform branch.
     *         </p>
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * <p>
     * The name of the platform branch.
     * </p>
     *
     * @param branchName <p>
     *            The name of the platform branch.
     *            </p>
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name of the platform branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param branchName <p>
     *            The name of the platform branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformBranchSummary withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * <p>
     * The support life cycle state of the platform branch.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> |
     * <code>deprecated</code> | <code>retired</code>
     * </p>
     *
     * @return <p>
     *         The support life cycle state of the platform branch.
     *         </p>
     *         <p>
     *         Possible values: <code>beta</code> | <code>supported</code> |
     *         <code>deprecated</code> | <code>retired</code>
     *         </p>
     */
    public String getLifecycleState() {
        return lifecycleState;
    }

    /**
     * <p>
     * The support life cycle state of the platform branch.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> |
     * <code>deprecated</code> | <code>retired</code>
     * </p>
     *
     * @param lifecycleState <p>
     *            The support life cycle state of the platform branch.
     *            </p>
     *            <p>
     *            Possible values: <code>beta</code> | <code>supported</code> |
     *            <code>deprecated</code> | <code>retired</code>
     *            </p>
     */
    public void setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    /**
     * <p>
     * The support life cycle state of the platform branch.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> |
     * <code>deprecated</code> | <code>retired</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleState <p>
     *            The support life cycle state of the platform branch.
     *            </p>
     *            <p>
     *            Possible values: <code>beta</code> | <code>supported</code> |
     *            <code>deprecated</code> | <code>retired</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformBranchSummary withLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
    }

    /**
     * <p>
     * An ordinal number that designates the order in which platform branches
     * have been added to a platform. This can be helpful, for example, if your
     * code calls the <code>ListPlatformBranches</code> action and then displays
     * a list of platform branches.
     * </p>
     * <p>
     * A larger <code>BranchOrder</code> value designates a newer platform
     * branch within the platform.
     * </p>
     *
     * @return <p>
     *         An ordinal number that designates the order in which platform
     *         branches have been added to a platform. This can be helpful, for
     *         example, if your code calls the <code>ListPlatformBranches</code>
     *         action and then displays a list of platform branches.
     *         </p>
     *         <p>
     *         A larger <code>BranchOrder</code> value designates a newer
     *         platform branch within the platform.
     *         </p>
     */
    public Integer getBranchOrder() {
        return branchOrder;
    }

    /**
     * <p>
     * An ordinal number that designates the order in which platform branches
     * have been added to a platform. This can be helpful, for example, if your
     * code calls the <code>ListPlatformBranches</code> action and then displays
     * a list of platform branches.
     * </p>
     * <p>
     * A larger <code>BranchOrder</code> value designates a newer platform
     * branch within the platform.
     * </p>
     *
     * @param branchOrder <p>
     *            An ordinal number that designates the order in which platform
     *            branches have been added to a platform. This can be helpful,
     *            for example, if your code calls the
     *            <code>ListPlatformBranches</code> action and then displays a
     *            list of platform branches.
     *            </p>
     *            <p>
     *            A larger <code>BranchOrder</code> value designates a newer
     *            platform branch within the platform.
     *            </p>
     */
    public void setBranchOrder(Integer branchOrder) {
        this.branchOrder = branchOrder;
    }

    /**
     * <p>
     * An ordinal number that designates the order in which platform branches
     * have been added to a platform. This can be helpful, for example, if your
     * code calls the <code>ListPlatformBranches</code> action and then displays
     * a list of platform branches.
     * </p>
     * <p>
     * A larger <code>BranchOrder</code> value designates a newer platform
     * branch within the platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param branchOrder <p>
     *            An ordinal number that designates the order in which platform
     *            branches have been added to a platform. This can be helpful,
     *            for example, if your code calls the
     *            <code>ListPlatformBranches</code> action and then displays a
     *            list of platform branches.
     *            </p>
     *            <p>
     *            A larger <code>BranchOrder</code> value designates a newer
     *            platform branch within the platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformBranchSummary withBranchOrder(Integer branchOrder) {
        this.branchOrder = branchOrder;
        return this;
    }

    /**
     * <p>
     * The environment tiers that platform versions in this branch support.
     * </p>
     * <p>
     * Possible values: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     *
     * @return <p>
     *         The environment tiers that platform versions in this branch
     *         support.
     *         </p>
     *         <p>
     *         Possible values: <code>WebServer/Standard</code> |
     *         <code>Worker/SQS/HTTP</code>
     *         </p>
     */
    public java.util.List<String> getSupportedTierList() {
        return supportedTierList;
    }

    /**
     * <p>
     * The environment tiers that platform versions in this branch support.
     * </p>
     * <p>
     * Possible values: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     *
     * @param supportedTierList <p>
     *            The environment tiers that platform versions in this branch
     *            support.
     *            </p>
     *            <p>
     *            Possible values: <code>WebServer/Standard</code> |
     *            <code>Worker/SQS/HTTP</code>
     *            </p>
     */
    public void setSupportedTierList(java.util.Collection<String> supportedTierList) {
        if (supportedTierList == null) {
            this.supportedTierList = null;
            return;
        }

        this.supportedTierList = new java.util.ArrayList<String>(supportedTierList);
    }

    /**
     * <p>
     * The environment tiers that platform versions in this branch support.
     * </p>
     * <p>
     * Possible values: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedTierList <p>
     *            The environment tiers that platform versions in this branch
     *            support.
     *            </p>
     *            <p>
     *            Possible values: <code>WebServer/Standard</code> |
     *            <code>Worker/SQS/HTTP</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformBranchSummary withSupportedTierList(String... supportedTierList) {
        if (getSupportedTierList() == null) {
            this.supportedTierList = new java.util.ArrayList<String>(supportedTierList.length);
        }
        for (String value : supportedTierList) {
            this.supportedTierList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The environment tiers that platform versions in this branch support.
     * </p>
     * <p>
     * Possible values: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedTierList <p>
     *            The environment tiers that platform versions in this branch
     *            support.
     *            </p>
     *            <p>
     *            Possible values: <code>WebServer/Standard</code> |
     *            <code>Worker/SQS/HTTP</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformBranchSummary withSupportedTierList(
            java.util.Collection<String> supportedTierList) {
        setSupportedTierList(supportedTierList);
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
        if (getPlatformName() != null)
            sb.append("PlatformName: " + getPlatformName() + ",");
        if (getBranchName() != null)
            sb.append("BranchName: " + getBranchName() + ",");
        if (getLifecycleState() != null)
            sb.append("LifecycleState: " + getLifecycleState() + ",");
        if (getBranchOrder() != null)
            sb.append("BranchOrder: " + getBranchOrder() + ",");
        if (getSupportedTierList() != null)
            sb.append("SupportedTierList: " + getSupportedTierList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPlatformName() == null) ? 0 : getPlatformName().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode
                + ((getLifecycleState() == null) ? 0 : getLifecycleState().hashCode());
        hashCode = prime * hashCode
                + ((getBranchOrder() == null) ? 0 : getBranchOrder().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedTierList() == null) ? 0 : getSupportedTierList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlatformBranchSummary == false)
            return false;
        PlatformBranchSummary other = (PlatformBranchSummary) obj;

        if (other.getPlatformName() == null ^ this.getPlatformName() == null)
            return false;
        if (other.getPlatformName() != null
                && other.getPlatformName().equals(this.getPlatformName()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null
                && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getLifecycleState() == null ^ this.getLifecycleState() == null)
            return false;
        if (other.getLifecycleState() != null
                && other.getLifecycleState().equals(this.getLifecycleState()) == false)
            return false;
        if (other.getBranchOrder() == null ^ this.getBranchOrder() == null)
            return false;
        if (other.getBranchOrder() != null
                && other.getBranchOrder().equals(this.getBranchOrder()) == false)
            return false;
        if (other.getSupportedTierList() == null ^ this.getSupportedTierList() == null)
            return false;
        if (other.getSupportedTierList() != null
                && other.getSupportedTierList().equals(this.getSupportedTierList()) == false)
            return false;
        return true;
    }
}
