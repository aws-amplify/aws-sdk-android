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
 * Summary information about a platform version.
 * </p>
 */
public class PlatformSummary implements Serializable {
    /**
     * <p>
     * The ARN of the platform version.
     * </p>
     */
    private String platformArn;

    /**
     * <p>
     * The AWS account ID of the person who created the platform version.
     * </p>
     */
    private String platformOwner;

    /**
     * <p>
     * The status of the platform version. You can create an environment from
     * the platform version once it is ready.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Failed, Ready, Deleting, Deleted
     */
    private String platformStatus;

    /**
     * <p>
     * The category of platform version.
     * </p>
     */
    private String platformCategory;

    /**
     * <p>
     * The operating system used by the platform version.
     * </p>
     */
    private String operatingSystemName;

    /**
     * <p>
     * The version of the operating system used by the platform version.
     * </p>
     */
    private String operatingSystemVersion;

    /**
     * <p>
     * The tiers in which the platform version runs.
     * </p>
     */
    private java.util.List<String> supportedTierList;

    /**
     * <p>
     * The additions associated with the platform version.
     * </p>
     */
    private java.util.List<String> supportedAddonList;

    /**
     * <p>
     * The state of the platform version in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>recommended</code> | empty
     * </p>
     * <p>
     * If an empty value is returned, the platform version is supported but
     * isn't the recommended one for its branch.
     * </p>
     */
    private String platformLifecycleState;

    /**
     * <p>
     * The version string of the platform version.
     * </p>
     */
    private String platformVersion;

    /**
     * <p>
     * The platform branch to which the platform version belongs.
     * </p>
     */
    private String platformBranchName;

    /**
     * <p>
     * The state of the platform version's branch in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> |
     * <code>deprecated</code> | <code>retired</code>
     * </p>
     */
    private String platformBranchLifecycleState;

    /**
     * <p>
     * The ARN of the platform version.
     * </p>
     *
     * @return <p>
     *         The ARN of the platform version.
     *         </p>
     */
    public String getPlatformArn() {
        return platformArn;
    }

    /**
     * <p>
     * The ARN of the platform version.
     * </p>
     *
     * @param platformArn <p>
     *            The ARN of the platform version.
     *            </p>
     */
    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformArn <p>
     *            The ARN of the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformSummary withPlatformArn(String platformArn) {
        this.platformArn = platformArn;
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the person who created the platform version.
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the person who created the platform
     *         version.
     *         </p>
     */
    public String getPlatformOwner() {
        return platformOwner;
    }

    /**
     * <p>
     * The AWS account ID of the person who created the platform version.
     * </p>
     *
     * @param platformOwner <p>
     *            The AWS account ID of the person who created the platform
     *            version.
     *            </p>
     */
    public void setPlatformOwner(String platformOwner) {
        this.platformOwner = platformOwner;
    }

    /**
     * <p>
     * The AWS account ID of the person who created the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformOwner <p>
     *            The AWS account ID of the person who created the platform
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformSummary withPlatformOwner(String platformOwner) {
        this.platformOwner = platformOwner;
        return this;
    }

    /**
     * <p>
     * The status of the platform version. You can create an environment from
     * the platform version once it is ready.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Failed, Ready, Deleting, Deleted
     *
     * @return <p>
     *         The status of the platform version. You can create an environment
     *         from the platform version once it is ready.
     *         </p>
     * @see PlatformStatus
     */
    public String getPlatformStatus() {
        return platformStatus;
    }

    /**
     * <p>
     * The status of the platform version. You can create an environment from
     * the platform version once it is ready.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Failed, Ready, Deleting, Deleted
     *
     * @param platformStatus <p>
     *            The status of the platform version. You can create an
     *            environment from the platform version once it is ready.
     *            </p>
     * @see PlatformStatus
     */
    public void setPlatformStatus(String platformStatus) {
        this.platformStatus = platformStatus;
    }

    /**
     * <p>
     * The status of the platform version. You can create an environment from
     * the platform version once it is ready.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Failed, Ready, Deleting, Deleted
     *
     * @param platformStatus <p>
     *            The status of the platform version. You can create an
     *            environment from the platform version once it is ready.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlatformStatus
     */
    public PlatformSummary withPlatformStatus(String platformStatus) {
        this.platformStatus = platformStatus;
        return this;
    }

    /**
     * <p>
     * The status of the platform version. You can create an environment from
     * the platform version once it is ready.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Failed, Ready, Deleting, Deleted
     *
     * @param platformStatus <p>
     *            The status of the platform version. You can create an
     *            environment from the platform version once it is ready.
     *            </p>
     * @see PlatformStatus
     */
    public void setPlatformStatus(PlatformStatus platformStatus) {
        this.platformStatus = platformStatus.toString();
    }

    /**
     * <p>
     * The status of the platform version. You can create an environment from
     * the platform version once it is ready.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Failed, Ready, Deleting, Deleted
     *
     * @param platformStatus <p>
     *            The status of the platform version. You can create an
     *            environment from the platform version once it is ready.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlatformStatus
     */
    public PlatformSummary withPlatformStatus(PlatformStatus platformStatus) {
        this.platformStatus = platformStatus.toString();
        return this;
    }

    /**
     * <p>
     * The category of platform version.
     * </p>
     *
     * @return <p>
     *         The category of platform version.
     *         </p>
     */
    public String getPlatformCategory() {
        return platformCategory;
    }

    /**
     * <p>
     * The category of platform version.
     * </p>
     *
     * @param platformCategory <p>
     *            The category of platform version.
     *            </p>
     */
    public void setPlatformCategory(String platformCategory) {
        this.platformCategory = platformCategory;
    }

    /**
     * <p>
     * The category of platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformCategory <p>
     *            The category of platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformSummary withPlatformCategory(String platformCategory) {
        this.platformCategory = platformCategory;
        return this;
    }

    /**
     * <p>
     * The operating system used by the platform version.
     * </p>
     *
     * @return <p>
     *         The operating system used by the platform version.
     *         </p>
     */
    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    /**
     * <p>
     * The operating system used by the platform version.
     * </p>
     *
     * @param operatingSystemName <p>
     *            The operating system used by the platform version.
     *            </p>
     */
    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    /**
     * <p>
     * The operating system used by the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operatingSystemName <p>
     *            The operating system used by the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformSummary withOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
        return this;
    }

    /**
     * <p>
     * The version of the operating system used by the platform version.
     * </p>
     *
     * @return <p>
     *         The version of the operating system used by the platform version.
     *         </p>
     */
    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    /**
     * <p>
     * The version of the operating system used by the platform version.
     * </p>
     *
     * @param operatingSystemVersion <p>
     *            The version of the operating system used by the platform
     *            version.
     *            </p>
     */
    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * <p>
     * The version of the operating system used by the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operatingSystemVersion <p>
     *            The version of the operating system used by the platform
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformSummary withOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
        return this;
    }

