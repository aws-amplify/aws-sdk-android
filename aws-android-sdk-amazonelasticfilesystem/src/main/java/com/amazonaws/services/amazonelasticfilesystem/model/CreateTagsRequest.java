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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or overwrites tags associated with a file system. Each tag is a
 * key-value pair. If a tag key specified in the request already exists on the
 * file system, this operation overwrites its value with the value provided in
 * the request. If you add the <code>Name</code> tag to your file system, Amazon
 * EFS returns it in the response to the <a>DescribeFileSystems</a> operation.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>elasticfilesystem:CreateTags</code> action.
 * </p>
 */
public class CreateTagsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the file system whose tags you want to modify (String). This
     * operation modifies the tags only, not the file system.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code> object
     * is a key-value pair.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the file system whose tags you want to modify (String). This
     * operation modifies the tags only, not the file system.
     * </p>
     *
     * @return <p>
     *         The ID of the file system whose tags you want to modify (String).
     *         This operation modifies the tags only, not the file system.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system whose tags you want to modify (String). This
     * operation modifies the tags only, not the file system.
     * </p>
     *
     * @param fileSystemId <p>
     *            The ID of the file system whose tags you want to modify
     *            (String). This operation modifies the tags only, not the file
     *            system.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system whose tags you want to modify (String). This
     * operation modifies the tags only, not the file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            The ID of the file system whose tags you want to modify
     *            (String). This operation modifies the tags only, not the file
     *            system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTagsRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code> object
     * is a key-value pair.
     * </p>
     *
     * @return <p>
     *         An array of <code>Tag</code> objects to add. Each
     *         <code>Tag</code> object is a key-value pair.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code> object
     * is a key-value pair.
     * </p>
     *
     * @param tags <p>
     *            An array of <code>Tag</code> objects to add. Each
     *            <code>Tag</code> object is a key-value pair.
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
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code> object
     * is a key-value pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of <code>Tag</code> objects to add. Each
     *            <code>Tag</code> object is a key-value pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTagsRequest withTags(Tag... tags) {
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
     * An array of <code>Tag</code> objects to add. Each <code>Tag</code> object
     * is a key-value pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of <code>Tag</code> objects to add. Each
     *            <code>Tag</code> object is a key-value pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTagsRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
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
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTagsRequest == false)
            return false;
        CreateTagsRequest other = (CreateTagsRequest) obj;

        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
