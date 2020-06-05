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
 * <p>Re-ranks a list of recommended items for the given user. The first item in the list is deemed the most likely item to be of interest to the user.</p> <note> <p>The solution backing the campaign must have been created using a recipe of type PERSONALIZED_RANKING.</p> </note>
 */
public class GetPersonalizedRankingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String campaignArn;

    /**
     * <p>A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list. The maximum is 500.</p>
     */
    private java.util.List<String> inputList;

    /**
     * <p>The user for which you want the campaign to provide a personalized ranking.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String userId;

    /**
     * <p>The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.</p>
     */
    private java.util.Map<String, String> context;

    /**
     * <p>The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.</p>
     */
    public String getCampaignArn() {
        return campaignArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param campaignArn <p>The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.</p>
     */
    public void setCampaignArn(String campaignArn) {
        this.campaignArn = campaignArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param campaignArn <p>The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetPersonalizedRankingRequest withCampaignArn(String campaignArn) {
        this.campaignArn = campaignArn;
        return this;
    }

    /**
     * <p>A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list. The maximum is 500.</p>
     *
     * @return <p>A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list. The maximum is 500.</p>
     */
    public java.util.List<String> getInputList() {
        return inputList;
    }

    /**
     * <p>A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list. The maximum is 500.</p>
     *
     * @param inputList <p>A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list. The maximum is 500.</p>
     */
    public void setInputList(java.util.Collection<String> inputList) {
        if (inputList == null) {
            this.inputList = null;
            return;
        }

        this.inputList = new java.util.ArrayList<String>(inputList);
    }

    /**
     * <p>A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list. The maximum is 500.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param inputList <p>A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list. The maximum is 500.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetPersonalizedRankingRequest withInputList(String... inputList) {
        if (getInputList() == null) {
            this.inputList = new java.util.ArrayList<String>(inputList.length);
        }
        for (String value : inputList) {
            this.inputList.add(value);
        }
        return this;
    }

    /**
     * <p>A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list. The maximum is 500.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param inputList <p>A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list. The maximum is 500.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetPersonalizedRankingRequest withInputList(java.util.Collection<String> inputList) {
        setInputList(inputList);
        return this;
    }

    /**
     * <p>The user for which you want the campaign to provide a personalized ranking.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>The user for which you want the campaign to provide a personalized ranking.</p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>The user for which you want the campaign to provide a personalized ranking.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param userId <p>The user for which you want the campaign to provide a personalized ranking.</p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>The user for which you want the campaign to provide a personalized ranking.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param userId <p>The user for which you want the campaign to provide a personalized ranking.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetPersonalizedRankingRequest withUserId(String userId) {
        this.userId = userId;
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
    public GetPersonalizedRankingRequest withContext(java.util.Map<String, String> context) {
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
    public GetPersonalizedRankingRequest addcontextEntry(String key, String value) {
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
    public GetPersonalizedRankingRequest clearcontextEntries() {
        this.context = null;
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
        if (getInputList() != null) sb.append("inputList: " + getInputList() + ",");
        if (getUserId() != null) sb.append("userId: " + getUserId() + ",");
        if (getContext() != null) sb.append("context: " + getContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaignArn() == null) ? 0 : getCampaignArn().hashCode());
        hashCode = prime * hashCode + ((getInputList() == null) ? 0 : getInputList().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetPersonalizedRankingRequest == false) return false;
        GetPersonalizedRankingRequest other = (GetPersonalizedRankingRequest)obj;

        if (other.getCampaignArn() == null ^ this.getCampaignArn() == null) return false;
        if (other.getCampaignArn() != null && other.getCampaignArn().equals(this.getCampaignArn()) == false) return false;
        if (other.getInputList() == null ^ this.getInputList() == null) return false;
        if (other.getInputList() != null && other.getInputList().equals(this.getInputList()) == false) return false;
        if (other.getUserId() == null ^ this.getUserId() == null) return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false) return false;
        if (other.getContext() == null ^ this.getContext() == null) return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false) return false;
        return true;
    }
}
