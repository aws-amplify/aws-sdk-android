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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

public class GetQueryLoggingConfigResult implements Serializable {
    /**
     * <p>
     * A complex type that contains information about the query logging
     * configuration that you specified in a <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetQueryLoggingConfig.html"
     * >GetQueryLoggingConfig</a> request.
     * </p>
     */
    private QueryLoggingConfig queryLoggingConfig;

    /**
     * <p>
     * A complex type that contains information about the query logging
     * configuration that you specified in a <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetQueryLoggingConfig.html"
     * >GetQueryLoggingConfig</a> request.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the query logging
     *         configuration that you specified in a <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetQueryLoggingConfig.html"
     *         >GetQueryLoggingConfig</a> request.
     *         </p>
     */
    public QueryLoggingConfig getQueryLoggingConfig() {
        return queryLoggingConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the query logging
     * configuration that you specified in a <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetQueryLoggingConfig.html"
     * >GetQueryLoggingConfig</a> request.
     * </p>
     *
     * @param queryLoggingConfig <p>
     *            A complex type that contains information about the query
     *            logging configuration that you specified in a <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetQueryLoggingConfig.html"
     *            >GetQueryLoggingConfig</a> request.
     *            </p>
     */
    public void setQueryLoggingConfig(QueryLoggingConfig queryLoggingConfig) {
        this.queryLoggingConfig = queryLoggingConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the query logging
     * configuration that you specified in a <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetQueryLoggingConfig.html"
     * >GetQueryLoggingConfig</a> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryLoggingConfig <p>
     *            A complex type that contains information about the query
     *            logging configuration that you specified in a <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetQueryLoggingConfig.html"
     *            >GetQueryLoggingConfig</a> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetQueryLoggingConfigResult withQueryLoggingConfig(QueryLoggingConfig queryLoggingConfig) {
        this.queryLoggingConfig = queryLoggingConfig;
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
        if (getQueryLoggingConfig() != null)
            sb.append("QueryLoggingConfig: " + getQueryLoggingConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueryLoggingConfig() == null) ? 0 : getQueryLoggingConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueryLoggingConfigResult == false)
            return false;
        GetQueryLoggingConfigResult other = (GetQueryLoggingConfigResult) obj;

        if (other.getQueryLoggingConfig() == null ^ this.getQueryLoggingConfig() == null)
            return false;
        if (other.getQueryLoggingConfig() != null
                && other.getQueryLoggingConfig().equals(this.getQueryLoggingConfig()) == false)
            return false;
        return true;
    }
}
