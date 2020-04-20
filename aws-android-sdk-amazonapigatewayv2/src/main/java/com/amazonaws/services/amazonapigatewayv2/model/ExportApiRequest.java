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

public class ExportApiRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;

    /**
     * <p>
     * The version of the API Gateway export algorithm. API Gateway uses the
     * latest version by default. Currently, the only supported version is 1.0.
     * </p>
     */
    private String exportVersion;

    /**
     * <p>
     * Specifies whether to include <a href=
     * "https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html"
     * >API Gateway extensions</a> in the exported API definition. API Gateway
     * extensions are included by default.
     * </p>
     */
    private Boolean includeExtensions;

    /**
     * <p>
     * The output type of the exported definition file. Valid values are JSON
     * and YAML.
     * </p>
     */
    private String outputType;

    /**
     * <p>
     * The version of the API specification to use. OAS30, for OpenAPI 3.0, is
     * the only supported value.
     * </p>
     */
    private String specification;

    /**
     * <p>
     * The name of the API stage to export. If you don't specify this property,
     * a representation of the latest API configuration is exported.
     * </p>
     */
    private String stageName;

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
    public ExportApiRequest withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * <p>
     * The version of the API Gateway export algorithm. API Gateway uses the
     * latest version by default. Currently, the only supported version is 1.0.
     * </p>
     *
     * @return <p>
     *         The version of the API Gateway export algorithm. API Gateway uses
     *         the latest version by default. Currently, the only supported
     *         version is 1.0.
     *         </p>
     */
    public String getExportVersion() {
        return exportVersion;
    }

    /**
     * <p>
     * The version of the API Gateway export algorithm. API Gateway uses the
     * latest version by default. Currently, the only supported version is 1.0.
     * </p>
     *
     * @param exportVersion <p>
     *            The version of the API Gateway export algorithm. API Gateway
     *            uses the latest version by default. Currently, the only
     *            supported version is 1.0.
     *            </p>
     */
    public void setExportVersion(String exportVersion) {
        this.exportVersion = exportVersion;
    }

    /**
     * <p>
     * The version of the API Gateway export algorithm. API Gateway uses the
     * latest version by default. Currently, the only supported version is 1.0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportVersion <p>
     *            The version of the API Gateway export algorithm. API Gateway
     *            uses the latest version by default. Currently, the only
     *            supported version is 1.0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportApiRequest withExportVersion(String exportVersion) {
        this.exportVersion = exportVersion;
        return this;
    }

    /**
     * <p>
     * Specifies whether to include <a href=
     * "https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html"
     * >API Gateway extensions</a> in the exported API definition. API Gateway
     * extensions are included by default.
     * </p>
     *
     * @return <p>
     *         Specifies whether to include <a href=
     *         "https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html"
     *         >API Gateway extensions</a> in the exported API definition. API
     *         Gateway extensions are included by default.
     *         </p>
     */
    public Boolean isIncludeExtensions() {
        return includeExtensions;
    }

    /**
     * <p>
     * Specifies whether to include <a href=
     * "https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html"
     * >API Gateway extensions</a> in the exported API definition. API Gateway
     * extensions are included by default.
     * </p>
     *
     * @return <p>
     *         Specifies whether to include <a href=
     *         "https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html"
     *         >API Gateway extensions</a> in the exported API definition. API
     *         Gateway extensions are included by default.
     *         </p>
     */
    public Boolean getIncludeExtensions() {
        return includeExtensions;
    }

    /**
     * <p>
     * Specifies whether to include <a href=
     * "https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html"
     * >API Gateway extensions</a> in the exported API definition. API Gateway
     * extensions are included by default.
     * </p>
     *
     * @param includeExtensions <p>
     *            Specifies whether to include <a href=
     *            "https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html"
     *            >API Gateway extensions</a> in the exported API definition.
     *            API Gateway extensions are included by default.
     *            </p>
     */
    public void setIncludeExtensions(Boolean includeExtensions) {
        this.includeExtensions = includeExtensions;
    }

    /**
     * <p>
     * Specifies whether to include <a href=
     * "https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html"
     * >API Gateway extensions</a> in the exported API definition. API Gateway
     * extensions are included by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeExtensions <p>
     *            Specifies whether to include <a href=
     *            "https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html"
     *            >API Gateway extensions</a> in the exported API definition.
     *            API Gateway extensions are included by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportApiRequest withIncludeExtensions(Boolean includeExtensions) {
        this.includeExtensions = includeExtensions;
        return this;
    }

    /**
     * <p>
     * The output type of the exported definition file. Valid values are JSON
     * and YAML.
     * </p>
     *
     * @return <p>
     *         The output type of the exported definition file. Valid values are
     *         JSON and YAML.
     *         </p>
     */
    public String getOutputType() {
        return outputType;
    }

    /**
     * <p>
     * The output type of the exported definition file. Valid values are JSON
     * and YAML.
     * </p>
     *
     * @param outputType <p>
     *            The output type of the exported definition file. Valid values
     *            are JSON and YAML.
     *            </p>
     */
    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    /**
     * <p>
     * The output type of the exported definition file. Valid values are JSON
     * and YAML.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputType <p>
     *            The output type of the exported definition file. Valid values
     *            are JSON and YAML.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportApiRequest withOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }

    /**
     * <p>
     * The version of the API specification to use. OAS30, for OpenAPI 3.0, is
     * the only supported value.
     * </p>
     *
     * @return <p>
     *         The version of the API specification to use. OAS30, for OpenAPI
     *         3.0, is the only supported value.
     *         </p>
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * <p>
     * The version of the API specification to use. OAS30, for OpenAPI 3.0, is
     * the only supported value.
     * </p>
     *
     * @param specification <p>
     *            The version of the API specification to use. OAS30, for
     *            OpenAPI 3.0, is the only supported value.
     *            </p>
     */
    public void setSpecification(String specification) {
        this.specification = specification;
    }

    /**
     * <p>
     * The version of the API specification to use. OAS30, for OpenAPI 3.0, is
     * the only supported value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param specification <p>
     *            The version of the API specification to use. OAS30, for
     *            OpenAPI 3.0, is the only supported value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportApiRequest withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * <p>
     * The name of the API stage to export. If you don't specify this property,
     * a representation of the latest API configuration is exported.
     * </p>
     *
     * @return <p>
     *         The name of the API stage to export. If you don't specify this
     *         property, a representation of the latest API configuration is
     *         exported.
     *         </p>
     */
    public String getStageName() {
        return stageName;
    }

    /**
     * <p>
     * The name of the API stage to export. If you don't specify this property,
     * a representation of the latest API configuration is exported.
     * </p>
     *
     * @param stageName <p>
     *            The name of the API stage to export. If you don't specify this
     *            property, a representation of the latest API configuration is
     *            exported.
     *            </p>
     */
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the API stage to export. If you don't specify this property,
     * a representation of the latest API configuration is exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stageName <p>
     *            The name of the API stage to export. If you don't specify this
     *            property, a representation of the latest API configuration is
     *            exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportApiRequest withStageName(String stageName) {
        this.stageName = stageName;
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
        if (getExportVersion() != null)
            sb.append("ExportVersion: " + getExportVersion() + ",");
        if (getIncludeExtensions() != null)
            sb.append("IncludeExtensions: " + getIncludeExtensions() + ",");
        if (getOutputType() != null)
            sb.append("OutputType: " + getOutputType() + ",");
        if (getSpecification() != null)
            sb.append("Specification: " + getSpecification() + ",");
        if (getStageName() != null)
            sb.append("StageName: " + getStageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode
                + ((getExportVersion() == null) ? 0 : getExportVersion().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeExtensions() == null) ? 0 : getIncludeExtensions().hashCode());
        hashCode = prime * hashCode + ((getOutputType() == null) ? 0 : getOutputType().hashCode());
        hashCode = prime * hashCode
                + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportApiRequest == false)
            return false;
        ExportApiRequest other = (ExportApiRequest) obj;

        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getExportVersion() == null ^ this.getExportVersion() == null)
            return false;
        if (other.getExportVersion() != null
                && other.getExportVersion().equals(this.getExportVersion()) == false)
            return false;
        if (other.getIncludeExtensions() == null ^ this.getIncludeExtensions() == null)
            return false;
        if (other.getIncludeExtensions() != null
                && other.getIncludeExtensions().equals(this.getIncludeExtensions()) == false)
            return false;
        if (other.getOutputType() == null ^ this.getOutputType() == null)
            return false;
        if (other.getOutputType() != null
                && other.getOutputType().equals(this.getOutputType()) == false)
            return false;
        if (other.getSpecification() == null ^ this.getSpecification() == null)
            return false;
        if (other.getSpecification() != null
                && other.getSpecification().equals(this.getSpecification()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null
                && other.getStageName().equals(this.getStageName()) == false)
            return false;
        return true;
    }
}
