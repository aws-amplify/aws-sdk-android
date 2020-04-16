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
 * A single resource returned as part of the <a>Search</a> API response.
 * </p>
 */
public class SearchRecord implements Serializable {
    /**
     * <p>
     * The properties of a training job.
     * </p>
     */
    private TrainingJob trainingJob;

    /**
     * <p>
     * The properties of an experiment.
     * </p>
     */
    private Experiment experiment;

    /**
     * <p>
     * The properties of a trial.
     * </p>
     */
    private Trial trial;

    /**
     * <p>
     * The properties of a trial component.
     * </p>
     */
    private TrialComponent trialComponent;

    /**
     * <p>
     * The properties of a training job.
     * </p>
     *
     * @return <p>
     *         The properties of a training job.
     *         </p>
     */
    public TrainingJob getTrainingJob() {
        return trainingJob;
    }

    /**
     * <p>
     * The properties of a training job.
     * </p>
     *
     * @param trainingJob <p>
     *            The properties of a training job.
     *            </p>
     */
    public void setTrainingJob(TrainingJob trainingJob) {
        this.trainingJob = trainingJob;
    }

    /**
     * <p>
     * The properties of a training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingJob <p>
     *            The properties of a training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRecord withTrainingJob(TrainingJob trainingJob) {
        this.trainingJob = trainingJob;
        return this;
    }

    /**
     * <p>
     * The properties of an experiment.
     * </p>
     *
     * @return <p>
     *         The properties of an experiment.
     *         </p>
     */
    public Experiment getExperiment() {
        return experiment;
    }

    /**
     * <p>
     * The properties of an experiment.
     * </p>
     *
     * @param experiment <p>
     *            The properties of an experiment.
     *            </p>
     */
    public void setExperiment(Experiment experiment) {
        this.experiment = experiment;
    }

    /**
     * <p>
     * The properties of an experiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param experiment <p>
     *            The properties of an experiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRecord withExperiment(Experiment experiment) {
        this.experiment = experiment;
        return this;
    }

    /**
     * <p>
     * The properties of a trial.
     * </p>
     *
     * @return <p>
     *         The properties of a trial.
     *         </p>
     */
    public Trial getTrial() {
        return trial;
    }

    /**
     * <p>
     * The properties of a trial.
     * </p>
     *
     * @param trial <p>
     *            The properties of a trial.
     *            </p>
     */
    public void setTrial(Trial trial) {
        this.trial = trial;
    }

    /**
     * <p>
     * The properties of a trial.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trial <p>
     *            The properties of a trial.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRecord withTrial(Trial trial) {
        this.trial = trial;
        return this;
    }

    /**
     * <p>
     * The properties of a trial component.
     * </p>
     *
     * @return <p>
     *         The properties of a trial component.
     *         </p>
     */
    public TrialComponent getTrialComponent() {
        return trialComponent;
    }

    /**
     * <p>
     * The properties of a trial component.
     * </p>
     *
     * @param trialComponent <p>
     *            The properties of a trial component.
     *            </p>
     */
    public void setTrialComponent(TrialComponent trialComponent) {
        this.trialComponent = trialComponent;
    }

    /**
     * <p>
     * The properties of a trial component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trialComponent <p>
     *            The properties of a trial component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRecord withTrialComponent(TrialComponent trialComponent) {
        this.trialComponent = trialComponent;
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
        if (getTrainingJob() != null)
            sb.append("TrainingJob: " + getTrainingJob() + ",");
        if (getExperiment() != null)
            sb.append("Experiment: " + getExperiment() + ",");
        if (getTrial() != null)
            sb.append("Trial: " + getTrial() + ",");
        if (getTrialComponent() != null)
            sb.append("TrialComponent: " + getTrialComponent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrainingJob() == null) ? 0 : getTrainingJob().hashCode());
        hashCode = prime * hashCode + ((getExperiment() == null) ? 0 : getExperiment().hashCode());
        hashCode = prime * hashCode + ((getTrial() == null) ? 0 : getTrial().hashCode());
        hashCode = prime * hashCode
                + ((getTrialComponent() == null) ? 0 : getTrialComponent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchRecord == false)
            return false;
        SearchRecord other = (SearchRecord) obj;

        if (other.getTrainingJob() == null ^ this.getTrainingJob() == null)
            return false;
        if (other.getTrainingJob() != null
                && other.getTrainingJob().equals(this.getTrainingJob()) == false)
            return false;
        if (other.getExperiment() == null ^ this.getExperiment() == null)
            return false;
        if (other.getExperiment() != null
                && other.getExperiment().equals(this.getExperiment()) == false)
            return false;
        if (other.getTrial() == null ^ this.getTrial() == null)
            return false;
        if (other.getTrial() != null && other.getTrial().equals(this.getTrial()) == false)
            return false;
        if (other.getTrialComponent() == null ^ this.getTrialComponent() == null)
            return false;
        if (other.getTrialComponent() != null
                && other.getTrialComponent().equals(this.getTrialComponent()) == false)
            return false;
        return true;
    }
}
