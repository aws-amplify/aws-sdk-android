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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets details about a specific conference provider.
 * </p>
 */
public class GetConferenceProviderRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the newly created conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String conferenceProviderArn;

    /**
     * <p>
     * The ARN of the newly created conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the newly created conference provider.
     *         </p>
     */
    public String getConferenceProviderArn() {
        return conferenceProviderArn;
    }

    /**
     * <p>
     * The ARN of the newly created conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param conferenceProviderArn <p>
     *            The ARN of the newly created conference provider.
     *            </p>
     */
    public void setConferenceProviderArn(String conferenceProviderArn) {
        this.conferenceProviderArn = conferenceProviderArn;
    }

    /**
     * <p>
     * The ARN of the newly created conference provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param conferenceProviderArn <p>
     *            The ARN of the newly created conference provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConferenceProviderRequest withConferenceProviderArn(String conferenceProviderArn) {
        this.conferenceProviderArn = conferenceProviderArn;
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
        if (getConferenceProviderArn() != null)
            sb.append("ConferenceProviderArn: " + getConferenceProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getConferenceProviderArn() == null) ? 0 : getConferenceProviderArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConferenceProviderRequest == false)
            return false;
        GetConferenceProviderRequest other = (GetConferenceProviderRequest) obj;

        if (other.getConferenceProviderArn() == null ^ this.getConferenceProviderArn() == null)
            return false;
        if (other.getConferenceProviderArn() != null
                && other.getConferenceProviderArn().equals(this.getConferenceProviderArn()) == false)
            return false;
        return true;
    }
}
