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
 * The search criteria to be used to return tags.
 * </p>
 */
public class TagSearchCondition implements Serializable {
    /**
     * <p>
     * The tag key used in the tag search condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String tagKey;

    /**
     * <p>
     * The tag value used in the tag search condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String tagValue;

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag key in tag
     * search condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     */
    private String tagKeyComparisonType;

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag value in tag
     * search condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     */
    private String tagValueComparisonType;

    /**
     * <p>
     * The tag key used in the tag search condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         The tag key used in the tag search condition.
     *         </p>
     */
    public String getTagKey() {
        return tagKey;
    }

    /**
     * <p>
     * The tag key used in the tag search condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param tagKey <p>
     *            The tag key used in the tag search condition.
     *            </p>
     */
    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * The tag key used in the tag search condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param tagKey <p>
     *            The tag key used in the tag search condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagSearchCondition withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * <p>
     * The tag value used in the tag search condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The tag value used in the tag search condition.
     *         </p>
     */
    public String getTagValue() {
        return tagValue;
    }

    /**
     * <p>
     * The tag value used in the tag search condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param tagValue <p>
     *            The tag value used in the tag search condition.
     *            </p>
     */
    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    /**
     * <p>
     * The tag value used in the tag search condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param tagValue <p>
     *            The tag value used in the tag search condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagSearchCondition withTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag key in tag
     * search condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @return <p>
     *         The type of comparison to be made when evaluating the tag key in
     *         tag search condition.
     *         </p>
     * @see StringComparisonType
     */
    public String getTagKeyComparisonType() {
        return tagKeyComparisonType;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag key in tag
     * search condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @param tagKeyComparisonType <p>
     *            The type of comparison to be made when evaluating the tag key
     *            in tag search condition.
     *            </p>
     * @see StringComparisonType
     */
    public void setTagKeyComparisonType(String tagKeyComparisonType) {
        this.tagKeyComparisonType = tagKeyComparisonType;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag key in tag
     * search condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @param tagKeyComparisonType <p>
     *            The type of comparison to be made when evaluating the tag key
     *            in tag search condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StringComparisonType
     */
    public TagSearchCondition withTagKeyComparisonType(String tagKeyComparisonType) {
        this.tagKeyComparisonType = tagKeyComparisonType;
        return this;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag key in tag
     * search condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @param tagKeyComparisonType <p>
     *            The type of comparison to be made when evaluating the tag key
     *            in tag search condition.
     *            </p>
     * @see StringComparisonType
     */
    public void setTagKeyComparisonType(StringComparisonType tagKeyComparisonType) {
        this.tagKeyComparisonType = tagKeyComparisonType.toString();
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag key in tag
     * search condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @param tagKeyComparisonType <p>
     *            The type of comparison to be made when evaluating the tag key
     *            in tag search condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StringComparisonType
     */
    public TagSearchCondition withTagKeyComparisonType(StringComparisonType tagKeyComparisonType) {
        this.tagKeyComparisonType = tagKeyComparisonType.toString();
        return this;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag value in tag
     * search condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @return <p>
     *         The type of comparison to be made when evaluating the tag value
     *         in tag search condition.
     *         </p>
     * @see StringComparisonType
     */
    public String getTagValueComparisonType() {
        return tagValueComparisonType;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag value in tag
     * search condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @param tagValueComparisonType <p>
     *            The type of comparison to be made when evaluating the tag
     *            value in tag search condition.
     *            </p>
     * @see StringComparisonType
     */
    public void setTagValueComparisonType(String tagValueComparisonType) {
        this.tagValueComparisonType = tagValueComparisonType;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag value in tag
     * search condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @param tagValueComparisonType <p>
     *            The type of comparison to be made when evaluating the tag
     *            value in tag search condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StringComparisonType
     */
    public TagSearchCondition withTagValueComparisonType(String tagValueComparisonType) {
        this.tagValueComparisonType = tagValueComparisonType;
        return this;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag value in tag
     * search condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @param tagValueComparisonType <p>
     *            The type of comparison to be made when evaluating the tag
     *            value in tag search condition.
     *            </p>
     * @see StringComparisonType
     */
    public void setTagValueComparisonType(StringComparisonType tagValueComparisonType) {
        this.tagValueComparisonType = tagValueComparisonType.toString();
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag value in tag
     * search condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @param tagValueComparisonType <p>
     *            The type of comparison to be made when evaluating the tag
     *            value in tag search condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StringComparisonType
     */
    public TagSearchCondition withTagValueComparisonType(StringComparisonType tagValueComparisonType) {
        this.tagValueComparisonType = tagValueComparisonType.toString();
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
            sb.append("tagKey: " + getTagKey() + ",");
        if (getTagValue() != null)
            sb.append("tagValue: " + getTagValue() + ",");
        if (getTagKeyComparisonType() != null)
            sb.append("tagKeyComparisonType: " + getTagKeyComparisonType() + ",");
        if (getTagValueComparisonType() != null)
            sb.append("tagValueComparisonType: " + getTagValueComparisonType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getTagValue() == null) ? 0 : getTagValue().hashCode());
        hashCode = prime * hashCode
                + ((getTagKeyComparisonType() == null) ? 0 : getTagKeyComparisonType().hashCode());
        hashCode = prime
                * hashCode
                + ((getTagValueComparisonType() == null) ? 0 : getTagValueComparisonType()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagSearchCondition == false)
            return false;
        TagSearchCondition other = (TagSearchCondition) obj;

        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getTagValue() == null ^ this.getTagValue() == null)
            return false;
        if (other.getTagValue() != null && other.getTagValue().equals(this.getTagValue()) == false)
            return false;
        if (other.getTagKeyComparisonType() == null ^ this.getTagKeyComparisonType() == null)
            return false;
        if (other.getTagKeyComparisonType() != null
                && other.getTagKeyComparisonType().equals(this.getTagKeyComparisonType()) == false)
            return false;
        if (other.getTagValueComparisonType() == null ^ this.getTagValueComparisonType() == null)
            return false;
        if (other.getTagValueComparisonType() != null
                && other.getTagValueComparisonType().equals(this.getTagValueComparisonType()) == false)
            return false;
        return true;
    }
}
