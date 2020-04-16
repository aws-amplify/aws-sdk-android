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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class CreateEndpointConfigResult implements Serializable {
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
    public CreateEndpointConfigResult withEndpointConfigArn(String endpointConfigArn) {
        this.endpointConfigArn = endpointConfigArn;
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
        if (getEndpointConfigArn() != null)
            sb.append("EndpointConfigArn: " + getEndpointConfigArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointConfigArn() == null) ? 0 : getEndpointConfigArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEndpointConfigResult == false)
            return false;
        CreateEndpointConfigResult other = (CreateEndpointConfigResult) obj;

        if (other.getEndpointConfigArn() == null ^ this.getEndpointConfigArn() == null)
            return false;
        if (other.getEndpointConfigArn() != null
                && other.getEndpointConfigArn().equals(this.getEndpointConfigArn()) == false)
            return false;
        return true;
    }
}
