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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Settings for the action to emit HLS metadata
 */
public class HlsTimedMetadataScheduleActionSettings implements Serializable {
    /**
     * Base64 string formatted according to the ID3 specification:
     * http://id3.org/id3v2.4.0-structure
     */
    private String id3;

    /**
     * Base64 string formatted according to the ID3 specification:
     * http://id3.org/id3v2.4.0-structure
     *
     * @return Base64 string formatted according to the ID3 specification:
     *         http://id3.org/id3v2.4.0-structure
     */
    public String getId3() {
        return id3;
    }

    /**
     * Base64 string formatted according to the ID3 specification:
     * http://id3.org/id3v2.4.0-structure
     *
     * @param id3 Base64 string formatted according to the ID3 specification:
     *            http://id3.org/id3v2.4.0-structure
     */
    public void setId3(String id3) {
        this.id3 = id3;
    }

    /**
     * Base64 string formatted according to the ID3 specification:
     * http://id3.org/id3v2.4.0-structure
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id3 Base64 string formatted according to the ID3 specification:
     *            http://id3.org/id3v2.4.0-structure
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsTimedMetadataScheduleActionSettings withId3(String id3) {
        this.id3 = id3;
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
        if (getId3() != null)
            sb.append("Id3: " + getId3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId3() == null) ? 0 : getId3().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsTimedMetadataScheduleActionSettings == false)
            return false;
        HlsTimedMetadataScheduleActionSettings other = (HlsTimedMetadataScheduleActionSettings) obj;

        if (other.getId3() == null ^ this.getId3() == null)
            return false;
        if (other.getId3() != null && other.getId3().equals(this.getId3()) == false)
            return false;
        return true;
    }
}
