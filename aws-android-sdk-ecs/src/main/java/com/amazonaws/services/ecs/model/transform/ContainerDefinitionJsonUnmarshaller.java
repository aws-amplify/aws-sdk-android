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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ContainerDefinition
 */
class ContainerDefinitionJsonUnmarshaller implements
        Unmarshaller<ContainerDefinition, JsonUnmarshallerContext> {

    public ContainerDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ContainerDefinition containerDefinition = new ContainerDefinition();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                containerDefinition.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("image")) {
                containerDefinition.setImage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("repositoryCredentials")) {
                containerDefinition.setRepositoryCredentials(RepositoryCredentialsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("cpu")) {
                containerDefinition.setCpu(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("memory")) {
                containerDefinition.setMemory(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("memoryReservation")) {
                containerDefinition.setMemoryReservation(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("links")) {
                containerDefinition.setLinks(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("portMappings")) {
                containerDefinition.setPortMappings(new ListUnmarshaller<PortMapping>(
                        PortMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("essential")) {
                containerDefinition.setEssential(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("entryPoint")) {
                containerDefinition.setEntryPoint(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("command")) {
                containerDefinition.setCommand(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("environment")) {
                containerDefinition.setEnvironment(new ListUnmarshaller<KeyValuePair>(
                        KeyValuePairJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("environmentFiles")) {
                containerDefinition.setEnvironmentFiles(new ListUnmarshaller<EnvironmentFile>(
                        EnvironmentFileJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("mountPoints")) {
                containerDefinition.setMountPoints(new ListUnmarshaller<MountPoint>(
                        MountPointJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("volumesFrom")) {
                containerDefinition.setVolumesFrom(new ListUnmarshaller<VolumeFrom>(
                        VolumeFromJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("linuxParameters")) {
                containerDefinition.setLinuxParameters(LinuxParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("secrets")) {
                containerDefinition.setSecrets(new ListUnmarshaller<Secret>(SecretJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("dependsOn")) {
                containerDefinition.setDependsOn(new ListUnmarshaller<ContainerDependency>(
                        ContainerDependencyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("startTimeout")) {
                containerDefinition.setStartTimeout(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("stopTimeout")) {
                containerDefinition.setStopTimeout(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hostname")) {
                containerDefinition.setHostname(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("user")) {
                containerDefinition.setUser(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("workingDirectory")) {
                containerDefinition.setWorkingDirectory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("disableNetworking")) {
                containerDefinition.setDisableNetworking(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("privileged")) {
                containerDefinition.setPrivileged(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("readonlyRootFilesystem")) {
                containerDefinition.setReadonlyRootFilesystem(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dnsServers")) {
                containerDefinition.setDnsServers(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("dnsSearchDomains")) {
                containerDefinition.setDnsSearchDomains(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("extraHosts")) {
                containerDefinition.setExtraHosts(new ListUnmarshaller<HostEntry>(
                        HostEntryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("dockerSecurityOptions")) {
                containerDefinition.setDockerSecurityOptions(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("interactive")) {
                containerDefinition.setInteractive(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pseudoTerminal")) {
                containerDefinition.setPseudoTerminal(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dockerLabels")) {
                containerDefinition.setDockerLabels(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ulimits")) {
                containerDefinition.setUlimits(new ListUnmarshaller<Ulimit>(UlimitJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("logConfiguration")) {
                containerDefinition.setLogConfiguration(LogConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("healthCheck")) {
                containerDefinition.setHealthCheck(HealthCheckJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("systemControls")) {
                containerDefinition.setSystemControls(new ListUnmarshaller<SystemControl>(
                        SystemControlJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("resourceRequirements")) {
                containerDefinition
                        .setResourceRequirements(new ListUnmarshaller<ResourceRequirement>(
                                ResourceRequirementJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("firelensConfiguration")) {
                containerDefinition.setFirelensConfiguration(FirelensConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return containerDefinition;
    }

    private static ContainerDefinitionJsonUnmarshaller instance;

    public static ContainerDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerDefinitionJsonUnmarshaller();
        return instance;
    }
}
