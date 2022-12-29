/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.datasource.service;

import org.apache.seatunnel.datasource.configuration.util.OptionRule;
import org.apache.seatunnel.datasource.model.DataSource;
import org.apache.seatunnel.datasource.model.DataSourcePluginInfo;

import java.util.List;
import java.util.Map;

public interface SeaTunnelDataSourceService {

    List<DataSourcePluginInfo> listAllDataSources();

    OptionRule queryDataSourceFieldByName(String dataSourceName);

    Boolean checkDataSourceFields(Map<String, Object> parameters);

    DataSource queryDataSourceById(Long dataSourceId);

    Boolean saveDataSource(String dataSourceName, String comment, String pluginName, Map<String, Object> parameters);

    Boolean deleteDataSource(Long id);

    Boolean updateDataSource(Long dataSourceId, String dataSourceName, String comment, Map<String, Object> parameters);

    Boolean checkDataSourceConnectivity(Map<String, Object> dataSourceParams);
}
