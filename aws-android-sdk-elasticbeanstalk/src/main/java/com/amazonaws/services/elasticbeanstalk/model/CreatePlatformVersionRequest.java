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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Create a new version of your custom platform.
 * </p>
 */
public class CreatePlatformVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of your custom platform.
     * </p>
     */
    private String platformName;

    /**
     * <p>
     * The number, such as 1.0.2, for the new platform version.
     * </p>
     */
    private String platformVersion;

    /**
     * <p>
     * The location of the platform definition archive in Amazon S3.
     * </p>
     */
    private S3Location platformDefinitionBundle;

    /**
     * <p>
     * The name of the builder environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String environmentName;

    /**
     * <p>
     * The configuration option settings to apply to the builder environment.
     * </p>
     */
    private java.util.List<ConfigurationOptionSetting> optionSettings;

    /**
     * <p>
     * Specifies the tags applied to the new platform version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the platform version.
     * Environments that you create using the platform version don't inherit the
     * tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of your custom platform.
     * </p>
     *
     * @return <p>
     *         The name of your custom platform.
     *         </p>
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     * <p>
     * The name of your custom platform.
     * </p>
     *
     * @param platformName <p>
     *            The name of your custom platform.
     *            </p>
     */
    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    /**
     * <p>
     * The name of your custom platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformName <p>
     *            The name of your custom platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlatformVersionRequest withPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }

    /**
     * <p>
     * The number, such as 1.0.2, for the new platform version.
     * </p>
     *
     * @return <p>
     *         The number, such as 1.0.2, for the new platform version.
     *         </p>
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /**
     * <p>
     * The number, such as 1.0.2, for the new platform version.
     * </p>
     *
     * @param platformVersion <p>
     *            The number, such as 1.0.2, for the new platform version.
     *            </p>
     */
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The number, such as 1.0.2, for the new platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformVersion <p>
     *            The number, such as 1.0.2, for the new platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlatformVersionRequest withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * <p>
     * The location of the platform definition archive in Amazon S3.
     * </p>
     *
     * @return <p>
     *         The location of the platform definition archive in Amazon S3.
     *         </p>
     */
    public S3Location getPlatformDefinitionBundle() {
        return platformDefinitionBundle;
    }

    /**
     * <p>
     * The location of the platform definition archive in Amazon S3.
     * </p>
     *
     * @param platformDefinitionBundle <p>
     *            The location of the platform definition archive in Amazon S3.
     *            </p>
     */
    public void setPlatformDefinitionBundle(S3Location platformDefinitionBundle) {
        this.platformDefinitionBundle = platformDefinitionBundle;
    }

    /**
     * <p>
     * The location of the platform definition archive in Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformDefinitionBundle <p>
     *            The location of the platform definition archive in Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlatformVersionRequest withPlatformDefinitionBundle(
            S3Location platformDefinitionBundle) {
        this.platformDefinitionBundle = platformDefinitionBundle;
        return this;
    }

    /**
     * <p>
     * The name of the builder environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         The name of the builder environment.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * The name of the builder environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of the builder environment.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the builder environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of the builder environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlatformVersionRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * <p>
     * The configuration option settings to apply to the builder environment.
     * </p>
     *
     * @return <p>
     *         The configuration option settings to apply to the builder
     *         environment.
     *         </p>
     */
    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        return optionSettings;
    }

    /**
     * <p>
     * The configuration option settings to apply to the builder environment.
     * </p>
     *
     * @param optionSettings <p>
     *            The configuration option settings to apply to the builder
     *            environment.
     *            </p>
     */
    public void setOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        if (optionSettings == null) {
            this.optionSettings = null;
            return;
        }

        this.optionSettings = new java.util.ArrayList<ConfigurationOptionSetting>(optionSettings);
    }

    /**
     * <p>
     * The configuration option settings to apply to the builder environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            The configuration option settings to apply to the builder
     *            environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlatformVersionRequest withOptionSettings(
            ConfigurationOptionSetting... optionSettings) {
        if (getOptionSettings() == null) {
            this.optionSettings = new java.util.ArrayList<ConfigurationOptionSetting>(
                    optionSettings.length);
        }
        for (ConfigurationOptionSetting value : optionSettings) {
            this.optionSettings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The configuration option settings to apply to the builder environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            The configuration option settings to apply to the builder
     *            environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlatformVersionRequest withOptionSettings(
            java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to the new platform version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the platform version.
     * Environments that you create using the platform version don't inherit the
     * tags.
     * </p>
     *
     * @return <p>
     *         Specifies the tags applied to the new platform version.
     *         </p>
     *         <p>
     *         Elastic Beanstalk applies these tags only to the platform
     *         version. Environments that you create using the platform version
     *         don't inherit the tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the tags applied to the new platform version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the platform version.
     * Environments that you create using the platform version don't inherit the
     * tags.
     * </p>
     *
     * @param tags <p>
     *            Specifies the tags applied to the new platform version.
     *            </p>
     *            <p>
     *            Elastic Beanstalk applies these tags only to the platform
     *            version. Environments that you create using the platform
     *            version don't inherit the tags.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Specifies the tags applied to the new platform version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the platform version.
     * Environments that you create using the platform version don't inherit the
     * tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Specifies the tags applied to the new platform version.
     *            </p>
     *            <p>
     *            Elastic Beanstalk applies these tags only to the platform
     *            version. Environments that you create using the platform
     *            version don't inherit the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlatformVersionRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to the new platform version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the platform version.
     * Environments that you create using the platform version don't inherit the
     * tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Specifies the tags applied to the new platform version.
     *            </p>
     *            <p>
     *            Elastic Beanstalk applies these tags only to the platform
     *            version. Environments that you create using the platform
     *            version don't inherit the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlatformVersionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: " + getPlatformVersion() + ",");
        if (getPlatformDefinitionBundle() != null)
            sb.append("PlatformDefinitionBundle: " + getPlatformDefinitionBundle() + ",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: " + getOptionSettings() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPlatformName() == null) ? 0 : getPlatformName().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getPlatformDefinitionBundle() == null) ? 0 : getPlatformDefinitionBundle()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode
                + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePlatformVersionRequest == false)
            return false;
        CreatePlatformVersionRequest other = (CreatePlatformVersionRequest) obj;

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
        if (other.getPlatformDefinitionBundle() == null
                ^ this.getPlatformDefinitionBundle() == null)
            return false;
        if (other.getPlatformDefinitionBundle() != null
                && other.getPlatformDefinitionBundle().equals(this.getPlatformDefinitionBundle()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null)
            return false;
        if (other.getOptionSettings() != null
                && other.getOptionSettings().equals(this.getOptionSettings()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
