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
 * Specifies a metric that the training algorithm writes to <code>stderr</code>
 * or <code>stdout</code> . Amazon SageMakerhyperparameter tuning captures all
 * defined metrics. You specify one metric that a hyperparameter tuning job uses
 * as its objective metric to choose the best training job.
 * </p>
 */
public class MetricDefinition implements Serializable {
    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String name;

    /**
     * <p>
     * A regular expression that searches the output of a training job and gets
     * the value of the metric. For more information about using regular
     * expressions to define metrics, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-metrics.html"
     * >Defining Objective Metrics</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String regex;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         The name of the metric.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param name <p>
     *            The name of the metric.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param name <p>
     *            The name of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A regular expression that searches the output of a training job and gets
     * the value of the metric. For more information about using regular
     * expressions to define metrics, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-metrics.html"
     * >Defining Objective Metrics</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         A regular expression that searches the output of a training job
     *         and gets the value of the metric. For more information about
     *         using regular expressions to define metrics, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-metrics.html"
     *         >Defining Objective Metrics</a>.
     *         </p>
     */
    public String getRegex() {
        return regex;
    }

    /**
     * <p>
     * A regular expression that searches the output of a training job and gets
     * the value of the metric. For more information about using regular
     * expressions to define metrics, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-metrics.html"
     * >Defining Objective Metrics</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param regex <p>
     *            A regular expression that searches the output of a training
     *            job and gets the value of the metric. For more information
     *            about using regular expressions to define metrics, see <a
     *            href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-metrics.html"
     *            >Defining Objective Metrics</a>.
     *            </p>
     */
    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * <p>
     * A regular expression that searches the output of a training job and gets
     * the value of the metric. For more information about using regular
     * expressions to define metrics, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-metrics.html"
     * >Defining Objective Metrics</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param regex <p>
     *            A regular expression that searches the output of a training
     *            job and gets the value of the metric. For more information
     *            about using regular expressions to define metrics, see <a
     *            href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-metrics.html"
     *            >Defining Objective Metrics</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricDefinition withRegex(String regex) {
        this.regex = regex;
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
            sb.append("Name: " + getName() + ",");
        if (getRegex() != null)
            sb.append("Regex: " + getRegex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRegex() == null) ? 0 : getRegex().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDefinition == false)
            return false;
        MetricDefinition other = (MetricDefinition) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRegex() == null ^ this.getRegex() == null)
            return false;
        if (other.getRegex() != null && other.getRegex().equals(this.getRegex()) == false)
            return false;
        return true;
    }
}
