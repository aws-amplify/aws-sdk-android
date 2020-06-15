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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

public class SearchSkillGroupsResult implements Serializable {
    /**
     * <p>
     * The skill groups that meet the filter criteria, in sort order.
     * </p>
     */
    private java.util.List<SkillGroupData> skillGroups;

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The total number of skill groups returned.
     * </p>
     */
    private Integer totalCount;

    /**
     * <p>
     * The skill groups that meet the filter criteria, in sort order.
     * </p>
     *
     * @return <p>
     *         The skill groups that meet the filter criteria, in sort order.
     *         </p>
     */
    public java.util.List<SkillGroupData> getSkillGroups() {
        return skillGroups;
    }

    /**
     * <p>
     * The skill groups that meet the filter criteria, in sort order.
     * </p>
     *
     * @param skillGroups <p>
     *            The skill groups that meet the filter criteria, in sort order.
     *            </p>
     */
    public void setSkillGroups(java.util.Collection<SkillGroupData> skillGroups) {
        if (skillGroups == null) {
            this.skillGroups = null;
            return;
        }

        this.skillGroups = new java.util.ArrayList<SkillGroupData>(skillGroups);
    }

    /**
     * <p>
     * The skill groups that meet the filter criteria, in sort order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skillGroups <p>
     *            The skill groups that meet the filter criteria, in sort order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchSkillGroupsResult withSkillGroups(SkillGroupData... skillGroups) {
        if (getSkillGroups() == null) {
            this.skillGroups = new java.util.ArrayList<SkillGroupData>(skillGroups.length);
        }
        for (SkillGroupData value : skillGroups) {
            this.skillGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The skill groups that meet the filter criteria, in sort order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skillGroups <p>
     *            The skill groups that meet the filter criteria, in sort order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchSkillGroupsResult withSkillGroups(java.util.Collection<SkillGroupData> skillGroups) {
        setSkillGroups(skillGroups);
        return this;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @return <p>
     *         The token returned to indicate that there is more data available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The token returned to indicate that there is more data
     *            available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The token returned to indicate that there is more data
     *            available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchSkillGroupsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The total number of skill groups returned.
     * </p>
     *
     * @return <p>
     *         The total number of skill groups returned.
     *         </p>
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * <p>
     * The total number of skill groups returned.
     * </p>
     *
     * @param totalCount <p>
     *            The total number of skill groups returned.
     *            </p>
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of skill groups returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalCount <p>
     *            The total number of skill groups returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchSkillGroupsResult withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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
        if (getSkillGroups() != null)
            sb.append("SkillGroups: " + getSkillGroups() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getTotalCount() != null)
            sb.append("TotalCount: " + getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSkillGroups() == null) ? 0 : getSkillGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchSkillGroupsResult == false)
            return false;
        SearchSkillGroupsResult other = (SearchSkillGroupsResult) obj;

        if (other.getSkillGroups() == null ^ this.getSkillGroups() == null)
            return false;
        if (other.getSkillGroups() != null
                && other.getSkillGroups().equals(this.getSkillGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null
                && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }
}
