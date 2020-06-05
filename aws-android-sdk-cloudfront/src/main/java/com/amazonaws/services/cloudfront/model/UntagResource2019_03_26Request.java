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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Remove tags from a CloudFront resource.
 * </p>
 */
public class UntagResource2019_03_26Request extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An ARN of a CloudFront resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-cn)?:cloudfront::[0-9]+:.*<br/>
     */
    private String resource;

    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> key elements.
     * </p>
     */
    private TagKeys tagKeys;

    /**
     * <p>
     * An ARN of a CloudFront resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-cn)?:cloudfront::[0-9]+:.*<br/>
     *
     * @return <p>
     *         An ARN of a CloudFront resource.
     *         </p>
     */
    public String getResource() {
        return resource;
    }

    /**
     * <p>
     * An ARN of a CloudFront resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-cn)?:cloudfront::[0-9]+:.*<br/>
     *
     * @param resource <p>
     *            An ARN of a CloudFront resource.
     *            </p>
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * An ARN of a CloudFront resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-cn)?:cloudfront::[0-9]+:.*<br/>
     *
     * @param resource <p>
     *            An ARN of a CloudFront resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResource2019_03_26Request withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> key elements.
     * </p>
     *
     * @return <p>
     *         A complex type that contains zero or more <code>Tag</code> key
     *         elements.
     *         </p>
     */
    public TagKeys getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> key elements.
     * </p>
     *
     * @param tagKeys <p>
     *            A complex type that contains zero or more <code>Tag</code> key
     *            elements.
     *            </p>
     */
    public void setTagKeys(TagKeys tagKeys) {
        this.tagKeys = tagKeys;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> key elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A complex type that contains zero or more <code>Tag</code> key
     *            elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResource2019_03_26Request withTagKeys(TagKeys tagKeys) {
        this.tagKeys = tagKeys;
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
        if (getResource() != null)
            sb.append("Resource: " + getResource() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResource2019_03_26Request == false)
            return false;
        UntagResource2019_03_26Request other = (UntagResource2019_03_26Request) obj;

        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }
}
