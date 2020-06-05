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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO PlatformDescription
 */
class PlatformDescriptionStaxMarshaller {

    public void marshall(PlatformDescription _platformDescription, Request<?> request,
            String _prefix) {
        String prefix;
        if (_platformDescription.getPlatformArn() != null) {
            prefix = _prefix + "PlatformArn";
            String platformArn = _platformDescription.getPlatformArn();
            request.addParameter(prefix, StringUtils.fromString(platformArn));
        }
        if (_platformDescription.getPlatformOwner() != null) {
            prefix = _prefix + "PlatformOwner";
            String platformOwner = _platformDescription.getPlatformOwner();
            request.addParameter(prefix, StringUtils.fromString(platformOwner));
        }
        if (_platformDescription.getPlatformName() != null) {
            prefix = _prefix + "PlatformName";
            String platformName = _platformDescription.getPlatformName();
            request.addParameter(prefix, StringUtils.fromString(platformName));
        }
        if (_platformDescription.getPlatformVersion() != null) {
            prefix = _prefix + "PlatformVersion";
            String platformVersion = _platformDescription.getPlatformVersion();
            request.addParameter(prefix, StringUtils.fromString(platformVersion));
        }
        if (_platformDescription.getSolutionStackName() != null) {
            prefix = _prefix + "SolutionStackName";
            String solutionStackName = _platformDescription.getSolutionStackName();
            request.addParameter(prefix, StringUtils.fromString(solutionStackName));
        }
        if (_platformDescription.getPlatformStatus() != null) {
            prefix = _prefix + "PlatformStatus";
            String platformStatus = _platformDescription.getPlatformStatus();
            request.addParameter(prefix, StringUtils.fromString(platformStatus));
        }
        if (_platformDescription.getDateCreated() != null) {
            prefix = _prefix + "DateCreated";
            java.util.Date dateCreated = _platformDescription.getDateCreated();
            request.addParameter(prefix, StringUtils.fromDate(dateCreated));
        }
        if (_platformDescription.getDateUpdated() != null) {
            prefix = _prefix + "DateUpdated";
            java.util.Date dateUpdated = _platformDescription.getDateUpdated();
            request.addParameter(prefix, StringUtils.fromDate(dateUpdated));
        }
        if (_platformDescription.getPlatformCategory() != null) {
            prefix = _prefix + "PlatformCategory";
            String platformCategory = _platformDescription.getPlatformCategory();
            request.addParameter(prefix, StringUtils.fromString(platformCategory));
        }
        if (_platformDescription.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _platformDescription.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_platformDescription.getMaintainer() != null) {
            prefix = _prefix + "Maintainer";
            String maintainer = _platformDescription.getMaintainer();
            request.addParameter(prefix, StringUtils.fromString(maintainer));
        }
        if (_platformDescription.getOperatingSystemName() != null) {
            prefix = _prefix + "OperatingSystemName";
            String operatingSystemName = _platformDescription.getOperatingSystemName();
            request.addParameter(prefix, StringUtils.fromString(operatingSystemName));
        }
        if (_platformDescription.getOperatingSystemVersion() != null) {
            prefix = _prefix + "OperatingSystemVersion";
            String operatingSystemVersion = _platformDescription.getOperatingSystemVersion();
            request.addParameter(prefix, StringUtils.fromString(operatingSystemVersion));
        }
        if (_platformDescription.getProgrammingLanguages() != null) {
            prefix = _prefix + "ProgrammingLanguages";
            java.util.List<PlatformProgrammingLanguage> programmingLanguages = _platformDescription
                    .getProgrammingLanguages();
            int programmingLanguagesIndex = 1;
            String programmingLanguagesPrefix = prefix;
            for (PlatformProgrammingLanguage programmingLanguagesItem : programmingLanguages) {
                prefix = programmingLanguagesPrefix + ".member." + programmingLanguagesIndex;
                if (programmingLanguagesItem != null) {
                    PlatformProgrammingLanguageStaxMarshaller.getInstance().marshall(
                            programmingLanguagesItem, request, prefix + ".");
                }
                programmingLanguagesIndex++;
            }
            prefix = programmingLanguagesPrefix;
        }
        if (_platformDescription.getFrameworks() != null) {
            prefix = _prefix + "Frameworks";
            java.util.List<PlatformFramework> frameworks = _platformDescription.getFrameworks();
            int frameworksIndex = 1;
            String frameworksPrefix = prefix;
            for (PlatformFramework frameworksItem : frameworks) {
                prefix = frameworksPrefix + ".member." + frameworksIndex;
                if (frameworksItem != null) {
                    PlatformFrameworkStaxMarshaller.getInstance().marshall(frameworksItem, request,
                            prefix + ".");
                }
                frameworksIndex++;
            }
            prefix = frameworksPrefix;
        }
        if (_platformDescription.getCustomAmiList() != null) {
            prefix = _prefix + "CustomAmiList";
            java.util.List<CustomAmi> customAmiList = _platformDescription.getCustomAmiList();
            int customAmiListIndex = 1;
            String customAmiListPrefix = prefix;
            for (CustomAmi customAmiListItem : customAmiList) {
                prefix = customAmiListPrefix + ".member." + customAmiListIndex;
                if (customAmiListItem != null) {
                    CustomAmiStaxMarshaller.getInstance().marshall(customAmiListItem, request,
                            prefix + ".");
                }
                customAmiListIndex++;
            }
            prefix = customAmiListPrefix;
        }
        if (_platformDescription.getSupportedTierList() != null) {
            prefix = _prefix + "SupportedTierList";
            java.util.List<String> supportedTierList = _platformDescription.getSupportedTierList();
            int supportedTierListIndex = 1;
            String supportedTierListPrefix = prefix;
            for (String supportedTierListItem : supportedTierList) {
                prefix = supportedTierListPrefix + ".member." + supportedTierListIndex;
                if (supportedTierListItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(supportedTierListItem));
                }
                supportedTierListIndex++;
            }
            prefix = supportedTierListPrefix;
        }
        if (_platformDescription.getSupportedAddonList() != null) {
            prefix = _prefix + "SupportedAddonList";
            java.util.List<String> supportedAddonList = _platformDescription
                    .getSupportedAddonList();
            int supportedAddonListIndex = 1;
            String supportedAddonListPrefix = prefix;
            for (String supportedAddonListItem : supportedAddonList) {
                prefix = supportedAddonListPrefix + ".member." + supportedAddonListIndex;
                if (supportedAddonListItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(supportedAddonListItem));
                }
                supportedAddonListIndex++;
            }
            prefix = supportedAddonListPrefix;
        }
        if (_platformDescription.getPlatformLifecycleState() != null) {
            prefix = _prefix + "PlatformLifecycleState";
            String platformLifecycleState = _platformDescription.getPlatformLifecycleState();
            request.addParameter(prefix, StringUtils.fromString(platformLifecycleState));
        }
        if (_platformDescription.getPlatformBranchName() != null) {
            prefix = _prefix + "PlatformBranchName";
            String platformBranchName = _platformDescription.getPlatformBranchName();
            request.addParameter(prefix, StringUtils.fromString(platformBranchName));
        }
        if (_platformDescription.getPlatformBranchLifecycleState() != null) {
            prefix = _prefix + "PlatformBranchLifecycleState";
            String platformBranchLifecycleState = _platformDescription
                    .getPlatformBranchLifecycleState();
            request.addParameter(prefix, StringUtils.fromString(platformBranchLifecycleState));
        }
    }

    private static PlatformDescriptionStaxMarshaller instance;

    public static PlatformDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PlatformDescriptionStaxMarshaller();
        return instance;
    }
}
