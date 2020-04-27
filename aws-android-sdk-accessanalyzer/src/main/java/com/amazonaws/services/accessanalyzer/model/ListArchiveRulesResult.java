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

/**
 * <p>
 * The response to the request.
 * </p>
 */
public class ListArchiveRulesResult implements Serializable {
    /**
     * <p>
     * A list of archive rules created for the specified analyzer.
     * </p>
     */
    private java.util.List<ArchiveRuleSummary> archiveRules;

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of archive rules created for the specified analyzer.
     * </p>
     *
     * @return <p>
     *         A list of archive rules created for the specified analyzer.
     *         </p>
     */
    public java.util.List<ArchiveRuleSummary> getArchiveRules() {
        return archiveRules;
    }

    /**
     * <p>
     * A list of archive rules created for the specified analyzer.
     * </p>
     *
     * @param archiveRules <p>
     *            A list of archive rules created for the specified analyzer.
     *            </p>
     */
    public void setArchiveRules(java.util.Collection<ArchiveRuleSummary> archiveRules) {
        if (archiveRules == null) {
            this.archiveRules = null;
            return;
        }

        this.archiveRules = new java.util.ArrayList<ArchiveRuleSummary>(archiveRules);
    }

    /**
     * <p>
     * A list of archive rules created for the specified analyzer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param archiveRules <p>
     *            A list of archive rules created for the specified analyzer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListArchiveRulesResult withArchiveRules(ArchiveRuleSummary... archiveRules) {
        if (getArchiveRules() == null) {
            this.archiveRules = new java.util.ArrayList<ArchiveRuleSummary>(archiveRules.length);
        }
        for (ArchiveRuleSummary value : archiveRules) {
            this.archiveRules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of archive rules created for the specified analyzer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param archiveRules <p>
     *            A list of archive rules created for the specified analyzer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListArchiveRulesResult withArchiveRules(
            java.util.Collection<ArchiveRuleSummary> archiveRules) {
        setArchiveRules(archiveRules);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     *
     * @return <p>
     *         A token used for pagination of results returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     *
     * @param nextToken <p>
     *            A token used for pagination of results returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token used for pagination of results returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListArchiveRulesResult withNextToken(String nextToken) {
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
        if (getArchiveRules() != null)
            sb.append("archiveRules: " + getArchiveRules() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getArchiveRules() == null) ? 0 : getArchiveRules().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListArchiveRulesResult == false)
            return false;
        ListArchiveRulesResult other = (ListArchiveRulesResult) obj;

        if (other.getArchiveRules() == null ^ this.getArchiveRules() == null)
            return false;
        if (other.getArchiveRules() != null
                && other.getArchiveRules().equals(this.getArchiveRules()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
