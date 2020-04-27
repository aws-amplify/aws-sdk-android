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
 * Specifies the configuration for a hyperparameter tuning job that uses one or
 * more previous hyperparameter tuning jobs as a starting point. The results of
 * previous tuning jobs are used to inform which combinations of hyperparameters
 * to search over in the new tuning job.
 * </p>
 * <p>
 * All training jobs launched by the new hyperparameter tuning job are evaluated
 * by using the objective metric, and the training job that performs the best is
 * compared to the best training jobs from the parent tuning jobs. From these,
 * the training job that performs the best as measured by the objective metric
 * is returned as the overall best training job.
 * </p>
 * <note>
 * <p>
 * All training jobs launched by parent hyperparameter tuning jobs and the new
 * hyperparameter tuning jobs count against the limit of training jobs for the
 * tuning job.
 * </p>
 * </note>
 */
public class HyperParameterTuningJobWarmStartConfig implements Serializable {
    /**
     * <p>
     * An array of hyperparameter tuning jobs that are used as the starting
     * point for the new hyperparameter tuning job. For more information about
     * warm starting a hyperparameter tuning job, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-warm-start.html"
     * >Using a Previous Hyperparameter Tuning Job as a Starting Point</a>.
     * </p>
     * <p>
     * Hyperparameter tuning jobs created before October 1, 2018 cannot be used
     * as parent jobs for warm start tuning jobs.
     * </p>
     */
    private java.util.List<ParentHyperParameterTuningJob> parentHyperParameterTuningJobs;

    /**
     * <p>
     * Specifies one of the following:
     * </p>
     * <dl>
     * <dt>IDENTICAL_DATA_AND_ALGORITHM</dt>
     * <dd>
     * <p>
     * The new hyperparameter tuning job uses the same input data and training
     * image as the parent tuning jobs. You can change the hyperparameter ranges
     * to search and the maximum number of training jobs that the hyperparameter
     * tuning job launches. You cannot use a new version of the training
     * algorithm, unless the changes in the new version do not affect the
     * algorithm itself. For example, changes that improve logging or adding
     * support for a different data format are allowed. You can also change
     * hyperparameters from tunable to static, and from static to tunable, but
     * the total number of static plus tunable hyperparameters must remain the
     * same as it is in all parent jobs. The objective metric for the new tuning
     * job must be the same as for all parent jobs.
     * </p>
     * </dd>
     * <dt>TRANSFER_LEARNING</dt>
     * <dd>
     * <p>
     * The new hyperparameter tuning job can include input data, hyperparameter
     * ranges, maximum number of concurrent training jobs, and maximum number of
     * training jobs that are different than those of its parent hyperparameter
     * tuning jobs. The training image can also be a different version from the
     * version used in the parent hyperparameter tuning job. You can also change
     * hyperparameters from tunable to static, and from static to tunable, but
     * the total number of static plus tunable hyperparameters must remain the
     * same as it is in all parent jobs. The objective metric for the new tuning
     * job must be the same as for all parent jobs.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IdenticalDataAndAlgorithm, TransferLearning
     */
    private String warmStartType;

    /**
     * <p>
     * An array of hyperparameter tuning jobs that are used as the starting
     * point for the new hyperparameter tuning job. For more information about
     * warm starting a hyperparameter tuning job, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-warm-start.html"
     * >Using a Previous Hyperparameter Tuning Job as a Starting Point</a>.
     * </p>
     * <p>
     * Hyperparameter tuning jobs created before October 1, 2018 cannot be used
     * as parent jobs for warm start tuning jobs.
     * </p>
     *
     * @return <p>
     *         An array of hyperparameter tuning jobs that are used as the
     *         starting point for the new hyperparameter tuning job. For more
     *         information about warm starting a hyperparameter tuning job, see
     *         <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-warm-start.html"
     *         >Using a Previous Hyperparameter Tuning Job as a Starting
     *         Point</a>.
     *         </p>
     *         <p>
     *         Hyperparameter tuning jobs created before October 1, 2018 cannot
     *         be used as parent jobs for warm start tuning jobs.
     *         </p>
     */
    public java.util.List<ParentHyperParameterTuningJob> getParentHyperParameterTuningJobs() {
        return parentHyperParameterTuningJobs;
    }

