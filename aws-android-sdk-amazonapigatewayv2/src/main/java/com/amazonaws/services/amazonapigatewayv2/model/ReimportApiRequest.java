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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Puts an Api resource.
 * </p>
 */
public class ReimportApiRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;

    /**
     * <p>
     * Specifies how to interpret the base path of the API during import. Valid
     * values are ignore, prepend, and split. The default value is ignore. To
     * learn more, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html"
     * >Set the OpenAPI basePath Property</a>. Supported only for HTTP APIs.
     * </p>
     */
    private String basepath;

    /**
     * <p>
     * The OpenAPI definition. Supported only for HTTP APIs.
     * </p>
     */
    private String body;

    /**
     * <p>
     * Specifies whether to rollback the API creation when a warning is
     * encountered. By default, API creation continues if a warning is
     * encountered.
     * </p>
     */
    private Boolean failOnWarnings;

    /**
     * <p>
     * The API identifier.
     * </p>
     *
     * @return <p>
     *         The API identifier.
     *         </p>
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     *
     * @param apiId <p>
     *            The API identifier.
     *            </p>
     */
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiId <p>
     *            The API identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReimportApiRequest withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * <p>
     * Specifies how to interpret the base path of the API during import. Valid
     * values are ignore, prepend, and split. The default value is ignore. To
     * learn more, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html"
     * >Set the OpenAPI basePath Property</a>. Supported only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         Specifies how to interpret the base path of the API during
     *         import. Valid values are ignore, prepend, and split. The default
     *         value is ignore. To learn more, see <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html"
     *         >Set the OpenAPI basePath Property</a>. Supported only for HTTP
     *         APIs.
     *         </p>
     */
    public String getBasepath() {
        return basepath;
    }

    /**
     * <p>
     * Specifies how to interpret the base path of the API during import. Valid
     * values are ignore, prepend, and split. The default value is ignore. To
     * learn more, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html"
     * >Set the OpenAPI basePath Property</a>. Supported only for HTTP APIs.
     * </p>
     *
     * @param basepath <p>
     *            Specifies how to interpret the base path of the API during
     *            import. Valid values are ignore, prepend, and split. The
     *            default value is ignore. To learn more, see <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html"
     *            >Set the OpenAPI basePath Property</a>. Supported only for
     *            HTTP APIs.
     *            </p>
     */
    public void setBasepath(String basepath) {
        this.basepath = basepath;
    }

    /**
     * <p>
     * Specifies how to interpret the base path of the API during import. Valid
     * values are ignore, prepend, and split. The default value is ignore. To
     * learn more, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html"
     * >Set the OpenAPI basePath Property</a>. Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param basepath <p>
     *            Specifies how to interpret the base path of the API during
     *            import. Valid values are ignore, prepend, and split. The
     *            default value is ignore. To learn more, see <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html"
     *            >Set the OpenAPI basePath Property</a>. Supported only for
     *            HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReimportApiRequest withBasepath(String basepath) {
        this.basepath = basepath;
        return this;
    }

    /**
     * <p>
     * The OpenAPI definition. Supported only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         The OpenAPI definition. Supported only for HTTP APIs.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The OpenAPI definition. Supported only for HTTP APIs.
     * </p>
     *
     * @param body <p>
     *            The OpenAPI definition. Supported only for HTTP APIs.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The OpenAPI definition. Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The OpenAPI definition. Supported only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReimportApiRequest withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * Specifies whether to rollback the API creation when a warning is
     * encountered. By default, API creation continues if a warning is
     * encountered.
     * </p>
     *
     * @return <p>
     *         Specifies whether to rollback the API creation when a warning is
     *         encountered. By default, API creation continues if a warning is
     *         encountered.
     *         </p>
     */
    public Boolean isFailOnWarnings() {
        return failOnWarnings;
    }

    /**
     * <p>
     * Specifies whether to rollback the API creation when a warning is
     * encountered. By default, API creation continues if a warning is
     * encountered.
     * </p>
     *
     * @return <p>
     *         Specifies whether to rollback the API creation when a warning is
     *         encountered. By default, API creation continues if a warning is
     *         encountered.
     *         </p>
     */
    public Boolean getFailOnWarnings() {
        return failOnWarnings;
    }

    /**
     * <p>
     * Specifies whether to rollback the API creation when a warning is
     * encountered. By default, API creation continues if a warning is
     * encountered.
     * </p>
     *
     * @param failOnWarnings <p>
     *            Specifies whether to rollback the API creation when a warning
     *            is encountered. By default, API creation continues if a
     *            warning is encountered.
     *            </p>
     */
    public void setFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
    }

    /**
     * <p>
     * Specifies whether to rollback the API creation when a warning is
     * encountered. By default, API creation continues if a warning is
     * encountered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failOnWarnings <p>
     *            Specifies whether to rollback the API creation when a warning
     *            is encountered. By default, API creation continues if a
     *            warning is encountered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReimportApiRequest withFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
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
        if (getApiId() != null)
            sb.append("ApiId: " + getApiId() + ",");
        if (getBasepath() != null)
            sb.append("Basepath: " + getBasepath() + ",");
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getFailOnWarnings() != null)
            sb.append("FailOnWarnings: " + getFailOnWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getBasepath() == null) ? 0 : getBasepath().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode
                + ((getFailOnWarnings() == null) ? 0 : getFailOnWarnings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReimportApiRequest == false)
            return false;
        ReimportApiRequest other = (ReimportApiRequest) obj;

        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getBasepath() == null ^ this.getBasepath() == null)
            return false;
        if (other.getBasepath() != null && other.getBasepath().equals(this.getBasepath()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getFailOnWarnings() == null ^ this.getFailOnWarnings() == null)
            return false;
        if (other.getFailOnWarnings() != null
                && other.getFailOnWarnings().equals(this.getFailOnWarnings()) == false)
            return false;
        return true;
    }
}
