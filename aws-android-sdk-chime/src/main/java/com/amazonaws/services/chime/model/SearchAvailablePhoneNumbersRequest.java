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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Searches phone numbers that can be ordered.
 * </p>
 */
public class SearchAvailablePhoneNumbersRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The area code used to filter results.
     * </p>
     */
    private String areaCode;

    /**
     * <p>
     * The city used to filter results.
     * </p>
     */
    private String city;

    /**
     * <p>
     * The country used to filter results.
     * </p>
     */
    private String country;

    /**
     * <p>
     * The state used to filter results.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The toll-free prefix that you use to filter results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^8(00|33|44|55|66|77|88)$<br/>
     */
    private String tollFreePrefix;

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The area code used to filter results.
     * </p>
     *
     * @return <p>
     *         The area code used to filter results.
     *         </p>
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * <p>
     * The area code used to filter results.
     * </p>
     *
     * @param areaCode <p>
     *            The area code used to filter results.
     *            </p>
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * <p>
     * The area code used to filter results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param areaCode <p>
     *            The area code used to filter results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAvailablePhoneNumbersRequest withAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * <p>
     * The city used to filter results.
     * </p>
     *
     * @return <p>
     *         The city used to filter results.
     *         </p>
     */
    public String getCity() {
        return city;
    }

    /**
     * <p>
     * The city used to filter results.
     * </p>
     *
     * @param city <p>
     *            The city used to filter results.
     *            </p>
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The city used to filter results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param city <p>
     *            The city used to filter results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAvailablePhoneNumbersRequest withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * <p>
     * The country used to filter results.
     * </p>
     *
     * @return <p>
     *         The country used to filter results.
     *         </p>
     */
    public String getCountry() {
        return country;
    }

    /**
     * <p>
     * The country used to filter results.
     * </p>
     *
     * @param country <p>
     *            The country used to filter results.
     *            </p>
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The country used to filter results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param country <p>
     *            The country used to filter results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAvailablePhoneNumbersRequest withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * <p>
     * The state used to filter results.
     * </p>
     *
     * @return <p>
     *         The state used to filter results.
     *         </p>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state used to filter results.
     * </p>
     *
     * @param state <p>
     *            The state used to filter results.
     *            </p>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state used to filter results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The state used to filter results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAvailablePhoneNumbersRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The toll-free prefix that you use to filter results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^8(00|33|44|55|66|77|88)$<br/>
     *
     * @return <p>
     *         The toll-free prefix that you use to filter results.
     *         </p>
     */
    public String getTollFreePrefix() {
        return tollFreePrefix;
    }

    /**
     * <p>
     * The toll-free prefix that you use to filter results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^8(00|33|44|55|66|77|88)$<br/>
     *
     * @param tollFreePrefix <p>
     *            The toll-free prefix that you use to filter results.
     *            </p>
     */
    public void setTollFreePrefix(String tollFreePrefix) {
        this.tollFreePrefix = tollFreePrefix;
    }

    /**
     * <p>
     * The toll-free prefix that you use to filter results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^8(00|33|44|55|66|77|88)$<br/>
     *
     * @param tollFreePrefix <p>
     *            The toll-free prefix that you use to filter results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAvailablePhoneNumbersRequest withTollFreePrefix(String tollFreePrefix) {
        this.tollFreePrefix = tollFreePrefix;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @return <p>
     *         The maximum number of results to return in a single call.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAvailablePhoneNumbersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAvailablePhoneNumbersRequest withNextToken(String nextToken) {
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
        if (getAreaCode() != null)
            sb.append("AreaCode: " + getAreaCode() + ",");
        if (getCity() != null)
            sb.append("City: " + getCity() + ",");
        if (getCountry() != null)
            sb.append("Country: " + getCountry() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTollFreePrefix() != null)
            sb.append("TollFreePrefix: " + getTollFreePrefix() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getTollFreePrefix() == null) ? 0 : getTollFreePrefix().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchAvailablePhoneNumbersRequest == false)
            return false;
        SearchAvailablePhoneNumbersRequest other = (SearchAvailablePhoneNumbersRequest) obj;

        if (other.getAreaCode() == null ^ this.getAreaCode() == null)
            return false;
        if (other.getAreaCode() != null && other.getAreaCode().equals(this.getAreaCode()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTollFreePrefix() == null ^ this.getTollFreePrefix() == null)
            return false;
        if (other.getTollFreePrefix() != null
                && other.getTollFreePrefix().equals(this.getTollFreePrefix()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
