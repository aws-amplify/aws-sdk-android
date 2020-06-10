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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a tag-based condition that determines whether an object is included
 * or excluded from a classification job.
 * </p>
 */
public class TagScopeTerm implements Serializable {
    /**
     * <p>
     * The operator to use in the condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, GT, GTE, LT, LTE, NE, CONTAINS
     */
    private String comparator;

    /**
     * <p>
     * The tag key to use in the condition.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The tag key and value pairs to use in the condition.
     * </p>
     */
    private java.util.List<TagValuePair> tagValues;

    /**
     * <p>
     * The type of object to apply the condition to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3_OBJECT
     */
    private String target;

    /**
     * <p>
     * The operator to use in the condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, GT, GTE, LT, LTE, NE, CONTAINS
     *
     * @return <p>
     *         The operator to use in the condition.
     *         </p>
     * @see JobComparator
     */
    public String getComparator() {
        return comparator;
    }

    /**
     * <p>
     * The operator to use in the condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, GT, GTE, LT, LTE, NE, CONTAINS
     *
     * @param comparator <p>
     *            The operator to use in the condition.
     *            </p>
     * @see JobComparator
     */
    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    /**
     * <p>
     * The operator to use in the condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, GT, GTE, LT, LTE, NE, CONTAINS
     *
     * @param comparator <p>
     *            The operator to use in the condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobComparator
     */
    public TagScopeTerm withComparator(String comparator) {
        this.comparator = comparator;
        return this;
    }

    /**
     * <p>
     * The operator to use in the condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, GT, GTE, LT, LTE, NE, CONTAINS
     *
     * @param comparator <p>
     *            The operator to use in the condition.
     *            </p>
     * @see JobComparator
     */
    public void setComparator(JobComparator comparator) {
        this.comparator = comparator.toString();
    }

    /**
     * <p>
     * The operator to use in the condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, GT, GTE, LT, LTE, NE, CONTAINS
     *
     * @param comparator <p>
     *            The operator to use in the condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobComparator
     */
    public TagScopeTerm withComparator(JobComparator comparator) {
        this.comparator = comparator.toString();
        return this;
    }

    /**
     * <p>
     * The tag key to use in the condition.
     * </p>
     *
     * @return <p>
     *         The tag key to use in the condition.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The tag key to use in the condition.
     * </p>
     *
     * @param key <p>
     *            The tag key to use in the condition.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The tag key to use in the condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            The tag key to use in the condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagScopeTerm withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The tag key and value pairs to use in the condition.
     * </p>
     *
     * @return <p>
     *         The tag key and value pairs to use in the condition.
     *         </p>
     */
    public java.util.List<TagValuePair> getTagValues() {
        return tagValues;
    }

    /**
     * <p>
     * The tag key and value pairs to use in the condition.
     * </p>
     *
     * @param tagValues <p>
     *            The tag key and value pairs to use in the condition.
     *            </p>
     */
    public void setTagValues(java.util.Collection<TagValuePair> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new java.util.ArrayList<TagValuePair>(tagValues);
    }

    /**
     * <p>
     * The tag key and value pairs to use in the condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagValues <p>
     *            The tag key and value pairs to use in the condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagScopeTerm withTagValues(TagValuePair... tagValues) {
        if (getTagValues() == null) {
            this.tagValues = new java.util.ArrayList<TagValuePair>(tagValues.length);
        }
        for (TagValuePair value : tagValues) {
            this.tagValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tag key and value pairs to use in the condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagValues <p>
     *            The tag key and value pairs to use in the condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagScopeTerm withTagValues(java.util.Collection<TagValuePair> tagValues) {
        setTagValues(tagValues);
        return this;
    }

    /**
     * <p>
     * The type of object to apply the condition to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3_OBJECT
     *
     * @return <p>
     *         The type of object to apply the condition to.
     *         </p>
     * @see TagTarget
     */
    public String getTarget() {
        return target;
    }

    /**
     * <p>
     * The type of object to apply the condition to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3_OBJECT
     *
     * @param target <p>
     *            The type of object to apply the condition to.
     *            </p>
     * @see TagTarget
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The type of object to apply the condition to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3_OBJECT
     *
     * @param target <p>
     *            The type of object to apply the condition to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TagTarget
     */
    public TagScopeTerm withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * The type of object to apply the condition to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3_OBJECT
     *
     * @param target <p>
     *            The type of object to apply the condition to.
     *            </p>
     * @see TagTarget
     */
    public void setTarget(TagTarget target) {
        this.target = target.toString();
    }

    /**
     * <p>
     * The type of object to apply the condition to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3_OBJECT
     *
     * @param target <p>
     *            The type of object to apply the condition to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TagTarget
     */
    public TagScopeTerm withTarget(TagTarget target) {
        this.target = target.toString();
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
        if (getComparator() != null)
            sb.append("comparator: " + getComparator() + ",");
        if (getKey() != null)
            sb.append("key: " + getKey() + ",");
        if (getTagValues() != null)
            sb.append("tagValues: " + getTagValues() + ",");
        if (getTarget() != null)
            sb.append("target: " + getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComparator() == null) ? 0 : getComparator().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagScopeTerm == false)
            return false;
        TagScopeTerm other = (TagScopeTerm) obj;

        if (other.getComparator() == null ^ this.getComparator() == null)
            return false;
        if (other.getComparator() != null
                && other.getComparator().equals(this.getComparator()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getTagValues() == null ^ this.getTagValues() == null)
            return false;
        if (other.getTagValues() != null
                && other.getTagValues().equals(this.getTagValues()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }
}
