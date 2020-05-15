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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * Structure containing the rollback triggers for AWS CloudFormation to monitor
 * during stack creation and updating operations, and for the specified
 * monitoring period afterwards.
 * </p>
 * <p>
 * Rollback triggers enable you to have AWS CloudFormation monitor the state of
 * your application during stack creation and updating, and to roll back that
 * operation if the application breaches the threshold of any of the alarms
 * you've specified. For more information, see <a href=
 * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-rollback-triggers.html"
 * >Monitor and Roll Back Stack Operations</a>.
 * </p>
 */
public class RollbackConfiguration implements Serializable {
    /**
     * <p>
     * The triggers to monitor during stack creation or update actions.
     * </p>
     * <p>
     * By default, AWS CloudFormation saves the rollback triggers specified for
     * a stack and applies them to any subsequent update operations for the
     * stack, unless you specify otherwise. If you do specify rollback triggers
     * for this parameter, those triggers replace any list of triggers
     * previously specified for the stack. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To use the rollback triggers previously specified for this stack, if any,
     * don't specify this parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * To specify new or updated rollback triggers, you must specify <i>all</i>
     * the triggers that you want used for this stack, even triggers you've
     * specifed before (for example, when creating the stack or during a
     * previous stack update). Any triggers that you don't include in the
     * updated list of triggers are no longer applied to the stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * To remove all currently specified triggers, specify an empty list for
     * this parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a specified trigger is missing, the entire stack operation fails and
     * is rolled back.
     * </p>
     */
    private java.util.List<RollbackTrigger> rollbackTriggers;

    /**
     * <p>
     * The amount of time, in minutes, during which CloudFormation should
     * monitor all the rollback triggers after the stack creation or update
     * operation deploys all necessary resources.
     * </p>
     * <p>
     * The default is 0 minutes.
     * </p>
     * <p>
     * If you specify a monitoring period but do not specify any rollback
     * triggers, CloudFormation still waits the specified period of time before
     * cleaning up old resources after update operations. You can use this
     * monitoring period to perform any manual stack validation desired, and
     * manually cancel the stack creation or update (using <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CancelUpdateStack.html"
     * >CancelUpdateStack</a>, for example) as necessary.
     * </p>
     * <p>
     * If you specify 0 for this parameter, CloudFormation still monitors the
     * specified rollback triggers during stack creation and update operations.
     * Then, for update operations, it begins disposing of old resources
     * immediately once the operation completes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 180<br/>
     */
    private Integer monitoringTimeInMinutes;

    /**
     * <p>
     * The triggers to monitor during stack creation or update actions.
     * </p>
     * <p>
     * By default, AWS CloudFormation saves the rollback triggers specified for
     * a stack and applies them to any subsequent update operations for the
     * stack, unless you specify otherwise. If you do specify rollback triggers
     * for this parameter, those triggers replace any list of triggers
     * previously specified for the stack. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To use the rollback triggers previously specified for this stack, if any,
     * don't specify this parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * To specify new or updated rollback triggers, you must specify <i>all</i>
     * the triggers that you want used for this stack, even triggers you've
     * specifed before (for example, when creating the stack or during a
     * previous stack update). Any triggers that you don't include in the
     * updated list of triggers are no longer applied to the stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * To remove all currently specified triggers, specify an empty list for
     * this parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a specified trigger is missing, the entire stack operation fails and
     * is rolled back.
     * </p>
     *
     * @return <p>
     *         The triggers to monitor during stack creation or update actions.
     *         </p>
     *         <p>
     *         By default, AWS CloudFormation saves the rollback triggers
     *         specified for a stack and applies them to any subsequent update
     *         operations for the stack, unless you specify otherwise. If you do
     *         specify rollback triggers for this parameter, those triggers
     *         replace any list of triggers previously specified for the stack.
     *         This means:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To use the rollback triggers previously specified for this stack,
     *         if any, don't specify this parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To specify new or updated rollback triggers, you must specify
     *         <i>all</i> the triggers that you want used for this stack, even
     *         triggers you've specifed before (for example, when creating the
     *         stack or during a previous stack update). Any triggers that you
     *         don't include in the updated list of triggers are no longer
     *         applied to the stack.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To remove all currently specified triggers, specify an empty list
     *         for this parameter.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If a specified trigger is missing, the entire stack operation
     *         fails and is rolled back.
     *         </p>
     */
    public java.util.List<RollbackTrigger> getRollbackTriggers() {
        return rollbackTriggers;
    }

