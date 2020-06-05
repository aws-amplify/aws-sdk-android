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


public class GetPersonalizedRankingResult implements Serializable {
    /**
     * <p>A list of items in order of most likely interest to the user. The maximum is 500.</p>
     */
    private java.util.List<PredictedItem> personalizedRanking;

    /**
     * <p>A list of items in order of most likely interest to the user. The maximum is 500.</p>
     *
     * @return <p>A list of items in order of most likely interest to the user. The maximum is 500.</p>
     */
    public java.util.List<PredictedItem> getPersonalizedRanking() {
        return personalizedRanking;
    }

    /**
     * <p>A list of items in order of most likely interest to the user. The maximum is 500.</p>
     *
     * @param personalizedRanking <p>A list of items in order of most likely interest to the user. The maximum is 500.</p>
     */
    public void setPersonalizedRanking(java.util.Collection<PredictedItem> personalizedRanking) {
        if (personalizedRanking == null) {
            this.personalizedRanking = null;
            return;
        }

        this.personalizedRanking = new java.util.ArrayList<PredictedItem>(personalizedRanking);
    }

    /**
     * <p>A list of items in order of most likely interest to the user. The maximum is 500.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param personalizedRanking <p>A list of items in order of most likely interest to the user. The maximum is 500.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetPersonalizedRankingResult withPersonalizedRanking(PredictedItem... personalizedRanking) {
        if (getPersonalizedRanking() == null) {
            this.personalizedRanking = new java.util.ArrayList<PredictedItem>(personalizedRanking.length);
        }
        for (PredictedItem value : personalizedRanking) {
            this.personalizedRanking.add(value);
        }
        return this;
    }

    /**
     * <p>A list of items in order of most likely interest to the user. The maximum is 500.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param personalizedRanking <p>A list of items in order of most likely interest to the user. The maximum is 500.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetPersonalizedRankingResult withPersonalizedRanking(java.util.Collection<PredictedItem> personalizedRanking) {
        setPersonalizedRanking(personalizedRanking);
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
        if (getPersonalizedRanking() != null) sb.append("personalizedRanking: " + getPersonalizedRanking());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPersonalizedRanking() == null) ? 0 : getPersonalizedRanking().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetPersonalizedRankingResult == false) return false;
        GetPersonalizedRankingResult other = (GetPersonalizedRankingResult)obj;

        if (other.getPersonalizedRanking() == null ^ this.getPersonalizedRanking() == null) return false;
        if (other.getPersonalizedRanking() != null && other.getPersonalizedRanking().equals(this.getPersonalizedRanking()) == false) return false;
        return true;
    }
}
