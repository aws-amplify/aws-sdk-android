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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

public class ListProtectionsResult implements Serializable {
    /**
     * <p>
     * The array of enabled <a>Protection</a> objects.
     * </p>
     */
    private java.util.List<Protection> protections;

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * Protections than the value of MaxResults, AWS Shield Advanced returns a
     * NextToken value in the response that allows you to list another group of
     * Protections. For the second and subsequent ListProtections requests,
     * specify the value of NextToken from the previous response to get
     * information about another batch of Protections.
     * </p>
     * <p>
     * AWS WAF might return the list of <a>Protection</a> objects in batches
     * smaller than the number specified by MaxResults. If there are more
     * <a>Protection</a> objects to return, AWS WAF will always also return a
     * <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^.*$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The array of enabled <a>Protection</a> objects.
     * </p>
     *
     * @return <p>
     *         The array of enabled <a>Protection</a> objects.
     *         </p>
     */
    public java.util.List<Protection> getProtections() {
        return protections;
    }

    /**
     * <p>
     * The array of enabled <a>Protection</a> objects.
     * </p>
     *
     * @param protections <p>
     *            The array of enabled <a>Protection</a> objects.
     *            </p>
     */
    public void setProtections(java.util.Collection<Protection> protections) {
        if (protections == null) {
            this.protections = null;
            return;
        }

        this.protections = new java.util.ArrayList<Protection>(protections);
    }

    /**
     * <p>
     * The array of enabled <a>Protection</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protections <p>
     *            The array of enabled <a>Protection</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProtectionsResult withProtections(Protection... protections) {
        if (getProtections() == null) {
            this.protections = new java.util.ArrayList<Protection>(protections.length);
        }
        for (Protection value : protections) {
            this.protections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The array of enabled <a>Protection</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protections <p>
     *            The array of enabled <a>Protection</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProtectionsResult withProtections(java.util.Collection<Protection> protections) {
        setProtections(protections);
        return this;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * Protections than the value of MaxResults, AWS Shield Advanced returns a
     * NextToken value in the response that allows you to list another group of
     * Protections. For the second and subsequent ListProtections requests,
     * specify the value of NextToken from the previous response to get
     * information about another batch of Protections.
     * </p>
     * <p>
     * AWS WAF might return the list of <a>Protection</a> objects in batches
     * smaller than the number specified by MaxResults. If there are more
     * <a>Protection</a> objects to return, AWS WAF will always also return a
     * <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^.*$<br/>
     *
     * @return <p>
     *         If you specify a value for <code>MaxResults</code> and you have
     *         more Protections than the value of MaxResults, AWS Shield
     *         Advanced returns a NextToken value in the response that allows
     *         you to list another group of Protections. For the second and
     *         subsequent ListProtections requests, specify the value of
     *         NextToken from the previous response to get information about
     *         another batch of Protections.
     *         </p>
     *         <p>
     *         AWS WAF might return the list of <a>Protection</a> objects in
     *         batches smaller than the number specified by MaxResults. If there
     *         are more <a>Protection</a> objects to return, AWS WAF will always
     *         also return a <code>NextToken</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * Protections than the value of MaxResults, AWS Shield Advanced returns a
     * NextToken value in the response that allows you to list another group of
     * Protections. For the second and subsequent ListProtections requests,
     * specify the value of NextToken from the previous response to get
     * information about another batch of Protections.
     * </p>
     * <p>
     * AWS WAF might return the list of <a>Protection</a> objects in batches
     * smaller than the number specified by MaxResults. If there are more
     * <a>Protection</a> objects to return, AWS WAF will always also return a
     * <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^.*$<br/>
     *
     * @param nextToken <p>
     *            If you specify a value for <code>MaxResults</code> and you
     *            have more Protections than the value of MaxResults, AWS Shield
     *            Advanced returns a NextToken value in the response that allows
     *            you to list another group of Protections. For the second and
     *            subsequent ListProtections requests, specify the value of
     *            NextToken from the previous response to get information about
     *            another batch of Protections.
     *            </p>
     *            <p>
     *            AWS WAF might return the list of <a>Protection</a> objects in
     *            batches smaller than the number specified by MaxResults. If
     *            there are more <a>Protection</a> objects to return, AWS WAF
     *            will always also return a <code>NextToken</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * Protections than the value of MaxResults, AWS Shield Advanced returns a
     * NextToken value in the response that allows you to list another group of
     * Protections. For the second and subsequent ListProtections requests,
     * specify the value of NextToken from the previous response to get
     * information about another batch of Protections.
     * </p>
     * <p>
     * AWS WAF might return the list of <a>Protection</a> objects in batches
     * smaller than the number specified by MaxResults. If there are more
     * <a>Protection</a> objects to return, AWS WAF will always also return a
     * <code>NextToken</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^.*$<br/>
     *
     * @param nextToken <p>
     *            If you specify a value for <code>MaxResults</code> and you
     *            have more Protections than the value of MaxResults, AWS Shield
     *            Advanced returns a NextToken value in the response that allows
     *            you to list another group of Protections. For the second and
     *            subsequent ListProtections requests, specify the value of
     *            NextToken from the previous response to get information about
     *            another batch of Protections.
     *            </p>
     *            <p>
     *            AWS WAF might return the list of <a>Protection</a> objects in
     *            batches smaller than the number specified by MaxResults. If
     *            there are more <a>Protection</a> objects to return, AWS WAF
     *            will always also return a <code>NextToken</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProtectionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getProtections() != null)
            sb.append("Protections: " + getProtections() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProtections() == null) ? 0 : getProtections().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProtectionsResult == false)
            return false;
        ListProtectionsResult other = (ListProtectionsResult) obj;

        if (other.getProtections() == null ^ this.getProtections() == null)
            return false;
        if (other.getProtections() != null
                && other.getProtections().equals(this.getProtections()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
