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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all enabled skills in a specific skill group.
 * </p>
 */
public class ListSkillsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the skill group for which to list enabled skills.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String skillGroupArn;

    /**
     * <p>
     * Whether the skill is enabled under the user's account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING
     */
    private String enablementType;

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE, ALL
     */
    private String skillType;

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only results beyond the token, up to the value
     * specified by <code>MaxResults</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to include in the response. If more results
     * exist than the specified <code>MaxResults</code> value, a token is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN of the skill group for which to list enabled skills.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the skill group for which to list enabled skills.
     *         </p>
     */
    public String getSkillGroupArn() {
        return skillGroupArn;
    }

    /**
     * <p>
     * The ARN of the skill group for which to list enabled skills.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param skillGroupArn <p>
     *            The ARN of the skill group for which to list enabled skills.
     *            </p>
     */
    public void setSkillGroupArn(String skillGroupArn) {
        this.skillGroupArn = skillGroupArn;
    }

    /**
     * <p>
     * The ARN of the skill group for which to list enabled skills.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param skillGroupArn <p>
     *            The ARN of the skill group for which to list enabled skills.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSkillsRequest withSkillGroupArn(String skillGroupArn) {
        this.skillGroupArn = skillGroupArn;
        return this;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING
     *
     * @return <p>
     *         Whether the skill is enabled under the user's account.
     *         </p>
     * @see EnablementTypeFilter
     */
    public String getEnablementType() {
        return enablementType;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING
     *
     * @param enablementType <p>
     *            Whether the skill is enabled under the user's account.
     *            </p>
     * @see EnablementTypeFilter
     */
    public void setEnablementType(String enablementType) {
        this.enablementType = enablementType;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING
     *
     * @param enablementType <p>
     *            Whether the skill is enabled under the user's account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnablementTypeFilter
     */
    public ListSkillsRequest withEnablementType(String enablementType) {
        this.enablementType = enablementType;
        return this;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING
     *
     * @param enablementType <p>
     *            Whether the skill is enabled under the user's account.
     *            </p>
     * @see EnablementTypeFilter
     */
    public void setEnablementType(EnablementTypeFilter enablementType) {
        this.enablementType = enablementType.toString();
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING
     *
     * @param enablementType <p>
     *            Whether the skill is enabled under the user's account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnablementTypeFilter
     */
    public ListSkillsRequest withEnablementType(EnablementTypeFilter enablementType) {
        this.enablementType = enablementType.toString();
        return this;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE, ALL
     *
     * @return <p>
     *         Whether the skill is publicly available or is a private skill.
     *         </p>
     * @see SkillTypeFilter
     */
    public String getSkillType() {
        return skillType;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE, ALL
     *
     * @param skillType <p>
     *            Whether the skill is publicly available or is a private skill.
     *            </p>
     * @see SkillTypeFilter
     */
    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE, ALL
     *
     * @param skillType <p>
     *            Whether the skill is publicly available or is a private skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SkillTypeFilter
     */
    public ListSkillsRequest withSkillType(String skillType) {
        this.skillType = skillType;
        return this;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE, ALL
     *
     * @param skillType <p>
     *            Whether the skill is publicly available or is a private skill.
     *            </p>
     * @see SkillTypeFilter
     */
    public void setSkillType(SkillTypeFilter skillType) {
        this.skillType = skillType.toString();
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE, ALL
     *
     * @param skillType <p>
     *            Whether the skill is publicly available or is a private skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SkillTypeFilter
     */
    public ListSkillsRequest withSkillType(SkillTypeFilter skillType) {
        this.skillType = skillType.toString();
        return this;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only results beyond the token, up to the value
     * specified by <code>MaxResults</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @return <p>
     *         An optional token returned from a prior request. Use this token
     *         for pagination of results from this action. If this parameter is
     *         specified, the response includes only results beyond the token,
     *         up to the value specified by <code>MaxResults</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only results beyond the token, up to the value
     * specified by <code>MaxResults</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            An optional token returned from a prior request. Use this
     *            token for pagination of results from this action. If this
     *            parameter is specified, the response includes only results
     *            beyond the token, up to the value specified by
     *            <code>MaxResults</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only results beyond the token, up to the value
     * specified by <code>MaxResults</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            An optional token returned from a prior request. Use this
     *            token for pagination of results from this action. If this
     *            parameter is specified, the response includes only results
     *            beyond the token, up to the value specified by
     *            <code>MaxResults</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSkillsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results
     * exist than the specified <code>MaxResults</code> value, a token is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return <p>
     *         The maximum number of results to include in the response. If more
     *         results exist than the specified <code>MaxResults</code> value, a
     *         token is included in the response so that the remaining results
     *         can be retrieved.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results
     * exist than the specified <code>MaxResults</code> value, a token is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to include in the response. If
     *            more results exist than the specified <code>MaxResults</code>
     *            value, a token is included in the response so that the
     *            remaining results can be retrieved.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results
     * exist than the specified <code>MaxResults</code> value, a token is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to include in the response. If
     *            more results exist than the specified <code>MaxResults</code>
     *            value, a token is included in the response so that the
     *            remaining results can be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSkillsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getSkillGroupArn() != null)
            sb.append("SkillGroupArn: " + getSkillGroupArn() + ",");
        if (getEnablementType() != null)
            sb.append("EnablementType: " + getEnablementType() + ",");
        if (getSkillType() != null)
            sb.append("SkillType: " + getSkillType() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSkillGroupArn() == null) ? 0 : getSkillGroupArn().hashCode());
        hashCode = prime * hashCode
                + ((getEnablementType() == null) ? 0 : getEnablementType().hashCode());
        hashCode = prime * hashCode + ((getSkillType() == null) ? 0 : getSkillType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSkillsRequest == false)
            return false;
        ListSkillsRequest other = (ListSkillsRequest) obj;

        if (other.getSkillGroupArn() == null ^ this.getSkillGroupArn() == null)
            return false;
        if (other.getSkillGroupArn() != null
                && other.getSkillGroupArn().equals(this.getSkillGroupArn()) == false)
            return false;
        if (other.getEnablementType() == null ^ this.getEnablementType() == null)
            return false;
        if (other.getEnablementType() != null
                && other.getEnablementType().equals(this.getEnablementType()) == false)
            return false;
        if (other.getSkillType() == null ^ this.getSkillType() == null)
            return false;
        if (other.getSkillType() != null
                && other.getSkillType().equals(this.getSkillType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
