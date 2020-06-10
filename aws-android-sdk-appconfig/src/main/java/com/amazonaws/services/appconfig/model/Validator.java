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

package com.amazonaws.services.appconfig.model;

import java.io.Serializable;

/**
 * <p>
 * A validator provides a syntactic or semantic check to ensure the
 * configuration you want to deploy functions as intended. To validate your
 * application configuration data, you provide a schema or a Lambda function
 * that runs against the configuration. The configuration deployment or update
 * can only proceed when the configuration data is valid.
 * </p>
 */
public class Validator implements Serializable {
    /**
     * <p>
     * AppConfig supports validators of type <code>JSON_SCHEMA</code> and
     * <code>LAMBDA</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JSON_SCHEMA, LAMBDA
     */
    private String type;

    /**
     * <p>
     * Either the JSON Schema content or the Amazon Resource Name (ARN) of an
     * AWS Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String content;

    /**
     * <p>
     * AppConfig supports validators of type <code>JSON_SCHEMA</code> and
     * <code>LAMBDA</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JSON_SCHEMA, LAMBDA
     *
     * @return <p>
     *         AppConfig supports validators of type <code>JSON_SCHEMA</code>
     *         and <code>LAMBDA</code>
     *         </p>
     * @see ValidatorType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * AppConfig supports validators of type <code>JSON_SCHEMA</code> and
     * <code>LAMBDA</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JSON_SCHEMA, LAMBDA
     *
     * @param type <p>
     *            AppConfig supports validators of type <code>JSON_SCHEMA</code>
     *            and <code>LAMBDA</code>
     *            </p>
     * @see ValidatorType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * AppConfig supports validators of type <code>JSON_SCHEMA</code> and
     * <code>LAMBDA</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JSON_SCHEMA, LAMBDA
     *
     * @param type <p>
     *            AppConfig supports validators of type <code>JSON_SCHEMA</code>
     *            and <code>LAMBDA</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ValidatorType
     */
    public Validator withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * AppConfig supports validators of type <code>JSON_SCHEMA</code> and
     * <code>LAMBDA</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JSON_SCHEMA, LAMBDA
     *
     * @param type <p>
     *            AppConfig supports validators of type <code>JSON_SCHEMA</code>
     *            and <code>LAMBDA</code>
     *            </p>
     * @see ValidatorType
     */
    public void setType(ValidatorType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * AppConfig supports validators of type <code>JSON_SCHEMA</code> and
     * <code>LAMBDA</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JSON_SCHEMA, LAMBDA
     *
     * @param type <p>
     *            AppConfig supports validators of type <code>JSON_SCHEMA</code>
     *            and <code>LAMBDA</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ValidatorType
     */
    public Validator withType(ValidatorType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Either the JSON Schema content or the Amazon Resource Name (ARN) of an
     * AWS Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return <p>
     *         Either the JSON Schema content or the Amazon Resource Name (ARN)
     *         of an AWS Lambda function.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * Either the JSON Schema content or the Amazon Resource Name (ARN) of an
     * AWS Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param content <p>
     *            Either the JSON Schema content or the Amazon Resource Name
     *            (ARN) of an AWS Lambda function.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * Either the JSON Schema content or the Amazon Resource Name (ARN) of an
     * AWS Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param content <p>
     *            Either the JSON Schema content or the Amazon Resource Name
     *            (ARN) of an AWS Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Validator withContent(String content) {
        this.content = content;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Validator == false)
            return false;
        Validator other = (Validator) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }
}
