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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


public class DescribePatchBaselinesResult implements Serializable {
    /**
     * <p>An array of PatchBaselineIdentity elements.</p>
     */
    private java.util.List<PatchBaselineIdentity> baselineIdentities;

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    private String nextToken;

    /**
     * <p>An array of PatchBaselineIdentity elements.</p>
     *
     * @return <p>An array of PatchBaselineIdentity elements.</p>
     */
    public java.util.List<PatchBaselineIdentity> getBaselineIdentities() {
        return baselineIdentities;
    }

    /**
     * <p>An array of PatchBaselineIdentity elements.</p>
     *
     * @param baselineIdentities <p>An array of PatchBaselineIdentity elements.</p>
     */
    public void setBaselineIdentities(java.util.Collection<PatchBaselineIdentity> baselineIdentities) {
        if (baselineIdentities == null) {
            this.baselineIdentities = null;
            return;
        }

        this.baselineIdentities = new java.util.ArrayList<PatchBaselineIdentity>(baselineIdentities);
    }

    /**
     * <p>An array of PatchBaselineIdentity elements.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param baselineIdentities <p>An array of PatchBaselineIdentity elements.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchBaselinesResult withBaselineIdentities(PatchBaselineIdentity... baselineIdentities) {
        if (getBaselineIdentities() == null) {
            this.baselineIdentities = new java.util.ArrayList<PatchBaselineIdentity>(baselineIdentities.length);
        }
        for (PatchBaselineIdentity value : baselineIdentities) {
            this.baselineIdentities.add(value);
        }
        return this;
    }

    /**
     * <p>An array of PatchBaselineIdentity elements.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param baselineIdentities <p>An array of PatchBaselineIdentity elements.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchBaselinesResult withBaselineIdentities(java.util.Collection<PatchBaselineIdentity> baselineIdentities) {
        setBaselineIdentities(baselineIdentities);
        return this;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @return <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @param nextToken <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribePatchBaselinesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getBaselineIdentities() != null) sb.append("BaselineIdentities: " + getBaselineIdentities() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineIdentities() == null) ? 0 : getBaselineIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribePatchBaselinesResult == false) return false;
        DescribePatchBaselinesResult other = (DescribePatchBaselinesResult)obj;

        if (other.getBaselineIdentities() == null ^ this.getBaselineIdentities() == null) return false;
        if (other.getBaselineIdentities() != null && other.getBaselineIdentities().equals(this.getBaselineIdentities()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
