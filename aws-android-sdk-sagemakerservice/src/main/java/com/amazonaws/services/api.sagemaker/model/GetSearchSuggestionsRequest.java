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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * An auto-complete API for the search functionality in the Amazon SageMaker
 * console. It returns suggestions of possible matches for the property name to
 * use in <code>Search</code> queries. Provides suggestions for
 * <code>HyperParameters</code>, <code>Tags</code>, and <code>Metrics</code>.
 * </p>
 */
public class GetSearchSuggestionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TrainingJob, Experiment, ExperimentTrial,
     * ExperimentTrialComponent
     */
    private String resource;

    /**
     * <p>
     * Limits the property names that are included in the response.
     * </p>
     */
    private SuggestionQuery suggestionQuery;

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TrainingJob, Experiment, ExperimentTrial,
     * ExperimentTrialComponent
     *
     * @return <p>
     *         The name of the Amazon SageMaker resource to search for.
     *         </p>
     * @see ResourceType
     */
    public String getResource() {
        return resource;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TrainingJob, Experiment, ExperimentTrial,
     * ExperimentTrialComponent
     *
     * @param resource <p>
     *            The name of the Amazon SageMaker resource to search for.
     *            </p>
     * @see ResourceType
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TrainingJob, Experiment, ExperimentTrial,
     * ExperimentTrialComponent
     *
     * @param resource <p>
     *            The name of the Amazon SageMaker resource to search for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public GetSearchSuggestionsRequest withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TrainingJob, Experiment, ExperimentTrial,
     * ExperimentTrialComponent
     *
     * @param resource <p>
     *            The name of the Amazon SageMaker resource to search for.
     *            </p>
     * @see ResourceType
     */
    public void setResource(ResourceType resource) {
        this.resource = resource.toString();
    }

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TrainingJob, Experiment, ExperimentTrial,
     * ExperimentTrialComponent
     *
     * @param resource <p>
     *            The name of the Amazon SageMaker resource to search for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public GetSearchSuggestionsRequest withResource(ResourceType resource) {
        this.resource = resource.toString();
        return this;
    }

    /**
     * <p>
     * Limits the property names that are included in the response.
     * </p>
     *
     * @return <p>
     *         Limits the property names that are included in the response.
     *         </p>
     */
    public SuggestionQuery getSuggestionQuery() {
        return suggestionQuery;
    }

    /**
     * <p>
     * Limits the property names that are included in the response.
     * </p>
     *
     * @param suggestionQuery <p>
     *            Limits the property names that are included in the response.
     *            </p>
     */
    public void setSuggestionQuery(SuggestionQuery suggestionQuery) {
        this.suggestionQuery = suggestionQuery;
    }

    /**
     * <p>
     * Limits the property names that are included in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param suggestionQuery <p>
     *            Limits the property names that are included in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSearchSuggestionsRequest withSuggestionQuery(SuggestionQuery suggestionQuery) {
        this.suggestionQuery = suggestionQuery;
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
        if (getResource() != null)
            sb.append("Resource: " + getResource() + ",");
        if (getSuggestionQuery() != null)
            sb.append("SuggestionQuery: " + getSuggestionQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode
                + ((getSuggestionQuery() == null) ? 0 : getSuggestionQuery().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSearchSuggestionsRequest == false)
            return false;
        GetSearchSuggestionsRequest other = (GetSearchSuggestionsRequest) obj;

        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getSuggestionQuery() == null ^ this.getSuggestionQuery() == null)
            return false;
        if (other.getSuggestionQuery() != null
                && other.getSuggestionQuery().equals(this.getSuggestionQuery()) == false)
            return false;
        return true;
    }
}
