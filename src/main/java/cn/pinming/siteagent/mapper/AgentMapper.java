package cn.pinming.siteagent.mapper;

import cn.pinming.siteagent.model.Agent;
import cn.pinming.siteagent.model.AgentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentMapper {
    int countByExample(AgentExample example);

    int deleteByExample(AgentExample example);

    int insert(Agent record);

    int insertSelective(Agent record);

    List<Agent> selectByExample(AgentExample example);

    int updateByExampleSelective(@Param("record") Agent record, @Param("example") AgentExample example);

    int updateByExample(@Param("record") Agent record, @Param("example") AgentExample example);
}