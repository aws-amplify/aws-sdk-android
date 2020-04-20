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

public class GetSavingsPlansCoverageResult implements Serializable {
    /**
     * <p>
     * The amount of spend that your Savings Plans covered.
     * </p>
     */
    private java.util.List<SavingsPlansCoverage> savingsPlansCoverages;

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The amount of spend that your Savings Plans covered.
     * </p>
     *
     * @return <p>
     *         The amount of spend that your Savings Plans covered.
     *         </p>
     */
    public java.util.List<SavingsPlansCoverage> getSavingsPlansCoverages() {
        return savingsPlansCoverages;
    }

    /**
     * <p>
     * The amount of spend that your Savings Plans covered.
     * </p>
     *
     * @param savingsPlansCoverages <p>
     *            The amount of spend that your Savings Plans covered.
     *            </p>
     */
    public void setSavingsPlansCoverages(
            java.util.Collection<SavingsPlansCoverage> savingsPlansCoverages) {
        if (savingsPlansCoverages == null) {
            this.savingsPlansCoverages = null;
            return;
        }

        this.savingsPlansCoverages = new java.util.ArrayList<SavingsPlansCoverage>(
                savingsPlansCoverages);
    }

    /**
     * <p>
     * The amount of spend that your Savings Plans covered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param savingsPlansCoverages <p>
     *            The amount of spend that your Savings Plans covered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansCoverageResult withSavingsPlansCoverages(
            SavingsPlansCoverage... savingsPlansCoverages) {
        if (getSavingsPlansCoverages() == null) {
            this.savingsPlansCoverages = new java.util.ArrayList<SavingsPlansCoverage>(
                    savingsPlansCoverages.length);
        }
        for (SavingsPlansCoverage value : savingsPlansCoverages) {
            this.savingsPlansCoverages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The amount of spend that your Savings Plans covered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param savingsPlansCoverages <p>
     *            The amount of spend that your Savings Plans covered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansCoverageResult withSavingsPlansCoverages(
            java.util.Collection<SavingsPlansCoverage> savingsPlansCoverages) {
        setSavingsPlansCoverages(savingsPlansCoverages);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The token to retrieve the next set of results. Amazon Web
     *         Services provides the token when the response from a previous
     *         call has more results than the maximum page size.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextToken <p>
     *            The token to retrieve the next set of results. Amazon Web
     *            Services provides the token when the response from a previous
     *            call has more results than the maximum page size.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextToken <p>
     *            The token to retrieve the next set of results. Amazon Web
     *            Services provides the token when the response from a previous
     *            call has more results than the maximum page size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansCoverageResult withNextToken(String nextToken) {
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
        if (getSavingsPlansCoverages() != null)
            sb.append("SavingsPlansCoverages: " + getSavingsPlansCoverages() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSavingsPlansCoverages() == null) ? 0 : getSavingsPlansCoverages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSavingsPlansCoverageResult == false)
            return false;
        GetSavingsPlansCoverageResult other = (GetSavingsPlansCoverageResult) obj;

        if (other.getSavingsPlansCoverages() == null ^ this.getSavingsPlansCoverages() == null)
            return false;
        if (other.getSavingsPlansCoverages() != null
                && other.getSavingsPlansCoverages().equals(this.getSavingsPlansCoverages()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
