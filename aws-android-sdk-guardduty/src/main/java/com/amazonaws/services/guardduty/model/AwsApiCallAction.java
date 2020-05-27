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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the API operation.
 * </p>
 */
public class AwsApiCallAction implements Serializable {
    /**
     * <p>
     * The AWS API name.
     * </p>
     */
    private String api;

    /**
     * <p>
     * The AWS API caller type.
     * </p>
     */
    private String callerType;

    /**
     * <p>
     * The domain information for the AWS API call.
     * </p>
     */
    private DomainDetails domainDetails;

    /**
     * <p>
     * The remote IP information of the connection.
     * </p>
     */
    private RemoteIpDetails remoteIpDetails;

    /**
     * <p>
     * The AWS service name whose API was invoked.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The AWS API name.
     * </p>
     *
     * @return <p>
     *         The AWS API name.
     *         </p>
     */
    public String getApi() {
        return api;
    }

    /**
     * <p>
     * The AWS API name.
     * </p>
     *
     * @param api <p>
     *            The AWS API name.
     *            </p>
     */
    public void setApi(String api) {
        this.api = api;
    }

    /**
     * <p>
     * The AWS API name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param api <p>
     *            The AWS API name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsApiCallAction withApi(String api) {
        this.api = api;
        return this;
    }

    /**
     * <p>
     * The AWS API caller type.
     * </p>
     *
     * @return <p>
     *         The AWS API caller type.
     *         </p>
     */
    public String getCallerType() {
        return callerType;
    }

    /**
     * <p>
     * The AWS API caller type.
     * </p>
     *
     * @param callerType <p>
     *            The AWS API caller type.
     *            </p>
     */
    public void setCallerType(String callerType) {
        this.callerType = callerType;
    }

    /**
     * <p>
     * The AWS API caller type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param callerType <p>
     *            The AWS API caller type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsApiCallAction withCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }

    /**
     * <p>
     * The domain information for the AWS API call.
     * </p>
     *
     * @return <p>
     *         The domain information for the AWS API call.
     *         </p>
     */
    public DomainDetails getDomainDetails() {
        return domainDetails;
    }

    /**
     * <p>
     * The domain information for the AWS API call.
     * </p>
     *
     * @param domainDetails <p>
     *            The domain information for the AWS API call.
     *            </p>
     */
    public void setDomainDetails(DomainDetails domainDetails) {
        this.domainDetails = domainDetails;
    }

    /**
     * <p>
     * The domain information for the AWS API call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainDetails <p>
     *            The domain information for the AWS API call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsApiCallAction withDomainDetails(DomainDetails domainDetails) {
        this.domainDetails = domainDetails;
        return this;
    }

    /**
     * <p>
     * The remote IP information of the connection.
     * </p>
     *
     * @return <p>
     *         The remote IP information of the connection.
     *         </p>
     */
    public RemoteIpDetails getRemoteIpDetails() {
        return remoteIpDetails;
    }

    /**
     * <p>
     * The remote IP information of the connection.
     * </p>
     *
     * @param remoteIpDetails <p>
     *            The remote IP information of the connection.
     *            </p>
     */
    public void setRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
    }

    /**
     * <p>
     * The remote IP information of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remoteIpDetails <p>
     *            The remote IP information of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsApiCallAction withRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
        return this;
    }

    /**
     * <p>
     * The AWS service name whose API was invoked.
     * </p>
     *
     * @return <p>
     *         The AWS service name whose API was invoked.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The AWS service name whose API was invoked.
     * </p>
     *
     * @param serviceName <p>
     *            The AWS service name whose API was invoked.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The AWS service name whose API was invoked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The AWS service name whose API was invoked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsApiCallAction withServiceName(String serviceName) {
        this.serviceName = serviceName;
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
        if (getApi() != null)
            sb.append("Api: " + getApi() + ",");
        if (getCallerType() != null)
            sb.append("CallerType: " + getCallerType() + ",");
        if (getDomainDetails() != null)
            sb.append("DomainDetails: " + getDomainDetails() + ",");
        if (getRemoteIpDetails() != null)
            sb.append("RemoteIpDetails: " + getRemoteIpDetails() + ",");
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApi() == null) ? 0 : getApi().hashCode());
        hashCode = prime * hashCode + ((getCallerType() == null) ? 0 : getCallerType().hashCode());
        hashCode = prime * hashCode
                + ((getDomainDetails() == null) ? 0 : getDomainDetails().hashCode());
        hashCode = prime * hashCode
                + ((getRemoteIpDetails() == null) ? 0 : getRemoteIpDetails().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsApiCallAction == false)
            return false;
        AwsApiCallAction other = (AwsApiCallAction) obj;

        if (other.getApi() == null ^ this.getApi() == null)
            return false;
        if (other.getApi() != null && other.getApi().equals(this.getApi()) == false)
            return false;
        if (other.getCallerType() == null ^ this.getCallerType() == null)
            return false;
        if (other.getCallerType() != null
                && other.getCallerType().equals(this.getCallerType()) == false)
            return false;
        if (other.getDomainDetails() == null ^ this.getDomainDetails() == null)
            return false;
        if (other.getDomainDetails() != null
                && other.getDomainDetails().equals(this.getDomainDetails()) == false)
            return false;
        if (other.getRemoteIpDetails() == null ^ this.getRemoteIpDetails() == null)
            return false;
        if (other.getRemoteIpDetails() != null
                && other.getRemoteIpDetails().equals(this.getRemoteIpDetails()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }
}