    /**
     * <p>
     * The triggers to monitor during stack creation or update actions.
     * </p>
     * <p>
     * By default, AWS CloudFormation saves the rollback triggers specified for
     * a stack and applies them to any subsequent update operations for the
     * stack, unless you specify otherwise. If you do specify rollback triggers
     * for this parameter, those triggers replace any list of triggers
     * previously specified for the stack. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To use the rollback triggers previously specified for this stack, if any,
     * don't specify this parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * To specify new or updated rollback triggers, you must specify <i>all</i>
     * the triggers that you want used for this stack, even triggers you've
     * specifed before (for example, when creating the stack or during a
     * previous stack update). Any triggers that you don't include in the
     * updated list of triggers are no longer applied to the stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * To remove all currently specified triggers, specify an empty list for
     * this parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a specified trigger is missing, the entire stack operation fails and
     * is rolled back.
     * </p>
     *
     * @param rollbackTriggers <p>
     *            The triggers to monitor during stack creation or update
     *            actions.
     *            </p>
     *            <p>
     *            By default, AWS CloudFormation saves the rollback triggers
     *            specified for a stack and applies them to any subsequent
     *            update operations for the stack, unless you specify otherwise.
     *            If you do specify rollback triggers for this parameter, those
     *            triggers replace any list of triggers previously specified for
     *            the stack. This means:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To use the rollback triggers previously specified for this
     *            stack, if any, don't specify this parameter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To specify new or updated rollback triggers, you must specify
     *            <i>all</i> the triggers that you want used for this stack,
     *            even triggers you've specifed before (for example, when
     *            creating the stack or during a previous stack update). Any
     *            triggers that you don't include in the updated list of
     *            triggers are no longer applied to the stack.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To remove all currently specified triggers, specify an empty
     *            list for this parameter.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If a specified trigger is missing, the entire stack operation
     *            fails and is rolled back.
     *            </p>
     */
    public void setRollbackTriggers(java.util.Collection<RollbackTrigger> rollbackTriggers) {
        if (rollbackTriggers == null) {
            this.rollbackTriggers = null;
            return;
        }

        this.rollbackTriggers = new java.util.ArrayList<RollbackTrigger>(rollbackTriggers);
    }

