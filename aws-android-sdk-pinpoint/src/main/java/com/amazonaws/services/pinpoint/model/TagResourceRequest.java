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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds one or more tags (keys and values) to an application, campaign, message
 * template, or segment.
 * </p>
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application, campaign, message
     * template, or segment.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * Specifies the tags (keys and values) for an application, campaign,
     * message template, or segment.
     * </p>
     */
    private TagsModel tagsModel;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application, campaign, message
     * template, or segment.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the application, campaign,
     *         message template, or segment.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application, campaign, message
     * template, or segment.
     * </p>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the application, campaign,
     *            message template, or segment.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application, campaign, message
     * template, or segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the application, campaign,
     *            message template, or segment.
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
     * Specifies the tags (keys and values) for an application, campaign,
     * message template, or segment.
     * </p>
     *
     * @return <p>
     *         Specifies the tags (keys and values) for an application,
     *         campaign, message template, or segment.
     *         </p>
     */
    public TagsModel getTagsModel() {
        return tagsModel;
    }

    /**
     * <p>
     * Specifies the tags (keys and values) for an application, campaign,
     * message template, or segment.
     * </p>
     *
     * @param tagsModel <p>
     *            Specifies the tags (keys and values) for an application,
     *            campaign, message template, or segment.
     *            </p>
     */
    public void setTagsModel(TagsModel tagsModel) {
        this.tagsModel = tagsModel;
    }

    /**
     * <p>
     * Specifies the tags (keys and values) for an application, campaign,
     * message template, or segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsModel <p>
     *            Specifies the tags (keys and values) for an application,
     *            campaign, message template, or segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withTagsModel(TagsModel tagsModel) {
        this.tagsModel = tagsModel;
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
        if (getTagsModel() != null)
            sb.append("TagsModel: " + getTagsModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTagsModel() == null) ? 0 : getTagsModel().hashCode());
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
        if (other.getTagsModel() == null ^ this.getTagsModel() == null)
            return false;
        if (other.getTagsModel() != null
                && other.getTagsModel().equals(this.getTagsModel()) == false)
            return false;
        return true;
    }
}
