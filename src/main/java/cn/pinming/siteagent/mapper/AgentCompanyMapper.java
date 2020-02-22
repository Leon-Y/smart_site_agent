package cn.pinming.siteagent.mapper;

import cn.pinming.siteagent.model.AgentCompany;
import cn.pinming.siteagent.model.AgentCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentCompanyMapper {
    int countByExample(AgentCompanyExample example);

    int deleteByExample(AgentCompanyExample example);

    int insert(AgentCompany record);

    int insertSelective(AgentCompany record);

    List<AgentCompany> selectByExample(AgentCompanyExample example);

    int updateByExampleSelective(@Param("record") AgentCompany record, @Param("example") AgentCompanyExample example);

    int updateByExample(@Param("record") AgentCompany record, @Param("example") AgentCompanyExample example);
}