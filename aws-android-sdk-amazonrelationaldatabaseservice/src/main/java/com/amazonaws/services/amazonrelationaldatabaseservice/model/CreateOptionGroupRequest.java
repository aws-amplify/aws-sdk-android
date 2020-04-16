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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new option group. You can create up to 20 option groups.
 * </p>
 */
public class CreateOptionGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the name of the option group to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>myoptiongroup</code>
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * Specifies the name of the engine that this option group should be
     * associated with.
     * </p>
     */
    private String engineName;

    /**
     * <p>
     * Specifies the major version of the engine that this option group should
     * be associated with.
     * </p>
     */
    private String majorEngineVersion;

    /**
     * <p>
     * The description of the option group.
     * </p>
     */
    private String optionGroupDescription;

    /**
     * <p>
     * Tags to assign to the option group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies the name of the option group to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>myoptiongroup</code>
     * </p>
     *
     * @return <p>
     *         Specifies the name of the option group to be created.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters, numbers, or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>myoptiongroup</code>
     *         </p>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * <p>
     * Specifies the name of the option group to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>myoptiongroup</code>
     * </p>
     *
     * @param optionGroupName <p>
     *            Specifies the name of the option group to be created.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters, numbers, or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>myoptiongroup</code>
     *            </p>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * Specifies the name of the option group to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>myoptiongroup</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupName <p>
     *            Specifies the name of the option group to be created.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters, numbers, or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>myoptiongroup</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOptionGroupRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * <p>
     * Specifies the name of the engine that this option group should be
     * associated with.
     * </p>
     *
     * @return <p>
     *         Specifies the name of the engine that this option group should be
     *         associated with.
     *         </p>
     */
    public String getEngineName() {
        return engineName;
    }

    /**
     * <p>
     * Specifies the name of the engine that this option group should be
     * associated with.
     * </p>
     *
     * @param engineName <p>
     *            Specifies the name of the engine that this option group should
     *            be associated with.
     *            </p>
     */
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * Specifies the name of the engine that this option group should be
     * associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineName <p>
     *            Specifies the name of the engine that this option group should
     *            be associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOptionGroupRequest withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * <p>
     * Specifies the major version of the engine that this option group should
     * be associated with.
     * </p>
     *
     * @return <p>
     *         Specifies the major version of the engine that this option group
     *         should be associated with.
     *         </p>
     */
    public String getMajorEngineVersion() {
        return majorEngineVersion;
    }

    /**
     * <p>
     * Specifies the major version of the engine that this option group should
     * be associated with.
     * </p>
     *
     * @param majorEngineVersion <p>
     *            Specifies the major version of the engine that this option
     *            group should be associated with.
     *            </p>
     */
    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }

    /**
     * <p>
     * Specifies the major version of the engine that this option group should
     * be associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param majorEngineVersion <p>
     *            Specifies the major version of the engine that this option
     *            group should be associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOptionGroupRequest withMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
        return this;
    }

    /**
     * <p>
     * The description of the option group.
     * </p>
     *
     * @return <p>
     *         The description of the option group.
     *         </p>
     */
    public String getOptionGroupDescription() {
        return optionGroupDescription;
    }

    /**
     * <p>
     * The description of the option group.
     * </p>
     *
     * @param optionGroupDescription <p>
     *            The description of the option group.
     *            </p>
     */
    public void setOptionGroupDescription(String optionGroupDescription) {
        this.optionGroupDescription = optionGroupDescription;
    }

    /**
     * <p>
     * The description of the option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupDescription <p>
     *            The description of the option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOptionGroupRequest withOptionGroupDescription(String optionGroupDescription) {
        this.optionGroupDescription = optionGroupDescription;
        return this;
    }

    /**
     * <p>
     * Tags to assign to the option group.
     * </p>
     *
     * @return <p>
     *         Tags to assign to the option group.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to assign to the option group.
     * </p>
     *
     * @param tags <p>
     *            Tags to assign to the option group.
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
     * Tags to assign to the option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to assign to the option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOptionGroupRequest withTags(Tag... tags) {
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
     * Tags to assign to the option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to assign to the option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOptionGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getEngineName() != null)
            sb.append("EngineName: " + getEngineName() + ",");
        if (getMajorEngineVersion() != null)
            sb.append("MajorEngineVersion: " + getMajorEngineVersion() + ",");
        if (getOptionGroupDescription() != null)
            sb.append("OptionGroupDescription: " + getOptionGroupDescription() + ",");
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
                + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode
                + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getOptionGroupDescription() == null) ? 0 : getOptionGroupDescription()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOptionGroupRequest == false)
            return false;
        CreateOptionGroupRequest other = (CreateOptionGroupRequest) obj;

        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null
                && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null
                && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null)
            return false;
        if (other.getMajorEngineVersion() != null
                && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false)
            return false;
        if (other.getOptionGroupDescription() == null ^ this.getOptionGroupDescription() == null)
            return false;
        if (other.getOptionGroupDescription() != null
                && other.getOptionGroupDescription().equals(this.getOptionGroupDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
