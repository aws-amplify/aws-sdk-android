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

package com.amazonaws.services.schemas.model;

import java.io.Serializable;

public class DiscovererSummary implements Serializable {
    /**
     * <p>
     * The ARN of the discoverer.
     * </p>
     */
    private String discovererArn;

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     */
    private String discovererId;

    /**
     * <p>
     * The ARN of the event bus.
     * </p>
     */
    private String sourceArn;

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTED, STOPPED
     */
    private String state;

    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the discoverer.
     * </p>
     *
     * @return <p>
     *         The ARN of the discoverer.
     *         </p>
     */
    public String getDiscovererArn() {
        return discovererArn;
    }

    /**
     * <p>
     * The ARN of the discoverer.
     * </p>
     *
     * @param discovererArn <p>
     *            The ARN of the discoverer.
     *            </p>
     */
    public void setDiscovererArn(String discovererArn) {
        this.discovererArn = discovererArn;
    }

    /**
     * <p>
     * The ARN of the discoverer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param discovererArn <p>
     *            The ARN of the discoverer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscovererSummary withDiscovererArn(String discovererArn) {
        this.discovererArn = discovererArn;
        return this;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     *
     * @return <p>
     *         The ID of the discoverer.
     *         </p>
     */
    public String getDiscovererId() {
        return discovererId;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     *
     * @param discovererId <p>
     *            The ID of the discoverer.
     *            </p>
     */
    public void setDiscovererId(String discovererId) {
        this.discovererId = discovererId;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param discovererId <p>
     *            The ID of the discoverer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscovererSummary withDiscovererId(String discovererId) {
        this.discovererId = discovererId;
        return this;
    }

    /**
     * <p>
     * The ARN of the event bus.
     * </p>
     *
     * @return <p>
     *         The ARN of the event bus.
     *         </p>
     */
    public String getSourceArn() {
        return sourceArn;
    }

    /**
     * <p>
     * The ARN of the event bus.
     * </p>
     *
     * @param sourceArn <p>
     *            The ARN of the event bus.
     *            </p>
     */
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The ARN of the event bus.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceArn <p>
     *            The ARN of the event bus.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscovererSummary withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTED, STOPPED
     *
     * @return <p>
     *         The state of the discoverer.
     *         </p>
     * @see DiscovererState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTED, STOPPED
     *
     * @param state <p>
     *            The state of the discoverer.
     *            </p>
     * @see DiscovererState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTED, STOPPED
     *
     * @param state <p>
     *            The state of the discoverer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiscovererState
     */
    public DiscovererSummary withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTED, STOPPED
     *
     * @param state <p>
     *            The state of the discoverer.
     *            </p>
     * @see DiscovererState
     */
    public void setState(DiscovererState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTED, STOPPED
     *
     * @param state <p>
     *            The state of the discoverer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiscovererState
     */
    public DiscovererSummary withState(DiscovererState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     *
     * @return <p>
     *         Tags associated with the resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     *
     * @param tags <p>
     *            Tags associated with the resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags associated with the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscovererSummary withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Tags associated with the resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscovererSummary addTagsEntry(String key, String value) {
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
    public DiscovererSummary clearTagsEntries() {
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
        if (getDiscovererArn() != null)
            sb.append("DiscovererArn: " + getDiscovererArn() + ",");
        if (getDiscovererId() != null)
            sb.append("DiscovererId: " + getDiscovererId() + ",");
        if (getSourceArn() != null)
            sb.append("SourceArn: " + getSourceArn() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDiscovererArn() == null) ? 0 : getDiscovererArn().hashCode());
        hashCode = prime * hashCode
                + ((getDiscovererId() == null) ? 0 : getDiscovererId().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscovererSummary == false)
            return false;
        DiscovererSummary other = (DiscovererSummary) obj;

        if (other.getDiscovererArn() == null ^ this.getDiscovererArn() == null)
            return false;
        if (other.getDiscovererArn() != null
                && other.getDiscovererArn().equals(this.getDiscovererArn()) == false)
            return false;
        if (other.getDiscovererId() == null ^ this.getDiscovererId() == null)
            return false;
        if (other.getDiscovererId() != null
                && other.getDiscovererId().equals(this.getDiscovererId()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null
                && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
