/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Gets a list of the policies that have an effect on the authorization behavior
 * of the specified device when it connects to the IoT device gateway.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >GetEffectivePolicies</a> action.
 * </p>
 */
public class GetEffectivePoliciesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The principal. Valid principals are CertificateArn
     * (arn:aws:iot:<i>region</i>:<i>accountId</i>:cert/<i>certificateId</i>),
     * thingGroupArn
     * (arn:aws:iot:<i>region</i>:<i>accountId</i>:thinggroup/<i>groupName</i>)
     * and CognitoId (<i>region</i>:<i>id</i>).
     * </p>
     */
    private String principal;

    /**
     * <p>
     * The Cognito identity pool ID.
     * </p>
     */
    private String cognitoIdentityPoolId;

    /**
     * <p>
     * The thing name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingName;

    /**
     * <p>
     * The principal. Valid principals are CertificateArn
     * (arn:aws:iot:<i>region</i>:<i>accountId</i>:cert/<i>certificateId</i>),
     * thingGroupArn
     * (arn:aws:iot:<i>region</i>:<i>accountId</i>:thinggroup/<i>groupName</i>)
     * and CognitoId (<i>region</i>:<i>id</i>).
     * </p>
     *
     * @return <p>
     *         The principal. Valid principals are CertificateArn
     *         (arn:aws:iot:<i
     *         >region</i>:<i>accountId</i>:cert/<i>certificateId</i>),
     *         thingGroupArn
     *         (arn:aws:iot:<i>region</i>:<i>accountId</i>:thinggroup
     *         /<i>groupName</i>) and CognitoId (<i>region</i>:<i>id</i>).
     *         </p>
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * <p>
     * The principal. Valid principals are CertificateArn
     * (arn:aws:iot:<i>region</i>:<i>accountId</i>:cert/<i>certificateId</i>),
     * thingGroupArn
     * (arn:aws:iot:<i>region</i>:<i>accountId</i>:thinggroup/<i>groupName</i>)
     * and CognitoId (<i>region</i>:<i>id</i>).
     * </p>
     *
     * @param principal <p>
     *            The principal. Valid principals are CertificateArn
     *            (arn:aws:iot
     *            :<i>region</i>:<i>accountId</i>:cert/<i>certificateId</i>),
     *            thingGroupArn
     *            (arn:aws:iot:<i>region</i>:<i>accountId</i>:thinggroup
     *            /<i>groupName</i>) and CognitoId (<i>region</i>:<i>id</i>).
     *            </p>
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal. Valid principals are CertificateArn
     * (arn:aws:iot:<i>region</i>:<i>accountId</i>:cert/<i>certificateId</i>),
     * thingGroupArn
     * (arn:aws:iot:<i>region</i>:<i>accountId</i>:thinggroup/<i>groupName</i>)
     * and CognitoId (<i>region</i>:<i>id</i>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principal <p>
     *            The principal. Valid principals are CertificateArn
     *            (arn:aws:iot
     *            :<i>region</i>:<i>accountId</i>:cert/<i>certificateId</i>),
     *            thingGroupArn
     *            (arn:aws:iot:<i>region</i>:<i>accountId</i>:thinggroup
     *            /<i>groupName</i>) and CognitoId (<i>region</i>:<i>id</i>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetEffectivePoliciesRequest withPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    /**
     * <p>
     * The Cognito identity pool ID.
     * </p>
     *
     * @return <p>
     *         The Cognito identity pool ID.
     *         </p>
     */
    public String getCognitoIdentityPoolId() {
        return cognitoIdentityPoolId;
    }

    /**
     * <p>
     * The Cognito identity pool ID.
     * </p>
     *
     * @param cognitoIdentityPoolId <p>
     *            The Cognito identity pool ID.
     *            </p>
     */
    public void setCognitoIdentityPoolId(String cognitoIdentityPoolId) {
        this.cognitoIdentityPoolId = cognitoIdentityPoolId;
    }

    /**
     * <p>
     * The Cognito identity pool ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cognitoIdentityPoolId <p>
     *            The Cognito identity pool ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetEffectivePoliciesRequest withCognitoIdentityPoolId(String cognitoIdentityPoolId) {
        this.cognitoIdentityPoolId = cognitoIdentityPoolId;
        return this;
    }

    /**
     * <p>
     * The thing name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The thing name.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The thing name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The thing name.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The thing name.
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
     *            The thing name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetEffectivePoliciesRequest withThingName(String thingName) {
        this.thingName = thingName;
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
        if (getPrincipal() != null)
            sb.append("principal: " + getPrincipal() + ",");
        if (getCognitoIdentityPoolId() != null)
            sb.append("cognitoIdentityPoolId: " + getCognitoIdentityPoolId() + ",");
        if (getThingName() != null)
            sb.append("thingName: " + getThingName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime
                * hashCode
                + ((getCognitoIdentityPoolId() == null) ? 0 : getCognitoIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEffectivePoliciesRequest == false)
            return false;
        GetEffectivePoliciesRequest other = (GetEffectivePoliciesRequest) obj;

        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null
                && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getCognitoIdentityPoolId() == null ^ this.getCognitoIdentityPoolId() == null)
            return false;
        if (other.getCognitoIdentityPoolId() != null
                && other.getCognitoIdentityPoolId().equals(this.getCognitoIdentityPoolId()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        return true;
    }
}
