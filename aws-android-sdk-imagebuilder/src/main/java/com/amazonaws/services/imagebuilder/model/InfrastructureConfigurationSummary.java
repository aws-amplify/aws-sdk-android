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
 * The infrastructure used when building EC2 AMIs.
 * </p>
 */
public class InfrastructureConfigurationSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
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
     * The name of the infrastructure configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The date on which the infrastructure configuration was created.
     * </p>
     */
    private String dateCreated;

    /**
     * <p>
     * The date on which the infrastructure configuration was last updated.
     * </p>
     */
    private String dateUpdated;

    /**
     * <p>
     * The tags attached to the image created by Image Builder.
     * </p>
     */
    private java.util.Map<String, String> resourceTags;

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
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
     *         The Amazon Resource Name (ARN) of the infrastructure
     *         configuration.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
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
     *            The Amazon Resource Name (ARN) of the infrastructure
     *            configuration.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
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
     *            The Amazon Resource Name (ARN) of the infrastructure
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InfrastructureConfigurationSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @return <p>
     *         The name of the infrastructure configuration.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @param name <p>
     *            The name of the infrastructure configuration.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @param name <p>
     *            The name of the infrastructure configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InfrastructureConfigurationSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The description of the infrastructure configuration.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the infrastructure configuration.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the infrastructure configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InfrastructureConfigurationSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was created.
     * </p>
     *
     * @return <p>
     *         The date on which the infrastructure configuration was created.
     *         </p>
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was created.
     * </p>
     *
     * @param dateCreated <p>
     *            The date on which the infrastructure configuration was
     *            created.
     *            </p>
     */
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateCreated <p>
     *            The date on which the infrastructure configuration was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InfrastructureConfigurationSummary withDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was last updated.
     * </p>
     *
     * @return <p>
     *         The date on which the infrastructure configuration was last
     *         updated.
     *         </p>
     */
    public String getDateUpdated() {
        return dateUpdated;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was last updated.
     * </p>
     *
     * @param dateUpdated <p>
     *            The date on which the infrastructure configuration was last
     *            updated.
     *            </p>
     */
    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateUpdated <p>
     *            The date on which the infrastructure configuration was last
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InfrastructureConfigurationSummary withDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * <p>
     * The tags attached to the image created by Image Builder.
     * </p>
     *
     * @return <p>
     *         The tags attached to the image created by Image Builder.
     *         </p>
     */
    public java.util.Map<String, String> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * The tags attached to the image created by Image Builder.
     * </p>
     *
     * @param resourceTags <p>
     *            The tags attached to the image created by Image Builder.
     *            </p>
     */
    public void setResourceTags(java.util.Map<String, String> resourceTags) {
        this.resourceTags = resourceTags;
    }

    /**
     * <p>
     * The tags attached to the image created by Image Builder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTags <p>
     *            The tags attached to the image created by Image Builder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InfrastructureConfigurationSummary withResourceTags(
            java.util.Map<String, String> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }

    /**
     * <p>
     * The tags attached to the image created by Image Builder.
     * </p>
     * <p>
     * The method adds a new key-value pair into resourceTags parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into resourceTags.
     * @param value The corresponding value of the entry to be added into
     *            resourceTags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InfrastructureConfigurationSummary addresourceTagsEntry(String key, String value) {
        if (null == this.resourceTags) {
            this.resourceTags = new java.util.HashMap<String, String>();
        }
        if (this.resourceTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.resourceTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into resourceTags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public InfrastructureConfigurationSummary clearresourceTagsEntries() {
        this.resourceTags = null;
        return this;
    }

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     *
     * @return <p>
     *         The tags of the infrastructure configuration.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     *
     * @param tags <p>
     *            The tags of the infrastructure configuration.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags of the infrastructure configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InfrastructureConfigurationSummary withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags of the infrastructure configuration.
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
    public InfrastructureConfigurationSummary addtagsEntry(String key, String value) {
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
    public InfrastructureConfigurationSummary cleartagsEntries() {
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
        if (getDateCreated() != null)
            sb.append("dateCreated: " + getDateCreated() + ",");
        if (getDateUpdated() != null)
            sb.append("dateUpdated: " + getDateUpdated() + ",");
        if (getResourceTags() != null)
            sb.append("resourceTags: " + getResourceTags() + ",");
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
        hashCode = prime * hashCode
                + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode
                + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode
                + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InfrastructureConfigurationSummary == false)
            return false;
        InfrastructureConfigurationSummary other = (InfrastructureConfigurationSummary) obj;

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
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null
                && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
