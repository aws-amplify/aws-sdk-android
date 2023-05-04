/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Deletes a flywheel. When you delete the flywheel, Amazon Comprehend does not
 * delete the data lake or the model associated with the flywheel.
 * </p>
 * <p>
 * For more information about flywheels, see <a href=
 * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
 * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
 * </p>
 */
public class DeleteFlywheelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String flywheelArn;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the flywheel to delete.
     *         </p>
     */
    public String getFlywheelArn() {
        return flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param flywheelArn <p>
     *            The Amazon Resource Number (ARN) of the flywheel to delete.
     *            </p>
     */
    public void setFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param flywheelArn <p>
     *            The Amazon Resource Number (ARN) of the flywheel to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFlywheelRequest withFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
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
        if (getFlywheelArn() != null)
            sb.append("FlywheelArn: " + getFlywheelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFlywheelArn() == null) ? 0 : getFlywheelArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFlywheelRequest == false)
            return false;
        DeleteFlywheelRequest other = (DeleteFlywheelRequest) obj;

        if (other.getFlywheelArn() == null ^ this.getFlywheelArn() == null)
            return false;
        if (other.getFlywheelArn() != null
                && other.getFlywheelArn().equals(this.getFlywheelArn()) == false)
            return false;
        return true;
    }
}
