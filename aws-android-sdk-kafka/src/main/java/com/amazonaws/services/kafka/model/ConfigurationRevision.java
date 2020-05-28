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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

/**
 * 
 <p>
 * Describes a configuration revision.
 * </p>
 */
public class ConfigurationRevision implements Serializable {
    /**
     * 
     <p>
     * The time when the configuration revision was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * 
     <p>
     * The description of the configuration revision.
     * </p>
     */
    private String description;

    /**
     * 
     <p>
     * The revision number.
     * </p>
     */
    private Long revision;

    /**
     * 
     <p>
     * The time when the configuration revision was created.
     * </p>
     * 
     * @return <p>
     *         The time when the configuration revision was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * 
     <p>
     * The time when the configuration revision was created.
     * </p>
     * 
     * @param creationTime <p>
     *            The time when the configuration revision was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 
     <p>
     * The time when the configuration revision was created.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time when the configuration revision was created.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigurationRevision withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 
     <p>
     * The description of the configuration revision.
     * </p>
     * 
     * @return <p>
     *         The description of the configuration revision.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     <p>
     * The description of the configuration revision.
     * </p>
     * 
     * @param description <p>
     *            The description of the configuration revision.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     <p>
     * The description of the configuration revision.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the configuration revision.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigurationRevision withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     <p>
     * The revision number.
     * </p>
     * 
     * @return <p>
     *         The revision number.
     *         </p>
     */
    public Long getRevision() {
        return revision;
    }

    /**
     * 
     <p>
     * The revision number.
     * </p>
     * 
     * @param revision <p>
     *            The revision number.
     *            </p>
     */
    public void setRevision(Long revision) {
        this.revision = revision;
    }

    /**
     * 
     <p>
     * The revision number.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revision <p>
     *            The revision number.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigurationRevision withRevision(Long revision) {
        this.revision = revision;
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
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getRevision() != null)
            sb.append("Revision: " + getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationRevision == false)
            return false;
        ConfigurationRevision other = (ConfigurationRevision) obj;

        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }
}
