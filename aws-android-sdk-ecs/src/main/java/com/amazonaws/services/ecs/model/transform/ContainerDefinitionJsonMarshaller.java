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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ContainerDefinition
 */
class ContainerDefinitionJsonMarshaller {

    public void marshall(ContainerDefinition containerDefinition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (containerDefinition.getName() != null) {
            String name = containerDefinition.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (containerDefinition.getImage() != null) {
            String image = containerDefinition.getImage();
            jsonWriter.name("image");
            jsonWriter.value(image);
        }
        if (containerDefinition.getRepositoryCredentials() != null) {
            RepositoryCredentials repositoryCredentials = containerDefinition
                    .getRepositoryCredentials();
            jsonWriter.name("repositoryCredentials");
            RepositoryCredentialsJsonMarshaller.getInstance().marshall(repositoryCredentials,
                    jsonWriter);
        }
        if (containerDefinition.getCpu() != null) {
            Integer cpu = containerDefinition.getCpu();
            jsonWriter.name("cpu");
            jsonWriter.value(cpu);
        }
        if (containerDefinition.getMemory() != null) {
            Integer memory = containerDefinition.getMemory();
            jsonWriter.name("memory");
            jsonWriter.value(memory);
        }
        if (containerDefinition.getMemoryReservation() != null) {
            Integer memoryReservation = containerDefinition.getMemoryReservation();
            jsonWriter.name("memoryReservation");
            jsonWriter.value(memoryReservation);
        }
        if (containerDefinition.getLinks() != null) {
            java.util.List<String> links = containerDefinition.getLinks();
            jsonWriter.name("links");
            jsonWriter.beginArray();
            for (String linksItem : links) {
                if (linksItem != null) {
                    jsonWriter.value(linksItem);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getPortMappings() != null) {
            java.util.List<PortMapping> portMappings = containerDefinition.getPortMappings();
            jsonWriter.name("portMappings");
            jsonWriter.beginArray();
            for (PortMapping portMappingsItem : portMappings) {
                if (portMappingsItem != null) {
                    PortMappingJsonMarshaller.getInstance().marshall(portMappingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getEssential() != null) {
            Boolean essential = containerDefinition.getEssential();
            jsonWriter.name("essential");
            jsonWriter.value(essential);
        }
        if (containerDefinition.getEntryPoint() != null) {
            java.util.List<String> entryPoint = containerDefinition.getEntryPoint();
            jsonWriter.name("entryPoint");
            jsonWriter.beginArray();
            for (String entryPointItem : entryPoint) {
                if (entryPointItem != null) {
                    jsonWriter.value(entryPointItem);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getCommand() != null) {
            java.util.List<String> command = containerDefinition.getCommand();
            jsonWriter.name("command");
            jsonWriter.beginArray();
            for (String commandItem : command) {
                if (commandItem != null) {
                    jsonWriter.value(commandItem);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getEnvironment() != null) {
            java.util.List<KeyValuePair> environment = containerDefinition.getEnvironment();
            jsonWriter.name("environment");
            jsonWriter.beginArray();
            for (KeyValuePair environmentItem : environment) {
                if (environmentItem != null) {
                    KeyValuePairJsonMarshaller.getInstance().marshall(environmentItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getEnvironmentFiles() != null) {
            java.util.List<EnvironmentFile> environmentFiles = containerDefinition
                    .getEnvironmentFiles();
            jsonWriter.name("environmentFiles");
            jsonWriter.beginArray();
            for (EnvironmentFile environmentFilesItem : environmentFiles) {
                if (environmentFilesItem != null) {
                    EnvironmentFileJsonMarshaller.getInstance().marshall(environmentFilesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getMountPoints() != null) {
            java.util.List<MountPoint> mountPoints = containerDefinition.getMountPoints();
            jsonWriter.name("mountPoints");
            jsonWriter.beginArray();
            for (MountPoint mountPointsItem : mountPoints) {
                if (mountPointsItem != null) {
                    MountPointJsonMarshaller.getInstance().marshall(mountPointsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getVolumesFrom() != null) {
            java.util.List<VolumeFrom> volumesFrom = containerDefinition.getVolumesFrom();
            jsonWriter.name("volumesFrom");
            jsonWriter.beginArray();
            for (VolumeFrom volumesFromItem : volumesFrom) {
                if (volumesFromItem != null) {
                    VolumeFromJsonMarshaller.getInstance().marshall(volumesFromItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getLinuxParameters() != null) {
            LinuxParameters linuxParameters = containerDefinition.getLinuxParameters();
            jsonWriter.name("linuxParameters");
            LinuxParametersJsonMarshaller.getInstance().marshall(linuxParameters, jsonWriter);
        }
        if (containerDefinition.getSecrets() != null) {
            java.util.List<Secret> secrets = containerDefinition.getSecrets();
            jsonWriter.name("secrets");
            jsonWriter.beginArray();
            for (Secret secretsItem : secrets) {
                if (secretsItem != null) {
                    SecretJsonMarshaller.getInstance().marshall(secretsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getDependsOn() != null) {
            java.util.List<ContainerDependency> dependsOn = containerDefinition.getDependsOn();
            jsonWriter.name("dependsOn");
            jsonWriter.beginArray();
            for (ContainerDependency dependsOnItem : dependsOn) {
                if (dependsOnItem != null) {
                    ContainerDependencyJsonMarshaller.getInstance().marshall(dependsOnItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getStartTimeout() != null) {
            Integer startTimeout = containerDefinition.getStartTimeout();
            jsonWriter.name("startTimeout");
            jsonWriter.value(startTimeout);
        }
        if (containerDefinition.getStopTimeout() != null) {
            Integer stopTimeout = containerDefinition.getStopTimeout();
            jsonWriter.name("stopTimeout");
            jsonWriter.value(stopTimeout);
        }
        if (containerDefinition.getHostname() != null) {
            String hostname = containerDefinition.getHostname();
            jsonWriter.name("hostname");
            jsonWriter.value(hostname);
        }
        if (containerDefinition.getUser() != null) {
            String user = containerDefinition.getUser();
            jsonWriter.name("user");
            jsonWriter.value(user);
        }
        if (containerDefinition.getWorkingDirectory() != null) {
            String workingDirectory = containerDefinition.getWorkingDirectory();
            jsonWriter.name("workingDirectory");
            jsonWriter.value(workingDirectory);
        }
        if (containerDefinition.getDisableNetworking() != null) {
            Boolean disableNetworking = containerDefinition.getDisableNetworking();
            jsonWriter.name("disableNetworking");
            jsonWriter.value(disableNetworking);
        }
        if (containerDefinition.getPrivileged() != null) {
            Boolean privileged = containerDefinition.getPrivileged();
            jsonWriter.name("privileged");
            jsonWriter.value(privileged);
        }
        if (containerDefinition.getReadonlyRootFilesystem() != null) {
            Boolean readonlyRootFilesystem = containerDefinition.getReadonlyRootFilesystem();
            jsonWriter.name("readonlyRootFilesystem");
            jsonWriter.value(readonlyRootFilesystem);
        }
        if (containerDefinition.getDnsServers() != null) {
            java.util.List<String> dnsServers = containerDefinition.getDnsServers();
            jsonWriter.name("dnsServers");
            jsonWriter.beginArray();
            for (String dnsServersItem : dnsServers) {
                if (dnsServersItem != null) {
                    jsonWriter.value(dnsServersItem);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getDnsSearchDomains() != null) {
            java.util.List<String> dnsSearchDomains = containerDefinition.getDnsSearchDomains();
            jsonWriter.name("dnsSearchDomains");
            jsonWriter.beginArray();
            for (String dnsSearchDomainsItem : dnsSearchDomains) {
                if (dnsSearchDomainsItem != null) {
                    jsonWriter.value(dnsSearchDomainsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getExtraHosts() != null) {
            java.util.List<HostEntry> extraHosts = containerDefinition.getExtraHosts();
            jsonWriter.name("extraHosts");
            jsonWriter.beginArray();
            for (HostEntry extraHostsItem : extraHosts) {
                if (extraHostsItem != null) {
                    HostEntryJsonMarshaller.getInstance().marshall(extraHostsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getDockerSecurityOptions() != null) {
            java.util.List<String> dockerSecurityOptions = containerDefinition
                    .getDockerSecurityOptions();
            jsonWriter.name("dockerSecurityOptions");
            jsonWriter.beginArray();
            for (String dockerSecurityOptionsItem : dockerSecurityOptions) {
                if (dockerSecurityOptionsItem != null) {
                    jsonWriter.value(dockerSecurityOptionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getInteractive() != null) {
            Boolean interactive = containerDefinition.getInteractive();
            jsonWriter.name("interactive");
            jsonWriter.value(interactive);
        }
        if (containerDefinition.getPseudoTerminal() != null) {
            Boolean pseudoTerminal = containerDefinition.getPseudoTerminal();
            jsonWriter.name("pseudoTerminal");
            jsonWriter.value(pseudoTerminal);
        }
        if (containerDefinition.getDockerLabels() != null) {
            java.util.Map<String, String> dockerLabels = containerDefinition.getDockerLabels();
            jsonWriter.name("dockerLabels");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> dockerLabelsEntry : dockerLabels.entrySet()) {
                String dockerLabelsValue = dockerLabelsEntry.getValue();
                if (dockerLabelsValue != null) {
                    jsonWriter.name(dockerLabelsEntry.getKey());
                    jsonWriter.value(dockerLabelsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (containerDefinition.getUlimits() != null) {
            java.util.List<Ulimit> ulimits = containerDefinition.getUlimits();
            jsonWriter.name("ulimits");
            jsonWriter.beginArray();
            for (Ulimit ulimitsItem : ulimits) {
                if (ulimitsItem != null) {
                    UlimitJsonMarshaller.getInstance().marshall(ulimitsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getLogConfiguration() != null) {
            LogConfiguration logConfiguration = containerDefinition.getLogConfiguration();
            jsonWriter.name("logConfiguration");
            LogConfigurationJsonMarshaller.getInstance().marshall(logConfiguration, jsonWriter);
        }
        if (containerDefinition.getHealthCheck() != null) {
            HealthCheck healthCheck = containerDefinition.getHealthCheck();
            jsonWriter.name("healthCheck");
            HealthCheckJsonMarshaller.getInstance().marshall(healthCheck, jsonWriter);
        }
        if (containerDefinition.getSystemControls() != null) {
            java.util.List<SystemControl> systemControls = containerDefinition.getSystemControls();
            jsonWriter.name("systemControls");
            jsonWriter.beginArray();
            for (SystemControl systemControlsItem : systemControls) {
                if (systemControlsItem != null) {
                    SystemControlJsonMarshaller.getInstance().marshall(systemControlsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getResourceRequirements() != null) {
            java.util.List<ResourceRequirement> resourceRequirements = containerDefinition
                    .getResourceRequirements();
            jsonWriter.name("resourceRequirements");
            jsonWriter.beginArray();
            for (ResourceRequirement resourceRequirementsItem : resourceRequirements) {
                if (resourceRequirementsItem != null) {
                    ResourceRequirementJsonMarshaller.getInstance().marshall(
                            resourceRequirementsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerDefinition.getFirelensConfiguration() != null) {
            FirelensConfiguration firelensConfiguration = containerDefinition
                    .getFirelensConfiguration();
            jsonWriter.name("firelensConfiguration");
            FirelensConfigurationJsonMarshaller.getInstance().marshall(firelensConfiguration,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ContainerDefinitionJsonMarshaller instance;

    public static ContainerDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerDefinitionJsonMarshaller();
        return instance;
    }
}
