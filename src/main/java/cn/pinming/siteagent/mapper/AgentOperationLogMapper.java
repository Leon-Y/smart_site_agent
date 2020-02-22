package cn.pinming.siteagent.mapper;

import cn.pinming.siteagent.model.AgentOperationLog;
import cn.pinming.siteagent.model.AgentOperationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentOperationLogMapper {
    int countByExample(AgentOperationLogExample example);

    int deleteByExample(AgentOperationLogExample example);

    int insert(AgentOperationLog record);

    int insertSelective(AgentOperationLog record);

    List<AgentOperationLog> selectByExample(AgentOperationLogExample example);

    int updateByExampleSelective(@Param("record") AgentOperationLog record, @Param("example") AgentOperationLogExample example);

    int updateByExample(@Param("record") AgentOperationLog record, @Param("example") AgentOperationLogExample example);
}