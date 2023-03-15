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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new Call Analytics category.
 * </p>
 * <p>
 * All categories are automatically applied to your Call Analytics
 * transcriptions. Note that in order to apply categories to your
 * transcriptions, you must create them before submitting your transcription
 * request, as categories cannot be applied retroactively.
 * </p>
 * <p>
 * When creating a new category, you can use the <code>InputType</code>
 * parameter to label the category as a <code>POST_CALL</code> or a
 * <code>REAL_TIME</code> category. <code>POST_CALL</code> categories can only
 * be applied to post-call transcriptions and <code>REAL_TIME</code> categories
 * can only be applied to real-time transcriptions. If you do not include
 * <code>InputType</code>, your category is created as a <code>POST_CALL</code>
 * category by default.
 * </p>
 * <p>
 * Call Analytics categories are composed of rules. For each category, you must
 * create between 1 and 20 rules. Rules can include these parameters: , , , and
 * .
 * </p>
 * <p>
 * To update an existing category, see .
 * </p>
 * <p>
 * To learn more about Call Analytics categories, see <a href=
 * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html"
 * >Creating categories for post-call transcriptions</a> and <a href=
 * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html"
 * >Creating categories for real-time transcriptions</a>.
 * </p>
 */
public class CreateCallAnalyticsCategoryRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics category. It's
     * helpful to use a detailed naming system that will make sense to you in
     * the future. For example, it's better to use
     * <code>sentiment-positive-last30seconds</code> for a category over a
     * generic name like <code>test-category</code>.
     * </p>
     * <p>
     * Category names are case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String categoryName;

    /**
     * <p>
     * Rules define a Call Analytics category. When creating a new category, you
     * must create between 1 and 20 rules for that category. For each rule, you
     * specify a filter you want applied to the attributes of a call. For
     * example, you can choose a sentiment filter that detects if a customer's
     * sentiment was positive during the last 30 seconds of the call.
     * </p>
     */
    private java.util.List<Rule> rules;

    /**
     * <p>
     * Choose whether you want to create a real-time or a post-call category for
     * your Call Analytics transcription.
     * </p>
     * <p>
     * Specifying <code>POST_CALL</code> assigns your category to post-call
     * transcriptions; categories with this input type cannot be applied to
     * streaming (real-time) transcriptions.
     * </p>
     * <p>
     * Specifying <code>REAL_TIME</code> assigns your category to streaming
     * transcriptions; categories with this input type cannot be applied to
     * post-call transcriptions.
     * </p>
     * <p>
     * If you do not include <code>InputType</code>, your category is created as
     * a post-call category by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REAL_TIME, POST_CALL
     */
    private String inputType;

    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics category. It's
     * helpful to use a detailed naming system that will make sense to you in
     * the future. For example, it's better to use
     * <code>sentiment-positive-last30seconds</code> for a category over a
     * generic name like <code>test-category</code>.
     * </p>
     * <p>
     * Category names are case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         A unique name, chosen by you, for your Call Analytics category.
     *         It's helpful to use a detailed naming system that will make sense
     *         to you in the future. For example, it's better to use
     *         <code>sentiment-positive-last30seconds</code> for a category over
     *         a generic name like <code>test-category</code>.
     *         </p>
     *         <p>
     *         Category names are case sensitive.
     *         </p>
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics category. It's
     * helpful to use a detailed naming system that will make sense to you in
     * the future. For example, it's better to use
     * <code>sentiment-positive-last30seconds</code> for a category over a
     * generic name like <code>test-category</code>.
     * </p>
     * <p>
     * Category names are case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param categoryName <p>
     *            A unique name, chosen by you, for your Call Analytics
     *            category. It's helpful to use a detailed naming system that
     *            will make sense to you in the future. For example, it's better
     *            to use <code>sentiment-positive-last30seconds</code> for a
     *            category over a generic name like <code>test-category</code>.
     *            </p>
     *            <p>
     *            Category names are case sensitive.
     *            </p>
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics category. It's
     * helpful to use a detailed naming system that will make sense to you in
     * the future. For example, it's better to use
     * <code>sentiment-positive-last30seconds</code> for a category over a
     * generic name like <code>test-category</code>.
     * </p>
     * <p>
     * Category names are case sensitive.
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
     *            A unique name, chosen by you, for your Call Analytics
     *            category. It's helpful to use a detailed naming system that
     *            will make sense to you in the future. For example, it's better
     *            to use <code>sentiment-positive-last30seconds</code> for a
     *            category over a generic name like <code>test-category</code>.
     *            </p>
     *            <p>
     *            Category names are case sensitive.
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
     * Rules define a Call Analytics category. When creating a new category, you
     * must create between 1 and 20 rules for that category. For each rule, you
     * specify a filter you want applied to the attributes of a call. For
     * example, you can choose a sentiment filter that detects if a customer's
     * sentiment was positive during the last 30 seconds of the call.
     * </p>
     *
     * @return <p>
     *         Rules define a Call Analytics category. When creating a new
     *         category, you must create between 1 and 20 rules for that
     *         category. For each rule, you specify a filter you want applied to
     *         the attributes of a call. For example, you can choose a sentiment
     *         filter that detects if a customer's sentiment was positive during
     *         the last 30 seconds of the call.
     *         </p>
     */
    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * Rules define a Call Analytics category. When creating a new category, you
     * must create between 1 and 20 rules for that category. For each rule, you
     * specify a filter you want applied to the attributes of a call. For
     * example, you can choose a sentiment filter that detects if a customer's
     * sentiment was positive during the last 30 seconds of the call.
     * </p>
     *
     * @param rules <p>
     *            Rules define a Call Analytics category. When creating a new
     *            category, you must create between 1 and 20 rules for that
     *            category. For each rule, you specify a filter you want applied
     *            to the attributes of a call. For example, you can choose a
     *            sentiment filter that detects if a customer's sentiment was
     *            positive during the last 30 seconds of the call.
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
     * Rules define a Call Analytics category. When creating a new category, you
     * must create between 1 and 20 rules for that category. For each rule, you
     * specify a filter you want applied to the attributes of a call. For
     * example, you can choose a sentiment filter that detects if a customer's
     * sentiment was positive during the last 30 seconds of the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            Rules define a Call Analytics category. When creating a new
     *            category, you must create between 1 and 20 rules for that
     *            category. For each rule, you specify a filter you want applied
     *            to the attributes of a call. For example, you can choose a
     *            sentiment filter that detects if a customer's sentiment was
     *            positive during the last 30 seconds of the call.
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
     * Rules define a Call Analytics category. When creating a new category, you
     * must create between 1 and 20 rules for that category. For each rule, you
     * specify a filter you want applied to the attributes of a call. For
     * example, you can choose a sentiment filter that detects if a customer's
     * sentiment was positive during the last 30 seconds of the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            Rules define a Call Analytics category. When creating a new
     *            category, you must create between 1 and 20 rules for that
     *            category. For each rule, you specify a filter you want applied
     *            to the attributes of a call. For example, you can choose a
     *            sentiment filter that detects if a customer's sentiment was
     *            positive during the last 30 seconds of the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCallAnalyticsCategoryRequest withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * Choose whether you want to create a real-time or a post-call category for
     * your Call Analytics transcription.
     * </p>
     * <p>
     * Specifying <code>POST_CALL</code> assigns your category to post-call
     * transcriptions; categories with this input type cannot be applied to
     * streaming (real-time) transcriptions.
     * </p>
     * <p>
     * Specifying <code>REAL_TIME</code> assigns your category to streaming
     * transcriptions; categories with this input type cannot be applied to
     * post-call transcriptions.
     * </p>
     * <p>
     * If you do not include <code>InputType</code>, your category is created as
     * a post-call category by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REAL_TIME, POST_CALL
     *
     * @return <p>
     *         Choose whether you want to create a real-time or a post-call
     *         category for your Call Analytics transcription.
     *         </p>
     *         <p>
     *         Specifying <code>POST_CALL</code> assigns your category to
     *         post-call transcriptions; categories with this input type cannot
     *         be applied to streaming (real-time) transcriptions.
     *         </p>
     *         <p>
     *         Specifying <code>REAL_TIME</code> assigns your category to
     *         streaming transcriptions; categories with this input type cannot
     *         be applied to post-call transcriptions.
     *         </p>
     *         <p>
     *         If you do not include <code>InputType</code>, your category is
     *         created as a post-call category by default.
     *         </p>
     * @see InputType
     */
    public String getInputType() {
        return inputType;
    }

    /**
     * <p>
     * Choose whether you want to create a real-time or a post-call category for
     * your Call Analytics transcription.
     * </p>
     * <p>
     * Specifying <code>POST_CALL</code> assigns your category to post-call
     * transcriptions; categories with this input type cannot be applied to
     * streaming (real-time) transcriptions.
     * </p>
     * <p>
     * Specifying <code>REAL_TIME</code> assigns your category to streaming
     * transcriptions; categories with this input type cannot be applied to
     * post-call transcriptions.
     * </p>
     * <p>
     * If you do not include <code>InputType</code>, your category is created as
     * a post-call category by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REAL_TIME, POST_CALL
     *
     * @param inputType <p>
     *            Choose whether you want to create a real-time or a post-call
     *            category for your Call Analytics transcription.
     *            </p>
     *            <p>
     *            Specifying <code>POST_CALL</code> assigns your category to
     *            post-call transcriptions; categories with this input type
     *            cannot be applied to streaming (real-time) transcriptions.
     *            </p>
     *            <p>
     *            Specifying <code>REAL_TIME</code> assigns your category to
     *            streaming transcriptions; categories with this input type
     *            cannot be applied to post-call transcriptions.
     *            </p>
     *            <p>
     *            If you do not include <code>InputType</code>, your category is
     *            created as a post-call category by default.
     *            </p>
     * @see InputType
     */
    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    /**
     * <p>
     * Choose whether you want to create a real-time or a post-call category for
     * your Call Analytics transcription.
     * </p>
     * <p>
     * Specifying <code>POST_CALL</code> assigns your category to post-call
     * transcriptions; categories with this input type cannot be applied to
     * streaming (real-time) transcriptions.
     * </p>
     * <p>
     * Specifying <code>REAL_TIME</code> assigns your category to streaming
     * transcriptions; categories with this input type cannot be applied to
     * post-call transcriptions.
     * </p>
     * <p>
     * If you do not include <code>InputType</code>, your category is created as
     * a post-call category by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REAL_TIME, POST_CALL
     *
     * @param inputType <p>
     *            Choose whether you want to create a real-time or a post-call
     *            category for your Call Analytics transcription.
     *            </p>
     *            <p>
     *            Specifying <code>POST_CALL</code> assigns your category to
     *            post-call transcriptions; categories with this input type
     *            cannot be applied to streaming (real-time) transcriptions.
     *            </p>
     *            <p>
     *            Specifying <code>REAL_TIME</code> assigns your category to
     *            streaming transcriptions; categories with this input type
     *            cannot be applied to post-call transcriptions.
     *            </p>
     *            <p>
     *            If you do not include <code>InputType</code>, your category is
     *            created as a post-call category by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputType
     */
    public CreateCallAnalyticsCategoryRequest withInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }

    /**
     * <p>
     * Choose whether you want to create a real-time or a post-call category for
     * your Call Analytics transcription.
     * </p>
     * <p>
     * Specifying <code>POST_CALL</code> assigns your category to post-call
     * transcriptions; categories with this input type cannot be applied to
     * streaming (real-time) transcriptions.
     * </p>
     * <p>
     * Specifying <code>REAL_TIME</code> assigns your category to streaming
     * transcriptions; categories with this input type cannot be applied to
     * post-call transcriptions.
     * </p>
     * <p>
     * If you do not include <code>InputType</code>, your category is created as
     * a post-call category by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REAL_TIME, POST_CALL
     *
     * @param inputType <p>
     *            Choose whether you want to create a real-time or a post-call
     *            category for your Call Analytics transcription.
     *            </p>
     *            <p>
     *            Specifying <code>POST_CALL</code> assigns your category to
     *            post-call transcriptions; categories with this input type
     *            cannot be applied to streaming (real-time) transcriptions.
     *            </p>
     *            <p>
     *            Specifying <code>REAL_TIME</code> assigns your category to
     *            streaming transcriptions; categories with this input type
     *            cannot be applied to post-call transcriptions.
     *            </p>
     *            <p>
     *            If you do not include <code>InputType</code>, your category is
     *            created as a post-call category by default.
     *            </p>
     * @see InputType
     */
    public void setInputType(InputType inputType) {
        this.inputType = inputType.toString();
    }

    /**
     * <p>
     * Choose whether you want to create a real-time or a post-call category for
     * your Call Analytics transcription.
     * </p>
     * <p>
     * Specifying <code>POST_CALL</code> assigns your category to post-call
     * transcriptions; categories with this input type cannot be applied to
     * streaming (real-time) transcriptions.
     * </p>
     * <p>
     * Specifying <code>REAL_TIME</code> assigns your category to streaming
     * transcriptions; categories with this input type cannot be applied to
     * post-call transcriptions.
     * </p>
     * <p>
     * If you do not include <code>InputType</code>, your category is created as
     * a post-call category by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REAL_TIME, POST_CALL
     *
     * @param inputType <p>
     *            Choose whether you want to create a real-time or a post-call
     *            category for your Call Analytics transcription.
     *            </p>
     *            <p>
     *            Specifying <code>POST_CALL</code> assigns your category to
     *            post-call transcriptions; categories with this input type
     *            cannot be applied to streaming (real-time) transcriptions.
     *            </p>
     *            <p>
     *            Specifying <code>REAL_TIME</code> assigns your category to
     *            streaming transcriptions; categories with this input type
     *            cannot be applied to post-call transcriptions.
     *            </p>
     *            <p>
     *            If you do not include <code>InputType</code>, your category is
     *            created as a post-call category by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputType
     */
    public CreateCallAnalyticsCategoryRequest withInputType(InputType inputType) {
        this.inputType = inputType.toString();
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
            sb.append("Rules: " + getRules() + ",");
        if (getInputType() != null)
            sb.append("InputType: " + getInputType());
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
        hashCode = prime * hashCode + ((getInputType() == null) ? 0 : getInputType().hashCode());
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
        if (other.getInputType() == null ^ this.getInputType() == null)
            return false;
        if (other.getInputType() != null
                && other.getInputType().equals(this.getInputType()) == false)
            return false;
        return true;
    }
}
