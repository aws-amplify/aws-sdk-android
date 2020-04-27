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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an archive rule.
 * </p>
 */
public class ArchiveRuleSummary implements Serializable {
    /**
     * <p>
     * The time at which the archive rule was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * A filter used to define the archive rule.
     * </p>
     */
    private java.util.Map<String, Criterion> filter;

    /**
     * <p>
     * The name of the archive rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     */
    private String ruleName;

    /**
     * <p>
     * The time at which the archive rule was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The time at which the archive rule was created.
     * </p>
     *
     * @return <p>
     *         The time at which the archive rule was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The time at which the archive rule was created.
     * </p>
     *
     * @param createdAt <p>
     *            The time at which the archive rule was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the archive rule was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The time at which the archive rule was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchiveRuleSummary withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * A filter used to define the archive rule.
     * </p>
     *
     * @return <p>
     *         A filter used to define the archive rule.
     *         </p>
     */
    public java.util.Map<String, Criterion> getFilter() {
        return filter;
    }

    /**
     * <p>
     * A filter used to define the archive rule.
     * </p>
     *
     * @param filter <p>
     *            A filter used to define the archive rule.
     *            </p>
     */
    public void setFilter(java.util.Map<String, Criterion> filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A filter used to define the archive rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            A filter used to define the archive rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchiveRuleSummary withFilter(java.util.Map<String, Criterion> filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * A filter used to define the archive rule.
     * </p>
     * <p>
     * The method adds a new key-value pair into filter parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into filter.
     * @param value The corresponding value of the entry to be added into
     *            filter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchiveRuleSummary addfilterEntry(String key, Criterion value) {
        if (null == this.filter) {
            this.filter = new java.util.HashMap<String, Criterion>();
        }
        if (this.filter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.filter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ArchiveRuleSummary clearfilterEntries() {
        this.filter = null;
        return this;
    }

    /**
     * <p>
     * The name of the archive rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @return <p>
     *         The name of the archive rule.
     *         </p>
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * <p>
     * The name of the archive rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @param ruleName <p>
     *            The name of the archive rule.
     *            </p>
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the archive rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @param ruleName <p>
     *            The name of the archive rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchiveRuleSummary withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * <p>
     * The time at which the archive rule was last updated.
     * </p>
     *
     * @return <p>
     *         The time at which the archive rule was last updated.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The time at which the archive rule was last updated.
     * </p>
     *
     * @param updatedAt <p>
     *            The time at which the archive rule was last updated.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the archive rule was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The time at which the archive rule was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchiveRuleSummary withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
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
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getFilter() != null)
            sb.append("filter: " + getFilter() + ",");
        if (getRuleName() != null)
            sb.append("ruleName: " + getRuleName() + ",");
        if (getUpdatedAt() != null)
            sb.append("updatedAt: " + getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArchiveRuleSummary == false)
            return false;
        ArchiveRuleSummary other = (ArchiveRuleSummary) obj;

        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null
                && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }
}
