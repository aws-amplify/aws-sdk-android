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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the account settings for a specified principal.
 * </p>
 */
public class ListAccountSettingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The resource name you want to list the account settings for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     */
    private String name;

    /**
     * <p>
     * The value of the account settings with which to filter results. You must
     * also specify an account setting name to use this parameter.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. If this field is omitted, the account settings are listed only for
     * the authenticated user.
     * </p>
     */
    private String principalArn;

    /**
     * <p>
     * Specifies whether to return the effective settings. If <code>true</code>,
     * the account settings for the root user or the default setting for the
     * <code>principalArn</code> are returned. If <code>false</code>, the
     * account settings for the <code>principalArn</code> are returned if they
     * are set. Otherwise, no account settings are returned.
     * </p>
     */
    private Boolean effectiveSettings;

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListAccountSettings</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of account setting results returned by
     * <code>ListAccountSettings</code> in paginated output. When this parameter
     * is used, <code>ListAccountSettings</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListAccountSettings</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 10. If this
     * parameter is not used, then <code>ListAccountSettings</code> returns up
     * to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The resource name you want to list the account settings for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @return <p>
     *         The resource name you want to list the account settings for.
     *         </p>
     * @see SettingName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The resource name you want to list the account settings for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @param name <p>
     *            The resource name you want to list the account settings for.
     *            </p>
     * @see SettingName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The resource name you want to list the account settings for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @param name <p>
     *            The resource name you want to list the account settings for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SettingName
     */
    public ListAccountSettingsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The resource name you want to list the account settings for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @param name <p>
     *            The resource name you want to list the account settings for.
     *            </p>
     * @see SettingName
     */
    public void setName(SettingName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The resource name you want to list the account settings for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @param name <p>
     *            The resource name you want to list the account settings for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SettingName
     */
    public ListAccountSettingsRequest withName(SettingName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value of the account settings with which to filter results. You must
     * also specify an account setting name to use this parameter.
     * </p>
     *
     * @return <p>
     *         The value of the account settings with which to filter results.
     *         You must also specify an account setting name to use this
     *         parameter.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the account settings with which to filter results. You must
     * also specify an account setting name to use this parameter.
     * </p>
     *
     * @param value <p>
     *            The value of the account settings with which to filter
     *            results. You must also specify an account setting name to use
     *            this parameter.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the account settings with which to filter results. You must
     * also specify an account setting name to use this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the account settings with which to filter
     *            results. You must also specify an account setting name to use
     *            this parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAccountSettingsRequest withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. If this field is omitted, the account settings are listed only for
     * the authenticated user.
     * </p>
     *
     * @return <p>
     *         The ARN of the principal, which can be an IAM user, IAM role, or
     *         the root user. If this field is omitted, the account settings are
     *         listed only for the authenticated user.
     *         </p>
     */
    public String getPrincipalArn() {
        return principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. If this field is omitted, the account settings are listed only for
     * the authenticated user.
     * </p>
     *
     * @param principalArn <p>
     *            The ARN of the principal, which can be an IAM user, IAM role,
     *            or the root user. If this field is omitted, the account
     *            settings are listed only for the authenticated user.
     *            </p>
     */
    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. If this field is omitted, the account settings are listed only for
     * the authenticated user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principalArn <p>
     *            The ARN of the principal, which can be an IAM user, IAM role,
     *            or the root user. If this field is omitted, the account
     *            settings are listed only for the authenticated user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAccountSettingsRequest withPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
        return this;
    }

    /**
     * <p>
     * Specifies whether to return the effective settings. If <code>true</code>,
     * the account settings for the root user or the default setting for the
     * <code>principalArn</code> are returned. If <code>false</code>, the
     * account settings for the <code>principalArn</code> are returned if they
     * are set. Otherwise, no account settings are returned.
     * </p>
     *
     * @return <p>
     *         Specifies whether to return the effective settings. If
     *         <code>true</code>, the account settings for the root user or the
     *         default setting for the <code>principalArn</code> are returned.
     *         If <code>false</code>, the account settings for the
     *         <code>principalArn</code> are returned if they are set.
     *         Otherwise, no account settings are returned.
     *         </p>
     */
    public Boolean isEffectiveSettings() {
        return effectiveSettings;
    }

    /**
     * <p>
     * Specifies whether to return the effective settings. If <code>true</code>,
     * the account settings for the root user or the default setting for the
     * <code>principalArn</code> are returned. If <code>false</code>, the
     * account settings for the <code>principalArn</code> are returned if they
     * are set. Otherwise, no account settings are returned.
     * </p>
     *
     * @return <p>
     *         Specifies whether to return the effective settings. If
     *         <code>true</code>, the account settings for the root user or the
     *         default setting for the <code>principalArn</code> are returned.
     *         If <code>false</code>, the account settings for the
     *         <code>principalArn</code> are returned if they are set.
     *         Otherwise, no account settings are returned.
     *         </p>
     */
    public Boolean getEffectiveSettings() {
        return effectiveSettings;
    }

    /**
     * <p>
     * Specifies whether to return the effective settings. If <code>true</code>,
     * the account settings for the root user or the default setting for the
     * <code>principalArn</code> are returned. If <code>false</code>, the
     * account settings for the <code>principalArn</code> are returned if they
     * are set. Otherwise, no account settings are returned.
     * </p>
     *
     * @param effectiveSettings <p>
     *            Specifies whether to return the effective settings. If
     *            <code>true</code>, the account settings for the root user or
     *            the default setting for the <code>principalArn</code> are
     *            returned. If <code>false</code>, the account settings for the
     *            <code>principalArn</code> are returned if they are set.
     *            Otherwise, no account settings are returned.
     *            </p>
     */
    public void setEffectiveSettings(Boolean effectiveSettings) {
        this.effectiveSettings = effectiveSettings;
    }

    /**
     * <p>
     * Specifies whether to return the effective settings. If <code>true</code>,
     * the account settings for the root user or the default setting for the
     * <code>principalArn</code> are returned. If <code>false</code>, the
     * account settings for the <code>principalArn</code> are returned if they
     * are set. Otherwise, no account settings are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param effectiveSettings <p>
     *            Specifies whether to return the effective settings. If
     *            <code>true</code>, the account settings for the root user or
     *            the default setting for the <code>principalArn</code> are
     *            returned. If <code>false</code>, the account settings for the
     *            <code>principalArn</code> are returned if they are set.
     *            Otherwise, no account settings are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAccountSettingsRequest withEffectiveSettings(Boolean effectiveSettings) {
        this.effectiveSettings = effectiveSettings;
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListAccountSettings</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     *
     * @return <p>
     *         The <code>nextToken</code> value returned from a
     *         <code>ListAccountSettings</code> request indicating that more
     *         results are available to fulfill the request and further calls
     *         will be needed. If <code>maxResults</code> was provided, it is
     *         possible the number of results to be fewer than
     *         <code>maxResults</code>.
     *         </p>
     *         <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only
     *         used to retrieve the next items in a list and not for other
     *         programmatic purposes.
     *         </p>
     *         </note>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListAccountSettings</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a
     *            <code>ListAccountSettings</code> request indicating that more
     *            results are available to fulfill the request and further calls
     *            will be needed. If <code>maxResults</code> was provided, it is
     *            possible the number of results to be fewer than
     *            <code>maxResults</code>.
     *            </p>
     *            <note>
     *            <p>
     *            This token should be treated as an opaque identifier that is
     *            only used to retrieve the next items in a list and not for
     *            other programmatic purposes.
     *            </p>
     *            </note>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListAccountSettings</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a
     *            <code>ListAccountSettings</code> request indicating that more
     *            results are available to fulfill the request and further calls
     *            will be needed. If <code>maxResults</code> was provided, it is
     *            possible the number of results to be fewer than
     *            <code>maxResults</code>.
     *            </p>
     *            <note>
     *            <p>
     *            This token should be treated as an opaque identifier that is
     *            only used to retrieve the next items in a list and not for
     *            other programmatic purposes.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAccountSettingsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of account setting results returned by
     * <code>ListAccountSettings</code> in paginated output. When this parameter
     * is used, <code>ListAccountSettings</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListAccountSettings</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 10. If this
     * parameter is not used, then <code>ListAccountSettings</code> returns up
     * to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     *
     * @return <p>
     *         The maximum number of account setting results returned by
     *         <code>ListAccountSettings</code> in paginated output. When this
     *         parameter is used, <code>ListAccountSettings</code> only returns
     *         <code>maxResults</code> results in a single page along with a
     *         <code>nextToken</code> response element. The remaining results of
     *         the initial request can be seen by sending another
     *         <code>ListAccountSettings</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 10.
     *         If this parameter is not used, then
     *         <code>ListAccountSettings</code> returns up to 10 results and a
     *         <code>nextToken</code> value if applicable.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of account setting results returned by
     * <code>ListAccountSettings</code> in paginated output. When this parameter
     * is used, <code>ListAccountSettings</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListAccountSettings</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 10. If this
     * parameter is not used, then <code>ListAccountSettings</code> returns up
     * to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of account setting results returned by
     *            <code>ListAccountSettings</code> in paginated output. When
     *            this parameter is used, <code>ListAccountSettings</code> only
     *            returns <code>maxResults</code> results in a single page along
     *            with a <code>nextToken</code> response element. The remaining
     *            results of the initial request can be seen by sending another
     *            <code>ListAccountSettings</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            10. If this parameter is not used, then
     *            <code>ListAccountSettings</code> returns up to 10 results and
     *            a <code>nextToken</code> value if applicable.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of account setting results returned by
     * <code>ListAccountSettings</code> in paginated output. When this parameter
     * is used, <code>ListAccountSettings</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListAccountSettings</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 10. If this
     * parameter is not used, then <code>ListAccountSettings</code> returns up
     * to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of account setting results returned by
     *            <code>ListAccountSettings</code> in paginated output. When
     *            this parameter is used, <code>ListAccountSettings</code> only
     *            returns <code>maxResults</code> results in a single page along
     *            with a <code>nextToken</code> response element. The remaining
     *            results of the initial request can be seen by sending another
     *            <code>ListAccountSettings</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            10. If this parameter is not used, then
     *            <code>ListAccountSettings</code> returns up to 10 results and
     *            a <code>nextToken</code> value if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAccountSettingsRequest withMaxResults(Integer maxResults) {
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue() + ",");
        if (getPrincipalArn() != null)
            sb.append("principalArn: " + getPrincipalArn() + ",");
        if (getEffectiveSettings() != null)
            sb.append("effectiveSettings: " + getEffectiveSettings() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode
                + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        hashCode = prime * hashCode
                + ((getEffectiveSettings() == null) ? 0 : getEffectiveSettings().hashCode());
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

        if (obj instanceof ListAccountSettingsRequest == false)
            return false;
        ListAccountSettingsRequest other = (ListAccountSettingsRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null
                && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getEffectiveSettings() == null ^ this.getEffectiveSettings() == null)
            return false;
        if (other.getEffectiveSettings() != null
                && other.getEffectiveSettings().equals(this.getEffectiveSettings()) == false)
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
