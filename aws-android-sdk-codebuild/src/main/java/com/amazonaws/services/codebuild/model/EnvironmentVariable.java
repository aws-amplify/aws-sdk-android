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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an environment variable for a build project or a build.
 * </p>
 */
public class EnvironmentVariable implements Serializable {
    /**
     * <p>
     * The name or key of the environment variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String name;

    /**
     * <p>
     * The value of the environment variable.
     * </p>
     * <important>
     * <p>
     * We strongly discourage the use of <code>PLAINTEXT</code> environment
     * variables to store sensitive values, especially AWS secret key IDs and
     * secret access keys. <code>PLAINTEXT</code> environment variables can be
     * displayed in plain text using the AWS CodeBuild console and the AWS
     * Command Line Interface (AWS CLI). For sensitive values, we recommend you
     * use an environment variable of type <code>PARAMETER_STORE</code> or
     * <code>SECRETS_MANAGER</code>.
     * </p>
     * </important>
     */
    private String value;

    /**
     * <p>
     * The type of environment variable. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARAMETER_STORE</code>: An environment variable stored in Amazon
     * EC2 Systems Manager Parameter Store. To learn how to specify a parameter
     * store environment variable, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#parameter-store-build-spec"
     * > parameter store reference-key in the buildspec file</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAINTEXT</code>: An environment variable in plain text format.
     * This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SECRETS_MANAGER</code>: An environment variable stored in AWS
     * Secrets Manager. To learn how to specify a secrets manager environment
     * variable, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#secrets-manager-build-spec"
     * > secrets manager reference-key in the buildspec file</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAINTEXT, PARAMETER_STORE, SECRETS_MANAGER
     */
    private String type;

