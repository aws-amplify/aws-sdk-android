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

/**
 * <p>
 * Represents an AWS account that is associated with API Gateway.
 * </p>
 * <div class="remarks">
 * <p>
 * To view the account info, call <code>GET</code> on this resource.
 * </p>
 * <h4>Error Codes</h4>
 * <p>
 * The following exception may be thrown when the request fails.
 * </p>
 * <ul>
 * <li>UnauthorizedException</li>
 * <li>NotFoundException</li>
 * <li>TooManyRequestsException</li>
 * </ul>
 * <p>
 * For detailed error code information, including the corresponding HTTP Status
 * Codes, see <a href=
 * "https://docs.aws.amazon.com/apigateway/api-reference/handling-errors/#api-error-codes"
 * >API Gateway Error Codes</a>
 * </p>
 * <h4>Example: Get the information about an account.</h4> <h5>Request</h5>
 * 
 * <pre>
 * <code>GET /account HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160531T184618Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
 * </pre>
 * 
 * <h5>Response</h5>
 * <p>
 * The successful response returns a <code>200 OK</code> status code and a
 * payload similar to the following:
 * </p>
 * 
 * <pre>
 * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/account-apigateway-{rel}.html", "name": "account", "templated": true }, "self": { "href": "/account" }, "account:update": { "href": "/account" } }, "cloudwatchRoleArn": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "throttleSettings": { "rateLimit": 500, "burstLimit": 1000 } } </code>
 * </pre>
 * <p>
 * In addition to making the REST API call directly, you can use the AWS CLI and
 * an AWS SDK to access this resource.
 * </p>
 * </div> <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-limits.html"
 * >API Gateway Limits</a> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/welcome.html"
 * >Developer Guide</a>, <a href=
 * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-account.html"
 * >AWS CLI</a> </div>
 */
public class UpdateAccountResult implements Serializable {
    /**
     * <p>
     * The ARN of an Amazon CloudWatch role for the current <a>Account</a>.
     * </p>
     */
    private String cloudwatchRoleArn;

    /**
     * <p>
     * Specifies the API request limits configured for the current
     * <a>Account</a>.
     * </p>
     */
    private ThrottleSettings throttleSettings;

    /**
     * <p>
     * A list of features supported for the account. When usage plans are
     * enabled, the features list will include an entry of
     * <code>"UsagePlans"</code>.
     * </p>
     */
    private java.util.List<String> features;

    /**
     * <p>
     * The version of the API keys used for the account.
     * </p>
     */
    private String apiKeyVersion;

    /**
     * <p>
     * The ARN of an Amazon CloudWatch role for the current <a>Account</a>.
     * </p>
     *
     * @return <p>
     *         The ARN of an Amazon CloudWatch role for the current
     *         <a>Account</a>.
     *         </p>
     */
    public String getCloudwatchRoleArn() {
        return cloudwatchRoleArn;
    }

    /**
     * <p>
     * The ARN of an Amazon CloudWatch role for the current <a>Account</a>.
     * </p>
     *
     * @param cloudwatchRoleArn <p>
     *            The ARN of an Amazon CloudWatch role for the current
     *            <a>Account</a>.
     *            </p>
     */
    public void setCloudwatchRoleArn(String cloudwatchRoleArn) {
        this.cloudwatchRoleArn = cloudwatchRoleArn;
    }

    /**
     * <p>
     * The ARN of an Amazon CloudWatch role for the current <a>Account</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudwatchRoleArn <p>
     *            The ARN of an Amazon CloudWatch role for the current
     *            <a>Account</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccountResult withCloudwatchRoleArn(String cloudwatchRoleArn) {
        this.cloudwatchRoleArn = cloudwatchRoleArn;
        return this;
    }

    /**
     * <p>
     * Specifies the API request limits configured for the current
     * <a>Account</a>.
     * </p>
     *
     * @return <p>
     *         Specifies the API request limits configured for the current
     *         <a>Account</a>.
     *         </p>
     */
    public ThrottleSettings getThrottleSettings() {
        return throttleSettings;
    }

    /**
     * <p>
     * Specifies the API request limits configured for the current
     * <a>Account</a>.
     * </p>
     *
     * @param throttleSettings <p>
     *            Specifies the API request limits configured for the current
     *            <a>Account</a>.
     *            </p>
     */
    public void setThrottleSettings(ThrottleSettings throttleSettings) {
        this.throttleSettings = throttleSettings;
    }

