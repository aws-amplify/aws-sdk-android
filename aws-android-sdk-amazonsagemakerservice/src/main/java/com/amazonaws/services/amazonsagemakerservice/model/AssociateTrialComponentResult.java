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

public class AssociateTrialComponentResult implements Serializable {
    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment
     * -trial-component/.*<br/>
     */
    private String trialComponentArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     */
    private String trialArn;

    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment
     * -trial-component/.*<br/>
     *
     * @return <p>
     *         The ARN of the trial component.
     *         </p>
     */
    public String getTrialComponentArn() {
        return trialComponentArn;
    }

    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment
     * -trial-component/.*<br/>
     *
     * @param trialComponentArn <p>
     *            The ARN of the trial component.
     *            </p>
     */
    public void setTrialComponentArn(String trialComponentArn) {
        this.trialComponentArn = trialComponentArn;
    }

    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment
     * -trial-component/.*<br/>
     *
     * @param trialComponentArn <p>
     *            The ARN of the trial component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateTrialComponentResult withTrialComponentArn(String trialComponentArn) {
        this.trialComponentArn = trialComponentArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the trial.
     *         </p>
     */
    public String getTrialArn() {
        return trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     *
     * @param trialArn <p>
     *            The Amazon Resource Name (ARN) of the trial.
     *            </p>
     */
    public void setTrialArn(String trialArn) {
        this.trialArn = trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     *
     * @param trialArn <p>
     *            The Amazon Resource Name (ARN) of the trial.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateTrialComponentResult withTrialArn(String trialArn) {
        this.trialArn = trialArn;
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
        if (getTrialComponentArn() != null)
            sb.append("TrialComponentArn: " + getTrialComponentArn() + ",");
        if (getTrialArn() != null)
            sb.append("TrialArn: " + getTrialArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrialComponentArn() == null) ? 0 : getTrialComponentArn().hashCode());
        hashCode = prime * hashCode + ((getTrialArn() == null) ? 0 : getTrialArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateTrialComponentResult == false)
            return false;
        AssociateTrialComponentResult other = (AssociateTrialComponentResult) obj;

        if (other.getTrialComponentArn() == null ^ this.getTrialComponentArn() == null)
            return false;
        if (other.getTrialComponentArn() != null
                && other.getTrialComponentArn().equals(this.getTrialComponentArn()) == false)
            return false;
        if (other.getTrialArn() == null ^ this.getTrialArn() == null)
            return false;
        if (other.getTrialArn() != null && other.getTrialArn().equals(this.getTrialArn()) == false)
            return false;
        return true;
    }
}
