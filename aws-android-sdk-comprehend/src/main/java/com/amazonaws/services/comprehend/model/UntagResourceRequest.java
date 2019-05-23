/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes a specific tag associated with an Amazon Comprehend resource.
 * </p>
 */
public class UntagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the given Amazon Comprehend resource
     * from which you want to remove the tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-
     * Z0-9-]{1,64}/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * The initial part of a key-value pair that forms a tag being removed from
     * a given resource. For example, a tag with "Sales" as the key might be
     * added to a resource to indicate its use by the sales department. Keys
     * must be unique and cannot be duplicated for a particular resource.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the given Amazon Comprehend resource
     * from which you want to remove the tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-
     * Z0-9-]{1,64}/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the given Amazon Comprehend
     *         resource from which you want to remove the tags.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the given Amazon Comprehend resource
     * from which you want to remove the tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-
     * Z0-9-]{1,64}/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the given Amazon Comprehend
     *            resource from which you want to remove the tags.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the given Amazon Comprehend resource
     * from which you want to remove the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-
     * Z0-9-]{1,64}/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the given Amazon Comprehend
     *            resource from which you want to remove the tags.
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
     * The initial part of a key-value pair that forms a tag being removed from
     * a given resource. For example, a tag with "Sales" as the key might be
     * added to a resource to indicate its use by the sales department. Keys
     * must be unique and cannot be duplicated for a particular resource.
     * </p>
     *
     * @return <p>
     *         The initial part of a key-value pair that forms a tag being
     *         removed from a given resource. For example, a tag with "Sales" as
     *         the key might be added to a resource to indicate its use by the
     *         sales department. Keys must be unique and cannot be duplicated
     *         for a particular resource.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * The initial part of a key-value pair that forms a tag being removed from
     * a given resource. For example, a tag with "Sales" as the key might be
     * added to a resource to indicate its use by the sales department. Keys
     * must be unique and cannot be duplicated for a particular resource.
     * </p>
     *
     * @param tagKeys <p>
     *            The initial part of a key-value pair that forms a tag being
     *            removed from a given resource. For example, a tag with "Sales"
     *            as the key might be added to a resource to indicate its use by
     *            the sales department. Keys must be unique and cannot be
     *            duplicated for a particular resource.
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
     * The initial part of a key-value pair that forms a tag being removed from
     * a given resource. For example, a tag with "Sales" as the key might be
     * added to a resource to indicate its use by the sales department. Keys
     * must be unique and cannot be duplicated for a particular resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            The initial part of a key-value pair that forms a tag being
     *            removed from a given resource. For example, a tag with "Sales"
     *            as the key might be added to a resource to indicate its use by
     *            the sales department. Keys must be unique and cannot be
     *            duplicated for a particular resource.
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
     * The initial part of a key-value pair that forms a tag being removed from
     * a given resource. For example, a tag with "Sales" as the key might be
     * added to a resource to indicate its use by the sales department. Keys
     * must be unique and cannot be duplicated for a particular resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            The initial part of a key-value pair that forms a tag being
     *            removed from a given resource. For example, a tag with "Sales"
     *            as the key might be added to a resource to indicate its use by
     *            the sales department. Keys must be unique and cannot be
     *            duplicated for a particular resource.
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
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
