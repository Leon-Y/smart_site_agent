package cn.pinming.siteagent.mapper;

import cn.pinming.siteagent.model.AgentCompanyProject;
import cn.pinming.siteagent.model.AgentCompanyProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentCompanyProjectMapper {
    int countByExample(AgentCompanyProjectExample example);

    int deleteByExample(AgentCompanyProjectExample example);

    int insert(AgentCompanyProject record);

    int insertSelective(AgentCompanyProject record);

    List<AgentCompanyProject> selectByExample(AgentCompanyProjectExample example);

    int updateByExampleSelective(@Param("record") AgentCompanyProject record, @Param("example") AgentCompanyProjectExample example);

    int updateByExample(@Param("record") AgentCompanyProject record, @Param("example") AgentCompanyProjectExample example);
}