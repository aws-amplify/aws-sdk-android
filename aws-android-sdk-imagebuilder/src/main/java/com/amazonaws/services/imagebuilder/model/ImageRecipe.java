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
 * An image recipe.
 * </p>
 */
public class ImageRecipe implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe
     * |infrastructure
     * -configuration|distribution-configuration|component|image|image
     * -pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$
     * <br/>
     */
    private String arn;

    /**
     * <p>
     * The name of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The platform of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     */
    private String platform;

    /**
     * <p>
     * The owner of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String owner;

    /**
     * <p>
     * The version of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     */
    private String version;

    /**
     * <p>
     * The components of the image recipe.
     * </p>
     */
    private java.util.List<ComponentConfiguration> components;

    /**
     * <p>
     * The parent image of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String parentImage;

    /**
     * <p>
     * The block device mappings to apply when creating images from this recipe.
     * </p>
     */
    private java.util.List<InstanceBlockDeviceMapping> blockDeviceMappings;

    /**
     * <p>
     * The date on which this image recipe was created.
     * </p>
     */
    private String dateCreated;

    /**
     * <p>
     * The tags of the image recipe.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe
     * |infrastructure
     * -configuration|distribution-configuration|component|image|image
     * -pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the image recipe.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe
     * |infrastructure
     * -configuration|distribution-configuration|component|image|image
     * -pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$
     * <br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the image recipe.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe
     * |infrastructure
     * -configuration|distribution-configuration|component|image|image
     * -pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$
     * <br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the image recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageRecipe withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @return <p>
     *         The name of the image recipe.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @param name <p>
     *            The name of the image recipe.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the image recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @param name <p>
     *            The name of the image recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageRecipe withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The description of the image recipe.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the image recipe.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the image recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the image recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageRecipe withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The platform of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @return <p>
     *         The platform of the image recipe.
     *         </p>
     * @see Platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The platform of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the image recipe.
     *            </p>
     * @see Platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the image recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the image recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Platform
     */
    public ImageRecipe withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The platform of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the image recipe.
     *            </p>
     * @see Platform
     */
    public void setPlatform(Platform platform) {
        this.platform = platform.toString();
    }

    /**
     * <p>
     * The platform of the image recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the image recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Platform
     */
    public ImageRecipe withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The owner of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The owner of the image recipe.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The owner of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param owner <p>
     *            The owner of the image recipe.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the image recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param owner <p>
     *            The owner of the image recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageRecipe withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The version of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @return <p>
     *         The version of the image recipe.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @param version <p>
     *            The version of the image recipe.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the image recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @param version <p>
     *            The version of the image recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageRecipe withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The components of the image recipe.
     * </p>
     *
     * @return <p>
     *         The components of the image recipe.
     *         </p>
     */
    public java.util.List<ComponentConfiguration> getComponents() {
        return components;
    }

    /**
     * <p>
     * The components of the image recipe.
     * </p>
     *
     * @param components <p>
     *            The components of the image recipe.
     *            </p>
     */
    public void setComponents(java.util.Collection<ComponentConfiguration> components) {
        if (components == null) {
            this.components = null;
            return;
        }

        this.components = new java.util.ArrayList<ComponentConfiguration>(components);
    }

    /**
     * <p>
     * The components of the image recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param components <p>
     *            The components of the image recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageRecipe withComponents(ComponentConfiguration... components) {
        if (getComponents() == null) {
            this.components = new java.util.ArrayList<ComponentConfiguration>(components.length);
        }
        for (ComponentConfiguration value : components) {
            this.components.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The components of the image recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param components <p>
     *            The components of the image recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageRecipe withComponents(java.util.Collection<ComponentConfiguration> components) {
        setComponents(components);
        return this;
    }

    /**
     * <p>
     * The parent image of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The parent image of the image recipe.
     *         </p>
     */
    public String getParentImage() {
        return parentImage;
    }

    /**
     * <p>
     * The parent image of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param parentImage <p>
     *            The parent image of the image recipe.
     *            </p>
     */
    public void setParentImage(String parentImage) {
        this.parentImage = parentImage;
    }

    /**
     * <p>
     * The parent image of the image recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param parentImage <p>
     *            The parent image of the image recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageRecipe withParentImage(String parentImage) {
        this.parentImage = parentImage;
        return this;
    }

    /**
     * <p>
     * The block device mappings to apply when creating images from this recipe.
     * </p>
     *
     * @return <p>
     *         The block device mappings to apply when creating images from this
     *         recipe.
     *         </p>
     */
    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mappings to apply when creating images from this recipe.
     * </p>
     *
     * @param blockDeviceMappings <p>
     *            The block device mappings to apply when creating images from
     *            this recipe.
     *            </p>
     */
    public void setBlockDeviceMappings(
            java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new java.util.ArrayList<InstanceBlockDeviceMapping>(
                blockDeviceMappings);
    }

    /**
     * <p>
     * The block device mappings to apply when creating images from this recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            The block device mappings to apply when creating images from
     *            this recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageRecipe withBlockDeviceMappings(InstanceBlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) {
            this.blockDeviceMappings = new java.util.ArrayList<InstanceBlockDeviceMapping>(
                    blockDeviceMappings.length);
        }
        for (InstanceBlockDeviceMapping value : blockDeviceMappings) {
            this.blockDeviceMappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The block device mappings to apply when creating images from this recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            The block device mappings to apply when creating images from
     *            this recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageRecipe withBlockDeviceMappings(
            java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The date on which this image recipe was created.
     * </p>
     *
     * @return <p>
     *         The date on which this image recipe was created.
     *         </p>
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * <p>
     * The date on which this image recipe was created.
     * </p>
     *
     * @param dateCreated <p>
     *            The date on which this image recipe was created.
     *            </p>
     */
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date on which this image recipe was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateCreated <p>
     *            The date on which this image recipe was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageRecipe withDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * <p>
     * The tags of the image recipe.
     * </p>
     *
     * @return <p>
     *         The tags of the image recipe.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the image recipe.
     * </p>
     *
     * @param tags <p>
     *            The tags of the image recipe.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the image recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags of the image recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageRecipe withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags of the image recipe.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageRecipe addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ImageRecipe cleartagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getPlatform() != null)
            sb.append("platform: " + getPlatform() + ",");
        if (getOwner() != null)
            sb.append("owner: " + getOwner() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getComponents() != null)
            sb.append("components: " + getComponents() + ",");
        if (getParentImage() != null)
            sb.append("parentImage: " + getParentImage() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("blockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getDateCreated() != null)
            sb.append("dateCreated: " + getDateCreated() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getComponents() == null) ? 0 : getComponents().hashCode());
        hashCode = prime * hashCode
                + ((getParentImage() == null) ? 0 : getParentImage().hashCode());
        hashCode = prime * hashCode
                + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode
                + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageRecipe == false)
            return false;
        ImageRecipe other = (ImageRecipe) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getComponents() == null ^ this.getComponents() == null)
            return false;
        if (other.getComponents() != null
                && other.getComponents().equals(this.getComponents()) == false)
            return false;
        if (other.getParentImage() == null ^ this.getParentImage() == null)
            return false;
        if (other.getParentImage() != null
                && other.getParentImage().equals(this.getParentImage()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null
                && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null
                && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
