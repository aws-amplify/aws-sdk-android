/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates information about the specified endpoint.
 * </p>
 */
public class UpdateEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint being updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * -endpoint|entity-recognizer-endpoint)/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointArn;

    /**
     * <p>
     * The ARN of the new model to use when updating an existing endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     */
    private String desiredModelArn;

    /**
     * <p>
     * The desired number of inference units to be used by the model using this
     * endpoint. Each inference unit represents of a throughput of 100
     * characters per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer desiredInferenceUnits;

    /**
     * <p>
     * Data access role ARN to use in case the new model is encrypted with a
     * customer CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     */
    private String desiredDataAccessRoleArn;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint being updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * -endpoint|entity-recognizer-endpoint)/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the endpoint being updated.
     *         </p>
     */
    public String getEndpointArn() {
        return endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint being updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * -endpoint|entity-recognizer-endpoint)/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Number (ARN) of the endpoint being
     *            updated.
     *            </p>
     */
    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint being updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * -endpoint|entity-recognizer-endpoint)/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Number (ARN) of the endpoint being
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the new model to use when updating an existing endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @return <p>
     *         The ARN of the new model to use when updating an existing
     *         endpoint.
     *         </p>
     */
    public String getDesiredModelArn() {
        return desiredModelArn;
    }

    /**
     * <p>
     * The ARN of the new model to use when updating an existing endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param desiredModelArn <p>
     *            The ARN of the new model to use when updating an existing
     *            endpoint.
     *            </p>
     */
    public void setDesiredModelArn(String desiredModelArn) {
        this.desiredModelArn = desiredModelArn;
    }

    /**
     * <p>
     * The ARN of the new model to use when updating an existing endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param desiredModelArn <p>
     *            The ARN of the new model to use when updating an existing
     *            endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withDesiredModelArn(String desiredModelArn) {
        this.desiredModelArn = desiredModelArn;
        return this;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this
     * endpoint. Each inference unit represents of a throughput of 100
     * characters per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The desired number of inference units to be used by the model
     *         using this endpoint. Each inference unit represents of a
     *         throughput of 100 characters per second.
     *         </p>
     */
    public Integer getDesiredInferenceUnits() {
        return desiredInferenceUnits;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this
     * endpoint. Each inference unit represents of a throughput of 100
     * characters per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param desiredInferenceUnits <p>
     *            The desired number of inference units to be used by the model
     *            using this endpoint. Each inference unit represents of a
     *            throughput of 100 characters per second.
     *            </p>
     */
    public void setDesiredInferenceUnits(Integer desiredInferenceUnits) {
        this.desiredInferenceUnits = desiredInferenceUnits;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this
     * endpoint. Each inference unit represents of a throughput of 100
     * characters per second.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param desiredInferenceUnits <p>
     *            The desired number of inference units to be used by the model
     *            using this endpoint. Each inference unit represents of a
     *            throughput of 100 characters per second.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withDesiredInferenceUnits(Integer desiredInferenceUnits) {
        this.desiredInferenceUnits = desiredInferenceUnits;
        return this;
    }

    /**
     * <p>
     * Data access role ARN to use in case the new model is encrypted with a
     * customer CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         Data access role ARN to use in case the new model is encrypted
     *         with a customer CMK.
     *         </p>
     */
    public String getDesiredDataAccessRoleArn() {
        return desiredDataAccessRoleArn;
    }

    /**
     * <p>
     * Data access role ARN to use in case the new model is encrypted with a
     * customer CMK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param desiredDataAccessRoleArn <p>
     *            Data access role ARN to use in case the new model is encrypted
     *            with a customer CMK.
     *            </p>
     */
    public void setDesiredDataAccessRoleArn(String desiredDataAccessRoleArn) {
        this.desiredDataAccessRoleArn = desiredDataAccessRoleArn;
    }

    /**
     * <p>
     * Data access role ARN to use in case the new model is encrypted with a
     * customer CMK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param desiredDataAccessRoleArn <p>
     *            Data access role ARN to use in case the new model is encrypted
     *            with a customer CMK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withDesiredDataAccessRoleArn(String desiredDataAccessRoleArn) {
        this.desiredDataAccessRoleArn = desiredDataAccessRoleArn;
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
        if (getEndpointArn() != null)
            sb.append("EndpointArn: " + getEndpointArn() + ",");
        if (getDesiredModelArn() != null)
            sb.append("DesiredModelArn: " + getDesiredModelArn() + ",");
        if (getDesiredInferenceUnits() != null)
            sb.append("DesiredInferenceUnits: " + getDesiredInferenceUnits() + ",");
        if (getDesiredDataAccessRoleArn() != null)
            sb.append("DesiredDataAccessRoleArn: " + getDesiredDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredModelArn() == null) ? 0 : getDesiredModelArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getDesiredInferenceUnits() == null) ? 0 : getDesiredInferenceUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getDesiredDataAccessRoleArn() == null) ? 0 : getDesiredDataAccessRoleArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndpointRequest == false)
            return false;
        UpdateEndpointRequest other = (UpdateEndpointRequest) obj;

        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null
                && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getDesiredModelArn() == null ^ this.getDesiredModelArn() == null)
            return false;
        if (other.getDesiredModelArn() != null
                && other.getDesiredModelArn().equals(this.getDesiredModelArn()) == false)
            return false;
        if (other.getDesiredInferenceUnits() == null ^ this.getDesiredInferenceUnits() == null)
            return false;
        if (other.getDesiredInferenceUnits() != null
                && other.getDesiredInferenceUnits().equals(this.getDesiredInferenceUnits()) == false)
            return false;
        if (other.getDesiredDataAccessRoleArn() == null
                ^ this.getDesiredDataAccessRoleArn() == null)
            return false;
        if (other.getDesiredDataAccessRoleArn() != null
                && other.getDesiredDataAccessRoleArn().equals(this.getDesiredDataAccessRoleArn()) == false)
            return false;
        return true;
    }
}
