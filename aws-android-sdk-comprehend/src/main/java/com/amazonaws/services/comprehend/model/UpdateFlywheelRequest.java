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
 * Update the configuration information for an existing flywheel.
 * </p>
 */
public class UpdateFlywheelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to update.
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
     * The Amazon Resource Number (ARN) of the active model version.
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
    private String activeModelArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend permission to access the flywheel data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * Flywheel data security configuration.
     * </p>
     */
    private UpdateDataSecurityConfig dataSecurityConfig;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the flywheel to update.
     *         </p>
     */
    public String getFlywheelArn() {
        return flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param flywheelArn <p>
     *            The Amazon Resource Number (ARN) of the flywheel to update.
     *            </p>
     */
    public void setFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to update.
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
     *            The Amazon Resource Number (ARN) of the flywheel to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFlywheelRequest withFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
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
     *         The Amazon Resource Number (ARN) of the active model version.
     *         </p>
     */
    public String getActiveModelArn() {
        return activeModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
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
     * @param activeModelArn <p>
     *            The Amazon Resource Number (ARN) of the active model version.
     *            </p>
     */
    public void setActiveModelArn(String activeModelArn) {
        this.activeModelArn = activeModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
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
     * @param activeModelArn <p>
     *            The Amazon Resource Number (ARN) of the active model version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFlywheelRequest withActiveModelArn(String activeModelArn) {
        this.activeModelArn = activeModelArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend permission to access the flywheel data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     *         Comprehend permission to access the flywheel data.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend permission to access the flywheel data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that grants
     *            Amazon Comprehend permission to access the flywheel data.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend permission to access the flywheel data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that grants
     *            Amazon Comprehend permission to access the flywheel data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFlywheelRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * Flywheel data security configuration.
     * </p>
     *
     * @return <p>
     *         Flywheel data security configuration.
     *         </p>
     */
    public UpdateDataSecurityConfig getDataSecurityConfig() {
        return dataSecurityConfig;
    }

    /**
     * <p>
     * Flywheel data security configuration.
     * </p>
     *
     * @param dataSecurityConfig <p>
     *            Flywheel data security configuration.
     *            </p>
     */
    public void setDataSecurityConfig(UpdateDataSecurityConfig dataSecurityConfig) {
        this.dataSecurityConfig = dataSecurityConfig;
    }

    /**
     * <p>
     * Flywheel data security configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSecurityConfig <p>
     *            Flywheel data security configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFlywheelRequest withDataSecurityConfig(UpdateDataSecurityConfig dataSecurityConfig) {
        this.dataSecurityConfig = dataSecurityConfig;
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
            sb.append("FlywheelArn: " + getFlywheelArn() + ",");
        if (getActiveModelArn() != null)
            sb.append("ActiveModelArn: " + getActiveModelArn() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getDataSecurityConfig() != null)
            sb.append("DataSecurityConfig: " + getDataSecurityConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFlywheelArn() == null) ? 0 : getFlywheelArn().hashCode());
        hashCode = prime * hashCode
                + ((getActiveModelArn() == null) ? 0 : getActiveModelArn().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getDataSecurityConfig() == null) ? 0 : getDataSecurityConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFlywheelRequest == false)
            return false;
        UpdateFlywheelRequest other = (UpdateFlywheelRequest) obj;

        if (other.getFlywheelArn() == null ^ this.getFlywheelArn() == null)
            return false;
        if (other.getFlywheelArn() != null
                && other.getFlywheelArn().equals(this.getFlywheelArn()) == false)
            return false;
        if (other.getActiveModelArn() == null ^ this.getActiveModelArn() == null)
            return false;
        if (other.getActiveModelArn() != null
                && other.getActiveModelArn().equals(this.getActiveModelArn()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getDataSecurityConfig() == null ^ this.getDataSecurityConfig() == null)
            return false;
        if (other.getDataSecurityConfig() != null
                && other.getDataSecurityConfig().equals(this.getDataSecurityConfig()) == false)
            return false;
        return true;
    }
}
