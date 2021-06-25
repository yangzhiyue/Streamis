package com.webank.wedatasphere.streamis.jobmanager.manager.dao;

import com.webank.wedatasphere.streamis.jobmanager.manager.entity.StreamJob;
import com.webank.wedatasphere.streamis.jobmanager.manager.entity.StreamJobRunRelation;
import com.webank.wedatasphere.streamis.jobmanager.manager.entity.StreamJobSqlResource;
import com.webank.wedatasphere.streamis.jobmanager.manager.entity.StreamJobVersion;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author limeng
 */
public interface StreamJobMapper {

    List<StreamJob> getJobLists(@Param("projectId") Long projectId,@Param("name") String name,@Param("status") Integer status,@Param("createBy") String createBy);

    //List<StreamJob> getJobByName(@Param("name") String name);

    StreamJob getJobById(@Param("jobId") Long jobId);

    List<StreamJob> getByJobCount(@Param("projectId") Long projectId);

    List<StreamJobSqlResource> getJobSQLResourcesByJobId(@Param("jobVersionId") Long jobVersionId);

    List<StreamJobVersion> getJobVersionsById(@Param("jobId") Long jobId,@Param("version") String version);

    List<StreamJobRunRelation> getJobRunRelationList(@Param("jobId") Long jobId);

    void insertJob(StreamJob streamJob);

    void insertJobVersion(StreamJobVersion streamJobVersion);

    void insertJobSqlResource(StreamJobSqlResource streamJobSqlResource);

    void insertJobRunRelation(StreamJobRunRelation streamJobRunRelation);

    void updateJob(StreamJob streamJob);

    void updateJobVersion(StreamJobVersion streamJobVersion);

    void updateJobSqlResource(StreamJobSqlResource streamJobSqlResource);

    void updateJobRunRelation(StreamJobRunRelation streamJobRunRelation);

    void deleteJobRunRelation(@Param("id") Long id);
}