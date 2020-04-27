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

public class UpdateExperimentResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment/.*<br/>
     */
    private String experimentArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the experiment.
     *         </p>
     */
    public String getExperimentArn() {
        return experimentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment/.*<br/>
     *
     * @param experimentArn <p>
     *            The Amazon Resource Name (ARN) of the experiment.
     *            </p>
     */
    public void setExperimentArn(String experimentArn) {
        this.experimentArn = experimentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment/.*<br/>
     *
     * @param experimentArn <p>
     *            The Amazon Resource Name (ARN) of the experiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateExperimentResult withExperimentArn(String experimentArn) {
        this.experimentArn = experimentArn;
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
        if (getExperimentArn() != null)
            sb.append("ExperimentArn: " + getExperimentArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExperimentArn() == null) ? 0 : getExperimentArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateExperimentResult == false)
            return false;
        UpdateExperimentResult other = (UpdateExperimentResult) obj;

        if (other.getExperimentArn() == null ^ this.getExperimentArn() == null)
            return false;
        if (other.getExperimentArn() != null
                && other.getExperimentArn().equals(this.getExperimentArn()) == false)
            return false;
        return true;
    }
}