    /**
     * <p>
     * The name or key of the environment variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name or key of the environment variable.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name or key of the environment variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name <p>
     *            The name or key of the environment variable.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name or key of the environment variable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name <p>
     *            The name or key of the environment variable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentVariable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The value of the environment variable.
     * </p>
     * <important>
     * <p>
     * We strongly discourage the use of <code>PLAINTEXT</code> environment
     * variables to store sensitive values, especially AWS secret key IDs and
     * secret access keys. <code>PLAINTEXT</code> environment variables can be
     * displayed in plain text using the AWS CodeBuild console and the AWS
     * Command Line Interface (AWS CLI). For sensitive values, we recommend you
     * use an environment variable of type <code>PARAMETER_STORE</code> or
     * <code>SECRETS_MANAGER</code>.
     * </p>
     * </important>
     *
     * @return <p>
     *         The value of the environment variable.
     *         </p>
     *         <important>
     *         <p>
     *         We strongly discourage the use of <code>PLAINTEXT</code>
     *         environment variables to store sensitive values, especially AWS
     *         secret key IDs and secret access keys. <code>PLAINTEXT</code>
     *         environment variables can be displayed in plain text using the
     *         AWS CodeBuild console and the AWS Command Line Interface (AWS
     *         CLI). For sensitive values, we recommend you use an environment
     *         variable of type <code>PARAMETER_STORE</code> or
     *         <code>SECRETS_MANAGER</code>.
     *         </p>
     *         </important>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the environment variable.
     * </p>
     * <important>
     * <p>
     * We strongly discourage the use of <code>PLAINTEXT</code> environment
     * variables to store sensitive values, especially AWS secret key IDs and
     * secret access keys. <code>PLAINTEXT</code> environment variables can be
     * displayed in plain text using the AWS CodeBuild console and the AWS
     * Command Line Interface (AWS CLI). For sensitive values, we recommend you
     * use an environment variable of type <code>PARAMETER_STORE</code> or
     * <code>SECRETS_MANAGER</code>.
     * </p>
     * </important>
     *
     * @param value <p>
     *            The value of the environment variable.
     *            </p>
     *            <important>
     *            <p>
     *            We strongly discourage the use of <code>PLAINTEXT</code>
     *            environment variables to store sensitive values, especially
     *            AWS secret key IDs and secret access keys.
     *            <code>PLAINTEXT</code> environment variables can be displayed
     *            in plain text using the AWS CodeBuild console and the AWS
     *            Command Line Interface (AWS CLI). For sensitive values, we
     *            recommend you use an environment variable of type
     *            <code>PARAMETER_STORE</code> or <code>SECRETS_MANAGER</code>.
     *            </p>
     *            </important>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the environment variable.
     * </p>
     * <important>
     * <p>
     * We strongly discourage the use of <code>PLAINTEXT</code> environment
     * variables to store sensitive values, especially AWS secret key IDs and
     * secret access keys. <code>PLAINTEXT</code> environment variables can be
     * displayed in plain text using the AWS CodeBuild console and the AWS
     * Command Line Interface (AWS CLI). For sensitive values, we recommend you
     * use an environment variable of type <code>PARAMETER_STORE</code> or
     * <code>SECRETS_MANAGER</code>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the environment variable.
     *            </p>
     *            <important>
     *            <p>
     *            We strongly discourage the use of <code>PLAINTEXT</code>
     *            environment variables to store sensitive values, especially
     *            AWS secret key IDs and secret access keys.
     *            <code>PLAINTEXT</code> environment variables can be displayed
     *            in plain text using the AWS CodeBuild console and the AWS
     *            Command Line Interface (AWS CLI). For sensitive values, we
     *            recommend you use an environment variable of type
     *            <code>PARAMETER_STORE</code> or <code>SECRETS_MANAGER</code>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentVariable withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The type of environment variable. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARAMETER_STORE</code>: An environment variable stored in Amazon
     * EC2 Systems Manager Parameter Store. To learn how to specify a parameter
     * store environment variable, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#parameter-store-build-spec"
     * > parameter store reference-key in the buildspec file</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAINTEXT</code>: An environment variable in plain text format.
     * This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SECRETS_MANAGER</code>: An environment variable stored in AWS
     * Secrets Manager. To learn how to specify a secrets manager environment
     * variable, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#secrets-manager-build-spec"
     * > secrets manager reference-key in the buildspec file</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAINTEXT, PARAMETER_STORE, SECRETS_MANAGER
     *
     * @return <p>
     *         The type of environment variable. Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PARAMETER_STORE</code>: An environment variable stored in
     *         Amazon EC2 Systems Manager Parameter Store. To learn how to
     *         specify a parameter store environment variable, see <a href=
     *         "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#parameter-store-build-spec"
     *         > parameter store reference-key in the buildspec file</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PLAINTEXT</code>: An environment variable in plain text
     *         format. This is the default value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SECRETS_MANAGER</code>: An environment variable stored in
     *         AWS Secrets Manager. To learn how to specify a secrets manager
     *         environment variable, see <a href=
     *         "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#secrets-manager-build-spec"
     *         > secrets manager reference-key in the buildspec file</a>.
     *         </p>
     *         </li>
     *         </ul>
     * @see EnvironmentVariableType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of environment variable. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARAMETER_STORE</code>: An environment variable stored in Amazon
     * EC2 Systems Manager Parameter Store. To learn how to specify a parameter
     * store environment variable, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#parameter-store-build-spec"
     * > parameter store reference-key in the buildspec file</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAINTEXT</code>: An environment variable in plain text format.
     * This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SECRETS_MANAGER</code>: An environment variable stored in AWS
     * Secrets Manager. To learn how to specify a secrets manager environment
     * variable, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#secrets-manager-build-spec"
     * > secrets manager reference-key in the buildspec file</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAINTEXT, PARAMETER_STORE, SECRETS_MANAGER
     *
     * @param type <p>
     *            The type of environment variable. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PARAMETER_STORE</code>: An environment variable stored
     *            in Amazon EC2 Systems Manager Parameter Store. To learn how to
     *            specify a parameter store environment variable, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#parameter-store-build-spec"
     *            > parameter store reference-key in the buildspec file</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAINTEXT</code>: An environment variable in plain text
     *            format. This is the default value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SECRETS_MANAGER</code>: An environment variable stored
     *            in AWS Secrets Manager. To learn how to specify a secrets
     *            manager environment variable, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#secrets-manager-build-spec"
     *            > secrets manager reference-key in the buildspec file</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @see EnvironmentVariableType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of environment variable. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARAMETER_STORE</code>: An environment variable stored in Amazon
     * EC2 Systems Manager Parameter Store. To learn how to specify a parameter
     * store environment variable, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#parameter-store-build-spec"
     * > parameter store reference-key in the buildspec file</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAINTEXT</code>: An environment variable in plain text format.
     * This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SECRETS_MANAGER</code>: An environment variable stored in AWS
     * Secrets Manager. To learn how to specify a secrets manager environment
     * variable, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#secrets-manager-build-spec"
     * > secrets manager reference-key in the buildspec file</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAINTEXT, PARAMETER_STORE, SECRETS_MANAGER
     *
     * @param type <p>
     *            The type of environment variable. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PARAMETER_STORE</code>: An environment variable stored
     *            in Amazon EC2 Systems Manager Parameter Store. To learn how to
     *            specify a parameter store environment variable, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#parameter-store-build-spec"
     *            > parameter store reference-key in the buildspec file</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAINTEXT</code>: An environment variable in plain text
     *            format. This is the default value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SECRETS_MANAGER</code>: An environment variable stored
     *            in AWS Secrets Manager. To learn how to specify a secrets
     *            manager environment variable, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#secrets-manager-build-spec"
     *            > secrets manager reference-key in the buildspec file</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentVariableType
     */
    public EnvironmentVariable withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of environment variable. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARAMETER_STORE</code>: An environment variable stored in Amazon
     * EC2 Systems Manager Parameter Store. To learn how to specify a parameter
     * store environment variable, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#parameter-store-build-spec"
     * > parameter store reference-key in the buildspec file</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAINTEXT</code>: An environment variable in plain text format.
     * This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SECRETS_MANAGER</code>: An environment variable stored in AWS
     * Secrets Manager. To learn how to specify a secrets manager environment
     * variable, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#secrets-manager-build-spec"
     * > secrets manager reference-key in the buildspec file</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAINTEXT, PARAMETER_STORE, SECRETS_MANAGER
     *
     * @param type <p>
     *            The type of environment variable. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PARAMETER_STORE</code>: An environment variable stored
     *            in Amazon EC2 Systems Manager Parameter Store. To learn how to
     *            specify a parameter store environment variable, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#parameter-store-build-spec"
     *            > parameter store reference-key in the buildspec file</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAINTEXT</code>: An environment variable in plain text
     *            format. This is the default value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SECRETS_MANAGER</code>: An environment variable stored
     *            in AWS Secrets Manager. To learn how to specify a secrets
     *            manager environment variable, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#secrets-manager-build-spec"
     *            > secrets manager reference-key in the buildspec file</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @see EnvironmentVariableType
     */
    public void setType(EnvironmentVariableType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of environment variable. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARAMETER_STORE</code>: An environment variable stored in Amazon
     * EC2 Systems Manager Parameter Store. To learn how to specify a parameter
     * store environment variable, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#parameter-store-build-spec"
     * > parameter store reference-key in the buildspec file</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAINTEXT</code>: An environment variable in plain text format.
     * This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SECRETS_MANAGER</code>: An environment variable stored in AWS
     * Secrets Manager. To learn how to specify a secrets manager environment
     * variable, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#secrets-manager-build-spec"
     * > secrets manager reference-key in the buildspec file</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAINTEXT, PARAMETER_STORE, SECRETS_MANAGER
     *
     * @param type <p>
     *            The type of environment variable. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PARAMETER_STORE</code>: An environment variable stored
     *            in Amazon EC2 Systems Manager Parameter Store. To learn how to
     *            specify a parameter store environment variable, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#parameter-store-build-spec"
     *            > parameter store reference-key in the buildspec file</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAINTEXT</code>: An environment variable in plain text
     *            format. This is the default value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SECRETS_MANAGER</code>: An environment variable stored
     *            in AWS Secrets Manager. To learn how to specify a secrets
     *            manager environment variable, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#secrets-manager-build-spec"
     *            > secrets manager reference-key in the buildspec file</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentVariableType
     */
    public EnvironmentVariable withType(EnvironmentVariableType type) {
        this.type = type.toString();
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentVariable == false)
            return false;
        EnvironmentVariable other = (EnvironmentVariable) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
