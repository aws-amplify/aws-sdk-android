/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Updates the call analytics category with new values. The
 * <code>UpdateCallAnalyticsCategory</code> operation overwrites all of the
 * existing information with the values that you provide in the request.
 * </p>
 */
public class UpdateCallAnalyticsCategoryRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the analytics category to update. The name is case sensitive.
     * If you try to update a call analytics category with the same name as a
     * previous category you will receive a <code>ConflictException</code>
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String categoryName;

    /**
     * <p>
     * The rules used for the updated analytics category. The rules that you
     * provide in this field replace the ones that are currently being used.
     * </p>
     */
    private java.util.List<Rule> rules;

    /**
     * <p>
     * The name of the analytics category to update. The name is case sensitive.
     * If you try to update a call analytics category with the same name as a
     * previous category you will receive a <code>ConflictException</code>
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the analytics category to update. The name is case
     *         sensitive. If you try to update a call analytics category with
     *         the same name as a previous category you will receive a
     *         <code>ConflictException</code> error.
     *         </p>
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * <p>
     * The name of the analytics category to update. The name is case sensitive.
     * If you try to update a call analytics category with the same name as a
     * previous category you will receive a <code>ConflictException</code>
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param categoryName <p>
     *            The name of the analytics category to update. The name is case
     *            sensitive. If you try to update a call analytics category with
     *            the same name as a previous category you will receive a
     *            <code>ConflictException</code> error.
     *            </p>
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * <p>
     * The name of the analytics category to update. The name is case sensitive.
     * If you try to update a call analytics category with the same name as a
     * previous category you will receive a <code>ConflictException</code>
     * error.
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
     *            The name of the analytics category to update. The name is case
     *            sensitive. If you try to update a call analytics category with
     *            the same name as a previous category you will receive a
     *            <code>ConflictException</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCallAnalyticsCategoryRequest withCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * <p>
     * The rules used for the updated analytics category. The rules that you
     * provide in this field replace the ones that are currently being used.
     * </p>
     *
     * @return <p>
     *         The rules used for the updated analytics category. The rules that
     *         you provide in this field replace the ones that are currently
     *         being used.
     *         </p>
     */
    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules used for the updated analytics category. The rules that you
     * provide in this field replace the ones that are currently being used.
     * </p>
     *
     * @param rules <p>
     *            The rules used for the updated analytics category. The rules
     *            that you provide in this field replace the ones that are
     *            currently being used.
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
     * The rules used for the updated analytics category. The rules that you
     * provide in this field replace the ones that are currently being used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            The rules used for the updated analytics category. The rules
     *            that you provide in this field replace the ones that are
     *            currently being used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCallAnalyticsCategoryRequest withRules(Rule... rules) {
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
     * The rules used for the updated analytics category. The rules that you
     * provide in this field replace the ones that are currently being used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            The rules used for the updated analytics category. The rules
     *            that you provide in this field replace the ones that are
     *            currently being used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCallAnalyticsCategoryRequest withRules(java.util.Collection<Rule> rules) {
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

        if (obj instanceof UpdateCallAnalyticsCategoryRequest == false)
            return false;
        UpdateCallAnalyticsCategoryRequest other = (UpdateCallAnalyticsCategoryRequest) obj;

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