    /**
     * <p>
     * An array of hyperparameter tuning jobs that are used as the starting
     * point for the new hyperparameter tuning job. For more information about
     * warm starting a hyperparameter tuning job, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-warm-start.html"
     * >Using a Previous Hyperparameter Tuning Job as a Starting Point</a>.
     * </p>
     * <p>
     * Hyperparameter tuning jobs created before October 1, 2018 cannot be used
     * as parent jobs for warm start tuning jobs.
     * </p>
     *
     * @param parentHyperParameterTuningJobs <p>
     *            An array of hyperparameter tuning jobs that are used as the
     *            starting point for the new hyperparameter tuning job. For more
     *            information about warm starting a hyperparameter tuning job,
     *            see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-warm-start.html"
     *            >Using a Previous Hyperparameter Tuning Job as a Starting
     *            Point</a>.
     *            </p>
     *            <p>
     *            Hyperparameter tuning jobs created before October 1, 2018
     *            cannot be used as parent jobs for warm start tuning jobs.
     *            </p>
     */
    public void setParentHyperParameterTuningJobs(
            java.util.Collection<ParentHyperParameterTuningJob> parentHyperParameterTuningJobs) {
        if (parentHyperParameterTuningJobs == null) {
            this.parentHyperParameterTuningJobs = null;
            return;
        }

        this.parentHyperParameterTuningJobs = new java.util.ArrayList<ParentHyperParameterTuningJob>(
                parentHyperParameterTuningJobs);
    }

    /**
     * <p>
     * An array of hyperparameter tuning jobs that are used as the starting
     * point for the new hyperparameter tuning job. For more information about
     * warm starting a hyperparameter tuning job, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-warm-start.html"
     * >Using a Previous Hyperparameter Tuning Job as a Starting Point</a>.
     * </p>
     * <p>
     * Hyperparameter tuning jobs created before October 1, 2018 cannot be used
     * as parent jobs for warm start tuning jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentHyperParameterTuningJobs <p>
     *            An array of hyperparameter tuning jobs that are used as the
     *            starting point for the new hyperparameter tuning job. For more
     *            information about warm starting a hyperparameter tuning job,
     *            see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-warm-start.html"
     *            >Using a Previous Hyperparameter Tuning Job as a Starting
     *            Point</a>.
     *            </p>
     *            <p>
     *            Hyperparameter tuning jobs created before October 1, 2018
     *            cannot be used as parent jobs for warm start tuning jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTuningJobWarmStartConfig withParentHyperParameterTuningJobs(
            ParentHyperParameterTuningJob... parentHyperParameterTuningJobs) {
        if (getParentHyperParameterTuningJobs() == null) {
            this.parentHyperParameterTuningJobs = new java.util.ArrayList<ParentHyperParameterTuningJob>(
                    parentHyperParameterTuningJobs.length);
        }
        for (ParentHyperParameterTuningJob value : parentHyperParameterTuningJobs) {
            this.parentHyperParameterTuningJobs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of hyperparameter tuning jobs that are used as the starting
     * point for the new hyperparameter tuning job. For more information about
     * warm starting a hyperparameter tuning job, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-warm-start.html"
     * >Using a Previous Hyperparameter Tuning Job as a Starting Point</a>.
     * </p>
     * <p>
     * Hyperparameter tuning jobs created before October 1, 2018 cannot be used
     * as parent jobs for warm start tuning jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentHyperParameterTuningJobs <p>
     *            An array of hyperparameter tuning jobs that are used as the
     *            starting point for the new hyperparameter tuning job. For more
     *            information about warm starting a hyperparameter tuning job,
     *            see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-warm-start.html"
     *            >Using a Previous Hyperparameter Tuning Job as a Starting
     *            Point</a>.
     *            </p>
     *            <p>
     *            Hyperparameter tuning jobs created before October 1, 2018
     *            cannot be used as parent jobs for warm start tuning jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTuningJobWarmStartConfig withParentHyperParameterTuningJobs(
            java.util.Collection<ParentHyperParameterTuningJob> parentHyperParameterTuningJobs) {
        setParentHyperParameterTuningJobs(parentHyperParameterTuningJobs);
        return this;
    }

    /**
     * <p>
     * Specifies one of the following:
     * </p>
     * <dl>
     * <dt>IDENTICAL_DATA_AND_ALGORITHM</dt>
     * <dd>
     * <p>
     * The new hyperparameter tuning job uses the same input data and training
     * image as the parent tuning jobs. You can change the hyperparameter ranges
     * to search and the maximum number of training jobs that the hyperparameter
     * tuning job launches. You cannot use a new version of the training
     * algorithm, unless the changes in the new version do not affect the
     * algorithm itself. For example, changes that improve logging or adding
     * support for a different data format are allowed. You can also change
     * hyperparameters from tunable to static, and from static to tunable, but
     * the total number of static plus tunable hyperparameters must remain the
     * same as it is in all parent jobs. The objective metric for the new tuning
     * job must be the same as for all parent jobs.
     * </p>
     * </dd>
     * <dt>TRANSFER_LEARNING</dt>
     * <dd>
     * <p>
     * The new hyperparameter tuning job can include input data, hyperparameter
     * ranges, maximum number of concurrent training jobs, and maximum number of
     * training jobs that are different than those of its parent hyperparameter
     * tuning jobs. The training image can also be a different version from the
     * version used in the parent hyperparameter tuning job. You can also change
     * hyperparameters from tunable to static, and from static to tunable, but
     * the total number of static plus tunable hyperparameters must remain the
     * same as it is in all parent jobs. The objective metric for the new tuning
     * job must be the same as for all parent jobs.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IdenticalDataAndAlgorithm, TransferLearning
     *
     * @return <p>
     *         Specifies one of the following:
     *         </p>
     *         <dl>
     *         <dt>IDENTICAL_DATA_AND_ALGORITHM</dt>
     *         <dd>
     *         <p>
     *         The new hyperparameter tuning job uses the same input data and
     *         training image as the parent tuning jobs. You can change the
     *         hyperparameter ranges to search and the maximum number of
     *         training jobs that the hyperparameter tuning job launches. You
     *         cannot use a new version of the training algorithm, unless the
     *         changes in the new version do not affect the algorithm itself.
     *         For example, changes that improve logging or adding support for a
     *         different data format are allowed. You can also change
     *         hyperparameters from tunable to static, and from static to
     *         tunable, but the total number of static plus tunable
     *         hyperparameters must remain the same as it is in all parent jobs.
     *         The objective metric for the new tuning job must be the same as
     *         for all parent jobs.
     *         </p>
     *         </dd>
     *         <dt>TRANSFER_LEARNING</dt>
     *         <dd>
     *         <p>
     *         The new hyperparameter tuning job can include input data,
     *         hyperparameter ranges, maximum number of concurrent training
     *         jobs, and maximum number of training jobs that are different than
     *         those of its parent hyperparameter tuning jobs. The training
     *         image can also be a different version from the version used in
     *         the parent hyperparameter tuning job. You can also change
     *         hyperparameters from tunable to static, and from static to
     *         tunable, but the total number of static plus tunable
     *         hyperparameters must remain the same as it is in all parent jobs.
     *         The objective metric for the new tuning job must be the same as
     *         for all parent jobs.
     *         </p>
     *         </dd>
     *         </dl>
     * @see HyperParameterTuningJobWarmStartType
     */
    public String getWarmStartType() {
        return warmStartType;
    }