    /**
     * <p>
     * The tiers in which the platform version runs.
     * </p>
     *
     * @return <p>
     *         The tiers in which the platform version runs.
     *         </p>
     */
    public java.util.List<String> getSupportedTierList() {
        return supportedTierList;
    }

    /**
     * <p>
     * The tiers in which the platform version runs.
     * </p>
     *
     * @param supportedTierList <p>
     *            The tiers in which the platform version runs.
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
     * The tiers in which the platform version runs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedTierList <p>
     *            The tiers in which the platform version runs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformSummary withSupportedTierList(String... supportedTierList) {
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
     * The tiers in which the platform version runs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedTierList <p>
     *            The tiers in which the platform version runs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformSummary withSupportedTierList(java.util.Collection<String> supportedTierList) {
        setSupportedTierList(supportedTierList);
        return this;
    }

    /**
     * <p>
     * The additions associated with the platform version.
     * </p>
     *
     * @return <p>
     *         The additions associated with the platform version.
     *         </p>
     */
    public java.util.List<String> getSupportedAddonList() {
        return supportedAddonList;
    }

    /**
     * <p>
     * The additions associated with the platform version.
     * </p>
     *
     * @param supportedAddonList <p>
     *            The additions associated with the platform version.
     *            </p>
     */
    public void setSupportedAddonList(java.util.Collection<String> supportedAddonList) {
        if (supportedAddonList == null) {
            this.supportedAddonList = null;
            return;
        }

        this.supportedAddonList = new java.util.ArrayList<String>(supportedAddonList);
    }

    /**
     * <p>
     * The additions associated with the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedAddonList <p>
     *            The additions associated with the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformSummary withSupportedAddonList(String... supportedAddonList) {
        if (getSupportedAddonList() == null) {
            this.supportedAddonList = new java.util.ArrayList<String>(supportedAddonList.length);
        }
        for (String value : supportedAddonList) {
            this.supportedAddonList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The additions associated with the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedAddonList <p>
     *            The additions associated with the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformSummary withSupportedAddonList(java.util.Collection<String> supportedAddonList) {
        setSupportedAddonList(supportedAddonList);
        return this;
    }

    /**
     * <p>
     * The state of the platform version in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>recommended</code> | empty
     * </p>
     * <p>
     * If an empty value is returned, the platform version is supported but
     * isn't the recommended one for its branch.
     * </p>
     *
     * @return <p>
     *         The state of the platform version in its lifecycle.
     *         </p>
     *         <p>
     *         Possible values: <code>recommended</code> | empty
     *         </p>
     *         <p>
     *         If an empty value is returned, the platform version is supported
     *         but isn't the recommended one for its branch.
     *         </p>
     */
    public String getPlatformLifecycleState() {
        return platformLifecycleState;
    }