    /**
     * <p>
     * The triggers to monitor during stack creation or update actions.
     * </p>
     * <p>
     * By default, AWS CloudFormation saves the rollback triggers specified for
     * a stack and applies them to any subsequent update operations for the
     * stack, unless you specify otherwise. If you do specify rollback triggers
     * for this parameter, those triggers replace any list of triggers
     * previously specified for the stack. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To use the rollback triggers previously specified for this stack, if any,
     * don't specify this parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * To specify new or updated rollback triggers, you must specify <i>all</i>
     * the triggers that you want used for this stack, even triggers you've
     * specifed before (for example, when creating the stack or during a
     * previous stack update). Any triggers that you don't include in the
     * updated list of triggers are no longer applied to the stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * To remove all currently specified triggers, specify an empty list for
     * this parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a specified trigger is missing, the entire stack operation fails and
     * is rolled back.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rollbackTriggers <p>
     *            The triggers to monitor during stack creation or update
     *            actions.
     *            </p>
     *            <p>
     *            By default, AWS CloudFormation saves the rollback triggers
     *            specified for a stack and applies them to any subsequent
     *            update operations for the stack, unless you specify otherwise.
     *            If you do specify rollback triggers for this parameter, those
     *            triggers replace any list of triggers previously specified for
     *            the stack. This means:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To use the rollback triggers previously specified for this
     *            stack, if any, don't specify this parameter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To specify new or updated rollback triggers, you must specify
     *            <i>all</i> the triggers that you want used for this stack,
     *            even triggers you've specifed before (for example, when
     *            creating the stack or during a previous stack update). Any
     *            triggers that you don't include in the updated list of
     *            triggers are no longer applied to the stack.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To remove all currently specified triggers, specify an empty
     *            list for this parameter.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If a specified trigger is missing, the entire stack operation
     *            fails and is rolled back.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RollbackConfiguration withRollbackTriggers(RollbackTrigger... rollbackTriggers) {
        if (getRollbackTriggers() == null) {
            this.rollbackTriggers = new java.util.ArrayList<RollbackTrigger>(
                    rollbackTriggers.length);
        }
        for (RollbackTrigger value : rollbackTriggers) {
            this.rollbackTriggers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The triggers to monitor during stack creation or update actions.
     * </p>
     * <p>
     * By default, AWS CloudFormation saves the rollback triggers specified for
     * a stack and applies them to any subsequent update operations for the
     * stack, unless you specify otherwise. If you do specify rollback triggers
     * for this parameter, those triggers replace any list of triggers
     * previously specified for the stack. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To use the rollback triggers previously specified for this stack, if any,
     * don't specify this parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * To specify new or updated rollback triggers, you must specify <i>all</i>
     * the triggers that you want used for this stack, even triggers you've
     * specifed before (for example, when creating the stack or during a
     * previous stack update). Any triggers that you don't include in the
     * updated list of triggers are no longer applied to the stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * To remove all currently specified triggers, specify an empty list for
     * this parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a specified trigger is missing, the entire stack operation fails and
     * is rolled back.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rollbackTriggers <p>
     *            The triggers to monitor during stack creation or update
     *            actions.
     *            </p>
     *            <p>
     *            By default, AWS CloudFormation saves the rollback triggers
     *            specified for a stack and applies them to any subsequent
     *            update operations for the stack, unless you specify otherwise.
     *            If you do specify rollback triggers for this parameter, those
     *            triggers replace any list of triggers previously specified for
     *            the stack. This means:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To use the rollback triggers previously specified for this
     *            stack, if any, don't specify this parameter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To specify new or updated rollback triggers, you must specify
     *            <i>all</i> the triggers that you want used for this stack,
     *            even triggers you've specifed before (for example, when
     *            creating the stack or during a previous stack update). Any
     *            triggers that you don't include in the updated list of
     *            triggers are no longer applied to the stack.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To remove all currently specified triggers, specify an empty
     *            list for this parameter.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If a specified trigger is missing, the entire stack operation
     *            fails and is rolled back.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RollbackConfiguration withRollbackTriggers(
            java.util.Collection<RollbackTrigger> rollbackTriggers) {
        setRollbackTriggers(rollbackTriggers);
        return this;
    }

    /**
     * <p>
     * The amount of time, in minutes, during which CloudFormation should
     * monitor all the rollback triggers after the stack creation or update
     * operation deploys all necessary resources.
     * </p>
     * <p>
     * The default is 0 minutes.
     * </p>
     * <p>
     * If you specify a monitoring period but do not specify any rollback
     * triggers, CloudFormation still waits the specified period of time before
     * cleaning up old resources after update operations. You can use this
     * monitoring period to perform any manual stack validation desired, and
     * manually cancel the stack creation or update (using <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CancelUpdateStack.html"
     * >CancelUpdateStack</a>, for example) as necessary.
     * </p>
     * <p>
     * If you specify 0 for this parameter, CloudFormation still monitors the
     * specified rollback triggers during stack creation and update operations.
     * Then, for update operations, it begins disposing of old resources
     * immediately once the operation completes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 180<br/>
     *
     * @return <p>
     *         The amount of time, in minutes, during which CloudFormation
     *         should monitor all the rollback triggers after the stack creation
     *         or update operation deploys all necessary resources.
     *         </p>
     *         <p>
     *         The default is 0 minutes.
     *         </p>
     *         <p>
     *         If you specify a monitoring period but do not specify any
     *         rollback triggers, CloudFormation still waits the specified
     *         period of time before cleaning up old resources after update
     *         operations. You can use this monitoring period to perform any
     *         manual stack validation desired, and manually cancel the stack
     *         creation or update (using <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CancelUpdateStack.html"
     *         >CancelUpdateStack</a>, for example) as necessary.
     *         </p>
     *         <p>
     *         If you specify 0 for this parameter, CloudFormation still
     *         monitors the specified rollback triggers during stack creation
     *         and update operations. Then, for update operations, it begins
     *         disposing of old resources immediately once the operation
     *         completes.
     *         </p>
     */
    public Integer getMonitoringTimeInMinutes() {
        return monitoringTimeInMinutes;
    }

