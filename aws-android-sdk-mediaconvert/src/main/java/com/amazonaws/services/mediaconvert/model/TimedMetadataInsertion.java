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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags
 * in your job. To include timed metadata, you must enable it here, enable it in
 * each output container, and specify tags and timecodes in ID3 insertion
 * (Id3Insertion) objects.
 */
public class TimedMetadataInsertion implements Serializable {
    /**
     * Id3Insertions contains the array of Id3Insertion instances.
     */
    private java.util.List<Id3Insertion> id3Insertions;

    /**
     * Id3Insertions contains the array of Id3Insertion instances.
     *
     * @return Id3Insertions contains the array of Id3Insertion instances.
     */
    public java.util.List<Id3Insertion> getId3Insertions() {
        return id3Insertions;
    }

    /**
     * Id3Insertions contains the array of Id3Insertion instances.
     *
     * @param id3Insertions Id3Insertions contains the array of Id3Insertion
     *            instances.
     */
    public void setId3Insertions(java.util.Collection<Id3Insertion> id3Insertions) {
        if (id3Insertions == null) {
            this.id3Insertions = null;
            return;
        }

        this.id3Insertions = new java.util.ArrayList<Id3Insertion>(id3Insertions);
    }

    /**
     * Id3Insertions contains the array of Id3Insertion instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id3Insertions Id3Insertions contains the array of Id3Insertion
     *            instances.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimedMetadataInsertion withId3Insertions(Id3Insertion... id3Insertions) {
        if (getId3Insertions() == null) {
            this.id3Insertions = new java.util.ArrayList<Id3Insertion>(id3Insertions.length);
        }
        for (Id3Insertion value : id3Insertions) {
            this.id3Insertions.add(value);
        }
        return this;
    }

    /**
     * Id3Insertions contains the array of Id3Insertion instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id3Insertions Id3Insertions contains the array of Id3Insertion
     *            instances.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimedMetadataInsertion withId3Insertions(java.util.Collection<Id3Insertion> id3Insertions) {
        setId3Insertions(id3Insertions);
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
        if (getId3Insertions() != null)
            sb.append("Id3Insertions: " + getId3Insertions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId3Insertions() == null) ? 0 : getId3Insertions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimedMetadataInsertion == false)
            return false;
        TimedMetadataInsertion other = (TimedMetadataInsertion) obj;

        if (other.getId3Insertions() == null ^ this.getId3Insertions() == null)
            return false;
        if (other.getId3Insertions() != null
                && other.getId3Insertions().equals(this.getId3Insertions()) == false)
            return false;
        return true;
    }
}
