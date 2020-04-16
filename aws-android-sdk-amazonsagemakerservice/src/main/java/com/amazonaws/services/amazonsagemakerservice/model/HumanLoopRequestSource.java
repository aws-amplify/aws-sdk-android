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

/**
 * <p>
 * Container for configuring the source of human task requests.
 * </p>
 */
public class HumanLoopRequestSource implements Serializable {
    /**
     * <p>
     * Specifies whether Amazon Rekognition or Amazon Textract are used as the
     * integration source. The default field settings and JSON parsing rules are
     * different based on the integration source. Valid values:
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS/Rekognition/DetectModerationLabels/Image/V3,
     * AWS/Textract/AnalyzeDocument/Forms/V1
     */
    private String awsManagedHumanLoopRequestSource;

    /**
     * <p>
     * Specifies whether Amazon Rekognition or Amazon Textract are used as the
     * integration source. The default field settings and JSON parsing rules are
     * different based on the integration source. Valid values:
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS/Rekognition/DetectModerationLabels/Image/V3,
     * AWS/Textract/AnalyzeDocument/Forms/V1
     *
     * @return <p>
     *         Specifies whether Amazon Rekognition or Amazon Textract are used
     *         as the integration source. The default field settings and JSON
     *         parsing rules are different based on the integration source.
     *         Valid values:
     *         </p>
     * @see AwsManagedHumanLoopRequestSource
     */
    public String getAwsManagedHumanLoopRequestSource() {
        return awsManagedHumanLoopRequestSource;
    }

    /**
     * <p>
     * Specifies whether Amazon Rekognition or Amazon Textract are used as the
     * integration source. The default field settings and JSON parsing rules are
     * different based on the integration source. Valid values:
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS/Rekognition/DetectModerationLabels/Image/V3,
     * AWS/Textract/AnalyzeDocument/Forms/V1
     *
     * @param awsManagedHumanLoopRequestSource <p>
     *            Specifies whether Amazon Rekognition or Amazon Textract are
     *            used as the integration source. The default field settings and
     *            JSON parsing rules are different based on the integration
     *            source. Valid values:
     *            </p>
     * @see AwsManagedHumanLoopRequestSource
     */
    public void setAwsManagedHumanLoopRequestSource(String awsManagedHumanLoopRequestSource) {
        this.awsManagedHumanLoopRequestSource = awsManagedHumanLoopRequestSource;
    }

    /**
     * <p>
     * Specifies whether Amazon Rekognition or Amazon Textract are used as the
     * integration source. The default field settings and JSON parsing rules are
     * different based on the integration source. Valid values:
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS/Rekognition/DetectModerationLabels/Image/V3,
     * AWS/Textract/AnalyzeDocument/Forms/V1
     *
     * @param awsManagedHumanLoopRequestSource <p>
     *            Specifies whether Amazon Rekognition or Amazon Textract are
     *            used as the integration source. The default field settings and
     *            JSON parsing rules are different based on the integration
     *            source. Valid values:
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AwsManagedHumanLoopRequestSource
     */
    public HumanLoopRequestSource withAwsManagedHumanLoopRequestSource(
            String awsManagedHumanLoopRequestSource) {
        this.awsManagedHumanLoopRequestSource = awsManagedHumanLoopRequestSource;
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon Rekognition or Amazon Textract are used as the
     * integration source. The default field settings and JSON parsing rules are
     * different based on the integration source. Valid values:
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS/Rekognition/DetectModerationLabels/Image/V3,
     * AWS/Textract/AnalyzeDocument/Forms/V1
     *
     * @param awsManagedHumanLoopRequestSource <p>
     *            Specifies whether Amazon Rekognition or Amazon Textract are
     *            used as the integration source. The default field settings and
     *            JSON parsing rules are different based on the integration
     *            source. Valid values:
     *            </p>
     * @see AwsManagedHumanLoopRequestSource
     */
    public void setAwsManagedHumanLoopRequestSource(
            AwsManagedHumanLoopRequestSource awsManagedHumanLoopRequestSource) {
        this.awsManagedHumanLoopRequestSource = awsManagedHumanLoopRequestSource.toString();
    }

    /**
     * <p>
     * Specifies whether Amazon Rekognition or Amazon Textract are used as the
     * integration source. The default field settings and JSON parsing rules are
     * different based on the integration source. Valid values:
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS/Rekognition/DetectModerationLabels/Image/V3,
     * AWS/Textract/AnalyzeDocument/Forms/V1
     *
     * @param awsManagedHumanLoopRequestSource <p>
     *            Specifies whether Amazon Rekognition or Amazon Textract are
     *            used as the integration source. The default field settings and
     *            JSON parsing rules are different based on the integration
     *            source. Valid values:
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AwsManagedHumanLoopRequestSource
     */
    public HumanLoopRequestSource withAwsManagedHumanLoopRequestSource(
            AwsManagedHumanLoopRequestSource awsManagedHumanLoopRequestSource) {
        this.awsManagedHumanLoopRequestSource = awsManagedHumanLoopRequestSource.toString();
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
        if (getAwsManagedHumanLoopRequestSource() != null)
            sb.append("AwsManagedHumanLoopRequestSource: " + getAwsManagedHumanLoopRequestSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAwsManagedHumanLoopRequestSource() == null) ? 0
                        : getAwsManagedHumanLoopRequestSource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopRequestSource == false)
            return false;
        HumanLoopRequestSource other = (HumanLoopRequestSource) obj;

        if (other.getAwsManagedHumanLoopRequestSource() == null
                ^ this.getAwsManagedHumanLoopRequestSource() == null)
            return false;
        if (other.getAwsManagedHumanLoopRequestSource() != null
                && other.getAwsManagedHumanLoopRequestSource().equals(
                        this.getAwsManagedHumanLoopRequestSource()) == false)
            return false;
        return true;
    }
}
