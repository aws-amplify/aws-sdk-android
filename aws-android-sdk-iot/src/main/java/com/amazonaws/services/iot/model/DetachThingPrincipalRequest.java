/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Detaches the specified principal from the specified thing.
 * </p>
 * <note>
 * <p>
 * This call is asynchronous. It might take several seconds for the detachment
 * to propagate.
 * </p>
 * </note>
 */
public class DetachThingPrincipalRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingName;

    /**
     * <p>
     * If the principal is a certificate, this value must be ARN of the
     * certificate. If the principal is an Amazon Cognito identity, this value
     * must be the ID of the Amazon Cognito identity.
     * </p>
     */
    private String principal;

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachThingPrincipalRequest withThingName(String thingName) {
        this.thingName = thingName;
        return this;
    }

    /**
     * <p>
     * If the principal is a certificate, this value must be ARN of the
     * certificate. If the principal is an Amazon Cognito identity, this value
     * must be the ID of the Amazon Cognito identity.
     * </p>
     *
     * @return <p>
     *         If the principal is a certificate, this value must be ARN of the
     *         certificate. If the principal is an Amazon Cognito identity, this
     *         value must be the ID of the Amazon Cognito identity.
     *         </p>
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * <p>
     * If the principal is a certificate, this value must be ARN of the
     * certificate. If the principal is an Amazon Cognito identity, this value
     * must be the ID of the Amazon Cognito identity.
     * </p>
     *
     * @param principal <p>
     *            If the principal is a certificate, this value must be ARN of
     *            the certificate. If the principal is an Amazon Cognito
     *            identity, this value must be the ID of the Amazon Cognito
     *            identity.
     *            </p>
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * If the principal is a certificate, this value must be ARN of the
     * certificate. If the principal is an Amazon Cognito identity, this value
     * must be the ID of the Amazon Cognito identity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principal <p>
     *            If the principal is a certificate, this value must be ARN of
     *            the certificate. If the principal is an Amazon Cognito
     *            identity, this value must be the ID of the Amazon Cognito
     *            identity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachThingPrincipalRequest withPrincipal(String principal) {
        this.principal = principal;
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
        if (getThingName() != null)
            sb.append("thingName: " + getThingName() + ",");
        if (getPrincipal() != null)
            sb.append("principal: " + getPrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachThingPrincipalRequest == false)
            return false;
        DetachThingPrincipalRequest other = (DetachThingPrincipalRequest) obj;

        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null
                && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        return true;
    }
}
