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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes one or more tags from the specified resource. This operation is
 * supported in storage gateways of all types.
 * </p>
 */
public class RemoveTagsFromResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource you want to remove the
     * tags from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String resourceARN;

    /**
     * <p>
     * The keys of the tags you want to remove from the specified resource. A
     * tag is composed of a key-value pair.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource you want to remove the
     * tags from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource you want to remove
     *         the tags from.
     *         </p>
     */
    public String getResourceARN() {
        return resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource you want to remove the
     * tags from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param resourceARN <p>
     *            The Amazon Resource Name (ARN) of the resource you want to
     *            remove the tags from.
     *            </p>
     */
    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource you want to remove the
     * tags from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param resourceARN <p>
     *            The Amazon Resource Name (ARN) of the resource you want to
     *            remove the tags from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromResourceRequest withResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }

    /**
     * <p>
     * The keys of the tags you want to remove from the specified resource. A
     * tag is composed of a key-value pair.
     * </p>
     *
     * @return <p>
     *         The keys of the tags you want to remove from the specified
     *         resource. A tag is composed of a key-value pair.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * The keys of the tags you want to remove from the specified resource. A
     * tag is composed of a key-value pair.
     * </p>
     *
     * @param tagKeys <p>
     *            The keys of the tags you want to remove from the specified
     *            resource. A tag is composed of a key-value pair.
     *            </p>
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * The keys of the tags you want to remove from the specified resource. A
     * tag is composed of a key-value pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            The keys of the tags you want to remove from the specified
     *            resource. A tag is composed of a key-value pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromResourceRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) {
            this.tagKeys = new java.util.ArrayList<String>(tagKeys.length);
        }
        for (String value : tagKeys) {
            this.tagKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The keys of the tags you want to remove from the specified resource. A
     * tag is composed of a key-value pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            The keys of the tags you want to remove from the specified
     *            resource. A tag is composed of a key-value pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: " + getResourceARN() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTagsFromResourceRequest == false)
            return false;
        RemoveTagsFromResourceRequest other = (RemoveTagsFromResourceRequest) obj;

        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null
                && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }
}
