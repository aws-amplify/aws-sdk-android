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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * Generate subtitles for your batch transcription job.
 * </p>
 */
public class Subtitles implements Serializable {
    /**
     * <p>
     * Specify the output format for your subtitle file.
     * </p>
     */
    private java.util.List<String> formats;

    /**
     * <p>
     * Specify the output format for your subtitle file.
     * </p>
     *
     * @return <p>
     *         Specify the output format for your subtitle file.
     *         </p>
     */
    public java.util.List<String> getFormats() {
        return formats;
    }

    /**
     * <p>
     * Specify the output format for your subtitle file.
     * </p>
     *
     * @param formats <p>
     *            Specify the output format for your subtitle file.
     *            </p>
     */
    public void setFormats(java.util.Collection<String> formats) {
        if (formats == null) {
            this.formats = null;
            return;
        }

        this.formats = new java.util.ArrayList<String>(formats);
    }

    /**
     * <p>
     * Specify the output format for your subtitle file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param formats <p>
     *            Specify the output format for your subtitle file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subtitles withFormats(String... formats) {
        if (getFormats() == null) {
            this.formats = new java.util.ArrayList<String>(formats.length);
        }
        for (String value : formats) {
            this.formats.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specify the output format for your subtitle file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param formats <p>
     *            Specify the output format for your subtitle file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subtitles withFormats(java.util.Collection<String> formats) {
        setFormats(formats);
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
        if (getFormats() != null)
            sb.append("Formats: " + getFormats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormats() == null) ? 0 : getFormats().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subtitles == false)
            return false;
        Subtitles other = (Subtitles) obj;

        if (other.getFormats() == null ^ this.getFormats() == null)
            return false;
        if (other.getFormats() != null && other.getFormats().equals(this.getFormats()) == false)
            return false;
        return true;
    }
}
