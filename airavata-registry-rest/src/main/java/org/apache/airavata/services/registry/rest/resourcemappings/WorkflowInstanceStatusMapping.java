/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.airavata.services.registry.rest.resourcemappings;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class WorkflowInstanceStatusMapping {
    private String executionStatus;
    private Date statusUpdateTime = null;
    private String experimentId;
    private String workflowInstanceId;
    private String templateName;

    private WorkflowInstanceMapping workflowInstanceMapping;

    public WorkflowInstanceStatusMapping() {
    }

    public String getExecutionStatus() {
        return executionStatus;
    }

    public Date getStatusUpdateTime() {
        return statusUpdateTime;
    }


    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }

    public void setStatusUpdateTime(Date statusUpdateTime) {
        this.statusUpdateTime = statusUpdateTime;
    }

    public void setWorkflowInstanceMapping(WorkflowInstanceMapping workflowInstanceStatusMapping) {
        this.workflowInstanceMapping = workflowInstanceStatusMapping;
    }

    public String getExperimentId() {
        return experimentId;
    }

    public String getWorkflowInstanceId() {
        return workflowInstanceId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public WorkflowInstanceMapping getWorkflowInstanceMapping() {
        return workflowInstanceMapping;
    }

    public void setExperimentId(String experimentId) {
        this.experimentId = experimentId;
    }

    public void setWorkflowInstanceId(String workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
}
