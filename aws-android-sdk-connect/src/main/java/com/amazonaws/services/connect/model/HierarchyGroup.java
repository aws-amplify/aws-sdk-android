/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a hierarchy group.
 * </p>
 */
public class HierarchyGroup implements Serializable {
    /**
     * <p>
     * The identifier of the hierarchy group.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hierarchy group.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The name of the hierarchy group.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The identifier of the level in the hierarchy group.
     * </p>
     */
    private String levelId;

    /**
     * <p>
     * Information about the levels in the hierarchy group.
     * </p>
     */
    private HierarchyPath hierarchyPath;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of the hierarchy group.
     * </p>
     *
     * @return <p>
     *         The identifier of the hierarchy group.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the hierarchy group.
     * </p>
     *
     * @param id <p>
     *            The identifier of the hierarchy group.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the hierarchy group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier of the hierarchy group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyGroup withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hierarchy group.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the hierarchy group.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hierarchy group.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the hierarchy group.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hierarchy group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the hierarchy group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyGroup withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the hierarchy group.
     * </p>
     *
     * @return <p>
     *         The name of the hierarchy group.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the hierarchy group.
     * </p>
     *
     * @param name <p>
     *            The name of the hierarchy group.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the hierarchy group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the hierarchy group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The identifier of the level in the hierarchy group.
     * </p>
     *
     * @return <p>
     *         The identifier of the level in the hierarchy group.
     *         </p>
     */
    public String getLevelId() {
        return levelId;
    }

    /**
     * <p>
     * The identifier of the level in the hierarchy group.
     * </p>
     *
     * @param levelId <p>
     *            The identifier of the level in the hierarchy group.
     *            </p>
     */
    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    /**
     * <p>
     * The identifier of the level in the hierarchy group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param levelId <p>
     *            The identifier of the level in the hierarchy group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyGroup withLevelId(String levelId) {
        this.levelId = levelId;
        return this;
    }

    /**
     * <p>
     * Information about the levels in the hierarchy group.
     * </p>
     *
     * @return <p>
     *         Information about the levels in the hierarchy group.
     *         </p>
     */
    public HierarchyPath getHierarchyPath() {
        return hierarchyPath;
    }

    /**
     * <p>
     * Information about the levels in the hierarchy group.
     * </p>
     *
     * @param hierarchyPath <p>
     *            Information about the levels in the hierarchy group.
     *            </p>
     */
    public void setHierarchyPath(HierarchyPath hierarchyPath) {
        this.hierarchyPath = hierarchyPath;
    }

    /**
     * <p>
     * Information about the levels in the hierarchy group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hierarchyPath <p>
     *            Information about the levels in the hierarchy group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyGroup withHierarchyPath(HierarchyPath hierarchyPath) {
        this.hierarchyPath = hierarchyPath;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     *
     * @return <p>
     *         The tags used to organize, track, or control access for this
     *         resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyGroup withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyGroup addTagsEntry(String key, String value) {
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
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public HierarchyGroup clearTagsEntries() {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getLevelId() != null)
            sb.append("LevelId: " + getLevelId() + ",");
        if (getHierarchyPath() != null)
            sb.append("HierarchyPath: " + getHierarchyPath() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLevelId() == null) ? 0 : getLevelId().hashCode());
        hashCode = prime * hashCode
                + ((getHierarchyPath() == null) ? 0 : getHierarchyPath().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HierarchyGroup == false)
            return false;
        HierarchyGroup other = (HierarchyGroup) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLevelId() == null ^ this.getLevelId() == null)
            return false;
        if (other.getLevelId() != null && other.getLevelId().equals(this.getLevelId()) == false)
            return false;
        if (other.getHierarchyPath() == null ^ this.getHierarchyPath() == null)
            return false;
        if (other.getHierarchyPath() != null
                && other.getHierarchyPath().equals(this.getHierarchyPath()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
