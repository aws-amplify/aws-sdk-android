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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new image recipe. Image recipes define how images are configured,
 * tested, and assessed.
 * </p>
 */
public class CreateImageRecipeRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The semantic version of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     */
    private String semanticVersion;

    /**
     * <p>
     * The components of the image recipe.
     * </p>
     */
    private java.util.List<ComponentConfiguration> components;

    /**
     * <p>
     * The parent image of the image recipe. The value of the string can be the
     * ARN of the parent image or an AMI ID. The format for the ARN follows this
     * example:
     * <code>arn:aws:imagebuilder:us-west-2:aws:image/windows-server-2016-english-full-base-x86/2019.x.x</code>
     * . The ARN ends with <code>/20xx.x.x</code>, which communicates to EC2
     * Image Builder that you want to use the latest AMI created in 20xx (year).
     * You can provide the specific version that you want to use, or you can use
     * a wildcard in all of the fields. If you enter an AMI ID for the string
     * value, you must have access to the AMI, and the AMI must be in the same
     * Region in which you are using Image Builder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String parentImage;

    /**
     * <p>
     * The block device mappings of the image recipe.
     * </p>
     */
    private java.util.List<InstanceBlockDeviceMapping> blockDeviceMappings;

    /**
     * <p>
     * The tags of the image recipe.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String clientToken;

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
    public CreateImageRecipeRequest withName(String name) {
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
    public CreateImageRecipeRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The semantic version of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @return <p>
     *         The semantic version of the image recipe.
     *         </p>
     */
    public String getSemanticVersion() {
        return semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the image recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @param semanticVersion <p>
     *            The semantic version of the image recipe.
     *            </p>
     */
    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the image recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @param semanticVersion <p>
     *            The semantic version of the image recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRecipeRequest withSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
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
    public CreateImageRecipeRequest withComponents(ComponentConfiguration... components) {
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
    public CreateImageRecipeRequest withComponents(
            java.util.Collection<ComponentConfiguration> components) {
        setComponents(components);
        return this;
    }

    /**
     * <p>
     * The parent image of the image recipe. The value of the string can be the
     * ARN of the parent image or an AMI ID. The format for the ARN follows this
     * example:
     * <code>arn:aws:imagebuilder:us-west-2:aws:image/windows-server-2016-english-full-base-x86/2019.x.x</code>
     * . The ARN ends with <code>/20xx.x.x</code>, which communicates to EC2
     * Image Builder that you want to use the latest AMI created in 20xx (year).
     * You can provide the specific version that you want to use, or you can use
     * a wildcard in all of the fields. If you enter an AMI ID for the string
     * value, you must have access to the AMI, and the AMI must be in the same
     * Region in which you are using Image Builder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The parent image of the image recipe. The value of the string can
     *         be the ARN of the parent image or an AMI ID. The format for the
     *         ARN follows this example:
     *         <code>arn:aws:imagebuilder:us-west-2:aws:image/windows-server-2016-english-full-base-x86/2019.x.x</code>
     *         . The ARN ends with <code>/20xx.x.x</code>, which communicates to
     *         EC2 Image Builder that you want to use the latest AMI created in
     *         20xx (year). You can provide the specific version that you want
     *         to use, or you can use a wildcard in all of the fields. If you
     *         enter an AMI ID for the string value, you must have access to the
     *         AMI, and the AMI must be in the same Region in which you are
     *         using Image Builder.
     *         </p>
     */
    public String getParentImage() {
        return parentImage;
    }

    /**
     * <p>
     * The parent image of the image recipe. The value of the string can be the
     * ARN of the parent image or an AMI ID. The format for the ARN follows this
     * example:
     * <code>arn:aws:imagebuilder:us-west-2:aws:image/windows-server-2016-english-full-base-x86/2019.x.x</code>
     * . The ARN ends with <code>/20xx.x.x</code>, which communicates to EC2
     * Image Builder that you want to use the latest AMI created in 20xx (year).
     * You can provide the specific version that you want to use, or you can use
     * a wildcard in all of the fields. If you enter an AMI ID for the string
     * value, you must have access to the AMI, and the AMI must be in the same
     * Region in which you are using Image Builder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param parentImage <p>
     *            The parent image of the image recipe. The value of the string
     *            can be the ARN of the parent image or an AMI ID. The format
     *            for the ARN follows this example:
     *            <code>arn:aws:imagebuilder:us-west-2:aws:image/windows-server-2016-english-full-base-x86/2019.x.x</code>
     *            . The ARN ends with <code>/20xx.x.x</code>, which communicates
     *            to EC2 Image Builder that you want to use the latest AMI
     *            created in 20xx (year). You can provide the specific version
     *            that you want to use, or you can use a wildcard in all of the
     *            fields. If you enter an AMI ID for the string value, you must
     *            have access to the AMI, and the AMI must be in the same Region
     *            in which you are using Image Builder.
     *            </p>
     */
    public void setParentImage(String parentImage) {
        this.parentImage = parentImage;
    }

    /**
     * <p>
     * The parent image of the image recipe. The value of the string can be the
     * ARN of the parent image or an AMI ID. The format for the ARN follows this
     * example:
     * <code>arn:aws:imagebuilder:us-west-2:aws:image/windows-server-2016-english-full-base-x86/2019.x.x</code>
     * . The ARN ends with <code>/20xx.x.x</code>, which communicates to EC2
     * Image Builder that you want to use the latest AMI created in 20xx (year).
     * You can provide the specific version that you want to use, or you can use
     * a wildcard in all of the fields. If you enter an AMI ID for the string
     * value, you must have access to the AMI, and the AMI must be in the same
     * Region in which you are using Image Builder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param parentImage <p>
     *            The parent image of the image recipe. The value of the string
     *            can be the ARN of the parent image or an AMI ID. The format
     *            for the ARN follows this example:
     *            <code>arn:aws:imagebuilder:us-west-2:aws:image/windows-server-2016-english-full-base-x86/2019.x.x</code>
     *            . The ARN ends with <code>/20xx.x.x</code>, which communicates
     *            to EC2 Image Builder that you want to use the latest AMI
     *            created in 20xx (year). You can provide the specific version
     *            that you want to use, or you can use a wildcard in all of the
     *            fields. If you enter an AMI ID for the string value, you must
     *            have access to the AMI, and the AMI must be in the same Region
     *            in which you are using Image Builder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRecipeRequest withParentImage(String parentImage) {
        this.parentImage = parentImage;
        return this;
    }

    /**
     * <p>
     * The block device mappings of the image recipe.
     * </p>
     *
     * @return <p>
     *         The block device mappings of the image recipe.
     *         </p>
     */
    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mappings of the image recipe.
     * </p>
     *
     * @param blockDeviceMappings <p>
     *            The block device mappings of the image recipe.
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
     * The block device mappings of the image recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            The block device mappings of the image recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRecipeRequest withBlockDeviceMappings(
            InstanceBlockDeviceMapping... blockDeviceMappings) {
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
     * The block device mappings of the image recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            The block device mappings of the image recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRecipeRequest withBlockDeviceMappings(
            java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
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
    public CreateImageRecipeRequest withTags(java.util.Map<String, String> tags) {
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
    public CreateImageRecipeRequest addtagsEntry(String key, String value) {
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
    public CreateImageRecipeRequest cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The idempotency token used to make this request idempotent.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param clientToken <p>
     *            The idempotency token used to make this request idempotent.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param clientToken <p>
     *            The idempotency token used to make this request idempotent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRecipeRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getSemanticVersion() != null)
            sb.append("semanticVersion: " + getSemanticVersion() + ",");
        if (getComponents() != null)
            sb.append("components: " + getComponents() + ",");
        if (getParentImage() != null)
            sb.append("parentImage: " + getParentImage() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("blockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken());
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
        hashCode = prime * hashCode
                + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode + ((getComponents() == null) ? 0 : getComponents().hashCode());
        hashCode = prime * hashCode
                + ((getParentImage() == null) ? 0 : getParentImage().hashCode());
        hashCode = prime * hashCode
                + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImageRecipeRequest == false)
            return false;
        CreateImageRecipeRequest other = (CreateImageRecipeRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null
                && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
