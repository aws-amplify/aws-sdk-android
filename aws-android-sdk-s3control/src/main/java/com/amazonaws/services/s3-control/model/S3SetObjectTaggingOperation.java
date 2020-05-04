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


/**
 * <p>Contains the configuration parameters for a Set Object Tagging operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object tagging API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTtagging.html">PUT Object tagging</a>.</p>
 */
public class S3SetObjectTaggingOperation implements Serializable {
    /**
     * <p/>
     */
    private java.util.List<S3Tag> tagSet;

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<S3Tag> getTagSet() {
        return tagSet;
    }

    /**
     * <p/>
     *
     * @param tagSet <p/>
     */
    public void setTagSet(java.util.Collection<S3Tag> tagSet) {
        if (tagSet == null) {
            this.tagSet = null;
            return;
        }

        this.tagSet = new java.util.ArrayList<S3Tag>(tagSet);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagSet <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3SetObjectTaggingOperation withTagSet(S3Tag... tagSet) {
        if (getTagSet() == null) {
            this.tagSet = new java.util.ArrayList<S3Tag>(tagSet.length);
        }
        for (S3Tag value : tagSet) {
            this.tagSet.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagSet <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3SetObjectTaggingOperation withTagSet(java.util.Collection<S3Tag> tagSet) {
        setTagSet(tagSet);
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
        if (getTagSet() != null) sb.append("TagSet: " + getTagSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagSet() == null) ? 0 : getTagSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3SetObjectTaggingOperation == false) return false;
        S3SetObjectTaggingOperation other = (S3SetObjectTaggingOperation)obj;

        if (other.getTagSet() == null ^ this.getTagSet() == null) return false;
        if (other.getTagSet() != null && other.getTagSet().equals(this.getTagSet()) == false) return false;
        return true;
    }
}
