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
 * Defines under what conditions SageMaker creates a human loop. Used within .
 * See for the required format of activation conditions.
 * </p>
 */
public class HumanLoopActivationConditionsConfig implements Serializable {
    /**
     * <p>
     * JSON expressing use-case specific conditions declaratively. If any
     * condition is matched, atomic tasks are created against the configured
     * work team. The set of conditions is different for Rekognition and
     * Textract. For more information about how to structure the JSON, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-human-fallback-conditions-json-schema.html"
     * >JSON Schema for Human Loop Activation Conditions in Amazon Augmented
     * AI</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     */
    private String humanLoopActivationConditions;

    /**
     * <p>
     * JSON expressing use-case specific conditions declaratively. If any
     * condition is matched, atomic tasks are created against the configured
     * work team. The set of conditions is different for Rekognition and
     * Textract. For more information about how to structure the JSON, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-human-fallback-conditions-json-schema.html"
     * >JSON Schema for Human Loop Activation Conditions in Amazon Augmented
     * AI</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @return <p>
     *         JSON expressing use-case specific conditions declaratively. If
     *         any condition is matched, atomic tasks are created against the
     *         configured work team. The set of conditions is different for
     *         Rekognition and Textract. For more information about how to
     *         structure the JSON, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-human-fallback-conditions-json-schema.html"
     *         >JSON Schema for Human Loop Activation Conditions in Amazon
     *         Augmented AI</a> in the <i>Amazon SageMaker Developer Guide</i>.
     *         </p>
     */
    public String getHumanLoopActivationConditions() {
        return humanLoopActivationConditions;
    }

    /**
     * <p>
     * JSON expressing use-case specific conditions declaratively. If any
     * condition is matched, atomic tasks are created against the configured
     * work team. The set of conditions is different for Rekognition and
     * Textract. For more information about how to structure the JSON, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-human-fallback-conditions-json-schema.html"
     * >JSON Schema for Human Loop Activation Conditions in Amazon Augmented
     * AI</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @param humanLoopActivationConditions <p>
     *            JSON expressing use-case specific conditions declaratively. If
     *            any condition is matched, atomic tasks are created against the
     *            configured work team. The set of conditions is different for
     *            Rekognition and Textract. For more information about how to
     *            structure the JSON, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-human-fallback-conditions-json-schema.html"
     *            >JSON Schema for Human Loop Activation Conditions in Amazon
     *            Augmented AI</a> in the <i>Amazon SageMaker Developer
     *            Guide</i>.
     *            </p>
     */
    public void setHumanLoopActivationConditions(String humanLoopActivationConditions) {
        this.humanLoopActivationConditions = humanLoopActivationConditions;
    }

    /**
     * <p>
     * JSON expressing use-case specific conditions declaratively. If any
     * condition is matched, atomic tasks are created against the configured
     * work team. The set of conditions is different for Rekognition and
     * Textract. For more information about how to structure the JSON, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-human-fallback-conditions-json-schema.html"
     * >JSON Schema for Human Loop Activation Conditions in Amazon Augmented
     * AI</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @param humanLoopActivationConditions <p>
     *            JSON expressing use-case specific conditions declaratively. If
     *            any condition is matched, atomic tasks are created against the
     *            configured work team. The set of conditions is different for
     *            Rekognition and Textract. For more information about how to
     *            structure the JSON, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-human-fallback-conditions-json-schema.html"
     *            >JSON Schema for Human Loop Activation Conditions in Amazon
     *            Augmented AI</a> in the <i>Amazon SageMaker Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopActivationConditionsConfig withHumanLoopActivationConditions(
            String humanLoopActivationConditions) {
        this.humanLoopActivationConditions = humanLoopActivationConditions;
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
        if (getHumanLoopActivationConditions() != null)
            sb.append("HumanLoopActivationConditions: " + getHumanLoopActivationConditions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHumanLoopActivationConditions() == null) ? 0
                        : getHumanLoopActivationConditions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopActivationConditionsConfig == false)
            return false;
        HumanLoopActivationConditionsConfig other = (HumanLoopActivationConditionsConfig) obj;

        if (other.getHumanLoopActivationConditions() == null
                ^ this.getHumanLoopActivationConditions() == null)
            return false;
        if (other.getHumanLoopActivationConditions() != null
                && other.getHumanLoopActivationConditions().equals(
                        this.getHumanLoopActivationConditions()) == false)
            return false;
        return true;
    }
}
