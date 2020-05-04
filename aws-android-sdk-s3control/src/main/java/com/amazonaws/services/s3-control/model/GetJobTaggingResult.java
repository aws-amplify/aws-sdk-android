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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


public class GetJobTaggingResult implements Serializable {
    /**
     * <p>The set of tags associated with the Amazon S3 Batch Operations job.</p>
     */
    private java.util.List<S3Tag> tags;

    /**
     * <p>The set of tags associated with the Amazon S3 Batch Operations job.</p>
     *
     * @return <p>The set of tags associated with the Amazon S3 Batch Operations job.</p>
     */
    public java.util.List<S3Tag> getTags() {
        return tags;
    }

    /**
     * <p>The set of tags associated with the Amazon S3 Batch Operations job.</p>
     *
     * @param tags <p>The set of tags associated with the Amazon S3 Batch Operations job.</p>
     */
    public void setTags(java.util.Collection<S3Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<S3Tag>(tags);
    }

    /**
     * <p>The set of tags associated with the Amazon S3 Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The set of tags associated with the Amazon S3 Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetJobTaggingResult withTags(S3Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<S3Tag>(tags.length);
        }
        for (S3Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>The set of tags associated with the Amazon S3 Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The set of tags associated with the Amazon S3 Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetJobTaggingResult withTags(java.util.Collection<S3Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTags() != null) sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetJobTaggingResult == false) return false;
        GetJobTaggingResult other = (GetJobTaggingResult)obj;

        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false;
        return true;
    }
}