    /**
     * <p>
     * The state of the platform version in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>recommended</code> | empty
     * </p>
     * <p>
     * If an empty value is returned, the platform version is supported but
     * isn't the recommended one for its branch.
     * </p>
     *
     * @param platformLifecycleState <p>
     *            The state of the platform version in its lifecycle.
     *            </p>
     *            <p>
     *            Possible values: <code>recommended</code> | empty
     *            </p>
     *            <p>
     *            If an empty value is returned, the platform version is
     *            supported but isn't the recommended one for its branch.
     *            </p>
     */
    public void setPlatformLifecycleState(String platformLifecycleState) {
        this.platformLifecycleState = platformLifecycleState;
    }

    /**
     * <p>
     * The state of the platform version in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>recommended</code> | empty
     * </p>
     * <p>
     * If an empty value is returned, the platform version is supported but
     * isn't the recommended one for its branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformLifecycleState <p>
     *            The state of the platform version in its lifecycle.
     *            </p>
     *            <p>
     *            Possible values: <code>recommended</code> | empty
     *            </p>
     *            <p>
     *            If an empty value is returned, the platform version is
     *            supported but isn't the recommended one for its branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformSummary withPlatformLifecycleState(String platformLifecycleState) {
        this.platformLifecycleState = platformLifecycleState;
        return this;
    }

    /**
     * <p>
     * The version string of the platform version.
     * </p>
     *
     * @return <p>
     *         The version string of the platform version.
     *         </p>
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /**
     * <p>
     * The version string of the platform version.
     * </p>
     *
     * @param platformVersion <p>
     *            The version string of the platform version.
     *            </p>
     */
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The version string of the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformVersion <p>
     *            The version string of the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformSummary withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * <p>
     * The platform branch to which the platform version belongs.
     * </p>
     *
     * @return <p>
     *         The platform branch to which the platform version belongs.
     *         </p>
     */
    public String getPlatformBranchName() {
        return platformBranchName;
    }

    /**
     * <p>
     * The platform branch to which the platform version belongs.
     * </p>
     *
     * @param platformBranchName <p>
     *            The platform branch to which the platform version belongs.
     *            </p>
     */
    public void setPlatformBranchName(String platformBranchName) {
        this.platformBranchName = platformBranchName;
    }

    /**
     * <p>
     * The platform branch to which the platform version belongs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformBranchName <p>
     *            The platform branch to which the platform version belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformSummary withPlatformBranchName(String platformBranchName) {
        this.platformBranchName = platformBranchName;
        return this;
    }

    /**
     * <p>
     * The state of the platform version's branch in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> |
     * <code>deprecated</code> | <code>retired</code>
     * </p>
     *
     * @return <p>
     *         The state of the platform version's branch in its lifecycle.
     *         </p>
     *         <p>
     *         Possible values: <code>beta</code> | <code>supported</code> |
     *         <code>deprecated</code> | <code>retired</code>
     *         </p>
     */
    public String getPlatformBranchLifecycleState() {
        return platformBranchLifecycleState;
    }

    /**
     * <p>
     * The state of the platform version's branch in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> |
     * <code>deprecated</code> | <code>retired</code>
     * </p>
     *
     * @param platformBranchLifecycleState <p>
     *            The state of the platform version's branch in its lifecycle.
     *            </p>
     *            <p>
     *            Possible values: <code>beta</code> | <code>supported</code> |
     *            <code>deprecated</code> | <code>retired</code>
     *            </p>
     */
    public void setPlatformBranchLifecycleState(String platformBranchLifecycleState) {
        this.platformBranchLifecycleState = platformBranchLifecycleState;
    }

