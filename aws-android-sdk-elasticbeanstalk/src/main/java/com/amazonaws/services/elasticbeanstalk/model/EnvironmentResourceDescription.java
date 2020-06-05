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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the AWS resources in use by this environment. This data is live.
 * </p>
 */
public class EnvironmentResourceDescription implements Serializable {
    /**
     * <p>
     * The name of the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String environmentName;

    /**
     * <p>
     * The <code>AutoScalingGroups</code> used by this environment.
     * </p>
     */
    private java.util.List<AutoScalingGroup> autoScalingGroups;

    /**
     * <p>
     * The Amazon EC2 instances used by this environment.
     * </p>
     */
    private java.util.List<Instance> instances;

    /**
     * <p>
     * The Auto Scaling launch configurations in use by this environment.
     * </p>
     */
    private java.util.List<LaunchConfiguration> launchConfigurations;

    /**
     * <p>
     * The Amazon EC2 launch templates in use by this environment.
     * </p>
     */
    private java.util.List<LaunchTemplate> launchTemplates;

    /**
     * <p>
     * The LoadBalancers in use by this environment.
     * </p>
     */
    private java.util.List<LoadBalancer> loadBalancers;

    /**
     * <p>
     * The <code>AutoScaling</code> triggers in use by this environment.
     * </p>
     */
    private java.util.List<Trigger> triggers;

    /**
     * <p>
     * The queues used by this environment.
     * </p>
     */
    private java.util.List<Queue> queues;

    /**
     * <p>
     * The name of the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         The name of the environment.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of the environment.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of the environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * <p>
     * The <code>AutoScalingGroups</code> used by this environment.
     * </p>
     *
     * @return <p>
     *         The <code>AutoScalingGroups</code> used by this environment.
     *         </p>
     */
    public java.util.List<AutoScalingGroup> getAutoScalingGroups() {
        return autoScalingGroups;
    }

