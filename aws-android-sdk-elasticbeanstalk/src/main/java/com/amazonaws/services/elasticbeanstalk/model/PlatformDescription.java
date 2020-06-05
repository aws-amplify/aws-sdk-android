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
 * Detailed information about a platform version.
 * </p>
 */
public class PlatformDescription implements Serializable {
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
     * The name of the platform version.
     * </p>
     */
    private String platformName;

    /**
     * <p>
     * The version of the platform version.
     * </p>
     */
    private String platformVersion;

    /**
     * <p>
     * The name of the solution stack used by the platform version.
     * </p>
     */
    private String solutionStackName;

    /**
     * <p>
     * The status of the platform version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Failed, Ready, Deleting, Deleted
     */
    private String platformStatus;

    /**
     * <p>
     * The date when the platform version was created.
     * </p>
     */
    private java.util.Date dateCreated;

    /**
     * <p>
     * The date when the platform version was last updated.
     * </p>
     */
    private java.util.Date dateUpdated;

    /**
     * <p>
     * The category of the platform version.
     * </p>
     */
    private String platformCategory;

    /**
     * <p>
     * The description of the platform version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     */
    private String description;

    /**
     * <p>
     * Information about the maintainer of the platform version.
     * </p>
     */
    private String maintainer;

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
     * The programming languages supported by the platform version.
     * </p>
     */
    private java.util.List<PlatformProgrammingLanguage> programmingLanguages;

    /**
     * <p>
     * The frameworks supported by the platform version.
     * </p>
     */
    private java.util.List<PlatformFramework> frameworks;

    /**
     * <p>
     * The custom AMIs supported by the platform version.
     * </p>
     */
    private java.util.List<CustomAmi> customAmiList;

    /**
     * <p>
     * The tiers supported by the platform version.
     * </p>
     */
    private java.util.List<String> supportedTierList;

    /**
     * <p>
     * The additions supported by the platform version.
     * </p>
     */
    private java.util.List<String> supportedAddonList;

