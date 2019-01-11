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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes the association of tags from an Amazon DynamoDB resource. You can
 * call UntagResource up to 5 times per second, per account.
 * </p>
 * <p>
 * For an overview on tagging DynamoDB resources, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html"
 * >Tagging for DynamoDB</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 */
public class UntagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon DyanamoDB resource the tags will be removed from. This value
     * is an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1283<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * A list of tag keys. Existing tags of the resource whose keys are members
     * of this list will be removed from the Amazon DynamoDB resource.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * The Amazon DyanamoDB resource the tags will be removed from. This value
     * is an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1283<br/>
     *
     * @return <p>
     *         The Amazon DyanamoDB resource the tags will be removed from. This
     *         value is an Amazon Resource Name (ARN).
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon DyanamoDB resource the tags will be removed from. This value
     * is an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1283<br/>
     *
     * @param resourceArn <p>
     *            The Amazon DyanamoDB resource the tags will be removed from.
     *            This value is an Amazon Resource Name (ARN).
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon DyanamoDB resource the tags will be removed from. This value
     * is an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1283<br/>
     *
     * @param resourceArn <p>
     *            The Amazon DyanamoDB resource the tags will be removed from.
     *            This value is an Amazon Resource Name (ARN).
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
     * A list of tag keys. Existing tags of the resource whose keys are members
     * of this list will be removed from the Amazon DynamoDB resource.
     * </p>
     *
     * @return <p>
     *         A list of tag keys. Existing tags of the resource whose keys are
     *         members of this list will be removed from the Amazon DynamoDB
     *         resource.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * A list of tag keys. Existing tags of the resource whose keys are members
     * of this list will be removed from the Amazon DynamoDB resource.
     * </p>
     *
     * @param tagKeys <p>
     *            A list of tag keys. Existing tags of the resource whose keys
     *            are members of this list will be removed from the Amazon
     *            DynamoDB resource.
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
     * A list of tag keys. Existing tags of the resource whose keys are members
     * of this list will be removed from the Amazon DynamoDB resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A list of tag keys. Existing tags of the resource whose keys
     *            are members of this list will be removed from the Amazon
     *            DynamoDB resource.
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
     * A list of tag keys. Existing tags of the resource whose keys are members
     * of this list will be removed from the Amazon DynamoDB resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A list of tag keys. Existing tags of the resource whose keys
     *            are members of this list will be removed from the Amazon
     *            DynamoDB resource.
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
