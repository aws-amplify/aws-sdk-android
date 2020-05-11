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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

public class QueryResult implements Serializable {
    /**
     * <p>
     * The unique identifier for the search. You use <code>QueryId</code> to
     * identify the search when using the feedback API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String queryId;

    /**
     * <p>
     * The results of the search.
     * </p>
     */
    private java.util.List<QueryResultItem> resultItems;

    /**
     * <p>
     * Contains the facet results. A <code>FacetResult</code> contains the
     * counts for each attribute key that was specified in the
     * <code>Facets</code> input parameter.
     * </p>
     */
    private java.util.List<FacetResult> facetResults;

    /**
     * <p>
     * The number of items returned by the search. Use this to determine when
     * you have requested the last set of results.
     * </p>
     */
    private Integer totalNumberOfResults;

    /**
     * <p>
     * The unique identifier for the search. You use <code>QueryId</code> to
     * identify the search when using the feedback API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The unique identifier for the search. You use
     *         <code>QueryId</code> to identify the search when using the
     *         feedback API.
     *         </p>
     */
    public String getQueryId() {
        return queryId;
    }

    /**
     * <p>
     * The unique identifier for the search. You use <code>QueryId</code> to
     * identify the search when using the feedback API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param queryId <p>
     *            The unique identifier for the search. You use
     *            <code>QueryId</code> to identify the search when using the
     *            feedback API.
     *            </p>
     */
    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The unique identifier for the search. You use <code>QueryId</code> to
     * identify the search when using the feedback API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param queryId <p>
     *            The unique identifier for the search. You use
     *            <code>QueryId</code> to identify the search when using the
     *            feedback API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResult withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * <p>
     * The results of the search.
     * </p>
     *
     * @return <p>
     *         The results of the search.
     *         </p>
     */
    public java.util.List<QueryResultItem> getResultItems() {
        return resultItems;
    }

    /**
     * <p>
     * The results of the search.
     * </p>
     *
     * @param resultItems <p>
     *            The results of the search.
     *            </p>
     */
    public void setResultItems(java.util.Collection<QueryResultItem> resultItems) {
        if (resultItems == null) {
            this.resultItems = null;
            return;
        }

        this.resultItems = new java.util.ArrayList<QueryResultItem>(resultItems);
    }

    /**
     * <p>
     * The results of the search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultItems <p>
     *            The results of the search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResult withResultItems(QueryResultItem... resultItems) {
        if (getResultItems() == null) {
            this.resultItems = new java.util.ArrayList<QueryResultItem>(resultItems.length);
        }
        for (QueryResultItem value : resultItems) {
            this.resultItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The results of the search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultItems <p>
     *            The results of the search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResult withResultItems(java.util.Collection<QueryResultItem> resultItems) {
        setResultItems(resultItems);
        return this;
    }

    /**
     * <p>
     * Contains the facet results. A <code>FacetResult</code> contains the
     * counts for each attribute key that was specified in the
     * <code>Facets</code> input parameter.
     * </p>
     *
     * @return <p>
     *         Contains the facet results. A <code>FacetResult</code> contains
     *         the counts for each attribute key that was specified in the
     *         <code>Facets</code> input parameter.
     *         </p>
     */
    public java.util.List<FacetResult> getFacetResults() {
        return facetResults;
    }

    /**
     * <p>
     * Contains the facet results. A <code>FacetResult</code> contains the
     * counts for each attribute key that was specified in the
     * <code>Facets</code> input parameter.
     * </p>
     *
     * @param facetResults <p>
     *            Contains the facet results. A <code>FacetResult</code>
     *            contains the counts for each attribute key that was specified
     *            in the <code>Facets</code> input parameter.
     *            </p>
     */
    public void setFacetResults(java.util.Collection<FacetResult> facetResults) {
        if (facetResults == null) {
            this.facetResults = null;
            return;
        }

        this.facetResults = new java.util.ArrayList<FacetResult>(facetResults);
    }

    /**
     * <p>
     * Contains the facet results. A <code>FacetResult</code> contains the
     * counts for each attribute key that was specified in the
     * <code>Facets</code> input parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param facetResults <p>
     *            Contains the facet results. A <code>FacetResult</code>
     *            contains the counts for each attribute key that was specified
     *            in the <code>Facets</code> input parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResult withFacetResults(FacetResult... facetResults) {
        if (getFacetResults() == null) {
            this.facetResults = new java.util.ArrayList<FacetResult>(facetResults.length);
        }
        for (FacetResult value : facetResults) {
            this.facetResults.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the facet results. A <code>FacetResult</code> contains the
     * counts for each attribute key that was specified in the
     * <code>Facets</code> input parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param facetResults <p>
     *            Contains the facet results. A <code>FacetResult</code>
     *            contains the counts for each attribute key that was specified
     *            in the <code>Facets</code> input parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResult withFacetResults(java.util.Collection<FacetResult> facetResults) {
        setFacetResults(facetResults);
        return this;
    }

    /**
     * <p>
     * The number of items returned by the search. Use this to determine when
     * you have requested the last set of results.
     * </p>
     *
     * @return <p>
     *         The number of items returned by the search. Use this to determine
     *         when you have requested the last set of results.
     *         </p>
     */
    public Integer getTotalNumberOfResults() {
        return totalNumberOfResults;
    }

    /**
     * <p>
     * The number of items returned by the search. Use this to determine when
     * you have requested the last set of results.
     * </p>
     *
     * @param totalNumberOfResults <p>
     *            The number of items returned by the search. Use this to
     *            determine when you have requested the last set of results.
     *            </p>
     */
    public void setTotalNumberOfResults(Integer totalNumberOfResults) {
        this.totalNumberOfResults = totalNumberOfResults;
    }

    /**
     * <p>
     * The number of items returned by the search. Use this to determine when
     * you have requested the last set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalNumberOfResults <p>
     *            The number of items returned by the search. Use this to
     *            determine when you have requested the last set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResult withTotalNumberOfResults(Integer totalNumberOfResults) {
        this.totalNumberOfResults = totalNumberOfResults;
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
        if (getQueryId() != null)
            sb.append("QueryId: " + getQueryId() + ",");
        if (getResultItems() != null)
            sb.append("ResultItems: " + getResultItems() + ",");
        if (getFacetResults() != null)
            sb.append("FacetResults: " + getFacetResults() + ",");
        if (getTotalNumberOfResults() != null)
            sb.append("TotalNumberOfResults: " + getTotalNumberOfResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode
                + ((getResultItems() == null) ? 0 : getResultItems().hashCode());
        hashCode = prime * hashCode
                + ((getFacetResults() == null) ? 0 : getFacetResults().hashCode());
        hashCode = prime * hashCode
                + ((getTotalNumberOfResults() == null) ? 0 : getTotalNumberOfResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryResult == false)
            return false;
        QueryResult other = (QueryResult) obj;

        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getResultItems() == null ^ this.getResultItems() == null)
            return false;
        if (other.getResultItems() != null
                && other.getResultItems().equals(this.getResultItems()) == false)
            return false;
        if (other.getFacetResults() == null ^ this.getFacetResults() == null)
            return false;
        if (other.getFacetResults() != null
                && other.getFacetResults().equals(this.getFacetResults()) == false)
            return false;
        if (other.getTotalNumberOfResults() == null ^ this.getTotalNumberOfResults() == null)
            return false;
        if (other.getTotalNumberOfResults() != null
                && other.getTotalNumberOfResults().equals(this.getTotalNumberOfResults()) == false)
            return false;
        return true;
    }
}
