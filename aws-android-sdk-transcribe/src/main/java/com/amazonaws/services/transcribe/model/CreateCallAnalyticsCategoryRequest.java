/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a call analytics category. Amazon Transcribe applies the conditions
 * specified by your call analytics categories to your call analytics jobs. For
 * each analytics category, you must create between 1 and 20 rules. For example,
 * you can create a 'greeting' category with a rule that flags calls in which
 * your agent does not use a specified phrase (for example:
 * "Please note this call may be recorded.") in the first 15 seconds of the
 * call. When you start a call analytics job, Amazon Transcribe applies all your
 * existing call analytics categories to that job.
 * </p>
 */
public class CreateCallAnalyticsCategoryRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A unique name, chosen by you, for your call analytics category. For
     * example, <code>sentiment-positive-last30seconds</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String categoryName;

    /**
     * <p>
     * Rules make up a call analytics category. When creating a call analytics
     * category, you must create between 1 and 20 rules for your category. For
     * each rule, you specify a filter you want applied to the attributes of a
     * call. For example, you can choose a sentiment filter that detects if a
     * customer's sentiment was positive during the last 30 seconds of the call.
     * </p>
     */
    private java.util.List<Rule> rules;

    /**
     * <p>
     * A unique name, chosen by you, for your call analytics category. For
     * example, <code>sentiment-positive-last30seconds</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         A unique name, chosen by you, for your call analytics category.
     *         For example, <code>sentiment-positive-last30seconds</code>.
     *         </p>
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your call analytics category. For
     * example, <code>sentiment-positive-last30seconds</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param categoryName <p>
     *            A unique name, chosen by you, for your call analytics
     *            category. For example,
     *            <code>sentiment-positive-last30seconds</code>.
     *            </p>
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your call analytics category. For
     * example, <code>sentiment-positive-last30seconds</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param categoryName <p>
     *            A unique name, chosen by you, for your call analytics
     *            category. For example,
     *            <code>sentiment-positive-last30seconds</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCallAnalyticsCategoryRequest withCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * <p>
     * Rules make up a call analytics category. When creating a call analytics
     * category, you must create between 1 and 20 rules for your category. For
     * each rule, you specify a filter you want applied to the attributes of a
     * call. For example, you can choose a sentiment filter that detects if a
     * customer's sentiment was positive during the last 30 seconds of the call.
     * </p>
     *
     * @return <p>
     *         Rules make up a call analytics category. When creating a call
     *         analytics category, you must create between 1 and 20 rules for
     *         your category. For each rule, you specify a filter you want
     *         applied to the attributes of a call. For example, you can choose
     *         a sentiment filter that detects if a customer's sentiment was
     *         positive during the last 30 seconds of the call.
     *         </p>
     */
    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * Rules make up a call analytics category. When creating a call analytics
     * category, you must create between 1 and 20 rules for your category. For
     * each rule, you specify a filter you want applied to the attributes of a
     * call. For example, you can choose a sentiment filter that detects if a
     * customer's sentiment was positive during the last 30 seconds of the call.
     * </p>
     *
     * @param rules <p>
     *            Rules make up a call analytics category. When creating a call
     *            analytics category, you must create between 1 and 20 rules for
     *            your category. For each rule, you specify a filter you want
     *            applied to the attributes of a call. For example, you can
     *            choose a sentiment filter that detects if a customer's
     *            sentiment was positive during the last 30 seconds of the call.
     *            </p>
     */
    public void setRules(java.util.Collection<Rule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<Rule>(rules);
    }

    /**
     * <p>
     * Rules make up a call analytics category. When creating a call analytics
     * category, you must create between 1 and 20 rules for your category. For
     * each rule, you specify a filter you want applied to the attributes of a
     * call. For example, you can choose a sentiment filter that detects if a
     * customer's sentiment was positive during the last 30 seconds of the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            Rules make up a call analytics category. When creating a call
     *            analytics category, you must create between 1 and 20 rules for
     *            your category. For each rule, you specify a filter you want
     *            applied to the attributes of a call. For example, you can
     *            choose a sentiment filter that detects if a customer's
     *            sentiment was positive during the last 30 seconds of the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCallAnalyticsCategoryRequest withRules(Rule... rules) {
        if (getRules() == null) {
            this.rules = new java.util.ArrayList<Rule>(rules.length);
        }
        for (Rule value : rules) {
            this.rules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Rules make up a call analytics category. When creating a call analytics
     * category, you must create between 1 and 20 rules for your category. For
     * each rule, you specify a filter you want applied to the attributes of a
     * call. For example, you can choose a sentiment filter that detects if a
     * customer's sentiment was positive during the last 30 seconds of the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            Rules make up a call analytics category. When creating a call
     *            analytics category, you must create between 1 and 20 rules for
     *            your category. For each rule, you specify a filter you want
     *            applied to the attributes of a call. For example, you can
     *            choose a sentiment filter that detects if a customer's
     *            sentiment was positive during the last 30 seconds of the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCallAnalyticsCategoryRequest withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
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
        if (getCategoryName() != null)
            sb.append("CategoryName: " + getCategoryName() + ",");
        if (getRules() != null)
            sb.append("Rules: " + getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCallAnalyticsCategoryRequest == false)
            return false;
        CreateCallAnalyticsCategoryRequest other = (CreateCallAnalyticsCategoryRequest) obj;

        if (other.getCategoryName() == null ^ this.getCategoryName() == null)
            return false;
        if (other.getCategoryName() != null
                && other.getCategoryName().equals(this.getCategoryName()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }
}
