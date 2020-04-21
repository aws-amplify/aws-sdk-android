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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

public class GetRightsizingRecommendationResult implements Serializable {
    /**
     * <p>
     * Information regarding this specific recommendation set.
     * </p>
     */
    private RightsizingRecommendationMetadata metadata;

    /**
     * <p>
     * Summary of this recommendation set.
     * </p>
     */
    private RightsizingRecommendationSummary summary;

    /**
     * <p>
     * Recommendations to rightsize resources.
     * </p>
     */
    private java.util.List<RightsizingRecommendation> rightsizingRecommendations;

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * Enables you to customize recommendations across two attributes. You can
     * choose to view recommendations for instances within the same instance
     * families or across different instance families. You can also choose to
     * view your estimated savings associated with recommendations with
     * consideration of existing Savings Plans or RI benefits, or niether.
     * </p>
     */
    private RightsizingRecommendationConfiguration configuration;

    /**
     * <p>
     * Information regarding this specific recommendation set.
     * </p>
     *
     * @return <p>
     *         Information regarding this specific recommendation set.
     *         </p>
     */
    public RightsizingRecommendationMetadata getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Information regarding this specific recommendation set.
     * </p>
     *
     * @param metadata <p>
     *            Information regarding this specific recommendation set.
     *            </p>
     */
    public void setMetadata(RightsizingRecommendationMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Information regarding this specific recommendation set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            Information regarding this specific recommendation set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRightsizingRecommendationResult withMetadata(
            RightsizingRecommendationMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * Summary of this recommendation set.
     * </p>
     *
     * @return <p>
     *         Summary of this recommendation set.
     *         </p>
     */
    public RightsizingRecommendationSummary getSummary() {
        return summary;
    }

    /**
     * <p>
     * Summary of this recommendation set.
     * </p>
     *
     * @param summary <p>
     *            Summary of this recommendation set.
     *            </p>
     */
    public void setSummary(RightsizingRecommendationSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * Summary of this recommendation set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summary <p>
     *            Summary of this recommendation set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRightsizingRecommendationResult withSummary(RightsizingRecommendationSummary summary) {
        this.summary = summary;
        return this;
    }

    /**
     * <p>
     * Recommendations to rightsize resources.
     * </p>
     *
     * @return <p>
     *         Recommendations to rightsize resources.
     *         </p>
     */
    public java.util.List<RightsizingRecommendation> getRightsizingRecommendations() {
        return rightsizingRecommendations;
    }

    /**
     * <p>
     * Recommendations to rightsize resources.
     * </p>
     *
     * @param rightsizingRecommendations <p>
     *            Recommendations to rightsize resources.
     *            </p>
     */
    public void setRightsizingRecommendations(
            java.util.Collection<RightsizingRecommendation> rightsizingRecommendations) {
        if (rightsizingRecommendations == null) {
            this.rightsizingRecommendations = null;
            return;
        }

        this.rightsizingRecommendations = new java.util.ArrayList<RightsizingRecommendation>(
                rightsizingRecommendations);
    }

    /**
     * <p>
     * Recommendations to rightsize resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rightsizingRecommendations <p>
     *            Recommendations to rightsize resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRightsizingRecommendationResult withRightsizingRecommendations(
            RightsizingRecommendation... rightsizingRecommendations) {
        if (getRightsizingRecommendations() == null) {
            this.rightsizingRecommendations = new java.util.ArrayList<RightsizingRecommendation>(
                    rightsizingRecommendations.length);
        }
        for (RightsizingRecommendation value : rightsizingRecommendations) {
            this.rightsizingRecommendations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Recommendations to rightsize resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rightsizingRecommendations <p>
     *            Recommendations to rightsize resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRightsizingRecommendationResult withRightsizingRecommendations(
            java.util.Collection<RightsizingRecommendation> rightsizingRecommendations) {
        setRightsizingRecommendations(rightsizingRecommendations);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The token to retrieve the next set of results.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token to retrieve the next set of results.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token to retrieve the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRightsizingRecommendationResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    /**
     * <p>
     * Enables you to customize recommendations across two attributes. You can
     * choose to view recommendations for instances within the same instance
     * families or across different instance families. You can also choose to
     * view your estimated savings associated with recommendations with
     * consideration of existing Savings Plans or RI benefits, or niether.
     * </p>
     *
     * @return <p>
     *         Enables you to customize recommendations across two attributes.
     *         You can choose to view recommendations for instances within the
     *         same instance families or across different instance families. You
     *         can also choose to view your estimated savings associated with
     *         recommendations with consideration of existing Savings Plans or
     *         RI benefits, or niether.
     *         </p>
     */
    public RightsizingRecommendationConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * Enables you to customize recommendations across two attributes. You can
     * choose to view recommendations for instances within the same instance
     * families or across different instance families. You can also choose to
     * view your estimated savings associated with recommendations with
     * consideration of existing Savings Plans or RI benefits, or niether.
     * </p>
     *
     * @param configuration <p>
     *            Enables you to customize recommendations across two
     *            attributes. You can choose to view recommendations for
     *            instances within the same instance families or across
     *            different instance families. You can also choose to view your
     *            estimated savings associated with recommendations with
     *            consideration of existing Savings Plans or RI benefits, or
     *            niether.
     *            </p>
     */
    public void setConfiguration(RightsizingRecommendationConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Enables you to customize recommendations across two attributes. You can
     * choose to view recommendations for instances within the same instance
     * families or across different instance families. You can also choose to
     * view your estimated savings associated with recommendations with
     * consideration of existing Savings Plans or RI benefits, or niether.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configuration <p>
     *            Enables you to customize recommendations across two
     *            attributes. You can choose to view recommendations for
     *            instances within the same instance families or across
     *            different instance families. You can also choose to view your
     *            estimated savings associated with recommendations with
     *            consideration of existing Savings Plans or RI benefits, or
     *            niether.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRightsizingRecommendationResult withConfiguration(
            RightsizingRecommendationConfiguration configuration) {
        this.configuration = configuration;
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
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata() + ",");
        if (getSummary() != null)
            sb.append("Summary: " + getSummary() + ",");
        if (getRightsizingRecommendations() != null)
            sb.append("RightsizingRecommendations: " + getRightsizingRecommendations() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken() + ",");
        if (getConfiguration() != null)
            sb.append("Configuration: " + getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime
                * hashCode
                + ((getRightsizingRecommendations() == null) ? 0 : getRightsizingRecommendations()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        hashCode = prime * hashCode
                + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRightsizingRecommendationResult == false)
            return false;
        GetRightsizingRecommendationResult other = (GetRightsizingRecommendationResult) obj;

        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getRightsizingRecommendations() == null
                ^ this.getRightsizingRecommendations() == null)
            return false;
        if (other.getRightsizingRecommendations() != null
                && other.getRightsizingRecommendations().equals(
                        this.getRightsizingRecommendations()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null
                && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }
}