    /**
     * <p>
     * The state of the platform version's branch in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> |
     * <code>deprecated</code> | <code>retired</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformBranchLifecycleState <p>
     *            The state of the platform version's branch in its lifecycle.
     *            </p>
     *            <p>
     *            Possible values: <code>beta</code> | <code>supported</code> |
     *            <code>deprecated</code> | <code>retired</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformSummary withPlatformBranchLifecycleState(String platformBranchLifecycleState) {
        this.platformBranchLifecycleState = platformBranchLifecycleState;
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
        if (getPlatformArn() != null)
            sb.append("PlatformArn: " + getPlatformArn() + ",");
        if (getPlatformOwner() != null)
            sb.append("PlatformOwner: " + getPlatformOwner() + ",");
        if (getPlatformStatus() != null)
            sb.append("PlatformStatus: " + getPlatformStatus() + ",");
        if (getPlatformCategory() != null)
            sb.append("PlatformCategory: " + getPlatformCategory() + ",");
        if (getOperatingSystemName() != null)
            sb.append("OperatingSystemName: " + getOperatingSystemName() + ",");
        if (getOperatingSystemVersion() != null)
            sb.append("OperatingSystemVersion: " + getOperatingSystemVersion() + ",");
        if (getSupportedTierList() != null)
            sb.append("SupportedTierList: " + getSupportedTierList() + ",");
        if (getSupportedAddonList() != null)
            sb.append("SupportedAddonList: " + getSupportedAddonList() + ",");
        if (getPlatformLifecycleState() != null)
            sb.append("PlatformLifecycleState: " + getPlatformLifecycleState() + ",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: " + getPlatformVersion() + ",");
        if (getPlatformBranchName() != null)
            sb.append("PlatformBranchName: " + getPlatformBranchName() + ",");
        if (getPlatformBranchLifecycleState() != null)
            sb.append("PlatformBranchLifecycleState: " + getPlatformBranchLifecycleState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformOwner() == null) ? 0 : getPlatformOwner().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformStatus() == null) ? 0 : getPlatformStatus().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformCategory() == null) ? 0 : getPlatformCategory().hashCode());
        hashCode = prime * hashCode
                + ((getOperatingSystemName() == null) ? 0 : getOperatingSystemName().hashCode());
        hashCode = prime
                * hashCode
                + ((getOperatingSystemVersion() == null) ? 0 : getOperatingSystemVersion()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSupportedTierList() == null) ? 0 : getSupportedTierList().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedAddonList() == null) ? 0 : getSupportedAddonList().hashCode());
        hashCode = prime
                * hashCode
                + ((getPlatformLifecycleState() == null) ? 0 : getPlatformLifecycleState()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformBranchName() == null) ? 0 : getPlatformBranchName().hashCode());
        hashCode = prime
                * hashCode
                + ((getPlatformBranchLifecycleState() == null) ? 0
                        : getPlatformBranchLifecycleState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlatformSummary == false)
            return false;
        PlatformSummary other = (PlatformSummary) obj;

        if (other.getPlatformArn() == null ^ this.getPlatformArn() == null)
            return false;
        if (other.getPlatformArn() != null
                && other.getPlatformArn().equals(this.getPlatformArn()) == false)
            return false;
        if (other.getPlatformOwner() == null ^ this.getPlatformOwner() == null)
            return false;
        if (other.getPlatformOwner() != null
                && other.getPlatformOwner().equals(this.getPlatformOwner()) == false)
            return false;
        if (other.getPlatformStatus() == null ^ this.getPlatformStatus() == null)
            return false;
        if (other.getPlatformStatus() != null
                && other.getPlatformStatus().equals(this.getPlatformStatus()) == false)
            return false;
        if (other.getPlatformCategory() == null ^ this.getPlatformCategory() == null)
            return false;
        if (other.getPlatformCategory() != null
                && other.getPlatformCategory().equals(this.getPlatformCategory()) == false)
            return false;
        if (other.getOperatingSystemName() == null ^ this.getOperatingSystemName() == null)
            return false;
        if (other.getOperatingSystemName() != null
                && other.getOperatingSystemName().equals(this.getOperatingSystemName()) == false)
            return false;
        if (other.getOperatingSystemVersion() == null ^ this.getOperatingSystemVersion() == null)
            return false;
        if (other.getOperatingSystemVersion() != null
                && other.getOperatingSystemVersion().equals(this.getOperatingSystemVersion()) == false)
            return false;
        if (other.getSupportedTierList() == null ^ this.getSupportedTierList() == null)
            return false;
        if (other.getSupportedTierList() != null
                && other.getSupportedTierList().equals(this.getSupportedTierList()) == false)
            return false;
        if (other.getSupportedAddonList() == null ^ this.getSupportedAddonList() == null)
            return false;
        if (other.getSupportedAddonList() != null
                && other.getSupportedAddonList().equals(this.getSupportedAddonList()) == false)
            return false;
        if (other.getPlatformLifecycleState() == null ^ this.getPlatformLifecycleState() == null)
            return false;
        if (other.getPlatformLifecycleState() != null
                && other.getPlatformLifecycleState().equals(this.getPlatformLifecycleState()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null
                && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getPlatformBranchName() == null ^ this.getPlatformBranchName() == null)
            return false;
        if (other.getPlatformBranchName() != null
                && other.getPlatformBranchName().equals(this.getPlatformBranchName()) == false)
            return false;
        if (other.getPlatformBranchLifecycleState() == null
                ^ this.getPlatformBranchLifecycleState() == null)
            return false;
        if (other.getPlatformBranchLifecycleState() != null
                && other.getPlatformBranchLifecycleState().equals(
                        this.getPlatformBranchLifecycleState()) == false)
            return false;
        return true;
    }
}
