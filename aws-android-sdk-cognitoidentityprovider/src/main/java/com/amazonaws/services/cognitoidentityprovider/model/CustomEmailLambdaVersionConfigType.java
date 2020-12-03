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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * A custom email sender Lambda configuration type.
 * </p>
 */
public class CustomEmailLambdaVersionConfigType implements Serializable {
    /**
     * <p>
     * The Lambda version represents the signature of the "request" attribute in
     * the "event" information Amazon Cognito passes to your custom email Lambda
     * function. The only supported value is <code>V1_0</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V1_0
     */
    private String lambdaVersion;

    /**
     * <p>
     * The Lambda Amazon Resource Name of the Lambda function that Amazon
     * Cognito triggers to send email notifications to users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String lambdaArn;

    /**
     * <p>
     * The Lambda version represents the signature of the "request" attribute in
     * the "event" information Amazon Cognito passes to your custom email Lambda
     * function. The only supported value is <code>V1_0</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V1_0
     *
     * @return <p>
     *         The Lambda version represents the signature of the "request"
     *         attribute in the "event" information Amazon Cognito passes to
     *         your custom email Lambda function. The only supported value is
     *         <code>V1_0</code>.
     *         </p>
     * @see CustomEmailSenderLambdaVersionType
     */
    public String getLambdaVersion() {
        return lambdaVersion;
    }

    /**
     * <p>
     * The Lambda version represents the signature of the "request" attribute in
     * the "event" information Amazon Cognito passes to your custom email Lambda
     * function. The only supported value is <code>V1_0</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V1_0
     *
     * @param lambdaVersion <p>
     *            The Lambda version represents the signature of the "request"
     *            attribute in the "event" information Amazon Cognito passes to
     *            your custom email Lambda function. The only supported value is
     *            <code>V1_0</code>.
     *            </p>
     * @see CustomEmailSenderLambdaVersionType
     */
    public void setLambdaVersion(String lambdaVersion) {
        this.lambdaVersion = lambdaVersion;
    }

    /**
     * <p>
     * The Lambda version represents the signature of the "request" attribute in
     * the "event" information Amazon Cognito passes to your custom email Lambda
     * function. The only supported value is <code>V1_0</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V1_0
     *
     * @param lambdaVersion <p>
     *            The Lambda version represents the signature of the "request"
     *            attribute in the "event" information Amazon Cognito passes to
     *            your custom email Lambda function. The only supported value is
     *            <code>V1_0</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomEmailSenderLambdaVersionType
     */
    public CustomEmailLambdaVersionConfigType withLambdaVersion(String lambdaVersion) {
        this.lambdaVersion = lambdaVersion;
        return this;
    }

    /**
     * <p>
     * The Lambda version represents the signature of the "request" attribute in
     * the "event" information Amazon Cognito passes to your custom email Lambda
     * function. The only supported value is <code>V1_0</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V1_0
     *
     * @param lambdaVersion <p>
     *            The Lambda version represents the signature of the "request"
     *            attribute in the "event" information Amazon Cognito passes to
     *            your custom email Lambda function. The only supported value is
     *            <code>V1_0</code>.
     *            </p>
     * @see CustomEmailSenderLambdaVersionType
     */
    public void setLambdaVersion(CustomEmailSenderLambdaVersionType lambdaVersion) {
        this.lambdaVersion = lambdaVersion.toString();
    }

    /**
     * <p>
     * The Lambda version represents the signature of the "request" attribute in
     * the "event" information Amazon Cognito passes to your custom email Lambda
     * function. The only supported value is <code>V1_0</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V1_0
     *
     * @param lambdaVersion <p>
     *            The Lambda version represents the signature of the "request"
     *            attribute in the "event" information Amazon Cognito passes to
     *            your custom email Lambda function. The only supported value is
     *            <code>V1_0</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomEmailSenderLambdaVersionType
     */
    public CustomEmailLambdaVersionConfigType withLambdaVersion(
            CustomEmailSenderLambdaVersionType lambdaVersion) {
        this.lambdaVersion = lambdaVersion.toString();
        return this;
    }

    /**
     * <p>
     * The Lambda Amazon Resource Name of the Lambda function that Amazon
     * Cognito triggers to send email notifications to users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         The Lambda Amazon Resource Name of the Lambda function that
     *         Amazon Cognito triggers to send email notifications to users.
     *         </p>
     */
    public String getLambdaArn() {
        return lambdaArn;
    }

    /**
     * <p>
     * The Lambda Amazon Resource Name of the Lambda function that Amazon
     * Cognito triggers to send email notifications to users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param lambdaArn <p>
     *            The Lambda Amazon Resource Name of the Lambda function that
     *            Amazon Cognito triggers to send email notifications to users.
     *            </p>
     */
    public void setLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
    }

    /**
     * <p>
     * The Lambda Amazon Resource Name of the Lambda function that Amazon
     * Cognito triggers to send email notifications to users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param lambdaArn <p>
     *            The Lambda Amazon Resource Name of the Lambda function that
     *            Amazon Cognito triggers to send email notifications to users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomEmailLambdaVersionConfigType withLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
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
        if (getLambdaVersion() != null)
            sb.append("LambdaVersion: " + getLambdaVersion() + ",");
        if (getLambdaArn() != null)
            sb.append("LambdaArn: " + getLambdaArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLambdaVersion() == null) ? 0 : getLambdaVersion().hashCode());
        hashCode = prime * hashCode + ((getLambdaArn() == null) ? 0 : getLambdaArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomEmailLambdaVersionConfigType == false)
            return false;
        CustomEmailLambdaVersionConfigType other = (CustomEmailLambdaVersionConfigType) obj;

        if (other.getLambdaVersion() == null ^ this.getLambdaVersion() == null)
            return false;
        if (other.getLambdaVersion() != null
                && other.getLambdaVersion().equals(this.getLambdaVersion()) == false)
            return false;
        if (other.getLambdaArn() == null ^ this.getLambdaArn() == null)
            return false;
        if (other.getLambdaArn() != null
                && other.getLambdaArn().equals(this.getLambdaArn()) == false)
            return false;
        return true;
    }
}