    /**
     * <p>
     * Specifies one of the following:
     * </p>
     * <dl>
     * <dt>IDENTICAL_DATA_AND_ALGORITHM</dt>
     * <dd>
     * <p>
     * The new hyperparameter tuning job uses the same input data and training
     * image as the parent tuning jobs. You can change the hyperparameter ranges
     * to search and the maximum number of training jobs that the hyperparameter
     * tuning job launches. You cannot use a new version of the training
     * algorithm, unless the changes in the new version do not affect the
     * algorithm itself. For example, changes that improve logging or adding
     * support for a different data format are allowed. You can also change
     * hyperparameters from tunable to static, and from static to tunable, but
     * the total number of static plus tunable hyperparameters must remain the
     * same as it is in all parent jobs. The objective metric for the new tuning
     * job must be the same as for all parent jobs.
     * </p>
     * </dd>
     * <dt>TRANSFER_LEARNING</dt>
     * <dd>
     * <p>
     * The new hyperparameter tuning job can include input data, hyperparameter
     * ranges, maximum number of concurrent training jobs, and maximum number of
     * training jobs that are different than those of its parent hyperparameter
     * tuning jobs. The training image can also be a different version from the
     * version used in the parent hyperparameter tuning job. You can also change
     * hyperparameters from tunable to static, and from static to tunable, but
     * the total number of static plus tunable hyperparameters must remain the
     * same as it is in all parent jobs. The objective metric for the new tuning
     * job must be the same as for all parent jobs.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IdenticalDataAndAlgorithm, TransferLearning
     *
     * @param warmStartType <p>
     *            Specifies one of the following:
     *            </p>
     *            <dl>
     *            <dt>IDENTICAL_DATA_AND_ALGORITHM</dt>
     *            <dd>
     *            <p>
     *            The new hyperparameter tuning job uses the same input data and
     *            training image as the parent tuning jobs. You can change the
     *            hyperparameter ranges to search and the maximum number of
     *            training jobs that the hyperparameter tuning job launches. You
     *            cannot use a new version of the training algorithm, unless the
     *            changes in the new version do not affect the algorithm itself.
     *            For example, changes that improve logging or adding support
     *            for a different data format are allowed. You can also change
     *            hyperparameters from tunable to static, and from static to
     *            tunable, but the total number of static plus tunable
     *            hyperparameters must remain the same as it is in all parent
     *            jobs. The objective metric for the new tuning job must be the
     *            same as for all parent jobs.
     *            </p>
     *            </dd>
     *            <dt>TRANSFER_LEARNING</dt>
     *            <dd>
     *            <p>
     *            The new hyperparameter tuning job can include input data,
     *            hyperparameter ranges, maximum number of concurrent training
     *            jobs, and maximum number of training jobs that are different
     *            than those of its parent hyperparameter tuning jobs. The
     *            training image can also be a different version from the
     *            version used in the parent hyperparameter tuning job. You can
     *            also change hyperparameters from tunable to static, and from
     *            static to tunable, but the total number of static plus tunable
     *            hyperparameters must remain the same as it is in all parent
     *            jobs. The objective metric for the new tuning job must be the
     *            same as for all parent jobs.
     *            </p>
     *            </dd>
     *            </dl>
     * @see HyperParameterTuningJobWarmStartType
     */
    public void setWarmStartType(String warmStartType) {
        this.warmStartType = warmStartType;
    }

