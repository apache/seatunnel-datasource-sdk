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

    /**
     * get all data source plugins
     *
     * @return data source plugins info
     */
    List<DataSourcePluginInfo> listAllDataSources();

    /**
     * get data source plugin fields
     *
     * @param pluginName data source name
     * @return data source plugin fields
     */
    OptionRule queryDataSourceFieldByName(String pluginName);

    /**
     * check data source params is valid and connectable
     *
     * @param parameters data source params
     *                   eg mysql plugin
     *                   key: url // jdbc url
     *                   key: username
     *                   key: password
     *                   other key...
     * @return true if valid, false if invalid
     */
    Boolean checkDataSourceFields(String pluginName, Map<String, Object> parameters);

    DataSource queryDataSourceById(Long dataSourceId);

    /**
     * save data source
     *
     * @param dataSourceName data source name
     * @param comment        data source comment
     * @param pluginName     data source plugin name
     * @param parameters     data source params
     *                       eg mysql plugin
     *                       key: url // jdbc url
     *                       key: username
     *                       key: password
     *                       other key...
     * @return save result
     */
    Boolean saveDataSource(String dataSourceName, String comment, String pluginName, Map<String, Object> parameters);

    /**
     * delete data source, only set delete flag, we don't really delete data.
     *
     * @param id data source id
     * @return delete result
     */
    Boolean deleteDataSource(Long id);

    /**
     * update data source
     *
     * @param dataSourceId   data source id
     * @param dataSourceName data source name
     * @param comment        data source comment
     * @param parameters     data source params
     * @return update result
     */
    Boolean updateDataSource(Long dataSourceId, String dataSourceName, String comment, Map<String, Object> parameters);

    /**
     * we can use this method to check data source connectivity
     *
     * @param dataSourceParams data source params
     * @return check result
     */
    Boolean checkDataSourceConnectivity(String pluginName, Map<String, Object> dataSourceParams);
}
