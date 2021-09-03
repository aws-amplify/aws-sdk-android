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
 * Tests a custom authorization behavior by invoking a specified custom
 * authorizer. Use this to test and debug the custom authorization behavior of
 * devices that connect to the IoT device gateway.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >TestInvokeAuthorizer</a> action.
 * </p>
 */
public class TestInvokeAuthorizerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The custom authorizer name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     */
    private String authorizerName;

    /**
     * <p>
     * The token returned by your custom authentication service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private String token;

    /**
     * <p>
     * The signature made with the token and your custom authentication
     * service's private key. This value must be Base-64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2560<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     */
    private String tokenSignature;

    /**
     * <p>
     * Specifies a test HTTP authorization request.
     * </p>
     */
    private HttpContext httpContext;

    /**
     * <p>
     * Specifies a test MQTT authorization request.
     * </p>
     */
    private MqttContext mqttContext;

    /**
     * <p>
     * Specifies a test TLS authorization request.
     * </p>
     */
    private TlsContext tlsContext;

    /**
     * <p>
     * The custom authorizer name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @return <p>
     *         The custom authorizer name.
     *         </p>
     */
    public String getAuthorizerName() {
        return authorizerName;
    }

    /**
     * <p>
     * The custom authorizer name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param authorizerName <p>
     *            The custom authorizer name.
     *            </p>
     */
    public void setAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
    }

    /**
     * <p>
     * The custom authorizer name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param authorizerName <p>
     *            The custom authorizer name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerRequest withAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
        return this;
    }

    /**
     * <p>
     * The token returned by your custom authentication service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         The token returned by your custom authentication service.
     *         </p>
     */
    public String getToken() {
        return token;
    }

    /**
     * <p>
     * The token returned by your custom authentication service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param token <p>
     *            The token returned by your custom authentication service.
     *            </p>
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The token returned by your custom authentication service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param token <p>
     *            The token returned by your custom authentication service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerRequest withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * <p>
     * The signature made with the token and your custom authentication
     * service's private key. This value must be Base-64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2560<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @return <p>
     *         The signature made with the token and your custom authentication
     *         service's private key. This value must be Base-64-encoded.
     *         </p>
     */
    public String getTokenSignature() {
        return tokenSignature;
    }

    /**
     * <p>
     * The signature made with the token and your custom authentication
     * service's private key. This value must be Base-64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2560<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param tokenSignature <p>
     *            The signature made with the token and your custom
     *            authentication service's private key. This value must be
     *            Base-64-encoded.
     *            </p>
     */
    public void setTokenSignature(String tokenSignature) {
        this.tokenSignature = tokenSignature;
    }

    /**
     * <p>
     * The signature made with the token and your custom authentication
     * service's private key. This value must be Base-64-encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2560<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param tokenSignature <p>
     *            The signature made with the token and your custom
     *            authentication service's private key. This value must be
     *            Base-64-encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerRequest withTokenSignature(String tokenSignature) {
        this.tokenSignature = tokenSignature;
        return this;
    }

    /**
     * <p>
     * Specifies a test HTTP authorization request.
     * </p>
     *
     * @return <p>
     *         Specifies a test HTTP authorization request.
     *         </p>
     */
    public HttpContext getHttpContext() {
        return httpContext;
    }

    /**
     * <p>
     * Specifies a test HTTP authorization request.
     * </p>
     *
     * @param httpContext <p>
     *            Specifies a test HTTP authorization request.
     *            </p>
     */
    public void setHttpContext(HttpContext httpContext) {
        this.httpContext = httpContext;
    }

    /**
     * <p>
     * Specifies a test HTTP authorization request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpContext <p>
     *            Specifies a test HTTP authorization request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerRequest withHttpContext(HttpContext httpContext) {
        this.httpContext = httpContext;
        return this;
    }

    /**
     * <p>
     * Specifies a test MQTT authorization request.
     * </p>
     *
     * @return <p>
     *         Specifies a test MQTT authorization request.
     *         </p>
     */
    public MqttContext getMqttContext() {
        return mqttContext;
    }

    /**
     * <p>
     * Specifies a test MQTT authorization request.
     * </p>
     *
     * @param mqttContext <p>
     *            Specifies a test MQTT authorization request.
     *            </p>
     */
    public void setMqttContext(MqttContext mqttContext) {
        this.mqttContext = mqttContext;
    }

    /**
     * <p>
     * Specifies a test MQTT authorization request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mqttContext <p>
     *            Specifies a test MQTT authorization request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerRequest withMqttContext(MqttContext mqttContext) {
        this.mqttContext = mqttContext;
        return this;
    }

    /**
     * <p>
     * Specifies a test TLS authorization request.
     * </p>
     *
     * @return <p>
     *         Specifies a test TLS authorization request.
     *         </p>
     */
    public TlsContext getTlsContext() {
        return tlsContext;
    }

    /**
     * <p>
     * Specifies a test TLS authorization request.
     * </p>
     *
     * @param tlsContext <p>
     *            Specifies a test TLS authorization request.
     *            </p>
     */
    public void setTlsContext(TlsContext tlsContext) {
        this.tlsContext = tlsContext;
    }

    /**
     * <p>
     * Specifies a test TLS authorization request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tlsContext <p>
     *            Specifies a test TLS authorization request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerRequest withTlsContext(TlsContext tlsContext) {
        this.tlsContext = tlsContext;
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
        if (getAuthorizerName() != null)
            sb.append("authorizerName: " + getAuthorizerName() + ",");
        if (getToken() != null)
            sb.append("token: " + getToken() + ",");
        if (getTokenSignature() != null)
            sb.append("tokenSignature: " + getTokenSignature() + ",");
        if (getHttpContext() != null)
            sb.append("httpContext: " + getHttpContext() + ",");
        if (getMqttContext() != null)
            sb.append("mqttContext: " + getMqttContext() + ",");
        if (getTlsContext() != null)
            sb.append("tlsContext: " + getTlsContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthorizerName() == null) ? 0 : getAuthorizerName().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime * hashCode
                + ((getTokenSignature() == null) ? 0 : getTokenSignature().hashCode());
        hashCode = prime * hashCode
                + ((getHttpContext() == null) ? 0 : getHttpContext().hashCode());
        hashCode = prime * hashCode
                + ((getMqttContext() == null) ? 0 : getMqttContext().hashCode());
        hashCode = prime * hashCode + ((getTlsContext() == null) ? 0 : getTlsContext().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestInvokeAuthorizerRequest == false)
            return false;
        TestInvokeAuthorizerRequest other = (TestInvokeAuthorizerRequest) obj;

        if (other.getAuthorizerName() == null ^ this.getAuthorizerName() == null)
            return false;
        if (other.getAuthorizerName() != null
                && other.getAuthorizerName().equals(this.getAuthorizerName()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getTokenSignature() == null ^ this.getTokenSignature() == null)
            return false;
        if (other.getTokenSignature() != null
                && other.getTokenSignature().equals(this.getTokenSignature()) == false)
            return false;
        if (other.getHttpContext() == null ^ this.getHttpContext() == null)
            return false;
        if (other.getHttpContext() != null
                && other.getHttpContext().equals(this.getHttpContext()) == false)
            return false;
        if (other.getMqttContext() == null ^ this.getMqttContext() == null)
            return false;
        if (other.getMqttContext() != null
                && other.getMqttContext().equals(this.getMqttContext()) == false)
            return false;
        if (other.getTlsContext() == null ^ this.getTlsContext() == null)
            return false;
        if (other.getTlsContext() != null
                && other.getTlsContext().equals(this.getTlsContext()) == false)
            return false;
        return true;
    }
}
