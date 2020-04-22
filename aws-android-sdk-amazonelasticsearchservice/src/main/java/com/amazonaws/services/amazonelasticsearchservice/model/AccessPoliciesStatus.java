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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * The configured access rules for the domain's document and search endpoints,
 * and the current status of those rules.
 * </p>
 */
public class AccessPoliciesStatus implements Serializable {
    /**
     * <p>
     * The access policy configured for the Elasticsearch domain. Access
     * policies may be resource-based, IP-based, or IAM-based. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-access-policies"
     * target="_blank"> Configuring Access Policies</a>for more information.
     * </p>
     */
    private String options;

    /**
     * <p>
     * The status of the access policy for the Elasticsearch domain. See
     * <code>OptionStatus</code> for the status information that's included.
     * </p>
     */
    private OptionStatus status;

    /**
     * <p>
     * The access policy configured for the Elasticsearch domain. Access
     * policies may be resource-based, IP-based, or IAM-based. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-access-policies"
     * target="_blank"> Configuring Access Policies</a>for more information.
     * </p>
     *
     * @return <p>
     *         The access policy configured for the Elasticsearch domain. Access
     *         policies may be resource-based, IP-based, or IAM-based. See <a
     *         href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-access-policies"
     *         target="_blank"> Configuring Access Policies</a>for more
     *         information.
     *         </p>
     */
    public String getOptions() {
        return options;
    }

    /**
     * <p>
     * The access policy configured for the Elasticsearch domain. Access
     * policies may be resource-based, IP-based, or IAM-based. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-access-policies"
     * target="_blank"> Configuring Access Policies</a>for more information.
     * </p>
     *
     * @param options <p>
     *            The access policy configured for the Elasticsearch domain.
     *            Access policies may be resource-based, IP-based, or IAM-based.
     *            See <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-access-policies"
     *            target="_blank"> Configuring Access Policies</a>for more
     *            information.
     *            </p>
     */
    public void setOptions(String options) {
        this.options = options;
    }

    /**
     * <p>
     * The access policy configured for the Elasticsearch domain. Access
     * policies may be resource-based, IP-based, or IAM-based. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-access-policies"
     * target="_blank"> Configuring Access Policies</a>for more information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            The access policy configured for the Elasticsearch domain.
     *            Access policies may be resource-based, IP-based, or IAM-based.
     *            See <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-access-policies"
     *            target="_blank"> Configuring Access Policies</a>for more
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPoliciesStatus withOptions(String options) {
        this.options = options;
        return this;
    }

    /**
     * <p>
     * The status of the access policy for the Elasticsearch domain. See
     * <code>OptionStatus</code> for the status information that's included.
     * </p>
     *
     * @return <p>
     *         The status of the access policy for the Elasticsearch domain. See
     *         <code>OptionStatus</code> for the status information that's
     *         included.
     *         </p>
     */
    public OptionStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the access policy for the Elasticsearch domain. See
     * <code>OptionStatus</code> for the status information that's included.
     * </p>
     *
     * @param status <p>
     *            The status of the access policy for the Elasticsearch domain.
     *            See <code>OptionStatus</code> for the status information
     *            that's included.
     *            </p>
     */
    public void setStatus(OptionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the access policy for the Elasticsearch domain. See
     * <code>OptionStatus</code> for the status information that's included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the access policy for the Elasticsearch domain.
     *            See <code>OptionStatus</code> for the status information
     *            that's included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPoliciesStatus withStatus(OptionStatus status) {
        this.status = status;
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
        if (getOptions() != null)
            sb.append("Options: " + getOptions() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessPoliciesStatus == false)
            return false;
        AccessPoliciesStatus other = (AccessPoliciesStatus) obj;

        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
