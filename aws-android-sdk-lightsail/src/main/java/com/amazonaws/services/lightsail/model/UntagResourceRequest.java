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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the specified set of tag keys and their values from the specified
 * Amazon Lightsail resource.
 * </p>
 * <p>
 * The <code>untag resource</code> operation supports tag-based access control
 * via request tags and resource tags applied to the resource identified by
 * <code>resource name</code>. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class UntagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the resource from which you are removing a tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String resourceName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource from which you want to
     * remove a tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws[^:]*):([a-zA-Z0-9-]+):([a-z0-9-]+):([0-9]+):([a-
     * zA-Z]+)/([a-zA-Z0-9-]+)$<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * The tag keys to delete from the specified resource.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * The name of the resource from which you are removing a tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the resource from which you are removing a tag.
     *         </p>
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <p>
     * The name of the resource from which you are removing a tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param resourceName <p>
     *            The name of the resource from which you are removing a tag.
     *            </p>
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the resource from which you are removing a tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param resourceName <p>
     *            The name of the resource from which you are removing a tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource from which you want to
     * remove a tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws[^:]*):([a-zA-Z0-9-]+):([a-z0-9-]+):([0-9]+):([a-
     * zA-Z]+)/([a-zA-Z0-9-]+)$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource from which you
     *         want to remove a tag.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource from which you want to
     * remove a tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws[^:]*):([a-zA-Z0-9-]+):([a-z0-9-]+):([0-9]+):([a-
     * zA-Z]+)/([a-zA-Z0-9-]+)$<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource from which you
     *            want to remove a tag.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource from which you want to
     * remove a tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws[^:]*):([a-zA-Z0-9-]+):([a-z0-9-]+):([0-9]+):([a-
     * zA-Z]+)/([a-zA-Z0-9-]+)$<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource from which you
     *            want to remove a tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The tag keys to delete from the specified resource.
     * </p>
     *
     * @return <p>
     *         The tag keys to delete from the specified resource.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * The tag keys to delete from the specified resource.
     * </p>
     *
     * @param tagKeys <p>
     *            The tag keys to delete from the specified resource.
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
     * The tag keys to delete from the specified resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            The tag keys to delete from the specified resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withTagKeys(String... tagKeys) {
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
     * The tag keys to delete from the specified resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            The tag keys to delete from the specified resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
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
        if (getResourceName() != null)
            sb.append("resourceName: " + getResourceName() + ",");
        if (getResourceArn() != null)
            sb.append("resourceArn: " + getResourceArn() + ",");
        if (getTagKeys() != null)
            sb.append("tagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResourceRequest == false)
            return false;
        UntagResourceRequest other = (UntagResourceRequest) obj;

        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null
                && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }
}
