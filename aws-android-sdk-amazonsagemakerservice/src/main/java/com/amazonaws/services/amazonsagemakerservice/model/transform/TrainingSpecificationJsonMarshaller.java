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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TrainingSpecification
 */
class TrainingSpecificationJsonMarshaller {

    public void marshall(TrainingSpecification trainingSpecification, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (trainingSpecification.getTrainingImage() != null) {
            String trainingImage = trainingSpecification.getTrainingImage();
            jsonWriter.name("TrainingImage");
            jsonWriter.value(trainingImage);
        }
        if (trainingSpecification.getTrainingImageDigest() != null) {
            String trainingImageDigest = trainingSpecification.getTrainingImageDigest();
            jsonWriter.name("TrainingImageDigest");
            jsonWriter.value(trainingImageDigest);
        }
        if (trainingSpecification.getSupportedHyperParameters() != null) {
            java.util.List<HyperParameterSpecification> supportedHyperParameters = trainingSpecification
                    .getSupportedHyperParameters();
            jsonWriter.name("SupportedHyperParameters");
            jsonWriter.beginArray();
            for (HyperParameterSpecification supportedHyperParametersItem : supportedHyperParameters) {
                if (supportedHyperParametersItem != null) {
                    HyperParameterSpecificationJsonMarshaller.getInstance().marshall(
                            supportedHyperParametersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trainingSpecification.getSupportedTrainingInstanceTypes() != null) {
            java.util.List<String> supportedTrainingInstanceTypes = trainingSpecification
                    .getSupportedTrainingInstanceTypes();
            jsonWriter.name("SupportedTrainingInstanceTypes");
            jsonWriter.beginArray();
            for (String supportedTrainingInstanceTypesItem : supportedTrainingInstanceTypes) {
                if (supportedTrainingInstanceTypesItem != null) {
                    jsonWriter.value(supportedTrainingInstanceTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (trainingSpecification.getSupportsDistributedTraining() != null) {
            Boolean supportsDistributedTraining = trainingSpecification
                    .getSupportsDistributedTraining();
            jsonWriter.name("SupportsDistributedTraining");
            jsonWriter.value(supportsDistributedTraining);
        }
        if (trainingSpecification.getMetricDefinitions() != null) {
            java.util.List<MetricDefinition> metricDefinitions = trainingSpecification
                    .getMetricDefinitions();
            jsonWriter.name("MetricDefinitions");
            jsonWriter.beginArray();
            for (MetricDefinition metricDefinitionsItem : metricDefinitions) {
                if (metricDefinitionsItem != null) {
                    MetricDefinitionJsonMarshaller.getInstance().marshall(metricDefinitionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trainingSpecification.getTrainingChannels() != null) {
            java.util.List<ChannelSpecification> trainingChannels = trainingSpecification
                    .getTrainingChannels();
            jsonWriter.name("TrainingChannels");
            jsonWriter.beginArray();
            for (ChannelSpecification trainingChannelsItem : trainingChannels) {
                if (trainingChannelsItem != null) {
                    ChannelSpecificationJsonMarshaller.getInstance().marshall(trainingChannelsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trainingSpecification.getSupportedTuningJobObjectiveMetrics() != null) {
            java.util.List<HyperParameterTuningJobObjective> supportedTuningJobObjectiveMetrics = trainingSpecification
                    .getSupportedTuningJobObjectiveMetrics();
            jsonWriter.name("SupportedTuningJobObjectiveMetrics");
            jsonWriter.beginArray();
            for (HyperParameterTuningJobObjective supportedTuningJobObjectiveMetricsItem : supportedTuningJobObjectiveMetrics) {
                if (supportedTuningJobObjectiveMetricsItem != null) {
                    HyperParameterTuningJobObjectiveJsonMarshaller.getInstance().marshall(
                            supportedTuningJobObjectiveMetricsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TrainingSpecificationJsonMarshaller instance;

    public static TrainingSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrainingSpecificationJsonMarshaller();
        return instance;
    }
}