    /**
     * <p>
     * Specifies one of the following:
     * </p>
     * <dl>
     * <dt>IDENTICAL_DATA_AND_ALGORITHM</dt>
     * <dd>
     * <p>
     * The new hyperparameter tuning job uses the same input data and training
     * image as the parent tuning jobs. You can change the hyperparameter ranges
     * to search and the maximum number of training jobs that the hyperparameter
     * tuning job launches. You cannot use a new version of the training
     * algorithm, unless the changes in the new version do not affect the
     * algorithm itself. For example, changes that improve logging or adding
     * support for a different data format are allowed. You can also change
     * hyperparameters from tunable to static, and from static to tunable, but
     * the total number of static plus tunable hyperparameters must remain the
     * same as it is in all parent jobs. The objective metric for the new tuning
     * job must be the same as for all parent jobs.
     * </p>
     * </dd>
     * <dt>TRANSFER_LEARNING</dt>
     * <dd>
     * <p>
     * The new hyperparameter tuning job can include input data, hyperparameter
     * ranges, maximum number of concurrent training jobs, and maximum number of
     * training jobs that are different than those of its parent hyperparameter
     * tuning jobs. The training image can also be a different version from the
     * version used in the parent hyperparameter tuning job. You can also change
     * hyperparameters from tunable to static, and from static to tunable, but
     * the total number of static plus tunable hyperparameters must remain the
     * same as it is in all parent jobs. The objective metric for the new tuning
     * job must be the same as for all parent jobs.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IdenticalDataAndAlgorithm, TransferLearning
     *
     * @param warmStartType <p>
     *            Specifies one of the following:
     *            </p>
     *            <dl>
     *            <dt>IDENTICAL_DATA_AND_ALGORITHM</dt>
     *            <dd>
     *            <p>
     *            The new hyperparameter tuning job uses the same input data and
     *            training image as the parent tuning jobs. You can change the
     *            hyperparameter ranges to search and the maximum number of
     *            training jobs that the hyperparameter tuning job launches. You
     *            cannot use a new version of the training algorithm, unless the
     *            changes in the new version do not affect the algorithm itself.
     *            For example, changes that improve logging or adding support
     *            for a different data format are allowed. You can also change
     *            hyperparameters from tunable to static, and from static to
     *            tunable, but the total number of static plus tunable
     *            hyperparameters must remain the same as it is in all parent
     *            jobs. The objective metric for the new tuning job must be the
     *            same as for all parent jobs.
     *            </p>
     *            </dd>
     *            <dt>TRANSFER_LEARNING</dt>
     *            <dd>
     *            <p>
     *            The new hyperparameter tuning job can include input data,
     *            hyperparameter ranges, maximum number of concurrent training
     *            jobs, and maximum number of training jobs that are different
     *            than those of its parent hyperparameter tuning jobs. The
     *            training image can also be a different version from the
     *            version used in the parent hyperparameter tuning job. You can
     *            also change hyperparameters from tunable to static, and from
     *            static to tunable, but the total number of static plus tunable
     *            hyperparameters must remain the same as it is in all parent
     *            jobs. The objective metric for the new tuning job must be the
     *            same as for all parent jobs.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HyperParameterTuningJobWarmStartType
     */
    public HyperParameterTuningJobWarmStartConfig withWarmStartType(String warmStartType) {
        this.warmStartType = warmStartType;
        return this;
    }

