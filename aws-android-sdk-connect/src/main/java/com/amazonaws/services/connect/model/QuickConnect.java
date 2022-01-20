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
 * Contains information about a quick connect.
 * </p>
 */
public class QuickConnect implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quick connect.
     * </p>
     */
    private String quickConnectARN;

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     */
    private String quickConnectId;

    /**
     * <p>
     * The name of the quick connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     */
    private String name;

    /**
     * <p>
     * The description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     */
    private String description;

    /**
     * <p>
     * Contains information about the quick connect.
     * </p>
     */
    private QuickConnectConfig quickConnectConfig;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quick connect.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the quick connect.
     *         </p>
     */
    public String getQuickConnectARN() {
        return quickConnectARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quick connect.
     * </p>
     *
     * @param quickConnectARN <p>
     *            The Amazon Resource Name (ARN) of the quick connect.
     *            </p>
     */
    public void setQuickConnectARN(String quickConnectARN) {
        this.quickConnectARN = quickConnectARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the quick connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quickConnectARN <p>
     *            The Amazon Resource Name (ARN) of the quick connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QuickConnect withQuickConnectARN(String quickConnectARN) {
        this.quickConnectARN = quickConnectARN;
        return this;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     *
     * @return <p>
     *         The identifier for the quick connect.
     *         </p>
     */
    public String getQuickConnectId() {
        return quickConnectId;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     *
     * @param quickConnectId <p>
     *            The identifier for the quick connect.
     *            </p>
     */
    public void setQuickConnectId(String quickConnectId) {
        this.quickConnectId = quickConnectId;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quickConnectId <p>
     *            The identifier for the quick connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QuickConnect withQuickConnectId(String quickConnectId) {
        this.quickConnectId = quickConnectId;
        return this;
    }

    /**
     * <p>
     * The name of the quick connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @return <p>
     *         The name of the quick connect.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the quick connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param name <p>
     *            The name of the quick connect.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the quick connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param name <p>
     *            The name of the quick connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QuickConnect withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @return <p>
     *         The description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @param description <p>
     *            The description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @param description <p>
     *            The description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QuickConnect withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Contains information about the quick connect.
     * </p>
     *
     * @return <p>
     *         Contains information about the quick connect.
     *         </p>
     */
    public QuickConnectConfig getQuickConnectConfig() {
        return quickConnectConfig;
    }

    /**
     * <p>
     * Contains information about the quick connect.
     * </p>
     *
     * @param quickConnectConfig <p>
     *            Contains information about the quick connect.
     *            </p>
     */
    public void setQuickConnectConfig(QuickConnectConfig quickConnectConfig) {
        this.quickConnectConfig = quickConnectConfig;
    }

    /**
     * <p>
     * Contains information about the quick connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quickConnectConfig <p>
     *            Contains information about the quick connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QuickConnect withQuickConnectConfig(QuickConnectConfig quickConnectConfig) {
        this.quickConnectConfig = quickConnectConfig;
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
    public QuickConnect withTags(java.util.Map<String, String> tags) {
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
    public QuickConnect addTagsEntry(String key, String value) {
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
    public QuickConnect clearTagsEntries() {
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
        if (getQuickConnectARN() != null)
            sb.append("QuickConnectARN: " + getQuickConnectARN() + ",");
        if (getQuickConnectId() != null)
            sb.append("QuickConnectId: " + getQuickConnectId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getQuickConnectConfig() != null)
            sb.append("QuickConnectConfig: " + getQuickConnectConfig() + ",");
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
                + ((getQuickConnectARN() == null) ? 0 : getQuickConnectARN().hashCode());
        hashCode = prime * hashCode
                + ((getQuickConnectId() == null) ? 0 : getQuickConnectId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getQuickConnectConfig() == null) ? 0 : getQuickConnectConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuickConnect == false)
            return false;
        QuickConnect other = (QuickConnect) obj;

        if (other.getQuickConnectARN() == null ^ this.getQuickConnectARN() == null)
            return false;
        if (other.getQuickConnectARN() != null
                && other.getQuickConnectARN().equals(this.getQuickConnectARN()) == false)
            return false;
        if (other.getQuickConnectId() == null ^ this.getQuickConnectId() == null)
            return false;
        if (other.getQuickConnectId() != null
                && other.getQuickConnectId().equals(this.getQuickConnectId()) == false)
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
        if (other.getQuickConnectConfig() == null ^ this.getQuickConnectConfig() == null)
            return false;
        if (other.getQuickConnectConfig() != null
                && other.getQuickConnectConfig().equals(this.getQuickConnectConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
