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

package com.amazonaws.services.transcribestreaming.model;

import java.io.Serializable;

/**
 * <p>
 * A list of possible transcriptions for the audio.
 * </p>
 */
public class Alternative implements Serializable {
    /**
     * <p>
     * The text that was transcribed from the audio.
     * </p>
     */
    private String transcript;

    /**
     * <p>
     * One or more alternative interpretations of the input audio.
     * </p>
     */
    private java.util.List<Item> items;

    /**
     * <p>
     * The text that was transcribed from the audio.
     * </p>
     *
     * @return <p>
     *         The text that was transcribed from the audio.
     *         </p>
     */
    public String getTranscript() {
        return transcript;
    }

    /**
     * <p>
     * The text that was transcribed from the audio.
     * </p>
     *
     * @param transcript <p>
     *            The text that was transcribed from the audio.
     *            </p>
     */
    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    /**
     * <p>
     * The text that was transcribed from the audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcript <p>
     *            The text that was transcribed from the audio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alternative withTranscript(String transcript) {
        this.transcript = transcript;
        return this;
    }

    /**
     * <p>
     * One or more alternative interpretations of the input audio.
     * </p>
     *
     * @return <p>
     *         One or more alternative interpretations of the input audio.
     *         </p>
     */
    public java.util.List<Item> getItems() {
        return items;
    }

    /**
     * <p>
     * One or more alternative interpretations of the input audio.
     * </p>
     *
     * @param items <p>
     *            One or more alternative interpretations of the input audio.
     *            </p>
     */
    public void setItems(java.util.Collection<Item> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<Item>(items);
    }

    /**
     * <p>
     * One or more alternative interpretations of the input audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            One or more alternative interpretations of the input audio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alternative withItems(Item... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<Item>(items.length);
        }
        for (Item value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more alternative interpretations of the input audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            One or more alternative interpretations of the input audio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alternative withItems(java.util.Collection<Item> items) {
        setItems(items);
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
        if (getTranscript() != null)
            sb.append("Transcript: " + getTranscript() + ",");
        if (getItems() != null)
            sb.append("Items: " + getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Alternative == false)
            return false;
        Alternative other = (Alternative) obj;

        if (other.getTranscript() == null ^ this.getTranscript() == null)
            return false;
        if (other.getTranscript() != null
                && other.getTranscript().equals(this.getTranscript()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }
}
