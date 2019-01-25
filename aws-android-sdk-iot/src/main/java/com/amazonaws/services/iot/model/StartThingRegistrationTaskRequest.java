/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a bulk thing provisioning task.
 * </p>
 */
public class StartThingRegistrationTaskRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The provisioning template.
     * </p>
     */
    private String templateBody;

    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     */
    private String inputFileBucket;

    /**
     * <p>
     * The name of input file within the S3 bucket. This file contains a newline
     * delimited JSON file. Each line contains the parameter values to provision
     * one device (thing).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9!_.*'()-\/]+<br/>
     */
    private String inputFileKey;

    /**
     * <p>
     * The IAM role ARN that grants permission the input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The provisioning template.
     * </p>
     *
     * @return <p>
     *         The provisioning template.
     *         </p>
     */
    public String getTemplateBody() {
        return templateBody;
    }

    /**
     * <p>
     * The provisioning template.
     * </p>
     *
     * @param templateBody <p>
     *            The provisioning template.
     *            </p>
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The provisioning template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateBody <p>
     *            The provisioning template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartThingRegistrationTaskRequest withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @return <p>
     *         The S3 bucket that contains the input file.
     *         </p>
     */
    public String getInputFileBucket() {
        return inputFileBucket;
    }

    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @param inputFileBucket <p>
     *            The S3 bucket that contains the input file.
     *            </p>
     */
    public void setInputFileBucket(String inputFileBucket) {
        this.inputFileBucket = inputFileBucket;
    }

    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @param inputFileBucket <p>
     *            The S3 bucket that contains the input file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartThingRegistrationTaskRequest withInputFileBucket(String inputFileBucket) {
        this.inputFileBucket = inputFileBucket;
        return this;
    }

    /**
     * <p>
     * The name of input file within the S3 bucket. This file contains a newline
     * delimited JSON file. Each line contains the parameter values to provision
     * one device (thing).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9!_.*'()-\/]+<br/>
     *
     * @return <p>
     *         The name of input file within the S3 bucket. This file contains a
     *         newline delimited JSON file. Each line contains the parameter
     *         values to provision one device (thing).
     *         </p>
     */
    public String getInputFileKey() {
        return inputFileKey;
    }

    /**
     * <p>
     * The name of input file within the S3 bucket. This file contains a newline
     * delimited JSON file. Each line contains the parameter values to provision
     * one device (thing).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9!_.*'()-\/]+<br/>
     *
     * @param inputFileKey <p>
     *            The name of input file within the S3 bucket. This file
     *            contains a newline delimited JSON file. Each line contains the
     *            parameter values to provision one device (thing).
     *            </p>
     */
    public void setInputFileKey(String inputFileKey) {
        this.inputFileKey = inputFileKey;
    }

    /**
     * <p>
     * The name of input file within the S3 bucket. This file contains a newline
     * delimited JSON file. Each line contains the parameter values to provision
     * one device (thing).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9!_.*'()-\/]+<br/>
     *
     * @param inputFileKey <p>
     *            The name of input file within the S3 bucket. This file
     *            contains a newline delimited JSON file. Each line contains the
     *            parameter values to provision one device (thing).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartThingRegistrationTaskRequest withInputFileKey(String inputFileKey) {
        this.inputFileKey = inputFileKey;
        return this;
    }

    /**
     * <p>
     * The IAM role ARN that grants permission the input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The IAM role ARN that grants permission the input file.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The IAM role ARN that grants permission the input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The IAM role ARN that grants permission the input file.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role ARN that grants permission the input file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The IAM role ARN that grants permission the input file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartThingRegistrationTaskRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getTemplateBody() != null)
            sb.append("templateBody: " + getTemplateBody() + ",");
        if (getInputFileBucket() != null)
            sb.append("inputFileBucket: " + getInputFileBucket() + ",");
        if (getInputFileKey() != null)
            sb.append("inputFileKey: " + getInputFileKey() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode
                + ((getInputFileBucket() == null) ? 0 : getInputFileBucket().hashCode());
        hashCode = prime * hashCode
                + ((getInputFileKey() == null) ? 0 : getInputFileKey().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartThingRegistrationTaskRequest == false)
            return false;
        StartThingRegistrationTaskRequest other = (StartThingRegistrationTaskRequest) obj;

        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null
                && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getInputFileBucket() == null ^ this.getInputFileBucket() == null)
            return false;
        if (other.getInputFileBucket() != null
                && other.getInputFileBucket().equals(this.getInputFileBucket()) == false)
            return false;
        if (other.getInputFileKey() == null ^ this.getInputFileKey() == null)
            return false;
        if (other.getInputFileKey() != null
                && other.getInputFileKey().equals(this.getInputFileKey()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