    /**
     * <p>
     * The state of the platform version in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>Recommended</code> | <code>null</code>
     * </p>
     * <p>
     * If a null value is returned, the platform version isn't the recommended
     * one for its branch. Each platform branch has a single recommended
     * platform version, typically the most recent one.
     * </p>
     */
    private String platformLifecycleState;

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
     * Possible values: <code>Beta</code> | <code>Supported</code> |
     * <code>Deprecated</code> | <code>Retired</code>
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
    public PlatformDescription withPlatformArn(String platformArn) {
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
    public PlatformDescription withPlatformOwner(String platformOwner) {
        this.platformOwner = platformOwner;
        return this;
    }

    /**
     * <p>
     * The name of the platform version.
     * </p>
     *
     * @return <p>
     *         The name of the platform version.
     *         </p>
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     * <p>
     * The name of the platform version.
     * </p>
     *
     * @param platformName <p>
     *            The name of the platform version.
     *            </p>
     */
    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    /**
     * <p>
     * The name of the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformName <p>
     *            The name of the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }

    /**
     * <p>
     * The version of the platform version.
     * </p>
     *
     * @return <p>
     *         The version of the platform version.
     *         </p>
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /**
     * <p>
     * The version of the platform version.
     * </p>
     *
     * @param platformVersion <p>
     *            The version of the platform version.
     *            </p>
     */
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The version of the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformVersion <p>
     *            The version of the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * <p>
     * The name of the solution stack used by the platform version.
     * </p>
     *
     * @return <p>
     *         The name of the solution stack used by the platform version.
     *         </p>
     */
    public String getSolutionStackName() {
        return solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack used by the platform version.
     * </p>
     *
     * @param solutionStackName <p>
     *            The name of the solution stack used by the platform version.
     *            </p>
     */
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack used by the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionStackName <p>
     *            The name of the solution stack used by the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }

    /**
     * <p>
     * The status of the platform version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Failed, Ready, Deleting, Deleted
     *
     * @return <p>
     *         The status of the platform version.
     *         </p>
     * @see PlatformStatus
     */
    public String getPlatformStatus() {
        return platformStatus;
    }

    /**
     * <p>
     * The status of the platform version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Failed, Ready, Deleting, Deleted
     *
     * @param platformStatus <p>
     *            The status of the platform version.
     *            </p>
     * @see PlatformStatus
     */
    public void setPlatformStatus(String platformStatus) {
        this.platformStatus = platformStatus;
    }

    /**
     * <p>
     * The status of the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Failed, Ready, Deleting, Deleted
     *
     * @param platformStatus <p>
     *            The status of the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlatformStatus
     */
    public PlatformDescription withPlatformStatus(String platformStatus) {
        this.platformStatus = platformStatus;
        return this;
    }

    /**
     * <p>
     * The status of the platform version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Failed, Ready, Deleting, Deleted
     *
     * @param platformStatus <p>
     *            The status of the platform version.
     *            </p>
     * @see PlatformStatus
     */
    public void setPlatformStatus(PlatformStatus platformStatus) {
        this.platformStatus = platformStatus.toString();
    }

    /**
     * <p>
     * The status of the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Failed, Ready, Deleting, Deleted
     *
     * @param platformStatus <p>
     *            The status of the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlatformStatus
     */
    public PlatformDescription withPlatformStatus(PlatformStatus platformStatus) {
        this.platformStatus = platformStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date when the platform version was created.
     * </p>
     *
     * @return <p>
     *         The date when the platform version was created.
     *         </p>
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**
     * <p>
     * The date when the platform version was created.
     * </p>
     *
     * @param dateCreated <p>
     *            The date when the platform version was created.
     *            </p>
     */
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date when the platform version was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateCreated <p>
     *            The date when the platform version was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * <p>
     * The date when the platform version was last updated.
     * </p>
     *
     * @return <p>
     *         The date when the platform version was last updated.
     *         </p>
     */
    public java.util.Date getDateUpdated() {
        return dateUpdated;
    }

    /**
     * <p>
     * The date when the platform version was last updated.
     * </p>
     *
     * @param dateUpdated <p>
     *            The date when the platform version was last updated.
     *            </p>
     */
    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The date when the platform version was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateUpdated <p>
     *            The date when the platform version was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * <p>
     * The category of the platform version.
     * </p>
     *
     * @return <p>
     *         The category of the platform version.
     *         </p>
     */
    public String getPlatformCategory() {
        return platformCategory;
    }

    /**
     * <p>
     * The category of the platform version.
     * </p>
     *
     * @param platformCategory <p>
     *            The category of the platform version.
     *            </p>
     */
    public void setPlatformCategory(String platformCategory) {
        this.platformCategory = platformCategory;
    }

    /**
     * <p>
     * The category of the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformCategory <p>
     *            The category of the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withPlatformCategory(String platformCategory) {
        this.platformCategory = platformCategory;
        return this;
    }

    /**
     * <p>
     * The description of the platform version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @return <p>
     *         The description of the platform version.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the platform version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            The description of the platform version.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            The description of the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Information about the maintainer of the platform version.
     * </p>
     *
     * @return <p>
     *         Information about the maintainer of the platform version.
     *         </p>
     */
    public String getMaintainer() {
        return maintainer;
    }

    /**
     * <p>
     * Information about the maintainer of the platform version.
     * </p>
     *
     * @param maintainer <p>
     *            Information about the maintainer of the platform version.
     *            </p>
     */
    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    /**
     * <p>
     * Information about the maintainer of the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maintainer <p>
     *            Information about the maintainer of the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withMaintainer(String maintainer) {
        this.maintainer = maintainer;
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
    public PlatformDescription withOperatingSystemName(String operatingSystemName) {
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
    public PlatformDescription withOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
        return this;
    }

    /**
     * <p>
     * The programming languages supported by the platform version.
     * </p>
     *
     * @return <p>
     *         The programming languages supported by the platform version.
     *         </p>
     */
    public java.util.List<PlatformProgrammingLanguage> getProgrammingLanguages() {
        return programmingLanguages;
    }

    /**
     * <p>
     * The programming languages supported by the platform version.
     * </p>
     *
     * @param programmingLanguages <p>
     *            The programming languages supported by the platform version.
     *            </p>
     */
    public void setProgrammingLanguages(
            java.util.Collection<PlatformProgrammingLanguage> programmingLanguages) {
        if (programmingLanguages == null) {
            this.programmingLanguages = null;
            return;
        }

        this.programmingLanguages = new java.util.ArrayList<PlatformProgrammingLanguage>(
                programmingLanguages);
    }

    /**
     * <p>
     * The programming languages supported by the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param programmingLanguages <p>
     *            The programming languages supported by the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withProgrammingLanguages(
            PlatformProgrammingLanguage... programmingLanguages) {
        if (getProgrammingLanguages() == null) {
            this.programmingLanguages = new java.util.ArrayList<PlatformProgrammingLanguage>(
                    programmingLanguages.length);
        }
        for (PlatformProgrammingLanguage value : programmingLanguages) {
            this.programmingLanguages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The programming languages supported by the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param programmingLanguages <p>
     *            The programming languages supported by the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withProgrammingLanguages(
            java.util.Collection<PlatformProgrammingLanguage> programmingLanguages) {
        setProgrammingLanguages(programmingLanguages);
        return this;
    }

    /**
     * <p>
     * The frameworks supported by the platform version.
     * </p>
     *
     * @return <p>
     *         The frameworks supported by the platform version.
     *         </p>
     */
    public java.util.List<PlatformFramework> getFrameworks() {
        return frameworks;
    }

    /**
     * <p>
     * The frameworks supported by the platform version.
     * </p>
     *
     * @param frameworks <p>
     *            The frameworks supported by the platform version.
     *            </p>
     */
    public void setFrameworks(java.util.Collection<PlatformFramework> frameworks) {
        if (frameworks == null) {
            this.frameworks = null;
            return;
        }

        this.frameworks = new java.util.ArrayList<PlatformFramework>(frameworks);
    }

    /**
     * <p>
     * The frameworks supported by the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param frameworks <p>
     *            The frameworks supported by the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withFrameworks(PlatformFramework... frameworks) {
        if (getFrameworks() == null) {
            this.frameworks = new java.util.ArrayList<PlatformFramework>(frameworks.length);
        }
        for (PlatformFramework value : frameworks) {
            this.frameworks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The frameworks supported by the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param frameworks <p>
     *            The frameworks supported by the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withFrameworks(java.util.Collection<PlatformFramework> frameworks) {
        setFrameworks(frameworks);
        return this;
    }

    /**
     * <p>
     * The custom AMIs supported by the platform version.
     * </p>
     *
     * @return <p>
     *         The custom AMIs supported by the platform version.
     *         </p>
     */
    public java.util.List<CustomAmi> getCustomAmiList() {
        return customAmiList;
    }

    /**
     * <p>
     * The custom AMIs supported by the platform version.
     * </p>
     *
     * @param customAmiList <p>
     *            The custom AMIs supported by the platform version.
     *            </p>
     */
    public void setCustomAmiList(java.util.Collection<CustomAmi> customAmiList) {
        if (customAmiList == null) {
            this.customAmiList = null;
            return;
        }

        this.customAmiList = new java.util.ArrayList<CustomAmi>(customAmiList);
    }

    /**
     * <p>
     * The custom AMIs supported by the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customAmiList <p>
     *            The custom AMIs supported by the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withCustomAmiList(CustomAmi... customAmiList) {
        if (getCustomAmiList() == null) {
            this.customAmiList = new java.util.ArrayList<CustomAmi>(customAmiList.length);
        }
        for (CustomAmi value : customAmiList) {
            this.customAmiList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The custom AMIs supported by the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customAmiList <p>
     *            The custom AMIs supported by the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withCustomAmiList(java.util.Collection<CustomAmi> customAmiList) {
        setCustomAmiList(customAmiList);
        return this;
    }

    /**
     * <p>
     * The tiers supported by the platform version.
     * </p>
     *
     * @return <p>
     *         The tiers supported by the platform version.
     *         </p>
     */
    public java.util.List<String> getSupportedTierList() {
        return supportedTierList;
    }

    /**
     * <p>
     * The tiers supported by the platform version.
     * </p>
     *
     * @param supportedTierList <p>
     *            The tiers supported by the platform version.
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
     * The tiers supported by the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedTierList <p>
     *            The tiers supported by the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withSupportedTierList(String... supportedTierList) {
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
     * The tiers supported by the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedTierList <p>
     *            The tiers supported by the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withSupportedTierList(java.util.Collection<String> supportedTierList) {
        setSupportedTierList(supportedTierList);
        return this;
    }

    /**
     * <p>
     * The additions supported by the platform version.
     * </p>
     *
     * @return <p>
     *         The additions supported by the platform version.
     *         </p>
     */
    public java.util.List<String> getSupportedAddonList() {
        return supportedAddonList;
    }

    /**
     * <p>
     * The additions supported by the platform version.
     * </p>
     *
     * @param supportedAddonList <p>
     *            The additions supported by the platform version.
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
     * The additions supported by the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedAddonList <p>
     *            The additions supported by the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withSupportedAddonList(String... supportedAddonList) {
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
     * The additions supported by the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedAddonList <p>
     *            The additions supported by the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withSupportedAddonList(
            java.util.Collection<String> supportedAddonList) {
        setSupportedAddonList(supportedAddonList);
        return this;
    }

    /**
     * <p>
     * The state of the platform version in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>Recommended</code> | <code>null</code>
     * </p>
     * <p>
     * If a null value is returned, the platform version isn't the recommended
     * one for its branch. Each platform branch has a single recommended
     * platform version, typically the most recent one.
     * </p>
     *
     * @return <p>
     *         The state of the platform version in its lifecycle.
     *         </p>
     *         <p>
     *         Possible values: <code>Recommended</code> | <code>null</code>
     *         </p>
     *         <p>
     *         If a null value is returned, the platform version isn't the
     *         recommended one for its branch. Each platform branch has a single
     *         recommended platform version, typically the most recent one.
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
     * Possible values: <code>Recommended</code> | <code>null</code>
     * </p>
     * <p>
     * If a null value is returned, the platform version isn't the recommended
     * one for its branch. Each platform branch has a single recommended
     * platform version, typically the most recent one.
     * </p>
     *
     * @param platformLifecycleState <p>
     *            The state of the platform version in its lifecycle.
     *            </p>
     *            <p>
     *            Possible values: <code>Recommended</code> | <code>null</code>
     *            </p>
     *            <p>
     *            If a null value is returned, the platform version isn't the
     *            recommended one for its branch. Each platform branch has a
     *            single recommended platform version, typically the most recent
     *            one.
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
     * Possible values: <code>Recommended</code> | <code>null</code>
     * </p>
     * <p>
     * If a null value is returned, the platform version isn't the recommended
     * one for its branch. Each platform branch has a single recommended
     * platform version, typically the most recent one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformLifecycleState <p>
     *            The state of the platform version in its lifecycle.
     *            </p>
     *            <p>
     *            Possible values: <code>Recommended</code> | <code>null</code>
     *            </p>
     *            <p>
     *            If a null value is returned, the platform version isn't the
     *            recommended one for its branch. Each platform branch has a
     *            single recommended platform version, typically the most recent
     *            one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withPlatformLifecycleState(String platformLifecycleState) {
        this.platformLifecycleState = platformLifecycleState;
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
    public PlatformDescription withPlatformBranchName(String platformBranchName) {
        this.platformBranchName = platformBranchName;
        return this;
    }

    /**
     * <p>
     * The state of the platform version's branch in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>Beta</code> | <code>Supported</code> |
     * <code>Deprecated</code> | <code>Retired</code>
     * </p>
     *
     * @return <p>
     *         The state of the platform version's branch in its lifecycle.
     *         </p>
     *         <p>
     *         Possible values: <code>Beta</code> | <code>Supported</code> |
     *         <code>Deprecated</code> | <code>Retired</code>
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
     * Possible values: <code>Beta</code> | <code>Supported</code> |
     * <code>Deprecated</code> | <code>Retired</code>
     * </p>
     *
     * @param platformBranchLifecycleState <p>
     *            The state of the platform version's branch in its lifecycle.
     *            </p>
     *            <p>
     *            Possible values: <code>Beta</code> | <code>Supported</code> |
     *            <code>Deprecated</code> | <code>Retired</code>
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
     * Possible values: <code>Beta</code> | <code>Supported</code> |
     * <code>Deprecated</code> | <code>Retired</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformBranchLifecycleState <p>
     *            The state of the platform version's branch in its lifecycle.
     *            </p>
     *            <p>
     *            Possible values: <code>Beta</code> | <code>Supported</code> |
     *            <code>Deprecated</code> | <code>Retired</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformDescription withPlatformBranchLifecycleState(String platformBranchLifecycleState) {
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
        if (getPlatformName() != null)
            sb.append("PlatformName: " + getPlatformName() + ",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: " + getPlatformVersion() + ",");
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: " + getSolutionStackName() + ",");
        if (getPlatformStatus() != null)
            sb.append("PlatformStatus: " + getPlatformStatus() + ",");
        if (getDateCreated() != null)
            sb.append("DateCreated: " + getDateCreated() + ",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: " + getDateUpdated() + ",");
        if (getPlatformCategory() != null)
            sb.append("PlatformCategory: " + getPlatformCategory() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getMaintainer() != null)
            sb.append("Maintainer: " + getMaintainer() + ",");
        if (getOperatingSystemName() != null)
            sb.append("OperatingSystemName: " + getOperatingSystemName() + ",");
        if (getOperatingSystemVersion() != null)
            sb.append("OperatingSystemVersion: " + getOperatingSystemVersion() + ",");
        if (getProgrammingLanguages() != null)
            sb.append("ProgrammingLanguages: " + getProgrammingLanguages() + ",");
        if (getFrameworks() != null)
            sb.append("Frameworks: " + getFrameworks() + ",");
        if (getCustomAmiList() != null)
            sb.append("CustomAmiList: " + getCustomAmiList() + ",");
        if (getSupportedTierList() != null)
            sb.append("SupportedTierList: " + getSupportedTierList() + ",");
        if (getSupportedAddonList() != null)
            sb.append("SupportedAddonList: " + getSupportedAddonList() + ",");
        if (getPlatformLifecycleState() != null)
            sb.append("PlatformLifecycleState: " + getPlatformLifecycleState() + ",");
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
                + ((getPlatformName() == null) ? 0 : getPlatformName().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode
                + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformStatus() == null) ? 0 : getPlatformStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode
                + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformCategory() == null) ? 0 : getPlatformCategory().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMaintainer() == null) ? 0 : getMaintainer().hashCode());
        hashCode = prime * hashCode
                + ((getOperatingSystemName() == null) ? 0 : getOperatingSystemName().hashCode());
        hashCode = prime
                * hashCode
                + ((getOperatingSystemVersion() == null) ? 0 : getOperatingSystemVersion()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProgrammingLanguages() == null) ? 0 : getProgrammingLanguages().hashCode());
        hashCode = prime * hashCode + ((getFrameworks() == null) ? 0 : getFrameworks().hashCode());
        hashCode = prime * hashCode
                + ((getCustomAmiList() == null) ? 0 : getCustomAmiList().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedTierList() == null) ? 0 : getSupportedTierList().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedAddonList() == null) ? 0 : getSupportedAddonList().hashCode());
        hashCode = prime
                * hashCode
                + ((getPlatformLifecycleState() == null) ? 0 : getPlatformLifecycleState()
                        .hashCode());
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

        if (obj instanceof PlatformDescription == false)
            return false;
        PlatformDescription other = (PlatformDescription) obj;

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
        if (other.getPlatformName() == null ^ this.getPlatformName() == null)
            return false;
        if (other.getPlatformName() != null
                && other.getPlatformName().equals(this.getPlatformName()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null
                && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null)
            return false;
        if (other.getSolutionStackName() != null
                && other.getSolutionStackName().equals(this.getSolutionStackName()) == false)
            return false;
        if (other.getPlatformStatus() == null ^ this.getPlatformStatus() == null)
            return false;
        if (other.getPlatformStatus() != null
                && other.getPlatformStatus().equals(this.getPlatformStatus()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null
                && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null
                && other.getDateUpdated().equals(this.getDateUpdated()) == false)
            return false;
        if (other.getPlatformCategory() == null ^ this.getPlatformCategory() == null)
            return false;
        if (other.getPlatformCategory() != null
                && other.getPlatformCategory().equals(this.getPlatformCategory()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMaintainer() == null ^ this.getMaintainer() == null)
            return false;
        if (other.getMaintainer() != null
                && other.getMaintainer().equals(this.getMaintainer()) == false)
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
        if (other.getProgrammingLanguages() == null ^ this.getProgrammingLanguages() == null)
            return false;
        if (other.getProgrammingLanguages() != null
                && other.getProgrammingLanguages().equals(this.getProgrammingLanguages()) == false)
            return false;
        if (other.getFrameworks() == null ^ this.getFrameworks() == null)
            return false;
        if (other.getFrameworks() != null
                && other.getFrameworks().equals(this.getFrameworks()) == false)
            return false;
        if (other.getCustomAmiList() == null ^ this.getCustomAmiList() == null)
            return false;
        if (other.getCustomAmiList() != null
                && other.getCustomAmiList().equals(this.getCustomAmiList()) == false)
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
