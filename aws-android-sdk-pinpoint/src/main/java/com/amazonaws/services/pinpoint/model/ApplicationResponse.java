/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Application Response.
 */
public class ApplicationResponse implements Serializable {
    /**
     * The arn for the application.
     */
    private String arn;

    /**
     * The unique application ID.
     */
    private String id;

    /**
     * The display name of the application.
     */
    private String name;

    /**
     * The Tags for the application.
     */
    private java.util.Map<String, String> tags;

    /**
     * The arn for the application.
     *
     * @return The arn for the application.
     */
    public String getArn() {
        return arn;
    }

    /**
     * The arn for the application.
     *
     * @param arn The arn for the application.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The arn for the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn The arn for the application.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationResponse withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The unique application ID.
     *
     * @return The unique application ID.
     */
    public String getId() {
        return id;
    }

    /**
     * The unique application ID.
     *
     * @param id The unique application ID.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique application ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id The unique application ID.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The display name of the application.
     *
     * @return The display name of the application.
     */
    public String getName() {
        return name;
    }

    /**
     * The display name of the application.
     *
     * @param name The display name of the application.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The display name of the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The display name of the application.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The Tags for the application.
     *
     * @return The Tags for the application.
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The Tags for the application.
     *
     * @param tags The Tags for the application.
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The Tags for the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags The Tags for the application.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationResponse withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * The Tags for the application.
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationResponse addtagsEntry(String key, String value) {
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
    public ApplicationResponse cleartagsEntries() {
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
            sb.append("Arn: " + getArn() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
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
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationResponse == false)
            return false;
        ApplicationResponse other = (ApplicationResponse) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
