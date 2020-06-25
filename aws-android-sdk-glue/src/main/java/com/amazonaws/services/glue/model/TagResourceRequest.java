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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds tags to a resource. A tag is a label you can assign to an AWS resource.
 * In AWS Glue, you can tag only certain resources. For information about what
 * resources you can tag, see <a
 * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags
 * in AWS Glue</a>.
 * </p>
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the AWS Glue resource to which to add the tags. For more
     * information about AWS Glue resource ARNs, see the <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id"
     * >AWS Glue ARN string pattern</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     * <b>Pattern: </b>arn:aws:glue:.*<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * Tags to add to this resource.
     * </p>
     */
    private java.util.Map<String, String> tagsToAdd;

    /**
     * <p>
     * The ARN of the AWS Glue resource to which to add the tags. For more
     * information about AWS Glue resource ARNs, see the <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id"
     * >AWS Glue ARN string pattern</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     * <b>Pattern: </b>arn:aws:glue:.*<br/>
     *
     * @return <p>
     *         The ARN of the AWS Glue resource to which to add the tags. For
     *         more information about AWS Glue resource ARNs, see the <a href=
     *         "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id"
     *         >AWS Glue ARN string pattern</a>.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN of the AWS Glue resource to which to add the tags. For more
     * information about AWS Glue resource ARNs, see the <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id"
     * >AWS Glue ARN string pattern</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     * <b>Pattern: </b>arn:aws:glue:.*<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the AWS Glue resource to which to add the tags. For
     *            more information about AWS Glue resource ARNs, see the <a
     *            href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id"
     *            >AWS Glue ARN string pattern</a>.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the AWS Glue resource to which to add the tags. For more
     * information about AWS Glue resource ARNs, see the <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id"
     * >AWS Glue ARN string pattern</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     * <b>Pattern: </b>arn:aws:glue:.*<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the AWS Glue resource to which to add the tags. For
     *            more information about AWS Glue resource ARNs, see the <a
     *            href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id"
     *            >AWS Glue ARN string pattern</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * Tags to add to this resource.
     * </p>
     *
     * @return <p>
     *         Tags to add to this resource.
     *         </p>
     */
    public java.util.Map<String, String> getTagsToAdd() {
        return tagsToAdd;
    }

    /**
     * <p>
     * Tags to add to this resource.
     * </p>
     *
     * @param tagsToAdd <p>
     *            Tags to add to this resource.
     *            </p>
     */
    public void setTagsToAdd(java.util.Map<String, String> tagsToAdd) {
        this.tagsToAdd = tagsToAdd;
    }

    /**
     * <p>
     * Tags to add to this resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToAdd <p>
     *            Tags to add to this resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withTagsToAdd(java.util.Map<String, String> tagsToAdd) {
        this.tagsToAdd = tagsToAdd;
        return this;
    }

    /**
     * <p>
     * Tags to add to this resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into TagsToAdd parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into TagsToAdd.
     * @param value The corresponding value of the entry to be added into
     *            TagsToAdd.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest addTagsToAddEntry(String key, String value) {
        if (null == this.tagsToAdd) {
            this.tagsToAdd = new java.util.HashMap<String, String>();
        }
        if (this.tagsToAdd.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tagsToAdd.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TagsToAdd.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TagResourceRequest clearTagsToAddEntries() {
        this.tagsToAdd = null;
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
        if (getTagsToAdd() != null)
            sb.append("TagsToAdd: " + getTagsToAdd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTagsToAdd() == null) ? 0 : getTagsToAdd().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTagsToAdd() == null ^ this.getTagsToAdd() == null)
            return false;
        if (other.getTagsToAdd() != null
                && other.getTagsToAdd().equals(this.getTagsToAdd()) == false)
            return false;
        return true;
    }
}
