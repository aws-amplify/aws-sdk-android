/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * A leaf node condition which can be used to specify a tag condition, for
 * example, <code>HAVE BPO = 123</code>.
 * </p>
 */
public class TagCondition implements Serializable {
    /**
     * <p>
     * The tag key in the tag condition.
     * </p>
     */
    private String tagKey;

    /**
     * <p>
     * The tag value in the tag condition.
     * </p>
     */
    private String tagValue;

    /**
     * <p>
     * The tag key in the tag condition.
     * </p>
     *
     * @return <p>
     *         The tag key in the tag condition.
     *         </p>
     */
    public String getTagKey() {
        return tagKey;
    }

    /**
     * <p>
     * The tag key in the tag condition.
     * </p>
     *
     * @param tagKey <p>
     *            The tag key in the tag condition.
     *            </p>
     */
    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * The tag key in the tag condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKey <p>
     *            The tag key in the tag condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagCondition withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * <p>
     * The tag value in the tag condition.
     * </p>
     *
     * @return <p>
     *         The tag value in the tag condition.
     *         </p>
     */
    public String getTagValue() {
        return tagValue;
    }

    /**
     * <p>
     * The tag value in the tag condition.
     * </p>
     *
     * @param tagValue <p>
     *            The tag value in the tag condition.
     *            </p>
     */
    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    /**
     * <p>
     * The tag value in the tag condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagValue <p>
     *            The tag value in the tag condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagCondition withTagValue(String tagValue) {
        this.tagValue = tagValue;
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
        if (getTagKey() != null)
            sb.append("TagKey: " + getTagKey() + ",");
        if (getTagValue() != null)
            sb.append("TagValue: " + getTagValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getTagValue() == null) ? 0 : getTagValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagCondition == false)
            return false;
        TagCondition other = (TagCondition) obj;

        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getTagValue() == null ^ this.getTagValue() == null)
            return false;
        if (other.getTagValue() != null && other.getTagValue().equals(this.getTagValue()) == false)
            return false;
        return true;
    }
}
