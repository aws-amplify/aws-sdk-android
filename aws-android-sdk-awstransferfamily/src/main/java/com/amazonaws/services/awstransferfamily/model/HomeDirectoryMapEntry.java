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

package com.amazonaws.services.awstransferfamily.model;

import java.io.Serializable;

/**
 * <p>
 * Represents an object that contains entries and a targets for
 * <code>HomeDirectoryMappings</code>.
 * </p>
 */
public class HomeDirectoryMapEntry implements Serializable {
    /**
     * <p>
     * Represents an entry and a target for <code>HomeDirectoryMappings</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^/.*<br/>
     */
    private String entry;

    /**
     * <p>
     * Represents the map target that is used in a
     * <code>HomeDirectorymapEntry</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^/.*<br/>
     */
    private String target;

    /**
     * <p>
     * Represents an entry and a target for <code>HomeDirectoryMappings</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^/.*<br/>
     *
     * @return <p>
     *         Represents an entry and a target for
     *         <code>HomeDirectoryMappings</code>.
     *         </p>
     */
    public String getEntry() {
        return entry;
    }

    /**
     * <p>
     * Represents an entry and a target for <code>HomeDirectoryMappings</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^/.*<br/>
     *
     * @param entry <p>
     *            Represents an entry and a target for
     *            <code>HomeDirectoryMappings</code>.
     *            </p>
     */
    public void setEntry(String entry) {
        this.entry = entry;
    }

    /**
     * <p>
     * Represents an entry and a target for <code>HomeDirectoryMappings</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^/.*<br/>
     *
     * @param entry <p>
     *            Represents an entry and a target for
     *            <code>HomeDirectoryMappings</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HomeDirectoryMapEntry withEntry(String entry) {
        this.entry = entry;
        return this;
    }

    /**
     * <p>
     * Represents the map target that is used in a
     * <code>HomeDirectorymapEntry</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^/.*<br/>
     *
     * @return <p>
     *         Represents the map target that is used in a
     *         <code>HomeDirectorymapEntry</code>.
     *         </p>
     */
    public String getTarget() {
        return target;
    }

    /**
     * <p>
     * Represents the map target that is used in a
     * <code>HomeDirectorymapEntry</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^/.*<br/>
     *
     * @param target <p>
     *            Represents the map target that is used in a
     *            <code>HomeDirectorymapEntry</code>.
     *            </p>
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * Represents the map target that is used in a
     * <code>HomeDirectorymapEntry</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^/.*<br/>
     *
     * @param target <p>
     *            Represents the map target that is used in a
     *            <code>HomeDirectorymapEntry</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HomeDirectoryMapEntry withTarget(String target) {
        this.target = target;
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
        if (getEntry() != null)
            sb.append("Entry: " + getEntry() + ",");
        if (getTarget() != null)
            sb.append("Target: " + getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntry() == null) ? 0 : getEntry().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HomeDirectoryMapEntry == false)
            return false;
        HomeDirectoryMapEntry other = (HomeDirectoryMapEntry) obj;

        if (other.getEntry() == null ^ this.getEntry() == null)
            return false;
        if (other.getEntry() != null && other.getEntry().equals(this.getEntry()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }
}
