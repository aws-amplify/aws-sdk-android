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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds up to 50 cost allocation tags to the named resource. A cost allocation
 * tag is a key-value pair where the key and value are case-sensitive. You can
 * use cost allocation tags to categorize and track your AWS costs.
 * </p>
 * <p>
 * When you apply tags to your ElastiCache resources, AWS generates a cost
 * allocation report as a comma-separated value (CSV) file with your usage and
 * costs aggregated by your tags. You can apply tags that represent business
 * categories (such as cost centers, application names, or owners) to organize
 * your costs across multiple services. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Tagging.html"
 * >Using Cost Allocation Tags in Amazon ElastiCache</a> in the <i>ElastiCache
 * User Guide</i>.
 * </p>
 */
public class AddTagsToResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to which the tags are to
     * be added, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>
     * . ElastiCache resources are <i>cluster</i> and <i>snapshot</i>.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     */
    private String resourceName;

    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. A tag is a
     * key-value pair. A tag key must be accompanied by a tag value.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to which the tags are to
     * be added, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>
     * . ElastiCache resources are <i>cluster</i> and <i>snapshot</i>.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource to which the tags
     *         are to be added, for example
     *         <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     *         or
     *         <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>
     *         . ElastiCache resources are <i>cluster</i> and <i>snapshot</i>.
     *         </p>
     *         <p>
     *         For more information about ARNs, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     *         </p>
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to which the tags are to
     * be added, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>
     * . ElastiCache resources are <i>cluster</i> and <i>snapshot</i>.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     *
     * @param resourceName <p>
     *            The Amazon Resource Name (ARN) of the resource to which the
     *            tags are to be added, for example
     *            <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     *            or
     *            <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>
     *            . ElastiCache resources are <i>cluster</i> and
     *            <i>snapshot</i>.
     *            </p>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     *            </p>
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to which the tags are to
     * be added, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>
     * . ElastiCache resources are <i>cluster</i> and <i>snapshot</i>.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceName <p>
     *            The Amazon Resource Name (ARN) of the resource to which the
     *            tags are to be added, for example
     *            <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     *            or
     *            <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>
     *            . ElastiCache resources are <i>cluster</i> and
     *            <i>snapshot</i>.
     *            </p>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsToResourceRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. A tag is a
     * key-value pair. A tag key must be accompanied by a tag value.
     * </p>
     *
     * @return <p>
     *         A list of cost allocation tags to be added to this resource. A
     *         tag is a key-value pair. A tag key must be accompanied by a tag
     *         value.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. A tag is a
     * key-value pair. A tag key must be accompanied by a tag value.
     * </p>
     *
     * @param tags <p>
     *            A list of cost allocation tags to be added to this resource. A
     *            tag is a key-value pair. A tag key must be accompanied by a
     *            tag value.
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
     * A list of cost allocation tags to be added to this resource. A tag is a
     * key-value pair. A tag key must be accompanied by a tag value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of cost allocation tags to be added to this resource. A
     *            tag is a key-value pair. A tag key must be accompanied by a
     *            tag value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsToResourceRequest withTags(Tag... tags) {
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
     * A list of cost allocation tags to be added to this resource. A tag is a
     * key-value pair. A tag key must be accompanied by a tag value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of cost allocation tags to be added to this resource. A
     *            tag is a key-value pair. A tag key must be accompanied by a
     *            tag value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsToResourceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceName() != null)
            sb.append("ResourceName: " + getResourceName() + ",");
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
                + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddTagsToResourceRequest == false)
            return false;
        AddTagsToResourceRequest other = (AddTagsToResourceRequest) obj;

        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null
                && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
