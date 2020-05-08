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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Provides summary information for an endpoint configuration.
 * </p>
 */
public class EndpointConfigSummary implements Serializable {
    /**
     * <p>
     * The name of the endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointConfigName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:endpoint-config/.*
     * <br/>
     */
    private String endpointConfigArn;

    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The name of the endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the endpoint configuration.
     *         </p>
     */
    public String getEndpointConfigName() {
        return endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointConfigName <p>
     *            The name of the endpoint configuration.
     *            </p>
     */
    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointConfigName <p>
     *            The name of the endpoint configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointConfigSummary withEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:endpoint-config/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the endpoint configuration.
     *         </p>
     */
    public String getEndpointConfigArn() {
        return endpointConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:endpoint-config/.*
     * <br/>
     *
     * @param endpointConfigArn <p>
     *            The Amazon Resource Name (ARN) of the endpoint configuration.
     *            </p>
     */
    public void setEndpointConfigArn(String endpointConfigArn) {
        this.endpointConfigArn = endpointConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:endpoint-config/.*
     * <br/>
     *
     * @param endpointConfigArn <p>
     *            The Amazon Resource Name (ARN) of the endpoint configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointConfigSummary withEndpointConfigArn(String endpointConfigArn) {
        this.endpointConfigArn = endpointConfigArn;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the endpoint configuration was
     *         created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that shows when the endpoint configuration was
     *            created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that shows when the endpoint configuration was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointConfigSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
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
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: " + getEndpointConfigName() + ",");
        if (getEndpointConfigArn() != null)
            sb.append("EndpointConfigArn: " + getEndpointConfigArn() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointConfigArn() == null) ? 0 : getEndpointConfigArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointConfigSummary == false)
            return false;
        EndpointConfigSummary other = (EndpointConfigSummary) obj;

        if (other.getEndpointConfigName() == null ^ this.getEndpointConfigName() == null)
            return false;
        if (other.getEndpointConfigName() != null
                && other.getEndpointConfigName().equals(this.getEndpointConfigName()) == false)
            return false;
        if (other.getEndpointConfigArn() == null ^ this.getEndpointConfigArn() == null)
            return false;
        if (other.getEndpointConfigArn() != null
                && other.getEndpointConfigArn().equals(this.getEndpointConfigArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }
}
