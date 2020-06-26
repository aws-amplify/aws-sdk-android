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
 * <p>Information about the steps for a Candidate, and what step it is working on.</p>
 */
public class AutoMLCandidateStep implements Serializable {
    /**
     * <p>Whether the Candidate is at the transform, training, or processing step.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::SageMaker::TrainingJob, AWS::SageMaker::TransformJob, AWS::SageMaker::ProcessingJob
     */
    private String candidateStepType;

    /**
     * <p>The ARN for the Candidate's step.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:.*/.*<br/>
     */
    private String candidateStepArn;

    /**
     * <p>The name for the Candidate's step.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String candidateStepName;

    /**
     * <p>Whether the Candidate is at the transform, training, or processing step.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::SageMaker::TrainingJob, AWS::SageMaker::TransformJob, AWS::SageMaker::ProcessingJob
     *
     * @return <p>Whether the Candidate is at the transform, training, or processing step.</p>
     *
     * @see CandidateStepType
     */
    public String getCandidateStepType() {
        return candidateStepType;
    }

    /**
     * <p>Whether the Candidate is at the transform, training, or processing step.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::SageMaker::TrainingJob, AWS::SageMaker::TransformJob, AWS::SageMaker::ProcessingJob
     *
     * @param candidateStepType <p>Whether the Candidate is at the transform, training, or processing step.</p>
     *
     * @see CandidateStepType
     */
    public void setCandidateStepType(String candidateStepType) {
        this.candidateStepType = candidateStepType;
    }

    /**
     * <p>Whether the Candidate is at the transform, training, or processing step.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::SageMaker::TrainingJob, AWS::SageMaker::TransformJob, AWS::SageMaker::ProcessingJob
     *
     * @param candidateStepType <p>Whether the Candidate is at the transform, training, or processing step.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see CandidateStepType
     */
    public AutoMLCandidateStep withCandidateStepType(String candidateStepType) {
        this.candidateStepType = candidateStepType;
        return this;
    }

    /**
     * <p>Whether the Candidate is at the transform, training, or processing step.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::SageMaker::TrainingJob, AWS::SageMaker::TransformJob, AWS::SageMaker::ProcessingJob
     *
     * @param candidateStepType <p>Whether the Candidate is at the transform, training, or processing step.</p>
     *
     * @see CandidateStepType
     */
    public void setCandidateStepType(CandidateStepType candidateStepType) {
        this.candidateStepType = candidateStepType.toString();
    }

    /**
     * <p>Whether the Candidate is at the transform, training, or processing step.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::SageMaker::TrainingJob, AWS::SageMaker::TransformJob, AWS::SageMaker::ProcessingJob
     *
     * @param candidateStepType <p>Whether the Candidate is at the transform, training, or processing step.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see CandidateStepType
     */
    public AutoMLCandidateStep withCandidateStepType(CandidateStepType candidateStepType) {
        this.candidateStepType = candidateStepType.toString();
        return this;
    }

    /**
     * <p>The ARN for the Candidate's step.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:.*/.*<br/>
     *
     * @return <p>The ARN for the Candidate's step.</p>
     */
    public String getCandidateStepArn() {
        return candidateStepArn;
    }

    /**
     * <p>The ARN for the Candidate's step.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:.*/.*<br/>
     *
     * @param candidateStepArn <p>The ARN for the Candidate's step.</p>
     */
    public void setCandidateStepArn(String candidateStepArn) {
        this.candidateStepArn = candidateStepArn;
    }

    /**
     * <p>The ARN for the Candidate's step.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:.*/.*<br/>
     *
     * @param candidateStepArn <p>The ARN for the Candidate's step.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoMLCandidateStep withCandidateStepArn(String candidateStepArn) {
        this.candidateStepArn = candidateStepArn;
        return this;
    }

    /**
     * <p>The name for the Candidate's step.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>The name for the Candidate's step.</p>
     */
    public String getCandidateStepName() {
        return candidateStepName;
    }

    /**
     * <p>The name for the Candidate's step.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param candidateStepName <p>The name for the Candidate's step.</p>
     */
    public void setCandidateStepName(String candidateStepName) {
        this.candidateStepName = candidateStepName;
    }

    /**
     * <p>The name for the Candidate's step.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param candidateStepName <p>The name for the Candidate's step.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoMLCandidateStep withCandidateStepName(String candidateStepName) {
        this.candidateStepName = candidateStepName;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCandidateStepType() != null) sb.append("CandidateStepType: " + getCandidateStepType() + ",");
        if (getCandidateStepArn() != null) sb.append("CandidateStepArn: " + getCandidateStepArn() + ",");
        if (getCandidateStepName() != null) sb.append("CandidateStepName: " + getCandidateStepName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCandidateStepType() == null) ? 0 : getCandidateStepType().hashCode());
        hashCode = prime * hashCode + ((getCandidateStepArn() == null) ? 0 : getCandidateStepArn().hashCode());
        hashCode = prime * hashCode + ((getCandidateStepName() == null) ? 0 : getCandidateStepName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AutoMLCandidateStep == false) return false;
        AutoMLCandidateStep other = (AutoMLCandidateStep)obj;

        if (other.getCandidateStepType() == null ^ this.getCandidateStepType() == null) return false;
        if (other.getCandidateStepType() != null && other.getCandidateStepType().equals(this.getCandidateStepType()) == false) return false;
        if (other.getCandidateStepArn() == null ^ this.getCandidateStepArn() == null) return false;
        if (other.getCandidateStepArn() != null && other.getCandidateStepArn().equals(this.getCandidateStepArn()) == false) return false;
        if (other.getCandidateStepName() == null ^ this.getCandidateStepName() == null) return false;
        if (other.getCandidateStepName() != null && other.getCandidateStepName().equals(this.getCandidateStepName()) == false) return false;
        return true;
    }
}