    /**
     * <p>
     * The amount of time, in minutes, during which CloudFormation should
     * monitor all the rollback triggers after the stack creation or update
     * operation deploys all necessary resources.
     * </p>
     * <p>
     * The default is 0 minutes.
     * </p>
     * <p>
     * If you specify a monitoring period but do not specify any rollback
     * triggers, CloudFormation still waits the specified period of time before
     * cleaning up old resources after update operations. You can use this
     * monitoring period to perform any manual stack validation desired, and
     * manually cancel the stack creation or update (using <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CancelUpdateStack.html"
     * >CancelUpdateStack</a>, for example) as necessary.
     * </p>
     * <p>
     * If you specify 0 for this parameter, CloudFormation still monitors the
     * specified rollback triggers during stack creation and update operations.
     * Then, for update operations, it begins disposing of old resources
     * immediately once the operation completes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 180<br/>
     *
     * @param monitoringTimeInMinutes <p>
     *            The amount of time, in minutes, during which CloudFormation
     *            should monitor all the rollback triggers after the stack
     *            creation or update operation deploys all necessary resources.
     *            </p>
     *            <p>
     *            The default is 0 minutes.
     *            </p>
     *            <p>
     *            If you specify a monitoring period but do not specify any
     *            rollback triggers, CloudFormation still waits the specified
     *            period of time before cleaning up old resources after update
     *            operations. You can use this monitoring period to perform any
     *            manual stack validation desired, and manually cancel the stack
     *            creation or update (using <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CancelUpdateStack.html"
     *            >CancelUpdateStack</a>, for example) as necessary.
     *            </p>
     *            <p>
     *            If you specify 0 for this parameter, CloudFormation still
     *            monitors the specified rollback triggers during stack creation
     *            and update operations. Then, for update operations, it begins
     *            disposing of old resources immediately once the operation
     *            completes.
     *            </p>
     */
    public void setMonitoringTimeInMinutes(Integer monitoringTimeInMinutes) {
        this.monitoringTimeInMinutes = monitoringTimeInMinutes;
    }

    /**
     * <p>
     * The amount of time, in minutes, during which CloudFormation should
     * monitor all the rollback triggers after the stack creation or update
     * operation deploys all necessary resources.
     * </p>
     * <p>
     * The default is 0 minutes.
     * </p>
     * <p>
     * If you specify a monitoring period but do not specify any rollback
     * triggers, CloudFormation still waits the specified period of time before
     * cleaning up old resources after update operations. You can use this
     * monitoring period to perform any manual stack validation desired, and
     * manually cancel the stack creation or update (using <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CancelUpdateStack.html"
     * >CancelUpdateStack</a>, for example) as necessary.
     * </p>
     * <p>
     * If you specify 0 for this parameter, CloudFormation still monitors the
     * specified rollback triggers during stack creation and update operations.
     * Then, for update operations, it begins disposing of old resources
     * immediately once the operation completes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 180<br/>
     *
     * @param monitoringTimeInMinutes <p>
     *            The amount of time, in minutes, during which CloudFormation
     *            should monitor all the rollback triggers after the stack
     *            creation or update operation deploys all necessary resources.
     *            </p>
     *            <p>
     *            The default is 0 minutes.
     *            </p>
     *            <p>
     *            If you specify a monitoring period but do not specify any
     *            rollback triggers, CloudFormation still waits the specified
     *            period of time before cleaning up old resources after update
     *            operations. You can use this monitoring period to perform any
     *            manual stack validation desired, and manually cancel the stack
     *            creation or update (using <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CancelUpdateStack.html"
     *            >CancelUpdateStack</a>, for example) as necessary.
     *            </p>
     *            <p>
     *            If you specify 0 for this parameter, CloudFormation still
     *            monitors the specified rollback triggers during stack creation
     *            and update operations. Then, for update operations, it begins
     *            disposing of old resources immediately once the operation
     *            completes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RollbackConfiguration withMonitoringTimeInMinutes(Integer monitoringTimeInMinutes) {
        this.monitoringTimeInMinutes = monitoringTimeInMinutes;
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
        if (getRollbackTriggers() != null)
            sb.append("RollbackTriggers: " + getRollbackTriggers() + ",");
        if (getMonitoringTimeInMinutes() != null)
            sb.append("MonitoringTimeInMinutes: " + getMonitoringTimeInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRollbackTriggers() == null) ? 0 : getRollbackTriggers().hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoringTimeInMinutes() == null) ? 0 : getMonitoringTimeInMinutes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RollbackConfiguration == false)
            return false;
        RollbackConfiguration other = (RollbackConfiguration) obj;

        if (other.getRollbackTriggers() == null ^ this.getRollbackTriggers() == null)
            return false;
        if (other.getRollbackTriggers() != null
                && other.getRollbackTriggers().equals(this.getRollbackTriggers()) == false)
            return false;
        if (other.getMonitoringTimeInMinutes() == null ^ this.getMonitoringTimeInMinutes() == null)
            return false;
        if (other.getMonitoringTimeInMinutes() != null
                && other.getMonitoringTimeInMinutes().equals(this.getMonitoringTimeInMinutes()) == false)
            return false;
        return true;
    }
}
