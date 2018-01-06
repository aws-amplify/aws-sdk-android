/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a matched event.
 * </p>
 */
public class MetricFilterMatchRecord implements Serializable {
    /**
     * <p>
     * The event number.
     * </p>
     */
    private Long eventNumber;

    /**
     * <p>
     * The raw event data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String eventMessage;

    /**
     * <p>
     * The values extracted from the event data by the filter.
     * </p>
     */
    private java.util.Map<String, String> extractedValues;

    /**
     * <p>
     * The event number.
     * </p>
     *
     * @return <p>
     *         The event number.
     *         </p>
     */
    public Long getEventNumber() {
        return eventNumber;
    }

    /**
     * <p>
     * The event number.
     * </p>
     *
     * @param eventNumber <p>
     *            The event number.
     *            </p>
     */
    public void setEventNumber(Long eventNumber) {
        this.eventNumber = eventNumber;
    }

    /**
     * <p>
     * The event number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventNumber <p>
     *            The event number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricFilterMatchRecord withEventNumber(Long eventNumber) {
        this.eventNumber = eventNumber;
        return this;
    }

    /**
     * <p>
     * The raw event data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The raw event data.
     *         </p>
     */
    public String getEventMessage() {
        return eventMessage;
    }

    /**
     * <p>
     * The raw event data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param eventMessage <p>
     *            The raw event data.
     *            </p>
     */
    public void setEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
    }

    /**
     * <p>
     * The raw event data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param eventMessage <p>
     *            The raw event data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricFilterMatchRecord withEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
        return this;
    }

    /**
     * <p>
     * The values extracted from the event data by the filter.
     * </p>
     *
     * @return <p>
     *         The values extracted from the event data by the filter.
     *         </p>
     */
    public java.util.Map<String, String> getExtractedValues() {
        return extractedValues;
    }

    /**
     * <p>
     * The values extracted from the event data by the filter.
     * </p>
     *
     * @param extractedValues <p>
     *            The values extracted from the event data by the filter.
     *            </p>
     */
    public void setExtractedValues(java.util.Map<String, String> extractedValues) {
        this.extractedValues = extractedValues;
    }

    /**
     * <p>
     * The values extracted from the event data by the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extractedValues <p>
     *            The values extracted from the event data by the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricFilterMatchRecord withExtractedValues(java.util.Map<String, String> extractedValues) {
        this.extractedValues = extractedValues;
        return this;
    }

    /**
     * <p>
     * The values extracted from the event data by the filter.
     * </p>
     * <p>
     * The method adds a new key-value pair into extractedValues parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into extractedValues.
     * @param value The corresponding value of the entry to be added into
     *            extractedValues.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricFilterMatchRecord addextractedValuesEntry(String key, String value) {
        if (null == this.extractedValues) {
            this.extractedValues = new java.util.HashMap<String, String>();
        }
        if (this.extractedValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.extractedValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into extractedValues.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public MetricFilterMatchRecord clearextractedValuesEntries() {
        this.extractedValues = null;
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
        if (getEventNumber() != null)
            sb.append("eventNumber: " + getEventNumber() + ",");
        if (getEventMessage() != null)
            sb.append("eventMessage: " + getEventMessage() + ",");
        if (getExtractedValues() != null)
            sb.append("extractedValues: " + getExtractedValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventNumber() == null) ? 0 : getEventNumber().hashCode());
        hashCode = prime * hashCode
                + ((getEventMessage() == null) ? 0 : getEventMessage().hashCode());
        hashCode = prime * hashCode
                + ((getExtractedValues() == null) ? 0 : getExtractedValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricFilterMatchRecord == false)
            return false;
        MetricFilterMatchRecord other = (MetricFilterMatchRecord) obj;

        if (other.getEventNumber() == null ^ this.getEventNumber() == null)
            return false;
        if (other.getEventNumber() != null
                && other.getEventNumber().equals(this.getEventNumber()) == false)
            return false;
        if (other.getEventMessage() == null ^ this.getEventMessage() == null)
            return false;
        if (other.getEventMessage() != null
                && other.getEventMessage().equals(this.getEventMessage()) == false)
            return false;
        if (other.getExtractedValues() == null ^ this.getExtractedValues() == null)
            return false;
        if (other.getExtractedValues() != null
                && other.getExtractedValues().equals(this.getExtractedValues()) == false)
            return false;
        return true;
    }
}
