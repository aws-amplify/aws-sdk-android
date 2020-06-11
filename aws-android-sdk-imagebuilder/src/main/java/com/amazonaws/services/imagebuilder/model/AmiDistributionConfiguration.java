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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

/**
 * <p>
 * Define and configure the output AMIs of the pipeline.
 * </p>
 */
public class AmiDistributionConfiguration implements Serializable {
    /**
     * <p>
     * The name of the distribution configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[-_A-Za-z0-9{][-_A-Za-z0-9\s:{}]+[-_A-Za-z0-9}]$<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the distribution configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The tags to apply to AMIs distributed to this Region.
     * </p>
     */
    private java.util.Map<String, String> amiTags;

    /**
     * <p>
     * Launch permissions can be used to configure which AWS accounts can use
     * the AMI to launch instances.
     * </p>
     */
    private LaunchPermissionConfiguration launchPermission;

    /**
     * <p>
     * The name of the distribution configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[-_A-Za-z0-9{][-_A-Za-z0-9\s:{}]+[-_A-Za-z0-9}]$<br/>
     *
     * @return <p>
     *         The name of the distribution configuration.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the distribution configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[-_A-Za-z0-9{][-_A-Za-z0-9\s:{}]+[-_A-Za-z0-9}]$<br/>
     *
     * @param name <p>
     *            The name of the distribution configuration.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the distribution configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[-_A-Za-z0-9{][-_A-Za-z0-9\s:{}]+[-_A-Za-z0-9}]$<br/>
     *
     * @param name <p>
     *            The name of the distribution configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AmiDistributionConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the distribution configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The description of the distribution configuration.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the distribution configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the distribution configuration.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the distribution configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the distribution configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AmiDistributionConfiguration withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The tags to apply to AMIs distributed to this Region.
     * </p>
     *
     * @return <p>
     *         The tags to apply to AMIs distributed to this Region.
     *         </p>
     */
    public java.util.Map<String, String> getAmiTags() {
        return amiTags;
    }

    /**
     * <p>
     * The tags to apply to AMIs distributed to this Region.
     * </p>
     *
     * @param amiTags <p>
     *            The tags to apply to AMIs distributed to this Region.
     *            </p>
     */
    public void setAmiTags(java.util.Map<String, String> amiTags) {
        this.amiTags = amiTags;
    }

    /**
     * <p>
     * The tags to apply to AMIs distributed to this Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amiTags <p>
     *            The tags to apply to AMIs distributed to this Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AmiDistributionConfiguration withAmiTags(java.util.Map<String, String> amiTags) {
        this.amiTags = amiTags;
        return this;
    }

    /**
     * <p>
     * The tags to apply to AMIs distributed to this Region.
     * </p>
     * <p>
     * The method adds a new key-value pair into amiTags parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into amiTags.
     * @param value The corresponding value of the entry to be added into
     *            amiTags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AmiDistributionConfiguration addamiTagsEntry(String key, String value) {
        if (null == this.amiTags) {
            this.amiTags = new java.util.HashMap<String, String>();
        }
        if (this.amiTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.amiTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into amiTags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AmiDistributionConfiguration clearamiTagsEntries() {
        this.amiTags = null;
        return this;
    }

    /**
     * <p>
     * Launch permissions can be used to configure which AWS accounts can use
     * the AMI to launch instances.
     * </p>
     *
     * @return <p>
     *         Launch permissions can be used to configure which AWS accounts
     *         can use the AMI to launch instances.
     *         </p>
     */
    public LaunchPermissionConfiguration getLaunchPermission() {
        return launchPermission;
    }

    /**
     * <p>
     * Launch permissions can be used to configure which AWS accounts can use
     * the AMI to launch instances.
     * </p>
     *
     * @param launchPermission <p>
     *            Launch permissions can be used to configure which AWS accounts
     *            can use the AMI to launch instances.
     *            </p>
     */
    public void setLaunchPermission(LaunchPermissionConfiguration launchPermission) {
        this.launchPermission = launchPermission;
    }

    /**
     * <p>
     * Launch permissions can be used to configure which AWS accounts can use
     * the AMI to launch instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchPermission <p>
     *            Launch permissions can be used to configure which AWS accounts
     *            can use the AMI to launch instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AmiDistributionConfiguration withLaunchPermission(
            LaunchPermissionConfiguration launchPermission) {
        this.launchPermission = launchPermission;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getAmiTags() != null)
            sb.append("amiTags: " + getAmiTags() + ",");
        if (getLaunchPermission() != null)
            sb.append("launchPermission: " + getLaunchPermission());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAmiTags() == null) ? 0 : getAmiTags().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchPermission() == null) ? 0 : getLaunchPermission().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmiDistributionConfiguration == false)
            return false;
        AmiDistributionConfiguration other = (AmiDistributionConfiguration) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAmiTags() == null ^ this.getAmiTags() == null)
            return false;
        if (other.getAmiTags() != null && other.getAmiTags().equals(this.getAmiTags()) == false)
            return false;
        if (other.getLaunchPermission() == null ^ this.getLaunchPermission() == null)
            return false;
        if (other.getLaunchPermission() != null
                && other.getLaunchPermission().equals(this.getLaunchPermission()) == false)
            return false;
        return true;
    }
}
