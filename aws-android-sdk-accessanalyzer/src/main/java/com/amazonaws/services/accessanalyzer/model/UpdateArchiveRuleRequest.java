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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the criteria and values for the specified archive rule.
 * </p>
 */
public class UpdateArchiveRuleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the analyzer to update the archive rules for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     */
    private String analyzerName;

    /**
     * <p>
     * A client token.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A filter to match for the rules to update. Only rules that match the
     * filter are updated.
     * </p>
     */
    private java.util.Map<String, Criterion> filter;

    /**
     * <p>
     * The name of the rule to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     */
    private String ruleName;

    /**
     * <p>
     * The name of the analyzer to update the archive rules for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @return <p>
     *         The name of the analyzer to update the archive rules for.
     *         </p>
     */
    public String getAnalyzerName() {
        return analyzerName;
    }

    /**
     * <p>
     * The name of the analyzer to update the archive rules for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @param analyzerName <p>
     *            The name of the analyzer to update the archive rules for.
     *            </p>
     */
    public void setAnalyzerName(String analyzerName) {
        this.analyzerName = analyzerName;
    }

    /**
     * <p>
     * The name of the analyzer to update the archive rules for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @param analyzerName <p>
     *            The name of the analyzer to update the archive rules for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateArchiveRuleRequest withAnalyzerName(String analyzerName) {
        this.analyzerName = analyzerName;
        return this;
    }

    /**
     * <p>
     * A client token.
     * </p>
     *
     * @return <p>
     *         A client token.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     *
     * @param clientToken <p>
     *            A client token.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            A client token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateArchiveRuleRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * A filter to match for the rules to update. Only rules that match the
     * filter are updated.
     * </p>
     *
     * @return <p>
     *         A filter to match for the rules to update. Only rules that match
     *         the filter are updated.
     *         </p>
     */
    public java.util.Map<String, Criterion> getFilter() {
        return filter;
    }

    /**
     * <p>
     * A filter to match for the rules to update. Only rules that match the
     * filter are updated.
     * </p>
     *
     * @param filter <p>
     *            A filter to match for the rules to update. Only rules that
     *            match the filter are updated.
     *            </p>
     */
    public void setFilter(java.util.Map<String, Criterion> filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A filter to match for the rules to update. Only rules that match the
     * filter are updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            A filter to match for the rules to update. Only rules that
     *            match the filter are updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateArchiveRuleRequest withFilter(java.util.Map<String, Criterion> filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * A filter to match for the rules to update. Only rules that match the
     * filter are updated.
     * </p>
     * <p>
     * The method adds a new key-value pair into filter parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into filter.
     * @param value The corresponding value of the entry to be added into
     *            filter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateArchiveRuleRequest addfilterEntry(String key, Criterion value) {
        if (null == this.filter) {
            this.filter = new java.util.HashMap<String, Criterion>();
        }
        if (this.filter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.filter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateArchiveRuleRequest clearfilterEntries() {
        this.filter = null;
        return this;
    }

    /**
     * <p>
     * The name of the rule to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @return <p>
     *         The name of the rule to update.
     *         </p>
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * <p>
     * The name of the rule to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @param ruleName <p>
     *            The name of the rule to update.
     *            </p>
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the rule to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @param ruleName <p>
     *            The name of the rule to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateArchiveRuleRequest withRuleName(String ruleName) {
        this.ruleName = ruleName;
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
        if (getAnalyzerName() != null)
            sb.append("analyzerName: " + getAnalyzerName() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getFilter() != null)
            sb.append("filter: " + getFilter() + ",");
        if (getRuleName() != null)
            sb.append("ruleName: " + getRuleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAnalyzerName() == null) ? 0 : getAnalyzerName().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateArchiveRuleRequest == false)
            return false;
        UpdateArchiveRuleRequest other = (UpdateArchiveRuleRequest) obj;

        if (other.getAnalyzerName() == null ^ this.getAnalyzerName() == null)
            return false;
        if (other.getAnalyzerName() != null
                && other.getAnalyzerName().equals(this.getAnalyzerName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        return true;
    }
}
