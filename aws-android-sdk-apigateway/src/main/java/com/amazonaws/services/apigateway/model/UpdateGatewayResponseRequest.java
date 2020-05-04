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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a <a>GatewayResponse</a> of a specified response type on the given
 * <a>RestApi</a>.
 * </p>
 */
public class UpdateGatewayResponseRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * [Required]
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values
     * are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT_4XX, DEFAULT_5XX, RESOURCE_NOT_FOUND,
     * UNAUTHORIZED, INVALID_API_KEY, ACCESS_DENIED, AUTHORIZER_FAILURE,
     * AUTHORIZER_CONFIGURATION_ERROR, INVALID_SIGNATURE, EXPIRED_TOKEN,
     * MISSING_AUTHENTICATION_TOKEN, INTEGRATION_FAILURE, INTEGRATION_TIMEOUT,
     * API_CONFIGURATION_ERROR, UNSUPPORTED_MEDIA_TYPE, BAD_REQUEST_PARAMETERS,
     * BAD_REQUEST_BODY, REQUEST_TOO_LARGE, THROTTLED, QUOTA_EXCEEDED
     */
    private String responseType;

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and
     * in the order specified in this list.
     * </p>
     */
    private java.util.List<PatchOperation> patchOperations;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     *
     * @return <p>
     *         [Required] The string identifier of the associated
     *         <a>RestApi</a>.
     *         </p>
     */
    public String getRestApiId() {
        return restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     *
     * @param restApiId <p>
     *            [Required] The string identifier of the associated
     *            <a>RestApi</a>.
     *            </p>
     */
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restApiId <p>
     *            [Required] The string identifier of the associated
     *            <a>RestApi</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGatewayResponseRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * [Required]
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values
     * are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT_4XX, DEFAULT_5XX, RESOURCE_NOT_FOUND,
     * UNAUTHORIZED, INVALID_API_KEY, ACCESS_DENIED, AUTHORIZER_FAILURE,
     * AUTHORIZER_CONFIGURATION_ERROR, INVALID_SIGNATURE, EXPIRED_TOKEN,
     * MISSING_AUTHENTICATION_TOKEN, INTEGRATION_FAILURE, INTEGRATION_TIMEOUT,
     * API_CONFIGURATION_ERROR, UNSUPPORTED_MEDIA_TYPE, BAD_REQUEST_PARAMETERS,
     * BAD_REQUEST_BODY, REQUEST_TOO_LARGE, THROTTLED, QUOTA_EXCEEDED
     *
     * @return <p>
     *         [Required]
     *         <p>
     *         The response type of the associated <a>GatewayResponse</a>. Valid
     *         values are
     *         <ul>
     *         <li>ACCESS_DENIED</li>
     *         <li>API_CONFIGURATION_ERROR</li>
     *         <li>AUTHORIZER_FAILURE</li>
     *         <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *         <li>BAD_REQUEST_PARAMETERS</li>
     *         <li>BAD_REQUEST_BODY</li>
     *         <li>DEFAULT_4XX</li>
     *         <li>DEFAULT_5XX</li>
     *         <li>EXPIRED_TOKEN</li>
     *         <li>INVALID_SIGNATURE</li>
     *         <li>INTEGRATION_FAILURE</li>
     *         <li>INTEGRATION_TIMEOUT</li>
     *         <li>INVALID_API_KEY</li>
     *         <li>MISSING_AUTHENTICATION_TOKEN</li>
     *         <li>QUOTA_EXCEEDED</li>
     *         <li>REQUEST_TOO_LARGE</li>
     *         <li>RESOURCE_NOT_FOUND</li>
     *         <li>THROTTLED</li>
     *         <li>UNAUTHORIZED</li>
     *         <li>UNSUPPORTED_MEDIA_TYPE</li>
     *         </ul>
     *         </p>
     *         </p>
     * @see GatewayResponseType
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * <p>
     * [Required]
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values
     * are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT_4XX, DEFAULT_5XX, RESOURCE_NOT_FOUND,
     * UNAUTHORIZED, INVALID_API_KEY, ACCESS_DENIED, AUTHORIZER_FAILURE,
     * AUTHORIZER_CONFIGURATION_ERROR, INVALID_SIGNATURE, EXPIRED_TOKEN,
     * MISSING_AUTHENTICATION_TOKEN, INTEGRATION_FAILURE, INTEGRATION_TIMEOUT,
     * API_CONFIGURATION_ERROR, UNSUPPORTED_MEDIA_TYPE, BAD_REQUEST_PARAMETERS,
     * BAD_REQUEST_BODY, REQUEST_TOO_LARGE, THROTTLED, QUOTA_EXCEEDED
     *
     * @param responseType <p>
     *            [Required]
     *            <p>
     *            The response type of the associated <a>GatewayResponse</a>.
     *            Valid values are
     *            <ul>
     *            <li>ACCESS_DENIED</li>
     *            <li>API_CONFIGURATION_ERROR</li>
     *            <li>AUTHORIZER_FAILURE</li>
     *            <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *            <li>BAD_REQUEST_PARAMETERS</li>
     *            <li>BAD_REQUEST_BODY</li>
     *            <li>DEFAULT_4XX</li>
     *            <li>DEFAULT_5XX</li>
     *            <li>EXPIRED_TOKEN</li>
     *            <li>INVALID_SIGNATURE</li>
     *            <li>INTEGRATION_FAILURE</li>
     *            <li>INTEGRATION_TIMEOUT</li>
     *            <li>INVALID_API_KEY</li>
     *            <li>MISSING_AUTHENTICATION_TOKEN</li>
     *            <li>QUOTA_EXCEEDED</li>
     *            <li>REQUEST_TOO_LARGE</li>
     *            <li>RESOURCE_NOT_FOUND</li>
     *            <li>THROTTLED</li>
     *            <li>UNAUTHORIZED</li>
     *            <li>UNSUPPORTED_MEDIA_TYPE</li>
     *            </ul>
     *            </p>
     *            </p>
     * @see GatewayResponseType
     */
    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    /**
     * <p>
     * [Required]
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values
     * are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT_4XX, DEFAULT_5XX, RESOURCE_NOT_FOUND,
     * UNAUTHORIZED, INVALID_API_KEY, ACCESS_DENIED, AUTHORIZER_FAILURE,
     * AUTHORIZER_CONFIGURATION_ERROR, INVALID_SIGNATURE, EXPIRED_TOKEN,
     * MISSING_AUTHENTICATION_TOKEN, INTEGRATION_FAILURE, INTEGRATION_TIMEOUT,
     * API_CONFIGURATION_ERROR, UNSUPPORTED_MEDIA_TYPE, BAD_REQUEST_PARAMETERS,
     * BAD_REQUEST_BODY, REQUEST_TOO_LARGE, THROTTLED, QUOTA_EXCEEDED
     *
     * @param responseType <p>
     *            [Required]
     *            <p>
     *            The response type of the associated <a>GatewayResponse</a>.
     *            Valid values are
     *            <ul>
     *            <li>ACCESS_DENIED</li>
     *            <li>API_CONFIGURATION_ERROR</li>
     *            <li>AUTHORIZER_FAILURE</li>
     *            <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *            <li>BAD_REQUEST_PARAMETERS</li>
     *            <li>BAD_REQUEST_BODY</li>
     *            <li>DEFAULT_4XX</li>
     *            <li>DEFAULT_5XX</li>
     *            <li>EXPIRED_TOKEN</li>
     *            <li>INVALID_SIGNATURE</li>
     *            <li>INTEGRATION_FAILURE</li>
     *            <li>INTEGRATION_TIMEOUT</li>
     *            <li>INVALID_API_KEY</li>
     *            <li>MISSING_AUTHENTICATION_TOKEN</li>
     *            <li>QUOTA_EXCEEDED</li>
     *            <li>REQUEST_TOO_LARGE</li>
     *            <li>RESOURCE_NOT_FOUND</li>
     *            <li>THROTTLED</li>
     *            <li>UNAUTHORIZED</li>
     *            <li>UNSUPPORTED_MEDIA_TYPE</li>
     *            </ul>
     *            </p>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GatewayResponseType
     */
    public UpdateGatewayResponseRequest withResponseType(String responseType) {
        this.responseType = responseType;
        return this;
    }

    /**
     * <p>
     * [Required]
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values
     * are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT_4XX, DEFAULT_5XX, RESOURCE_NOT_FOUND,
     * UNAUTHORIZED, INVALID_API_KEY, ACCESS_DENIED, AUTHORIZER_FAILURE,
     * AUTHORIZER_CONFIGURATION_ERROR, INVALID_SIGNATURE, EXPIRED_TOKEN,
     * MISSING_AUTHENTICATION_TOKEN, INTEGRATION_FAILURE, INTEGRATION_TIMEOUT,
     * API_CONFIGURATION_ERROR, UNSUPPORTED_MEDIA_TYPE, BAD_REQUEST_PARAMETERS,
     * BAD_REQUEST_BODY, REQUEST_TOO_LARGE, THROTTLED, QUOTA_EXCEEDED
     *
     * @param responseType <p>
     *            [Required]
     *            <p>
     *            The response type of the associated <a>GatewayResponse</a>.
     *            Valid values are
     *            <ul>
     *            <li>ACCESS_DENIED</li>
     *            <li>API_CONFIGURATION_ERROR</li>
     *            <li>AUTHORIZER_FAILURE</li>
     *            <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *            <li>BAD_REQUEST_PARAMETERS</li>
     *            <li>BAD_REQUEST_BODY</li>
     *            <li>DEFAULT_4XX</li>
     *            <li>DEFAULT_5XX</li>
     *            <li>EXPIRED_TOKEN</li>
     *            <li>INVALID_SIGNATURE</li>
     *            <li>INTEGRATION_FAILURE</li>
     *            <li>INTEGRATION_TIMEOUT</li>
     *            <li>INVALID_API_KEY</li>
     *            <li>MISSING_AUTHENTICATION_TOKEN</li>
     *            <li>QUOTA_EXCEEDED</li>
     *            <li>REQUEST_TOO_LARGE</li>
     *            <li>RESOURCE_NOT_FOUND</li>
     *            <li>THROTTLED</li>
     *            <li>UNAUTHORIZED</li>
     *            <li>UNSUPPORTED_MEDIA_TYPE</li>
     *            </ul>
     *            </p>
     *            </p>
     * @see GatewayResponseType
     */
    public void setResponseType(GatewayResponseType responseType) {
        this.responseType = responseType.toString();
    }

    /**
     * <p>
     * [Required]
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values
     * are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT_4XX, DEFAULT_5XX, RESOURCE_NOT_FOUND,
     * UNAUTHORIZED, INVALID_API_KEY, ACCESS_DENIED, AUTHORIZER_FAILURE,
     * AUTHORIZER_CONFIGURATION_ERROR, INVALID_SIGNATURE, EXPIRED_TOKEN,
     * MISSING_AUTHENTICATION_TOKEN, INTEGRATION_FAILURE, INTEGRATION_TIMEOUT,
     * API_CONFIGURATION_ERROR, UNSUPPORTED_MEDIA_TYPE, BAD_REQUEST_PARAMETERS,
     * BAD_REQUEST_BODY, REQUEST_TOO_LARGE, THROTTLED, QUOTA_EXCEEDED
     *
     * @param responseType <p>
     *            [Required]
     *            <p>
     *            The response type of the associated <a>GatewayResponse</a>.
     *            Valid values are
     *            <ul>
     *            <li>ACCESS_DENIED</li>
     *            <li>API_CONFIGURATION_ERROR</li>
     *            <li>AUTHORIZER_FAILURE</li>
     *            <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *            <li>BAD_REQUEST_PARAMETERS</li>
     *            <li>BAD_REQUEST_BODY</li>
     *            <li>DEFAULT_4XX</li>
     *            <li>DEFAULT_5XX</li>
     *            <li>EXPIRED_TOKEN</li>
     *            <li>INVALID_SIGNATURE</li>
     *            <li>INTEGRATION_FAILURE</li>
     *            <li>INTEGRATION_TIMEOUT</li>
     *            <li>INVALID_API_KEY</li>
     *            <li>MISSING_AUTHENTICATION_TOKEN</li>
     *            <li>QUOTA_EXCEEDED</li>
     *            <li>REQUEST_TOO_LARGE</li>
     *            <li>RESOURCE_NOT_FOUND</li>
     *            <li>THROTTLED</li>
     *            <li>UNAUTHORIZED</li>
     *            <li>UNSUPPORTED_MEDIA_TYPE</li>
     *            </ul>
     *            </p>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GatewayResponseType
     */
    public UpdateGatewayResponseRequest withResponseType(GatewayResponseType responseType) {
        this.responseType = responseType.toString();
        return this;
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and
     * in the order specified in this list.
     * </p>
     *
     * @return <p>
     *         A list of update operations to be applied to the specified
     *         resource and in the order specified in this list.
     *         </p>
     */
    public java.util.List<PatchOperation> getPatchOperations() {
        return patchOperations;
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and
     * in the order specified in this list.
     * </p>
     *
     * @param patchOperations <p>
     *            A list of update operations to be applied to the specified
     *            resource and in the order specified in this list.
     *            </p>
     */
    public void setPatchOperations(java.util.Collection<PatchOperation> patchOperations) {
        if (patchOperations == null) {
            this.patchOperations = null;
            return;
        }

        this.patchOperations = new java.util.ArrayList<PatchOperation>(patchOperations);
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and
     * in the order specified in this list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param patchOperations <p>
     *            A list of update operations to be applied to the specified
     *            resource and in the order specified in this list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGatewayResponseRequest withPatchOperations(PatchOperation... patchOperations) {
        if (getPatchOperations() == null) {
            this.patchOperations = new java.util.ArrayList<PatchOperation>(patchOperations.length);
        }
        for (PatchOperation value : patchOperations) {
            this.patchOperations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and
     * in the order specified in this list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param patchOperations <p>
     *            A list of update operations to be applied to the specified
     *            resource and in the order specified in this list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGatewayResponseRequest withPatchOperations(
            java.util.Collection<PatchOperation> patchOperations) {
        setPatchOperations(patchOperations);
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
        if (getRestApiId() != null)
            sb.append("restApiId: " + getRestApiId() + ",");
        if (getResponseType() != null)
            sb.append("responseType: " + getResponseType() + ",");
        if (getPatchOperations() != null)
            sb.append("patchOperations: " + getPatchOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode
                + ((getResponseType() == null) ? 0 : getResponseType().hashCode());
        hashCode = prime * hashCode
                + ((getPatchOperations() == null) ? 0 : getPatchOperations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGatewayResponseRequest == false)
            return false;
        UpdateGatewayResponseRequest other = (UpdateGatewayResponseRequest) obj;

        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getResponseType() == null ^ this.getResponseType() == null)
            return false;
        if (other.getResponseType() != null
                && other.getResponseType().equals(this.getResponseType()) == false)
            return false;
        if (other.getPatchOperations() == null ^ this.getPatchOperations() == null)
            return false;
        if (other.getPatchOperations() != null
                && other.getPatchOperations().equals(this.getPatchOperations()) == false)
            return false;
        return true;
    }
}
