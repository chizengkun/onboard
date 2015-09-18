/*******************************************************************************
 * Copyright [2015] [Onboard team of SERC, Peking University]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.onboard.domain.mapper.model;

import com.onboard.domain.mapper.model.common.BaseItem;

public class TagObject implements BaseItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.tagname
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String tagname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.projectId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer projectId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.id
     *
     * @return the value of tag.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.id
     *
     * @param id the value for tag.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.tagname
     *
     * @return the value of tag.tagname
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getTagname() {
        return tagname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.tagname
     *
     * @param tagname the value for tag.tagname
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.projectId
     *
     * @return the value of tag.projectId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.projectId
     *
     * @param projectId the value for tag.projectId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public TagObject(TagObject parent) {
        this.id = parent.getId();
        this.tagname = parent.getTagname();
        this.projectId = parent.getProjectId();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public TagObject() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public TagObject(int id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    @Override
    public TagObject copy() {
        return new TagObject(this);
    }
}