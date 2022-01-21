/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides information about the phone numbers for the specified Amazon Connect
 * instance.
 * </p>
 * <p>
 * For more information about phone numbers, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html"
 * >Set Up Phone Numbers for Your Contact Center</a> in the <i>Amazon Connect
 * Administrator Guide</i>.
 * </p>
 */
public class ListPhoneNumbersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The type of phone number.
     * </p>
     */
    private java.util.List<String> phoneNumberTypes;

    /**
     * <p>
     * The ISO country code.
     * </p>
     */
    private java.util.List<String> phoneNumberCountryCodes;

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     *
     * @return <p>
     *         The type of phone number.
     *         </p>
     */
    public java.util.List<String> getPhoneNumberTypes() {
        return phoneNumberTypes;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     *
     * @param phoneNumberTypes <p>
     *            The type of phone number.
     *            </p>
     */
    public void setPhoneNumberTypes(java.util.Collection<String> phoneNumberTypes) {
        if (phoneNumberTypes == null) {
            this.phoneNumberTypes = null;
            return;
        }

        this.phoneNumberTypes = new java.util.ArrayList<String>(phoneNumberTypes);
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberTypes <p>
     *            The type of phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersRequest withPhoneNumberTypes(String... phoneNumberTypes) {
        if (getPhoneNumberTypes() == null) {
            this.phoneNumberTypes = new java.util.ArrayList<String>(phoneNumberTypes.length);
        }
        for (String value : phoneNumberTypes) {
            this.phoneNumberTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberTypes <p>
     *            The type of phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersRequest withPhoneNumberTypes(
            java.util.Collection<String> phoneNumberTypes) {
        setPhoneNumberTypes(phoneNumberTypes);
        return this;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     *
     * @return <p>
     *         The ISO country code.
     *         </p>
     */
    public java.util.List<String> getPhoneNumberCountryCodes() {
        return phoneNumberCountryCodes;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     *
     * @param phoneNumberCountryCodes <p>
     *            The ISO country code.
     *            </p>
     */
    public void setPhoneNumberCountryCodes(java.util.Collection<String> phoneNumberCountryCodes) {
        if (phoneNumberCountryCodes == null) {
            this.phoneNumberCountryCodes = null;
            return;
        }

        this.phoneNumberCountryCodes = new java.util.ArrayList<String>(phoneNumberCountryCodes);
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberCountryCodes <p>
     *            The ISO country code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersRequest withPhoneNumberCountryCodes(String... phoneNumberCountryCodes) {
        if (getPhoneNumberCountryCodes() == null) {
            this.phoneNumberCountryCodes = new java.util.ArrayList<String>(
                    phoneNumberCountryCodes.length);
        }
        for (String value : phoneNumberCountryCodes) {
            this.phoneNumberCountryCodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberCountryCodes <p>
     *            The ISO country code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersRequest withPhoneNumberCountryCodes(
            java.util.Collection<String> phoneNumberCountryCodes) {
        setPhoneNumberCountryCodes(phoneNumberCountryCodes);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results. Use the value returned in
     *         the previous response in the next request to retrieve the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of results to return per page.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getPhoneNumberTypes() != null)
            sb.append("PhoneNumberTypes: " + getPhoneNumberTypes() + ",");
        if (getPhoneNumberCountryCodes() != null)
            sb.append("PhoneNumberCountryCodes: " + getPhoneNumberCountryCodes() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumberTypes() == null) ? 0 : getPhoneNumberTypes().hashCode());
        hashCode = prime
                * hashCode
                + ((getPhoneNumberCountryCodes() == null) ? 0 : getPhoneNumberCountryCodes()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPhoneNumbersRequest == false)
            return false;
        ListPhoneNumbersRequest other = (ListPhoneNumbersRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPhoneNumberTypes() == null ^ this.getPhoneNumberTypes() == null)
            return false;
        if (other.getPhoneNumberTypes() != null
                && other.getPhoneNumberTypes().equals(this.getPhoneNumberTypes()) == false)
            return false;
        if (other.getPhoneNumberCountryCodes() == null ^ this.getPhoneNumberCountryCodes() == null)
            return false;
        if (other.getPhoneNumberCountryCodes() != null
                && other.getPhoneNumberCountryCodes().equals(this.getPhoneNumberCountryCodes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