    /**
     * <p>
     * Specifies one of the following:
     * </p>
     * <dl>
     * <dt>IDENTICAL_DATA_AND_ALGORITHM</dt>
     * <dd>
     * <p>
     * The new hyperparameter tuning job uses the same input data and training
     * image as the parent tuning jobs. You can change the hyperparameter ranges
     * to search and the maximum number of training jobs that the hyperparameter
     * tuning job launches. You cannot use a new version of the training
     * algorithm, unless the changes in the new version do not affect the
     * algorithm itself. For example, changes that improve logging or adding
     * support for a different data format are allowed. You can also change
     * hyperparameters from tunable to static, and from static to tunable, but
     * the total number of static plus tunable hyperparameters must remain the
     * same as it is in all parent jobs. The objective metric for the new tuning
     * job must be the same as for all parent jobs.
     * </p>
     * </dd>
     * <dt>TRANSFER_LEARNING</dt>
     * <dd>
     * <p>
     * The new hyperparameter tuning job can include input data, hyperparameter
     * ranges, maximum number of concurrent training jobs, and maximum number of
     * training jobs that are different than those of its parent hyperparameter
     * tuning jobs. The training image can also be a different version from the
     * version used in the parent hyperparameter tuning job. You can also change
     * hyperparameters from tunable to static, and from static to tunable, but
     * the total number of static plus tunable hyperparameters must remain the
     * same as it is in all parent jobs. The objective metric for the new tuning
     * job must be the same as for all parent jobs.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IdenticalDataAndAlgorithm, TransferLearning
     *
     * @param warmStartType <p>
     *            Specifies one of the following:
     *            </p>
     *            <dl>
     *            <dt>IDENTICAL_DATA_AND_ALGORITHM</dt>
     *            <dd>
     *            <p>
     *            The new hyperparameter tuning job uses the same input data and
     *            training image as the parent tuning jobs. You can change the
     *            hyperparameter ranges to search and the maximum number of
     *            training jobs that the hyperparameter tuning job launches. You
     *            cannot use a new version of the training algorithm, unless the
     *            changes in the new version do not affect the algorithm itself.
     *            For example, changes that improve logging or adding support
     *            for a different data format are allowed. You can also change
     *            hyperparameters from tunable to static, and from static to
     *            tunable, but the total number of static plus tunable
     *            hyperparameters must remain the same as it is in all parent
     *            jobs. The objective metric for the new tuning job must be the
     *            same as for all parent jobs.
     *            </p>
     *            </dd>
     *            <dt>TRANSFER_LEARNING</dt>
     *            <dd>
     *            <p>
     *            The new hyperparameter tuning job can include input data,
     *            hyperparameter ranges, maximum number of concurrent training
     *            jobs, and maximum number of training jobs that are different
     *            than those of its parent hyperparameter tuning jobs. The
     *            training image can also be a different version from the
     *            version used in the parent hyperparameter tuning job. You can
     *            also change hyperparameters from tunable to static, and from
     *            static to tunable, but the total number of static plus tunable
     *            hyperparameters must remain the same as it is in all parent
     *            jobs. The objective metric for the new tuning job must be the
     *            same as for all parent jobs.
     *            </p>
     *            </dd>
     *            </dl>
     * @see HyperParameterTuningJobWarmStartType
     */
    public void setWarmStartType(HyperParameterTuningJobWarmStartType warmStartType) {
        this.warmStartType = warmStartType.toString();
    }

