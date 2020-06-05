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
package com.amazonaws.services.personalize-runtime.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Returns a list of recommended items. The required input depends on the recipe type used to create the solution backing the campaign, as follows:</p> <ul> <li> <p>RELATED_ITEMS - <code>itemId</code> required, <code>userId</code> not used</p> </li> <li> <p>USER_PERSONALIZATION - <code>itemId</code> optional, <code>userId</code> required</p> </li> </ul> <note> <p>Campaigns that are backed by a solution created using a recipe of type PERSONALIZED_RANKING use the API.</p> </note>
 */
public class GetRecommendationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String campaignArn;

    /**
     * <p>The item ID to provide recommendations for.</p> <p>Required for <code>RELATED_ITEMS</code> recipe type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String itemId;

    /**
     * <p>The user ID to provide recommendations for.</p> <p>Required for <code>USER_PERSONALIZATION</code> recipe type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String userId;

    /**
     * <p>The number of results to return. The default is 25. The maximum is 500.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer numResults;

    /**
     * <p>The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.</p>
     */
    private java.util.Map<String, String> context;

    /**
     * <p>The ARN of the filter to apply to the returned recommendations. For more information, see Using Filters with Amazon Personalize.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String filterArn;

    /**
     * <p>The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.</p>
     */
    public String getCampaignArn() {
        return campaignArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param campaignArn <p>The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.</p>
     */
    public void setCampaignArn(String campaignArn) {
        this.campaignArn = campaignArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param campaignArn <p>The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationsRequest withCampaignArn(String campaignArn) {
        this.campaignArn = campaignArn;
        return this;
    }

    /**
     * <p>The item ID to provide recommendations for.</p> <p>Required for <code>RELATED_ITEMS</code> recipe type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>The item ID to provide recommendations for.</p> <p>Required for <code>RELATED_ITEMS</code> recipe type.</p>
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * <p>The item ID to provide recommendations for.</p> <p>Required for <code>RELATED_ITEMS</code> recipe type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param itemId <p>The item ID to provide recommendations for.</p> <p>Required for <code>RELATED_ITEMS</code> recipe type.</p>
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * <p>The item ID to provide recommendations for.</p> <p>Required for <code>RELATED_ITEMS</code> recipe type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param itemId <p>The item ID to provide recommendations for.</p> <p>Required for <code>RELATED_ITEMS</code> recipe type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationsRequest withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * <p>The user ID to provide recommendations for.</p> <p>Required for <code>USER_PERSONALIZATION</code> recipe type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>The user ID to provide recommendations for.</p> <p>Required for <code>USER_PERSONALIZATION</code> recipe type.</p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>The user ID to provide recommendations for.</p> <p>Required for <code>USER_PERSONALIZATION</code> recipe type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param userId <p>The user ID to provide recommendations for.</p> <p>Required for <code>USER_PERSONALIZATION</code> recipe type.</p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>The user ID to provide recommendations for.</p> <p>Required for <code>USER_PERSONALIZATION</code> recipe type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param userId <p>The user ID to provide recommendations for.</p> <p>Required for <code>USER_PERSONALIZATION</code> recipe type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationsRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>The number of results to return. The default is 25. The maximum is 500.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>The number of results to return. The default is 25. The maximum is 500.</p>
     */
    public Integer getNumResults() {
        return numResults;
    }

    /**
     * <p>The number of results to return. The default is 25. The maximum is 500.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numResults <p>The number of results to return. The default is 25. The maximum is 500.</p>
     */
    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    /**
     * <p>The number of results to return. The default is 25. The maximum is 500.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numResults <p>The number of results to return. The default is 25. The maximum is 500.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationsRequest withNumResults(Integer numResults) {
        this.numResults = numResults;
        return this;
    }

    /**
     * <p>The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.</p>
     *
     * @return <p>The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.</p>
     */
    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * <p>The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.</p>
     *
     * @param context <p>The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.</p>
     */
    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * <p>The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param context <p>The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationsRequest withContext(java.util.Map<String, String> context) {
        this.context = context;
        return this;
    }

    /**
     * <p>The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.</p>
     * <p>
     * The method adds a new key-value pair into context parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into context.
     * @param value The corresponding value of the entry to be added into context.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationsRequest addcontextEntry(String key, String value) {
        if (null == this.context) {
            this.context = new java.util.HashMap<String, String>();
        }
        if (this.context.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.context.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into context.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public GetRecommendationsRequest clearcontextEntries() {
        this.context = null;
        return this;
    }

    /**
     * <p>The ARN of the filter to apply to the returned recommendations. For more information, see Using Filters with Amazon Personalize.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>The ARN of the filter to apply to the returned recommendations. For more information, see Using Filters with Amazon Personalize.</p>
     */
    public String getFilterArn() {
        return filterArn;
    }

    /**
     * <p>The ARN of the filter to apply to the returned recommendations. For more information, see Using Filters with Amazon Personalize.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param filterArn <p>The ARN of the filter to apply to the returned recommendations. For more information, see Using Filters with Amazon Personalize.</p>
     */
    public void setFilterArn(String filterArn) {
        this.filterArn = filterArn;
    }

    /**
     * <p>The ARN of the filter to apply to the returned recommendations. For more information, see Using Filters with Amazon Personalize.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param filterArn <p>The ARN of the filter to apply to the returned recommendations. For more information, see Using Filters with Amazon Personalize.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetRecommendationsRequest withFilterArn(String filterArn) {
        this.filterArn = filterArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCampaignArn() != null) sb.append("campaignArn: " + getCampaignArn() + ",");
        if (getItemId() != null) sb.append("itemId: " + getItemId() + ",");
        if (getUserId() != null) sb.append("userId: " + getUserId() + ",");
        if (getNumResults() != null) sb.append("numResults: " + getNumResults() + ",");
        if (getContext() != null) sb.append("context: " + getContext() + ",");
        if (getFilterArn() != null) sb.append("filterArn: " + getFilterArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaignArn() == null) ? 0 : getCampaignArn().hashCode());
        hashCode = prime * hashCode + ((getItemId() == null) ? 0 : getItemId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getNumResults() == null) ? 0 : getNumResults().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getFilterArn() == null) ? 0 : getFilterArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetRecommendationsRequest == false) return false;
        GetRecommendationsRequest other = (GetRecommendationsRequest)obj;

        if (other.getCampaignArn() == null ^ this.getCampaignArn() == null) return false;
        if (other.getCampaignArn() != null && other.getCampaignArn().equals(this.getCampaignArn()) == false) return false;
        if (other.getItemId() == null ^ this.getItemId() == null) return false;
        if (other.getItemId() != null && other.getItemId().equals(this.getItemId()) == false) return false;
        if (other.getUserId() == null ^ this.getUserId() == null) return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false) return false;
        if (other.getNumResults() == null ^ this.getNumResults() == null) return false;
        if (other.getNumResults() != null && other.getNumResults().equals(this.getNumResults()) == false) return false;
        if (other.getContext() == null ^ this.getContext() == null) return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false) return false;
        if (other.getFilterArn() == null ^ this.getFilterArn() == null) return false;
        if (other.getFilterArn() != null && other.getFilterArn().equals(this.getFilterArn()) == false) return false;
        return true;
    }
}
