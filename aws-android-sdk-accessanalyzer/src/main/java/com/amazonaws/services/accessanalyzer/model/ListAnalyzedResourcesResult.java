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
public class ListAnalyzedResourcesResult implements Serializable {
    /**
     * <p>
     * A list of resources that were analyzed.
     * </p>
     */
    private java.util.List<AnalyzedResourceSummary> analyzedResources;

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of resources that were analyzed.
     * </p>
     *
     * @return <p>
     *         A list of resources that were analyzed.
     *         </p>
     */
    public java.util.List<AnalyzedResourceSummary> getAnalyzedResources() {
        return analyzedResources;
    }

    /**
     * <p>
     * A list of resources that were analyzed.
     * </p>
     *
     * @param analyzedResources <p>
     *            A list of resources that were analyzed.
     *            </p>
     */
    public void setAnalyzedResources(java.util.Collection<AnalyzedResourceSummary> analyzedResources) {
        if (analyzedResources == null) {
            this.analyzedResources = null;
            return;
        }

        this.analyzedResources = new java.util.ArrayList<AnalyzedResourceSummary>(analyzedResources);
    }

    /**
     * <p>
     * A list of resources that were analyzed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyzedResources <p>
     *            A list of resources that were analyzed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAnalyzedResourcesResult withAnalyzedResources(
            AnalyzedResourceSummary... analyzedResources) {
        if (getAnalyzedResources() == null) {
            this.analyzedResources = new java.util.ArrayList<AnalyzedResourceSummary>(
                    analyzedResources.length);
        }
        for (AnalyzedResourceSummary value : analyzedResources) {
            this.analyzedResources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of resources that were analyzed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyzedResources <p>
     *            A list of resources that were analyzed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAnalyzedResourcesResult withAnalyzedResources(
            java.util.Collection<AnalyzedResourceSummary> analyzedResources) {
        setAnalyzedResources(analyzedResources);
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
    public ListAnalyzedResourcesResult withNextToken(String nextToken) {
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
        if (getAnalyzedResources() != null)
            sb.append("analyzedResources: " + getAnalyzedResources() + ",");
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
                + ((getAnalyzedResources() == null) ? 0 : getAnalyzedResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAnalyzedResourcesResult == false)
            return false;
        ListAnalyzedResourcesResult other = (ListAnalyzedResourcesResult) obj;

        if (other.getAnalyzedResources() == null ^ this.getAnalyzedResources() == null)
            return false;
        if (other.getAnalyzedResources() != null
                && other.getAnalyzedResources().equals(this.getAnalyzedResources()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
