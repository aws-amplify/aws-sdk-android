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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Purchase an offering and create a reservation.
 */
public class PurchaseOfferingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Number of resources
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer count;

    /**
     * Name for the new reservation
     */
    private String name;

    /**
     * Offering to purchase, e.g. '87654321'
     */
    private String offeringId;

    /**
     * Unique request ID to be specified. This is needed to prevent retries from
     * creating multiple resources.
     */
    private String requestId;

    /**
     * Requested reservation start time (UTC) in ISO-8601 format. The specified
     * time must be between the first day of the current month and one year from
     * now. If no value is given, the default is now.
     */
    private String start;

    /**
     * A collection of key-value pairs
     */
    private java.util.Map<String, String> tags;

    /**
     * Number of resources
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Number of resources
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Number of resources
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param count Number of resources
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Number of resources
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param count Number of resources
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseOfferingRequest withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Name for the new reservation
     *
     * @return Name for the new reservation
     */
    public String getName() {
        return name;
    }

    /**
     * Name for the new reservation
     *
     * @param name Name for the new reservation
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name for the new reservation
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name Name for the new reservation
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseOfferingRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Offering to purchase, e.g. '87654321'
     *
     * @return Offering to purchase, e.g. '87654321'
     */
    public String getOfferingId() {
        return offeringId;
    }

    /**
     * Offering to purchase, e.g. '87654321'
     *
     * @param offeringId Offering to purchase, e.g. '87654321'
     */
    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * Offering to purchase, e.g. '87654321'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringId Offering to purchase, e.g. '87654321'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseOfferingRequest withOfferingId(String offeringId) {
        this.offeringId = offeringId;
        return this;
    }

    /**
     * Unique request ID to be specified. This is needed to prevent retries from
     * creating multiple resources.
     *
     * @return Unique request ID to be specified. This is needed to prevent
     *         retries from creating multiple resources.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Unique request ID to be specified. This is needed to prevent retries from
     * creating multiple resources.
     *
     * @param requestId Unique request ID to be specified. This is needed to
     *            prevent retries from creating multiple resources.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Unique request ID to be specified. This is needed to prevent retries from
     * creating multiple resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId Unique request ID to be specified. This is needed to
     *            prevent retries from creating multiple resources.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseOfferingRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Requested reservation start time (UTC) in ISO-8601 format. The specified
     * time must be between the first day of the current month and one year from
     * now. If no value is given, the default is now.
     *
     * @return Requested reservation start time (UTC) in ISO-8601 format. The
     *         specified time must be between the first day of the current month
     *         and one year from now. If no value is given, the default is now.
     */
    public String getStart() {
        return start;
    }

    /**
     * Requested reservation start time (UTC) in ISO-8601 format. The specified
     * time must be between the first day of the current month and one year from
     * now. If no value is given, the default is now.
     *
     * @param start Requested reservation start time (UTC) in ISO-8601 format.
     *            The specified time must be between the first day of the
     *            current month and one year from now. If no value is given, the
     *            default is now.
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * Requested reservation start time (UTC) in ISO-8601 format. The specified
     * time must be between the first day of the current month and one year from
     * now. If no value is given, the default is now.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param start Requested reservation start time (UTC) in ISO-8601 format.
     *            The specified time must be between the first day of the
     *            current month and one year from now. If no value is given, the
     *            default is now.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseOfferingRequest withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * A collection of key-value pairs
     *
     * @return A collection of key-value pairs
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * A collection of key-value pairs
     *
     * @param tags A collection of key-value pairs
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * A collection of key-value pairs
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags A collection of key-value pairs
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseOfferingRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * A collection of key-value pairs
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseOfferingRequest addTagsEntry(String key, String value) {
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
    public PurchaseOfferingRequest clearTagsEntries() {
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
        if (getCount() != null)
            sb.append("Count: " + getCount() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getOfferingId() != null)
            sb.append("OfferingId: " + getOfferingId() + ",");
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId() + ",");
        if (getStart() != null)
            sb.append("Start: " + getStart() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseOfferingRequest == false)
            return false;
        PurchaseOfferingRequest other = (PurchaseOfferingRequest) obj;

        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null
                && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