    /**
     * <p>
     * Specifies one of the following:
     * </p>
     * <dl>
     * <dt>IDENTICAL_DATA_AND_ALGORITHM</dt>
     * <dd>
     * <p>
     * The new hyperparameter tuning job uses the same input data and training
     * image as the parent tuning jobs. You can change the hyperparameter ranges
     * to search and the maximum number of training jobs that the hyperparameter
     * tuning job launches. You cannot use a new version of the training
     * algorithm, unless the changes in the new version do not affect the
     * algorithm itself. For example, changes that improve logging or adding
     * support for a different data format are allowed. You can also change
     * hyperparameters from tunable to static, and from static to tunable, but
     * the total number of static plus tunable hyperparameters must remain the
     * same as it is in all parent jobs. The objective metric for the new tuning
     * job must be the same as for all parent jobs.
     * </p>
     * </dd>
     * <dt>TRANSFER_LEARNING</dt>
     * <dd>
     * <p>
     * The new hyperparameter tuning job can include input data, hyperparameter
     * ranges, maximum number of concurrent training jobs, and maximum number of
     * training jobs that are different than those of its parent hyperparameter
     * tuning jobs. The training image can also be a different version from the
     * version used in the parent hyperparameter tuning job. You can also change
     * hyperparameters from tunable to static, and from static to tunable, but
     * the total number of static plus tunable hyperparameters must remain the
     * same as it is in all parent jobs. The objective metric for the new tuning
     * job must be the same as for all parent jobs.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IdenticalDataAndAlgorithm, TransferLearning
     *
     * @param warmStartType <p>
     *            Specifies one of the following:
     *            </p>
     *            <dl>
     *            <dt>IDENTICAL_DATA_AND_ALGORITHM</dt>
     *            <dd>
     *            <p>
     *            The new hyperparameter tuning job uses the same input data and
     *            training image as the parent tuning jobs. You can change the
     *            hyperparameter ranges to search and the maximum number of
     *            training jobs that the hyperparameter tuning job launches. You
     *            cannot use a new version of the training algorithm, unless the
     *            changes in the new version do not affect the algorithm itself.
     *            For example, changes that improve logging or adding support
     *            for a different data format are allowed. You can also change
     *            hyperparameters from tunable to static, and from static to
     *            tunable, but the total number of static plus tunable
     *            hyperparameters must remain the same as it is in all parent
     *            jobs. The objective metric for the new tuning job must be the
     *            same as for all parent jobs.
     *            </p>
     *            </dd>
     *            <dt>TRANSFER_LEARNING</dt>
     *            <dd>
     *            <p>
     *            The new hyperparameter tuning job can include input data,
     *            hyperparameter ranges, maximum number of concurrent training
     *            jobs, and maximum number of training jobs that are different
     *            than those of its parent hyperparameter tuning jobs. The
     *            training image can also be a different version from the
     *            version used in the parent hyperparameter tuning job. You can
     *            also change hyperparameters from tunable to static, and from
     *            static to tunable, but the total number of static plus tunable
     *            hyperparameters must remain the same as it is in all parent
     *            jobs. The objective metric for the new tuning job must be the
     *            same as for all parent jobs.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HyperParameterTuningJobWarmStartType
     */
    public HyperParameterTuningJobWarmStartConfig withWarmStartType(
            HyperParameterTuningJobWarmStartType warmStartType) {
        this.warmStartType = warmStartType.toString();
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
        if (getParentHyperParameterTuningJobs() != null)
            sb.append("ParentHyperParameterTuningJobs: " + getParentHyperParameterTuningJobs()
                    + ",");
        if (getWarmStartType() != null)
            sb.append("WarmStartType: " + getWarmStartType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getParentHyperParameterTuningJobs() == null) ? 0
                        : getParentHyperParameterTuningJobs().hashCode());
        hashCode = prime * hashCode
                + ((getWarmStartType() == null) ? 0 : getWarmStartType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterTuningJobWarmStartConfig == false)
            return false;
        HyperParameterTuningJobWarmStartConfig other = (HyperParameterTuningJobWarmStartConfig) obj;

        if (other.getParentHyperParameterTuningJobs() == null
                ^ this.getParentHyperParameterTuningJobs() == null)
            return false;
        if (other.getParentHyperParameterTuningJobs() != null
                && other.getParentHyperParameterTuningJobs().equals(
                        this.getParentHyperParameterTuningJobs()) == false)
            return false;
        if (other.getWarmStartType() == null ^ this.getWarmStartType() == null)
            return false;
        if (other.getWarmStartType() != null
                && other.getWarmStartType().equals(this.getWarmStartType()) == false)
            return false;
        return true;
    }
}