    /**
     * <p>
     * The <code>AutoScalingGroups</code> used by this environment.
     * </p>
     *
     * @param autoScalingGroups <p>
     *            The <code>AutoScalingGroups</code> used by this environment.
     *            </p>
     */
    public void setAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }

        this.autoScalingGroups = new java.util.ArrayList<AutoScalingGroup>(autoScalingGroups);
    }

    /**
     * <p>
     * The <code>AutoScalingGroups</code> used by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingGroups <p>
     *            The <code>AutoScalingGroups</code> used by this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withAutoScalingGroups(
            AutoScalingGroup... autoScalingGroups) {
        if (getAutoScalingGroups() == null) {
            this.autoScalingGroups = new java.util.ArrayList<AutoScalingGroup>(
                    autoScalingGroups.length);
        }
        for (AutoScalingGroup value : autoScalingGroups) {
            this.autoScalingGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The <code>AutoScalingGroups</code> used by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingGroups <p>
     *            The <code>AutoScalingGroups</code> used by this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withAutoScalingGroups(
            java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        setAutoScalingGroups(autoScalingGroups);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instances used by this environment.
     * </p>
     *
     * @return <p>
     *         The Amazon EC2 instances used by this environment.
     *         </p>
     */
    public java.util.List<Instance> getInstances() {
        return instances;
    }

    /**
     * <p>
     * The Amazon EC2 instances used by this environment.
     * </p>
     *
     * @param instances <p>
     *            The Amazon EC2 instances used by this environment.
     *            </p>
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<Instance>(instances);
    }

    /**
     * <p>
     * The Amazon EC2 instances used by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            The Amazon EC2 instances used by this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withInstances(Instance... instances) {
        if (getInstances() == null) {
            this.instances = new java.util.ArrayList<Instance>(instances.length);
        }
        for (Instance value : instances) {
            this.instances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instances used by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            The Amazon EC2 instances used by this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withInstances(java.util.Collection<Instance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The Auto Scaling launch configurations in use by this environment.
     * </p>
     *
     * @return <p>
     *         The Auto Scaling launch configurations in use by this
     *         environment.
     *         </p>
     */
    public java.util.List<LaunchConfiguration> getLaunchConfigurations() {
        return launchConfigurations;
    }

    /**
     * <p>
     * The Auto Scaling launch configurations in use by this environment.
     * </p>
     *
     * @param launchConfigurations <p>
     *            The Auto Scaling launch configurations in use by this
     *            environment.
     *            </p>
     */
    public void setLaunchConfigurations(
            java.util.Collection<LaunchConfiguration> launchConfigurations) {
        if (launchConfigurations == null) {
            this.launchConfigurations = null;
            return;
        }

        this.launchConfigurations = new java.util.ArrayList<LaunchConfiguration>(
                launchConfigurations);
    }

    /**
     * <p>
     * The Auto Scaling launch configurations in use by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchConfigurations <p>
     *            The Auto Scaling launch configurations in use by this
     *            environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withLaunchConfigurations(
            LaunchConfiguration... launchConfigurations) {
        if (getLaunchConfigurations() == null) {
            this.launchConfigurations = new java.util.ArrayList<LaunchConfiguration>(
                    launchConfigurations.length);
        }
        for (LaunchConfiguration value : launchConfigurations) {
            this.launchConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Auto Scaling launch configurations in use by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchConfigurations <p>
     *            The Auto Scaling launch configurations in use by this
     *            environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withLaunchConfigurations(
            java.util.Collection<LaunchConfiguration> launchConfigurations) {
        setLaunchConfigurations(launchConfigurations);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 launch templates in use by this environment.
     * </p>
     *
     * @return <p>
     *         The Amazon EC2 launch templates in use by this environment.
     *         </p>
     */
    public java.util.List<LaunchTemplate> getLaunchTemplates() {
        return launchTemplates;
    }

    /**
     * <p>
     * The Amazon EC2 launch templates in use by this environment.
     * </p>
     *
     * @param launchTemplates <p>
     *            The Amazon EC2 launch templates in use by this environment.
     *            </p>
     */
    public void setLaunchTemplates(java.util.Collection<LaunchTemplate> launchTemplates) {
        if (launchTemplates == null) {
            this.launchTemplates = null;
            return;
        }

        this.launchTemplates = new java.util.ArrayList<LaunchTemplate>(launchTemplates);
    }

    /**
     * <p>
     * The Amazon EC2 launch templates in use by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplates <p>
     *            The Amazon EC2 launch templates in use by this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withLaunchTemplates(LaunchTemplate... launchTemplates) {
        if (getLaunchTemplates() == null) {
            this.launchTemplates = new java.util.ArrayList<LaunchTemplate>(launchTemplates.length);
        }
        for (LaunchTemplate value : launchTemplates) {
            this.launchTemplates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 launch templates in use by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplates <p>
     *            The Amazon EC2 launch templates in use by this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withLaunchTemplates(
            java.util.Collection<LaunchTemplate> launchTemplates) {
        setLaunchTemplates(launchTemplates);
        return this;
    }

    /**
     * <p>
     * The LoadBalancers in use by this environment.
     * </p>
     *
     * @return <p>
     *         The LoadBalancers in use by this environment.
     *         </p>
     */
    public java.util.List<LoadBalancer> getLoadBalancers() {
        return loadBalancers;
    }

    /**
     * <p>
     * The LoadBalancers in use by this environment.
     * </p>
     *
     * @param loadBalancers <p>
     *            The LoadBalancers in use by this environment.
     *            </p>
     */
    public void setLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }

        this.loadBalancers = new java.util.ArrayList<LoadBalancer>(loadBalancers);
    }

    /**
     * <p>
     * The LoadBalancers in use by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancers <p>
     *            The LoadBalancers in use by this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withLoadBalancers(LoadBalancer... loadBalancers) {
        if (getLoadBalancers() == null) {
            this.loadBalancers = new java.util.ArrayList<LoadBalancer>(loadBalancers.length);
        }
        for (LoadBalancer value : loadBalancers) {
            this.loadBalancers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The LoadBalancers in use by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancers <p>
     *            The LoadBalancers in use by this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withLoadBalancers(
            java.util.Collection<LoadBalancer> loadBalancers) {
        setLoadBalancers(loadBalancers);
        return this;
    }

    /**
     * <p>
     * The <code>AutoScaling</code> triggers in use by this environment.
     * </p>
     *
     * @return <p>
     *         The <code>AutoScaling</code> triggers in use by this environment.
     *         </p>
     */
    public java.util.List<Trigger> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * The <code>AutoScaling</code> triggers in use by this environment.
     * </p>
     *
     * @param triggers <p>
     *            The <code>AutoScaling</code> triggers in use by this
     *            environment.
     *            </p>
     */
    public void setTriggers(java.util.Collection<Trigger> triggers) {
        if (triggers == null) {
            this.triggers = null;
            return;
        }

        this.triggers = new java.util.ArrayList<Trigger>(triggers);
    }

    /**
     * <p>
     * The <code>AutoScaling</code> triggers in use by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggers <p>
     *            The <code>AutoScaling</code> triggers in use by this
     *            environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withTriggers(Trigger... triggers) {
        if (getTriggers() == null) {
            this.triggers = new java.util.ArrayList<Trigger>(triggers.length);
        }
        for (Trigger value : triggers) {
            this.triggers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The <code>AutoScaling</code> triggers in use by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggers <p>
     *            The <code>AutoScaling</code> triggers in use by this
     *            environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withTriggers(java.util.Collection<Trigger> triggers) {
        setTriggers(triggers);
        return this;
    }

    /**
     * <p>
     * The queues used by this environment.
     * </p>
     *
     * @return <p>
     *         The queues used by this environment.
     *         </p>
     */
    public java.util.List<Queue> getQueues() {
        return queues;
    }

    /**
     * <p>
     * The queues used by this environment.
     * </p>
     *
     * @param queues <p>
     *            The queues used by this environment.
     *            </p>
     */
    public void setQueues(java.util.Collection<Queue> queues) {
        if (queues == null) {
            this.queues = null;
            return;
        }

        this.queues = new java.util.ArrayList<Queue>(queues);
    }

    /**
     * <p>
     * The queues used by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queues <p>
     *            The queues used by this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withQueues(Queue... queues) {
        if (getQueues() == null) {
            this.queues = new java.util.ArrayList<Queue>(queues.length);
        }
        for (Queue value : queues) {
            this.queues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The queues used by this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queues <p>
     *            The queues used by this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentResourceDescription withQueues(java.util.Collection<Queue> queues) {
        setQueues(queues);
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getAutoScalingGroups() != null)
            sb.append("AutoScalingGroups: " + getAutoScalingGroups() + ",");
        if (getInstances() != null)
            sb.append("Instances: " + getInstances() + ",");
        if (getLaunchConfigurations() != null)
            sb.append("LaunchConfigurations: " + getLaunchConfigurations() + ",");
        if (getLaunchTemplates() != null)
            sb.append("LaunchTemplates: " + getLaunchTemplates() + ",");
        if (getLoadBalancers() != null)
            sb.append("LoadBalancers: " + getLoadBalancers() + ",");
        if (getTriggers() != null)
            sb.append("Triggers: " + getTriggers() + ",");
        if (getQueues() != null)
            sb.append("Queues: " + getQueues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchConfigurations() == null) ? 0 : getLaunchConfigurations().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplates() == null) ? 0 : getLaunchTemplates().hashCode());
        hashCode = prime * hashCode
                + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode());
        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        hashCode = prime * hashCode + ((getQueues() == null) ? 0 : getQueues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentResourceDescription == false)
            return false;
        EnvironmentResourceDescription other = (EnvironmentResourceDescription) obj;

        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getAutoScalingGroups() == null ^ this.getAutoScalingGroups() == null)
            return false;
        if (other.getAutoScalingGroups() != null
                && other.getAutoScalingGroups().equals(this.getAutoScalingGroups()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getLaunchConfigurations() == null ^ this.getLaunchConfigurations() == null)
            return false;
        if (other.getLaunchConfigurations() != null
                && other.getLaunchConfigurations().equals(this.getLaunchConfigurations()) == false)
            return false;
        if (other.getLaunchTemplates() == null ^ this.getLaunchTemplates() == null)
            return false;
        if (other.getLaunchTemplates() != null
                && other.getLaunchTemplates().equals(this.getLaunchTemplates()) == false)
            return false;
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null)
            return false;
        if (other.getLoadBalancers() != null
                && other.getLoadBalancers().equals(this.getLoadBalancers()) == false)
            return false;
        if (other.getTriggers() == null ^ this.getTriggers() == null)
            return false;
        if (other.getTriggers() != null && other.getTriggers().equals(this.getTriggers()) == false)
            return false;
        if (other.getQueues() == null ^ this.getQueues() == null)
            return false;
        if (other.getQueues() != null && other.getQueues().equals(this.getQueues()) == false)
            return false;
        return true;
    }
}