    /**
     * <p>
     * Specifies the API request limits configured for the current
     * <a>Account</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param throttleSettings <p>
     *            Specifies the API request limits configured for the current
     *            <a>Account</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccountResult withThrottleSettings(ThrottleSettings throttleSettings) {
        this.throttleSettings = throttleSettings;
        return this;
    }

    /**
     * <p>
     * A list of features supported for the account. When usage plans are
     * enabled, the features list will include an entry of
     * <code>"UsagePlans"</code>.
     * </p>
     *
     * @return <p>
     *         A list of features supported for the account. When usage plans
     *         are enabled, the features list will include an entry of
     *         <code>"UsagePlans"</code>.
     *         </p>
     */
    public java.util.List<String> getFeatures() {
        return features;
    }

    /**
     * <p>
     * A list of features supported for the account. When usage plans are
     * enabled, the features list will include an entry of
     * <code>"UsagePlans"</code>.
     * </p>
     *
     * @param features <p>
     *            A list of features supported for the account. When usage plans
     *            are enabled, the features list will include an entry of
     *            <code>"UsagePlans"</code>.
     *            </p>
     */
    public void setFeatures(java.util.Collection<String> features) {
        if (features == null) {
            this.features = null;
            return;
        }

        this.features = new java.util.ArrayList<String>(features);
    }

    /**
     * <p>
     * A list of features supported for the account. When usage plans are
     * enabled, the features list will include an entry of
     * <code>"UsagePlans"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param features <p>
     *            A list of features supported for the account. When usage plans
     *            are enabled, the features list will include an entry of
     *            <code>"UsagePlans"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccountResult withFeatures(String... features) {
        if (getFeatures() == null) {
            this.features = new java.util.ArrayList<String>(features.length);
        }
        for (String value : features) {
            this.features.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of features supported for the account. When usage plans are
     * enabled, the features list will include an entry of
     * <code>"UsagePlans"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param features <p>
     *            A list of features supported for the account. When usage plans
     *            are enabled, the features list will include an entry of
     *            <code>"UsagePlans"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccountResult withFeatures(java.util.Collection<String> features) {
        setFeatures(features);
        return this;
    }

    /**
     * <p>
     * The version of the API keys used for the account.
     * </p>
     *
     * @return <p>
     *         The version of the API keys used for the account.
     *         </p>
     */
    public String getApiKeyVersion() {
        return apiKeyVersion;
    }

    /**
     * <p>
     * The version of the API keys used for the account.
     * </p>
     *
     * @param apiKeyVersion <p>
     *            The version of the API keys used for the account.
     *            </p>
     */
    public void setApiKeyVersion(String apiKeyVersion) {
        this.apiKeyVersion = apiKeyVersion;
    }

    /**
     * <p>
     * The version of the API keys used for the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiKeyVersion <p>
     *            The version of the API keys used for the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccountResult withApiKeyVersion(String apiKeyVersion) {
        this.apiKeyVersion = apiKeyVersion;
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
        if (getCloudwatchRoleArn() != null)
            sb.append("cloudwatchRoleArn: " + getCloudwatchRoleArn() + ",");
        if (getThrottleSettings() != null)
            sb.append("throttleSettings: " + getThrottleSettings() + ",");
        if (getFeatures() != null)
            sb.append("features: " + getFeatures() + ",");
        if (getApiKeyVersion() != null)
            sb.append("apiKeyVersion: " + getApiKeyVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCloudwatchRoleArn() == null) ? 0 : getCloudwatchRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getThrottleSettings() == null) ? 0 : getThrottleSettings().hashCode());
        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        hashCode = prime * hashCode
                + ((getApiKeyVersion() == null) ? 0 : getApiKeyVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountResult == false)
            return false;
        UpdateAccountResult other = (UpdateAccountResult) obj;

        if (other.getCloudwatchRoleArn() == null ^ this.getCloudwatchRoleArn() == null)
            return false;
        if (other.getCloudwatchRoleArn() != null
                && other.getCloudwatchRoleArn().equals(this.getCloudwatchRoleArn()) == false)
            return false;
        if (other.getThrottleSettings() == null ^ this.getThrottleSettings() == null)
            return false;
        if (other.getThrottleSettings() != null
                && other.getThrottleSettings().equals(this.getThrottleSettings()) == false)
            return false;
        if (other.getFeatures() == null ^ this.getFeatures() == null)
            return false;
        if (other.getFeatures() != null && other.getFeatures().equals(this.getFeatures()) == false)
            return false;
        if (other.getApiKeyVersion() == null ^ this.getApiKeyVersion() == null)
            return false;
        if (other.getApiKeyVersion() != null
                && other.getApiKeyVersion().equals(this.getApiKeyVersion()) == false)
            return false;
        return true;
    }
}
