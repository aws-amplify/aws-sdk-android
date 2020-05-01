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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DescribeTagsResult implements Serializable {
    /**
     * <p>
     * If the request included a <code>Marker</code>, the response returns that
     * value in this field.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Returns tags associated with the file system as an array of
     * <code>Tag</code> objects.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * If a value is present, there are more tags to return. In a subsequent
     * request, you can provide the value of <code>NextMarker</code> as the
     * value of the <code>Marker</code> parameter in your next request to
     * retrieve the next set of tags.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * If the request included a <code>Marker</code>, the response returns that
     * value in this field.
     * </p>
     *
     * @return <p>
     *         If the request included a <code>Marker</code>, the response
     *         returns that value in this field.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * If the request included a <code>Marker</code>, the response returns that
     * value in this field.
     * </p>
     *
     * @param marker <p>
     *            If the request included a <code>Marker</code>, the response
     *            returns that value in this field.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * If the request included a <code>Marker</code>, the response returns that
     * value in this field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            If the request included a <code>Marker</code>, the response
     *            returns that value in this field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Returns tags associated with the file system as an array of
     * <code>Tag</code> objects.
     * </p>
     *
     * @return <p>
     *         Returns tags associated with the file system as an array of
     *         <code>Tag</code> objects.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Returns tags associated with the file system as an array of
     * <code>Tag</code> objects.
     * </p>
     *
     * @param tags <p>
     *            Returns tags associated with the file system as an array of
     *            <code>Tag</code> objects.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Returns tags associated with the file system as an array of
     * <code>Tag</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Returns tags associated with the file system as an array of
     *            <code>Tag</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsResult withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Returns tags associated with the file system as an array of
     * <code>Tag</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Returns tags associated with the file system as an array of
     *            <code>Tag</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * If a value is present, there are more tags to return. In a subsequent
     * request, you can provide the value of <code>NextMarker</code> as the
     * value of the <code>Marker</code> parameter in your next request to
     * retrieve the next set of tags.
     * </p>
     *
     * @return <p>
     *         If a value is present, there are more tags to return. In a
     *         subsequent request, you can provide the value of
     *         <code>NextMarker</code> as the value of the <code>Marker</code>
     *         parameter in your next request to retrieve the next set of tags.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * If a value is present, there are more tags to return. In a subsequent
     * request, you can provide the value of <code>NextMarker</code> as the
     * value of the <code>Marker</code> parameter in your next request to
     * retrieve the next set of tags.
     * </p>
     *
     * @param nextMarker <p>
     *            If a value is present, there are more tags to return. In a
     *            subsequent request, you can provide the value of
     *            <code>NextMarker</code> as the value of the
     *            <code>Marker</code> parameter in your next request to retrieve
     *            the next set of tags.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If a value is present, there are more tags to return. In a subsequent
     * request, you can provide the value of <code>NextMarker</code> as the
     * value of the <code>Marker</code> parameter in your next request to
     * retrieve the next set of tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextMarker <p>
     *            If a value is present, there are more tags to return. In a
     *            subsequent request, you can provide the value of
     *            <code>NextMarker</code> as the value of the
     *            <code>Marker</code> parameter in your next request to retrieve
     *            the next set of tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTagsResult == false)
            return false;
        DescribeTagsResult other = (DescribeTagsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }
}
